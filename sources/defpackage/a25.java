package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a25 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ b25 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public a25(b25 b25Var, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 1:
                this.d = b25Var;
                super(i2, 255);
                break;
            default:
                this.d = b25Var;
                super(i2, 0);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        b25 b25Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    b25Var.b.setColor(iIntValue);
                    b25Var.invalidateSelf();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue2 = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    b25Var.b.setAlpha(iIntValue2);
                    b25Var.invalidateSelf();
                }
                break;
        }
    }
}
