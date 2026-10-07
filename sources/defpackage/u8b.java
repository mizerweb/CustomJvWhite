package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class u8b {
    public Object[] a;
    public int b;
    public s8b c;

    public u8b(int i) {
        this.a = i == 0 ? cqb.a : new Object[i];
    }

    public static String k(u8b u8bVar, bqb bqbVar, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            bqbVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        Object[] objArr = u8bVar.a;
        int i2 = u8bVar.b;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (bqbVar == null) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) bqbVar.invoke(obj));
            }
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public final void a(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.b)) {
            StringBuilder sbY = zo5.y(i, "Index ", " must be in 0..");
            sbY.append(this.b);
            gol.e(sbY.toString());
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = this.a;
        if (objArr.length < i3) {
            m(objArr, i3);
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        if (i != i4) {
            a.Q0(i + 1, i, i4, objArr2, objArr2);
        }
        objArr2[i] = obj;
        this.b++;
    }

    public final void b(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(objArr, i);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void c(u8b u8bVar) {
        if (u8bVar.i()) {
            return;
        }
        int i = this.b + u8bVar.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(objArr, i);
        }
        a.Q0(this.b, 0, u8bVar.b, u8bVar.a, this.a);
        this.b += u8bVar.b;
    }

    public final void d(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(objArr, size);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final s8b e() {
        s8b s8bVar = this.c;
        if (s8bVar != null) {
            return s8bVar;
        }
        s8b s8bVar2 = new s8b(this);
        this.c = s8bVar2;
        return s8bVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u8b) {
            u8b u8bVar = (u8b) obj;
            int i = u8bVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = u8bVar.a;
                hj8 hj8VarF0 = oc9.f0(0, i2);
                int i3 = hj8VarF0.a;
                int i4 = hj8VarF0.b;
                if (i3 > i4) {
                    return true;
                }
                while (cqk.d(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    public final Object g(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        n(i);
        throw null;
    }

    public final int h(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.b == 0;
    }

    public final boolean j() {
        return this.b != 0;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            n(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            a.Q0(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void m(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final void n(int i) {
        StringBuilder sbY = zo5.y(i, "Index ", " must be in 0..");
        sbY.append(this.b - 1);
        gol.e(sbY.toString());
        throw null;
    }

    public final String toString() {
        return k(this, new bqb(0, this), 25);
    }

    public /* synthetic */ u8b() {
        this(16);
    }
}
