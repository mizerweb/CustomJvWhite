package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mkf extends ilf {
    public final long l;
    public final String m;
    public final List n;

    public mkf(lkf lkfVar) {
        super(lkfVar);
        this.l = lkfVar.h;
        this.m = lkfVar.i;
        this.n = lkfVar.j;
    }

    @Override // defpackage.ilf, defpackage.mjf
    public final void B() {
        sfa sfaVarL;
        wja wjaVar;
        rt2 rt2VarN = c().N(this.c);
        if (rt2VarN == null || (sfaVarL = r().l(this.l)) == null || (wjaVar = sfaVarL.j) == wja.DELETED) {
            return;
        }
        r().p(sfaVarL, xfa.SENDING);
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        ((uz5) njfVar.y.getValue()).a(this.l, this.c, this.m, this.n, wja.EDITED, null, false);
        b().x(this.c, this.l, rt2VarN.b.a, sfaVarL.b, this.m, sfaVarL.g, wjaVar, sfaVarL.C() ? (List) sfaVarL.n.a : null, false, sfaVarL.D);
    }

    @Override // defpackage.ilf
    public final rfa C() {
        rfa rfaVar = new rfa();
        String str = this.m;
        if (!ch3.r(str)) {
            rfaVar.g = str;
        }
        List list = this.n;
        if (!list.isEmpty()) {
            rfaVar.b(list);
        }
        rfaVar.F = this.i;
        return rfaVar;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskEditMessage";
    }
}
