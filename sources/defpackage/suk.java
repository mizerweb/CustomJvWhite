package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
abstract class suk implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ evk d;

    public /* synthetic */ suk(evk evkVar, puk pukVar) {
        this.d = evkVar;
        this.a = evkVar.e;
        this.b = evkVar.h();
    }

    private final void b() {
        if (this.d.e == this.a) {
            return;
        }
        c.c();
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            qr7.d();
            return null;
        }
        int i = this.b;
        this.c = i;
        Object objA = a(i);
        this.b = this.d.i(this.b);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        vpk.f(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        int i = this.c;
        evk evkVar = this.d;
        evkVar.remove(evk.j(evkVar, i));
        this.b--;
        this.c = -1;
    }
}
