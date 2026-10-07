package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u09 {
    public final i19 a;
    public final on5 b;
    public final a74 c;

    public u09(i19 i19Var, on5 on5Var, vo8 vo8Var) {
        this.a = i19Var;
        this.b = on5Var;
        a74 a74Var = new a74(this, 1, vo8Var);
        this.c = a74Var;
        if (i19Var.d != n09.a) {
            i19Var.a(a74Var);
        } else {
            vo8Var.b(null);
            a();
        }
    }

    public final void a() {
        this.a.f(this.c);
        on5 on5Var = this.b;
        on5Var.b = true;
        on5Var.a();
    }
}
