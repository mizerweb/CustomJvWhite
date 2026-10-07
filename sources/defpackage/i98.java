package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i98 implements Iterator {
    public final gri[] a;
    public int b = 0;

    public i98(gri[] griVarArr) {
        this.a = griVarArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        gri[] griVarArr = this.a;
        if (i >= griVarArr.length) {
            qr7.d();
            return null;
        }
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(griVarArr[i], griVarArr[i + 1]);
        this.b += 2;
        return simpleImmutableEntry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
