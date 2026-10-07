package defpackage;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public final class eck {
    public final Clock a;
    public final int b;
    public final fck c;
    public final y5k d;
    public final ybk[] e;
    public final hak f;
    public final ku8 g;
    public final ScheduledExecutorService h;
    public final int i;
    public int j;
    public ScheduledFuture k;
    public final Object l;
    public volatile int m;
    public volatile Instant n;
    public volatile int o;
    public volatile boolean p;

    public eck(int i, fck fckVar, y5k y5kVar, hak hakVar, ku8 ku8Var) {
        Clock clockSystemUTC = Clock.systemUTC();
        this.e = new ybk[y4k.values().length];
        this.l = new Object();
        int i2 = 1;
        this.o = 1;
        this.p = false;
        this.a = clockSystemUTC;
        this.b = i;
        this.c = fckVar;
        y5k y5kVar2 = y5kVar;
        this.d = y5kVar2;
        y4k[] y4kVarArrValues = y4k.values();
        int length = y4kVarArrValues.length;
        int i3 = 0;
        while (i3 < length) {
            this.e[y4kVarArrValues[i3].ordinal()] = new ybk(clockSystemUTC, this, fckVar, y5kVar2, new gak(hakVar, i2), new lu8());
            i3++;
            y5kVar2 = y5kVar;
        }
        this.f = hakVar;
        this.g = ku8Var;
        this.h = Executors.newScheduledThreadPool(1, new aid("loss-detection", 1));
        synchronized (this.l) {
            this.k = new dck();
        }
        String property = System.getProperty("tech.kwik.core.probe-type");
        if (property != null) {
            String lowerCase = property.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals("double")) {
                i2 = 3;
            } else if (lowerCase.equals("single")) {
                i2 = 2;
            }
        }
        this.i = i2;
    }

    public static void d(Runnable runnable, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            runnable.run();
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public final cmf a(Function function) {
        cmf cmfVar = null;
        boolean z = false;
        for (y4k y4kVar : y4k.values()) {
            Instant instant = (Instant) function.apply(this.e[y4kVar.ordinal()]);
            if (instant != null) {
                int i = 13;
                if (cmfVar == null) {
                    cmfVar = new cmf(y4kVar, instant, z, i);
                } else if (!((Instant) cmfVar.c).isBefore(instant)) {
                    cmfVar = new cmf(y4kVar, instant, z, i);
                }
            }
        }
        return cmfVar;
    }

    public final void b(int i) {
        if (this.p) {
            return;
        }
        int i2 = this.o;
        this.o = i;
        if (i != 5 || i2 == 5) {
            return;
        }
        g();
    }

    public final void c(final y4k y4kVar, int i) {
        final int i2 = 0;
        int i3 = this.i;
        int i4 = 2;
        if (i3 == 2) {
            d(new Runnable(this) { // from class: bck
                public final /* synthetic */ eck b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = i2;
                    y4k y4kVar2 = y4kVar;
                    eck eckVar = this.b;
                    switch (i5) {
                        case 0:
                            hak hakVar = eckVar.f;
                            Object[] objArr = {new n8k()};
                            ArrayList arrayList = new ArrayList(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            arrayList.add(obj);
                            hakVar.e(Collections.unmodifiableList(arrayList), y4kVar2.a());
                            break;
                        default:
                            hak hakVar2 = eckVar.f;
                            Object[] objArr2 = {new n8k(), new n8k()};
                            ArrayList arrayList2 = new ArrayList(2);
                            for (int i6 = 0; i6 < 2; i6++) {
                                Object obj2 = objArr2[i6];
                                Objects.requireNonNull(obj2);
                                arrayList2.add(obj2);
                            }
                            hakVar2.e(Collections.unmodifiableList(arrayList2), y4kVar2.a());
                            break;
                    }
                }
            }, i);
            return;
        }
        final int i5 = 1;
        if (i3 == 3) {
            d(new Runnable(this) { // from class: bck
                public final /* synthetic */ eck b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = i5;
                    y4k y4kVar2 = y4kVar;
                    eck eckVar = this.b;
                    switch (i6) {
                        case 0:
                            hak hakVar = eckVar.f;
                            Object[] objArr = {new n8k()};
                            ArrayList arrayList = new ArrayList(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            arrayList.add(obj);
                            hakVar.e(Collections.unmodifiableList(arrayList), y4kVar2.a());
                            break;
                        default:
                            hak hakVar2 = eckVar.f;
                            Object[] objArr2 = {new n8k(), new n8k()};
                            ArrayList arrayList2 = new ArrayList(2);
                            for (int i7 = 0; i7 < 2; i7++) {
                                Object obj2 = objArr2[i7];
                                Objects.requireNonNull(obj2);
                                arrayList2.add(obj2);
                            }
                            hakVar2.e(Collections.unmodifiableList(arrayList2), y4kVar2.a());
                            break;
                    }
                }
            }, i);
            return;
        }
        y4k y4kVar2 = y4k.a;
        if (y4kVar == y4kVar2) {
            final List listH = h(y4kVar2);
            if (listH.isEmpty()) {
                d(new ack(this, i5), i);
                return;
            } else {
                d(new Runnable(this) { // from class: cck
                    public final /* synthetic */ eck b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i2;
                        List list = listH;
                        eck eckVar = this.b;
                        switch (i6) {
                            case 0:
                                eckVar.f.e(list, w4k.a);
                                break;
                            default:
                                eckVar.f.e(list, w4k.c);
                                break;
                        }
                    }
                }, i);
                return;
            }
        }
        y4k y4kVar3 = y4k.b;
        if (y4kVar == y4kVar3) {
            final List listH2 = h(y4kVar3);
            if (listH2.isEmpty()) {
                d(new ack(this, i4), i);
                return;
            } else {
                d(new Runnable(this) { // from class: cck
                    public final /* synthetic */ eck b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i5;
                        List list = listH2;
                        eck eckVar = this.b;
                        switch (i6) {
                            case 0:
                                eckVar.f.e(list, w4k.a);
                                break;
                            default:
                                eckVar.f.e(list, w4k.c);
                                break;
                        }
                    }
                }, i);
                return;
            }
        }
        w4k w4kVarA = y4kVar.a();
        List listH3 = h(y4kVar);
        if (listH3.isEmpty()) {
            Objects.toString(w4kVarA);
            d(new v1k(this, 5, w4kVarA), i);
        } else {
            Objects.toString(w4kVarA);
            d(new alg(this, listH3, w4kVarA, 10), i);
        }
    }

    public final void e(Instant instant) {
        try {
            synchronized (this.l) {
                this.k.cancel(false);
                this.n = instant;
                this.k = this.h.schedule(new ack(this, 0), Duration.between(this.a.instant(), instant).toMillis(), TimeUnit.MILLISECONDS);
            }
        } catch (RejectedExecutionException e) {
            if (!this.p) {
                throw e;
            }
        }
    }

    public final void f(boolean z) {
        this.d.getClass();
        this.d.getClass();
        ku8 ku8Var = this.g;
        if (!z) {
            ku8Var.getClass();
            return;
        }
        ku8Var.getClass();
        this.c.getClass();
        this.c.getClass();
        int i = this.c.e;
    }

    public final void g() {
        cmf cmfVarA = a(new lbk(7));
        Instant instant = cmfVarA != null ? (Instant) cmfVarA.c : null;
        if (instant != null) {
            e(instant);
            return;
        }
        boolean zAnyMatch = Stream.of((Object[]) this.e).anyMatch(new lak(26));
        boolean zJ = j();
        if (!zAnyMatch && !zJ) {
            this.k.cancel(true);
            this.n = null;
            return;
        }
        cmf cmfVarI = i();
        if (cmfVarI != null) {
            e((Instant) cmfVarI.c);
        } else {
            this.k.cancel(true);
            this.n = null;
        }
    }

    public final List h(y4k y4kVar) {
        Optional optionalFindFirst = ((List) this.e[y4kVar.ordinal()].f.values().stream().filter(new lak(18)).filter(new lak(19)).map(new lbk(6)).collect(Collectors.toList())).stream().filter(new lak(27)).filter(new lak(23)).findFirst();
        return optionalFindFirst.isPresent() ? (List) ((pbk) optionalFindFirst.get()).c.stream().filter(new lak(24)).collect(Collectors.toList()) : Collections.EMPTY_LIST;
    }

    public final cmf i() {
        y4k y4kVar;
        fck fckVar = this.c;
        int i = fckVar.c == -1 ? fckVar.a : fckVar.c;
        fck fckVar2 = this.c;
        int iMax = (Integer.max(1, (fckVar2.d == -1 ? fckVar2.a / 4 : fckVar2.d) * 4) + i) * ((int) Math.pow(2.0d, this.m));
        int i2 = 13;
        boolean z = false;
        if (j()) {
            int iD = qt4.D(this.o);
            Clock clock = this.a;
            return iD < 1 ? new cmf(y4k.a, clock.instant().plusMillis(iMax), z, i2) : new cmf(y4k.b, clock.instant().plusMillis(iMax), z, i2);
        }
        Instant instantPlusMillis = Instant.MAX;
        y4k[] y4kVarArrValues = y4k.values();
        int length = y4kVarArrValues.length;
        int i3 = 0;
        y4k y4kVar2 = null;
        while (i3 < length) {
            y4k y4kVar3 = y4kVarArrValues[i3];
            if (this.e[y4kVar3.ordinal()].g.get() == 0 || (y4kVar3 == (y4kVar = y4k.c) && qt4.D(this.o) < 4)) {
                i3 = i3;
            } else {
                if (y4kVar3 == y4kVar) {
                    iMax += this.j * ((int) Math.pow(2.0d, this.m));
                }
                Instant instant = this.e[y4kVar3.ordinal()].j;
                if (instant != null) {
                    long j = iMax;
                    if (instant.plusMillis(j).isBefore(instantPlusMillis)) {
                        instantPlusMillis = instant.plusMillis(j);
                        y4kVar2 = y4kVar3;
                    }
                }
            }
            i3++;
        }
        if (y4kVar2 != null) {
            return new cmf(y4kVar2, instantPlusMillis, z, i2);
        }
        return null;
    }

    public final boolean j() {
        return this.b == 1 && qt4.D(this.o) < 4 && this.e[1].h < 0;
    }

    public final void k() {
        Instant instant = this.n;
        if (instant == null) {
            return;
        }
        if (!this.a.instant().isBefore(instant) || Duration.between(this.a.instant(), instant).toMillis() <= 0) {
            this.a.instant();
        } else {
            Instant instant2 = this.a.instant();
            Duration.between(this.a.instant(), instant).toMillis();
            Instant instant3 = this.n;
            Objects.toString(instant2);
            Objects.toString(instant3);
            e(this.n);
        }
        cmf cmfVarA = a(new lbk(7));
        if ((cmfVarA != null ? (Instant) cmfVarA.c : null) != null) {
            this.e[((y4k) cmfVarA.b).ordinal()].b();
            f(false);
            this.f.h();
            g();
            return;
        }
        this.m++;
        int i = this.m > 1 ? 2 : 1;
        if (Stream.of((Object[]) this.e).anyMatch(new lak(26))) {
            cmf cmfVarI = i();
            if (cmfVarI == null) {
                return;
            }
            c((y4k) cmfVarI.b, i);
            return;
        }
        if (j()) {
            if (qt4.D(this.o) < 1) {
                c(y4k.a, 1);
            } else {
                c(y4k.b, 1);
            }
        }
    }
}
