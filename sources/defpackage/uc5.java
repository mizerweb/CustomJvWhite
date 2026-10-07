package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uc5 extends fsb {
    public final mo b;
    public final wh5 c;
    public final nxe d;
    public final r6a e;
    public final ot4 f;

    public uc5(z18 z18Var, yp ypVar, dq dqVar, r6a r6aVar, List list) {
        super(z18Var);
        this.b = r6aVar;
        this.f = (ot4) z18Var.c;
        ug5 ug5Var = new ug5(ypVar, r6aVar);
        i18 i18Var = new i18(new c7k((wxe) z18Var.i));
        i18Var.f = (qp) z18Var.d;
        i18Var.b.a = new wo5(new ks9(10, ug5Var));
        wh5 wh5Var = new wh5(i18Var, ug5Var, dqVar, (ot4) z18Var.c, list);
        this.e = new r6a(ug5Var, wh5Var, i18Var);
        this.c = wh5Var;
        this.d = new nxe(wh5Var);
    }

    @Override // defpackage.fsb
    public final no b() {
        return this.c;
    }

    @Override // defpackage.fsb
    public final mo c() {
        return this.b;
    }

    @Override // defpackage.fsb
    public final yo d() {
        return this.f;
    }

    @Override // defpackage.fsb
    public final gsb e() {
        return this.e;
    }

    @Override // defpackage.fsb
    public final nxe f() {
        return this.d;
    }

    @Override // defpackage.fsb
    public final z18 g() {
        z18 z18Var = new z18();
        a(z18Var);
        return z18Var;
    }
}
