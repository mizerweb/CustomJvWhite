package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import defpackage.dx4;
import defpackage.f92;
import defpackage.ifh;
import defpackage.iu6;
import defpackage.j95;
import defpackage.no;
import defpackage.ny8;
import defpackage.pe3;
import defpackage.qv1;
import defpackage.sbi;
import defpackage.w14;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.internal.api.IterableItemsApiValue;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 92\u00020\u0001:\u00019BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/DbUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "looperProvider", "Ljava/io/File;", "legacyStorage", "Ljava/util/concurrent/locks/Lock;", "lock", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "Lru/ok/android/externcalls/analytics/internal/storage/DatabaseHelper;", "dbHelper", "", "recordToUploadCount", "", "timeBeforeNextUploadMs", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;Lru/ok/android/externcalls/analytics/internal/storage/DatabaseHelper;ILjava/lang/Long;)V", "Lno;", "client", "", "", "iterator", "Lsbi;", "uploadImpl", "(Lno;Ljava/util/Iterator;)V", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "upload", "()V", "drop", "getSink", "()Ljava/io/File;", "Ljava/util/concurrent/locks/Lock;", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "Lru/ok/android/externcalls/analytics/internal/storage/DatabaseHelper;", "I", "Ljava/lang/Long;", "lastUploadTime", "J", "Lru/ok/android/externcalls/analytics/internal/upload/UploadHelper;", "uploadHelper", "Lru/ok/android/externcalls/analytics/internal/upload/UploadHelper;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Lru/ok/android/externcalls/analytics/internal/upload/MultiUploadHelper;", "multiUploadHelper$delegate", "Lny8;", "getMultiUploadHelper", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiUploadHelper;", "multiUploadHelper", "idleState", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "Companion", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DbUploader implements Uploader {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsDbUploader";
    private final EventChannel channel;
    private final DatabaseHelper dbHelper;
    private volatile Uploader.IdleStateProvider idleState;
    private volatile long lastUploadTime;
    private final Lock lock;

    /* JADX INFO: renamed from: multiUploadHelper$delegate, reason: from kotlin metadata */
    private final ny8 multiUploadHelper;
    private final int recordToUploadCount;
    private final Long timeBeforeNextUploadMs;
    private final UploadHelper uploadHelper = new UploadHelper(LOG_TAG);
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();

    public DbUploader(Provider<Looper> provider, Provider<File> provider2, Lock lock, EventChannel eventChannel, DatabaseHelper databaseHelper, int i, Long l) {
        this.lock = lock;
        this.channel = eventChannel;
        this.dbHelper = databaseHelper;
        this.recordToUploadCount = i;
        this.timeBeforeNextUploadMs = l;
        this.multiUploadHelper = new ifh(new dx4(provider, 1, this));
        try {
            new Handler(provider.get()).post(new f92(provider2, 23, this));
        } catch (Throwable th) {
            this.logger.report(LOG_TAG, "Error schedule legacy storage remove", new StatDeliveryException("Error schedule legacy storage remove", th));
        }
    }

    public static final void _init_$lambda$0(Provider provider, DbUploader dbUploader) {
        try {
            File file = (File) provider.get();
            if (file.exists()) {
                iu6.b(file);
            }
        } catch (Throwable th) {
            dbUploader.logger.report(LOG_TAG, "Error remove legacy storage", new StatDeliveryException("Error remove legacy storage", th));
        }
    }

    private final MultiUploadHelper getMultiUploadHelper() {
        return (MultiUploadHelper) this.multiUploadHelper.getValue();
    }

    public static final MultiUploadHelper multiUploadHelper_delegate$lambda$0(Provider provider, DbUploader dbUploader) {
        return new MultiUploadHelper(provider, dbUploader.channel, dbUploader.timeBeforeNextUploadMs, LOG_TAG, new pe3(25, dbUploader));
    }

    public static final boolean multiUploadHelper_delegate$lambda$0$0(DbUploader dbUploader) {
        Uploader.IdleStateProvider idleStateProvider = dbUploader.idleState;
        boolean zIsCallActive = idleStateProvider != null ? idleStateProvider.isCallActive() : false;
        int i = zIsCallActive ? dbUploader.recordToUploadCount : 1;
        Lock lock = dbUploader.lock;
        lock.lock();
        try {
            int iCount = dbUploader.dbHelper.count();
            lock.unlock();
            CallAnalyticsLogger callAnalyticsLogger = dbUploader.logger;
            StringBuilder sbP = qv1.p("hasMoreElements(total=", iCount, ",limit=", dbUploader.recordToUploadCount, ",isCallActive=");
            sbP.append(zIsCallActive);
            sbP.append(")->");
            sbP.append(i);
            callAnalyticsLogger.d(LOG_TAG, sbP.toString());
            return iCount > i;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static final sbi upload$lambda$0$0(DbUploader dbUploader, CallAnalyticsConfig callAnalyticsConfig, Iterator it) throws IOException, ApiException {
        dbUploader.uploadImpl(callAnalyticsConfig.getOkApi().b(), it);
        return sbi.a;
    }

    private final void uploadImpl(no client, Iterator<String> iterator) throws IOException, ApiException {
        try {
            if (!iterator.hasNext()) {
                this.logger.d(LOG_TAG, "Nothing to upload with empty query");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.uploadHelper.executeApiMethod$calls_sdk_analytics(client, this.channel, new IterableItemsApiValue(iterator));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            CallAnalyticsLogger callAnalyticsLogger = this.logger;
            String apiMethod = this.channel.getApiMethod();
            String collector = this.channel.getCollector();
            if (collector == null) {
                collector = "-";
            }
            callAnalyticsLogger.d(LOG_TAG, "upload completed, took " + jCurrentTimeMillis2 + "ms. channel=" + apiMethod + ", collector=" + collector);
            this.lastUploadTime = getMultiUploadHelper().currentTime();
        } catch (ApiInvocationException e) {
            int errorCode = e.getErrorCode();
            if (errorCode == 2 || errorCode == 453 || errorCode == 102 || errorCode == 103) {
                this.logger.w(LOG_TAG, "recoverable invocation error occurred, will retry");
                throw e;
            }
            this.logger.e(LOG_TAG, "upload failed: " + e.getErrorMessage() + ", removing possibly broken logs");
        } catch (ApiRequestException e2) {
            this.logger.e(LOG_TAG, "upload failed: " + e2.getMessage() + ", removing likely broken logs");
        } catch (JsonSerializeException e3) {
            this.logger.e(LOG_TAG, "upload failed: " + e3.getMessage() + ", removing likely broken logs");
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void drop() {
        Lock lock = this.lock;
        lock.lock();
        try {
            this.dbHelper.drop();
        } finally {
            lock.unlock();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        return new File("db-uploader-stub");
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        Uploader.IdleStateProvider idleStateProvider2 = this.idleState;
        Boolean boolValueOf = idleStateProvider2 != null ? Boolean.valueOf(idleStateProvider2.isIdle()) : null;
        this.idleState = idleStateProvider;
        getMultiUploadHelper().setIdleStateProvider(boolValueOf, idleStateProvider);
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void upload() {
        Uploader.IdleStateProvider idleStateProvider = this.idleState;
        if (idleStateProvider != null && !idleStateProvider.isIdle()) {
            this.logger.d(LOG_TAG, "call is not idle, postpone upload");
            return;
        }
        CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
        if (config == null) {
            this.logger.d(LOG_TAG, "api not initialized, will retry");
            return;
        }
        if (!getMultiUploadHelper().isNowGoodTimeToUploadNext(this.lastUploadTime)) {
            this.logger.d(LOG_TAG, "it's not a time to upload next. do it a bit later");
            getMultiUploadHelper().scheduleNextUpload(false, 1);
            return;
        }
        Lock lock = this.lock;
        lock.lock();
        try {
            int iCount = this.dbHelper.count();
            if (iCount > 0) {
                this.dbHelper.grab(this.recordToUploadCount, new w14(this, 11, config));
            } else {
                this.logger.d(LOG_TAG, "not enough items to start upload: " + iCount + ". At least one required");
            }
            getMultiUploadHelper().scheduleNextUpload(false, 1);
        } finally {
            lock.unlock();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/DbUploader$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
