package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tl9 extends sl9 implements Iterator, uv8 {
    @Override // java.util.Iterator
    public final Object next() {
        a();
        int i = this.a;
        ul9 ul9Var = (ul9) this.d;
        if (i >= ul9Var.f) {
            qr7.d();
            return null;
        }
        this.a = i + 1;
        this.b = i;
        Object obj = ul9Var.b[i];
        d();
        return obj;
    }
}
