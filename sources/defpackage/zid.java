package defpackage;

import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zid {
    public final String a = zid.class.getName();
    public final yid b = yid.INSTANCE.b(so2.d);
    public final AtomicIntegerArray c = new AtomicIntegerArray(64);

    public final void a(long j) {
        int i;
        int i2;
        je9 je9Var = je9.d;
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        do {
            i = this.c.get(iNumberOfTrailingZeros);
            if (i <= 0) {
                String str = this.a;
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    return;
                }
                je9 je9Var2 = je9.f;
                if (a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str, "Finishing non started process!", null);
                    return;
                }
                return;
            }
            i2 = i - 1;
        } while (!this.c.compareAndSet(iNumberOfTrailingZeros, i, i2));
        this.b.i(sid.INSTANCE.a(j));
        String str2 = this.a;
        if (i2 == 0) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, c0a.o("Finishing process->", tid.b(j), " (last)"), null);
                return;
            }
            return;
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str2, c0a.l(i2, "Finishing process->", tid.b(j), " (count=", ")"), null);
        }
    }

    public final long b() {
        long j = 0;
        for (int i = 0; i < 64; i++) {
            if (this.c.get(i) > 0) {
                j |= 1 << i;
            }
        }
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Current processes->".concat(tid.b(j)), null);
            }
        }
        return j;
    }

    public final yid c() {
        return this.b;
    }

    public final void d(long j) {
        je9 je9Var = je9.d;
        int andIncrement = this.c.getAndIncrement(Long.numberOfTrailingZeros(j));
        this.b.m(sid.INSTANCE.a(j));
        String str = this.a;
        if (andIncrement == 0) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.o("Starting process->", tid.b(j), " (first)"), null);
                return;
            }
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str, c0a.l(andIncrement + 1, "Starting process->", tid.b(j), " (count=", ")"), null);
        }
    }
}
