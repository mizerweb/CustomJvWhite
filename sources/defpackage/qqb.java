package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqb extends fqb {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qqb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    Object obj2 = ((gg7) obj).a;
                    if (obj2 == null) {
                        throw gd6.a("Supplier returned a null Throwable.");
                    }
                    fd6 fd6Var = gd6.a;
                    th = (Throwable) obj2;
                    rrbVar.c(l66.a);
                    rrbVar.onError(th);
                    return;
                } catch (Throwable th) {
                    th = th;
                    iwl.a(th);
                }
                break;
            default:
                ((v7g) obj).h(new cag(rrbVar));
                return;
        }
    }
}
