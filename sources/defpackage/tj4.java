package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tj4 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public tj4(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    public final void a(rj4 rj4Var, long[] jArr, long j) {
        List listH = rj4Var.h();
        ((bi4) this.b.getValue()).m(listH, jArr);
        pw pwVar = new pw(0);
        Iterator it = ((ArrayList) listH).iterator();
        while (it.hasNext()) {
            pwVar.add(Long.valueOf(((pj4) it.next()).a));
        }
        for (long j2 : jArr) {
            pwVar.add(Long.valueOf(j2));
        }
        ((cic) this.d.getValue()).c(listH);
        if (pwVar.isEmpty()) {
            return;
        }
        ((bl8) this.c.getValue()).a(pwVar);
        ((t51) this.a.getValue()).c(new so4(j, pwVar));
    }
}
