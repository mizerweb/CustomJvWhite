package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.a;
import one.me.profile.ProfileScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ga3 extends wjd {
    public static final /* synthetic */ zv8[] A;
    public final gu4 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final String o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final AtomicLong y;
    public final p3c z;

    static {
        z8b z8bVar = new z8b(ga3.class, "organizationInfoJob", "getOrganizationInfoJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        A = new zv8[]{z8bVar};
    }

    public ga3(long j, dq4 dq4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16) {
        super(j, ny8Var, ny8Var2, ny8Var3, ny8Var16);
        this.i = dq4Var;
        this.j = ny8Var4;
        this.k = ny8Var5;
        this.l = ny8Var7;
        this.m = ny8Var8;
        this.n = ny8Var2;
        this.o = ga3.class.getName();
        this.p = ny8Var9;
        this.q = ny8Var10;
        this.r = ny8Var12;
        this.s = ny8Var13;
        this.t = ny8Var14;
        this.u = ny8Var16;
        this.v = rx8.P(3, new yk1(28, this));
        this.w = rx8.P(3, new k82(25));
        this.x = ny8Var15;
        this.y = new AtomicLong();
        this.z = qyj.S();
        e9i.j0(e9i.T(new fz6(e9i.R(new bye(new f00(new jz(((xn3) ny8Var4.getValue()).k(j), 13), (lq4) null, this, ny8Var11, 20)), new fze(this, ny8Var6, (lq4) null, 14)), new in1(this, (lq4) null, 27), 3), ((n0c) ((xhh) ny8Var7.getValue())).a()), dq4Var);
    }

    @Override // defpackage.wjd
    public final i65 B() {
        trd.b.getClass();
        return new i65(":profile/avatars?id=" + this.a + "&type=local_chat");
    }

    @Override // defpackage.wjd
    public final qud C() {
        bkd bkdVar;
        CharSequence charSequence;
        tjd tjdVar = (tjd) this.f.a.getValue();
        if (tjdVar == null || (bkdVar = tjdVar.a) == null || (charSequence = bkdVar.e) == null) {
            return null;
        }
        int iL = l();
        rt2 rt2VarJ = J();
        ny8 ny8Var = this.w;
        if (rt2VarJ == null || !rt2VarJ.i()) {
            mld mldVar = (mld) ny8Var.getValue();
            rt2 rt2VarJ2 = J();
            return mldVar.a(iL, charSequence, rt2VarJ2 != null && rt2VarJ2.z0());
        }
        mld mldVar2 = (mld) ny8Var.getValue();
        mldVar2.getClass();
        int iD = qt4.D(iL);
        if (iD == 0) {
            vnh vnhVar = new vnh(R.string.leave_chat_with_title, a.n1(new Object[]{charSequence}));
            c79 c79VarW = yab.w();
            c79VarW.add(new kc4(R.id.profile_leave_chat_and_move_rights_confirmation_sheet_confirm, new tnh(R.string.profile_leave_chat_and_move_rights_bottom_sheet_confirm), 3, 32));
            c79VarW.add(new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.profile_leave_chat_bottom_sheet_cancel), 2, 32));
            return new jud(vnhVar, null, yab.j(c79VarW), null);
        }
        if (iD == 1) {
            return mldVar2.d();
        }
        if (iD != 2) {
            if (iD == 3) {
                return mldVar2.d();
            }
            ore.o();
            return null;
        }
        vnh vnhVar2 = new vnh(R.string.profile_leave_channel_bottom_sheet_title, a.n1(new Object[]{charSequence}));
        tnh tnhVar = new tnh(R.string.profile_leave_channel_bottom_sheet_description);
        c79 c79VarW2 = yab.w();
        c79VarW2.add(new kc4(R.id.profile_leave_chat_and_move_rights_confirmation_sheet_confirm, new tnh(R.string.profile_leave_chat_and_move_rights_bottom_sheet_confirm), 1, 56));
        c79VarW2.add(new kc4(R.id.profile_confirmation_sheet_cancel, new tnh(R.string.profile_leave_chat_bottom_sheet_cancel), 3, 56));
        return new jud(vnhVar2, tnhVar, yab.j(c79VarW2), null);
    }

    @Override // defpackage.wjd
    public final qud D(int i, long j) {
        rt2 rt2VarJ = J();
        if (rt2VarJ == null || !rt2VarJ.z0() || j == ((s7f) ((et3) this.n.getValue())).t()) {
            return null;
        }
        fmd fmdVar = (fmd) this.v.getValue();
        fmdVar.getClass();
        c79 c79VarW = yab.w();
        c79VarW.add((rp4) fmdVar.m.getValue());
        return new mud(j, yab.j(c79VarW), i);
    }

    @Override // defpackage.wjd
    public final qud E(long j) {
        String strK;
        vg4 vg4Var = (vg4) ((no4) this.k.getValue()).j(j).a.getValue();
        if (vg4Var == null || (strK = vg4Var.k()) == null) {
            return null;
        }
        mld mldVar = (mld) this.w.getValue();
        int iL = l();
        mldVar.getClass();
        int iD = qt4.D(iL);
        if (iD == 0) {
            return new jud(new vnh(R.string.profile_members_list_delete_one_from_chat_title, a.n1(new Object[]{strK})), null, xw3.P0(new kc4(R.id.profile_members_list_delete_from_chat_btn, new tnh(R.string.profile_members_list_delete_from_chat_btn), 1, 56), new kc4(R.id.profile_members_list_delete_from_chat_btn_with_clean, new tnh(R.string.profile_members_list_delete_from_chat_btn_with_clean), 1, 56), new kc4(R.id.profile_members_list_delete_from_chat_btn_cancel, new tnh(R.string.profile_members_list_delete_from_chat_cancel), 2, 56)), n1g.i(new ylc("profile:participant_id_for_action", Long.valueOf(j))));
        }
        if (iD == 1 || iD == 2 || iD == 3) {
            return mldVar.d();
        }
        ore.o();
        return null;
    }

    public final rt2 J() {
        return (rt2) ((xn3) this.j.getValue()).k(this.a).a.getValue();
    }

    public final Long K(rt2 rt2Var) {
        dx2 dx2Var;
        long[] jArr;
        ny8 ny8Var = this.m;
        if (!((Boolean) ((e5d) ny8Var.getValue()).i().i()).booleanValue() || (dx2Var = rt2Var.b.D) == null || (jArr = dx2Var.a) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (!a.M0(j, (long[]) ((e5d) ny8Var.getValue()).n().i())) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return (Long) ww3.t1(arrayList);
    }

    @Override // defpackage.wjd
    public final Object a(zud zudVar) {
        return sbi.a;
    }

    @Override // defpackage.wjd
    public final boolean b() {
        rt2 rt2VarJ = J();
        if (rt2VarJ != null) {
            return rt2VarJ.a();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.wjd
    public final Object c(String str, RectF rectF, lq4 lq4Var) {
        ca3 ca3Var;
        AtomicLong atomicLong;
        if (lq4Var instanceof ca3) {
            ca3Var = (ca3) lq4Var;
            int i = ca3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ca3Var.g = i - Integer.MIN_VALUE;
            } else {
                ca3Var = new ca3(this, (nq4) lq4Var);
            }
        } else {
            ca3Var = new ca3(this, (nq4) lq4Var);
        }
        ca3 ca3Var2 = ca3Var;
        Object objA = ca3Var2.e;
        int i2 = ca3Var2.g;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(objA);
            rt2 rt2VarJ = J();
            if (rt2VarJ == null) {
                return sbiVar;
            }
            r60 r60VarA = o3m.a(rectF);
            ip2 ip2Var = (ip2) this.r.getValue();
            long j = rt2VarJ.a;
            atomicLong = this.y;
            ca3Var2.d = atomicLong;
            ca3Var2.g = 1;
            objA = ip2Var.a(j, str, r60VarA, ca3Var2);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            atomicLong = ca3Var2.d;
            ch3.d0(objA);
        }
        atomicLong.set(((Number) objA).longValue());
        return sbiVar;
    }

    @Override // defpackage.wjd
    public final void d() {
        zv8[] zv8VarArr = A;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.z;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }

    @Override // defpackage.wjd
    public final mk0 e() {
        return new csd(this.a, kmd.LOCAL_CHAT);
    }

    @Override // defpackage.wjd
    public final boolean g() {
        rt2 rt2VarJ = J();
        return rt2VarJ != null && rt2VarJ.b.I.n;
    }

    @Override // defpackage.wjd
    public final long h() {
        return this.y.get();
    }

    @Override // defpackage.wjd
    public final String i() {
        nx2 nx2Var;
        rt2 rt2VarJ = J();
        if (rt2VarJ == null || (nx2Var = rt2VarJ.b) == null) {
            return null;
        }
        return nx2Var.J;
    }

    @Override // defpackage.wjd
    public final Long j() {
        return Long.valueOf(this.a);
    }

    @Override // defpackage.wjd
    public final Long k() {
        rt2 rt2VarJ = J();
        if (rt2VarJ != null) {
            return Long.valueOf(rt2VarJ.A());
        }
        return null;
    }

    @Override // defpackage.wjd
    public final int l() {
        rt2 rt2VarJ = J();
        return (rt2VarJ == null || !rt2VarJ.d0()) ? 1 : 3;
    }

    @Override // defpackage.wjd
    public final kmd m() {
        return kmd.LOCAL_CHAT;
    }

    @Override // defpackage.wjd
    public final boolean n() {
        nx2 nx2Var;
        rt2 rt2VarJ = J();
        return ((rt2VarJ == null || (nx2Var = rt2VarJ.b) == null) ? 0 : nx2Var.b()) > 1;
    }

    @Override // defpackage.wjd
    public final long o() {
        return this.a;
    }

    @Override // defpackage.wjd
    public final Object p(mdh mdhVar) {
        return J();
    }

    @Override // defpackage.wjd
    public final boolean r() {
        rt2 rt2VarJ = J();
        return rt2VarJ != null && rt2VarJ.d0();
    }

    @Override // defpackage.wjd
    public final boolean s() {
        rt2 rt2VarJ = J();
        return rt2VarJ != null && rt2VarJ.B0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wjd
    public final Object v(int i, lq4 lq4Var) {
        da3 da3Var;
        rt2 rt2VarJ;
        nx2 nx2Var;
        if (lq4Var instanceof da3) {
            da3Var = (da3) lq4Var;
            int i2 = da3Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                da3Var.f = i2 - Integer.MIN_VALUE;
            } else {
                da3Var = new da3(this, (nq4) lq4Var);
            }
        } else {
            da3Var = new da3(this, (nq4) lq4Var);
        }
        Object obj = da3Var.d;
        int i3 = da3Var.f;
        if (i3 != 0) {
            if (i3 == 1) {
                ch3.d0(obj);
                return null;
            }
            if (i3 == 2) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        if (i == R.id.profile_action_report_and_leave) {
            tnh tnhVar = new tnh(R.string.pinbars_report_and_leave_dialog_title);
            tnh tnhVar2 = new tnh(R.string.pinbars_report_and_leave_dialog_description);
            c79 c79VarW = yab.w();
            c79VarW.add(new kc4(R.id.pinbars_report_and_leave_dialog_confirm, new tnh(R.string.pinbars_report_and_leave_dialog_confirm_button), 3, 32));
            c79VarW.add(new kc4(R.id.pinbars_report_and_leave_dialog_cancel, new tnh(R.string.pinbars_report_and_leave_dialog_cancel_button), 2, 32));
            return new jud(tnhVar, tnhVar2, yab.j(c79VarW), null);
        }
        rt2 rt2VarJ2 = J();
        if ((rt2VarJ2 == null || !rt2VarJ2.p0()) && ((rt2VarJ = J()) == null || !rt2VarJ.h())) {
            da3Var.f = 2;
            return null;
        }
        rt2 rt2VarJ3 = J();
        String str = (rt2VarJ3 == null || (nx2Var = rt2VarJ3.b) == null) ? null : nx2Var.J;
        cq8 cq8Var = (cq8) this.x.getValue();
        da3Var.f = 1;
        Object objA = cq8Var.a(str, da3Var);
        hu4 hu4Var = hu4.a;
        if (objA == hu4Var) {
            return hu4Var;
        }
        return null;
    }

    @Override // defpackage.wjd
    public final sbi y() {
        rt2 rt2VarJ = J();
        tjd tjdVar = (tjd) this.f.a.getValue();
        sbi sbiVar = sbi.a;
        if (rt2VarJ == null || tjdVar == null) {
            gm0.Y(ga3.class.getName(), "Early return in photoUploadError cuz of chat == null || profileState == null");
            return sbiVar;
        }
        bkd bkdVar = tjdVar.a;
        int iA = vs0.a.a();
        ProfileScreen.B.getClass();
        f(tjd.a(tjdVar, new bkd(bkdVar.a, bkdVar.b, rt2VarJ.C(iA, gm0.K(ProfileScreen.D * yl5.d().getDisplayMetrics().density)), rt2VarJ.r(gm0.K(56.0f * yl5.d().getDisplayMetrics().density)), bkdVar.e, bkdVar.f, bkdVar.g, bkdVar.h, bkdVar.i, bkdVar.j, bkdVar.k, bkdVar.l, bkdVar.m, bkdVar.n, bkdVar.o), null, 6));
        return sbiVar;
    }

    @Override // defpackage.wjd
    public final Object z(long j, boolean z, c03 c03Var) {
        Object objK0 = yab.K0(((n0c) ((xhh) this.l.getValue())).b(), new c03(this, j, z, null, 1), c03Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }
}
