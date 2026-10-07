package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kk7 implements rjg {
    public final yqi a;
    public final qjh b;

    public kk7(yqi yqiVar, qjh qjhVar) {
        this.a = yqiVar;
        this.b = qjhVar;
    }

    @Override // defpackage.rjg
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.rjg
    public final boolean b(ki0 ki0Var) {
        if (ki0Var.b == 4 && !this.a.a(ki0Var)) {
            String str = ki0Var.c;
            if (str != null) {
                this.b.b(new vh0(str, ki0Var.e, ki0Var.f));
                return true;
            }
            ore.n("Null token");
        }
        return false;
    }
}
