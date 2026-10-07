package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class bxb implements dk5 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final mjg i;

    public bxb(h5 h5Var) {
        this.a = h5Var.d(7);
        this.b = h5Var.d(74);
        this.c = h5Var.d(85);
        this.d = h5Var.d(84);
        AtomicLong atomicLong = ej5.b;
        this.e = atomicLong.incrementAndGet();
        this.f = atomicLong.incrementAndGet();
        this.g = atomicLong.incrementAndGet();
        this.h = atomicLong.incrementAndGet();
        this.i = p90.a(d());
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.i;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        long j = e55Var.a;
        lq4 lq4Var = null;
        if (ej5.a(j, this.e)) {
            String strH = ((hgh) this.b.getValue()).h(false);
            it3.a((Context) this.a.getValue(), strH);
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "PushToken", c0a.o("Current pushToken: \"", strH, "\""), null);
                return;
            }
            return;
        }
        if (ej5.a(j, this.f)) {
            try {
                yab.i0(yn7.a, null, 0, new ur8(this, lq4Var, 15), 3);
                return;
            } catch (Throwable th) {
                gm0.V("PushToken", "Refresh current token failed", th);
                return;
            }
        }
        if (ej5.a(j, this.g)) {
            xb9 xb9Var = (xb9) e();
            xb9Var.v0.B(xb9Var, xb9.g1[12], Boolean.valueOf(!((xb9) e()).f0()));
            this.i.setValue(d());
            return;
        }
        if (ej5.a(j, this.h)) {
            xb9 xb9Var2 = (xb9) e();
            xb9Var2.q0.B(xb9Var2, xb9.g1[5], Boolean.valueOf(!((xb9) e()).Z()));
            this.i.setValue(d());
        }
    }

    public final c79 d() {
        c79 c79Var = new c79(4);
        xnh xnhVar = new xnh("Скопировать Push token");
        String strH = ((hgh) this.b.getValue()).h(false);
        c79Var.add(new e55(this.e, xnhVar, 0, new xnh(strH != null ? "...".concat(r5h.v1(10, strH)) : "null"), null, 20));
        c79Var.add(new e55(this.f, new xnh("Обновить Push token"), 0, new xnh(((oqg) this.d.getValue()).b()), null, 20));
        c79Var.add(new e55(this.g, new xnh("Показывать пуши из сокета"), 0, null, new d55(!((xb9) e()).f0()), 12));
        c79Var.add(new e55(this.h, new xnh("Использовать ssl"), 0, null, new d55(((xb9) e()).Z()), 12));
        return yab.j(c79Var);
    }

    public final et3 e() {
        return (et3) this.c.getValue();
    }
}
