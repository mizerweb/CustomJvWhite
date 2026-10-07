package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j9 implements dk5 {
    public final ny8 a;
    public final ny8 b;
    public final long c;
    public final dq4 d;
    public up8 e;
    public final r8e f;

    public j9(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        long jIncrementAndGet = ej5.b.incrementAndGet();
        this.c = jIncrementAndGet;
        this.d = cqk.a(((n0c) ((xhh) ny8Var.getValue())).a());
        this.e = qyj.a(sbi.a);
        this.f = new r8e(p90.a(xw3.R0(new e55(jIncrementAndGet, new tnh(R.string.oneme_settings_dump_active_notifications), R.drawable.icon_copy, null, b55.a, 8))));
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.f;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        if (!ej5.a(e55Var.a, this.c) || this.e.isActive()) {
            return;
        }
        this.e = yab.i0(this.d, null, 0, new jhc(this, null, 3), 3);
    }
}
