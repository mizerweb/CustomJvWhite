package one.me.rlottie;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import defpackage.bbb;
import defpackage.cbb;
import defpackage.j95;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rR(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0005\u0010\u000e\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lone/me/rlottie/RLottie;", "", "<init>", "()V", "Lone/me/rlottie/RLottie$Config;", "config", "Lroe;", "Lew5;", "init-IoAF18A", "(Lone/me/rlottie/RLottie$Config;)Ljava/lang/Object;", "init", "Lsbi;", "initConfig", "(Lone/me/rlottie/RLottie$Config;)V", "Lone/me/rlottie/RLottie$Config;", "getConfig", "()Lone/me/rlottie/RLottie$Config;", "setConfig", "getConfig$annotations", "Lcbb;", "getLogger", "()Lcbb;", "getLogger$annotations", "logger", "WorkQueue", "Config", "rlottie"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RLottie {
    public static final RLottie INSTANCE = new RLottie();
    public static Config config;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lone/me/rlottie/RLottie$WorkQueue;", "", "Ljava/lang/Runnable;", "action", "Lsbi;", "post", "(Ljava/lang/Runnable;)V", "", "delay", "(Ljava/lang/Runnable;J)V", "rlottie"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface WorkQueue {
        default void post(Runnable action) {
        }

        default void post(Runnable action, long delay) {
        }
    }

    private RLottie() {
    }

    public static final Config getConfig() {
        Config config2 = config;
        if (config2 != null) {
            return config2;
        }
        return null;
    }

    public static /* synthetic */ void getConfig$annotations() {
    }

    public static final cbb getLogger() {
        return getConfig().getLogger();
    }

    public static /* synthetic */ void getLogger$annotations() {
    }

    /* JADX INFO: renamed from: init-IoAF18A, reason: not valid java name */
    public static final Object m30initIoAF18A(Config config2) {
        setConfig(config2);
        return NativeLibraryLoader.m29initd1pmJ48();
    }

    public static final void initConfig(Config config2) {
        setConfig(config2);
    }

    public static final void setConfig(Config config2) {
        config = config2;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/rlottie/RLottie$Config;", "", "Landroid/content/Context;", "context", "", "isEnabled", "", "screenRefreshRate", "Lcbb;", "logger", "<init>", "(Landroid/content/Context;ZFLcbb;)V", "Z", "F", "Lcbb;", "getLogger", "()Lcbb;", "rlottie"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Config {
        public final boolean isEnabled;
        private final cbb logger;
        public final float screenRefreshRate;

        /* JADX WARN: Illegal instructions before constructor call */
        public Config(Context context, boolean z, float f, cbb cbbVar, int i, j95 j95Var) {
            if ((i & 4) != 0) {
                Object systemService = context.getSystemService("display");
                if (systemService != null) {
                    Display[] displays = ((DisplayManager) systemService).getDisplays();
                    f = displays.length == 0 ? 0.0f : displays[0].getRefreshRate();
                } else {
                    f = 60.0f;
                }
            }
            this(context, z, f, (i & 8) != 0 ? bbb.a : cbbVar);
        }

        public final cbb getLogger() {
            return this.logger;
        }

        public Config(Context context, boolean z, float f) {
            this(context, z, f, null, 8, null);
        }

        public Config(Context context, boolean z, float f, cbb cbbVar) {
            this.isEnabled = z;
            this.screenRefreshRate = f;
            this.logger = cbbVar;
        }

        public Config(Context context, boolean z) {
            this(context, z, 0.0f, null, 12, null);
        }
    }
}
