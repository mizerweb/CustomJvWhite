package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fj5 implements dk5 {
    public final ny8 a;
    public final long b;
    public final long c;
    public final r8e d;

    public fj5(ny8 ny8Var) {
        this.a = ny8Var;
        AtomicLong atomicLong = ej5.b;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        this.b = jIncrementAndGet;
        long jIncrementAndGet2 = atomicLong.incrementAndGet();
        this.c = jIncrementAndGet2;
        this.d = new r8e(p90.a(xw3.P0(new e55(jIncrementAndGet, new xnh("Check"), R.drawable.icon_new_story, null, null, 24), new e55(jIncrementAndGet2, new xnh("Reset lang settings"), R.drawable.icon_globe, null, null, 24))));
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.d;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        long j = e55Var.a;
        if (ej5.a(j, this.b)) {
            x3i x3iVar = (x3i) this.a.getValue();
            yab.i0(x3iVar.d, null, 0, new u3i(x3iVar, null, 0), 3);
        } else if (ej5.a(j, this.c)) {
            pw pwVar = kc9.a;
            gm0.n("LocaleHelper", "resetToSystemLocale");
            kr.i(mc9.b);
        }
    }
}
