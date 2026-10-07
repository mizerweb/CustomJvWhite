package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class s8b implements List, wv8 {
    public final u8b a;

    public s8b(u8b u8bVar) {
        this.a = u8bVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.b(obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        u8b u8bVar = this.a;
        if (i < 0 || i > u8bVar.b) {
            StringBuilder sbY = zo5.y(i, "Index ", " must be in 0..");
            sbY.append(u8bVar.b);
            gol.e(sbY.toString());
            throw null;
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size() + u8bVar.b;
        Object[] objArr = u8bVar.a;
        if (objArr.length < size) {
            u8bVar.m(objArr, size);
        }
        Object[] objArr2 = u8bVar.a;
        if (i != u8bVar.b) {
            a.Q0(collection.size() + i, i, u8bVar.b, objArr2, objArr2);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                xw3.V0();
                throw null;
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        u8bVar.b = collection.size() + u8bVar.b;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.f();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.h(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (this.a.h(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        cqb.a(i, this);
        return this.a.g(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.i();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r8b(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        u8b u8bVar = this.a;
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        if (obj == null) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (objArr[i2] == null) {
                    return i2;
                }
            }
        } else {
            for (int i3 = i - 1; -1 < i3; i3--) {
                if (obj.equals(objArr[i3])) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new r8b(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        u8b u8bVar = this.a;
        int iH = u8bVar.h(obj);
        if (iH < 0) {
            return false;
        }
        u8bVar.l(iH);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        u8b u8bVar = this.a;
        int i = u8bVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int iH = u8bVar.h(it.next());
            if (iH >= 0) {
                u8bVar.l(iH);
            }
        }
        return i != u8bVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        u8b u8bVar = this.a;
        int i = u8bVar.b;
        Object[] objArr = u8bVar.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                u8bVar.l(i2);
            }
        }
        return i != u8bVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        cqb.a(i, this);
        u8b u8bVar = this.a;
        if (i < 0 || i >= u8bVar.b) {
            u8bVar.n(i);
            throw null;
        }
        Object[] objArr = u8bVar.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        cqb.b(i, i2, this);
        return new t8b(i, i2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return qe7.L(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return qe7.M(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new r8b(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        cqb.a(i, this);
        return this.a.l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        u8b u8bVar = this.a;
        int i = u8bVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            u8bVar.b(it.next());
        }
        return i != u8bVar.b;
    }
}
