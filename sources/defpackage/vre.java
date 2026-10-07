package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class vre extends b99 {
    public final rre l;
    public final qg7 m;
    public final cte o;
    public final vt4 s;
    public final os1 t;
    public final boolean n = true;
    public final AtomicBoolean p = new AtomicBoolean(true);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);

    public vre(rre rreVar, qg7 qg7Var, String[] strArr, os1 os1Var) {
        vt4 vt4Var;
        this.l = rreVar;
        this.m = qg7Var;
        this.o = new cte(strArr, this);
        if (rreVar.j()) {
            vt4Var = rreVar.b;
            if (vt4Var == null) {
                vt4Var = null;
            }
        } else {
            vt4Var = k66.a;
        }
        this.s = vt4Var;
        this.t = os1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[Catch: all -> 0x0032, Exception -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:12:0x002b, B:33:0x0072), top: B:52:0x002b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0083 A[LOOP:0: B:31:0x006c->B:37:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002b, B:31:0x006c, B:33:0x0072, B:41:0x0090, B:38:0x0086, B:39:0x008d), top: B:51:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x006a -> B:31:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009b -> B:46:0x009c). Please report as a decompilation issue!!! */
    public static final Object l(vre vreVar, nq4 nq4Var) {
        dte dteVar;
        int i;
        Object obj;
        Object objI;
        hu4 hu4Var;
        AtomicBoolean atomicBoolean = vreVar.p;
        rre rreVar = vreVar.l;
        AtomicBoolean atomicBoolean2 = vreVar.q;
        if (nq4Var instanceof dte) {
            dteVar = (dte) nq4Var;
            int i2 = dteVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dteVar.g = i2 - Integer.MIN_VALUE;
            } else {
                dteVar = new dte(vreVar, nq4Var);
            }
        } else {
            dteVar = new dte(vreVar, nq4Var);
        }
        Object obj2 = dteVar.e;
        int i3 = dteVar.g;
        try {
            if (i3 == 0) {
                ch3.d0(obj2);
                if (vreVar.r.compareAndSet(false, true)) {
                    jl8 jl8Var = rreVar.f;
                    if (jl8Var == null) {
                        jl8Var = null;
                    }
                    cte cteVar = vreVar.o;
                    jl8Var.getClass();
                    if (jl8Var.a(new adj(jl8Var, cteVar))) {
                        lvb.z0(new il8(jl8Var, null, 0));
                    }
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        dteVar.d = 1;
                        dteVar.g = 1;
                        objI = ch3.I(dteVar, rreVar, true, vreVar.n, vreVar.t);
                        hu4Var = hu4.a;
                        if (objI == hu4Var) {
                            return hu4Var;
                        }
                        obj = objI;
                        i = 1;
                    }
                    if (i != 0) {
                        vreVar.i(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i = 0;
                }
                if (i != 0) {
                }
                return sbi.a;
            }
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = dteVar.d;
            try {
                ch3.d0(obj2);
                obj = obj2;
                i = i4;
                while (atomicBoolean.compareAndSet(true, false)) {
                    dteVar.d = 1;
                    dteVar.g = 1;
                    objI = ch3.I(dteVar, rreVar, true, vreVar.n, vreVar.t);
                    hu4Var = hu4.a;
                    if (objI == hu4Var) {
                        return hu4Var;
                    }
                    obj = objI;
                    i = 1;
                }
                if (i != 0) {
                    vreVar.i(obj);
                }
                atomicBoolean2.set(false);
                if (i != 0 || !atomicBoolean.get()) {
                    return sbi.a;
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        dteVar.d = 1;
                        dteVar.g = 1;
                        objI = ch3.I(dteVar, rreVar, true, vreVar.n, vreVar.t);
                        hu4Var = hu4.a;
                        if (objI == hu4Var) {
                            return hu4Var;
                        }
                        obj = objI;
                        i = 1;
                    }
                    if (i != 0) {
                        vreVar.i(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i = 0;
                }
                if (i != 0) {
                }
                return sbi.a;
            } catch (Exception e) {
                throw new RuntimeException("Exception while computing database live data.", e);
            }
        } catch (Throwable th) {
            atomicBoolean2.set(false);
            throw th;
        }
    }

    @Override // defpackage.b99
    public final void g() {
        ((Set) this.m.c).add(this);
        dq4 dq4Var = this.l.a;
        if (dq4Var == null) {
            dq4Var = null;
        }
        yab.i0(dq4Var, this.s, 0, new bte(this, null, 1), 2);
    }

    @Override // defpackage.b99
    public final void h() {
        ((Set) this.m.c).remove(this);
    }
}
