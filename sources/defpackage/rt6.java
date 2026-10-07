package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rt6 extends mdh implements cf7 {
    public final /* synthetic */ njd e;
    public final /* synthetic */ zt6 f;
    public final /* synthetic */ wo8 g;
    public final /* synthetic */ wfi h;
    public final /* synthetic */ fd4 i;
    public final /* synthetic */ b41 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt6(njd njdVar, zt6 zt6Var, wo8 wo8Var, wfi wfiVar, fd4 fd4Var, b41 b41Var, lq4 lq4Var) {
        super(1, lq4Var);
        this.e = njdVar;
        this.f = zt6Var;
        this.g = wo8Var;
        this.h = wfiVar;
        this.i = fd4Var;
        this.j = b41Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new rt6(this.e, this.f, this.g, this.h, this.i, this.j, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((rt6) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        wfe wfeVarP = nbh.p(obj);
        xt4 xt4Var = (xt4) this.f.q.getValue();
        xt4Var.getClass();
        vt4 vt4VarX0 = lvb.x0(xt4Var, this.g);
        gv7 gv7Var = new gv7(wfeVarP, this.h, this.i, this.f, this.j, this.e, null, 5);
        njd njdVar = this.e;
        sgg sggVarH0 = yab.h0(njdVar, vt4VarX0, 2, gv7Var);
        wfeVarP.a = yab.i0(njdVar, null, 0, new f00(2, null, this.f, this.h, sggVarH0, this.g), 3);
        sggVarH0.start();
        return sggVarH0.Y(new nv4(8, njdVar));
    }
}
