package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l2i implements Iterator, uv8 {
    public final Iterator a;
    public final /* synthetic */ m2i b;

    public l2i(m2i m2iVar) {
        this.b = m2iVar;
        this.a = m2iVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.b.invoke(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
