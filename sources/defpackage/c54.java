package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class c54 {
    public final cy5 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public c54(cy5 cy5Var) {
        this.a = cy5Var;
    }

    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.a.getClass();
        cy5.a(this);
    }

    public final void b(int i, String str) {
        this.c.put(Integer.valueOf(i), str);
    }

    public final void c(int i, String str) {
        this.b.put(Integer.valueOf(i), str);
    }
}
