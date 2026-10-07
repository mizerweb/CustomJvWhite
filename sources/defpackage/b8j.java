package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b8j {
    public final d8j a = new d8j();

    public final void a() {
        d8j d8jVar = this.a;
        if (d8jVar != null && !d8jVar.d) {
            d8jVar.d = true;
            synchronized (d8jVar.a) {
                try {
                    Iterator it = d8jVar.b.values().iterator();
                    while (it.hasNext()) {
                        d8j.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = d8jVar.c.iterator();
                    while (it2.hasNext()) {
                        d8j.a((AutoCloseable) it2.next());
                    }
                    d8jVar.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
