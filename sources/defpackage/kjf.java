package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kjf implements Runnable {
    public final i19 a;
    public final m09 b;
    public boolean c;

    public kjf(i19 i19Var, m09 m09Var) {
        this.a = i19Var;
        this.b = m09Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.d(this.b);
        this.c = true;
    }
}
