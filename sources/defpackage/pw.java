package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class pw implements Collection, Set, vv8 {
    public int[] a;
    public Object[] b;
    public int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pw(pw pwVar) {
        this(0);
        if (pwVar != null) {
            int i = pwVar.c;
            a(this.c + i);
            if (this.c != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    add(pwVar.b[i2]);
                }
            } else if (i > 0) {
                System.arraycopy(pwVar.a, 0, this.a, 0, i);
                a.S0(pwVar.b, this.b, 0, 0, i, 6);
                if (this.c != 0) {
                    c.c();
                    throw null;
                }
                this.c = i;
            }
        }
    }

    public final void a(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[i];
            this.a = iArr2;
            this.b = new Object[i];
            if (i2 > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                a.S0(objArr, this.b, 0, 0, this.c, 6);
            }
        }
        if (this.c == i2) {
            return;
        }
        c.c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iS0;
        int i2 = this.c;
        if (obj == null) {
            iS0 = lvb.s0(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iS0 = lvb.s0(this, obj, iHashCode);
        }
        if (iS0 >= 0) {
            return false;
        }
        int i3 = ~iS0;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i2 != this.c) {
                c.c();
                return false;
            }
            if (iArr2.length != 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                a.S0(objArr, this.b, 0, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            a.P0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.b;
            a.Q0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        c.c();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        a(collection.size() + this.c);
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        int i2;
        int i3 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                a.P0(i, i5, i3, iArr, iArr);
                Object[] objArr2 = this.b;
                a.Q0(i, i5, i3, objArr2, objArr2);
            }
            this.b[i4] = null;
        } else {
            int i6 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArr2 = new int[i6];
            this.a = iArr2;
            this.b = new Object[i6];
            if (i > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i2 = i;
                a.S0(objArr, this.b, 0, 0, i2, 6);
            } else {
                i2 = i;
            }
            if (i2 < i4) {
                int i7 = i2 + 1;
                a.P0(i2, i7, i3, iArr, this.a);
                a.Q0(i2, i7, i3, objArr, this.b);
            }
        }
        if (i3 == this.c) {
            this.c = i4;
            return obj;
        }
        c.c();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = rx8.b;
            this.b = rx8.d;
            this.c = 0;
        }
        if (this.c == 0) {
            return;
        }
        c.c();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? lvb.s0(this, null, 0) : lvb.s0(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.b[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new hw(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iS0 = obj == null ? lvb.s0(this, null, 0) : lvb.s0(this, obj, obj.hashCode());
        if (iS0 < 0) {
            return false;
        }
        b(iS0);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!ww3.j1(collection, this.b[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] objArrB = ruk.b(objArr, this.c);
        a.Q0(0, 0, this.c, this.b, objArrB);
        return objArrB;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return a.U0(this.b, 0, this.c);
    }

    public pw(int i) {
        this.a = rx8.b;
        this.b = rx8.d;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    public pw(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
