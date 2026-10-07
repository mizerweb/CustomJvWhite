package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class u44 extends AbstractMap implements Serializable {
    public static final Object j = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient s44 g;
    public transient s44 h;
    public transient u2 i;

    public static u44 a() {
        u44 u44Var = new u44();
        u44Var.e = Math.min(Math.max(3, 1), 1073741823);
        return u44Var;
    }

    public static u44 b(int i) {
        u44 u44Var = new u44();
        lvb.O("Expected size must be >= 0", i >= 0);
        u44Var.e = Math.min(Math.max(i, 1), 1073741823);
        return u44Var;
    }

    public final Map c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.e += 32;
        Map mapC = c();
        if (mapC != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            mapC.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f, (Object) null);
        Arrays.fill(k(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (ndl.c(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iU = n1g.U(obj);
        int iD = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iE = mnl.e(iU & iD, obj2);
        if (iE == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iU & i;
        do {
            int i3 = iE - 1;
            int i4 = i()[i3];
            if ((i4 & i) == i2 && ndl.c(obj, j()[i3])) {
                return i3;
            }
            iE = i4 & iD;
        } while (iE != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        s44 s44Var = this.h;
        if (s44Var != null) {
            return s44Var;
        }
        s44 s44Var2 = new s44(this, 0);
        this.h = s44Var2;
        return s44Var2;
    }

    public final void f(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrJ[i] = null;
            objArrK[i] = null;
            iArrI[i] = 0;
            return;
        }
        Object obj2 = objArrJ[i3];
        objArrJ[i] = obj2;
        objArrK[i] = objArrK[i3];
        objArrJ[i3] = null;
        objArrK[i3] = null;
        iArrI[i] = iArrI[i3];
        iArrI[i3] = 0;
        int iU = n1g.U(obj2) & i2;
        int iE = mnl.e(iU, obj);
        if (iE == size) {
            mnl.f(iU, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iE - 1;
            int i5 = iArrI[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrI[i4] = mnl.b(i5, i + 1, i2);
                return;
            }
            iE = i6;
        }
    }

    public final boolean g() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return k()[iE];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int iD = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iD2 = mnl.d(obj, null, iD, obj2, i(), j(), null);
            if (iD2 != -1) {
                Object obj3 = k()[iD2];
                f(iD2, iD);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return j;
    }

    public final int[] i() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        s44 s44Var = this.g;
        if (s44Var != null) {
            return s44Var;
        }
        s44 s44Var2 = new s44(this, 1);
        this.g = s44Var2;
        return s44Var2;
    }

    public final int l(int i, int i2, int i3, int i4) {
        Object objA = mnl.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            mnl.f(i3 & i5, i4 + 1, objA);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i6 = 0; i6 <= i; i6++) {
            int iE = mnl.e(i6, obj);
            while (iE != 0) {
                int i7 = iE - 1;
                int i8 = iArrI[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iE2 = mnl.e(i10, objA);
                mnl.f(i10, iE, objA);
                iArrI[i7] = mnl.b(i9, iE2, i5);
                iE = i8 & i;
            }
        }
        this.a = objA;
        this.e = mnl.b(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:39:0x00e9->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:37:0x00e4 BREAK  A[LOOP:1: B:39:0x00e9->B:42:0x0100], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u44.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == j) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        u2 u2Var = this.i;
        if (u2Var != null) {
            return u2Var;
        }
        u2 u2Var2 = new u2(2, this);
        this.i = u2Var2;
        return u2Var2;
    }
}
