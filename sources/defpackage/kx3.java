package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kx3 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ lx3 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public kx3(lx3 lx3Var, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 2:
                this.d = lx3Var;
                super(i2, -1);
                break;
            case 3:
                this.d = lx3Var;
                super(i2, -1);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.d = lx3Var;
                super(i2, bool);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        lx3 lx3Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    lx3Var.invalidate();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    lx3Var.g.setStrokeWidth(fFloatValue);
                    lx3Var.invalidate();
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    lx3Var.g.setColor(iIntValue);
                    lx3Var.invalidate();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue2 = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    lx3Var.h.setColor(iIntValue2);
                    lx3Var.invalidate();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx3(Float f, lx3 lx3Var) {
        super(4, f);
        this.c = 1;
        this.d = lx3Var;
    }
}
