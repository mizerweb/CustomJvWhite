package defpackage;

import android.net.Uri;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class jcd {
    public final wo6 a;
    public final ifh b = new ifh(new a5d(5));

    public jcd(wo6 wo6Var) {
        this.a = wo6Var;
    }

    public static int b(jcd jcdVar, rt2 rt2Var, int i) {
        if ((i & 1) != 0) {
            rt2Var = null;
        }
        boolean z = (i & 2) == 0;
        jcdVar.getClass();
        if ((rt2Var == null || !rt2Var.h0()) && !z) {
            return (rt2Var == null || !rt2Var.d0()) ? R.string.portal_blocked_chat : R.string.portal_blocked_channel;
        }
        return R.string.portal_blocked_profile;
    }

    public static /* synthetic */ boolean d(jcd jcdVar, vg4 vg4Var, rt2 rt2Var, int i) {
        if ((i & 1) != 0) {
            vg4Var = null;
        }
        if ((i & 2) != 0) {
            rt2Var = null;
        }
        return jcdVar.c(rt2Var, vg4Var);
    }

    public final Uri a() {
        return (Uri) this.b.getValue();
    }

    public final boolean c(rt2 rt2Var, vg4 vg4Var) {
        boolean zEquals;
        if (vg4Var == null) {
            vg4Var = rt2Var != null ? rt2Var.w() : null;
        }
        if (((Boolean) ((f5d) this.a).a.M5.a(e5d.S6[352]).i()).booleanValue()) {
            if (vg4Var != null) {
                int i = vg4Var.a.b.j;
                if (i == 0) {
                    i = 1;
                }
                zEquals = Boolean.valueOf(i == 2).equals(Boolean.TRUE);
            } else {
                zEquals = false;
            }
            if (zEquals) {
                return true;
            }
            return rt2Var != null && rt2Var.b.c == kx2.g;
        }
        return false;
    }
}
