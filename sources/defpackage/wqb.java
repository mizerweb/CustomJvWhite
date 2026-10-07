package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class wqb extends AtomicInteger implements rrb, ko5 {
    public final /* synthetic */ int a;
    public final rrb b;
    public final AtomicInteger c;
    public final j40 d;
    public final AtomicReference e;
    public volatile boolean f;
    public final Object g;
    public final Object h;
    public Object i;

    public wqb(rrb rrbVar, pif pifVar, fqb fqbVar) {
        this.a = 1;
        this.b = rrbVar;
        this.g = pifVar;
        this.i = fqbVar;
        this.c = new AtomicInteger();
        this.d = new j40();
        this.h = new drb(this, 0);
        this.e = new AtomicReference();
    }

    public void a() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    @Override // defpackage.rrb
    public final void b() {
        switch (this.a) {
            case 0:
                this.c.decrementAndGet();
                a();
                break;
            default:
                oo5.a((drb) this.h);
                j0m.b(this.b, this, this.d);
                break;
        }
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        switch (this.a) {
            case 0:
                if (oo5.f((ko5) this.i, ko5Var)) {
                    this.i = ko5Var;
                    this.b.c(this);
                }
                break;
            default:
                oo5.d(this.e, ko5Var);
                break;
        }
    }

    @Override // defpackage.rrb
    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object objMo41apply = ((sf7) this.h).mo41apply(obj);
                    Objects.requireNonNull(objMo41apply, "The mapper returned a null SingleSource");
                    z9g z9gVar = (z9g) objMo41apply;
                    this.c.getAndIncrement();
                    b8g b8gVar = new b8g(this);
                    if (!this.f && ((w74) this.g).a(b8gVar)) {
                        ((v7g) z9gVar).h(b8gVar);
                        break;
                    }
                } catch (Throwable th) {
                    iwl.a(th);
                    ((ko5) this.i).dispose();
                    onError(th);
                    return;
                }
                break;
            default:
                j0m.c(this.b, obj, this, this.d);
                break;
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.f = true;
                ((ko5) this.i).dispose();
                ((w74) this.g).dispose();
                Throwable thA = this.d.a();
                if (thA != null && thA != gd6.a) {
                    tre.s0(thA);
                    break;
                }
                break;
            default:
                oo5.a(this.e);
                oo5.a((drb) this.h);
                break;
        }
    }

    public void e() {
        rrb rrbVar = this.b;
        AtomicInteger atomicInteger = this.c;
        AtomicReference atomicReference = this.e;
        int iAddAndGet = 1;
        while (!this.f) {
            if (((Throwable) this.d.get()) != null) {
                nfg nfgVar = (nfg) this.e.get();
                if (nfgVar != null) {
                    nfgVar.clear();
                }
                this.d.c(rrbVar);
                return;
            }
            boolean z = atomicInteger.get() == 0;
            nfg nfgVar2 = (nfg) atomicReference.get();
            Object objPoll = nfgVar2 != null ? nfgVar2.poll() : null;
            boolean z2 = objPoll == null;
            if (z && z2) {
                this.d.c(this.b);
                return;
            } else if (z2) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                rrbVar.d(objPoll);
            }
        }
        nfg nfgVar3 = (nfg) this.e.get();
        if (nfgVar3 != null) {
            nfgVar3.clear();
        }
    }

    public void f() {
        if (this.c.getAndIncrement() == 0) {
            while (!oo5.b((ko5) this.e.get())) {
                if (!this.f) {
                    this.f = true;
                    ((fqb) this.i).f(this);
                }
                if (this.c.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.c.decrementAndGet();
                if (this.d.b(th)) {
                    ((w74) this.g).dispose();
                    a();
                }
                break;
            default:
                oo5.d(this.e, null);
                this.f = false;
                ((pif) this.g).d(th);
                break;
        }
    }

    public wqb(rrb rrbVar, sf7 sf7Var) {
        this.a = 0;
        this.b = rrbVar;
        this.h = sf7Var;
        this.g = new w74();
        this.d = new j40();
        this.c = new AtomicInteger(1);
        this.e = new AtomicReference();
    }
}
