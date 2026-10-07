package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class ul5 extends evb {
    public final txb h;
    public final ViewGroup i;
    public final yk9 j;
    public final ny8 k;
    public final ynh l;
    public final wub m;

    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    public ul5(txb txbVar, ViewGroup viewGroup, tl5 tl5Var, yk9 yk9Var, ny8 ny8Var, ny8 ny8Var2, v09 v09Var, g19 g19Var) {
        ynh tnhVar;
        super(ny8Var, v09Var, g19Var, tl5Var);
        this.h = txbVar;
        this.i = viewGroup;
        this.j = yk9Var;
        this.k = ny8Var2;
        String str = (String) ((e5d) tl5Var.c.getValue()).H4.a(e5d.S6[295]).i();
        if (str == null) {
            tnhVar = new tnh(R.string.oneme_main_digital_id_onboarding);
        } else {
            str = r5h.X0(str) ? null : str;
            if (str != null) {
                tnhVar = new xnh(z5h.J0(str, "\\n", "\n"));
            } else {
                tnhVar = new tnh(R.string.oneme_main_digital_id_onboarding);
            }
        }
        this.l = tnhVar;
        this.m = new wub(tub.b, sub.a);
    }

    @Override // defpackage.evb
    public final View c() {
        return this.h;
    }

    @Override // defpackage.evb
    public final ViewGroup d() {
        return this.i;
    }

    @Override // defpackage.evb
    public final wub e() {
        return this.m;
    }

    @Override // defpackage.evb
    public final ynh f() {
        return this.l;
    }

    @Override // defpackage.evb
    public final void i() {
        b(true);
        oub oubVar = this.a;
        oubVar.f();
        ae9 ae9Var = (ae9) this.k.getValue();
        ul9 ul9Var = new ul9();
        ((tl5) oubVar).getClass();
        ul9Var.put("tooltip_id", "digital_id_tabbar");
        ae9.k(ae9Var, "TOOLTIP", "tooltip_close", ul9Var.b(), 8);
    }

    @Override // defpackage.evb
    public final void k() {
        this.j.invoke(bdj.ONBOARDING);
        b(true);
        oub oubVar = this.a;
        oubVar.f();
        ae9 ae9Var = (ae9) this.k.getValue();
        ul9 ul9Var = new ul9();
        ((tl5) oubVar).getClass();
        ul9Var.put("tooltip_id", "digital_id_tabbar");
        ae9.k(ae9Var, "TOOLTIP", "tooltip_click", ul9Var.b(), 8);
    }

    @Override // defpackage.evb
    public final boolean l() {
        if (this.d || h()) {
            return false;
        }
        View viewFindViewById = this.h.findViewById(kl9.w.e);
        if (viewFindViewById == null) {
            gm0.n(this.b, "no view for this digitalId bar item");
            return false;
        }
        a(viewFindViewById);
        if (h()) {
            ae9 ae9Var = (ae9) this.k.getValue();
            ul9 ul9Var = new ul9();
            ((tl5) this.a).getClass();
            ul9Var.put("tooltip_id", "digital_id_tabbar");
            ae9.k(ae9Var, "TOOLTIP", "tooltip_show", ul9Var.b(), 8);
        }
        ((pa4) this.f.getValue()).a(pa4.d, (oa4) this.g.getValue());
        return true;
    }
}
