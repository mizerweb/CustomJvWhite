package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jyb extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ kyb d;

    /* JADX WARN: Illegal instructions before constructor call */
    public jyb(kyb kybVar, int i) {
        this.c = i;
        int i2 = 4;
        this.d = kybVar;
        switch (i) {
            case 2:
                super(i2, hyb.a);
                break;
            case 3:
                super(i2, gyb.a);
                break;
            default:
                super(i2, null);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        a8g a8gVar = pq3.j;
        kyb kybVar = this.d;
        switch (i) {
            case 0:
                kybVar.onThemeChanged(kybVar.getCurrentTheme());
                break;
            case 1:
                kbc kbcVarH = (kbc) obj2;
                if (!cqk.d((kbc) obj, kbcVarH)) {
                    if (kbcVarH == null) {
                        kbcVarH = a8gVar.h(kybVar);
                    }
                    kybVar.onThemeChanged(kbcVarH);
                }
                break;
            case 2:
                hyb hybVar = (hyb) obj2;
                if (((hyb) obj) != hybVar) {
                    int i2 = iyb.$EnumSwitchMapping$0[hybVar.ordinal()];
                    if (i2 == 1) {
                        if (kybVar.getTextView().getParent() != null) {
                            kybVar.removeView(kybVar.getTextView());
                        }
                    } else if (i2 != 2) {
                        ore.o();
                    } else if (kybVar.getTextView().getParent() == null) {
                        kybVar.addView(kybVar.getTextView());
                    }
                }
                break;
            default:
                if (((gyb) obj) != ((gyb) obj2)) {
                    kybVar.onThemeChanged(a8gVar.h(kybVar));
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyb(s9a s9aVar, kyb kybVar) {
        super(4, s9aVar);
        this.c = 0;
        this.d = kybVar;
    }
}
