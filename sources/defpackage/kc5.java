package defpackage;

import android.net.Uri;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public class kc5 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public kc5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    public ynh a(vg4 vg4Var) {
        return null;
    }

    public final et3 b() {
        return (et3) this.b.getValue();
    }

    public final jcd c() {
        return (jcd) this.d.getValue();
    }

    public ynh d(vg4 vg4Var) {
        if (jcd.d(c(), vg4Var, null, 2)) {
            return new tnh(jcd.b(c(), null, 1));
        }
        if (vg4Var.v() == ((s7f) b()).t()) {
            return new tnh(R.string.tt_you_in_subtitle);
        }
        if (vg4Var.E() && vg4Var.H()) {
            return new tnh(R.string.service_notifications);
        }
        return vg4Var.E() ? new tnh(R.string.bot) : new xnh(((yfd) this.c.getValue()).y(vg4Var));
    }

    public boolean e(vg4 vg4Var) {
        return true;
    }

    public boolean f(vg4 vg4Var) {
        return true;
    }

    public l8a g(vg4 vg4Var) {
        Uri uriA = null;
        boolean zD = jcd.d(c(), vg4Var, null, 2);
        qfd qfdVarB = ((yfd) this.a.getValue()).B(vg4Var.v());
        String strA = vg4Var.A(((s7f) b()).k());
        boolean z = vg4Var.v() == ((s7f) b()).t();
        long jV = vg4Var.v();
        String strK = vg4Var.k();
        if (strK == null) {
            ore.p("Required value was null.");
            return null;
        }
        String strA2 = xoh.a(vg4Var.o());
        ynh ynhVarD = d(vg4Var);
        if (zD) {
            uriA = c().a();
        } else if (strA != null) {
            uriA = Uri.parse(strA);
        }
        return new l8a(jV, strK, strA2, ynhVarD, uriA, vg4Var.u(), vg4Var.G(), z, false, e(vg4Var), f(vg4Var), zD ? 0 : qfdVarB.a, a(vg4Var));
    }
}
