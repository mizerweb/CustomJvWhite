package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w1k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1k b;

    public /* synthetic */ w1k(z1k z1kVar, int i) {
        this.a = i;
        this.b = z1kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        z1k z1kVar = this.b;
        switch (i) {
            case 0:
                z1kVar.requestLayout();
                z1kVar.invalidate();
                break;
            default:
                int i2 = z1k.r;
                pj6.d(z1k.class, Integer.valueOf(z1kVar.hashCode()), "onRelease: view %x");
                y1k y1kVar = z1kVar.m;
                if (y1kVar != null) {
                    mx4 mx4Var = (mx4) y1kVar;
                    mx4Var.P1 = mx4Var.z();
                }
                uf5 uf5Var = (uf5) z1kVar.q;
                uf5Var.c = false;
                uf5Var.d();
                break;
        }
    }
}
