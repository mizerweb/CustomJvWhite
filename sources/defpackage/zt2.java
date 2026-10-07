package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zt2 extends kc5 {
    public final long e;
    public final ny8 f;
    public final ny8 g;

    public zt2(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        super(ny8Var3, ny8Var4, ny8Var5, ny8Var7);
        this.e = j;
        this.f = ny8Var;
        this.g = ny8Var2;
    }

    @Override // defpackage.kc5
    public final ynh d(vg4 vg4Var) {
        String strK;
        rt2 rt2VarH = h();
        Long lM = rt2VarH != null ? rt2VarH.m(vg4Var.v()) : null;
        if (c().c(h(), vg4Var)) {
            return super.d(vg4Var);
        }
        if (vg4Var.f) {
            return new tnh(R.string.profile_members_list_item_is_self);
        }
        long jT = ((s7f) b()).t();
        if (lM != null && lM.longValue() == jT) {
            return new tnh(R.string.profile_admins_list_item_added_admin_by_you);
        }
        rt2 rt2VarH2 = h();
        if (rt2VarH2 != null && rt2VarH2.v0(vg4Var.v())) {
            rt2 rt2VarH3 = h();
            return new tnh((rt2VarH3 == null || !rt2VarH3.d0()) ? R.string.profile_members_list_owner_chat_alias : R.string.profile_members_list_owner_channel_alias);
        }
        if (lM == null) {
            return super.d(vg4Var);
        }
        vg4 vg4Var2 = (vg4) ((no4) this.g.getValue()).j(lM.longValue()).a.getValue();
        return (vg4Var2 == null || (strK = vg4Var2.k()) == null) ? super.d(vg4Var) : new vnh(R.string.profile_admins_list_item_added_admin_by_other, a.n1(new Object[]{strK}));
    }

    @Override // defpackage.kc5
    public final boolean f(vg4 vg4Var) {
        rt2 rt2VarH;
        if (!c().c(h(), vg4Var)) {
            boolean z = vg4Var.v() != ((s7f) b()).t();
            rt2 rt2VarH2 = h();
            boolean z2 = (rt2VarH2 == null || rt2VarH2.v0(vg4Var.v())) ? false : true;
            rt2 rt2VarH3 = h();
            boolean z3 = rt2VarH3 != null && srk.a(rt2VarH3.n(((s7f) b()).t()), 4) && (rt2VarH = h()) != null && rt2VarH.Y(vg4Var.v());
            rt2 rt2VarH4 = h();
            boolean z4 = rt2VarH4 != null && rt2VarH4.Y(vg4Var.v());
            if (z2 && z && (z3 || !z4)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kc5
    public final l8a g(vg4 vg4Var) {
        l8a l8aVarG = super.g(vg4Var);
        rt2 rt2VarH = h();
        boolean z = false;
        if (rt2VarH != null && rt2VarH.v0(vg4Var.v())) {
            z = true;
        }
        return l8a.i(l8aVarG, z);
    }

    public final rt2 h() {
        return (rt2) ((xn3) this.f.getValue()).k(this.e).a.getValue();
    }
}
