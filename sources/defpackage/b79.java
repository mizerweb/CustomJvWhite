package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b79 implements ListIterator, uv8 {
    public final c79 a;
    public int b;
    public int c = -1;
    public int d;

    public b79(c79 c79Var, int i) {
        this.a = c79Var;
        this.b = i;
        this.d = ((AbstractList) c79Var).modCount;
    }

    public final void a() {
        if (((AbstractList) this.a).modCount == this.d) {
            return;
        }
        c.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        this.b = i + 1;
        c79 c79Var = this.a;
        c79Var.add(i, obj);
        this.c = -1;
        this.d = ((AbstractList) c79Var).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b;
        c79 c79Var = this.a;
        if (i >= c79Var.b) {
            qr7.d();
            return null;
        }
        this.b = i + 1;
        this.c = i;
        return c79Var.a[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.b;
        if (i <= 0) {
            qr7.d();
            return null;
        }
        int i2 = i - 1;
        this.b = i2;
        this.c = i2;
        return this.a.a[i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.c;
        if (i == -1) {
            ore.k("Call next() or previous() before removing element from the iterator.");
            return;
        }
        c79 c79Var = this.a;
        c79Var.a(i);
        this.b = this.c;
        this.c = -1;
        this.d = ((AbstractList) c79Var).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.c;
        if (i != -1) {
            this.a.set(i, obj);
        } else {
            ore.k("Call next() or previous() before replacing element from the iterator.");
        }
    }
}
