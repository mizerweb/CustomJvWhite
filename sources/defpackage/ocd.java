package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ocd implements xx6 {
    public final /* synthetic */ tz a;
    public final /* synthetic */ wui b;
    public final /* synthetic */ gka c;
    public final /* synthetic */ pcd d;
    public final /* synthetic */ xui e;

    public ocd(tz tzVar, wui wuiVar, gka gkaVar, pcd pcdVar, xui xuiVar) {
        this.a = tzVar;
        this.b = wuiVar;
        this.c = gkaVar;
        this.d = pcdVar;
        this.e = xuiVar;
    }

    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        Object objCollect = this.a.collect(new ncd(yx6Var, this.b, this.c, this.d, this.e), lq4Var);
        return objCollect == hu4.a ? objCollect : sbi.a;
    }
}
