package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements Runnable {
    public final o1 a;
    public final e89 b;

    public e1(o1 o1Var, e89 e89Var) {
        this.a = o1Var;
        this.b = e89Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (o1.f.c(this.a, this, o1.i(this.b))) {
            o1.f(this.a, false);
        }
    }
}
