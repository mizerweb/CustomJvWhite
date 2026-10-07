package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sv5 implements Iterator, uv8 {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public int c;

    public sv5(tv5 tv5Var, byte b) {
        this.c = tv5Var.c;
        this.b = tv5Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.c > 0 && it.hasNext();
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new dd8(i2, it.next());
                }
                xw3.V0();
                throw null;
            default:
                int i3 = this.c;
                if (i3 != 0) {
                    this.c = i3 - 1;
                    return it.next();
                }
                qr7.d();
                return null;
        }
        while (this.c > 0 && it.hasNext()) {
            it.next();
            this.c--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public sv5(Iterator it) {
        this.b = it;
    }

    public sv5(tv5 tv5Var) {
        this.b = tv5Var.b.iterator();
        this.c = tv5Var.c;
    }
}
