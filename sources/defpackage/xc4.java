package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xc4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3a b;
    public final /* synthetic */ i2a c;

    public /* synthetic */ xc4(d3a d3aVar, i2a i2aVar, int i) {
        this.a = i;
        this.b = d3aVar;
        this.c = i2aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 20;
        i2a i2aVar = this.c;
        d3a d3aVar = this.b;
        switch (i) {
            case 0:
                if (!d3aVar.j()) {
                    if (d3aVar.A) {
                        if (!d3a.k(i2aVar)) {
                            if (d3aVar.i(i2aVar)) {
                                d3aVar.A = false;
                            }
                        }
                    }
                    d3aVar.e.getClass();
                    break;
                }
                break;
            case 1:
                d3aVar.g.p0(i2aVar, Integer.MIN_VALUE, 7, t4a.r0(new ch9(25)));
                break;
            case 2:
                d3aVar.g.p0(i2aVar, Integer.MIN_VALUE, 12, t4a.r0(new ch9(28)));
                break;
            case 3:
                d3aVar.g.p0(i2aVar, Integer.MIN_VALUE, 11, t4a.r0(new ch9(24)));
                break;
            case 4:
                d3aVar.g.p0(i2aVar, Integer.MIN_VALUE, 3, t4a.r0(new f4a(5)));
                break;
            case 5:
                d3aVar.g.p0(i2aVar, Integer.MIN_VALUE, 1, t4a.r0(new ch9(i2)));
                break;
            case 6:
                d3aVar.g.n0(i2aVar, Integer.MIN_VALUE);
                break;
            case 7:
                d3aVar.g.n0(i2aVar, Integer.MIN_VALUE);
                break;
            case 8:
                d3aVar.g.p0(i2aVar, Integer.MIN_VALUE, 1, t4a.r0(new ch9(i2)));
                break;
            default:
                d3aVar.g.p0(i2aVar, Integer.MIN_VALUE, 9, t4a.r0(new ch9(29)));
                break;
        }
    }
}
