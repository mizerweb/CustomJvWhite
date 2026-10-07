package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h7h implements Iterator, uv8 {
    public final Iterator a;
    public int b;
    public final /* synthetic */ i7h c;

    public h7h(i7h i7hVar) {
        this.c = i7hVar;
        this.a = i7hVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        i7h i7hVar;
        Iterator it;
        while (true) {
            int i = this.b;
            i7hVar = this.c;
            int i2 = i7hVar.b;
            it = this.a;
            if (i >= i2 || !it.hasNext()) {
                break;
            }
            it.next();
            this.b++;
        }
        return this.b < i7hVar.c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        i7h i7hVar;
        Iterator it;
        while (true) {
            int i = this.b;
            i7hVar = this.c;
            int i2 = i7hVar.b;
            it = this.a;
            if (i >= i2 || !it.hasNext()) {
                break;
            }
            it.next();
            this.b++;
        }
        int i3 = this.b;
        if (i3 < i7hVar.c) {
            this.b = i3 + 1;
            return it.next();
        }
        qr7.d();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
