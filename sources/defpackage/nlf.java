package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class nlf extends ilf {
    public final String l;
    public final e70 m;
    public final boolean n;

    public nlf(mlf mlfVar) {
        super(mlfVar);
        this.l = mlfVar.i;
        this.m = (e70) mlfVar.k;
        this.n = mlfVar.j;
    }

    @Override // defpackage.ilf
    public final rfa C() {
        boolean z = this.n;
        e70 e70VarA = this.m;
        if (z) {
            c60 c60VarJ = e70VarA.j();
            c60VarJ.y = q60.b;
            e70VarA = c60VarJ.a();
        }
        f70 f70Var = new f70();
        f70Var.a = Collections.singletonList(e70VarA);
        c46 c46VarC = f70Var.c();
        rfa rfaVar = new rfa();
        rfaVar.n = c46VarC;
        String str = this.l;
        if (!ch3.r(str)) {
            rfaVar.g = str;
        }
        rfaVar.D = null;
        return rfaVar;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskSendShareMessage";
    }

    @Override // defpackage.ilf
    public final long G(rt2 rt2Var, long j, String str) {
        long jG = super.G(rt2Var, j, str);
        if (this.n) {
            pvb pvbVarB = b();
            pvb.t(pvbVarB, new w4b(pvbVarB.u().a.g(), j, this.m.g.b));
        }
        return jG;
    }
}
