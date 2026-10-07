package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qq0 implements s25 {
    public final v1i a;
    public final s25 b;

    public qq0(s25 s25Var, String str, v1i v1iVar) {
        this.a = v1iVar;
        s25 s25Var2 = s25Var;
        if (s25Var == null) {
            eb5 eb5Var = new eb5();
            eb5Var.b = str;
            eb5Var.c = 8000;
            eb5Var.d = 8000;
            s25Var2 = eb5Var;
        }
        this.b = s25Var2;
    }

    @Override // defpackage.s25
    public final u25 a() {
        u25 u25VarA = this.b.a();
        u25VarA.w(this.a);
        return u25VarA;
    }
}
