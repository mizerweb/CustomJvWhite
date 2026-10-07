package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kde extends a8j {
    public final cde c;
    public final Boolean d;
    public final h02 e;
    public final w82 f;
    public final k42 g;
    public final ny8 h;
    public final ny8 i;
    public final r8e j;
    public final r07 k;
    public final ic6 l;

    public kde(cde cdeVar, Boolean bool, h02 h02Var, w82 w82Var, k42 k42Var, ny8 ny8Var, ny8 ny8Var2) {
        Object value;
        fde fdeVar;
        this.c = cdeVar;
        this.d = bool;
        this.e = h02Var;
        this.f = w82Var;
        this.g = k42Var;
        this.h = ny8Var;
        this.i = ny8Var2;
        lq4 lq4Var = null;
        mjg mjgVarA = p90.a(null);
        this.j = new r8e(mjgVarA);
        int i = 0;
        this.k = new r07(e9i.G0(e9i.I(new r07(e9i.I(new hde(w82Var.r, 1)), w82Var.t, new vzc(this, lq4Var, 6), i)), this.b, j0g.a, ty1.g), w82Var.c().n(), new vzc(this, lq4Var, 5), i);
        this.l = new ic6(null);
        do {
            value = mjgVarA.getValue();
            int iOrdinal = this.c.ordinal();
            if (iOrdinal != 0) {
                zxb zxbVar = zxb.SECONDARY;
                zxb zxbVar2 = zxb.DESTRUCTIVE;
                if (iOrdinal == 1) {
                    fdeVar = new fde(new tnh(R.string.call_screen_record_me_owner_exit_title), new tnh(R.string.call_screen_record_me_owner_exit_subtitle), new ede(R.id.call_screen_record_me_owner_exit_negative, new tnh(R.string.call_screen_record_me_owner_exit_negative_btn), zxbVar2), new ede(R.id.call_screen_record_me_owner_exit_positive, new tnh(R.string.call_screen_record_me_owner_exit_positive_btn), zxbVar), ynh.b, false);
                } else {
                    if (iOrdinal != 2) {
                        ore.o();
                        throw null;
                    }
                    tnh tnhVar = new tnh(R.string.call_screen_record_admin_exit_title);
                    ede edeVar = new ede(R.id.call_screen_record_admin_stop_record, new tnh(R.string.call_screen_record_admin_exit_negative_btn), zxbVar2);
                    ede edeVar2 = new ede(R.id.call_screen_record_admin_skip_record, new tnh(R.string.call_screen_record_admin_exit_positive_btn), zxbVar);
                    String str = ((l9) this.f.r.a.getValue()).d.c;
                    fdeVar = new fde(tnhVar, null, edeVar, edeVar2, new xnh(str == null ? "" : str), true);
                }
            } else {
                fdeVar = null;
            }
        } while (!mjgVarA.h(value, fdeVar));
        if (this.c == cde.b) {
            e9i.j0(new fz6(new hde(this.f.c().j(), i), new c37(this, lq4Var, 26), 3), this.b);
        }
    }
}
