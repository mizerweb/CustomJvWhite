package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s58 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ t58 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s58(t58 t58Var, int i) {
        super(4, null);
        this.c = i;
        this.d = t58Var;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        t58 t58Var = this.d;
        switch (i) {
            case 0:
                l68 l68Var = (l68) obj2;
                l68 l68Var2 = (l68) obj;
                if (cqk.d(l68Var2 != null ? Integer.valueOf(l68Var2.getWidth()) : null, l68Var != null ? Integer.valueOf(l68Var.getWidth()) : null)) {
                    if (cqk.d(l68Var2 != null ? Integer.valueOf(l68Var2.getHeight()) : null, l68Var != null ? Integer.valueOf(l68Var.getHeight()) : null)) {
                    }
                }
                t58Var.post(new m58(t58Var, 0));
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    t58Var.r(i58.a);
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    g58 g58Var = (g58) obj2;
                    if (t58Var.isLaidOut() && !t58Var.isLayoutRequested()) {
                        t58.q(t58Var, g58Var, 30);
                    } else {
                        t58Var.addOnLayoutChangeListener(new b62(t58Var, 2, g58Var));
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    l58 l58Var = (l58) obj2;
                    if (l58Var != null) {
                        t58Var.r(l58Var);
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s58(Object obj, t58 t58Var) {
        super(4, obj);
        this.c = 2;
        this.d = t58Var;
    }
}
