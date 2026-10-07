package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class u98 extends s88 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient c98 b;

    public static int j(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            lvb.O("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static u98 l(Object[] objArr, int i) {
        if (i == 0) {
            return nhe.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new jag(obj);
        }
        int iJ = j(i);
        Object[] objArr2 = new Object[iJ];
        int i2 = iJ - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                ore.n(zo5.h(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iT = n1g.T(iHashCode);
            while (true) {
                int i6 = iT & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iT++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new jag(obj4);
        }
        if (j(i4) < iJ / 2) {
            return l(objArr, i4);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new nhe(i3, i2, i4, objArr, objArr2);
    }

    public static u98 m(Collection collection) {
        if ((collection instanceof u98) && !(collection instanceof SortedSet)) {
            u98 u98Var = (u98) collection;
            if (!u98Var.g()) {
                return u98Var;
            }
        }
        Object[] array = collection.toArray();
        return l(array, array.length);
    }

    @Override // defpackage.s88
    public c98 a() {
        c98 c98Var = this.b;
        if (c98Var != null) {
            return c98Var;
        }
        c98 c98VarN = n();
        this.b = c98VarN;
        return c98VarN;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u98) && o() && ((u98) obj).o() && hashCode() != obj.hashCode()) {
            return false;
        }
        return xpl.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return xpl.d(this);
    }

    public c98 n() {
        Object[] array = toArray(s88.a);
        a98 a98Var = c98.b;
        return c98.j(array, array.length);
    }

    public boolean o() {
        return this instanceof nhe;
    }
}
