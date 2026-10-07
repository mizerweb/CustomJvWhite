package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import defpackage.qv1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class cs0 implements xad {
    public final Class a = getClass();
    public final uba b;
    public final cbd c;
    public final SparseArray d;
    public final Set e;
    public boolean f;
    public final bs0 g;
    public final bs0 h;
    public final dbd i;

    public cs0(uba ubaVar, cbd cbdVar, dbd dbdVar) {
        ubaVar.getClass();
        this.b = ubaVar;
        cbdVar.getClass();
        this.c = cbdVar;
        dbdVar.getClass();
        this.i = dbdVar;
        this.d = new SparseArray();
        p(new SparseIntArray(0));
        this.e = Collections.newSetFromMap(new IdentityHashMap());
        this.h = new bs0(0);
        this.g = new bs0(0);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:4:0x000c, B:6:0x0015, B:7:0x0016, B:9:0x001e, B:41:0x00f2, B:42:0x00f5, B:14:0x0046, B:17:0x0054, B:19:0x005a, B:22:0x0061, B:24:0x0065, B:28:0x0087, B:30:0x00a5, B:25:0x006c, B:27:0x007d, B:32:0x00bb, B:36:0x00c2, B:37:0x00ca, B:39:0x00d2, B:40:0x00e5, B:46:0x00f9, B:5:0x000d), top: B:51:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:4:0x000c, B:6:0x0015, B:7:0x0016, B:9:0x001e, B:41:0x00f2, B:42:0x00f5, B:14:0x0046, B:17:0x0054, B:19:0x005a, B:22:0x0061, B:24:0x0065, B:28:0x0087, B:30:0x00a5, B:25:0x006c, B:27:0x007d, B:32:0x00bb, B:36:0x00c2, B:37:0x00ca, B:39:0x00d2, B:40:0x00e5, B:46:0x00f9, B:5:0x000d), top: B:51:0x000c, inners: #0 }] */
    @Override // defpackage.xad, defpackage.ine
    public final void d(Object obj) {
        b31 b31Var;
        boolean z;
        obj.getClass();
        int iK = k(obj);
        int iL = l(iK);
        synchronized (this) {
            try {
                synchronized (this) {
                    b31Var = (b31) this.d.get(iK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.e.remove(obj)) {
            pj6.a(this.a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iK));
            h(obj);
            this.i.getClass();
        } else if (b31Var != null) {
            if (b31Var.c.size() + b31Var.d <= b31Var.b && !n() && o(obj)) {
                int i = b31Var.d;
                if (i > 0) {
                    b31Var.d = i - 1;
                    b31Var.a(obj);
                } else {
                    Object[] objArr = {obj};
                    if (pj6.a.h(6)) {
                        pj6.a.e("BUCKET", String.format(null, "Tried to release value %s from an empty bucket!", objArr));
                    }
                }
                bs0 bs0Var = this.h;
                bs0Var.b++;
                bs0Var.c += iL;
                this.g.a(iL);
                this.i.getClass();
                if (pj6.a.h(2)) {
                    pj6.e(this.a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iK));
                }
            } else {
                if (b31Var != null) {
                    if (b31Var.d > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oc9.r(z);
                    b31Var.d--;
                }
                if (pj6.a.h(2)) {
                    pj6.e(this.a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iK));
                }
                h(obj);
                this.g.a(iL);
                this.i.getClass();
            }
        } else {
            if (b31Var != null) {
                if (b31Var.d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                oc9.r(z);
                b31Var.d--;
            }
            if (pj6.a.h(2)) {
                pj6.e(this.a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iK));
            }
            h(obj);
            this.g.a(iL);
            this.i.getClass();
        }
        q();
    }

    @Override // defpackage.sba
    public final void e(qba qbaVar) {
        ArrayList arrayList;
        int i;
        synchronized (this) {
            try {
                this.c.getClass();
                arrayList = new ArrayList(this.d.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i2 = 0; i2 < this.d.size(); i2++) {
                    b31 b31Var = (b31) this.d.valueAt(i2);
                    b31Var.getClass();
                    if (b31Var.c.size() > 0) {
                        arrayList.add(b31Var);
                    }
                    sparseIntArray.put(this.d.keyAt(i2), b31Var.d);
                }
                p(sparseIntArray);
                bs0 bs0Var = this.h;
                bs0Var.b = 0;
                bs0Var.c = 0;
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
        for (i = 0; i < arrayList.size(); i++) {
            b31 b31Var2 = (b31) arrayList.get(i);
            while (true) {
                Object objB = b31Var2.b();
                if (objB == null) {
                    break;
                } else {
                    h(objB);
                }
            }
        }
    }

    public abstract Object f(int i);

    public final synchronized boolean g(int i) {
        cbd cbdVar = this.c;
        int i2 = cbdVar.a;
        int i3 = this.g.c;
        if (i > i2 - i3) {
            this.i.getClass();
            return false;
        }
        int i4 = cbdVar.b;
        if (i > i4 - (i3 + this.h.c)) {
            s(i4 - i);
        }
        if (i <= i2 - (this.g.c + this.h.c)) {
            return true;
        }
        this.i.getClass();
        return false;
    }

    @Override // defpackage.xad
    public final Object get(int i) throws Throwable {
        Object objF;
        Object objM;
        synchronized (this) {
            try {
                oc9.r(!n() || this.h.c == 0);
            } catch (Throwable th) {
                throw th;
            }
        }
        int iJ = j(i);
        synchronized (this) {
            try {
                b31 b31VarI = i(iJ);
                if (b31VarI != null && (objM = m(b31VarI)) != null) {
                    oc9.r(this.e.add(objM));
                    int iK = k(objM);
                    int iL = l(iK);
                    bs0 bs0Var = this.g;
                    bs0Var.b++;
                    bs0Var.c += iL;
                    this.h.a(iL);
                    this.i.getClass();
                    q();
                    if (pj6.a.h(2)) {
                        pj6.e(this.a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objM)), Integer.valueOf(iK));
                    }
                    return objM;
                }
                final int iL2 = l(iJ);
                if (!g(iL2)) {
                    final int i2 = this.c.a;
                    final int i3 = this.g.c;
                    final int i4 = this.h.c;
                    throw new RuntimeException(i2, i3, i4, iL2) { // from class: com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException
                        /* JADX WARN: Illegal instructions before constructor call */
                        {
                            StringBuilder sbP = qv1.p("Pool hard cap violation? Hard cap = ", i2, " Used size = ", i3, " Free size = ");
                            sbP.append(i4);
                            sbP.append(" Request size = ");
                            sbP.append(iL2);
                            super(sbP.toString());
                        }
                    };
                }
                bs0 bs0Var2 = this.g;
                bs0Var2.b++;
                bs0Var2.c += iL2;
                if (b31VarI != null) {
                    b31VarI.d++;
                }
                try {
                    objF = f(iJ);
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.g.a(iL2);
                        b31 b31VarI2 = i(iJ);
                        if (b31VarI2 != null) {
                            oc9.r(b31VarI2.d > 0);
                            b31VarI2.d--;
                        }
                        ayl.c(th2);
                        objF = null;
                    }
                }
                synchronized (this) {
                    try {
                        oc9.r(this.e.add(objF));
                        synchronized (this) {
                            if (n()) {
                                s(this.c.b);
                            }
                        }
                        return objF;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                this.i.getClass();
                q();
                if (pj6.a.h(2)) {
                    pj6.e(this.a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objF)), Integer.valueOf(iJ));
                }
                return objF;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public abstract void h(Object obj);

    public final synchronized b31 i(int i) {
        try {
            b31 b31Var = (b31) this.d.get(i);
            if (b31Var == null && this.f) {
                if (pj6.a.h(2)) {
                    pj6.d(this.a, Integer.valueOf(i), "creating new bucket %s");
                }
                b31 b31VarR = r(i);
                this.d.put(i, b31VarR);
                return b31VarR;
            }
            return b31Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract int j(int i);

    public abstract int k(Object obj);

    public abstract int l(int i);

    public synchronized Object m(b31 b31Var) {
        Object objB;
        objB = b31Var.b();
        if (objB != null) {
            b31Var.d++;
        }
        return objB;
    }

    public final synchronized boolean n() {
        boolean z;
        z = this.g.c + this.h.c > this.c.b;
        if (z) {
            this.i.getClass();
        }
        return z;
    }

    public boolean o(Object obj) {
        obj.getClass();
        return true;
    }

    public final synchronized void p(SparseIntArray sparseIntArray) {
        try {
            this.d.clear();
            SparseIntArray sparseIntArray2 = this.c.c;
            if (sparseIntArray2 != null) {
                for (int i = 0; i < sparseIntArray2.size(); i++) {
                    int iKeyAt = sparseIntArray2.keyAt(i);
                    int iValueAt = sparseIntArray2.valueAt(i);
                    int i2 = sparseIntArray.get(iKeyAt, 0);
                    SparseArray sparseArray = this.d;
                    int iL = l(iKeyAt);
                    this.c.getClass();
                    sparseArray.put(iKeyAt, new b31(iL, iValueAt, i2));
                }
                this.f = false;
            } else {
                this.f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void q() {
        if (pj6.a.h(2)) {
            bs0 bs0Var = this.g;
            Integer numValueOf = Integer.valueOf(bs0Var.b);
            Integer numValueOf2 = Integer.valueOf(bs0Var.c);
            bs0 bs0Var2 = this.h;
            Integer numValueOf3 = Integer.valueOf(bs0Var2.b);
            Integer numValueOf4 = Integer.valueOf(bs0Var2.c);
            if (pj6.a.h(2)) {
                pj6.a.v(this.a.getSimpleName(), String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4));
            }
        }
    }

    public b31 r(int i) {
        int iL = l(i);
        this.c.getClass();
        return new b31(iL, Integer.MAX_VALUE, 0);
    }

    public final synchronized void s(int i) {
        try {
            int i2 = this.g.c;
            int i3 = this.h.c;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (pj6.a.h(2)) {
                pj6.f(this.a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.g.c + this.h.c), Integer.valueOf(iMin));
            }
            q();
            for (int i4 = 0; i4 < this.d.size() && iMin > 0; i4++) {
                b31 b31Var = (b31) this.d.valueAt(i4);
                b31Var.getClass();
                while (iMin > 0) {
                    Object objB = b31Var.b();
                    if (objB == null) {
                        break;
                    }
                    h(objB);
                    int i5 = b31Var.a;
                    iMin -= i5;
                    this.h.a(i5);
                }
            }
            q();
            if (pj6.a.h(2)) {
                pj6.e(this.a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.g.c + this.h.c));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
