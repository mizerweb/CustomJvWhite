package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kkf extends glf {
    public final long p;

    public kkf(jkf jkfVar) {
        super(jkfVar);
        this.p = jkfVar.l;
    }

    @Override // defpackage.ilf, defpackage.mjf
    public final void B() {
        wja wjaVar;
        rt2 rt2VarN = c().N(this.c);
        if (rt2VarN == null) {
            return;
        }
        qfa qfaVarR = r();
        long j = this.p;
        sfa sfaVarL = qfaVarR.l(j);
        if (sfaVarL == null || (wjaVar = sfaVarL.j) == wja.DELETED) {
            return;
        }
        r().p(sfaVarL, xfa.SENDING);
        c46 c46Var = C().n;
        List list = c46Var != null ? (List) c46Var.a : null;
        if (list == null) {
            list = r66.a;
        }
        List list2 = list;
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        ((uz5) njfVar.y.getValue()).a(this.p, this.c, this.l, this.m, wja.EDITED, list2, true);
        b().x(this.c, this.p, rt2VarN.b.a, sfaVarL.b, this.l, sfaVarL.g, wjaVar, sfaVarL.C() ? (List) sfaVarL.n.a : null, true, sfaVarL.D);
        sfa sfaVarL2 = r().l(j);
        if (sfaVarL2 != null) {
            int size = this.n.size();
            for (int i = 0; i < size; i++) {
                if (!(this.n.get(i) instanceof q50)) {
                    t2 t2Var = (t2) this.n.get(i);
                    long j2 = rt2VarN.a;
                    String str = sfaVarL2.n.h(i).t;
                    njf njfVar2 = this.a;
                    if (njfVar2 == null) {
                        njfVar2 = null;
                    }
                    ((cq6) njfVar2.c.getValue()).c(t2Var, this.p, j2, str);
                }
            }
        }
    }

    @Override // defpackage.glf, defpackage.ilf
    public final rfa C() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n.size());
        for (t2 t2Var : this.n) {
            njf njfVar = this.a;
            if (njfVar == null) {
                njfVar = null;
            }
            zlc zlcVarC = ((uid) njfVar.I.getValue()).c(t2Var, this.o);
            if (zlcVarC != null) {
                t2 t2Var2 = (t2) zlcVarC.a;
                e70 e70Var = (e70) zlcVarC.b;
                if (t2Var2 != null && e70Var != null) {
                    arrayList2.add(t2Var2);
                    arrayList.add(e70Var);
                }
            }
        }
        this.n = arrayList2;
        f70 f70Var = new f70();
        f70Var.a = arrayList;
        c46 c46VarC = f70Var.c();
        rfa rfaVar = new rfa();
        rfaVar.n = c46VarC;
        String str = this.l;
        if (!ch3.r(str)) {
            rfaVar.g = str;
        }
        List list = this.m;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            rfaVar.b(list);
        }
        rfaVar.F = this.i;
        return rfaVar;
    }

    @Override // defpackage.glf, defpackage.ilf
    public final String D() {
        return "ServiceTaskEditMediaMessage";
    }
}
