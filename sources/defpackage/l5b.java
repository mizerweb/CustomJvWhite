package defpackage;

import java.io.Serializable;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public class l5b {
    public boolean a;
    public int b;
    public final Object c;
    public final Serializable d;
    public final Object e;
    public final Object f;
    public Serializable g;
    public Object h;

    public l5b(y4k y4kVar, hak hakVar) {
        Clock clockSystemUTC = Clock.systemUTC();
        this.f = new ArrayList();
        this.h = new HashMap();
        this.b = 0;
        this.c = clockSystemUTC;
        this.d = y4kVar;
        this.e = hakVar;
    }

    public synchronized void a(e5k e5kVar) {
        long j;
        long j2;
        q8k q8kVar;
        try {
            Optional optionalFindFirst = e5kVar.d.stream().flatMap(new f05(20)).filter(new u6(22, this)).findFirst();
            if (optionalFindFirst.isPresent()) {
                e5k e5kVar2 = (e5k) ((HashMap) this.h).get(optionalFindFirst.get());
                ArrayList arrayList = (ArrayList) this.f;
                if (!arrayList.isEmpty()) {
                    ListIterator listIterator = arrayList.listIterator();
                    ListIterator listIterator2 = e5kVar2.d.listIterator();
                    q8k q8kVar2 = (q8k) listIterator.next();
                    loop0: while (listIterator2.hasNext()) {
                        q8k q8kVar3 = (q8k) listIterator2.next();
                        while (true) {
                            j = q8kVar2.a;
                            j2 = q8kVar3.b;
                            if (j > j2) {
                                if (!listIterator.hasNext()) {
                                    break loop0;
                                } else {
                                    q8kVar2 = (q8k) listIterator.next();
                                }
                            }
                        }
                        long j3 = q8kVar2.b;
                        long j4 = q8kVar3.a;
                        if (j3 >= j4) {
                            if (j4 <= j && j2 >= j3) {
                                listIterator.remove();
                            } else if (q8kVar2.b(q8kVar3)) {
                                continue;
                            } else {
                                if (q8kVar2.equals(q8kVar3)) {
                                    throw new IllegalArgumentException();
                                }
                                if (q8kVar2.b(q8kVar3)) {
                                    throw new IllegalArgumentException();
                                }
                                if (q8kVar3.b(q8kVar2)) {
                                    throw new IllegalArgumentException();
                                }
                                long j5 = q8kVar2.a;
                                long j6 = q8kVar3.b;
                                if (j5 <= j6) {
                                    long j7 = q8kVar2.b;
                                    long j8 = q8kVar3.a;
                                    if (j7 < j8) {
                                        q8kVar = q8kVar2;
                                    } else if (j5 < j8 && j7 == j6) {
                                        q8kVar = new q8k(j5, j8 - 1);
                                    } else if (j5 > j8 && j7 > j6) {
                                        q8kVar = new q8k(j6 + 1, j7);
                                    } else if (j5 == j8 && j7 > j6) {
                                        q8kVar = new q8k(j6 + 1, j7);
                                    } else {
                                        if (j5 >= j8 || j7 >= j6) {
                                            throw new IllegalStateException();
                                        }
                                        q8kVar = new q8k(j5, j8 - 1);
                                    }
                                } else {
                                    q8kVar = q8kVar2;
                                }
                                listIterator.set(q8kVar);
                            }
                        }
                    }
                }
                ((HashMap) this.h).keySet().removeIf(new u6(23, optionalFindFirst));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(e5k e5kVar, long j) {
        ((HashMap) this.h).put(Long.valueOf(j), e5kVar);
        this.a = false;
        this.g = null;
        this.b = 0;
    }

    public synchronized void c(pbk pbkVar) {
        try {
            if (pbkVar.r()) {
                q8k.a(pbkVar.p().longValue(), (ArrayList) this.f);
                if (pbkVar.s()) {
                    this.a = true;
                    if (((Instant) this.g) == null) {
                        this.g = ((Clock) this.c).instant();
                    }
                    y4k y4kVar = (y4k) this.d;
                    if (y4kVar != y4k.c) {
                        ((hak) this.e).b(y4kVar, 0);
                        return;
                    }
                    int i = this.b + 1;
                    this.b = i;
                    hak hakVar = (hak) this.e;
                    if (i >= 2) {
                        hakVar.b(y4kVar, 0);
                        this.b = 0;
                        return;
                    }
                    hakVar.b(y4kVar, 20);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean d() {
        return !((ArrayList) this.f).isEmpty();
    }

    public synchronized boolean e() {
        return this.a;
    }

    public synchronized Optional f() {
        int millis;
        try {
            Instant instant = (Instant) this.g;
            int i = 0;
            if (instant != null && ((y4k) this.d) == y4k.c && (millis = (int) Duration.between(instant, ((Clock) this.c).instant()).toMillis()) >= 0) {
                i = millis;
            }
            return !((ArrayList) this.f).isEmpty() ? Optional.of(new e5k(i, (ArrayList) this.f)) : Optional.empty();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void g() {
        this.a = false;
        this.b = 0;
        for (int i = 0; i < 2; i++) {
            ((int[]) this.c)[i] = -1;
        }
    }

    public void h() {
        uf5 uf5Var;
        if (this.a) {
            this.a = false;
            h6f h6fVar = (h6f) this.h;
            if (h6fVar == null || (uf5Var = (uf5) h6fVar.c) == null || uf5Var.e) {
                return;
            }
            uf5Var.l.set(uf5Var.m);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [float[], java.io.Serializable] */
    public l5b() {
        this.c = new int[2];
        this.d = new float[2];
        this.e = new float[2];
        this.f = new float[2];
        this.g = new float[2];
        this.h = null;
        g();
    }
}
