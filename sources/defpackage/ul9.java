package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ul9 implements Map, Serializable, uv8 {
    public static final ul9 n;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public vl9 j;
    public wl9 k;
    public vl9 l;
    public boolean m;

    static {
        ul9 ul9Var = new ul9(0);
        ul9Var.m = true;
        n = ul9Var;
    }

    public ul9(int i) {
        if (i < 0) {
            ore.p("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iG = g(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[iG];
                if (i3 <= 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 >= objArr.length) {
                        e(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f = i5;
                    objArr[i4] = obj;
                    this.c[i4] = iG;
                    iArr[iG] = i5;
                    this.i++;
                    this.h++;
                    if (i2 > this.e) {
                        this.e = i2;
                    }
                    return i4;
                }
                if (cqk.d(this.a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    h(this.d.length * 2);
                    break;
                }
                iG = iG == 0 ? this.d.length - 1 : iG - 1;
            }
        }
    }

    public final ul9 b() {
        c();
        this.m = true;
        return this.i > 0 ? this : n;
    }

    public final void c() {
        if (this.m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        e9i.r0(this.a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            e9i.r0(objArr, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.c[i2] >= 0 && cqk.d(this.b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        e9i.r0(this.a, i3, i);
        if (objArr != null) {
            e9i.r0(objArr, i3, this.f);
        }
        this.f = i3;
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.b;
            this.b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.c = Arrays.copyOf(this.c, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.d.length) {
                h(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        vl9 vl9Var = this.l;
        if (vl9Var != null) {
            return vl9Var;
        }
        vl9 vl9Var2 = new vl9(this, 0);
        this.l = vl9Var2;
        return vl9Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.i == map.size()) {
                for (Object obj2 : map.entrySet()) {
                    if (obj2 != null) {
                        try {
                            Map.Entry entry = (Map.Entry) obj2;
                            int iF = f(entry.getKey());
                            if (!(iF < 0 ? false : cqk.d(this.b[iF], entry.getValue()))) {
                            }
                        } catch (ClassCastException unused) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int iG = g(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[iG];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (cqk.d(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iG = iG == 0 ? this.d.length - 1 : iG - 1;
        }
    }

    public final int g(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        return this.b[iF];
    }

    public final void h(int i) {
        int[] iArr;
        this.h++;
        int i2 = 0;
        if (this.f > this.i) {
            d(false);
        }
        this.d = new int[i];
        this.g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int iG = g(this.a[i2]);
            int i4 = this.e;
            while (true) {
                iArr = this.d;
                if (iArr[iG] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    ore.k("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iG = iG == 0 ? iArr.length - 1 : iG - 1;
            }
            iArr[iG] = i3;
            this.c[i2] = iG;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        ql9 ql9Var = new ql9(this, 0);
        int i = 0;
        while (ql9Var.hasNext()) {
            int i2 = ql9Var.a;
            ul9 ul9Var = (ul9) ql9Var.d;
            if (i2 >= ul9Var.f) {
                qr7.d();
                return 0;
            }
            ql9Var.a = i2 + 1;
            ql9Var.b = i2;
            Object obj = ul9Var.a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = ul9Var.b[ql9Var.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            ql9Var.d();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final void i(int i) {
        this.a[i] = null;
        Object[] objArr = this.b;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.c[i];
        int i2 = this.e * 2;
        int length2 = this.d.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.d.length - 1 : length - 1;
            i4++;
            int i6 = this.e;
            int[] iArr = this.d;
            if (i4 > i6) {
                iArr[i5] = 0;
            } else {
                int i7 = iArr[length];
                if (i7 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i7 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i8 = i7 - 1;
                        int iG = g(this.a[i8]) - length;
                        int[] iArr2 = this.d;
                        if ((iG & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i7;
                            this.c[i8] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.c[i] = -1;
            this.i--;
            this.h++;
        } while (i3 >= 0);
        this.d[i5] = -1;
        this.c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        vl9 vl9Var = this.j;
        if (vl9Var != null) {
            return vl9Var;
        }
        vl9 vl9Var2 = new vl9(this, 1);
        this.j = vl9Var2;
        return vl9Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                ore.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    ore.p("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!cqk.d(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iF = f(obj);
        if (iF < 0) {
            return null;
        }
        Object obj2 = this.b[iF];
        i(iF);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        ql9 ql9Var = new ql9(this, 0);
        while (ql9Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = ql9Var.a;
            ul9 ul9Var = (ul9) ql9Var.d;
            if (i2 >= ul9Var.f) {
                qr7.d();
                return null;
            }
            ql9Var.a = i2 + 1;
            ql9Var.b = i2;
            Object obj = ul9Var.a[i2];
            if (obj == ul9Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = ul9Var.b[ql9Var.b];
            if (obj2 == ul9Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            ql9Var.d();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        wl9 wl9Var = this.k;
        if (wl9Var != null) {
            return wl9Var;
        }
        wl9 wl9Var2 = new wl9(this);
        this.k = wl9Var2;
        return wl9Var2;
    }

    public ul9() {
        this(8);
    }
}
