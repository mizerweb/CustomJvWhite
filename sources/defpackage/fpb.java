package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fpb {
    public final rre a;
    public final pl b = new pl(9);

    public fpb(rre rreVar) {
        this.a = rreVar;
    }

    public final Object a(ilb ilbVar, long j, uob uobVar) {
        return ch3.I(uobVar, this.a, true, false, new z14(7, ilbVar.a, j, ilbVar.b));
    }

    public final Object b(ilb ilbVar, long j, nq4 nq4Var) {
        Object objI = ch3.I(nq4Var, this.a, false, true, new z14(6, ilbVar.a, j, ilbVar.b));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }
}
