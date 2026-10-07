package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class r8b implements ListIterator, uv8 {
    public final List a;
    public int b;

    public r8b(int i, List list) {
        this.a = list;
        this.b = i - 1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.b + 1;
        this.b = i;
        this.a.add(i, obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.b + 1;
        this.b = i;
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.b;
        this.b = i - 1;
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.a.remove(this.b);
        this.b--;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.a.set(this.b, obj);
    }
}
