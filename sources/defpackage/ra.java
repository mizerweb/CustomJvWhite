package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ra extends kc5 {
    public final /* synthetic */ int e;
    public final long f;
    public final ny8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, int i) {
        super(ny8Var2, ny8Var3, ny8Var4, ny8Var6);
        this.e = i;
        this.f = j;
        this.g = ny8Var;
    }

    @Override // defpackage.kc5
    public ynh a(vg4 vg4Var) {
        switch (this.e) {
            case 1:
                rt2 rt2VarI = i();
                if (rt2VarI != null) {
                    String strK = rt2VarI.k(vg4Var.v());
                    if (strK != null && !r5h.X0(strK)) {
                        return new xnh(strK);
                    }
                    if (rt2VarI.v0(vg4Var.v())) {
                        return new tnh(R.string.profile_members_list_owner_alias);
                    }
                    if (rt2VarI.Y(vg4Var.v())) {
                        return new tnh(R.string.profile_members_list_admin_alias);
                    }
                }
                return null;
            default:
                return super.a(vg4Var);
        }
    }

    @Override // defpackage.kc5
    public ynh d(vg4 vg4Var) {
        switch (this.e) {
            case 0:
                if (c().c(h(), vg4Var)) {
                    return super.d(vg4Var);
                }
                if (vg4Var.f) {
                    return new tnh(R.string.profile_members_list_item_is_self);
                }
                rt2 rt2VarH = h();
                return (rt2VarH == null || !rt2VarH.Y(vg4Var.v())) ? super.d(vg4Var) : new tnh(R.string.profile_members_list_item_added_admin);
            default:
                return super.d(vg4Var);
        }
    }

    @Override // defpackage.kc5
    public boolean e(vg4 vg4Var) {
        rt2 rt2VarH;
        switch (this.e) {
            case 0:
                return (c().c(h(), vg4Var) || vg4Var.f || ((rt2VarH = h()) != null && rt2VarH.Y(vg4Var.v()))) ? false : true;
            default:
                return super.e(vg4Var);
        }
    }

    @Override // defpackage.kc5
    public boolean f(vg4 vg4Var) {
        rt2 rt2VarI;
        switch (this.e) {
            case 1:
                boolean z = vg4Var.v() != ((s7f) b()).t();
                rt2 rt2VarI2 = i();
                boolean z2 = (rt2VarI2 == null || rt2VarI2.v0(vg4Var.v())) ? false : true;
                rt2 rt2VarI3 = i();
                boolean z3 = rt2VarI3 != null && srk.a(rt2VarI3.n(((s7f) b()).t()), 4) && (rt2VarI = i()) != null && rt2VarI.Y(vg4Var.v());
                rt2 rt2VarI4 = i();
                boolean z4 = rt2VarI4 != null && rt2VarI4.Y(vg4Var.v());
                if (z2 && z) {
                    return z3 || !z4;
                }
                return false;
            default:
                return super.f(vg4Var);
        }
    }

    @Override // defpackage.kc5
    public l8a g(vg4 vg4Var) {
        switch (this.e) {
            case 1:
                l8a l8aVarG = super.g(vg4Var);
                rt2 rt2VarI = i();
                boolean z = false;
                if (rt2VarI != null && rt2VarI.v0(vg4Var.v())) {
                    z = true;
                }
                return l8a.i(l8aVarG, z);
            default:
                return super.g(vg4Var);
        }
    }

    public rt2 h() {
        return (rt2) ((xn3) this.g.getValue()).k(this.f).a.getValue();
    }

    public rt2 i() {
        return (rt2) ((xn3) this.g.getValue()).k(this.f).a.getValue();
    }
}
