package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nv1 extends a8j {
    public final ny8 c;
    public final ny8 d;
    public final mjg e = p90.a(new hv1(null));
    public final r8e f;
    public final mjg g;
    public final r8e h;
    public final mjg i;
    public final r8e j;
    public final ic6 k;

    public nv1(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = ny8Var;
        this.d = ny8Var2;
        this.f = ((xn3) ny8Var3.getValue()).l(j);
        mjg mjgVarA = p90.a(new mv1(false));
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(r66.a);
        this.i = mjgVarA2;
        this.j = new r8e(mjgVarA2);
        this.k = new ic6(null);
        yab.i0(this.b, null, 0, new m5(this, null, 14), 3);
    }

    public final boolean B() {
        CharSequence charSequence = ((hv1) this.e.getValue()).a;
        rt2 rt2Var = (rt2) this.f.a.getValue();
        return !z5h.E0(charSequence, rt2Var != null ? rt2Var.F() : null);
    }

    public final void C(CharSequence charSequence) {
        mjg mjgVar;
        Object value;
        boolean zB;
        c79 c79VarW = yab.w();
        CharSequence charSequence2 = ((hv1) this.e.getValue()).a;
        c79VarW.add(new iv1((charSequence2 == null || r5h.X0(charSequence2)) ? new tnh(R.string.call_presettings_change_call_name_empty_error) : null, charSequence != null ? new xnh(charSequence) : null));
        this.i.setValue(yab.j(c79VarW));
        do {
            mjgVar = this.g;
            value = mjgVar.getValue();
            zB = B();
            ((mv1) value).getClass();
        } while (!mjgVar.h(value, new mv1(zB)));
    }
}
