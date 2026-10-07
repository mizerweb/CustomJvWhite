package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class a79 extends w2 implements RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final a79 d;
    public final c79 e;

    public a79(Object[] objArr, int i, int i2, a79 a79Var, c79 c79Var) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.d = a79Var;
        this.e = c79Var;
        ((AbstractList) this).modCount = ((AbstractList) c79Var).modCount;
    }

    @Override // defpackage.w2
    public final Object a(int i) {
        g();
        f();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return i(this.b + i);
        }
        c.r(qt4.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            c.r(qt4.l("index: ", i, i2, ", size: "));
        } else {
            d(this.b + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        g();
        f();
        int i2 = this.c;
        if (i < 0 || i > i2) {
            c.r(qt4.l("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        c(this.b + i, collection, size);
        return size > 0;
    }

    public final void c(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        c79 c79Var = this.e;
        a79 a79Var = this.d;
        if (a79Var != null) {
            a79Var.c(i, collection, i2);
        } else {
            c79 c79Var2 = c79.d;
            c79Var.c(i, collection, i2);
        }
        this.a = c79Var.a;
        this.c += i2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        j(this.b, this.c);
    }

    public final void d(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c79 c79Var = this.e;
        a79 a79Var = this.d;
        if (a79Var != null) {
            a79Var.d(i, obj);
        } else {
            c79 c79Var2 = c79.d;
            c79Var.d(i, obj);
        }
        this.a = c79Var.a;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (cqk.d(objArr[this.b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (((AbstractList) this.e).modCount == ((AbstractList) this).modCount) {
            return;
        }
        c.c();
    }

    public final void g() {
        if (this.e.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a[this.b + i];
        }
        c.r(qt4.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // defpackage.w2
    public final int getSize() {
        f();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.a;
        int i = this.c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        Object objI;
        ((AbstractList) this).modCount++;
        a79 a79Var = this.d;
        if (a79Var != null) {
            objI = a79Var.i(i);
        } else {
            c79 c79Var = c79.d;
            objI = this.e.i(i);
        }
        this.c--;
        return objI;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.c; i++) {
            if (cqk.d(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        a79 a79Var = this.d;
        if (a79Var != null) {
            a79Var.j(i, i2);
        } else {
            c79 c79Var = c79.d;
            this.e.j(i, i2);
        }
        this.c -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        int iL;
        a79 a79Var = this.d;
        if (a79Var != null) {
            iL = a79Var.l(i, i2, collection, z);
        } else {
            c79 c79Var = c79.d;
            iL = this.e.l(i, i2, collection, z);
        }
        if (iL > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= iL;
        return iL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.c - 1; i >= 0; i--) {
            if (cqk.d(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            return new z69(this, i);
        }
        c.r(qt4.l("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            a(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        g();
        f();
        return l(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        g();
        f();
        return l(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            c.r(qt4.l("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.a;
        int i3 = this.b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        e9i.w(i, i2, this.c);
        return new a79(this.a, this.b + i, i2 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        f();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        int i2 = this.b;
        if (length < i) {
            return Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
        }
        a.Q0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return e9i.f(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        d(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return a.U0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g();
        f();
        int size = collection.size();
        c(this.b + this.c, collection, size);
        return size > 0;
    }
}
