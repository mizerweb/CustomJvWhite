package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vh5 extends fsb {
    public final wh5 b;
    public final nxe c;
    public final euc d;

    public vh5(z18 z18Var, ta4 ta4Var, wuh wuhVar, List list) {
        super(z18Var);
        zu4 zu4Var = new zu4(ta4Var);
        i18 i18Var = new i18(new c7k((wxe) z18Var.i));
        i18Var.f = (qp) z18Var.d;
        i18Var.b.a = new wo5(new ks9(10, zu4Var));
        wh5 wh5Var = new wh5(i18Var, zu4Var, wuhVar, (ot4) z18Var.c, list);
        this.d = new euc(zu4Var, wh5Var, i18Var, 7);
        this.b = wh5Var;
        this.c = new nxe(wh5Var);
    }

    @Override // defpackage.fsb
    public final no b() {
        return this.b;
    }

    @Override // defpackage.fsb
    public final gsb e() {
        return this.d;
    }

    @Override // defpackage.fsb
    public final nxe f() {
        return this.c;
    }

    @Override // defpackage.fsb
    public final z18 g() {
        z18 z18Var = new z18();
        a(z18Var);
        return z18Var;
    }
}
