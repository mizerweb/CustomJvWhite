package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l55 extends p55 {
    @Override // defpackage.p55
    public final int n(p76 p76Var) {
        return p76Var.E();
    }

    @Override // defpackage.p55
    public final s98 o() {
        s98 s98Var = new s98();
        s98Var.a = 0;
        s98Var.b = false;
        s98Var.c = false;
        return s98Var;
    }

    @Override // defpackage.p55
    public final synchronized boolean s(p76 p76Var, int i) {
        return lq0.b(i) ? false : this.g.d(p76Var, i);
    }
}
