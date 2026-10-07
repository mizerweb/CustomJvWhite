package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class j88 implements Iterator {
    public final gri[] a;
    public int b = 0;

    public j88(gri[] griVarArr) {
        this.a = griVarArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != this.a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        gri[] griVarArr = this.a;
        if (i < griVarArr.length) {
            this.b = i + 1;
            return griVarArr[i];
        }
        qr7.d();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
