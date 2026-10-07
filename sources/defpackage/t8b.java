package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t8b implements List, wv8 {
    public final List a;
    public final int b;
    public int c;

    public t8b(int i, int i2, List list) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.add(i + this.b, obj);
        this.c++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.a.addAll(i + this.b, collection);
        this.c = collection.size() + this.c;
        return collection.size() > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.c - 1;
        int i2 = this.b;
        if (i2 <= i) {
            while (true) {
                this.a.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.c = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.c;
        for (int i2 = this.b; i2 < i; i2++) {
            if (cqk.d(this.a.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        cqb.a(i, this);
        return this.a.get(i + this.b);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.c;
        int i2 = this.b;
        for (int i3 = i2; i3 < i; i3++) {
            if (cqk.d(this.a.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.c == this.b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r8b(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.c - 1;
        int i2 = this.b;
        if (i2 > i) {
            return -1;
        }
        while (!cqk.d(this.a.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new r8b(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.c;
        for (int i2 = this.b; i2 < i; i2++) {
            List list = this.a;
            if (cqk.d(list.get(i2), obj)) {
                list.remove(i2);
                this.c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.c;
        int i2 = i - 1;
        int i3 = this.b;
        if (i3 <= i2) {
            while (true) {
                List list = this.a;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.c--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.c;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        cqb.a(i, this);
        return this.a.set(i + this.b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.c - this.b;
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
    public final ListIterator listIterator(int i) {
        return new r8b(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.c;
        this.c = i + 1;
        this.a.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.a.addAll(this.c, collection);
        this.c = collection.size() + this.c;
        return collection.size() > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        cqb.a(i, this);
        Object objRemove = this.a.remove(i + this.b);
        this.c--;
        return objRemove;
    }
}
