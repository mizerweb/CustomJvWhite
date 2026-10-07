package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class rul extends pci implements ListIterator {
    public final int b;
    public int c;
    public final xyl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rul(xyl xylVar, int i) {
        super(1);
        int size = xylVar.size();
        if (i < 0 || i > size) {
            c.r(e9i.Q0(i, size, "index"));
            throw null;
        }
        this.b = size;
        this.c = i;
        this.d = xylVar;
    }

    public final Object a(int i) {
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            qr7.d();
            return null;
        }
        int i = this.c;
        this.c = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            qr7.d();
            return null;
        }
        int i = this.c - 1;
        this.c = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
