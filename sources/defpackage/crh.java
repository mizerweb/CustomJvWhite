package defpackage;

import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class crh implements dk5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final EnumMap e;
    public final dq4 f;
    public up8 g;
    public final a6f h;

    public crh(ny8 ny8Var) {
        AtomicLong atomicLong = ej5.b;
        this.a = atomicLong.incrementAndGet();
        this.b = atomicLong.incrementAndGet();
        this.c = atomicLong.incrementAndGet();
        this.d = atomicLong.incrementAndGet();
        this.e = new EnumMap(Thread.State.class);
        this.f = cqk.a(((n0c) ((xhh) ny8Var.getValue())).a());
        this.g = qyj.a(sbi.a);
        this.h = new a6f(this);
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.h;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        long j = e55Var.a;
        if (ej5.a(j, this.a) && !this.g.isActive()) {
            this.g = yab.i0(this.f, null, 0, new n83(2, null, 4), 3);
        } else if (ej5.a(j, this.d)) {
            o65.c(sj5.b.b(), ":settings/dev/threadsviewer", null, null, 6);
        }
    }
}
