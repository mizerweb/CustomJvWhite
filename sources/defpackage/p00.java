package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p00 extends mdh implements qf7 {
    public /* synthetic */ Object e;
    public final /* synthetic */ fz2 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ ky3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(fz2 fz2Var, long j, int i, long j2, int i2, long j3, ky3 ky3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = fz2Var;
        this.g = j;
        this.h = i;
        this.i = j2;
        this.j = i2;
        this.k = j3;
        this.l = ky3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        p00 p00Var = new p00(this.f, this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
        p00Var.e = obj;
        return p00Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        p00 p00Var = (p00) create((tw2) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        p00Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        tw2 tw2Var = (tw2) this.e;
        ch3.d0(obj);
        fx2 fx2Var = tw2Var.n;
        List list = this.f.c;
        mg5 mg5Var = mg5.REGULAR;
        sb8.t(fx2Var, list, this.g, this.h, this.i, this.j, this.k, mg5Var);
        ky3 ky3Var = this.l;
        if (ky3Var != null) {
            long j = tw2Var.j;
            long j2 = ky3Var.a;
            if (j != j2) {
                tw2Var.j = j2;
                sb8.R(tw2Var.n, ky3Var.c, mg5Var);
            }
        }
        return sbi.a;
    }
}
