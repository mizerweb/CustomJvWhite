package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class hqb extends AtomicReference implements Runnable, ko5, s8g {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Serializable e;

    public hqb(s8g s8gVar) {
        this.a = 1;
        this.c = s8gVar;
        this.b = 60L;
        this.e = TimeUnit.SECONDS;
        this.d = new AtomicReference();
    }

    @Override // defpackage.s8g
    public void a(Object obj) {
        ko5 ko5Var = (ko5) get();
        oo5 oo5Var = oo5.a;
        if (ko5Var == oo5Var || !compareAndSet(ko5Var, oo5Var)) {
            return;
        }
        oo5.a((AtomicReference) this.d);
        ((s8g) this.c).a(obj);
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        oo5.e(this, ko5Var);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        switch (this.a) {
            case 0:
                oo5.a(this);
                break;
            default:
                oo5.a(this);
                oo5.a((AtomicReference) this.d);
                break;
        }
    }

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        ko5 ko5Var = (ko5) get();
        oo5 oo5Var = oo5.a;
        if (ko5Var == oo5Var || !compareAndSet(ko5Var, oo5Var)) {
            tre.s0(th);
        } else {
            oo5.a((AtomicReference) this.d);
            ((s8g) this.c).onError(th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    iqb iqbVar = (iqb) this.d;
                    long j = this.b;
                    Object obj = this.c;
                    if (j == iqbVar.e) {
                        iqbVar.a.d(obj);
                        oo5.a(this);
                    }
                }
                break;
            default:
                ko5 ko5Var = (ko5) get();
                oo5 oo5Var = oo5.a;
                if (ko5Var != oo5Var && compareAndSet(ko5Var, oo5Var)) {
                    if (ko5Var != null) {
                        ko5Var.dispose();
                    }
                    s8g s8gVar = (s8g) this.c;
                    long j2 = this.b;
                    TimeUnit timeUnit = (TimeUnit) this.e;
                    fd6 fd6Var = gd6.a;
                    StringBuilder sbS = qt4.s(j2, "The source did not signal an event for ", " ");
                    sbS.append(timeUnit.toString().toLowerCase());
                    sbS.append(" and has been terminated.");
                    s8gVar.onError(new TimeoutException(sbS.toString()));
                    break;
                }
                break;
        }
    }

    public hqb(Object obj, long j, iqb iqbVar) {
        this.a = 0;
        this.e = new AtomicBoolean();
        this.c = obj;
        this.b = j;
        this.d = iqbVar;
    }
}
