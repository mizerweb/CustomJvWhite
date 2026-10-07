package defpackage;

import android.os.Build;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ue2 {
    public final boolean a;
    public final ww6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    public ue2(boolean z, ww6 ww6Var, int i, boolean z2, int i2) {
        boolean z3;
        if ((i2 & 2) != 0) {
            z = Build.VERSION.SDK_INT >= 30;
        }
        ww6Var = (i2 & 4) != 0 ? new ww6(0, 1) : ww6Var;
        i = (i2 & 16) != 0 ? 0 : i;
        if ((i2 & 32) != 0) {
            Map map = lc2.c;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 27) {
                z3 = true;
            } else {
                String str = Build.HARDWARE;
                if (!cqk.d(str, "samsungexynos7870") && (!z5h.G0(str, "qcom", true) || i3 > 31)) {
                    Map map2 = lc2.d;
                    String str2 = Build.BRAND;
                    Locale locale = Locale.ROOT;
                    Set set = (Set) map2.get(str2.toLowerCase(locale));
                    if (set == null || !set.contains(Build.MODEL.toLowerCase(locale))) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = true;
                }
            }
        } else {
            z3 = true;
        }
        z2 = (i2 & 64) != 0 ? false : z2;
        boolean z4 = (i2 & np0.m) == 0;
        this.a = z;
        this.b = ww6Var;
        this.c = i;
        this.d = z3;
        this.e = z2;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue2)) {
            return false;
        }
        ue2 ue2Var = (ue2) obj;
        return this.a == ue2Var.a && cqk.d(this.b, ue2Var.b) && this.c == ue2Var.c && this.d == ue2Var.d && this.e == ue2Var.e && this.f == ue2Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + nbh.n(nbh.n(zo5.c(this.c, (this.b.hashCode() + nbh.n(Boolean.hashCode(false) * 31, 31, this.a)) * 961, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
        sb.append(this.a);
        sb.append(", awaitRepeatingRequestBeforeCapture=");
        sb.append(this.b);
        sb.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
        sb.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.c + ')'));
        sb.append(", closeCaptureSessionOnDisconnect=");
        sb.append(this.d);
        sb.append(", closeCameraDeviceOnClose=");
        sb.append(this.e);
        sb.append(", enableRestartDelays=");
        return c0a.p(sb, this.f, ')');
    }
}
