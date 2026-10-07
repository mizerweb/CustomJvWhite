package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class crb extends lt0 implements rrb, Runnable {
    public final rrb a;
    public final y2f b;
    public final int c;
    public b7g d;
    public ko5 e;
    public Throwable f;
    public volatile boolean g;
    public volatile boolean h;
    public int i;
    public boolean j;

    public crb(rrb rrbVar, y2f y2fVar, int i) {
        this.a = rrbVar;
        this.b = y2fVar;
        this.c = i;
    }

    @Override // defpackage.rrb
    public final void b() {
        if (this.g) {
            return;
        }
        this.g = true;
        if (getAndIncrement() == 0) {
            this.b.a(this);
        }
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.e, ko5Var)) {
            this.e = ko5Var;
            if (ko5Var instanceof o1e) {
                o1e o1eVar = (o1e) ko5Var;
                int iK = o1eVar.k();
                if (iK == 1) {
                    this.i = iK;
                    this.d = o1eVar;
                    this.g = true;
                    this.a.c(this);
                    if (getAndIncrement() == 0) {
                        this.b.a(this);
                        return;
                    }
                    return;
                }
                if (iK == 2) {
                    this.i = iK;
                    this.d = o1eVar;
                    this.a.c(this);
                    return;
                }
            }
            this.d = new nfg(this.c);
            this.a.c(this);
        }
    }

    @Override // defpackage.b7g
    public final void clear() {
        this.d.clear();
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.b.a(this);
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.dispose();
        this.b.dispose();
        if (this.j || getAndIncrement() != 0) {
            return;
        }
        this.d.clear();
    }

    public final boolean e(boolean z, boolean z2, rrb rrbVar) {
        if (this.h) {
            this.d.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f;
        if (th != null) {
            this.h = true;
            this.d.clear();
            rrbVar.onError(th);
            this.b.dispose();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.h = true;
        rrbVar.b();
        this.b.dispose();
        return true;
    }

    @Override // defpackage.b7g
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // defpackage.p1e
    public final int k() {
        this.j = true;
        return 2;
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (this.g) {
            tre.s0(th);
            return;
        }
        this.f = th;
        this.g = true;
        if (getAndIncrement() == 0) {
            this.b.a(this);
        }
    }

    @Override // defpackage.b7g
    public final Object poll() {
        return this.d.poll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j) {
            int iAddAndGet = 1;
            while (!this.h) {
                boolean z = this.g;
                Throwable th = this.f;
                if (z && th != null) {
                    this.h = true;
                    this.a.onError(this.f);
                    this.b.dispose();
                    return;
                }
                this.a.d(null);
                if (z) {
                    this.h = true;
                    Throwable th2 = this.f;
                    rrb rrbVar = this.a;
                    if (th2 != null) {
                        rrbVar.onError(th2);
                    } else {
                        rrbVar.b();
                    }
                    this.b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        b7g b7gVar = this.d;
        rrb rrbVar2 = this.a;
        int iAddAndGet2 = 1;
        while (!e(this.g, b7gVar.isEmpty(), rrbVar2)) {
            while (true) {
                boolean z2 = this.g;
                try {
                    Object objPoll = b7gVar.poll();
                    boolean z3 = objPoll == null;
                    if (e(z2, z3, rrbVar2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    } else {
                        rrbVar2.d(objPoll);
                    }
                } catch (Throwable th3) {
                    iwl.a(th3);
                    this.h = true;
                    this.e.dispose();
                    b7gVar.clear();
                    rrbVar2.onError(th3);
                    this.b.dispose();
                    return;
                }
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
        }
    }
}
