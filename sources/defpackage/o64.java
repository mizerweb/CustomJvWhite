package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o64 extends h64 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ o64(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.h64
    public final void b(m64 m64Var) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                l64 l64Var = new l64(m64Var, (h64) obj);
                m64Var.c(l64Var);
                ko5 ko5VarB = ((z2f) obj2).b(l64Var);
                j66 j66Var = (j66) l64Var.c;
                j66Var.getClass();
                oo5.d(j66Var, ko5VarB);
                break;
            default:
                o72 o72Var = new o72(m64Var, 5, (sf7) obj2);
                m64Var.c(o72Var);
                ((v7g) obj).h(o72Var);
                break;
        }
    }
}
