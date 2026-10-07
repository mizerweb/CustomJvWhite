package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aag extends bg5 implements s8g {
    public ko5 c;

    @Override // defpackage.s8g
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.c, ko5Var)) {
            this.c = ko5Var;
            this.a.e(this);
        }
    }

    @Override // defpackage.r7h
    public final void cancel() {
        set(4);
        this.b = null;
        this.c.dispose();
    }

    @Override // defpackage.s8g
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
