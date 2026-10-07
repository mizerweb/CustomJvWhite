package one.me.rlottie;

import android.os.SystemClock;
import defpackage.ew5;
import defpackage.lw5;
import defpackage.poe;
import defpackage.qe7;
import defpackage.roe;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/rlottie/NativeLibraryLoader;", "", "<init>", "()V", "Lroe;", "Lew5;", "init-d1pmJ48", "()Ljava/lang/Object;", "init", "", "LIB_NAME", "Ljava/lang/String;", "rlottie"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NativeLibraryLoader {
    public static final NativeLibraryLoader INSTANCE = new NativeLibraryLoader();
    private static final String LIB_NAME = "jlottie";

    private NativeLibraryLoader() {
    }

    /* JADX INFO: renamed from: init-d1pmJ48 */
    public static final Object m29initd1pmJ48() {
        Object poeVar;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(LIB_NAME);
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            RLottie.getLogger().l("Native library (jlottie) was successfully loaded in " + jUptimeMillis2 + " ms");
            poeVar = new ew5(qe7.P(jUptimeMillis2, lw5.MILLISECONDS));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            RLottie.getLogger().h(thA);
        }
        return poeVar;
    }
}
