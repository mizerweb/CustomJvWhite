package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vv7 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wv7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv7(Number number, wv7 wv7Var, int i) {
        super(4, number);
        this.c = i;
        this.d = wv7Var;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        wv7 wv7Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    wv7Var.invalidate();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    wv7Var.invalidate();
                }
                break;
        }
    }
}
