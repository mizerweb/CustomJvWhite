package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b52 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b52(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                ((g52) obj2).s.setVisibility(z ? 0 : 8);
                return sbiVar;
            case 1:
                pm2 pm2Var = (pm2) obj2;
                xg xgVar = (xg) obj;
                jm2 jm2Var = new jm2(xgVar, pm2Var);
                wl2 wl2Var = pm2Var.n;
                xgVar.a.getFrameNumber();
                return Boolean.valueOf(gs4.a(new sm2(wl2Var, jm2Var), z));
            case 2:
                vl4 vl4Var = (vl4) obj2;
                if (j0m.a((j8c) obj)) {
                    yab.i0((wmi) vl4Var.D.getValue(), ((n0c) ((xhh) vl4Var.t.getValue())).a(), 0, new ul4(vl4Var, z, null, 1), 2);
                }
                return sbiVar;
            case 3:
                p4b p4bVar = (p4b) obj2;
                String str = p4bVar.f;
                g61 g61Var = p4bVar.j;
                vvk.b((jg8) obj, str, g61Var.a, g61Var.b, z);
                return sbiVar;
            default:
                dvd dvdVar = (dvd) obj2;
                int iOrdinal = ((j8c) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    dvdVar.C();
                } else if (iOrdinal == 2) {
                    dvdVar.s1 = false;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        ore.o();
                        return null;
                    }
                    dvdVar.s1 = false;
                } else {
                    dvdVar.T(z);
                }
                return sbiVar;
        }
    }
}
