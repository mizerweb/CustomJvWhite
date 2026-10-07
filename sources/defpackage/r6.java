package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class r6 extends mdh implements qf7 {
    public /* synthetic */ Object e;
    public final /* synthetic */ AtomicBoolean f;
    public final /* synthetic */ AccountInitializer g;
    public final /* synthetic */ Handler h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(AtomicBoolean atomicBoolean, AccountInitializer accountInitializer, Handler handler, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = atomicBoolean;
        this.g = accountInitializer;
        this.h = handler;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        r6 r6Var = new r6(this.f, this.g, this.h, lq4Var);
        r6Var.e = obj;
        return r6Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        r6 r6Var = (r6) create((wn) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        r6Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        sbi sbiVar = sbi.a;
        wn wnVar = (wn) this.e;
        ch3.d0(obj);
        if (this.f.get()) {
            u9c u9cVar = (u9c) qt4.i(this.g, 92);
            u9cVar.h.B(u9cVar, u9c.l[3], Boolean.TRUE);
            h6f h6fVarH = oxl.h();
            wnVar.initCause(h6fVarH.l());
            gm0.V("ANR", "detect " + wnVar, wnVar);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "ANR-ThreadDump", h6fVarH.toString(), null);
                }
            }
            this.g.d().c().a(null, wnVar);
            int i = 1;
            if (this.f.compareAndSet(true, false)) {
                this.h.postAtFrontOfQueue(new c3(i, this.f));
            }
        }
        return sbiVar;
    }
}
