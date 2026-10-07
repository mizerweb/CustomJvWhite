package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yqb implements rrb, ko5 {
    public final rrb a;
    public ko5 b;

    public yqb(rrb rrbVar) {
        this.a = rrbVar;
    }

    @Override // defpackage.rrb
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.b, ko5Var)) {
            this.b = ko5Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        this.a.d(obj);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.b.dispose();
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
