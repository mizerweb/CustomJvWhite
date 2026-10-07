package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class n0h {
    public final String a = n0h.class.getName();
    public final mjg b;
    public final r8e c;
    public final ConcurrentHashMap d;
    public final zv e;
    public final l9b f;

    public n0h() {
        mjg mjgVarA = p90.a(f0h.a);
        this.b = mjgVarA;
        this.c = new r8e(mjgVarA);
        this.d = new ConcurrentHashMap();
        this.e = new zv();
        this.f = new l9b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, nq4 nq4Var) {
        h0h h0hVar;
        l9b l9bVar;
        if (nq4Var instanceof h0h) {
            h0hVar = (h0h) nq4Var;
            int i = h0hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0hVar.h = i - Integer.MIN_VALUE;
            } else {
                h0hVar = new h0h(this, nq4Var);
            }
        } else {
            h0hVar = new h0h(this, nq4Var);
        }
        Object obj = h0hVar.f;
        int i2 = h0hVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.f;
            h0hVar.e = l9bVar2;
            h0hVar.d = j;
            h0hVar.h = 1;
            Object objB = l9bVar2.b(h0hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = h0hVar.d;
            l9bVar = h0hVar.e;
            ch3.d0(obj);
        }
        try {
            g(j);
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, float f, nq4 nq4Var) {
        i0h i0hVar;
        l9b l9bVar;
        if (nq4Var instanceof i0h) {
            i0hVar = (i0h) nq4Var;
            int i = i0hVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0hVar.i = i - Integer.MIN_VALUE;
            } else {
                i0hVar = new i0h(this, nq4Var);
            }
        } else {
            i0hVar = new i0h(this, nq4Var);
        }
        Object obj = i0hVar.g;
        int i2 = i0hVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.f;
            i0hVar.f = l9bVar2;
            i0hVar.d = j;
            i0hVar.e = f;
            i0hVar.i = 1;
            Object objB = l9bVar2.b(i0hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = i0hVar.e;
            j = i0hVar.d;
            l9bVar = i0hVar.f;
            ch3.d0(obj);
        }
        try {
            d0h d0hVarE = e(j);
            if (d0hVarE != null) {
                d0hVarE.e((oc9.u(f, 0.0f, 1.0f) * 0.49f) + 0.01f);
                h();
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(long j, nq4 nq4Var) {
        j0h j0hVar;
        l9b l9bVar;
        if (nq4Var instanceof j0h) {
            j0hVar = (j0h) nq4Var;
            int i = j0hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0hVar.h = i - Integer.MIN_VALUE;
            } else {
                j0hVar = new j0h(this, nq4Var);
            }
        } else {
            j0hVar = new j0h(this, nq4Var);
        }
        Object obj = j0hVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = j0hVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.f;
            j0hVar.e = l9bVar2;
            j0hVar.d = j;
            j0hVar.h = 1;
            if (l9bVar2.b(j0hVar) == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = j0hVar.d;
            l9bVar = j0hVar.e;
            ch3.d0(obj);
        }
        try {
            d0h d0hVarE = e(j);
            if (d0hVarE == null) {
                String str = this.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Couldn't find progress for draft=" + j, null);
                    }
                }
            } else {
                d0hVarE.f(new Float(oc9.u(0.0f, 0.0f, 1.0f)));
                h();
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, x2h x2hVar, nq4 nq4Var) {
        k0h k0hVar;
        l9b l9bVar;
        if (nq4Var instanceof k0h) {
            k0hVar = (k0h) nq4Var;
            int i = k0hVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                k0hVar.i = i - Integer.MIN_VALUE;
            } else {
                k0hVar = new k0h(this, nq4Var);
            }
        } else {
            k0hVar = new k0h(this, nq4Var);
        }
        Object obj = k0hVar.g;
        int i2 = k0hVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            k0hVar.e = x2hVar;
            l9bVar = this.f;
            k0hVar.f = l9bVar;
            k0hVar.d = j;
            k0hVar.i = 1;
            Object objB = l9bVar.b(k0hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = k0hVar.d;
            l9b l9bVar2 = k0hVar.f;
            x2h x2hVar2 = k0hVar.e;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            x2hVar = x2hVar2;
        }
        long j2 = j;
        try {
            if (x2hVar instanceof v2h) {
                j(j2, ((v2h) x2hVar).b(), oc9.u(((v2h) x2hVar).a(), 0.0f, 1.0f));
            } else if (x2hVar instanceof u2h) {
                j(j2, ((u2h) x2hVar).a(), 1.0f);
            } else if (x2hVar instanceof t2h) {
                j(j2, ((t2h) x2hVar).a(), -1.0f);
            } else if (!(x2hVar instanceof w2h)) {
                if (!(x2hVar instanceof s2h)) {
                    throw new NoWhenBranchMatchedException();
                }
                g(j2);
            }
            sbi sbiVar = sbi.a;
            l9bVar.g(null);
            return sbiVar;
        } catch (Throwable th) {
            l9bVar.g(null);
            throw th;
        }
    }

    public final d0h e(long j) {
        Object next;
        Iterator<E> it = this.e.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((d0h) next).a() == j) {
                return (d0h) next;
            }
        }
        next = null;
        return (d0h) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j, nq4 nq4Var) {
        l0h l0hVar;
        l9b l9bVar;
        if (nq4Var instanceof l0h) {
            l0hVar = (l0h) nq4Var;
            int i = l0hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                l0hVar.h = i - Integer.MIN_VALUE;
            } else {
                l0hVar = new l0h(this, nq4Var);
            }
        } else {
            l0hVar = new l0h(this, nq4Var);
        }
        Object obj = l0hVar.f;
        int i2 = l0hVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.f;
            l0hVar.e = l9bVar2;
            l0hVar.d = j;
            l0hVar.h = 1;
            Object objB = l9bVar2.b(l0hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = l0hVar.d;
            l9bVar = l0hVar.e;
            ch3.d0(obj);
        }
        try {
            g(j);
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public final void g(long j) {
        Long lValueOf = Long.valueOf(j);
        ConcurrentHashMap concurrentHashMap = this.d;
        f9b f9bVar = (f9b) concurrentHashMap.get(lValueOf);
        if (f9bVar != null) {
            f9bVar.setValue(f0h.a);
        }
        concurrentHashMap.remove(Long.valueOf(j));
        this.e.removeIf(new u6(18, new aa2(j, 26)));
        h();
    }

    public final void h() {
        e0h e0hVar;
        zv<d0h> zvVar = this.e;
        boolean zIsEmpty = zvVar.isEmpty();
        mjg mjgVar = this.b;
        if (zIsEmpty) {
            mjgVar.getClass();
            mjgVar.j(null, f0h.a);
            return;
        }
        float fMin = 1.0f;
        for (d0h d0hVar : zvVar) {
            Float fC = d0hVar.c();
            if (fC != null) {
                e0hVar = new e0h((fC.floatValue() * 0.07999998f) + 0.92f);
            } else {
                Collection collectionValues = d0hVar.d().values();
                if (collectionValues.isEmpty()) {
                    e0hVar = new e0h(d0hVar.b());
                } else {
                    int size = collectionValues.size();
                    Iterator it = collectionValues.iterator();
                    float f = 0.0f;
                    while (it.hasNext()) {
                        float fFloatValue = ((Number) it.next()).floatValue();
                        if (fFloatValue < 0.0f) {
                            fFloatValue = 0.0f;
                        } else if (fFloatValue >= 1.0f) {
                            fFloatValue = 1.0f;
                        }
                        f += fFloatValue;
                    }
                    e0hVar = new e0h(((f / size) * 0.42000002f) + 0.5f);
                }
            }
            ((f9b) this.d.computeIfAbsent(Long.valueOf(d0hVar.a()), new am(21, new chf(24)))).setValue(e0hVar);
            fMin = Math.min(fMin, e0hVar.a);
        }
        e0h e0hVar2 = new e0h(fMin);
        mjgVar.getClass();
        mjgVar.j(null, e0hVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j, nq4 nq4Var) {
        m0h m0hVar;
        l9b l9bVar;
        if (nq4Var instanceof m0h) {
            m0hVar = (m0h) nq4Var;
            int i = m0hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0hVar.h = i - Integer.MIN_VALUE;
            } else {
                m0hVar = new m0h(this, nq4Var);
            }
        } else {
            m0hVar = new m0h(this, nq4Var);
        }
        Object obj = m0hVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = m0hVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.f;
            m0hVar.e = l9bVar2;
            m0hVar.d = j;
            m0hVar.h = 1;
            if (l9bVar2.b(m0hVar) == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = m0hVar.d;
            l9bVar = m0hVar.e;
            ch3.d0(obj);
        }
        try {
            zv zvVar = this.e;
            if (zvVar == null || !zvVar.isEmpty()) {
                Iterator it = zvVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((d0h) it.next()).a() == j) {
                            String name = n0h.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (!a4cVar.b(je9Var)) {
                                    break;
                                }
                                a4cVar.c(je9Var, name, "We already started tracking story with draftId=" + j, null);
                                break;
                            }
                            break;
                        }
                    }
                }
                return sbi.a;
            }
            this.e.addLast(new d0h(j));
            h();
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public final void j(long j, long j2, float f) {
        d0h d0hVarE = e(j);
        if (d0hVarE == null) {
            return;
        }
        d0hVarE.d().put(wxg.a(j2), Float.valueOf(f));
        h();
    }
}
