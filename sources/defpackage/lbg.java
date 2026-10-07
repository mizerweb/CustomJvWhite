package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lbg implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ hbg d;

    public lbg(hbg hbgVar) {
        this.d = hbgVar;
    }

    public final Iterator a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        hbg hbgVar = this.d;
        return i < hbgVar.b.size() || (!hbgVar.c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        hbg hbgVar = this.d;
        return i < hbgVar.b.size() ? (Map.Entry) hbgVar.b.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            ore.k("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = hbg.g;
        hbg hbgVar = this.d;
        hbgVar.b();
        if (this.a >= hbgVar.b.size()) {
            a().remove();
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        hbgVar.g(i2);
    }
}
