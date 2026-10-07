package ru.ok.android.onelog;

import android.app.Application;
import android.content.Context;
import defpackage.i7b;
import defpackage.no;
import defpackage.ore;
import defpackage.r5a;
import defpackage.yab;
import defpackage.zo5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.inject.Provider;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class OneLogImpl implements OneLogAppender {
    private static final long DEFAULT_MAX_UPLOAD_FILE_SIZE = 1048576;
    private static final OneLogImpl INSTANCE = new OneLogImpl();
    private volatile Provider<no> apiClient;
    private volatile OneLogExternalUploader oneLogExternalUploader;
    private volatile Executor uploadExecutor;
    private final ConcurrentHashMap<String, Provider<no>> collectorApiClients = new ConcurrentHashMap<>();
    private volatile int uploadJobId = 15261;
    private volatile boolean batchCollectorsEnabled = false;
    private volatile long defSilenceMillisToUpload = BuildConfig.SILENCE_TIME_TO_UPLOAD;
    private volatile int defFileLengthToUpload = BuildConfig.FILE_LENGTH_TO_UPLOAD;
    private volatile int defCountToUpload = 500;
    private final AtomicReference<MaxTimeToUploadRecord> maxTimeToUploadRef = new AtomicReference<>();
    private volatile boolean sendUploadTriggerEnabled = false;
    private volatile Supplier<Boolean> forceFallbackLogs = null;
    private volatile Supplier<Boolean> shouldNeverJson = null;
    private volatile OneLogErrorHandler errorHandler = new OneLogErrorHandler.Default();
    private volatile long maxUploadFileSize = 1048576;

    /* JADX INFO: loaded from: classes3.dex */
    public static class MaxTimeToUploadRecord {
        private final String collector;
        private final long maxMillisToUpload;
        private final MaxTimeToUploadRecord next;
        private final String operation;

        public MaxTimeToUploadRecord(String str, String str2, long j, MaxTimeToUploadRecord maxTimeToUploadRecord) {
            this.collector = str;
            this.operation = str2;
            this.maxMillisToUpload = j;
            this.next = maxTimeToUploadRecord;
        }

        public static long findMaxMillisToUpload(MaxTimeToUploadRecord maxTimeToUploadRecord, String str, String str2) {
            String str3;
            long jMin = BuildConfig.MAX_TIME_TO_UPLOAD;
            while (maxTimeToUploadRecord != null) {
                String str4 = maxTimeToUploadRecord.collector;
                if ((str4 == null || str4.equals(str)) && ((str3 = maxTimeToUploadRecord.operation) == null || str3.equals(str2))) {
                    jMin = Math.min(jMin, maxTimeToUploadRecord.maxMillisToUpload);
                }
                maxTimeToUploadRecord = maxTimeToUploadRecord.next;
            }
            return jMin;
        }
    }

    public static OneLogImpl getInstance() {
        return INSTANCE;
    }

    public static /* synthetic */ void lambda$startUpload$1(String str, OneLogTrigger oneLogTrigger) {
        try {
            upload(str, oneLogTrigger);
        } catch (IOException unused) {
        }
    }

    public static /* synthetic */ ArrayList lambda$upload$0(String str) {
        return new ArrayList();
    }

    private static long toMillis(long j, TimeUnit timeUnit) {
        return j == BuildConfig.MAX_TIME_TO_UPLOAD ? BuildConfig.MAX_TIME_TO_UPLOAD : timeUnit.toMillis(j);
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(OneLogItem oneLogItem) {
    }

    public void attachApiClient(String str, Provider<no> provider) {
        this.collectorApiClients.put(str, provider);
    }

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public void attachFallbackApiClient(Provider<no> provider) {
        this.apiClient = provider;
    }

    public void clearAllMaxTimeToUpload() {
        this.maxTimeToUploadRef.set(null);
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
    }

    public no getApiClient(String str) {
        Provider<no> provider;
        no noVar;
        if (str != null && (provider = this.collectorApiClients.get(str)) != null && (noVar = provider.get()) != null) {
            return noVar;
        }
        if (this.apiClient == null) {
            ore.k("ApiClient not attached to Collector");
            return null;
        }
        no noVar2 = this.apiClient.get();
        if (noVar2 != null) {
            return noVar2;
        }
        ore.k("ApiClient not attached to Collector");
        return null;
    }

    @Deprecated
    public String getApplicationParam() {
        return Uploader.getApplicationParam();
    }

    @Deprecated
    public Context getContext() {
        Application application = ApplicationProvider.a;
        return yab.F();
    }

    public int getDefCountToUpload() {
        return this.defCountToUpload;
    }

    public int getDefFileLengthToUpload() {
        return this.defFileLengthToUpload;
    }

    public long getDefSilenceMillisToUpload() {
        return this.defSilenceMillisToUpload;
    }

    public OneLogErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public boolean getForceFallbackLogs() {
        return this.forceFallbackLogs != null && this.forceFallbackLogs.get().booleanValue();
    }

    public long getMaxMillisToUpload(String str, String str2) {
        return MaxTimeToUploadRecord.findMaxMillisToUpload(this.maxTimeToUploadRef.get(), str, str2);
    }

    public long getMaxUploadFileSize() {
        return this.maxUploadFileSize;
    }

    @Deprecated
    public String getPlatformParam() {
        return Uploader.getPlatformParam();
    }

    public boolean getShouldNeverJson() {
        return this.shouldNeverJson != null && this.shouldNeverJson.get().booleanValue();
    }

    public int getUploadJobId() {
        return this.uploadJobId;
    }

    public boolean isBatchCollectorsEnabled() {
        return this.batchCollectorsEnabled;
    }

    public boolean isSendUploadTriggerEnabled() {
        return this.sendUploadTriggerEnabled;
    }

    @Deprecated
    public void setApplicationInfo(String str, String str2, int i) {
    }

    public void setBatchCollectorsEnabled(boolean z) {
        this.batchCollectorsEnabled = z;
    }

    public void setDefCountToUpload(int i) {
        this.defCountToUpload = i;
    }

    public void setDefFileLengthToUpload(int i) {
        this.defFileLengthToUpload = i;
    }

    public void setDefMaxTimeToUpload(long j, TimeUnit timeUnit) {
        setMaxMillisToUpload(null, null, toMillis(j, timeUnit));
    }

    public void setDefSilenceTimeToUpload(long j, TimeUnit timeUnit) {
        this.defSilenceMillisToUpload = toMillis(j, timeUnit);
    }

    public void setErrorHandler(OneLogErrorHandler oneLogErrorHandler) {
        this.errorHandler = oneLogErrorHandler;
    }

    public void setForceFallbackLogs(Supplier<Boolean> supplier) {
        this.forceFallbackLogs = supplier;
    }

    public void setMaxMillisToUpload(String str, String str2, long j) {
        while (true) {
            MaxTimeToUploadRecord maxTimeToUploadRecord = this.maxTimeToUploadRef.get();
            String str3 = str;
            String str4 = str2;
            long j2 = j;
            if (r5a.i(this.maxTimeToUploadRef, maxTimeToUploadRecord, new MaxTimeToUploadRecord(str3, str4, j2, maxTimeToUploadRecord))) {
                return;
            }
            str = str3;
            str2 = str4;
            j = j2;
        }
    }

    public void setMaxTimeToUpload(String str, String str2, long j, TimeUnit timeUnit) {
        setMaxMillisToUpload(str, str2, toMillis(j, timeUnit));
    }

    public void setMaxTimeToUploadAny(String str, long j, TimeUnit timeUnit) {
        setMaxMillisToUpload(str, null, toMillis(j, timeUnit));
    }

    public void setMaxUploadFileSize(long j) {
        if (j > 0) {
            this.maxUploadFileSize = j;
        } else {
            ore.p(zo5.j(j, "maxUploadFileSize must be positive: "));
        }
    }

    public void setSendUploadTriggerEnabled(boolean z) {
        this.sendUploadTriggerEnabled = z;
    }

    public void setShouldNeverJson(Supplier<Boolean> supplier) {
        this.shouldNeverJson = supplier;
    }

    public void setUploadExecutor(Executor executor) {
        this.uploadExecutor = executor;
    }

    public void setUploadHandler(OneLogExternalUploader oneLogExternalUploader) {
        this.oneLogExternalUploader = oneLogExternalUploader;
    }

    public void setUploadJobId(int i) {
        this.uploadJobId = i;
    }

    public void startUpload(String str, OneLogTrigger oneLogTrigger) {
        OneLogExternalUploader oneLogExternalUploader = this.oneLogExternalUploader;
        if (oneLogExternalUploader != null) {
            oneLogExternalUploader.upload(str, oneLogTrigger);
            return;
        }
        Executor executor = this.uploadExecutor;
        if (executor == null) {
            UploadService.startUpload(str, oneLogTrigger);
        } else {
            executor.execute(new i7b(str, 2, oneLogTrigger));
        }
    }

    public void upload(Collection collection) {
    }

    public void upload(OneLogItem oneLogItem) {
    }

    @Deprecated
    public void attachApiClient(Provider<no> provider) {
        attachFallbackApiClient(provider);
    }

    @Deprecated
    public no getApiClient() {
        return getApiClient(null);
    }

    public static void upload(String str, OneLogTrigger oneLogTrigger) throws IOException {
        Collector.getInstance(str).upload(oneLogTrigger);
    }
}
