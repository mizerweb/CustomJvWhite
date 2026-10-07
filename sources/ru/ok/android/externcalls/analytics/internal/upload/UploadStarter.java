package ru.ok.android.externcalls.analytics.internal.upload;

import defpackage.cji;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/UploadStarter;", "", "<init>", "()V", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "Lsbi;", "startUpload", "(Lru/ok/android/externcalls/analytics/internal/event/EventChannel;)V", "resumeUpload", "uploadNew", "uploadContinue", "", "LOG_TAG", "Ljava/lang/String;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UploadStarter {
    public static final UploadStarter INSTANCE = new UploadStarter();
    private static final String LOG_TAG = "UploadStarter";

    private UploadStarter() {
    }

    public static final void resumeUpload$lambda$0(EventChannel eventChannel) {
        try {
            INSTANCE.uploadContinue(eventChannel);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload", e);
        }
    }

    public static final void startUpload$lambda$0(EventChannel eventChannel) {
        try {
            INSTANCE.uploadNew(eventChannel);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload", e);
        }
    }

    public final void resumeUpload(EventChannel channel) {
        Executor uploadExecutor = CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadExecutor();
        if (uploadExecutor == null) {
            UploadService.resumeUpload(channel);
        } else {
            uploadExecutor.execute(new cji(channel, 1));
        }
    }

    public final void startUpload(EventChannel channel) {
        Executor uploadExecutor = CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadExecutor();
        if (uploadExecutor == null) {
            UploadService.startUpload(channel);
        } else {
            uploadExecutor.execute(new cji(channel, 0));
        }
    }

    public final void uploadContinue(EventChannel channel) throws IOException {
        EventQueueCollector.getInstance(channel).uploadGrabbed();
    }

    public final void uploadNew(EventChannel channel) throws IOException {
        EventQueueCollector.getInstance(channel).grabAndUpload();
    }
}
