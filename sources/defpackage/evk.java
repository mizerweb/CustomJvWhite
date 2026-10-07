package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class evk extends AbstractMap implements Serializable {
    private static final Object j = new Object();
    private transient Object a;
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    private transient int e;
    private transient int f;
    private transient Set g;
    private transient Set h;
    private transient Collection i;

    public evk(int i) {
        s(12);
    }

    private final int A(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objD = hvk.d(i2);
        if (i4 != 0) {
            hvk.e(objD, i3 & i5, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i6 = 0; i6 <= i; i6++) {
            int iC = hvk.c(obj, i6);
            while (iC != 0) {
                int i7 = iC - 1;
                int i8 = iArrA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iC2 = hvk.c(objD, i10);
                hvk.e(objD, i10, iC);
                iArrA[i7] = ((~i5) & i9) | (iC2 & i5);
                iC = i8 & i;
            }
        }
        this.a = objD;
        C(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(Object obj) {
        if (!u()) {
            int iY = y();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iB = hvk.b(obj, null, iY, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                t(iB, iY);
                this.f--;
                r();
                return obj3;
            }
        }
        return j;
    }

    private final void C(int i) {
        this.e = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.e & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object j(evk evkVar, int i) {
        return evkVar.b()[i];
    }

    public static /* synthetic */ Object l(evk evkVar) {
        Object obj = evkVar.a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object m(evk evkVar, int i) {
        return evkVar.c()[i];
    }

    public static /* synthetic */ void q(evk evkVar, int i, Object obj) {
        evkVar.c()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int y() {
        return (1 << (this.e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(Object obj) {
        if (u()) {
            return -1;
        }
        int iA = kvk.a(obj);
        int iY = y();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iC = hvk.c(obj2, iA & iY);
        if (iC != 0) {
            int i = ~iY;
            int i2 = iA & i;
            do {
                int i3 = iC - 1;
                int i4 = a()[i3];
                if ((i4 & i) == i2 && qpk.a(obj, b()[i3])) {
                    return i3;
                }
                iC = i4 & iY;
            } while (iC != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (u()) {
            return;
        }
        r();
        Map mapO = o();
        if (mapO != null) {
            this.e = l0l.a(size(), 3, 1073741823);
            mapO.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f, (Object) null);
        Arrays.fill(c(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.containsKey(obj);
        }
        return z(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (qpk.a(obj, c()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        muk mukVar = new muk(this);
        this.h = mukVar;
        return mukVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.get(obj);
        }
        int iZ = z(obj);
        if (iZ == -1) {
            return null;
        }
        return c()[iZ];
    }

    public final int h() {
        return isEmpty() ? -1 : 0;
    }

    public final int i(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.g;
        if (set != null) {
            return set;
        }
        vuk vukVar = new vuk(this);
        this.g = vukVar;
        return vukVar;
    }

    public final Map o() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        if (u()) {
            vpk.f(u(), "Arrays already allocated");
            int i2 = this.e;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.a = hvk.d(iMax2);
            C(iMax2 - 1);
            this.b = new int[i2];
            this.c = new Object[i2];
            this.d = new Object[i2];
        }
        Map mapO = o();
        if (mapO != null) {
            return mapO.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i3 = this.f;
        int i4 = i3 + 1;
        int iA = kvk.a(obj);
        int iY = y();
        int i5 = iA & iY;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int iC = hvk.c(obj3, i5);
        if (iC == 0) {
            if (i4 > iY) {
                iY = A(iY, hvk.a(iY), iA, i3);
            } else {
                Object obj4 = this.a;
                Objects.requireNonNull(obj4);
                hvk.e(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~iY;
            int i7 = iA & i6;
            int i8 = 0;
            while (true) {
                int i9 = iC - 1;
                int i10 = iArrA[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && qpk.a(obj, objArrB[i9])) {
                    Object obj5 = objArrC[i9];
                    objArrC[i9] = obj2;
                    return obj5;
                }
                int i12 = i10 & iY;
                i8++;
                if (i12 == 0) {
                    if (i8 < 9) {
                        if (i4 <= iY) {
                            iArrA[i9] = (i4 & iY) | i11;
                            break;
                        }
                        iY = A(iY, hvk.a(iY), iA, i3);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(y() + 1, 1.0f);
                    int iH = h();
                    while (iH >= 0) {
                        linkedHashMap.put(b()[iH], c()[iH]);
                        iH = i(iH);
                    }
                    this.a = linkedHashMap;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    r();
                    return linkedHashMap.put(obj, obj2);
                }
                iC = i12;
            }
        }
        int length = a().length;
        if (i4 > length) {
            int i13 = i;
            int iMin = Math.min(1073741823, (Math.max(i13, length >>> 1) + length) | i13);
            if (iMin != length) {
                this.b = Arrays.copyOf(a(), iMin);
                this.c = Arrays.copyOf(b(), iMin);
                this.d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i3] = (~iY) & iA;
        b()[i3] = obj;
        c()[i3] = obj2;
        this.f = i4;
        r();
        return null;
    }

    public final void r() {
        this.e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.remove(obj);
        }
        Object objB = B(obj);
        if (objB == j) {
            return null;
        }
        return objB;
    }

    public final void s(int i) {
        this.e = l0l.a(i, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapO = o();
        return mapO != null ? mapO.size() : this.f;
    }

    public final void t(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrB[i] = null;
            objArrC[i] = null;
            iArrA[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrB[i3];
        objArrB[i] = obj2;
        objArrC[i] = objArrC[i3];
        objArrB[i3] = null;
        objArrC[i3] = null;
        iArrA[i] = iArrA[i3];
        iArrA[i3] = 0;
        int iA = kvk.a(obj2) & i2;
        int iC = hvk.c(obj, iA);
        if (iC == size) {
            hvk.e(obj, iA, i4);
            return;
        }
        while (true) {
            int i5 = iC - 1;
            int i6 = iArrA[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrA[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iC = i7;
        }
    }

    public final boolean u() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.i;
        if (collection != null) {
            return collection;
        }
        bvk bvkVar = new bvk(this);
        this.i = bvkVar;
        return bvkVar;
    }

    public evk() {
        s(3);
    }
}
