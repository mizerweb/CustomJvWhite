package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class p2h {
    public final aj5 a;
    public volatile Long c;
    public volatile long d;
    public volatile long e;
    public final l9b b = new l9b();
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);

    public p2h(aj5 aj5Var) {
        this.a = aj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, nq4 nq4Var) {
        m2h m2hVar;
        Long l;
        long j2;
        u8b u8bVar;
        kwg kwgVar;
        Long l2;
        l9b l9bVar;
        Long l3;
        if (nq4Var instanceof m2h) {
            m2hVar = (m2h) nq4Var;
            int i = m2hVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2hVar.j = i - Integer.MIN_VALUE;
            } else {
                m2hVar = new m2h(this, nq4Var);
            }
        } else {
            m2hVar = new m2h(this, nq4Var);
        }
        m2h m2hVar2 = m2hVar;
        Object obj = m2hVar2.h;
        hu4 hu4Var = hu4.a;
        int i2 = m2hVar2.j;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                Long l4 = this.c;
                if (l4 != null) {
                    aj5 aj5Var = this.a;
                    long jLongValue = l4.longValue();
                    m2hVar2.e = l4;
                    m2hVar2.d = j;
                    m2hVar2.j = 1;
                    Object objJ = aj5Var.j(jLongValue, true, j, m2hVar2);
                    if (objJ != hu4Var) {
                        l = l4;
                        obj = objJ;
                        j2 = j;
                    }
                    return hu4Var;
                }
                u8bVar = cqb.b;
                this.g.set(false);
                return u8bVar;
            }
            if (i2 == 1) {
                j2 = m2hVar2.d;
                l = m2hVar2.e;
                ch3.d0(obj);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l9bVar = m2hVar2.g;
                kwgVar = m2hVar2.f;
                l2 = m2hVar2.e;
                ch3.d0(obj);
            }
            try {
                l3 = this.c;
                long jLongValue2 = l2.longValue();
                if (l3 != null && l3.longValue() == jLongValue2) {
                    this.e = kwgVar.b;
                }
                l9bVar.g(null);
                u8bVar = kwgVar.a;
                this.g.set(false);
                return u8bVar;
            } catch (Throwable th) {
                l9bVar.g(null);
                throw th;
            }
            kwg kwgVar2 = (kwg) obj;
            l9b l9bVar2 = this.b;
            m2hVar2.e = l;
            m2hVar2.f = kwgVar2;
            m2hVar2.g = l9bVar2;
            m2hVar2.d = j2;
            m2hVar2.j = 2;
            if (l9bVar2.b(m2hVar2) != hu4Var) {
                kwgVar = kwgVar2;
                l2 = l;
                l9bVar = l9bVar2;
                l3 = this.c;
                long jLongValue3 = l2.longValue();
                if (l3 != null) {
                    this.e = kwgVar.b;
                }
                l9bVar.g(null);
                u8bVar = kwgVar.a;
                this.g.set(false);
                return u8bVar;
            }
            return hu4Var;
        } catch (Throwable th2) {
            this.g.set(false);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(long j, nq4 nq4Var) {
        n2h n2hVar;
        Long l;
        long j2;
        u8b u8bVar;
        kwg kwgVar;
        Long l2;
        l9b l9bVar;
        Long l3;
        if (nq4Var instanceof n2h) {
            n2hVar = (n2h) nq4Var;
            int i = n2hVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                n2hVar.j = i - Integer.MIN_VALUE;
            } else {
                n2hVar = new n2h(this, nq4Var);
            }
        } else {
            n2hVar = new n2h(this, nq4Var);
        }
        n2h n2hVar2 = n2hVar;
        Object obj = n2hVar2.h;
        hu4 hu4Var = hu4.a;
        int i2 = n2hVar2.j;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                Long l4 = this.c;
                if (l4 != null) {
                    aj5 aj5Var = this.a;
                    long jLongValue = l4.longValue();
                    n2hVar2.e = l4;
                    n2hVar2.d = j;
                    n2hVar2.j = 1;
                    Object objJ = aj5Var.j(jLongValue, false, j, n2hVar2);
                    if (objJ != hu4Var) {
                        l = l4;
                        obj = objJ;
                        j2 = j;
                    }
                    return hu4Var;
                }
                u8bVar = cqb.b;
                this.f.set(false);
                return u8bVar;
            }
            if (i2 == 1) {
                j2 = n2hVar2.d;
                l = n2hVar2.e;
                ch3.d0(obj);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l9bVar = n2hVar2.g;
                kwgVar = n2hVar2.f;
                l2 = n2hVar2.e;
                ch3.d0(obj);
            }
            try {
                l3 = this.c;
                long jLongValue2 = l2.longValue();
                if (l3 != null && l3.longValue() == jLongValue2) {
                    this.d = kwgVar.b;
                }
                l9bVar.g(null);
                u8bVar = kwgVar.a;
                this.f.set(false);
                return u8bVar;
            } catch (Throwable th) {
                l9bVar.g(null);
                throw th;
            }
            kwg kwgVar2 = (kwg) obj;
            l9b l9bVar2 = this.b;
            n2hVar2.e = l;
            n2hVar2.f = kwgVar2;
            n2hVar2.g = l9bVar2;
            n2hVar2.d = j2;
            n2hVar2.j = 2;
            if (l9bVar2.b(n2hVar2) != hu4Var) {
                kwgVar = kwgVar2;
                l2 = l;
                l9bVar = l9bVar2;
                l3 = this.c;
                long jLongValue3 = l2.longValue();
                if (l3 != null) {
                    this.d = kwgVar.b;
                }
                l9bVar.g(null);
                u8bVar = kwgVar.a;
                this.f.set(false);
                return u8bVar;
            }
            return hu4Var;
        } catch (Throwable th2) {
            this.f.set(false);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, nq4 nq4Var) {
        o2h o2hVar;
        l9b l9bVar;
        if (nq4Var instanceof o2h) {
            o2hVar = (o2h) nq4Var;
            int i = o2hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                o2hVar.h = i - Integer.MIN_VALUE;
            } else {
                o2hVar = new o2h(this, nq4Var);
            }
        } else {
            o2hVar = new o2h(this, nq4Var);
        }
        Object obj = o2hVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = o2hVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.b;
            o2hVar.e = l9bVar2;
            o2hVar.d = j;
            o2hVar.h = 1;
            if (l9bVar2.b(o2hVar) == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = o2hVar.d;
            l9bVar = o2hVar.e;
            ch3.d0(obj);
        }
        try {
            this.c = new Long(j);
            this.d = 0L;
            this.e = 0L;
            this.f.set(false);
            this.g.set(false);
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }
}
