package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import defpackage.af7;
import defpackage.cqk;
import defpackage.ifh;
import defpackage.iua;
import defpackage.j95;
import defpackage.k36;
import defpackage.nbh;
import defpackage.ny8;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 22\u00020\u0001:\u000232B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0015J\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiUploadHelper;", "", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "looperProvider", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "", "providedTimeBeforeNextUploadMs", "", "logTag", "Lkotlin/Function0;", "", "hasMoreItems", "<init>", "(Ljavax/inject/Provider;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;Ljava/lang/Long;Ljava/lang/String;Laf7;)V", "now", "", "scaleUpNextUploadTimeout", "Lsbi;", "scheduleNextUploadUnsafe", "(ZI)V", "requestContinueUpload", "()V", "isIdle", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Ljava/lang/Boolean;Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "scheduleNextUpload", "currentTime", "()J", "prevUploadTime", "isNowGoodTimeToUploadNext", "(J)Z", "Ljavax/inject/Provider;", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "Ljava/lang/String;", "Laf7;", "timeBeforeNextUploadMs", "J", "Landroid/os/Handler;", "handler$delegate", "Lny8;", "getHandler", "()Landroid/os/Handler;", "handler", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Companion", "LooperCallback", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiUploadHelper {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MSG_TRY_UPLOAD_NEXT = 1001;

    @Deprecated
    public static final long UPLOAD_NEXT_INTERVAL = 5000;
    private final EventChannel channel;

    /* JADX INFO: renamed from: handler$delegate, reason: from kotlin metadata */
    private final ny8 handler;
    private final af7 hasMoreItems;
    private final String logTag;
    private final CallAnalyticsLogger logger;
    private final Provider<Looper> looperProvider;
    private final long timeBeforeNextUploadMs;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiUploadHelper$LooperCallback;", "Landroid/os/Handler$Callback;", "<init>", "(Lru/ok/android/externcalls/analytics/internal/upload/MultiUploadHelper;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class LooperCallback implements Handler.Callback {
        public LooperCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            if (msg.what != 1001) {
                return false;
            }
            MultiUploadHelper.this.requestContinueUpload();
            return true;
        }
    }

    public MultiUploadHelper(Provider<Looper> provider, EventChannel eventChannel, Long l, String str, af7 af7Var) {
        this.looperProvider = provider;
        this.channel = eventChannel;
        this.logTag = str;
        this.hasMoreItems = af7Var;
        this.timeBeforeNextUploadMs = l != null ? l.longValue() : 5000L;
        this.handler = new ifh(new iua(5, this));
        this.logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    public static final Handler handler_delegate$lambda$0(MultiUploadHelper multiUploadHelper) {
        return new Handler(multiUploadHelper.looperProvider.get(), multiUploadHelper.new LooperCallback());
    }

    public final void requestContinueUpload() {
        try {
            UploadStarter.INSTANCE.resumeUpload(this.channel);
        } catch (Throwable th) {
            this.logger.e(this.logTag, "Resume upload failed", th);
        }
    }

    public static /* synthetic */ void scheduleNextUpload$default(MultiUploadHelper multiUploadHelper, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        multiUploadHelper.scheduleNextUpload(z, i);
    }

    private final void scheduleNextUploadUnsafe(boolean now, int scaleUpNextUploadTimeout) {
        if (!((Boolean) this.hasMoreItems.invoke()).booleanValue()) {
            this.logger.d(this.logTag, "storage size is not enough to schedule new upload");
            return;
        }
        if (getHandler().hasMessages(1001)) {
            return;
        }
        if (now) {
            this.logger.d(this.logTag, "schedule next upload pass now");
            getHandler().removeMessages(1001);
            getHandler().sendMessage(getHandler().obtainMessage(1001));
        } else {
            long j = this.timeBeforeNextUploadMs * ((long) scaleUpNextUploadTimeout);
            this.logger.d(this.logTag, nbh.s(j, "schedule next upload pass in ", " ms"));
            getHandler().sendMessageDelayed(getHandler().obtainMessage(1001), j);
        }
    }

    public static /* synthetic */ void scheduleNextUploadUnsafe$default(MultiUploadHelper multiUploadHelper, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        multiUploadHelper.scheduleNextUploadUnsafe(z, i);
    }

    public final long currentTime() {
        return SystemClock.elapsedRealtime();
    }

    public final boolean isNowGoodTimeToUploadNext(long prevUploadTime) {
        return currentTime() - prevUploadTime > this.timeBeforeNextUploadMs;
    }

    public final void scheduleNextUpload(boolean now, int scaleUpNextUploadTimeout) {
        try {
            scheduleNextUploadUnsafe(now, scaleUpNextUploadTimeout);
        } catch (Throwable th) {
            this.logger.e(this.logTag, "Error during upload schedule update", th);
        }
    }

    public final void setIdleStateProvider(Boolean isIdle, Uploader.IdleStateProvider idleStateProvider) {
        try {
            if (cqk.d(isIdle, Boolean.TRUE) || idleStateProvider == null || !idleStateProvider.isIdle()) {
                return;
            }
            getHandler().post(new k36(29, this));
        } catch (Throwable th) {
            this.logger.e(this.logTag, "Can't schedule next upload", th);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiUploadHelper$Companion;", "", "<init>", "()V", "MSG_TRY_UPLOAD_NEXT", "", "UPLOAD_NEXT_INTERVAL", "", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
