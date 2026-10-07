package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vud implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8j b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ vud(a8j a8jVar, long j, boolean z, int i) {
        this.a = i;
        this.b = a8jVar;
        this.c = j;
        this.d = z;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        a8j a8jVar = this.b;
        switch (i) {
            case 0:
                dvd dvdVar = (dvd) a8jVar;
                if (((j8c) obj) != j8c.e) {
                    boolean z = dvdVar.p1.r() && dvdVar.p1.s();
                    wzj wzjVar = (wzj) dvdVar.j.getValue();
                    long j = this.c;
                    wzjVar.c(new xjf(j, this.d));
                    if (z) {
                        a8j.x(dvdVar.C, new hsd(j, dvdVar.d));
                    }
                }
                return sbiVar;
            case 1:
                dvd dvdVar2 = (dvd) a8jVar;
                int iOrdinal = ((j8c) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                    yab.i0(dvdVar2.b, dvdVar2.E(), 0, new c03(dvdVar2, this.c, this.d, null, 10), 2);
                    return sbiVar;
                }
                if (iOrdinal == 4) {
                    return sbiVar;
                }
                ore.o();
                return null;
            default:
                iug iugVar = (iug) a8jVar;
                if (j0m.a((j8c) obj)) {
                    yab.i0((wmi) iugVar.k.getValue(), ((n0c) iugVar.e).a(), 0, new ztg(iugVar, this.c, this.d, null, 1), 2);
                }
                return sbiVar;
        }
    }
}
