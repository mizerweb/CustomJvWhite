package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class wu3 extends qrc {
    public volatile String g;
    public final p3c h;

    public wu3(erc ercVar) {
        super(ercVar);
        this.h = new p3c(1L);
    }

    public abstract void A();

    public abstract String B(p1f p1fVar);

    public final void C(Long l, p1f p1fVar) {
        je9 je9Var = je9.d;
        if (((AtomicLong) this.h.b).compareAndSet(1L, 2L)) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Started collected '" + r() + "', reason=COLD_START, sliceTime=" + l, null);
            }
            if (l != null) {
                this.g = qrc.x(this, null, null, l, null, 11);
                return;
            } else {
                ore.p("Required value was null.");
                return;
            }
        }
        p3c p3cVar = this.h;
        p3cVar.getClass();
        if ((2 & ((AtomicLong) p3cVar.b).get()) != 0) {
            String str2 = this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, c0a.o("Skip starting '", r(), "', already collecting COLD_START"), null);
            }
            A();
            return;
        }
        String str3 = this.g;
        String str4 = this.b;
        if (str3 != null) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str4, c0a.o("Skip starting '", r(), "' in reason=WARM_START, already collecting in this way"), null);
                return;
            }
            return;
        }
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            a4cVar4.c(je9Var, str4, c0a.o("Started collected '", r(), "', reason=WARM_START"), null);
        }
        this.g = B(p1fVar);
    }

    @Override // defpackage.zqc
    public final void c(pxa pxaVar, int i) {
        ((AtomicLong) this.h.b).set(0L);
        this.g = null;
        z(i);
    }

    public void z(int i) {
    }
}
