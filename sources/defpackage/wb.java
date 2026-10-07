package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wb extends a8j {
    public final ny8 c;
    public final mjg d;
    public final r8e e;
    public final ic6 f;

    public wb(ny8 ny8Var) {
        this.c = ny8Var;
        mjg mjgVarA = p90.a(new ub("", "", ynh.b));
        this.d = mjgVarA;
        this.e = new r8e(mjgVarA);
        this.f = new ic6(null);
    }

    public final void B() {
        Object value;
        ub ubVar;
        ynh tnhVar;
        int i;
        mjg mjgVar = this.d;
        ub ubVar2 = (ub) mjgVar.getValue();
        x59 x59VarA = ((y59) this.c.getValue()).a(ubVar2.a, false);
        do {
            value = mjgVar.getValue();
            ubVar = (ub) value;
            if (x59VarA instanceof v59) {
                int i2 = vb.$EnumSwitchMapping$0[qt4.D(((v59) x59VarA).a)];
                if (i2 == 1) {
                    i = R.string.add_link_error_not_valid_link;
                } else if (i2 == 2) {
                    i = R.string.add_link_error_short_link;
                } else if (i2 == 3) {
                    i = R.string.add_link_error_has_space;
                } else {
                    if (i2 != 4) {
                        ore.o();
                        return;
                    }
                    i = R.string.oneme_stories_add_link_error_not_valid_scheme;
                }
                tnhVar = new tnh(i);
            } else {
                tnhVar = ynh.b;
            }
        } while (!mjgVar.h(value, ub.a(ubVar, null, null, tnhVar, 3)));
        boolean z = x59VarA instanceof w59;
        ic6 ic6Var = this.f;
        if (!z) {
            a8j.x(ic6Var, sb.a);
            return;
        }
        String str = ubVar2.a;
        String str2 = ubVar2.b;
        a8j.x(ic6Var, new rb(str, r5h.X0(str2) ? null : str2));
    }
}
