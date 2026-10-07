package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class end extends a8j {
    public static final /* synthetic */ zv8[] w = {new z8b(end.class, "goToProfileJob", "getGoToProfileJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, end.class, "disableActionClickJob", "getDisableActionClickJob()Lkotlinx/coroutines/Job;")};
    public final long c;
    public final long d;
    public final zmd e;
    public final xn3 f;
    public final no4 g;
    public final String h = end.class.getName();
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final mjg o;
    public final mjg p;
    public final boolean q;
    public final ic6 r;
    public final ic6 s;
    public final p3c t;
    public final p3c u;
    public final r8e v;

    public end(long j, long j2, zmd zmdVar, xn3 xn3Var, no4 no4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = j;
        this.d = j2;
        this.e = zmdVar;
        this.f = xn3Var;
        this.g = no4Var;
        this.i = ny8Var;
        this.j = ny8Var3;
        this.k = ny8Var2;
        this.l = ny8Var4;
        this.m = ny8Var5;
        this.n = ny8Var6;
        mjg mjgVarA = p90.a(null);
        this.o = mjgVarA;
        this.p = p90.a(null);
        this.q = zmdVar == zmd.SETUP_NEW_ADMIN;
        this.r = new ic6(null);
        this.s = new ic6(null);
        this.t = qyj.S();
        this.u = qyj.S();
        e9i.j0(e9i.T(new fz6(e9i.K(new bye(new voc(new r07(new jz(xn3Var.k(j), 13), new jz(no4Var.j(j2), 13), and.h, 0), (lq4) null, this, 9)), 1), new qz9(this, (lq4) null, 27), 3), ((n0c) F()).a()), this.b);
        this.v = e9i.G0(e9i.T(e9i.I(new q0d(new jz(mjgVarA, 13), this, 3)), ((n0c) F()).a()), this.b, j0g.a, new bnd());
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0347  */
    public static final xmd B(end endVar, rt2 rt2Var, vg4 vg4Var, boolean z) {
        boolean z2;
        boolean z3;
        wmd wmdVar;
        wmd wmdVar2;
        wmd wmdVar3;
        wmd wmdVar4;
        wmd wmdVar5;
        wmd wmdVar6;
        wmd wmdVar7;
        wmd wmdVar8;
        wmd wmdVar9;
        boolean z4;
        boolean z5 = vg4Var.v() == rt2Var.b.d;
        long jT = ((s7f) ((et3) endVar.m.getValue())).t();
        boolean zB0 = rt2Var.B0();
        boolean z6 = jT == vg4Var.v();
        boolean zA = rt2Var.d0() ? srk.a(rt2Var.n(vg4Var.v()), np0.n) : srk.a(rt2Var.n(vg4Var.v()), 1);
        boolean zA2 = rt2Var.d0() ? srk.a(rt2Var.n(jT), np0.n) : rt2Var.Q();
        boolean zA3 = (rt2Var.e0() && vg4Var.E()) ? srk.a(rt2Var.n(vg4Var.v()), 32) : true;
        boolean zA4 = (rt2Var.e0() && vg4Var.E()) ? srk.a(rt2Var.n(jT), 32) : true;
        boolean zA5 = rt2Var.d0() ? srk.a(rt2Var.n(vg4Var.v()), np0.o) : srk.a(rt2Var.n(vg4Var.v()), 1);
        boolean zA6 = rt2Var.d0() ? srk.a(rt2Var.n(jT), np0.o) : rt2Var.Q();
        boolean zA7 = rt2Var.d0() ? srk.a(rt2Var.n(vg4Var.v()), 1024) : srk.a(rt2Var.n(vg4Var.v()), 1);
        boolean zA8 = rt2Var.d0() ? srk.a(rt2Var.n(jT), 1024) : rt2Var.Q();
        boolean zA9 = srk.a(rt2Var.n(vg4Var.v()), 16);
        boolean zP = rt2Var.P();
        boolean z7 = zA7;
        boolean zA10 = srk.a(rt2Var.n(vg4Var.v()), 8);
        boolean zJ = rt2Var.J();
        boolean zA11 = srk.a(rt2Var.n(vg4Var.v()), 2);
        boolean zA12 = srk.a(rt2Var.n(jT), 2);
        boolean zA13 = srk.a(rt2Var.n(vg4Var.v()), 4);
        boolean zH = rt2Var.H();
        Long lM = rt2Var.m(vg4Var.v());
        boolean z8 = z6;
        boolean z9 = (lM != null && lM.longValue() == jT && zH) || zB0;
        boolean z10 = !vg4Var.E() && srk.a(rt2Var.n(vg4Var.v()), np0.q);
        boolean z11 = !vg4Var.E() && srk.a(rt2Var.n(jT), np0.q);
        if (zB0 && z) {
            wmd wmdVar10 = new wmd(true, true);
            z2 = zP;
            wmdVar5 = wmdVar10;
            wmdVar6 = wmdVar5;
            wmdVar7 = wmdVar6;
            wmdVar9 = wmdVar7;
            wmdVar4 = wmdVar9;
            wmdVar8 = wmdVar4;
            wmdVar2 = wmdVar8;
            wmdVar3 = new wmd(false, true);
            wmdVar = vg4Var.E() ? new wmd(false, true) : wmdVar10;
        } else {
            z2 = zP;
            if (!z) {
                boolean z12 = z11;
                if (z8) {
                    wmd wmdVar11 = new wmd(zA2, false);
                    wmd wmdVar12 = new wmd(zA6, false);
                    wmd wmdVar13 = new wmd(zA3, false);
                    wmd wmdVar14 = new wmd(zA8, false);
                    wmd wmdVar15 = new wmd(z2, false);
                    wmd wmdVar16 = new wmd(zJ, false);
                    wmd wmdVar17 = new wmd(zA12, false);
                    wmdVar3 = new wmd(zH, false);
                    wmdVar5 = wmdVar11;
                    wmdVar2 = wmdVar17;
                    wmdVar4 = wmdVar15;
                    wmdVar6 = wmdVar12;
                    wmdVar7 = wmdVar13;
                    wmdVar9 = wmdVar14;
                    wmdVar8 = wmdVar16;
                    wmdVar = new wmd(z10, false);
                } else if (z5) {
                    wmdVar5 = new wmd(true, false);
                    wmdVar6 = wmdVar5;
                    wmdVar7 = wmdVar6;
                    wmdVar9 = wmdVar7;
                    wmdVar4 = wmdVar9;
                    wmdVar8 = wmdVar4;
                    wmdVar2 = wmdVar8;
                    wmdVar3 = wmdVar2;
                    wmdVar = wmdVar3;
                    z3 = true;
                } else {
                    z3 = true;
                    wmd wmdVar18 = new wmd(zA, zA2 && z9);
                    wmd wmdVar19 = new wmd(zA5, zA6 && z9);
                    wmd wmdVar20 = new wmd(zA3, zA4 && z9);
                    wmd wmdVar21 = new wmd(zA3 && z7, zA3 && zA4 && zA8 && z9);
                    wmd wmdVar22 = new wmd(zA3 && zA9, zA3 && zA4 && z2 && z9);
                    wmd wmdVar23 = new wmd(zA10, zJ && z9);
                    wmd wmdVar24 = new wmd(zA11, zA12 && z9);
                    wmd wmdVar25 = new wmd(zA13, zH && z9);
                    wmdVar = new wmd(z10, z12 && z9);
                    wmdVar2 = wmdVar24;
                    wmdVar3 = wmdVar25;
                    wmdVar4 = wmdVar22;
                    wmdVar5 = wmdVar18;
                    wmdVar6 = wmdVar19;
                    wmdVar7 = wmdVar20;
                    wmdVar8 = wmdVar23;
                    wmdVar9 = wmdVar21;
                }
                if (z && rt2Var.e0() && srk.a(rt2Var.n(vg4Var.v()), np0.m)) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                return new xmd(z2, z4, wmdVar5, wmdVar6, wmdVar7, wmdVar9, wmdVar4, wmdVar8, wmdVar2, wmdVar3, wmdVar);
            }
            wmd wmdVar26 = new wmd(zA2, zA2);
            wmd wmdVar27 = new wmd(zA6, zA6);
            wmd wmdVar28 = new wmd(zA3, zA4);
            wmd wmdVar29 = new wmd(zA8, zA8);
            wmd wmdVar30 = new wmd(z2, z2);
            wmd wmdVar31 = new wmd(zJ, zJ);
            wmd wmdVar32 = new wmd(zA12, zA12);
            wmdVar3 = new wmd(false, true);
            wmdVar5 = wmdVar26;
            wmdVar2 = wmdVar32;
            wmdVar4 = wmdVar30;
            wmdVar6 = wmdVar27;
            wmdVar7 = wmdVar28;
            wmdVar9 = wmdVar29;
            wmdVar8 = wmdVar31;
            wmdVar = new wmd(z10, z11);
        }
        z3 = true;
        if (z) {
            z4 = false;
        } else {
            z4 = false;
        }
        return new xmd(z2, z4, wmdVar5, wmdVar6, wmdVar7, wmdVar9, wmdVar4, wmdVar8, wmdVar2, wmdVar3, wmdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    public final void C() {
        xmd xmdVar;
        Object value = this.p.getValue();
        mjg mjgVar = this.o;
        if ((!cqk.d(value, mjgVar.getValue()) || this.e == zmd.SETUP_NEW_ADMIN) && (xmdVar = (xmd) mjgVar.getValue()) != null) {
            boolean z = xmdVar.f.a;
            rt2 rt2Var = (rt2) this.f.k(this.c).a.getValue();
            if (rt2Var != null) {
                long jA = rt2Var.A();
                rt2 rt2VarD = D();
                boolean zD0 = rt2VarD != null ? rt2VarD.d0() : false;
                ?? r3 = zD0 ? 0 : z;
                wmd wmdVar = xmdVar.i;
                boolean z2 = xmdVar.e.a;
                boolean z3 = wmdVar.a;
                boolean z4 = xmdVar.j.a;
                boolean z5 = xmdVar.h.a;
                boolean z6 = xmdVar.g.a && z2;
                boolean z7 = xmdVar.b;
                boolean z8 = zD0 ? xmdVar.c.a : false;
                boolean z9 = zD0 ? xmdVar.d.a : false;
                if (!zD0) {
                    z = false;
                }
                boolean z10 = zD0 ? xmdVar.k.a : false;
                if (z3) {
                    r3 = (r3 == true ? 1 : 0) | 2;
                }
                if (z4) {
                    r3 = (r3 == true ? 1 : 0) | 4;
                }
                if (z5) {
                    r3 = (r3 == true ? 1 : 0) | 8;
                }
                if (z6) {
                    r3 = (r3 == true ? 1 : 0) | 16;
                }
                if (z2) {
                    r3 = (r3 == true ? 1 : 0) | 32;
                }
                if (!zD0) {
                    r3 = (r3 == true ? 1 : 0) | 64;
                }
                if (z7) {
                    r3 = (r3 == true ? 1 : 0) | 128;
                }
                if (z8) {
                    r3 = (r3 == true ? 1 : 0) | 256;
                }
                if (z9) {
                    r3 = (r3 == true ? 1 : 0) | 512;
                }
                if (z) {
                    r3 = (r3 == true ? 1 : 0) | 1024;
                }
                if (z10) {
                    r3 = (r3 == true ? 1 : 0) | 2048;
                }
                if (r3 == 0) {
                    r3 = -1;
                }
                yab.i0(this.b, ((n0c) F()).b(), 0, new x53(this, jA, r3 == true ? 1 : 0, (lq4) null, 5), 2);
            }
        }
    }

    public final rt2 D() {
        return (rt2) this.f.k(this.c).a.getValue();
    }

    public final vg4 E() {
        return (vg4) this.g.j(this.d).a.getValue();
    }

    public final xhh F() {
        return (xhh) this.j.getValue();
    }

    public final void G(long j, boolean z) {
        String strF;
        vnh vnhVar;
        long j2 = R.id.profile_edit_admin_move_rights;
        ic6 ic6Var = this.s;
        if (j != j2) {
            if (j != R.id.profile_edit_admin_permissions_edit_chat_link) {
                if (z) {
                    H(j);
                    return;
                }
                return;
            }
            mjg mjgVar = this.o;
            xmd xmdVar = (xmd) mjgVar.getValue();
            boolean z2 = xmdVar != null && xmdVar.i.a;
            if (((xmd) mjgVar.getValue()) == null || z2) {
                return;
            }
            a8j.x(ic6Var, new umd(new tnh(R.string.profile_edit_admin_permissions_change_link_disabled), Integer.valueOf(R.drawable.icon_info_fill), false, 4));
            return;
        }
        rt2 rt2VarD = D();
        tnh tnhVar = (rt2VarD == null || !rt2VarD.d0()) ? new tnh(R.string.profile_edit_admin_permissions_change_owner_title) : new tnh(R.string.profile_edit_admin_permissions_change_owner_title);
        rt2 rt2VarD2 = D();
        if (rt2VarD2 == null || !rt2VarD2.d0()) {
            rt2 rt2VarD3 = D();
            strF = rt2VarD3 != null ? rt2VarD3.F() : null;
            vnhVar = new vnh(R.string.profile_edit_admin_permissions_change_owner_description, a.n1(new Object[]{strF != null ? strF : ""}));
        } else {
            vg4 vg4VarE = E();
            String strK = vg4VarE != null ? vg4VarE.k() : null;
            if (strK == null) {
                strK = "";
            }
            rt2 rt2VarD4 = D();
            strF = rt2VarD4 != null ? rt2VarD4.F() : null;
            vnhVar = new vnh(R.string.profile_edit_channel_admin_permissions_change_owner_description, a.n1(new Object[]{strK, strF != null ? strF : ""}));
        }
        a8j.x(ic6Var, new tmd(tnhVar, vnhVar, xw3.P0(new kc4(R.id.profile_edit_admin_permissions_change_owner_change_action, new tnh(R.string.profile_edit_admin_permissions_change_owner_change_action), 4, 56), new kc4(R.id.profile_edit_admin_permissions_change_owner_cancel_action, new tnh(R.string.profile_edit_admin_permissions_change_owner_change_cancel), 2, 56))));
    }

    public final void H(long j) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) F()).a(), 2, new tl1(j, this, (lq4) null));
        this.u.B(this, w[1], sggVarH0);
    }

    public final void I() {
        if (cqk.d(this.p.getValue(), this.o.getValue())) {
            a8j.x(this.r, rt3.b);
        } else {
            a8j.x(this.s, new tmd(new tnh(R.string.oneme_profile_edit_confirm_leave_title), null, xw3.P0(new kc4(R.id.profile_edit_confirm_save_button, new tnh(R.string.oneme_profile_edit_confirm_save_action), 3, 56), new kc4(R.id.profile_edit_confirm_exit_button, new tnh(R.string.oneme_profile_edit_confirm_exit_action), 2, 56))));
        }
    }
}
