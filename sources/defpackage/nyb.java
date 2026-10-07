package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nyb extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ oyb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyb(oyb oybVar, int i) {
        super(4, hyb.b);
        this.c = i;
        this.d = oybVar;
        switch (i) {
            case 1:
                super(4, gyb.a);
                break;
            case 2:
                super(4, null);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        oyb oybVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    oybVar.invalidate();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    oybVar.invalidate();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    oybVar.invalidate();
                }
                break;
        }
    }
}
