package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rv0 implements ko5, ov {
    public final rrb a;
    public final sv0 b;
    public boolean c;
    public boolean d;
    public ed7 e;
    public boolean f;
    public volatile boolean g;
    public long h;

    public rv0(rrb rrbVar, sv0 sv0Var) {
        this.a = rrbVar;
        this.b = sv0Var;
    }

    public final void a(long j, Object obj) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                try {
                    if (this.g) {
                        return;
                    }
                    if (this.h == j) {
                        return;
                    }
                    if (this.d) {
                        ed7 ed7Var = this.e;
                        if (ed7Var == null) {
                            ed7Var = new ed7(1);
                            this.e = ed7Var;
                        }
                        ed7Var.q(obj);
                        return;
                    }
                    this.c = true;
                    this.f = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        test(obj);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.h(this);
    }

    @Override // defpackage.edd
    public final boolean test(Object obj) {
        if (this.g) {
            return true;
        }
        rrb rrbVar = this.a;
        if (obj == pmb.a) {
            rrbVar.b();
            return true;
        }
        if (obj instanceof omb) {
            rrbVar.onError(((omb) obj).a);
            return true;
        }
        rrbVar.d(obj);
        return false;
    }
}
