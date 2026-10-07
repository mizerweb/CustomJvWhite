package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class ui2 implements wih {
    public static final bh0 b = new bh0("camerax.core.appConfig.cameraFactoryProvider", qe2.class, null);
    public static final bh0 c = new bh0("camerax.core.appConfig.deviceSurfaceManagerProvider", yb2.class, null);
    public static final bh0 d = new bh0("camerax.core.appConfig.useCaseConfigFactoryProvider", zb2.class, null);
    public static final bh0 e = new bh0("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final bh0 f = new bh0("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final bh0 g = new bh0("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final bh0 h = new bh0("camerax.core.appConfig.availableCamerasLimiter", fh2.class, null);
    public static final bh0 i = new bh0("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final bh0 j = new bh0("camerax.core.appConfig.cameraProviderInitRetryPolicy", gpe.class, null);
    public static final bh0 k = new bh0("camerax.core.appConfig.quirksSettings", p2e.class, null);
    public static final bh0 l = new bh0("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    public final dhc a;

    public ui2(dhc dhcVar) {
        this.a = dhcVar;
    }

    public final fh2 a() {
        return (fh2) this.a.b(h, null);
    }

    public final qe2 e() {
        return (qe2) this.a.b(b, null);
    }

    @Override // defpackage.n8e
    public final t94 getConfig() {
        return this.a;
    }

    public final long h() {
        return ((Long) this.a.b(i, -1L)).longValue();
    }

    public final yb2 l() {
        return (yb2) this.a.b(c, null);
    }

    public final zb2 m() {
        return (zb2) this.a.b(d, null);
    }
}
