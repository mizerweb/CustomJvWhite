package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class np9 implements mp9, ko5, rrb {
    public final /* synthetic */ int a;
    public ko5 b;
    public final Object c;
    public final Object d;

    public /* synthetic */ np9(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.mp9
    public void a(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        oo5 oo5Var = oo5.a;
        switch (i) {
            case 0:
                if (this.b != oo5Var) {
                    this.b = oo5Var;
                    ((mp9) obj2).a(obj);
                    break;
                }
                break;
            default:
                this.b = oo5Var;
                ((s8g) obj2).a(obj);
                break;
        }
    }

    @Override // defpackage.mp9
    public final void b() {
        int i = this.a;
        Object obj = this.d;
        oo5 oo5Var = oo5.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                if (this.b != oo5Var) {
                    try {
                        ((ot4) ((lp9) obj).c).run();
                        this.b = oo5Var;
                        ((mp9) obj2).b();
                    } catch (Throwable th) {
                        iwl.a(th);
                        e(th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                this.b = oo5Var;
                s8g s8gVar = (s8g) obj2;
                if (obj == null) {
                    s8gVar.onError(new NoSuchElementException("The MaybeSource is empty"));
                } else {
                    s8gVar.a(obj);
                }
                break;
            default:
                ((rrb) obj2).b();
                break;
        }
    }

    @Override // defpackage.mp9
    public final void c(ko5 ko5Var) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                mp9 mp9Var = (mp9) obj;
                if (oo5.f(this.b, ko5Var)) {
                    this.b = ko5Var;
                    mp9Var.c(this);
                }
                break;
            case 1:
                if (oo5.f(this.b, ko5Var)) {
                    this.b = ko5Var;
                    ((s8g) obj).c(this);
                }
                break;
            default:
                if (oo5.f(this.b, ko5Var)) {
                    this.b = ko5Var;
                    ((rrb) obj).c(this);
                }
                break;
        }
    }

    @Override // defpackage.rrb
    public void d(Object obj) {
        ((rrb) this.c).d(obj);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        int i = this.a;
        oo5 oo5Var = oo5.a;
        switch (i) {
            case 0:
                this.b.dispose();
                this.b = oo5Var;
                break;
            case 1:
                this.b.dispose();
                this.b = oo5Var;
                break;
            default:
                this.b.dispose();
                break;
        }
    }

    public void e(Throwable th) {
        this.b = oo5.a;
        ((mp9) this.c).onError(th);
    }

    @Override // defpackage.mp9
    public final void onError(Throwable th) {
        int i = this.a;
        oo5 oo5Var = oo5.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b != oo5Var) {
                    e(th);
                } else {
                    tre.s0(th);
                }
                break;
            case 1:
                this.b = oo5Var;
                ((s8g) obj).onError(th);
                break;
            default:
                rrb rrbVar = (rrb) obj;
                try {
                    Object obj2 = ((gg7) this.d).a;
                    if (obj2 != null) {
                        rrbVar.d(obj2);
                        rrbVar.b();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th);
                        rrbVar.onError(nullPointerException);
                    }
                } catch (Throwable th2) {
                    iwl.a(th2);
                    rrbVar.onError(new CompositeException(th, th2));
                }
                break;
        }
    }
}
