package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class c98 extends s88 implements List, RandomAccess {
    public static final a98 b = new a98(ghe.e, 0);

    public static ghe j(Object[] objArr, int i) {
        return i == 0 ? ghe.e : new ghe(objArr, i);
    }

    public static z88 l() {
        return new z88(4);
    }

    public static c98 m(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return n((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return ghe.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        z88 z88Var = new z88(4);
        z88Var.c(next);
        while (it.hasNext()) {
            z88Var.c(it.next());
        }
        return z88Var.h();
    }

    public static c98 n(Collection collection) {
        if (!(collection instanceof s88)) {
            Object[] array = collection.toArray();
            ch3.e(array, array.length);
            return j(array, array.length);
        }
        c98 c98VarA = ((s88) collection).a();
        if (!c98VarA.g()) {
            return c98VarA;
        }
        Object[] array2 = c98VarA.toArray(s88.a);
        return j(array2, array2.length);
    }

    public static ghe o(Object[] objArr) {
        if (objArr.length == 0) {
            return ghe.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ch3.e(objArr2, objArr2.length);
        return j(objArr2, objArr2.length);
    }

    public static ghe r(Object obj) {
        Object[] objArr = {obj};
        ch3.e(objArr, 1);
        return j(objArr, 1);
    }

    public static ghe s(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ch3.e(objArr, 2);
        return j(objArr, 2);
    }

    public static ghe u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        ch3.e(objArr, 5);
        return j(objArr, 5);
    }

    public static ghe v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        lvb.O("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        ch3.e(objArr2, length);
        return j(objArr2, length);
    }

    public static ghe w(String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, str2, str3, str4, str5, str6};
        ch3.e(objArr, 6);
        return j(objArr, 6);
    }

    public static ghe x(Iterable iterable, Comparator comparator) {
        comparator.getClass();
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : j8f.d(iterable.iterator())).toArray();
        ch3.e(array, array.length);
        Arrays.sort(array, comparator);
        return j(array, array.length);
    }

    @Override // defpackage.s88
    public final c98 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s88
    public int b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return j8f.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // defpackage.s88
    /* JADX INFO: renamed from: i */
    public final pci iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return j8f.b(this, obj);
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return j8f.c(this, obj);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q */
    public final a98 listIterator(int i) {
        lvb.X(i, size());
        return isEmpty() ? b : new a98(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y */
    public c98 subList(int i, int i2) {
        lvb.Y(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? ghe.e : new b98(this, i, i3);
    }
}
