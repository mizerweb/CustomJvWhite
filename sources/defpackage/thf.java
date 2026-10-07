package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class thf implements Iterator, lq4, uv8 {
    public int a;
    public Object b;
    public Iterator c;
    public lq4 d;

    public final RuntimeException a() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void b(Object obj, koe koeVar) {
        this.b = obj;
        this.a = 3;
        this.d = koeVar;
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        return k66.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                if (this.c.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            lq4 lq4Var = this.d;
            this.d = null;
            lq4Var.resumeWith(sbi.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            qr7.d();
            return null;
        }
        if (i == 2) {
            this.a = 1;
            return this.c.next();
        }
        if (i != 3) {
            throw a();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.lq4
    public final void resumeWith(Object obj) {
        ch3.d0(obj);
        this.a = 4;
    }
}
