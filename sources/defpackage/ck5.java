package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ck5 implements dk5 {
    public final long a;
    public final long b;
    public final long c;
    public final r8e d;

    public ck5() {
        AtomicLong atomicLong = ej5.b;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        this.a = jIncrementAndGet;
        long jIncrementAndGet2 = atomicLong.incrementAndGet();
        this.b = jIncrementAndGet2;
        long jIncrementAndGet3 = atomicLong.incrementAndGet();
        this.c = jIncrementAndGet3;
        tnh tnhVar = new tnh(R.string.oneme_settings_old_dev_menu);
        c55 c55Var = c55.a;
        this.d = new r8e(p90.a(xw3.P0(new e55(jIncrementAndGet, tnhVar, R.drawable.icon_block_contact, null, c55Var, 8), new e55(jIncrementAndGet2, new tnh(R.string.oneme_settings_old_logs_menu), R.drawable.icon_archive_fill, null, c55Var, 8), new e55(jIncrementAndGet3, new xnh("Дебаг памяти"), R.drawable.icon_copy, null, c55Var, 8))));
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.d;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        long j = e55Var.a;
        if (ej5.a(j, this.b)) {
            o65.c(sj5.b.b(), ":settings/dev/logsviewer", null, null, 6);
        } else if (ej5.a(j, this.a)) {
            o65.c(sj5.b.b(), ":settings/dev/showroom", null, null, 6);
        } else if (ej5.a(j, this.c)) {
            o65.c(sj5.b.b(), ":settings/dev/memorydebugger", null, null, 6);
        }
    }
}
