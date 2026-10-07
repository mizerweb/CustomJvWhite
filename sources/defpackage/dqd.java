package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dqd extends a8j {
    public static final /* synthetic */ zv8[] B = {new z8b(dqd.class, "getChatLinkJob", "getGetChatLinkJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, dqd.class, "updateJoinRequestJob", "getUpdateJoinRequestJob()Lkotlinx/coroutines/Job;")};
    public final pzf A;
    public final long c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final pzf g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final p3c q;
    public final p3c r;
    public final AtomicLong s;
    public final AtomicLong t;
    public final AtomicLong u;
    public final AtomicBoolean v;
    public final mjg w;
    public final r8e x;
    public final ic6 y;
    public final ic6 z;

    public dqd(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13) {
        this.c = j;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        pzf pzfVarB = e9i.b(1, 0, 6);
        this.g = pzfVarB;
        this.h = ny8Var;
        this.i = ny8Var6;
        this.j = ny8Var7;
        this.k = ny8Var8;
        this.l = ny8Var9;
        this.m = ny8Var10;
        this.n = ny8Var11;
        this.o = ny8Var12;
        this.p = ny8Var13;
        nr2 nr2VarM0 = e9i.m0(pzfVarB, new q0d(((yp0) ny8Var5.getValue()).b, this, 5));
        this.q = qyj.S();
        this.r = qyj.S();
        this.s = new AtomicLong();
        this.t = new AtomicLong(-9223372036854775807L);
        this.u = new AtomicLong(-9223372036854775807L);
        this.v = new AtomicBoolean(false);
        mjg mjgVarA = p90.a(r66.a);
        this.w = mjgVarA;
        this.x = new r8e(mjgVarA);
        this.y = new ic6(null);
        this.z = new ic6(null);
        this.A = e9i.b(1, 0, 6);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ProfileInviteFlow", zo5.j(j, "ProfileInviteFlow[vm-init] id="), null);
            }
        }
        e9i.j0(e9i.T(new fz6(nr2VarM0, new w8(2, this, dqd.class, "handleApiError", "handleApiError(Lone/me/profile/screens/invite/CreateLinkErrors;)V", 4, 28), 3), ((n0c) E()).a()), this.b);
        e9i.j0(e9i.T(new q0d(new fz6(new bye(new voc(new jz(((xn3) ny8Var2.getValue()).k(j), 13), (lq4) null, this, 12)), new l0d(this, (lq4) null, 18), 3), this, 4), ((n0c) E()).a()), this.b);
        jpd jpdVar = (jpd) ny8Var12.getValue();
        jpdVar.a.d(jpdVar);
        e9i.j0(e9i.T(new fz6(new q8e(((jpd) ny8Var12.getValue()).b), new xpd(this, null, 0), 3), ((n0c) E()).a()), this.b);
    }

    public final void B(rt2 rt2Var) {
        int i;
        String strO;
        boolean zA;
        ynh tnhVar;
        c79 c79VarW = yab.w();
        if (rt2Var.b.w0 == 2) {
            i = R.string.profile_invite_private_link;
        } else {
            i = rt2Var.e0() ? R.string.profile_invite_chat_link : R.string.profile_invite_channel_link;
        }
        c79VarW.add(new gqd(i, (noh) null, 6));
        if (rt2Var.b0()) {
            strO = ((vg4) ww3.r1(rt2Var.g)).o();
        } else {
            strO = rt2Var.b.J;
            if (strO == null) {
                strO = "";
            }
        }
        String str = strO;
        String strS = rt2Var.s(us0.c, rs0.a);
        long jA = rt2Var.A();
        rt2Var.L0();
        CharSequence charSequence = rt2Var.m;
        String strF = rt2Var.F();
        boolean z = true;
        if (this.v.get() || str.length() != 0) {
            z = false;
        }
        boolean zW0 = rt2Var.w0();
        if (rt2Var.b0()) {
            zA = false;
        } else {
            zA = srk.a(rt2Var.n(((s7f) ((et3) this.k.getValue())).t()), np0.m);
            z = true;
        }
        c79VarW.add(new mqd(new rz2(strS, jA, charSequence, strF, str, z, zW0, zA)));
        skd skdVar = new skd(3);
        noh nohVar = q9i.i;
        c79VarW.add(new gqd(R.string.profile_invite_chat_link_description, skdVar, nohVar));
        ctf ctfVar = new ctf(R.id.profile_invite_send_link, 0, new tnh(R.string.share_to_max), null, null, null, aql.a(R.drawable.icon_forward), null, null, false, null, 1976);
        String strD = D();
        c79VarW.add(new uqd(R.id.profile_invite_send_link, ctfVar, !((strD == null || strD.length() == 0) ? z : false), 536879104));
        ctf ctfVar2 = new ctf(R.id.profile_invite_share_link, 0, new tnh(R.string.Oneme_profile_invite_share_link), null, null, null, aql.a(R.drawable.icon_share_android), null, null, false, null, 1976);
        String strD2 = D();
        c79VarW.add(new uqd(R.id.profile_invite_share_link, ctfVar2, !((strD2 == null || strD2.length() == 0) ? z : false), 1073750016));
        ctf ctfVar3 = new ctf(R.id.profile_invite_qr_code, 0, new tnh(R.string.Oneme_profile_invite_qr_code), null, null, null, aql.a(R.drawable.icon_qr_code), null, null, false, null, 1976);
        String strD3 = D();
        c79VarW.add(new uqd(R.id.profile_invite_qr_code, ctfVar3, !((strD3 == null || strD3.length() == 0) ? z : false), -2147475456));
        if (rt2Var.d0() && rt2Var.w0() && rt2Var.z0() && ((f5d) ((wo6) this.i.getValue())).e()) {
            c79VarW.add(new hqd(new ctf(c6c.a, 0, new tnh(R.string.join_request_toggle), null, null, null, null, new ksf(rt2Var.b.I.l, z), null, false, null, 1848)));
            c79VarW.add(new gqd(R.string.join_request_toggle_desc, nohVar, 2));
        }
        if (rt2Var.e0() && rt2Var.B0() && ((Boolean) ((e5d) this.j.getValue()).F0.a(e5d.S6[82]).i()).booleanValue()) {
            int i2 = rt2Var.b.w0;
            int i3 = i2 == 0 ? -1 : ypd.$EnumSwitchMapping$0[qt4.D(i2)];
            if (i3 == -1) {
                tnhVar = ynh.b;
            } else if (i3 == z) {
                tnhVar = new tnh(R.string.oneme_profile_edit_chat_type_public);
            } else {
                if (i3 != 2) {
                    ore.o();
                    return;
                }
                tnhVar = new tnh(R.string.oneme_profile_edit_chat_type_private);
            }
            c79VarW.add(new uqd(R.id.profile_invite_configure_type, new ctf(R.id.profile_invite_configure_type, 0, new tnh(R.string.profile_invite_configure_type), null, null, null, aql.a(R.drawable.icon_users), new isf(tnhVar, null), null, false, null, 1848), z, 8192));
        }
        c79 c79VarJ = yab.j(c79VarW);
        this.w.setValue(c79VarJ);
        String name = dqd.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "ProfileInviteFlow[buildItems] itemsCount=" + c79VarJ.getSize() + " hasLink=" + rt2Var.b.c() + " link=" + rt2Var.b.J, null);
        }
    }

    public final rt2 C() {
        return (rt2) ((xn3) this.d.getValue()).k(this.c).a.getValue();
    }

    public final String D() {
        nx2 nx2Var;
        String str;
        vg4 vg4VarW;
        rt2 rt2VarC = C();
        if (rt2VarC != null && rt2VarC.b0()) {
            rt2 rt2VarC2 = C();
            if (rt2VarC2 == null || (vg4VarW = rt2VarC2.w()) == null) {
                return null;
            }
            return vg4VarW.o();
        }
        rt2 rt2VarC3 = C();
        if (rt2VarC3 == null || (nx2Var = rt2VarC3.b) == null || (str = nx2Var.J) == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public final xhh E() {
        return (xhh) this.e.getValue();
    }

    public final void F(boolean z) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) E()).b(), 2, new g02(this, z, null, 5));
        this.r.B(this, B[1], sggVarH0);
    }

    @Override // defpackage.a8j
    public final void y() {
        String name = dqd.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.j(this.c, "ProfileInviteFlow[vm-onCleared] id="), null);
            }
        }
        jpd jpdVar = (jpd) this.o.getValue();
        jpdVar.a.f(jpdVar);
        p3c p3cVar = this.q;
        zv8[] zv8VarArr = B;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        this.q.B(this, zv8VarArr[0], null);
    }
}
