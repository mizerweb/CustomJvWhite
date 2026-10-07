package ru.ok.android.externcalls.analytics.internal.upload;

import defpackage.iu6;
import defpackage.la6;
import defpackage.ma6;
import defpackage.no;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.internal.api.StreamingItemsApiValue;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001:\u0001:B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\tH\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0004¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u001a\u0010.\u001a\u00020-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u001cR\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "Ljavax/inject/Provider;", "Ljava/io/File;", "storage", "Ljava/util/concurrent/locks/Lock;", "lock", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "", "isContentCompressed", "autoDetectContentCompression", "", "logTag", "<init>", "(Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;ZZLjava/lang/String;)V", "Lno;", "client", "file", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "uploadFileWithContent", "(Lno;Ljava/io/File;)Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "Lsbi;", "drop", "()V", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "isDirectory", "ensureStorageIsOfCorrectType", "(Z)Ljava/io/File;", "uploadFile", "(Ljava/io/File;)Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "Ljavax/inject/Provider;", "getStorage", "()Ljavax/inject/Provider;", "Ljava/util/concurrent/locks/Lock;", "getLock", "()Ljava/util/concurrent/locks/Lock;", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "getChannel", "()Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "Z", "Ljava/lang/String;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "idleState", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "getIdleState", "()Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "setIdleState", "Lru/ok/android/externcalls/analytics/internal/upload/UploadHelper;", "uploadHelper", "Lru/ok/android/externcalls/analytics/internal/upload/UploadHelper;", "UploadResult", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AbstractUploader implements Uploader {
    private final boolean autoDetectContentCompression;
    private final EventChannel channel;
    private volatile Uploader.IdleStateProvider idleState;
    private final boolean isContentCompressed;
    private final Lock lock;
    private final String logTag;
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    private final Provider<File> storage;
    private final UploadHelper uploadHelper;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "SKIP", "ERROR", "BAD_CONTENT", "RECOVERABLE_ERROR", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum UploadResult {
        SUCCESS,
        SKIP,
        ERROR,
        BAD_CONTENT,
        RECOVERABLE_ERROR;

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

        public static la6 getEntries() {
            return $ENTRIES;
        }
    }

    public AbstractUploader(Provider<File> provider, Lock lock, EventChannel eventChannel, boolean z, boolean z2, String str) {
        this.storage = provider;
        this.lock = lock;
        this.channel = eventChannel;
        this.isContentCompressed = z;
        this.autoDetectContentCompression = z2;
        this.logTag = str;
        this.uploadHelper = new UploadHelper(str);
    }

    private final UploadResult uploadFileWithContent(no client, File file) throws IOException, ApiException {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.uploadHelper.executeApiMethod$calls_sdk_analytics(client, this.channel, new StreamingItemsApiValue(file, this.autoDetectContentCompression ? iu6.d(file) : this.isContentCompressed));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            CallAnalyticsLogger callAnalyticsLogger = this.logger;
            String str = this.logTag;
            String apiMethod = this.channel.getApiMethod();
            String collector = this.channel.getCollector();
            if (collector == null) {
                collector = "-";
            }
            callAnalyticsLogger.d(str, "upload completed, took " + jCurrentTimeMillis2 + "ms. channel=" + apiMethod + ", collector=" + collector);
            return UploadResult.SUCCESS;
        } catch (ApiInvocationException e) {
            int errorCode = e.getErrorCode();
            if (errorCode == 2 || errorCode == 453 || errorCode == 102 || errorCode == 103) {
                this.logger.w(this.logTag, "recoverable invocation error occurred, will retry");
                throw e;
            }
            this.logger.e(this.logTag, "upload failed: " + e.getErrorMessage() + ", removing possibly broken logs");
            return UploadResult.BAD_CONTENT;
        } catch (ApiRequestException e2) {
            this.logger.e(this.logTag, "upload failed: " + e2.getMessage() + ", removing likely broken logs");
            return UploadResult.BAD_CONTENT;
        } catch (JsonSerializeException e3) {
            this.logger.e(this.logTag, "upload failed: " + e3.getMessage() + ", removing likely broken logs");
            return UploadResult.BAD_CONTENT;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void drop() {
        Lock lock = this.lock;
        lock.lock();
        try {
            File file = this.storage.get();
            try {
                if (file.exists()) {
                    iu6.b(file);
                    this.logger.d(this.logTag, "storage dropped:  " + file);
                } else {
                    this.logger.d(this.logTag, "don't drop storage " + file + ", file doesn't exist");
                }
            } catch (IOException e) {
                this.logger.e(this.logTag, "storage drop failed " + file, e);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final File ensureStorageIsOfCorrectType(boolean isDirectory) {
        File file = this.storage.get();
        if (file.exists() && file.isDirectory() != isDirectory) {
            try {
                iu6.b(file);
                return file;
            } catch (IOException unused) {
                this.logger.d(this.logTag, "File " + file.getName() + " isDirectory != " + isDirectory + " but can not be deleted");
            }
        }
        return file;
    }

    public final EventChannel getChannel() {
        return this.channel;
    }

    public final Uploader.IdleStateProvider getIdleState() {
        return this.idleState;
    }

    public final Lock getLock() {
        return this.lock;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    public final Provider<File> getStorage() {
        return this.storage;
    }

    public final void setIdleState(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    public final UploadResult uploadFile(File file) {
        UploadResult uploadResult;
        Lock lock = this.lock;
        lock.lock();
        try {
            CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
            if (config == null) {
                this.logger.d(this.logTag, "api not initialized, will retry");
                uploadResult = UploadResult.SKIP;
            } else {
                try {
                    if (!file.isFile() || iu6.e(file) == 0) {
                        this.logger.d(this.logTag, "nothing to upload");
                        try {
                            iu6.b(file);
                        } catch (Throwable th) {
                            this.logger.e(this.logTag, "can't delete empty file " + file.getPath(), th);
                        }
                        uploadResult = UploadResult.SKIP;
                    } else {
                        UploadResult uploadResultUploadFileWithContent = uploadFileWithContent(config.getOkApi().b(), file);
                        iu6.b(file);
                        uploadResult = uploadResultUploadFileWithContent;
                    }
                } catch (IOException e) {
                    this.logger.e(this.logTag, "upload failed due to io error", e);
                    uploadResult = UploadResult.ERROR;
                } catch (ApiException e2) {
                    this.logger.e(this.logTag, "upload failed due to api error", e2);
                    uploadResult = UploadResult.RECOVERABLE_ERROR;
                }
            }
            lock.unlock();
            return uploadResult;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
