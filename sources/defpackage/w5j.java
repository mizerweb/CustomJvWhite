package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w5j extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ x5j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5j(x5j x5jVar, int i) {
        super(4, null);
        this.c = i;
        switch (i) {
            case 1:
                this.d = x5jVar;
                super(4, r5j.a);
                break;
            case 2:
                Boolean bool = Boolean.FALSE;
                this.d = x5jVar;
                super(4, bool);
                break;
            default:
                this.d = x5jVar;
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        x5j x5jVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    x5jVar.requestLayout();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    x5jVar.requestLayout();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    x5jVar.requestLayout();
                }
                break;
        }
    }
}
