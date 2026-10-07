package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a71 implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ c71 c;

    public a71(c71 c71Var) {
        this.c = c71Var;
        this.b = c71Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.b[i]);
        }
        qr7.d();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
