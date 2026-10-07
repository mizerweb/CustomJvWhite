package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b47 {
    public final ny8 b;
    public final ny8 c;
    public final String a = b47.class.getName();
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicReference e = new AtomicReference(null);

    public b47(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    public final void a() {
        je9 je9Var = je9.d;
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "tryToFetchAll", null);
        }
        vo8 vo8Var = (vo8) this.e.get();
        if (vo8Var == null || !vo8Var.isActive()) {
            this.e.set(yab.i0((wmi) this.b.getValue(), null, 0, new v11(this, null), 3));
            return;
        }
        String str2 = this.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "tryToFetchAll: already running", null);
        }
    }
}
