package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qbc implements cf7 {
    public final /* synthetic */ String a;
    public final /* synthetic */ rbc b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ qbc(String str, rbc rbcVar, Integer num, boolean z, boolean z2) {
        this.a = str;
        this.b = rbcVar;
        this.c = num;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        String str = this.a;
        rbc rbcVar = this.b;
        return new pbc(str, rbcVar.a, this.c.intValue(), rbcVar.c.b.b, new e5h(rbcVar.b, this.d, this.e));
    }
}
