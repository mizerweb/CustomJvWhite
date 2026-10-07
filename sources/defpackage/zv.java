package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class zv extends w2 {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public zv(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else {
            if (i <= 0) {
                ore.p(zo5.h(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    @Override // defpackage.w2
    public final Object a(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            c.r(qt4.l("index: ", i, i2, ", size: "));
            return null;
        }
        if (i == xw3.O0(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i3 = i(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[i3];
        int i4 = this.c >> 1;
        int i5 = this.a;
        if (i < i4) {
            if (i3 >= i5) {
                a.Q0(i5 + 1, i5, i3, objArr, objArr);
            } else {
                a.Q0(1, 0, i3, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.a;
                a.Q0(i6 + 1, i6, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i7 = this.a;
            objArr3[i7] = null;
            this.a = d(i7);
        } else {
            int i8 = i(xw3.O0(this) + i5);
            Object[] objArr4 = this.b;
            if (i3 <= i8) {
                a.Q0(i3, i3 + 1, i8 + 1, objArr4, objArr4);
            } else {
                a.Q0(i3, i3 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                a.Q0(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.b[i8] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            c.r(qt4.l("index: ", i, i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        c(this.c + 1);
        int i3 = i(this.a + i);
        int i4 = this.c;
        int i5 = (i4 + 1) >> 1;
        int i6 = this.a;
        if (i < i5) {
            int length = i3 == 0 ? this.b.length - 1 : i3 - 1;
            int length2 = i6 == 0 ? this.b.length - 1 : i6 - 1;
            Object[] objArr = this.b;
            if (length >= i6) {
                objArr[length2] = objArr[i6];
                a.Q0(i6, i6 + 1, length + 1, objArr, objArr);
            } else {
                a.Q0(i6 - 1, i6, objArr.length, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                a.Q0(0, 1, length + 1, objArr2, objArr2);
            }
            this.b[length] = obj;
            this.a = length2;
        } else {
            int i7 = i(i4 + i6);
            Object[] objArr3 = this.b;
            if (i3 < i7) {
                a.Q0(i3 + 1, i3, i7, objArr3, objArr3);
            } else {
                a.Q0(1, 0, i7, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                a.Q0(i3 + 1, i3, objArr4.length - 1, objArr4, objArr4);
            }
            this.b[i3] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            c.r(qt4.l("index: ", i, i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        j();
        c(collection.size() + this.c);
        int i3 = i(this.c + this.a);
        int i4 = i(this.a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i5 = i4 + size;
            Object[] objArr = this.b;
            if (i4 < i3) {
                int i6 = size + i3;
                if (i6 <= objArr.length) {
                    a.Q0(i5, i4, i3, objArr, objArr);
                } else if (i5 >= objArr.length) {
                    a.Q0(i5 - objArr.length, i4, i3, objArr, objArr);
                } else {
                    int length = i3 - (i6 - objArr.length);
                    a.Q0(0, length, i3, objArr, objArr);
                    Object[] objArr2 = this.b;
                    a.Q0(i5, i4, length, objArr2, objArr2);
                }
            } else {
                a.Q0(size, 0, i3, objArr, objArr);
                Object[] objArr3 = this.b;
                if (i5 >= objArr3.length) {
                    a.Q0(i5 - objArr3.length, i4, objArr3.length, objArr3, objArr3);
                } else {
                    a.Q0(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    a.Q0(i5, i4, objArr4.length - size, objArr4, objArr4);
                }
            }
            b(i4, collection);
            return true;
        }
        int i7 = this.a;
        int length2 = i7 - size;
        Object[] objArr5 = this.b;
        if (i4 < i7) {
            a.Q0(length2, i7, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.b;
            if (size >= i4) {
                a.Q0(objArr6.length - size, 0, i4, objArr6, objArr6);
            } else {
                a.Q0(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.b;
                a.Q0(0, size, i4, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            a.Q0(length2, i7, i4, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i8 = i4 - i7;
            int length3 = objArr5.length - length2;
            if (length3 >= i8) {
                a.Q0(length2, i7, i4, objArr5, objArr5);
            } else {
                a.Q0(length2, i7, i7 + length3, objArr5, objArr5);
                Object[] objArr8 = this.b;
                a.Q0(0, this.a + length3, i4, objArr8, objArr8);
            }
        }
        this.a = length2;
        b(f(i4 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        c(this.c + 1);
        int length = this.a;
        if (length == 0) {
            length = this.b.length;
        }
        int i = length - 1;
        this.a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        j();
        c(getSize() + 1);
        this.b[i(getSize() + this.a)] = obj;
        this.c = getSize() + 1;
    }

    public final void b(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void c(int i) {
        if (i < 0) {
            ore.k("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        a.Q0(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        a.Q0(length2 - i3, 0, i3, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            g(this.a, i(getSize() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        if (i == this.b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        ore.f("ArrayDeque is empty.");
        return null;
    }

    public final void g(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.b, 0, i2, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int size = getSize();
        if (i >= 0 && i < size) {
            return this.b[i(this.a + i)];
        }
        c.r(qt4.l("index: ", i, size, ", size: "));
        return null;
    }

    @Override // defpackage.w2
    public final int getSize() {
        return this.c;
    }

    public final int i(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i2 = i(getSize() + this.a);
        int length = this.a;
        if (length < i2) {
            while (length < i2) {
                if (cqk.d(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.a) < i2) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            if (cqk.d(obj, this.b[length])) {
                i = this.a;
            } else {
                length++;
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (cqk.d(obj, this.b[i3])) {
                length = i3 + this.b.length;
                i = this.a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            ore.f("ArrayDeque is empty.");
            return null;
        }
        return this.b[i(xw3.O0(this) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int i2 = i(getSize() + this.a);
        int i3 = this.a;
        if (i3 < i2) {
            length = i2 - 1;
            if (i3 <= length) {
                while (!cqk.d(obj, this.b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= i2) {
            do {
                i2--;
                objArr = this.b;
                if (-1 >= i2) {
                    length = objArr.length - 1;
                    int i4 = this.a;
                    if (i4 <= length) {
                        while (!cqk.d(obj, this.b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                }
                return length - i;
            } while (!cqk.d(obj, objArr[i2]));
            length = i2 + this.b.length;
            i = this.a;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int i2 = i(getSize() + this.a);
            int i3 = this.a;
            if (i3 < i2) {
                i = i3;
                while (true) {
                    objArr = this.b;
                    if (i3 >= i2) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[i] = obj;
                        i++;
                    }
                    i3++;
                }
                Arrays.fill(objArr, i, i2, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[i] = obj3;
                        i = d(i);
                    }
                }
                z = z2;
            }
            if (z) {
                j();
                this.c = f(i - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            ore.f("ArrayDeque is empty.");
            return null;
        }
        j();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = d(i);
        this.c = getSize() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            ore.f("ArrayDeque is empty.");
            return null;
        }
        j();
        int i = i(xw3.O0(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = getSize() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        e9i.w(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            a(i);
            return;
        }
        j();
        int i4 = this.c - i2;
        int i5 = this.a;
        if (i < i4) {
            int i6 = i((i - 1) + i5);
            int i7 = i(this.a + (i2 - 1));
            while (i > 0) {
                int i8 = i6 + 1;
                int iMin = Math.min(i, Math.min(i8, i7 + 1));
                Object[] objArr = this.b;
                int i9 = i7 - iMin;
                int i10 = i6 - iMin;
                a.Q0(i9 + 1, i10 + 1, i8, objArr, objArr);
                i6 = f(i10);
                i7 = f(i9);
                i -= iMin;
            }
            int i11 = i(this.a + i3);
            g(this.a, i11);
            this.a = i11;
        } else {
            int i12 = i(i5 + i2);
            int i13 = i(this.a + i);
            int i14 = this.c;
            while (true) {
                i14 -= i2;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i14, Math.min(objArr2.length - i12, objArr2.length - i13));
                Object[] objArr3 = this.b;
                int i15 = i12 + i2;
                a.Q0(i13, i12, i15, objArr3, objArr3);
                i12 = i(i15);
                i13 = i(i13 + i2);
            }
            int i16 = i(this.c + this.a);
            g(f(i16 - i3), i16);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int i2 = i(getSize() + this.a);
            int i3 = this.a;
            if (i3 < i2) {
                i = i3;
                while (true) {
                    objArr = this.b;
                    if (i3 >= i2) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        this.b[i] = obj;
                        i++;
                    } else {
                        z = true;
                    }
                    i3++;
                }
                Arrays.fill(objArr, i, i2, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.b[i4] = obj2;
                        i4++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.b[i] = obj3;
                        i = d(i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                j();
                this.c = f(i - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int size = getSize();
        if (i < 0 || i >= size) {
            c.r(qt4.l("index: ", i, size, ", size: "));
            return null;
        }
        int i2 = i(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        Object[] objArr2 = objArr;
        int i2 = i(this.c + this.a);
        int i3 = this.a;
        if (i3 < i2) {
            a.S0(this.b, objArr2, 0, i3, i2, 2);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.b;
            a.Q0(0, this.a, objArr3.length, objArr3, objArr2);
            Object[] objArr4 = this.b;
            a.Q0(objArr4.length - this.a, 0, i2, objArr4, objArr2);
        }
        int i4 = this.c;
        if (i4 < objArr2.length) {
            objArr2[i4] = null;
        }
        return objArr2;
    }

    public zv() {
        this.b = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        j();
        c(collection.size() + getSize());
        b(i(getSize() + this.a), collection);
        return true;
    }
}
