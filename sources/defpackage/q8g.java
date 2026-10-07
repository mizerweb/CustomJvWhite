package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q8g extends v7g {
    public final /* synthetic */ int a;
    public final v7g b;
    public final z2f c;

    public /* synthetic */ q8g(v7g v7gVar, z2f z2fVar, int i) {
        this.a = i;
        this.b = v7gVar;
        this.c = z2fVar;
    }

    @Override // defpackage.v7g
    public final void i(s8g s8gVar) {
        int i = this.a;
        z2f z2fVar = this.c;
        v7g v7gVar = this.b;
        switch (i) {
            case 0:
                v7gVar.h(new kp9(s8gVar, z2fVar, 1));
                break;
            default:
                l64 l64Var = new l64(s8gVar, v7gVar);
                s8gVar.c(l64Var);
                ko5 ko5VarB = z2fVar.b(l64Var);
                j66 j66Var = (j66) l64Var.c;
                j66Var.getClass();
                oo5.d(j66Var, ko5VarB);
                break;
        }
    }
}
