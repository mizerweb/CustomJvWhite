package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cr3 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ dr3 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public cr3(dr3 dr3Var, int i) {
        this.c = i;
        switch (i) {
            case 2:
                this.d = dr3Var;
                super(4, -1);
                break;
            case 3:
                this.d = dr3Var;
                super(4, 0);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.d = dr3Var;
                super(4, bool);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        dr3 dr3Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    dr3Var.invalidate();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    dr3Var.e.setStrokeWidth(fFloatValue);
                    dr3Var.invalidate();
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    dr3Var.e.setColor(iIntValue);
                    dr3Var.invalidate();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue2 = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    dr3Var.f.setColor(iIntValue2);
                    dr3Var.invalidate();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr3(Float f, dr3 dr3Var) {
        super(4, f);
        this.c = 1;
        this.d = dr3Var;
    }
}
