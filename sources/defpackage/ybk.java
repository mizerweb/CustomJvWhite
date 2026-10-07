package defpackage;

import java.time.Clock;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
public final class ybk {
    public final Clock a;
    public final eck b;
    public final fck c;
    public final y5k d;
    public final gak e;
    public volatile Instant i;
    public volatile Instant j;
    public volatile boolean k;
    public volatile long h = -1;
    public final AtomicInteger g = new AtomicInteger();
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public ybk(Clock clock, eck eckVar, fck fckVar, y5k y5kVar, gak gakVar, lu8 lu8Var) {
        this.a = clock;
        this.b = eckVar;
        this.c = fckVar;
        this.d = y5kVar;
        this.e = gakVar;
    }

    public final synchronized void a() {
        this.d.b((List) this.f.values().stream().filter(new lak(20)).filter(new lak(21)).collect(Collectors.toList()));
        this.g.set(0);
        this.f.clear();
        this.i = null;
        this.j = null;
        this.k = true;
    }

    public final void b() {
        if (this.k) {
            return;
        }
        fck fckVar = this.c;
        long jMax = (int) (Integer.max(fckVar.c == -1 ? fckVar.a : fckVar.c, this.c.e) * 1.125f);
        Instant instantMinusMillis = Instant.now(this.a).minusMillis(jMax);
        List list = (List) this.f.values().stream().filter(new lak(12)).filter(new baf(this, 1, instantMinusMillis)).filter(new lak(13)).collect(Collectors.toList());
        if (!list.isEmpty()) {
            List list2 = (List) list.stream().filter(new lak(7)).collect(Collectors.toList());
            this.g.getAndAdd(((int) list2.stream().filter(new lak(14)).count()) * (-1));
            list2.stream().forEach(new t81(8, this));
            this.e.run();
            y5k y5kVar = this.d;
            List list3 = (List) list2.stream().filter(new lak(17)).collect(Collectors.toList());
            synchronized (y5kVar) {
                long jSum = list3.stream().map(new f05(25)).mapToInt(new ao8(10)).sum();
                y5kVar.a -= jSum;
                y5kVar.c.h();
                if (jSum > 0) {
                    y5kVar.c();
                    list3.size();
                }
            }
            if (!list3.isEmpty() && ((zbk) list3.stream().max(new ps0(29)).get()).a.isAfter(y5kVar.e)) {
                y5kVar.e = Instant.now();
                y5kVar.b /= 2;
                if (y5kVar.b < 2400) {
                    y5kVar.b = 2400L;
                }
                y5kVar.d = y5kVar.b;
            }
            list2.stream().forEach(new xbk(this, 1));
        }
        Optional optionalMin = this.f.values().stream().filter(new lak(15)).filter(new wbk(this, 1)).filter(new lak(16)).map(new lbk(5)).min(new hbk(2));
        this.i = (optionalMin.isPresent() && ((Instant) optionalMin.get()).isAfter(instantMinusMillis)) ? ((Instant) optionalMin.get()).plusMillis(jMax) : null;
    }
}
