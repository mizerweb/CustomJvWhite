package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class und {
    public final pzf a = e9i.b(0, 0, 7);
    public final dq4 b;

    public und(t51 t51Var, ny8 ny8Var) {
        this.b = cqk.a(((n0c) ((xhh) ny8Var.getValue())).c());
        t51Var.d(this);
    }

    public static final ynh a(und undVar, yhh yhhVar) {
        String str = yhhVar.d;
        String str2 = yhhVar.b;
        if (str != null && str.length() != 0) {
            return new xnh(str);
        }
        if (p90.C(str2) && cqk.d(str2, "io.exception")) {
            return new tnh(R.string.common_network_error);
        }
        return (!p90.C(str2) || cqk.d(str2, "io.exception")) ? new tnh(R.string.common_error_base_retry) : new tnh(R.string.common_service_error);
    }

    @l7h
    public final void onEvent(hpd hpdVar) {
        yab.i0(this.b, null, 0, new l0d(this, hpdVar, null, 10), 3);
    }

    @l7h
    public final void onEvent(dkd dkdVar) {
        yab.i0(this.b, null, 0, new l0d(this, dkdVar, null, 11), 3);
    }

    @l7h
    public final void onEvent(yq0 yq0Var) {
        yab.i0(this.b, null, 0, new l0d(this, yq0Var, null, 12), 3);
    }

    @l7h
    public final void onEvent(dpd dpdVar) {
        yab.i0(this.b, null, 0, new l0d(this, dpdVar, null, 13), 3);
    }

    @l7h
    public final void onEvent(eg3 eg3Var) {
        yab.i0(this.b, null, 0, new l0d(this, eg3Var, null, 14), 3);
    }
}
