package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class zc8 implements Iterator, uv8 {
    public int a;
    public int b;
    public boolean c;

    public zc8(int i) {
        this.a = i;
    }

    public abstract Object a(int i);

    public abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qr7.d();
            return null;
        }
        Object objA = a(this.b);
        this.b++;
        this.c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            gol.d("Call next() before removing an element.");
            throw null;
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }
}
