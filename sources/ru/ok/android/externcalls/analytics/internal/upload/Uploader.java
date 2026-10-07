package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Looper;
import java.io.File;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "", "Lsbi;", "upload", "()V", "drop", "Ljava/io/File;", "getSink", "()Ljava/io/File;", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "Companion", "IdleStateProvider", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface Uploader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader$Companion;", "", "<init>", "()V", "DEFAULT_EVENT_COUNT_TO_UPLOAD", "", "create", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "looperProvider", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "uploadFile", "Ljava/io/File;", "uploadLock", "Ljava/util/concurrent/locks/Lock;", "channel", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "isContentCompressed", "", "dbHelper", "Lru/ok/android/externcalls/analytics/internal/storage/DatabaseHelper;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DEFAULT_EVENT_COUNT_TO_UPLOAD = 15;

        private Companion() {
        }

        public final Uploader create(Provider<Looper> looperProvider, Provider<File> uploadFile, Lock uploadLock, EventChannel channel, boolean isContentCompressed, DatabaseHelper dbHelper) {
            UploadConfig upload;
            UploadConfig upload2;
            UploadConfig upload3;
            UploadConfig upload4;
            UploadConfig upload5;
            CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
            CallAnalyticsConfig config = callAnalyticsConfigStorage.getConfig();
            int maxLocalCacheFileCount = (config == null || (upload5 = config.getUpload()) == null) ? 1 : upload5.getMaxLocalCacheFileCount();
            CallAnalyticsConfig config2 = callAnalyticsConfigStorage.getConfig();
            Long timeToUploadNextMs = (config2 == null || (upload4 = config2.getUpload()) == null) ? null : upload4.getTimeToUploadNextMs();
            CallAnalyticsConfig config3 = callAnalyticsConfigStorage.getConfig();
            boolean autoDetectFileCompression = false;
            boolean disableUploadWhenCallIsActive = (config3 == null || (upload3 = config3.getUpload()) == null) ? false : upload3.getDisableUploadWhenCallIsActive();
            CallAnalyticsConfig config4 = callAnalyticsConfigStorage.getConfig();
            if (config4 != null && (upload2 = config4.getUpload()) != null) {
                autoDetectFileCompression = upload2.getAutoDetectFileCompression();
            }
            boolean z = autoDetectFileCompression;
            CallAnalyticsConfig config5 = callAnalyticsConfigStorage.getConfig();
            int eventCountToUploadNumber = (config5 == null || (upload = config5.getUpload()) == null) ? 15 : upload.getEventCountToUploadNumber();
            if (dbHelper != null) {
                return new DbUploader(looperProvider, uploadFile, uploadLock, channel, dbHelper, eventCountToUploadNumber, timeToUploadNextMs);
            }
            return maxLocalCacheFileCount > 1 ? new MultiFileUploader(looperProvider, uploadFile, uploadLock, channel, isContentCompressed, z, maxLocalCacheFileCount, timeToUploadNextMs) : new SingleFileUploader(uploadFile, uploadLock, channel, disableUploadWhenCallIsActive, z, isContentCompressed);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void setIdleStateProvider(Uploader uploader, IdleStateProvider idleStateProvider) {
            Uploader.super.setIdleStateProvider(idleStateProvider);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "", "isIdle", "", "isCallActive", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface IdleStateProvider {
        boolean isCallActive();

        boolean isIdle();
    }

    static Uploader create(Provider<Looper> provider, Provider<File> provider2, Lock lock, EventChannel eventChannel, boolean z, DatabaseHelper databaseHelper) {
        return INSTANCE.create(provider, provider2, lock, eventChannel, z, databaseHelper);
    }

    void drop();

    File getSink();

    default void setIdleStateProvider(IdleStateProvider idleStateProvider) {
    }

    void upload();
}
