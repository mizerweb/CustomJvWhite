package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class sdf implements rj2, tdf, qbj {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(sdf.class, Object.class, "state$volatile");
    public static final /* synthetic */ long g = bl0.a.objectFieldOffset(sdf.class.getDeclaredField("state$volatile"));
    public final vt4 a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = tre.c;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = tre.f;

    public sdf(vt4 vt4Var) {
        this.a = vt4Var;
    }

    @Override // defpackage.qbj
    public final void a(gcf gcfVar, int i) {
        this.c = gcfVar;
        this.d = i;
    }

    @Override // defpackage.rj2
    public final void b(Throwable th) {
        sdf sdfVar;
        while (true) {
            f.getClass();
            Unsafe unsafe = bl0.a;
            long j = g;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == tre.d) {
                return;
            }
            c5b c5bVar = tre.e;
            while (true) {
                Unsafe unsafe2 = bl0.a;
                sdfVar = this;
                if (unsafe2.compareAndSwapObject(sdfVar, g, objectVolatile, c5bVar)) {
                    ArrayList arrayList = sdfVar.b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((qdf) it.next()).a();
                    }
                    sdfVar.e = tre.f;
                    sdfVar.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(sdfVar, j) != objectVolatile) {
                    break;
                } else {
                    this = sdfVar;
                }
            }
            this = sdfVar;
        }
    }

    public final void c(qdf qdfVar) {
        ArrayList<qdf> arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        for (qdf qdfVar2 : arrayList) {
            if (qdfVar2 != qdfVar) {
                qdfVar2.a();
            }
        }
        c5b c5bVar = tre.d;
        f.getClass();
        bl0.a.putObjectVolatile(this, g, c5bVar);
        this.e = tre.f;
        this.b = null;
    }

    public final Object d(nq4 nq4Var) {
        f.getClass();
        qdf qdfVar = (qdf) bl0.a.getObjectVolatile(this, g);
        Object obj = this.e;
        c(qdfVar);
        tf7 tf7Var = qdfVar.c;
        Object obj2 = qdfVar.a;
        Object obj3 = qdfVar.d;
        Object objI = tf7Var.i(obj2, obj3, obj);
        dg7 dg7Var = qdfVar.e;
        return obj3 == tre.g ? ((cf7) dg7Var).invoke(nq4Var) : ((qf7) dg7Var).invoke(objI, nq4Var);
    }

    public final Object e(mdh mdhVar) {
        return j() ? d(mdhVar) : f(mdhVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) {
        rdf rdfVar;
        if (nq4Var instanceof rdf) {
            rdfVar = (rdf) nq4Var;
            int i = rdfVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdfVar.g = i - Integer.MIN_VALUE;
            } else {
                rdfVar = new rdf(this, nq4Var);
            }
        } else {
            rdfVar = new rdf(this, nq4Var);
        }
        Object obj = rdfVar.e;
        int i2 = rdfVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            rdfVar.d = this;
            rdfVar.g = 1;
            if (n(rdfVar) != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = rdfVar.d;
        ch3.d0(obj);
        rdfVar.d = null;
        rdfVar.g = 2;
        Object objD = this.d(rdfVar);
        return objD == hu4Var ? hu4Var : objD;
    }

    public final qdf g(Object obj) {
        Object next;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((qdf) next).a != obj);
        qdf qdfVar = (qdf) next;
        if (qdfVar != null) {
            return qdfVar;
        }
        ore.j(obj, " is not found", "Clause with object ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(ki3 ki3Var, cf7 cf7Var) {
        k(new qdf(this, (up8) ki3Var.a, (tf7) ki3Var.b, (udf) ki3Var.c, tre.g, (mdh) cf7Var, null), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(gvb gvbVar, qf7 qf7Var) {
        k(new qdf(this, gvbVar.b, (tf7) gvbVar.c, (tf7) gvbVar.d, null, (mdh) qf7Var, (tf7) gvbVar.a), false);
    }

    public final boolean j() {
        f.getClass();
        return bl0.a.getObjectVolatile(this, g) instanceof qdf;
    }

    public final void k(qdf qdfVar, boolean z) {
        ArrayList arrayList;
        Object obj = qdfVar.a;
        f.getClass();
        Unsafe unsafe = bl0.a;
        long j = g;
        if (unsafe.getObjectVolatile(this, j) instanceof qdf) {
            return;
        }
        if (!z && ((arrayList = this.b) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((qdf) it.next()).a == obj) {
                    ore.c(c0a.n(obj, "Cannot use select clauses on the same object: "));
                    return;
                }
            }
        }
        qdfVar.b.i(obj, this, qdfVar.d);
        if (this.e != tre.f) {
            bl0.a.putObjectVolatile(this, j, qdfVar);
            return;
        }
        if (!z) {
            this.b.add(qdfVar);
        }
        qdfVar.g = this.c;
        qdfVar.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final boolean l(Object obj, Object obj2) {
        return m(obj, obj2) == 0;
    }

    public final int m(Object obj, Object obj2) {
        sdf sdfVar;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            f.getClass();
            Unsafe unsafe3 = bl0.a;
            long j = g;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof ck2) {
                qdf qdfVarG = this.g(obj);
                if (qdfVarG != null) {
                    tf7 tf7Var = qdfVarG.f;
                    tf7 tf7Var2 = tf7Var != null ? (tf7) tf7Var.i(this, qdfVarG.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = bl0.a;
                        sdfVar = this;
                        if (unsafe4.compareAndSwapObject(sdfVar, g, objectVolatile, qdfVarG)) {
                            ck2 ck2Var = (ck2) objectVolatile;
                            sdfVar.e = obj2;
                            c5b c5bVarE = ck2Var.e(sbi.a, tf7Var2);
                            if (c5bVarE == null) {
                                sdfVar.e = tre.f;
                                return 2;
                            }
                            ck2Var.m(c5bVarE);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(sdfVar, j) != objectVolatile) {
                            break;
                        }
                        this = sdfVar;
                    }
                } else {
                    continue;
                }
            } else {
                sdfVar = this;
                if (cqk.d(objectVolatile, tre.d) || (objectVolatile instanceof qdf)) {
                    return 3;
                }
                if (cqk.d(objectVolatile, tre.e)) {
                    return 2;
                }
                if (cqk.d(objectVolatile, tre.c)) {
                    List listSingletonList = Collections.singletonList(obj);
                    do {
                        unsafe2 = bl0.a;
                        if (unsafe2.compareAndSwapObject(sdfVar, g, objectVolatile, listSingletonList)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(sdfVar, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        qr7.v(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListH1 = ww3.H1(obj, (Collection) objectVolatile);
                    do {
                        unsafe = bl0.a;
                        if (unsafe.compareAndSwapObject(sdfVar, g, objectVolatile, arrayListH1)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(sdfVar, j) == objectVolatile);
                }
            }
            this = sdfVar;
        }
    }

    public final Object n(rdf rdfVar) throws IllegalAccessException, DispatchException, InvocationTargetException {
        sbi sbiVar;
        ek2 ek2Var;
        Unsafe unsafe;
        ek2 ek2Var2 = new ek2(1, p90.B(rdfVar));
        ek2Var2.u();
        loop0: while (true) {
            f.getClass();
            Unsafe unsafe2 = bl0.a;
            long j = g;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            ek2 ek2Var3 = ek2Var2;
            c5b c5bVar = tre.c;
            sbiVar = sbi.a;
            if (objectVolatile == c5bVar) {
                ek2 ek2Var4 = ek2Var3;
                while (true) {
                    Unsafe unsafe3 = bl0.a;
                    ek2Var = ek2Var4;
                    if (unsafe3.compareAndSwapObject(this, g, objectVolatile, ek2Var4)) {
                        ek2Var.x(this);
                        break loop0;
                    }
                    if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                        break;
                    }
                    ek2Var4 = ek2Var;
                }
                ek2Var2 = ek2Var;
            } else {
                ek2Var = ek2Var3;
                if (!(objectVolatile instanceof List)) {
                    if (!(objectVolatile instanceof qdf)) {
                        qr7.v(objectVolatile, "unexpected state: ");
                        return null;
                    }
                    qdf qdfVar = (qdf) objectVolatile;
                    Object obj = this.e;
                    tf7 tf7Var = qdfVar.f;
                    ek2Var.j(sbiVar, tf7Var != null ? (tf7) tf7Var.i(this, qdfVar.d, obj) : null);
                    break;
                }
                do {
                    unsafe = bl0.a;
                    if (unsafe.compareAndSwapObject(this, g, objectVolatile, c5bVar)) {
                        Iterator it = ((Iterable) objectVolatile).iterator();
                        while (it.hasNext()) {
                            qdf qdfVarG = g(it.next());
                            qdfVarG.g = null;
                            qdfVarG.h = -1;
                            k(qdfVarG, true);
                        }
                        break;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                ek2Var2 = ek2Var;
            }
        }
        Object objS = ek2Var.s();
        return objS == hu4.a ? objS : sbiVar;
    }
}
