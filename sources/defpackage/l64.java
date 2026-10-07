package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class l64 extends AtomicReference implements m64, ko5, Runnable, s8g {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;

    public l64(m64 m64Var, h64 h64Var) {
        this.a = 1;
        this.b = m64Var;
        this.d = h64Var;
        this.c = new j66(2);
    }

    @Override // defpackage.s8g
    public void a(Object obj) {
        ((s8g) this.b).a(obj);
    }

    @Override // defpackage.m64
    public void b() {
        switch (this.a) {
            case 0:
                oo5.d(this, ((z2f) this.c).b(this));
                break;
            default:
                ((m64) this.b).b();
                break;
        }
    }

    @Override // defpackage.m64
    public final void c(ko5 ko5Var) {
        switch (this.a) {
            case 0:
                if (oo5.e(this, ko5Var)) {
                    ((m64) this.b).c(this);
                }
                break;
            case 1:
                oo5.e(this, ko5Var);
                break;
            default:
                oo5.e(this, ko5Var);
                break;
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                oo5.a(this);
                break;
            case 1:
                oo5.a(this);
                j66 j66Var = (j66) obj;
                j66Var.getClass();
                oo5.a(j66Var);
                break;
            default:
                oo5.a(this);
                j66 j66Var2 = (j66) obj;
                j66Var2.getClass();
                oo5.a(j66Var2);
                break;
        }
    }

    @Override // defpackage.m64
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.d = th;
                oo5.d(this, ((z2f) this.c).b(this));
                break;
            case 1:
                ((m64) this.b).onError(th);
                break;
            default:
                ((s8g) this.b).onError(th);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m64 m64Var = (m64) this.b;
                Throwable th = (Throwable) this.d;
                if (th == null) {
                    m64Var.b();
                } else {
                    this.d = null;
                    m64Var.onError(th);
                }
                break;
            case 1:
                ((h64) this.d).a(this);
                break;
            default:
                ((v7g) this.d).h(this);
                break;
        }
    }

    public l64(s8g s8gVar, v7g v7gVar) {
        this.a = 2;
        this.b = s8gVar;
        this.d = v7gVar;
        this.c = new j66(2);
    }

    public l64(m64 m64Var, z2f z2fVar) {
        this.a = 0;
        this.b = m64Var;
        this.c = z2fVar;
    }
}
