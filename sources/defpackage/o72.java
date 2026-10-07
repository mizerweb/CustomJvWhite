package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o72 extends AtomicReference implements m64, ko5, rg4, s8g, mp9, rrb {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public o72(rrb rrbVar) {
        this.a = 3;
        this.b = rrbVar;
        this.c = new AtomicReference();
    }

    @Override // defpackage.s8g
    public void a(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 1:
                lazySet(oo5.a);
                try {
                    ((rg4) obj3).accept(obj);
                } catch (Throwable th) {
                    iwl.a(th);
                    tre.s0(th);
                    return;
                }
                break;
            case 2:
                ((mp9) obj2).a(obj);
                break;
            case 3:
            default:
                ((s8g) obj3).a(obj);
                break;
            case 4:
                s8g s8gVar = (s8g) obj3;
                try {
                    z9g z9gVar = (z9g) ((rj5) obj2).mo41apply(obj);
                    if (!e()) {
                        ((v7g) z9gVar).h(new h6f(this, 2, s8gVar));
                    }
                } catch (Throwable th2) {
                    iwl.a(th2);
                    s8gVar.onError(th2);
                    return;
                }
                break;
            case 5:
                try {
                    Object objMo41apply = ((sf7) obj2).mo41apply(obj);
                    Objects.requireNonNull(objMo41apply, "The mapper returned a null CompletableSource");
                    n64 n64Var = (n64) objMo41apply;
                    if (!e()) {
                        ((h64) n64Var).a(this);
                    }
                } catch (Throwable th3) {
                    iwl.a(th3);
                    onError(th3);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        tre.s0(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // defpackage.m64
    public void b() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                try {
                    ((v7) obj).run();
                } catch (Throwable th) {
                    iwl.a(th);
                    tre.s0(th);
                }
                lazySet(oo5.a);
                break;
            case 1:
            default:
                ((m64) obj2).b();
                break;
            case 2:
                ((mp9) obj).b();
                break;
            case 3:
                ((rrb) obj2).b();
                break;
        }
    }

    @Override // defpackage.m64
    public final void c(ko5 ko5Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                oo5.e(this, ko5Var);
                break;
            case 1:
                oo5.e(this, ko5Var);
                break;
            case 2:
                oo5.e(this, ko5Var);
                break;
            case 3:
                oo5.e((AtomicReference) this.c, ko5Var);
                break;
            case 4:
                if (oo5.e(this, ko5Var)) {
                    ((s8g) obj).c(this);
                }
                break;
            case 5:
                oo5.d(this, ko5Var);
                break;
            default:
                if (oo5.e(this, ko5Var)) {
                    ((s8g) obj).c(this);
                }
                break;
        }
    }

    @Override // defpackage.rrb
    public void d(Object obj) {
        ((rrb) this.b).d(obj);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        switch (this.a) {
            case 0:
                oo5.a(this);
                break;
            case 1:
                oo5.a(this);
                break;
            case 2:
                oo5.a(this);
                j66 j66Var = (j66) this.b;
                j66Var.getClass();
                oo5.a(j66Var);
                break;
            case 3:
                oo5.a((AtomicReference) this.c);
                oo5.a(this);
                break;
            case 4:
                oo5.a(this);
                break;
            case 5:
                oo5.a(this);
                break;
            default:
                oo5.a(this);
                break;
        }
    }

    public boolean e() {
        switch (this.a) {
            case 4:
                break;
        }
        return oo5.b((ko5) get());
    }

    @Override // defpackage.m64
    public final void onError(Throwable th) {
        int i = this.a;
        oo5 oo5Var = oo5.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                try {
                    ((rg4) obj2).accept(th);
                } catch (Throwable th2) {
                    iwl.a(th2);
                    tre.s0(th2);
                }
                lazySet(oo5Var);
                break;
            case 1:
                lazySet(oo5Var);
                try {
                    ((rg4) obj).accept(th);
                } catch (Throwable th3) {
                    iwl.a(th3);
                    tre.s0(new CompositeException(th, th3));
                    return;
                }
                break;
            case 2:
                ((mp9) obj).onError(th);
                break;
            case 3:
                ((rrb) obj2).onError(th);
                break;
            case 4:
                ((s8g) obj2).onError(th);
                break;
            case 5:
                ((m64) obj2).onError(th);
                break;
            default:
                s8g s8gVar = (s8g) obj2;
                try {
                    ((v7g) ((z9g) ((due) obj).mo41apply((Object) th))).h(new uvc(this, 29, s8gVar));
                } catch (Throwable th4) {
                    iwl.a(th4);
                    s8gVar.onError(new CompositeException(th, th4));
                }
                break;
        }
    }

    public /* synthetic */ o72(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public o72(mp9 mp9Var) {
        this.a = 2;
        this.c = mp9Var;
        this.b = new j66(2);
    }
}
