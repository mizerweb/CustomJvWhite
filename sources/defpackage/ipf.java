package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ipf extends a8j {
    public static final /* synthetic */ zv8[] i = {new z8b(ipf.class, "loadVideoJob", "getLoadVideoJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, ipf.class, "sliderJob", "getSliderJob()Lkotlinx/coroutines/Job;")};
    public final ny8 c;
    public final ny8 d;
    public final mjg e;
    public final r8e f;
    public final p3c g;
    public final p3c h;

    public ipf(ny8 ny8Var, ny8 ny8Var2) {
        this.c = ny8Var;
        this.d = ny8Var2;
        mjg mjgVarA = p90.a(r66.a);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        this.g = qyj.S();
        this.h = qyj.S();
        a8j.t(this, null, new fpf(this, null, 0), 3);
    }

    public static final Object B(ipf ipfVar, mdh mdhVar) {
        Object objK0 = yab.K0(((n0c) ((xhh) ipfVar.c.getValue())).a(), new hpf(ipfVar, null, 0), mdhVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public final boolean C(int i2) {
        return i2 == ((nni) this.d.getValue()).k();
    }

    public final void D(int i2) {
        sgg sggVarT = a8j.t(this, null, new w93(this, i2, (lq4) null, 11), 1);
        this.g.B(this, i[0], sggVarT);
    }
}
