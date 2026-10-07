package defpackage;

import android.graphics.RectF;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dvd extends a8j {
    public static final /* synthetic */ zv8[] u1 = {new z8b(dvd.class, "attacheClickJob", "getAttacheClickJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, dvd.class, "openCallJob", "getOpenCallJob()Lkotlinx/coroutines/Job;"), new z8b(dvd.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public final ic6 B;
    public final ic6 C;
    public final p3c D;
    public final p3c E;
    public final p3c F;
    public final ny8 G;
    public final ny8 H;
    public final ny8 I;
    public final mjg J;
    public final r8e K;
    public final mjg X;
    public final r8e Y;
    public final mjg Z;
    public final long c;
    public final kmd d;
    public final xu1 e;
    public final String f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final r8e n1;
    public final ny8 o;
    public final q8e o1;
    public final ny8 p;
    public final wjd p1;
    public final ny8 q;
    public final AtomicReference q1;
    public final ny8 r;
    public final ny8 r1;
    public final ny8 s;
    public boolean s1;
    public final ny8 t;
    public final z18 t1;
    public final ny8 u;
    public final ny8 v;
    public final ex8 w;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;

    /* JADX WARN: Code duplicated, block: B:47:0x02d5  */
    public dvd(long j, kmd kmdVar, boolean z, xu1 xu1Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18, ny8 ny8Var19, ny8 ny8Var20, ny8 ny8Var21, ny8 ny8Var22, ny8 ny8Var23, ny8 ny8Var24, a11 a11Var, yif yifVar, yl4 yl4Var, ja3 ja3Var) {
        wjd ga3Var;
        z18 z18Var;
        q8e q8eVar;
        this.c = j;
        this.d = kmdVar;
        this.e = xu1Var;
        String name = dvd.class.getName();
        this.f = name;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = ny8Var6;
        this.l = ny8Var7;
        this.m = ny8Var8;
        this.n = ny8Var9;
        this.o = ny8Var10;
        this.p = ny8Var11;
        this.q = ny8Var12;
        this.r = ny8Var13;
        this.s = ny8Var14;
        this.t = ny8Var15;
        this.u = ny8Var19;
        this.v = ny8Var16;
        ae9 ae9Var = (ae9) ny8Var18.getValue();
        this.w = new ex8(25, ae9Var);
        this.x = ny8Var17;
        this.y = ny8Var20;
        this.z = ny8Var22;
        this.A = ny8Var24;
        this.B = new ic6(null);
        this.C = new ic6(null);
        this.D = qyj.S();
        this.E = qyj.S();
        this.F = qyj.S();
        this.G = rx8.P(3, new a8d(18, this));
        this.H = rx8.P(3, new vbd(27));
        this.I = rx8.P(3, new vbd(28));
        r66 r66Var = r66.a;
        mjg mjgVarA = p90.a(r66Var);
        this.J = mjgVarA;
        this.K = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(r66Var);
        this.X = mjgVarA2;
        this.Y = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(null);
        this.Z = mjgVarA3;
        this.n1 = new r8e(mjgVarA3);
        this.q1 = new AtomicReference();
        this.r1 = ny8Var21;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "inited by " + kmdVar + ":#" + j, null);
            }
        }
        int iOrdinal = kmdVar.ordinal();
        if (iOrdinal == 0) {
            rt2 rt2Var = (rt2) ((xn3) ny8Var2.getValue()).k(j).a.getValue();
            vg4 vg4VarW = rt2Var != null ? rt2Var.w() : null;
            if (rt2Var == null || !rt2Var.b0()) {
                ga3Var = (rt2Var == null || !rt2Var.h0() || vg4VarW == null) ? new ga3(j, this.b, ja3Var.a, ja3Var.b, ja3Var.c, ja3Var.d, ja3Var.e, ja3Var.f, ja3Var.g, ja3Var.h, ja3Var.i, ja3Var.j, ja3Var.k, ja3Var.l, ja3Var.m, ja3Var.n, ja3Var.o, ja3Var.p) : yl4Var.a(vg4VarW.v(), this.b, z);
            } else {
                if (vg4VarW == null) {
                    ore.p("Required value was null.");
                    throw null;
                }
                ga3Var = a11Var.a(vg4VarW.v(), this.b);
            }
        } else if (iOrdinal == 1) {
            ga3Var = new xif(j, yifVar.a, yifVar.b, yifVar.c, yifVar.d);
        } else {
            if (iOrdinal != 2) {
                ore.o();
                throw null;
            }
            vg4 vg4Var = (vg4) ((no4) ny8Var.getValue()).j(j).a.getValue();
            ga3Var = (vg4Var == null || !vg4Var.E()) ? yl4Var.a(j, this.b, z) : a11Var.a(j, this.b);
        }
        this.p1 = ga3Var;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(e9i.T(new fz6(new jz(ga3Var.f, 13), new xud(this, lq4Var, 0), i), ((n0c) ((xhh) ny8Var6.getValue())).a()), this.b);
        e9i.j0(e9i.T(new fz6(ga3Var.h, new xud(this, lq4Var, 1), i), ((n0c) ((xhh) ny8Var6.getValue())).a()), this.b);
        jpd jpdVar = (jpd) ny8Var7.getValue();
        jpdVar.a.d(jpdVar);
        e9i.j0(new fz6(new q8e(((jpd) ny8Var7.getValue()).b), new xud(this, lq4Var, 2), i), this.b);
        Long lJ = ga3Var.j();
        if (lJ != null) {
            r8e r8eVarK = ((f5d) ((wo6) ny8Var11.getValue())).y() ? ((xn3) ny8Var2.getValue()).k(lJ.longValue()) : null;
            if (r8eVarK != null) {
                z18Var = new z18(this.b, (xhh) ny8Var6.getValue(), r8eVarK, ny8Var2, ny8Var23);
                this.t1 = z18Var;
            } else {
                z18Var = null;
            }
        } else {
            z18Var = null;
        }
        this.t1 = z18Var;
        this.o1 = (z18Var == null || (q8eVar = (q8e) z18Var.i) == null) ? new q8e(e9i.b(0, 0, 7)) : q8eVar;
    }

    public final void B(boolean z) {
        Long lJ = this.p1.j();
        if (lJ == null) {
            gm0.Y(dvd.class.getName(), "Early return in clearChatHistory cuz of profile.chatLocalId is null");
            return;
        }
        a8j.x(this.B, new hud(new tnh(R.string.profile_clear_chat_history_snackbar_title), new vud(this, lJ.longValue(), z, 0)));
    }

    public final void C() {
        if (this.s1) {
            return;
        }
        Long lJ = this.p1.j();
        if (lJ == null) {
            gm0.Y(dvd.class.getName(), "Early return in deleteChat cuz of profile.chatLocalId is null");
            return;
        }
        long jLongValue = lJ.longValue();
        this.s1 = true;
        xt4 xt4VarB = ((n0c) F()).b();
        zhb zhbVar = zhb.b;
        xt4VarB.getClass();
        yab.h0(this.b, lvb.x0(xt4VarB, zhbVar), 3, new avd(this, jLongValue, null, 0));
    }

    public final xn3 D() {
        return (xn3) this.g.getValue();
    }

    public final yt4 E() {
        return (yt4) this.x.getValue();
    }

    public final xhh F() {
        return (xhh) this.k.getValue();
    }

    public final void G(String str) {
        xt4 xt4VarB = ((n0c) F()).b();
        yt4 yt4VarE = E();
        xt4VarB.getClass();
        sgg sggVarH0 = yab.h0(this.b, lvb.x0(xt4VarB, yt4VarE), 2, new voc(this, str, (lq4) null, 17));
        this.F.B(this, u1[2], sggVarH0);
    }

    public final void H(String str, t59 t59Var) {
        int iOrdinal = t59Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 4) {
                String strA = ((w69) this.v.getValue()).a(str);
                if (strA == null) {
                    return;
                }
                G(strA);
                return;
            }
            if (iOrdinal != 6) {
                return;
            }
        }
        G(str);
    }

    public final void I() {
        Long lJ = this.p1.j();
        if (lJ == null) {
            gm0.Y("ProfileInviteFlow", "ProfileInviteFlow[profile-click] chatLocalId is null, abort");
            return;
        }
        long jLongValue = lJ.longValue();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ProfileInviteFlow", nbh.s(jLongValue, "ProfileInviteFlow[profile-click] chatId=", ", profile-side snapshot:"), null);
            }
        }
        m4m.b("profile-click", jLongValue, (rt2) D().k(jLongValue).a.getValue(), ((s7f) ((et3) this.n.getValue())).t());
        a8j.x(this.C, new esd(jLongValue));
    }

    public final void J(String str, RectF rectF) {
        xt4 xt4VarB = ((n0c) F()).b();
        yt4 yt4VarE = E();
        xt4VarB.getClass();
        yab.i0(this.b, lvb.x0(xt4VarB, yt4VarE), 0, new voc(this, str, rectF, null, 18), 2);
    }

    public final void K(boolean z) {
        wfe wfeVar = new wfe();
        wjd wjdVar = this.p1;
        kmd kmdVarM = wjdVar.m();
        if (kmdVarM == null) {
            gm0.Y(dvd.class.getName(), "Early return in openCall cuz of profile.deepLinkType is null");
            return;
        }
        wfeVar.a = kmdVarM;
        vfe vfeVar = new vfe();
        vfeVar.a = wjdVar.o();
        sgg sggVarT = a8j.t(this, null, new q40(4, (lq4) null, wfeVar, vfeVar, this, z), 1);
        this.E.B(this, u1[1], sggVarT);
    }

    public final void L(boolean z) {
        ((fmd) this.G.getValue()).getClass();
        c79 c79VarW = yab.w();
        c79VarW.add(new rp4(R.id.profile_phone_number_action_tt_voice_call, new tnh(R.string.profile_phone_number_action_tt_voice_call), Integer.valueOf(R.drawable.icon_call), (Integer) null, 20));
        c79VarW.add(new rp4(R.id.profile_phone_number_action_tt_video_call, new tnh(R.string.profile_phone_number_action_tt_video_call), Integer.valueOf(R.drawable.icon_video_call), (Integer) null, 20));
        if (z) {
            c79VarW.add(new rp4(R.id.profile_phone_number_action_voice_call, new tnh(R.string.profile_phone_number_action_voice_call), Integer.valueOf(R.drawable.icon_call_outgoing_fill), (Integer) null, 20));
            c79VarW.add(new rp4(R.id.profile_phone_number_action_copy, new tnh(R.string.profile_phone_number_action_copy), Integer.valueOf(R.drawable.icon_phone_book_big), (Integer) null, 20));
        }
        a8j.x(this.B, new nud(yab.j(c79VarW)));
    }

    public final void M(int i, String str, t59 t59Var) {
        char c;
        int i2;
        char c2;
        int i3;
        int i4;
        String str2;
        wjd wjdVar = this.p1;
        if (wjdVar.r()) {
            c = 4;
        } else if (wjdVar instanceof z01) {
            c = 2;
        } else {
            c = wjdVar.t() ? (char) 1 : (char) 3;
        }
        long jO = wjdVar.o();
        ex8 ex8Var = this.w;
        ex8Var.getClass();
        if (y1m.b(str)) {
            i2 = 3;
        } else {
            i2 = y1m.c(str) ? 2 : 1;
        }
        int iD = qt4.D(i2);
        if (iD == 0) {
            c2 = t59Var == t59.e ? (char) 4 : (char) 1;
        } else if (iD == 1) {
            c2 = 3;
        } else {
            if (iD != 2) {
                ore.o();
                return;
            }
            c2 = 2;
        }
        if (c2 == 1) {
            i3 = 1;
        } else if (c2 == 2) {
            i3 = 2;
        } else if (c2 == 3) {
            i3 = 3;
        } else {
            if (c2 != 4) {
                throw null;
            }
            i3 = 4;
        }
        ylc ylcVar = new ylc("element_type", Integer.valueOf(i3));
        ylc ylcVar2 = new ylc("source_id", Long.valueOf(jO));
        if (c == 1) {
            i4 = 1;
        } else if (c == 2) {
            i4 = 2;
        } else if (c == 3) {
            i4 = 3;
        } else {
            if (c != 4) {
                throw null;
            }
            i4 = 4;
        }
        Map mapQ0 = wm9.Q0(ylcVar, ylcVar2, new ylc("source_type", Integer.valueOf(i4)));
        ae9 ae9Var = (ae9) ex8Var.b;
        if (i == 1) {
            str2 = "clicked_clickable_element";
        } else if (i == 2) {
            str2 = "clicked_open_context_menu";
        } else if (i == 3) {
            str2 = "clicked_copy";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "clicked_in_context_menu";
        }
        ae9.k(ae9Var, "CHAT_PROFILE_CLICKABLE_ELEMENT_ACTIONS", str2, mapQ0, 8);
    }

    public final void N() {
        if (!((wsc) this.m.getValue()).c(wsc.n)) {
            a8j.x(this.B, fud.a);
            return;
        }
        xt4 xt4VarB = ((n0c) F()).b();
        yt4 yt4VarE = E();
        xt4VarB.getClass();
        yab.i0(this.b, lvb.x0(xt4VarB, yt4VarE), 0, new xud(this, null, 3), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(lq4 lq4Var) {
        cvd cvdVar;
        if (lq4Var instanceof cvd) {
            cvdVar = (cvd) lq4Var;
            int i = cvdVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvdVar.f = i - Integer.MIN_VALUE;
            } else {
                cvdVar = new cvd(this, (nq4) lq4Var);
            }
        } else {
            cvdVar = new cvd(this, (nq4) lq4Var);
        }
        Object objV = cvdVar.d;
        int i2 = cvdVar.f;
        if (i2 == 0) {
            ch3.d0(objV);
            Long lJ = this.p1.j();
            if (lJ == null) {
                return Boolean.FALSE;
            }
            long jLongValue = lJ.longValue();
            xn3 xn3VarD = D();
            cvdVar.f = 1;
            objV = xn3VarD.v(jLongValue, cvdVar);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objV);
        }
        return Boolean.valueOf(((rt2) objV).k0((e5d) this.q.getValue()));
    }

    public final void P() {
        bkd bkdVar = (bkd) this.Z.getValue();
        List list = bkdVar != null ? bkdVar.c : null;
        wjd wjdVar = this.p1;
        if (list != null) {
            i65 i65VarB = wjdVar.B();
            if (i65VarB != null) {
                a8j.x(this.C, i65VarB);
                return;
            }
            return;
        }
        if (wjdVar.b()) {
            mld mldVar = (mld) this.H.getValue();
            mldVar.getClass();
            tnh tnhVar = new tnh(R.string.profile_change_avatar_title);
            c79 c79VarW = yab.w();
            int i = 3;
            int i2 = 56;
            c79VarW.add(new kc4(R.id.profile_change_avatar_upload_from_gallery, new tnh(R.string.profile_change_avatar_upload_from_gallery), i, i2));
            c79VarW.add(new kc4(R.id.profile_change_avatar_upload_from_camera, new tnh(R.string.profile_change_avatar_upload_from_camera), i, i2));
            c79VarW.add(mldVar.c());
            a8j.x(this.B, new jud(tnhVar, null, yab.j(c79VarW), null));
        }
    }

    public final void Q() {
        this.q1.set(null);
        int i = 4;
        a8j.x(this.B, new pud(i, new tnh(R.string.profile_change_avatar_error), Integer.valueOf(R.drawable.icon_warning)));
    }

    public final void R() {
        a8j.x(this.B, new hud(new tnh(R.string.chat_deleted_and_bot_suspended_snackbar), new wud(this, 0)));
    }

    public final void S() {
        jud judVar;
        jud judVar2;
        bkd bkdVar = (bkd) this.Z.getValue();
        CharSequence charSequence = bkdVar != null ? bkdVar.e : null;
        if (charSequence == null) {
            charSequence = "";
        }
        wjd wjdVar = this.p1;
        int iL = wjdVar.l();
        if (iL == 0) {
            return;
        }
        boolean zN = wjdVar.n();
        mld mldVar = (mld) this.H.getValue();
        mldVar.getClass();
        int iD = qt4.D(iL);
        int i = R.id.profile_delete_chat_confirmation_sheet_confirm;
        int i2 = R.id.profile_change_owner_chat_confirmation_sheet_confirm;
        int i3 = 1;
        int i4 = 56;
        if (iD != 0) {
            if (iD == 1) {
                tnh tnhVar = new tnh(R.string.profile_delete_chat_bottom_sheet_title);
                tnh tnhVar2 = new tnh(R.string.profile_delete_dialog_bottom_sheet_description);
                c79 c79VarW = yab.w();
                c79VarW.add(new kc4(i, new tnh(R.string.profile_delete_chat_bottom_sheet_confirm), i3, i4));
                c79VarW.add(mldVar.c());
                judVar2 = new jud(tnhVar, tnhVar2, yab.j(c79VarW), null);
            } else if (iD == 2) {
                tnh tnhVar3 = new tnh(R.string.profile_delete_channel_bottom_sheet_title);
                tnh tnhVar4 = new tnh(R.string.profile_delete_channel_bottom_sheet_description);
                c79 c79VarW2 = yab.w();
                if (zN) {
                    c79VarW2.add(new kc4(i2, new tnh(R.string.profile_change_owner_chat_bottom_sheet_confirm), i3, i4));
                }
                c79VarW2.add(new kc4(R.id.profile_delete_channel_confirmation_sheet_confirm, new tnh(R.string.profile_delete_channel_bottom_sheet_confirm), i3, i4));
                c79VarW2.add(mldVar.c());
                judVar2 = new jud(tnhVar3, tnhVar4, yab.j(c79VarW2), null);
            } else {
                if (iD != 3) {
                    ore.o();
                    return;
                }
                judVar = mldVar.d();
            }
            judVar = judVar2;
        } else {
            vnh vnhVar = new vnh(R.string.profile_delete_multi_chat_bottom_sheet_title, a.n1(new Object[]{charSequence}));
            c79 c79VarW3 = yab.w();
            c79VarW3.add(new kc4(i2, new tnh(R.string.profile_change_owner_chat_bottom_sheet_confirm), i3, i4));
            c79VarW3.add(new kc4(i, new tnh(R.string.profile_delete_chat_bottom_sheet_confirm), i3, i4));
            c79VarW3.add(mldVar.c());
            judVar = new jud(vnhVar, null, yab.j(c79VarW3), null);
        }
        a8j.x(this.B, judVar);
    }

    public final void T(boolean z) {
        a8j.x(this.B, new hud(new tnh(z ? R.string.profile_channel_deleted_snackbar_title : R.string.profile_chat_deleted_snackbar_title), new b52(this, z, 4)));
    }

    public final void U() {
        xt4 xt4VarB = ((n0c) F()).b();
        zhb zhbVar = zhb.b;
        xt4VarB.getClass();
        yab.h0(this.b, lvb.x0(xt4VarB, zhbVar).u0(E()), 3, new zud(this, null, 5));
    }

    @Override // defpackage.a8j
    public final void y() {
        this.p1.d();
        jpd jpdVar = (jpd) this.l.getValue();
        jpdVar.a.f(jpdVar);
        zv8[] zv8VarArr = u1;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.D;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }
}
