package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dv1 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ev1 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public dv1(ev1 ev1Var, int i) {
        this.c = i;
        int i2 = 4;
        this.d = ev1Var;
        switch (i) {
            case 1:
                super(i2, bv1.a);
                break;
            default:
                super(i2, null);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        o1d k1dVar;
        int i = this.c;
        ev1 ev1Var = this.d;
        switch (i) {
            case 0:
                kbc kbcVar = (kbc) obj2;
                if (!cqk.d((kbc) obj, kbcVar)) {
                    ev1Var.getFakePipView().setCustomTheme(kbcVar);
                }
                break;
            case 1:
                bv1 bv1Var = (bv1) obj2;
                if (((bv1) obj) != bv1Var) {
                    int iOrdinal = bv1Var.ordinal();
                    if (iOrdinal == 0) {
                        k1dVar = l1d.b;
                    } else if (iOrdinal == 1) {
                        k1dVar = new k1d(ev1Var, new c7k(6, ev1Var), ev1Var.getPipPositionMediator());
                    } else if (iOrdinal != 2) {
                        ore.o();
                    } else {
                        k1dVar = new a1d(ev1Var, new vn7(7, ev1Var), ev1Var.getPipPositionMediator());
                    }
                    ev1Var.d = k1dVar;
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    ev1Var.c(ev1Var.getLeft(), ev1Var.getTop(), ev1Var.getRight(), ev1Var.getBottom());
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv1(d1d d1dVar, ev1 ev1Var) {
        super(4, d1dVar);
        this.c = 2;
        this.d = ev1Var;
    }
}
