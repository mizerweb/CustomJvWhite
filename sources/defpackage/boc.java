package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class boc implements fe4 {
    public final rxe a;
    public final String b;
    public final qf7 c;
    public final ifh d = new ifh(new ap9(15, this));

    public boc(rxe rxeVar, String str, qf7 qf7Var) {
        this.a = rxeVar;
        this.b = str;
        this.c = qf7Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        ifh ifhVar = this.d;
        if (ifhVar.d()) {
            ((qxe) ifhVar.getValue()).close();
        }
    }

    @Override // defpackage.fe4
    public final Object h(boolean z, qf7 qf7Var, nq4 nq4Var) {
        aoc aocVar = (aoc) nq4Var.getContext().x0(aoc.b);
        lq4 lq4Var = null;
        znc zncVar = aocVar != null ? aocVar.a : null;
        if (zncVar != null) {
            return qf7Var.invoke(zncVar, nq4Var);
        }
        znc zncVar2 = new znc(this.c, (qxe) this.d.getValue());
        return yab.K0(new aoc(zncVar2), new ai8(qf7Var, zncVar2, lq4Var, 15), nq4Var);
    }
}
