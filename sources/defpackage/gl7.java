package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gl7 implements rjg {
    public final qjh a;

    public gl7(qjh qjhVar) {
        this.a = qjhVar;
    }

    @Override // defpackage.rjg
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.rjg
    public final boolean b(ki0 ki0Var) {
        int i = ki0Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(ki0Var.a);
        return true;
    }
}
