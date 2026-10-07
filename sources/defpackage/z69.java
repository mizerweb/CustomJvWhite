package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class z69 implements ListIterator, uv8 {
    public final a79 a;
    public int b;
    public int c = -1;
    public int d;

    public z69(a79 a79Var, int i) {
        this.a = a79Var;
        this.b = i;
        this.d = ((AbstractList) a79Var).modCount;
    }

    public final void a() {
        if (((AbstractList) this.a.e).modCount == this.d) {
            return;
        }
        c.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        this.b = i + 1;
        a79 a79Var = this.a;
        a79Var.add(i, obj);
        this.c = -1;
        this.d = ((AbstractList) a79Var).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b;
        a79 a79Var = this.a;
        if (i >= a79Var.c) {
            qr7.d();
            return null;
        }
        this.b = i + 1;
        this.c = i;
        return a79Var.a[a79Var.b + i];
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
        a79 a79Var = this.a;
        return a79Var.a[a79Var.b + i2];
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
        a79 a79Var = this.a;
        a79Var.a(i);
        this.b = this.c;
        this.c = -1;
        this.d = ((AbstractList) a79Var).modCount;
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
