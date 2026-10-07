package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cag extends lt0 implements s8g {
    public final rrb a;
    public Object b;
    public ko5 c;

    public cag(rrb rrbVar) {
        this.a = rrbVar;
    }

    @Override // defpackage.s8g
    public final void a(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        rrb rrbVar = this.a;
        if (i == 8) {
            this.b = obj;
            lazySet(16);
            rrbVar.d(null);
        } else {
            lazySet(2);
            rrbVar.d(obj);
        }
        if (get() != 4) {
            rrbVar.b();
        }
    }

    @Override // defpackage.s8g
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.c, ko5Var)) {
            this.c = ko5Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.b7g
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    @Override // defpackage.ko5
    public final void dispose() {
        set(4);
        this.b = null;
        this.c.dispose();
    }

    @Override // defpackage.b7g
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // defpackage.p1e
    public final int k() {
        lazySet(8);
        return 2;
    }

    @Override // defpackage.s8g
    public final void onError(Throwable th) {
        if ((get() & 54) != 0) {
            tre.s0(th);
        } else {
            lazySet(2);
            this.a.onError(th);
        }
    }

    @Override // defpackage.b7g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}
