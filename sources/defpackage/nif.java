package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nif implements rrb, ko5 {
    public final rrb a;
    public ko5 b;
    public boolean c;
    public ed7 d;
    public volatile boolean e;

    public nif(rrb rrbVar) {
        this.a = rrbVar;
    }

    @Override // defpackage.rrb
    public final void b() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.c) {
                    this.e = true;
                    this.c = true;
                    this.a.b();
                } else {
                    ed7 ed7Var = this.d;
                    if (ed7Var == null) {
                        ed7Var = new ed7(1);
                        this.d = ed7Var;
                    }
                    ed7Var.q(pmb.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
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
        Object[] objArr;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.dispose();
            onError(gd6.a("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.c) {
                    ed7 ed7Var = this.d;
                    if (ed7Var == null) {
                        ed7Var = new ed7(1);
                        this.d = ed7Var;
                    }
                    ed7Var.q(obj);
                    return;
                }
                this.c = true;
                this.a.d(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            ed7 ed7Var2 = this.d;
                            if (ed7Var2 == null) {
                                this.c = false;
                                return;
                            }
                            this.d = null;
                            rrb rrbVar = this.a;
                            for (Object[] objArr2 = (Object[]) ed7Var2.c; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (pmb.a(rrbVar, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        this.e = true;
        this.b.dispose();
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (this.e) {
            tre.s0(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    if (this.c) {
                        this.e = true;
                        ed7 ed7Var = this.d;
                        if (ed7Var == null) {
                            ed7Var = new ed7(1);
                            this.d = ed7Var;
                        }
                        ((Object[]) ed7Var.c)[0] = new omb(th);
                        return;
                    }
                    this.e = true;
                    this.c = true;
                    z = false;
                }
                if (z) {
                    tre.s0(th);
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
