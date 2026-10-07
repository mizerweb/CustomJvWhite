package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d4 implements Iterator {
    public final /* synthetic */ int a = 1;
    public Iterator b;

    public d4(b5h b5hVar, Iterator it) {
        this.b = it;
        if (it.hasNext()) {
            ((Map.Entry) it.next()).getKey().getClass();
            ore.m();
            throw null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                throw new NoSuchElementException();
            default:
                return (String) this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ d4() {
    }
}
