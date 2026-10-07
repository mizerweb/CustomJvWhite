package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class kp9 extends AtomicReference implements mp9, ko5, Runnable, s8g {
    public final /* synthetic */ int a;
    public final z2f b;
    public Object c;
    public Throwable d;
    public final Object e;

    public /* synthetic */ kp9(Object obj, z2f z2fVar, int i) {
        this.a = i;
        this.e = obj;
        this.b = z2fVar;
    }

    @Override // defpackage.mp9
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c = obj;
                oo5.d(this, this.b.b(this));
                break;
            default:
                this.c = obj;
                oo5.d(this, this.b.b(this));
                break;
        }
    }

    @Override // defpackage.mp9
    public void b() {
        oo5.d(this, this.b.b(this));
    }

    @Override // defpackage.mp9
    public final void c(ko5 ko5Var) {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (oo5.e(this, ko5Var)) {
                    ((mp9) obj).c(this);
                }
                break;
            default:
                if (oo5.e(this, ko5Var)) {
                    ((s8g) obj).c(this);
                }
                break;
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        switch (this.a) {
            case 0:
                oo5.a(this);
                break;
            default:
                oo5.a(this);
                break;
        }
    }

    @Override // defpackage.mp9
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.d = th;
                oo5.d(this, this.b.b(this));
                break;
            default:
                this.d = th;
                oo5.d(this, this.b.b(this));
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                mp9 mp9Var = (mp9) obj;
                Throwable th = this.d;
                if (th == null) {
                    Object obj2 = this.c;
                    if (obj2 == null) {
                        mp9Var.b();
                    } else {
                        this.c = null;
                        mp9Var.a(obj2);
                    }
                } else {
                    this.d = null;
                    mp9Var.onError(th);
                }
                break;
            default:
                Throwable th2 = this.d;
                s8g s8gVar = (s8g) obj;
                if (th2 == null) {
                    s8gVar.a(this.c);
                } else {
                    s8gVar.onError(th2);
                }
                break;
        }
    }
}
