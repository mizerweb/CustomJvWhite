package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u3d {
    public static final /* synthetic */ zv8[] l;
    public final w7b a;
    public final ka0 b;
    public final ny8 d;
    public final dq4 e;
    public final r8e i;
    public final String c = u3d.class.getName();
    public final p3c f = qyj.S();
    public final AtomicInteger g = new AtomicInteger(0);
    public final mjg h = p90.a(null);
    public final b1k j = new b1k(23, this);
    public final AtomicReference k = new AtomicReference(null);

    static {
        z8b z8bVar = new z8b(u3d.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        l = new zv8[]{z8bVar};
    }

    public u3d(xhh xhhVar, ny8 ny8Var, w7b w7bVar, ka0 ka0Var) {
        this.a = w7bVar;
        this.b = ka0Var;
        this.d = ny8Var;
        this.e = cqk.a(((n0c) xhhVar).a());
        this.i = w7bVar.a.A;
    }

    public final void a() {
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(this.g.get(), "clear: current count -> "), null);
            }
        }
        if (this.g.getAndUpdate(new qkc(1)) != 1) {
            String str2 = this.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, "clear: still have subscribers, not clearing state", null);
                return;
            }
            return;
        }
        p3c p3cVar = this.f;
        zv8[] zv8VarArr = l;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        this.f.B(this, zv8VarArr[0], null);
        this.h.setValue(null);
        w7b w7bVar = this.a;
        b1k b1kVar = this.j;
        xte xteVar = w7bVar.a;
        synchronized (xteVar.i) {
            tte tteVar = (tte) xteVar.j.remove(b1kVar);
            if (tteVar != null) {
                xteVar.i.remove(tteVar);
            }
        }
    }

    public final void b() {
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(this.g.get(), "setup: current count -> "), null);
            }
        }
        if (this.g.getAndIncrement() == 0) {
            this.a.a(this.j);
            c();
        }
    }

    public final void c() {
        sgg sggVarI0 = yab.i0(this.e, null, 0, new xra(this, null, 9), 3);
        this.f.B(this, l[0], sggVarI0);
    }
}
