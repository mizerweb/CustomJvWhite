package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class hth implements cn7 {
    public final vuf a;
    public dn7 d;
    public an7 e = new lu8();
    public bn7 f = new nv8(12);
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicBoolean c = new AtomicBoolean();

    public hth(vuf vufVar) {
        this.a = vufVar;
    }

    @Override // defpackage.cn7
    public final void a() {
        if (this.b.get() == 0) {
            this.f.q();
        } else {
            this.c.set(true);
        }
    }

    @Override // defpackage.cn7
    public final void b(wm7 wm7Var, dn7 dn7Var, long j) {
        this.d = dn7Var;
        vuf vufVar = this.a;
        gth gthVar = new gth(this);
        reg regVar = (reg) vufVar.b;
        synchronized (regVar.b) {
            try {
                int i = regVar.j.a;
                if (i == -1) {
                    regVar.e.b(j);
                    regVar.f.add(gthVar);
                } else {
                    gthVar.a(reg.a(i, j, regVar.c));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.incrementAndGet();
    }

    @Override // defpackage.cn7
    public final void c(dn7 dn7Var) {
        int i = dn7Var.a;
        dn7 dn7Var2 = this.d;
        dn7Var2.getClass();
        lvb.b0(i == dn7Var2.a);
        this.e.z(dn7Var);
        this.e.y();
    }

    @Override // defpackage.cn7
    public final void d(Executor executor, ef5 ef5Var) {
    }

    @Override // defpackage.cn7
    public final void e(euc eucVar) {
        this.f = eucVar;
    }

    @Override // defpackage.cn7
    public final void flush() {
        throw new UnsupportedOperationException("This effect is not supported for previewing.");
    }

    @Override // defpackage.cn7
    public final void g(an7 an7Var) {
        this.e = an7Var;
        if (this.d == null) {
            an7Var.y();
        }
    }

    @Override // defpackage.cn7
    public final void release() {
        this.d = null;
    }
}
