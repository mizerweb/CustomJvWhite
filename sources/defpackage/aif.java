package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class aif implements Iterator, uv8 {
    public boolean a = true;
    public final /* synthetic */ Object b;

    public aif(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            this.a = false;
            return this.b;
        }
        qr7.d();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
