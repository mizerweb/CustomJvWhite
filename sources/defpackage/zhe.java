package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zhe implements lc7 {
    public final b78 a;
    public final String b = zhe.class.getName();
    public jc7 c = jc7.d;
    public q0 d;
    public t25 e;

    public zhe(b78 b78Var) {
        this.a = b78Var;
    }

    @Override // defpackage.lc7
    public final boolean a() {
        rui ruiVar = this.c.a;
        return (ruiVar != null ? ruiVar.g() : null) != null;
    }

    @Override // defpackage.lc7
    public final Object b(long j, lq4 lq4Var) {
        t25 t25Var = this.e;
        if (t25Var != null) {
            t25Var.close();
        }
        this.e = null;
        rui ruiVar = this.c.a;
        c70 c70VarG = ruiVar != null ? ruiVar.g() : null;
        if (ruiVar == null || c70VarG == null) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "Video collage is null", null, null, 8);
            }
            return null;
        }
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        w78 w78VarD = w78.d(Uri.parse((String) c70VarG.e));
        w78VarD.m = at5.c;
        w78VarD.k = new uc7(ruiVar, j);
        t25 t25VarB = this.a.b(w78VarD.a(), null);
        this.e = t25VarB;
        ((q0) t25VarB).l(new yhe(ek2Var, t25VarB, this), x72.a);
        return ek2Var.s();
    }

    @Override // defpackage.lc7
    public final jc7 getData() {
        return this.c;
    }

    @Override // defpackage.lc7
    public final void prepare() {
        je9 je9Var = je9.g;
        rui ruiVar = this.c.a;
        if (ruiVar == null) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9Var, str, "You should call init before prepare!", null, null, 8);
                return;
            }
            return;
        }
        c70 c70VarG = ruiVar.g();
        if (c70VarG == null) {
            String str2 = this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                a4c.f(a4cVar2, je9Var, str2, "Video collage is null", null, null, 8);
                return;
            }
            return;
        }
        w78 w78VarD = w78.d(Uri.parse((String) c70VarG.e));
        w78VarD.m = at5.c;
        q0 q0Var = this.d;
        if (q0Var != null) {
            q0Var.close();
        }
        this.d = null;
        this.d = this.a.d(w78VarD.a(), null);
    }
}
