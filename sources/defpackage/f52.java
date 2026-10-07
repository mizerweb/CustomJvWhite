package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f52 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ g52 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public f52(g52 g52Var, int i) {
        this.c = i;
        int i2 = 4;
        this.d = g52Var;
        switch (i) {
            case 1:
                super(i2, d52.f);
                break;
            default:
                super(i2, c52.b);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        g52 g52Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    int iOrdinal = ((c52) obj2).ordinal();
                    rue rueVar = rue.c;
                    if (iOrdinal == 0) {
                        g52Var.getNegativeButtonView().setMode(rue.d);
                        g52Var.getPositiveButtonSecondaryView().setMode(rueVar);
                        g52Var.getPositiveButtonNeutralView().setMode(rueVar);
                    } else if (iOrdinal != 1) {
                        ore.o();
                    } else {
                        wue negativeButtonView = g52Var.getNegativeButtonView();
                        rue rueVar2 = rue.a;
                        negativeButtonView.setMode(rueVar2);
                        g52Var.getPositiveButtonSecondaryView().setMode(rueVar2);
                        g52Var.getPositiveButtonNeutralView().setMode(rueVar);
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    d52 d52Var = (d52) obj2;
                    int iOrdinal2 = d52Var.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                        g52.I(g52Var);
                        g52Var.getShineBackgroundView().setVisibility(0);
                        js7 shineBackgroundView = g52Var.getShineBackgroundView();
                        int iOrdinal3 = d52Var.ordinal();
                        shineBackgroundView.setColorState(iOrdinal3 != 0 ? iOrdinal3 != 2 ? gs7.a : gs7.b : gs7.c);
                        if (d52Var == d52.a) {
                            js7 shineBackgroundView2 = g52Var.getShineBackgroundView();
                            Boolean bool = g52Var.x1;
                            shineBackgroundView2.setTalking(bool != null ? bool.booleanValue() : false);
                        }
                        if (g52Var.isAttachedToWindow() && !g52Var.getShineBackgroundView().e) {
                            g52Var.getShineBackgroundView().c();
                            break;
                        }
                    } else if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                        if (iOrdinal2 != 5) {
                            ore.o();
                        } else {
                            if (g52Var.isAttachedToWindow()) {
                                g52Var.getShineBackgroundView().d();
                            }
                            g52Var.getShineBackgroundView().setVisibility(8);
                        }
                        break;
                    } else {
                        g52.I(g52Var);
                        g52Var.getShineBackgroundView().setVisibility(0);
                        g52Var.getShineBackgroundView().setColorState(gs7.d);
                        if (g52Var.isAttachedToWindow() && !g52Var.getShineBackgroundView().e) {
                            g52Var.getShineBackgroundView().c();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
