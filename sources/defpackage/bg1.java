package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bg1 extends a8j {
    public final ny8 c;
    public final mjg d;
    public final r8e e;

    public bg1(ny8 ny8Var) {
        this.c = ny8Var;
        mjg mjgVarA = p90.a(r66.a);
        this.d = mjgVarA;
        this.e = new r8e(mjgVarA);
        B();
    }

    public final void B() {
        mjg mjgVar;
        Object value;
        c79 c79VarW;
        do {
            mjgVar = this.d;
            value = mjgVar.getValue();
            c79VarW = yab.w();
            int i = vyb.u;
            c79VarW.add(new zf1(new tnh(R.string.call_debug_menu_settings_actions_header)));
            c79VarW.add(new yf1(1, vyb.q, new tnh(R.string.call_debug_menu_settings_crash)));
            c79VarW.add(new yf1(3, vyb.r, new tnh(R.string.call_debug_menu_settings_nonfatal)));
        } while (!mjgVar.h(value, yab.j(c79VarW)));
    }
}
