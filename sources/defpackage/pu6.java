package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pu6 implements Iterator, uv8 {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ ohf e;

    public pu6(qu6 qu6Var) {
        this.a = 0;
        this.e = qu6Var;
        this.b = qu6Var.a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        qu6 qu6Var = (qu6) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) qu6Var.c.invoke(next)).booleanValue() != qu6Var.b);
        this.d = next;
        this.c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            Object next = it3.next();
            kx6 kx6Var = (kx6) this.e;
            it = (Iterator) kx6Var.c.invoke(kx6Var.b.invoke(next));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            default:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    qr7.d();
                    return null;
                }
                Object obj = this.d;
                this.d = null;
                this.c = -1;
                return obj;
            default:
                int i = this.c;
                if (i == 2) {
                    qr7.d();
                } else {
                    if (i != 0 || b()) {
                        this.c = 0;
                        return ((Iterator) this.d).next();
                    }
                    qr7.d();
                }
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public pu6(kx6 kx6Var) {
        this.a = 1;
        this.e = kx6Var;
        this.b = kx6Var.a.iterator();
    }
}
