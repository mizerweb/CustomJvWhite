package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class z0l<V> implements Runnable {
    final f1l<V> a;
    final e4l<? extends V> b;

    public z0l(f1l f1lVar, e4l e4lVar) {
        this.a = f1lVar;
        this.b = e4lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((f1l) this.a).a != this) {
            return;
        }
        e4l<? extends V> e4lVar = this.b;
        if (f1l.f.f(this.a, this, f1l.r(e4lVar))) {
            f1l.w(this.a, false);
        }
    }
}
