package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tpe implements ListIterator, uv8 {
    public final /* synthetic */ int a = 0;
    public final ListIterator b;
    public final /* synthetic */ Object c;

    public tpe(vpe vpeVar, int i) {
        this.c = vpeVar;
        this.b = new z1(us0.g, ww3.h1(i, vpeVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int iO0;
        int i = this.a;
        ListIterator listIterator = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                iPreviousIndex = listIterator.previousIndex();
                iO0 = xw3.O0((upe) obj);
                break;
            default:
                iPreviousIndex = listIterator.previousIndex();
                iO0 = xw3.O0((vpe) obj);
                break;
        }
        return iO0 - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int iO0;
        int i = this.a;
        ListIterator listIterator = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                iNextIndex = listIterator.nextIndex();
                iO0 = xw3.O0((upe) obj);
                break;
            default:
                iNextIndex = listIterator.nextIndex();
                iO0 = xw3.O0((vpe) obj);
                break;
        }
        return iO0 - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                this.b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tpe(upe upeVar, int i) {
        this.c = upeVar;
        this.b = upeVar.a.listIterator(ww3.h1(i, upeVar));
    }
}
