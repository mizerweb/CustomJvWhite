package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c8g implements r8g, jo5 {
    public final /* synthetic */ int a = 1;
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicReference c = new AtomicReference(null);
    public final Object d;
    public final Object e;

    public c8g(r8g r8gVar, d8g d8gVar) {
        this.d = r8gVar;
        this.e = d8gVar;
    }

    @Override // defpackage.r8g
    public final void a(Object obj) {
        int i = this.a;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ((r8g) this.d).a(obj);
                }
                break;
            default:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ((cf7) this.e).invoke(obj);
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.r8g
    public final void b(jo5 jo5Var) {
        jo5 jo5Var2;
        jo5 jo5Var3;
        int i = this.a;
        AtomicBoolean atomicBoolean = this.b;
        AtomicReference atomicReference = this.c;
        switch (i) {
            case 0:
                while (!atomicReference.compareAndSet(null, jo5Var) && atomicReference.get() == null) {
                }
                if (atomicBoolean.get() && (jo5Var2 = (jo5) atomicReference.getAndSet(null)) != null) {
                    jo5Var2.dispose();
                }
                ((r8g) this.d).b(this);
                break;
            default:
                while (!atomicReference.compareAndSet(null, jo5Var) && atomicReference.get() == null) {
                }
                if (atomicBoolean.get() && (jo5Var3 = (jo5) atomicReference.getAndSet(null)) != null) {
                    jo5Var3.dispose();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jo5
    public final void dispose() {
        Object poeVar;
        jo5 jo5Var;
        int i = this.a;
        AtomicReference atomicReference = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        ((kr0) ((d8g) this.e).c).invoke();
                        poeVar = sbi.a;
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    r8g r8gVar = (r8g) this.d;
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        jo5 jo5Var2 = (jo5) atomicReference.getAndSet(null);
                        if (jo5Var2 != null) {
                            jo5Var2.dispose();
                        }
                        r8gVar.onError(thA);
                    }
                    if (!(poeVar instanceof poe)) {
                        jo5 jo5Var3 = (jo5) atomicReference.getAndSet(null);
                        if (jo5Var3 != null) {
                            jo5Var3.dispose();
                        }
                    }
                }
                break;
            default:
                if (atomicBoolean.compareAndSet(false, true) && (jo5Var = (jo5) atomicReference.getAndSet(null)) != null) {
                    jo5Var.dispose();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.r8g
    public final void onError(Throwable th) {
        int i = this.a;
        Object obj = this.d;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ((r8g) obj).onError(th);
                }
                break;
            default:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ((cf7) obj).invoke(th);
                }
                break;
        }
    }

    public c8g(cf7 cf7Var, cf7 cf7Var2) {
        this.d = cf7Var;
        this.e = cf7Var2;
    }
}
