package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jpd {
    public final t51 a;
    public final pzf b = e9i.b(0, 0, 7);
    public final dq4 c;

    public jpd(t51 t51Var, xhh xhhVar) {
        this.a = t51Var;
        this.c = cqk.a(((n0c) xhhVar).c());
    }

    @l7h
    public final void onEvent(yq0 yq0Var) {
        ynh tnhVar;
        Long lValueOf = Long.valueOf(yq0Var.a);
        yhh yhhVar = yq0Var.b;
        String str = yhhVar.d;
        String str2 = yhhVar.b;
        if (str != null && str.length() != 0) {
            tnhVar = new xnh(str);
        } else if (p90.C(str2) && cqk.d(str2, "io.exception")) {
            tnhVar = new tnh(R.string.common_network_error);
        } else {
            tnhVar = (!p90.C(str2) || cqk.d(str2, "io.exception")) ? new tnh(R.string.common_error_base_retry) : new tnh(R.string.common_service_error);
        }
        yab.i0(this.c, null, 0, new l0d(this, new fpd(lValueOf, tnhVar), null, 15), 3);
    }

    @l7h
    public final void onEvent(eg3 eg3Var) {
        yab.i0(this.c, null, 0, new l0d(this, new gpd(Long.valueOf(eg3Var.a)), null, 15), 3);
    }
}
