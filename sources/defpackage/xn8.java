package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class xn8 implements Iterator {
    public Iterator a;
    public Iterator b;
    public Iterator c;
    public ArrayDeque d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.c;
                if (it3 != null && it3.hasNext()) {
                    it = this.c;
                    break;
                }
                ArrayDeque arrayDeque = this.d;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    it = null;
                    break;
                }
                this.c = (Iterator) this.d.removeFirst();
            }
            this.c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.b = it4;
            if (it4 instanceof xn8) {
                xn8 xn8Var = (xn8) it4;
                this.b = xn8Var.b;
                if (this.d == null) {
                    this.d = new ArrayDeque();
                }
                this.d.addFirst(this.c);
                if (xn8Var.d != null) {
                    while (!xn8Var.d.isEmpty()) {
                        this.d.addFirst((Iterator) xn8Var.d.removeLast());
                    }
                }
                this.c = xn8Var.c;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qr7.d();
            return null;
        }
        Iterator it = this.b;
        this.a = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.a;
        if (it == null) {
            ore.k("no calls to next() since the last call to remove()");
        } else {
            it.remove();
            this.a = null;
        }
    }
}
