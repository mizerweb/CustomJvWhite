package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pif extends j7h implements ov {
    public final qyd a;
    public boolean b;
    public ed7 c;
    public volatile boolean d;

    public pif(qyd qydVar) {
        this.a = qydVar;
    }

    @Override // defpackage.rrb
    public final void b() {
        if (this.d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                if (!this.b) {
                    this.b = true;
                    this.a.b();
                    return;
                }
                ed7 ed7Var = this.c;
                if (ed7Var == null) {
                    ed7Var = new ed7(1);
                    this.c = ed7Var;
                }
                ed7Var.q(pmb.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        boolean z = true;
        if (!this.d) {
            synchronized (this) {
                try {
                    if (!this.d) {
                        if (this.b) {
                            ed7 ed7Var = this.c;
                            if (ed7Var == null) {
                                ed7Var = new ed7(1);
                                this.c = ed7Var;
                            }
                            ed7Var.q(new nmb(ko5Var));
                            return;
                        }
                        this.b = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            ko5Var.dispose();
        } else {
            this.a.c(ko5Var);
            h();
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        if (this.d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                if (!this.b) {
                    this.b = true;
                    this.a.d(obj);
                    h();
                } else {
                    ed7 ed7Var = this.c;
                    if (ed7Var == null) {
                        ed7Var = new ed7(1);
                        this.c = ed7Var;
                    }
                    ed7Var.q(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        this.a.f(rrbVar);
    }

    public final void h() {
        ed7 ed7Var;
        while (true) {
            synchronized (this) {
                try {
                    ed7Var = this.c;
                    if (ed7Var == null) {
                        this.b = false;
                        return;
                    }
                    this.c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ed7Var.F(this);
        }
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (this.d) {
            tre.s0(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.d) {
                    this.d = true;
                    if (this.b) {
                        ed7 ed7Var = this.c;
                        if (ed7Var == null) {
                            ed7Var = new ed7(1);
                            this.c = ed7Var;
                        }
                        ((Object[]) ed7Var.c)[0] = new omb(th);
                        return;
                    }
                    this.b = true;
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

    @Override // defpackage.edd
    public final boolean test(Object obj) {
        return pmb.a(this.a, obj);
    }
}
