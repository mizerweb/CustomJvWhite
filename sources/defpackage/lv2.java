package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lv2 extends wp2 {
    public static final /* synthetic */ zv8[] I = {new z8b(lv2.class, "generateLinkJob", "getGenerateLinkJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, lv2.class, "updateJoinRequestJob", "getUpdateJoinRequestJob()Lkotlinx/coroutines/Job;"), new z8b(lv2.class, "checkEiasJob", "getCheckEiasJob()Lkotlinx/coroutines/Job;")};
    public final p3c A;
    public final p3c B;
    public final AtomicLong C;
    public final AtomicLong D;
    public final AtomicLong E;
    public final AtomicLong F;
    public final AtomicBoolean G;
    public final String H;
    public final mnd j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final xx6 w;
    public final pzf x;
    public final q8e y;
    public final p3c z;

    public lv2(long j, dq4 dq4Var, mnd mndVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16) {
        super(j, dq4Var, ny8Var12);
        this.j = mndVar;
        this.k = ny8Var;
        this.l = ny8Var2;
        this.m = ny8Var3;
        this.n = ny8Var4;
        this.o = ny8Var5;
        this.p = ny8Var6;
        this.q = ny8Var9;
        this.r = ny8Var10;
        this.s = ny8Var11;
        this.t = ny8Var14;
        this.u = ny8Var16;
        this.v = ny8Var13;
        this.w = e9i.T(new r07(new jz(this.c, 13), this.d, jv2.h, 0), ((n0c) ((xhh) ny8Var.getValue())).a());
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.x = pzfVarB;
        this.y = new q8e(pzfVarB);
        this.z = qyj.S();
        this.A = qyj.S();
        this.B = qyj.S();
        this.C = new AtomicLong();
        this.D = new AtomicLong();
        this.E = new AtomicLong();
        this.F = new AtomicLong();
        this.G = new AtomicBoolean();
        this.H = lv2.class.getName();
        e9i.j0(e9i.T(new fz6(this.i, new fze(this, ny8Var12, (lq4) null, 10), 3), ((n0c) ((xhh) ny8Var.getValue())).a()), dq4Var);
        e9i.j0(e9i.T(new fz6(new r07(new ie(new fz6(new bye(new dn0(new jz(((xn3) ny8Var2.getValue()).k(j), 13), (lq4) null, this, 17)), new qt1(this, null, 23), 3), this, 12), mndVar == mnd.CREATE ? new r8e(((xm) ny8Var15.getValue()).j(((Number) ((e5d) ny8Var13.getValue()).r6.a(e5d.S6[383]).i()).longValue())) : new tz(7, null), new ud9(3, (lq4) null, 8), 0), new in1(this, (lq4) null, 12), 3), ((n0c) ((xhh) ny8Var.getValue())).b()), dq4Var);
        e9i.j0(new fz6(new ie(((yp0) ny8Var8.getValue()).b, this, 13), new m20(2, this, lv2.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4), 3), dq4Var);
        e9i.j0(new fz6(new q8e(((und) ny8Var7.getValue()).a), new vq(this, j, (lq4) null, 9), 3), dq4Var);
    }

    public static lq2 E(rt2 rt2Var) {
        String str;
        Object next;
        Uri uri;
        int i = rt2Var.b.w0;
        String lastPathSegment = null;
        if (i == 1) {
            str = "PUBLIC";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "PRIVATE";
        }
        Iterator it = kq2.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((kq2) next).name(), str));
        kq2 kq2Var = (kq2) next;
        kq2 kq2Var2 = kq2.b;
        if (kq2Var == null) {
            kq2Var = kq2Var2;
        }
        nx2 nx2Var = rt2Var.b;
        if (kq2Var == kq2Var2) {
            lastPathSegment = nx2Var.J;
        } else {
            String str2 = nx2Var.J;
            if (str2 != null && (uri = Uri.parse(str2)) != null) {
                lastPathSegment = uri.getLastPathSegment();
            }
        }
        return new lq2(kq2Var, lastPathSegment);
    }

    public static final yld n(lv2 lv2Var) {
        return new yld(new tnh(R.string.profile_edit_shortlink_no_digital_id_title), new pnh(R.plurals.profile_edit_shortlink_no_digital_id_description, ((Number) ((e5d) lv2Var.v.getValue()).p6.a(e5d.S6[381]).i()).intValue()), Integer.valueOf(R.drawable.icon_max_id), xw3.P0(new kc4(R.id.profile_edit_shortlink_no_digital_id_action_create, new tnh(R.string.profile_edit_shortlink_no_digital_id_button_create), 3, true, 3, 3), new kc4(R.id.profile_edit_shortlink_no_digital_id_action_cancel, new tnh(R.string.profile_edit_shortlink_no_digital_id_button_cancel), 2, 32)), y3f.CHAT_LINK_CHANGE_DIGITAL_ID_REDIRECT);
    }

    public static final void o(lv2 lv2Var, rt2 rt2Var) {
        iq2 iq2Var;
        lq2 lq2VarE = E(rt2Var);
        mjg mjgVar = lv2Var.h;
        mjgVar.getClass();
        String str = null;
        mjgVar.j(null, lq2VarE);
        mjg mjgVar2 = lv2Var.i;
        mjgVar2.getClass();
        mjgVar2.j(null, lq2VarE);
        lq2 lq2Var = (lq2) mjgVar2.getValue();
        if ((lq2Var != null ? lq2Var.b : null) == kq2.b) {
            mjgVar2.j(null, lq2VarE);
        }
        jq2 jq2Var = (jq2) lv2Var.c.getValue();
        if (jq2Var != null && (iq2Var = jq2Var.e) != null) {
            str = iq2Var.a;
        }
        lv2Var.d(lv2Var.D(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object p(lv2 lv2Var, nq4 nq4Var) {
        ev2 ev2Var;
        if (nq4Var instanceof ev2) {
            ev2Var = (ev2) nq4Var;
            int i = ev2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ev2Var.f = i - Integer.MIN_VALUE;
            } else {
                ev2Var = new ev2(lv2Var, nq4Var);
            }
        } else {
            ev2Var = new ev2(lv2Var, nq4Var);
        }
        Object objR = ev2Var.d;
        int i2 = ev2Var.f;
        if (i2 == 0) {
            ch3.d0(objR);
            xn3 xn3Var = (xn3) lv2Var.l.getValue();
            long jLongValue = ((Number) ((e5d) lv2Var.v.getValue()).N6.a(e5d.S6[406]).i()).longValue();
            ev2Var.f = 1;
            objR = xn3Var.r(jLongValue, ev2Var);
            hu4 hu4Var = hu4.a;
            if (objR == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objR);
        }
        long j = ((rt2) objR).a;
        pzf pzfVar = lv2Var.e;
        wnd.b.getClass();
        pzfVar.a(new i65(":chats?id=" + j + "&type=local"));
        return sbi.a;
    }

    public static final Object q(lv2 lv2Var, bv2 bv2Var) {
        Object objEmit = lv2Var.f.emit(new bmd(6, new tnh(R.string.common_service_error), new Integer(R.drawable.icon_warning_fill)), bv2Var);
        return objEmit == hu4.a ? objEmit : sbi.a;
    }

    public static final void r(lv2 lv2Var) {
        lv2Var.f.a(new bmd(6, new pnh(R.plurals.profile_edit_shortlink_too_many_public_channel_error, ((Number) ((e5d) lv2Var.v.getValue()).p6.a(e5d.S6[381]).i()).intValue()), Integer.valueOf(R.drawable.icon_warning_fill)));
    }

    public static yld s() {
        return new yld(new tnh(R.string.profile_edit_shortlink_confirmation_change_title), new tnh(R.string.profile_edit_shortlink_confirmation_change_description), Integer.valueOf(R.drawable.icon_link_brake), xw3.P0(new kc4(R.id.profile_edit_shortlink_confirmation_change_action_cancel, new tnh(R.string.profile_edit_shortlink_confirmation_change_button_cancel), 3, true, 3, 3), new kc4(R.id.profile_edit_shortlink_confirmation_change_action_continue, new tnh(R.string.profile_edit_shortlink_confirmation_change_button_continue), 2, 32)), y3f.CHAT_LINK_CHANGE_CONFIRMATION);
    }

    public final boolean A() {
        rt2 rt2VarV = v();
        return rt2VarV != null && rt2VarV.d0();
    }

    public final void B() {
        mjg mjgVar = this.h;
        lq2 lq2Var = (lq2) mjgVar.getValue();
        kq2 kq2Var = lq2Var != null ? lq2Var.b : null;
        kq2 kq2Var2 = kq2.b;
        this.i.setValue(kq2Var == kq2Var2 ? (lq2) mjgVar.getValue() : new lq2(kq2Var2, null));
    }

    public final void C() {
        mjg mjgVar = this.h;
        lq2 lq2Var = (lq2) mjgVar.getValue();
        kq2 kq2Var = lq2Var != null ? lq2Var.b : null;
        kq2 kq2Var2 = kq2.a;
        this.i.setValue(kq2Var == kq2Var2 ? (lq2) mjgVar.getValue() : new lq2(kq2Var2, null));
    }

    public final vp2 D(String str) {
        return new vp2(new jq2(A() ? R.string.profile_edit_shortlink_channel_title : R.string.profile_edit_shortlink_chat_title, false, true, false, (((Boolean) ((e5d) this.v.getValue()).n6.a(e5d.S6[379]).i()).booleanValue() && this.j == mnd.CREATE && A()) ? new iq2(str) : null), ((dq2) this.g.getValue()).a(this));
    }

    public final void F(boolean z) {
        xt4 xt4VarB = ((n0c) x()).b();
        yt4 yt4VarW = w();
        xt4VarB.getClass();
        sgg sggVarH0 = yab.h0(this.b, lvb.x0(xt4VarB, yt4VarW), 2, new g02(this, z, null, 1));
        this.A.B(this, I[1], sggVarH0);
    }

    @Override // defpackage.wp2
    public final void a() {
        yab.i0(this.b, ((n0c) x()).a(), 0, new av2(this, (lq4) null, 0), 2);
    }

    @Override // defpackage.wp2
    public final void b() {
        zv8[] zv8VarArr = I;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.z;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
        zv8 zv8Var2 = zv8VarArr[1];
        p3c p3cVar2 = this.A;
        vo8 vo8Var2 = (vo8) p3cVar2.m(this, zv8Var2);
        if (vo8Var2 != null) {
            vo8Var2.b(null);
        }
        p3cVar2.B(this, zv8VarArr[1], null);
        this.B.B(this, zv8VarArr[2], null);
    }

    @Override // defpackage.wp2
    public final Object c(fq2 fq2Var) {
        Object objT = t(fq2Var);
        return objT == hu4.a ? objT : sbi.a;
    }

    @Override // defpackage.wp2
    public final void e() {
        u(true);
    }

    @Override // defpackage.wp2
    public final xx6 f() {
        return this.w;
    }

    @Override // defpackage.wp2
    public final void g(int i) {
        yab.i0(this.b, w(), 0, new dv2(i, this, null, 0), 2);
    }

    @Override // defpackage.wp2
    public final void h(int i) {
        xt4 xt4VarA = ((n0c) x()).a();
        yt4 yt4VarW = w();
        xt4VarA.getClass();
        yab.i0(this.b, lvb.x0(xt4VarA, yt4VarW), 0, new av2(i, this, (lq4) null), 2);
    }

    @Override // defpackage.wp2
    public final void i(int i) {
        xt4 xt4VarA = ((n0c) x()).a();
        yt4 yt4VarW = w();
        xt4VarA.getClass();
        yab.i0(this.b, lvb.x0(xt4VarA, yt4VarW), 0, new dv2(i, this, null, 1), 2);
    }

    @Override // defpackage.wp2
    public final void j(long j, boolean z) {
        if (j == R.id.profile_edit_join_request_toggle) {
            if (z) {
                F(true);
                return;
            }
            xt4 xt4VarA = ((n0c) x()).a();
            yt4 yt4VarW = w();
            xt4VarA.getClass();
            yab.i0(this.b, lvb.x0(xt4VarA, yt4VarW), 0, new av2(this, (lq4) null, 2), 2);
        }
    }

    @Override // defpackage.wp2
    public final Object k(fq2 fq2Var) {
        rt2 rt2VarV = v();
        sbi sbiVar = sbi.a;
        if (rt2VarV != null) {
            mjg mjgVar = this.i;
            lq2 lq2Var = (lq2) mjgVar.getValue();
            if (lq2Var != null) {
                mnd mndVar = this.j;
                mnd mndVar2 = mnd.CREATE;
                pzf pzfVar = this.f;
                hu4 hu4Var = hu4.a;
                if (mndVar == mndVar2 && rt2VarV.d0() && cqk.d(y(), Boolean.FALSE)) {
                    Object objEmit = pzfVar.emit(new wld(this.a), fq2Var);
                    if (objEmit == hu4Var) {
                        return objEmit;
                    }
                } else if (lq2Var.f) {
                    ynh tnhVar = lq2Var.d;
                    String str = lq2Var.c;
                    if (str == null || str.length() == 0) {
                        lq2 lq2Var2 = (lq2) mjgVar.getValue();
                        mjgVar.setValue(lq2Var2 != null ? lq2.a(lq2Var2, null, new tnh(R.string.profile_edit_shortlink_create_link_error_field_is_required), new Integer(R.attr.text_negative), false, 39) : null);
                        tnhVar = A() ? new tnh(R.string.profile_edit_shortlink_channel_public_link_empty_hint) : new tnh(R.string.profile_edit_shortlink_chat_public_link_empty_hint);
                    }
                    Object objEmit2 = pzfVar.emit(new bmd(14, tnhVar, null), fq2Var);
                    if (objEmit2 == hu4Var) {
                        return objEmit2;
                    }
                } else {
                    Object objK0 = yab.K0(((n0c) x()).b(), new fze(this, lq2Var, rt2VarV, null, 11), fq2Var);
                    if (objK0 != hu4Var) {
                        objK0 = sbiVar;
                    }
                    if (objK0 == hu4Var) {
                        return objK0;
                    }
                }
            }
        }
        return sbiVar;
    }

    @Override // defpackage.wp2
    public final void l(String str) {
        yab.i0(this.b, ((n0c) x()).c().S0(), 0, new kv2(this, str, null, 1), 2);
    }

    @Override // defpackage.wp2
    public final void m(int i) {
        ny8 ny8Var = this.v;
        mjg mjgVar = this.h;
        if (i == R.id.profile_edit_link_private) {
            if (((Boolean) ((e5d) ny8Var.getValue()).n6.a(e5d.S6[379]).i()).booleanValue() && A()) {
                lq2 lq2Var = (lq2) mjgVar.getValue();
                if ((lq2Var != null ? lq2Var.b : null) != kq2.b) {
                    this.f.a(s());
                    return;
                }
            }
            B();
            return;
        }
        if (i == R.id.profile_edit_link_public) {
            if (((Boolean) ((e5d) ny8Var.getValue()).n6.a(e5d.S6[379]).i()).booleanValue() && A()) {
                lq2 lq2Var2 = (lq2) mjgVar.getValue();
                if ((lq2Var2 != null ? lq2Var2.b : null) != kq2.a) {
                    this.B.B(this, I[2], yab.h0(this.b, ((n0c) x()).a(), 2, new bv2(this, null, 0)));
                    return;
                }
            }
            C();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(nq4 nq4Var) {
        cv2 cv2Var;
        bmd bmdVar;
        bmd bmdVar2;
        if (nq4Var instanceof cv2) {
            cv2Var = (cv2) nq4Var;
            int i = cv2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cv2Var.f = i - Integer.MIN_VALUE;
            } else {
                cv2Var = new cv2(this, nq4Var);
            }
        } else {
            cv2Var = new cv2(this, nq4Var);
        }
        Object obj = cv2Var.d;
        int i2 = cv2Var.f;
        pzf pzfVar = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                if (it3.b()) {
                    bmdVar = new bmd(6, new tnh(R.string.profile_edit_shortlink_public_link_copied), new Integer(R.drawable.icon_copy_fill));
                    cv2Var.f = 2;
                    if (pzfVar.emit(bmdVar, cv2Var) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            }
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            if (it3.b()) {
                bmdVar2 = new bmd(6, new tnh(R.string.profile_edit_shortlink_private_link_copied), new Integer(R.drawable.icon_copy_fill));
                cv2Var.f = 4;
                if (pzfVar.emit(bmdVar2, cv2Var) == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        }
        ch3.d0(obj);
        lq2 lq2Var = (lq2) this.i.getValue();
        if (lq2Var == null) {
            gm0.Y(lv2.class.getName(), "Early return in copyLink cuz of editedModel.value is null");
            return sbiVar;
        }
        String str = lq2Var.c;
        int iOrdinal = lq2Var.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                ore.o();
                return null;
            }
            if (str != null) {
                uld uldVar = new uld(str);
                cv2Var.f = 3;
                if (pzfVar.emit(uldVar, cv2Var) != hu4Var) {
                    if (it3.b()) {
                        bmdVar2 = new bmd(6, new tnh(R.string.profile_edit_shortlink_private_link_copied), new Integer(R.drawable.icon_copy_fill));
                        cv2Var.f = 4;
                        if (pzfVar.emit(bmdVar2, cv2Var) == hu4Var) {
                        }
                    }
                }
            }
            return sbiVar;
        }
        ((w69) this.m.getValue()).getClass();
        uld uldVar2 = new uld("max.ru/" + str);
        cv2Var.f = 1;
        if (pzfVar.emit(uldVar2, cv2Var) != hu4Var) {
            if (it3.b()) {
                bmdVar = new bmd(6, new tnh(R.string.profile_edit_shortlink_public_link_copied), new Integer(R.drawable.icon_copy_fill));
                cv2Var.f = 2;
                if (pzfVar.emit(bmdVar, cv2Var) == hu4Var) {
                }
            }
            return sbiVar;
        }
        return hu4Var;
    }

    public final void u(boolean z) {
        xt4 xt4VarB = ((n0c) x()).b();
        yt4 yt4VarW = w();
        xt4VarB.getClass();
        sgg sggVarI0 = yab.i0(this.b, lvb.x0(xt4VarB, yt4VarW), 0, new wo0(this, z, (lq4) null, 3), 2);
        this.z.B(this, I[0], sggVarI0);
    }

    public final rt2 v() {
        return (rt2) ((xn3) this.l.getValue()).k(this.a).a.getValue();
    }

    public final yt4 w() {
        return (yt4) this.r.getValue();
    }

    public final xhh x() {
        return (xhh) this.k.getValue();
    }

    public final Boolean y() {
        lq2 lq2Var = (lq2) this.h.getValue();
        if (lq2Var != null) {
            return Boolean.valueOf(lq2Var.b((nq2) this.i.getValue()));
        }
        return null;
    }

    public final Object z(cq2 cq2Var, lq4 lq4Var) {
        boolean zD = cqk.d(cq2Var, zp2.a);
        hu4 hu4Var = hu4.a;
        pzf pzfVar = this.f;
        if (zD) {
            Object objEmit = pzfVar.emit(new bmd(new tnh(R.string.profile_edit_shortlink_create_link_error_title_no_connection), new tnh(R.string.profile_edit_shortlink_create_link_error_no_connection_description), true, new Integer(R.drawable.icon_warning)), lq4Var);
            if (objEmit == hu4Var) {
                return objEmit;
            }
        } else if (cqk.d(cq2Var, aq2.a)) {
            Object objEmit2 = pzfVar.emit(new bmd(new tnh(R.string.profile_edit_shortlink_create_link_error_title_service_unavailable), new tnh(R.string.profile_edit_shortlink_create_link_error_service_unavailable_description), true, new Integer(R.drawable.icon_warning)), lq4Var);
            if (objEmit2 == hu4Var) {
                return objEmit2;
            }
        } else if (cqk.d(cq2Var, yp2.a)) {
            this.d.setValue(((dq2) this.g.getValue()).a(this));
            Object objEmit3 = pzfVar.emit(new bmd(6, new tnh(R.string.join_request_update_error), new Integer(R.drawable.icon_warning)), lq4Var);
            if (objEmit3 == hu4Var) {
                return objEmit3;
            }
        } else if (cq2Var instanceof xp2) {
            Object objEmit4 = pzfVar.emit(new bmd(14, ((xp2) cq2Var).a, null), lq4Var);
            if (objEmit4 == hu4Var) {
                return objEmit4;
            }
        } else {
            if (!(cq2Var instanceof bq2)) {
                ore.o();
                return null;
            }
            Object objEmit5 = pzfVar.emit(new bmd(14, ((bq2) cq2Var).a, null), lq4Var);
            if (objEmit5 == hu4Var) {
                return objEmit5;
            }
        }
        return sbi.a;
    }
}
