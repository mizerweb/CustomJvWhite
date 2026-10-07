package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;
import one.me.profile.ProfileScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vl4 extends wjd {
    public static final /* synthetic */ zv8[] N;
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public y34 E;
    public final o44 F;
    public final ny8 G;
    public final ny8 H;
    public final il5 I;
    public final mjg J;
    public final p3c K;
    public volatile ozg L;
    public final AtomicReference M;
    public final gu4 i;
    public final boolean j;
    public final mic k;
    public final u02 l;
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
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;

    static {
        z8b z8bVar = new z8b(vl4.class, "organizationInfoJob", "getOrganizationInfoJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        N = new zv8[]{z8bVar};
    }

    public vl4(long j, gu4 gu4Var, boolean z, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18, kld kldVar, ny8 ny8Var19, ny8 ny8Var20, ny8 ny8Var21, ny8 ny8Var22, ny8 ny8Var23, aj5 aj5Var, mic micVar, u02 u02Var) {
        xx6 tzVar;
        super(j, ny8Var, ny8Var2, ny8Var4, ny8Var15);
        this.i = gu4Var;
        this.j = z;
        this.k = micVar;
        this.l = u02Var;
        this.m = ny8Var5;
        this.n = ny8Var6;
        this.o = ny8Var7;
        this.p = ny8Var9;
        this.q = ny8Var10;
        this.r = ny8Var11;
        this.s = ny8Var12;
        this.t = ny8Var13;
        this.u = ny8Var2;
        this.v = ny8Var14;
        this.w = ny8Var3;
        this.x = ny8Var15;
        this.y = ny8Var16;
        this.z = ny8Var17;
        this.A = ny8Var20;
        this.B = ny8Var21;
        this.C = ny8Var22;
        this.D = ny8Var23;
        this.F = new o44(0);
        this.G = rx8.P(3, new pe3(13, this));
        this.H = rx8.P(3, new zn3(24));
        il5 il5VarA = kldVar.a(j);
        this.I = il5VarA;
        mjg mjgVarA = p90.a(r66.a);
        this.J = mjgVarA;
        this.K = qyj.S();
        y34 y34Var = new y34(j, (xhh) ny8Var13.getValue(), ny8Var7, ny8Var19, ny8Var5, ny8Var4);
        this.E = y34Var;
        e9i.j0(new fz6(y34Var.i, new ql4(this, null, 0), 3), gu4Var);
        jz jzVarR = e9i.R(new jz(e9i.R(((no4) ny8Var6.getValue()).j(j), new me1(ny8Var6, j, this, ny8Var18, (lq4) null)), 13), new ql4(this, null, 2));
        if (((Boolean) u02Var.invoke()).booleanValue()) {
            zyg zygVar = new zyg(j);
            tzVar = new j3(e9i.T(new fz6(e9i.I(new r07(aj5Var.e().f, aj5Var.e().h, new d3(zygVar, null, 13), 0)), new vk4((Object) aj5Var, (lq4) null, false, (Object) zygVar, 11)), ((n0c) ((xhh) ny8Var13.getValue())).a()), 14, new ud9(3, (lq4) null, 15));
        } else {
            tzVar = new tz(7, null);
        }
        e9i.j0(e9i.T(new fz6(e9i.B(jzVarR, new r8e((f9b) ((yfd) ny8Var9.getValue()).F.computeIfAbsent(Long.valueOf(j), new am(15, new pyb(27)))), new r8e(mjgVarA), tzVar, new fz1(this, (lq4) null, 1)), new w8(2, this, vl4.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 13), 3), ((n0c) ((xhh) ny8Var13.getValue())).a()), gu4Var);
        e9i.j0(e9i.T(new fz6(new q8e(il5VarA.d), new m20(2, this, vl4.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 3), ((n0c) ((xhh) ny8Var13.getValue())).a()), gu4Var);
        e9i.j0(e9i.T(new fz6(new l50(new q8e(((ij4) ny8Var8.getValue()).c), j, 1), new ql4(this, null, 1), 3), ((n0c) ((xhh) ny8Var13.getValue())).a()), gu4Var);
        this.M = new AtomicReference(null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object J(vl4 vl4Var, hl5 hl5Var, lq4 lq4Var) {
        sl4 sl4Var;
        vg4 vg4VarL;
        yhc yhcVar;
        vl4Var.getClass();
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof sl4) {
            sl4Var = (sl4) lq4Var;
            int i = sl4Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sl4Var.g = i - Integer.MIN_VALUE;
            } else {
                sl4Var = new sl4(vl4Var, lq4Var);
            }
        } else {
            sl4Var = new sl4(vl4Var, lq4Var);
        }
        Object objP = sl4Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = sl4Var.g;
        if (i2 == 0) {
            ch3.d0(objP);
            if (!cqk.d(hl5Var, hl5.a)) {
                ore.o();
                return null;
            }
            vg4VarL = vl4Var.L();
            if (vg4VarL == null) {
                return sbiVar;
            }
            Long lN = vl4Var.N(vg4VarL);
            if (lN != null) {
                gfb gfbVarB = vl4Var.k.b(lN.longValue());
                sl4Var.d = vg4VarL;
                sl4Var.g = 1;
                objP = e9i.P(gfbVarB, sl4Var);
                if (objP == hu4Var) {
                    return hu4Var;
                }
            } else {
                yhcVar = null;
            }
            ylc ylcVarK = vl4Var.K(vg4VarL, yhcVar, vl4Var.L);
            tjd tjdVar = (tjd) vl4Var.f.a.getValue();
            vl4Var.f(tjdVar != null ? tjd.a(tjdVar, (bkd) ylcVarK.a, (List) ylcVarK.b, 4) : null);
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vg4VarL = sl4Var.d;
        ch3.d0(objP);
        yhcVar = (yhc) objP;
        ylc ylcVarK2 = vl4Var.K(vg4VarL, yhcVar, vl4Var.L);
        tjd tjdVar2 = (tjd) vl4Var.f.a.getValue();
        vl4Var.f(tjdVar2 != null ? tjd.a(tjdVar2, (bkd) ylcVarK2.a, (List) ylcVarK2.b, 4) : null);
        return sbiVar;
    }

    @Override // defpackage.wjd
    public final boolean A() {
        y34 y34Var = this.E;
        if (y34Var == null) {
            return false;
        }
        g44 g44Var = (g44) y34Var.h.getValue();
        b44 b44Var = g44Var instanceof b44 ? (b44) g44Var : null;
        return b44Var != null && b44Var.b;
    }

    @Override // defpackage.wjd
    public final i65 B() {
        trd.b.getClass();
        return new i65(":profile/avatars?id=" + this.a + "&type=contact");
    }

    @Override // defpackage.wjd
    public final qud C() {
        bkd bkdVar;
        CharSequence charSequence;
        tjd tjdVar = (tjd) this.f.a.getValue();
        if (tjdVar == null || (bkdVar = tjdVar.a) == null || (charSequence = bkdVar.e) == null) {
            return null;
        }
        return ((mld) this.H.getValue()).a(2, charSequence, false);
    }

    @Override // defpackage.wjd
    public final qud H() {
        boolean zB = ((nv7) this.B.getValue()).b(this.a);
        yab.i0(this.i, ((n0c) ((xhh) this.t.getValue())).a(), 0, new ul4(this, zB, null, 0), 2);
        return new hud(new tnh(zB ? R.string.stories_author_unhidden_snackbar : R.string.stories_author_hidden_snackbar), new b52(this, zB, 2));
    }

    @Override // defpackage.wjd
    public final Object I(l0d l0dVar) {
        return ((nm4) this.s.getValue()).a(this.a, l0dVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:102:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:114:0x030b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0319  */
    /* JADX WARN: Code duplicated, block: B:118:0x0326  */
    /* JADX WARN: Code duplicated, block: B:130:0x0391  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:135:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:139:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:142:0x0420  */
    /* JADX WARN: Code duplicated, block: B:143:0x0449  */
    /* JADX WARN: Code duplicated, block: B:158:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:164:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:170:0x0507  */
    /* JADX WARN: Code duplicated, block: B:172:0x050e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0522  */
    /* JADX WARN: Code duplicated, block: B:183:0x0542  */
    /* JADX WARN: Code duplicated, block: B:185:0x0546  */
    /* JADX WARN: Code duplicated, block: B:186:0x054a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0553  */
    /* JADX WARN: Code duplicated, block: B:190:0x0557  */
    /* JADX WARN: Code duplicated, block: B:195:0x0574  */
    /* JADX WARN: Code duplicated, block: B:202:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:210:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:218:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:223:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:225:0x0607  */
    /* JADX WARN: Code duplicated, block: B:227:0x060c  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v55 */
    public final ylc K(vg4 vg4Var, yhc yhcVar, ozg ozgVar) {
        List listB;
        ?? S;
        boolean z;
        c79 c79Var;
        CharSequence charSequence;
        String strI;
        boolean z2;
        long jW;
        String strV;
        int i;
        boolean z3;
        ynh tnhVar;
        i61 i61Var;
        rt2 rt2VarM;
        boolean z4;
        c79 c79VarW;
        kx2 kx2Var;
        List listJ;
        lyb lybVarB;
        nx2 nx2Var;
        fmd fmdVar;
        rt2 rt2VarM2;
        boolean zBooleanValue;
        c79 c79VarW2;
        c79 c79VarJ;
        fqd fqdVar;
        rt2 rt2VarM3;
        boolean z5;
        fqd fqdVar2;
        c79 c79VarW3;
        nx2 nx2Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        u8b u8bVar;
        String str;
        Collection collection;
        String name = vl4.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "buildAppBarAndItems " + vg4Var, null);
            }
        }
        String strB = xoh.b(vg4Var.r());
        boolean zC = ((jcd) this.x.getValue()).c(M(), vg4Var);
        String string = ((jcd) this.x.getValue()).a().toString();
        short s = ozgVar != null ? ozgVar.c : (short) 0;
        short s2 = ozgVar != null ? ozgVar.d : (short) 0;
        boolean zB = ((nv7) this.B.getValue()).b(this.a);
        long jV = vg4Var.v();
        boolean z6 = vg4Var.h() && !zC;
        String strK = vg4Var.k();
        CharSequence charSequenceU = vg4Var.u();
        ynh tnhVar2 = zC ? new tnh(jcd.b((jcd) this.x.getValue(), null, 1)) : new xnh(((yfd) this.p.getValue()).y(vg4Var));
        if (zC) {
            listB = Collections.singletonList(string);
        } else {
            int iA = vs0.a.a();
            ProfileScreen.B.getClass();
            listB = zdl.b(vg4Var.a.b.c, vs0.c(iA), vs0.c(gm0.K(ProfileScreen.D * yl5.d().getDisplayMetrics().density)));
        }
        List list = listB;
        if (!zC) {
            string = vg4Var.x(gm0.K(56.0f * yl5.d().getDisplayMetrics().density));
        }
        bkd bkdVar = new bkd(jV, z6, list, string, strK, charSequenceU, false, tnhVar2, ((p4c) this.d.getValue()).a(strB, true), vg4Var.D(), zC, vg4Var.G(), s, s2, zB, 64);
        vg4 vg4Var2 = (vg4) ((no4) this.n.getValue()).j(((s7f) ((et3) this.u.getValue())).t()).a.getValue();
        pbf pbfVar = (pbf) this.c.getValue();
        rt2 rt2VarM4 = M();
        pbfVar.getClass();
        xnh xnhVar = ynh.b;
        c79 c79VarW4 = yab.w();
        pbfVar.i(rt2VarM4, vg4Var, c79VarW4);
        if (((Boolean) pbfVar.f().i().i()).booleanValue()) {
            List listS = vg4Var.s();
            if (listS != null) {
                S = new ArrayList();
                for (Object obj : listS) {
                    if (!a.M0(((Long) obj).longValue(), (long[]) pbfVar.f().n().i())) {
                        S.add(obj);
                    }
                }
            } else {
                S = 0;
            }
        } else {
            S = vg4Var.s();
        }
        b5d b5dVar = ((f5d) ((wo6) pbfVar.e.getValue())).a.K2;
        zv8[] zv8VarArr = e5d.S6;
        boolean z7 = (!((Boolean) b5dVar.a(zv8VarArr[193]).i()).booleanValue() || (collection = (Collection) S) == null || collection.isEmpty()) ? false : true;
        boolean z8 = ((Boolean) ((g5d) ((gjf) pbfVar.d.getValue())).a.J2.a(zv8VarArr[192]).i()).booleanValue() && !vg4Var.E() && vg4Var.G() && !z7;
        boolean zC2 = pbfVar.g().c(rt2VarM4, vg4Var);
        p4c p4cVarE = pbfVar.e();
        p4c p4cVarE2 = pbfVar.e();
        if (vg4Var.c == null) {
            z = false;
            vg4Var.c = p4cVarE2.k.c(0, vg4Var.a.b.n);
        } else {
            z = false;
        }
        CharSequence charSequenceA = p4cVarE.a(vg4Var.c, z);
        if (!z7) {
            if (z8) {
                c79Var = c79VarW4;
                charSequence = charSequenceA;
                c79Var.add(new xqd((charSequenceA == null || charSequenceA.length() == 0) ? 524288 : 537395200, false, xnhVar, null, null, 0, null, 248));
            }
            if (!zC2 && charSequence != null && !r5h.X0(charSequence)) {
                if (vg4Var.E()) {
                    i4 = R.string.oneme_profile_section_description_bot;
                } else {
                    i4 = R.string.oneme_profile_section_description_contact;
                }
                if (z8) {
                    i5 = -1878982656;
                } else {
                    i5 = 65536;
                }
                c79Var.add(new sqd(charSequence, new tnh(i4), i5));
            }
            pbfVar.b(rt2VarM4, vg4Var, c79Var);
            strI = vg4Var.i();
            if (strI != null || strI.length() == 0 || vg4Var2 == null || Objects.equals(vg4Var2.a.b.w, vg4Var.a.b.w)) {
                z2 = z;
            } else {
                z2 = true;
            }
            if (jcd.d(pbfVar.g(), vg4Var, null, 2)) {
                gm0.x(c79.class.getName(), "Don't show phone section if profile portal blocked", null);
            } else if (((Boolean) ((f5d) ((wo6) pbfVar.e.getValue())).a.c3.a(zv8VarArr[212]).i()).booleanValue() || !z2) {
                jW = vg4Var.w();
                if (jW > 0) {
                    vtc vtcVar = (vtc) pbfVar.b.getValue();
                    String strValueOf = String.valueOf(jW);
                    xb9 xb9Var = (xb9) pbfVar.d();
                    strV = vd7.v(vtcVar, strValueOf, (String) xb9Var.n0.m(xb9Var, xb9.g1[2]), ((s7f) pbfVar.d()).m());
                    if (strV.length() > 1) {
                        c79Var.add(new ard(new tnh(R.string.oneme_profile_section_phone), strV, true));
                    }
                }
            } else {
                long jW2 = vg4Var.w();
                String strI2 = vg4Var.i();
                String strA = wge.a((wge) pbfVar.h.getValue(), strI2);
                String strV2 = vd7.v((vtc) pbfVar.b.getValue(), String.valueOf(jW2), strI2, ((s7f) pbfVar.d()).m());
                if (vg4Var.h()) {
                    i = 1;
                    if (strV2.length() > 1) {
                        z3 = true;
                    }
                    if (z3) {
                        tnhVar = new vnh(R.string.oneme_profile_section_phone_in_contact, a.n1(Arrays.copyOf(new Object[]{strA}, i)));
                    } else {
                        tnhVar = new tnh(R.string.oneme_profile_section_phone);
                    }
                    if (z3) {
                        strA = strV2;
                    }
                    c79Var.add(new ard(tnhVar, strA, z3));
                } else {
                    i = 1;
                }
                z3 = z;
                if (z3) {
                    tnhVar = new vnh(R.string.oneme_profile_section_phone_in_contact, a.n1(Arrays.copyOf(new Object[]{strA}, i)));
                } else {
                    tnhVar = new tnh(R.string.oneme_profile_section_phone);
                }
                if (z3) {
                    strA = strV2;
                }
                c79Var.add(new ard(tnhVar, strA, z3));
            }
            pbfVar.a(rt2VarM4, vg4Var, c79Var);
            pbf.c(c79Var, rt2VarM4);
            c79 c79VarJ2 = yab.j(c79Var);
            i61Var = (i61) this.b.getValue();
            rt2VarM = M();
            z4 = this.j;
            i61Var.getClass();
            if (vg4Var.D()) {
                listJ = xw3.P0(new lyb(R.id.profile_unblock_button, Integer.valueOf(R.string.oneme_profile_unblock), (Integer) null, Integer.valueOf(R.drawable.icon_privacy), (Integer) null, 52), i61.c());
            } else {
                c79VarW = yab.w();
                boolean zC3 = ((jcd) i61Var.b.getValue()).c(rt2VarM, vg4Var);
                if (!z4 && !zC3) {
                    c79VarW.add(i61.d());
                }
                if (!vg4Var.E() && !vg4Var.I() && vg4Var.B()) {
                    c79VarW.add(new lyb(R.id.profile_audio_button, Integer.valueOf(R.string.oneme_profile_audio), (Integer) null, Integer.valueOf(R.drawable.icon_call), (Integer) null, 52));
                    c79VarW.add(new lyb(R.id.profile_video_button, Integer.valueOf(R.string.oneme_profile_video), (Integer) null, Integer.valueOf(R.drawable.icon_video_call), (Integer) null, 52));
                }
                if (rt2VarM != null || (nx2Var = rt2VarM.b) == null) {
                    kx2Var = null;
                } else {
                    kx2Var = nx2Var.c;
                }
                if (kx2Var != kx2.d && rt2VarM != null) {
                    if (rt2VarM.s0((et3) i61Var.a.getValue())) {
                        lybVarB = i61.a();
                    } else {
                        lybVarB = i61.b();
                    }
                    c79VarW.add(lybVarB);
                }
                listJ = yab.j(c79VarW);
            }
            fmdVar = (fmd) this.G.getValue();
            rt2VarM2 = M();
            zBooleanValue = ((Boolean) this.l.invoke()).booleanValue();
            fmdVar.getClass();
            c79VarW2 = yab.w();
            if (!fmdVar.a.c(rt2VarM2, vg4Var)) {
                if (vg4Var.h()) {
                    c79VarW2.add((lyb) fmdVar.b.getValue());
                }
                if (rt2VarM2 != null || !rt2VarM2.i0()) {
                    c79VarW2.add((lyb) fmdVar.c.getValue());
                }
                if (rt2VarM2 != null && !rt2VarM2.K()) {
                    c79VarW2.add((lyb) fmdVar.d.getValue());
                }
                if (zBooleanValue) {
                    if (zB) {
                        i2 = R.string.stories_unhide_author_action;
                    } else {
                        i2 = R.string.stories_hide_author_action;
                    }
                    Integer numValueOf = Integer.valueOf(i2);
                    if (zB) {
                        i3 = R.drawable.icon_eye;
                    } else {
                        i3 = R.drawable.icon_eye_crossed;
                    }
                    c79VarW2.add(new lyb(R.id.profile_more_action_hide_stories, numValueOf, (Integer) null, Integer.valueOf(i3), (Integer) null, 52));
                }
                if (!vg4Var.D()) {
                    c79VarW2.add((lyb) fmdVar.g.getValue());
                }
            }
            c79VarW2.add((lyb) fmdVar.h.getValue());
            c79VarJ = yab.j(c79VarW2);
            if (!vg4Var.h() || vg4Var.D() || zC) {
                fqdVar = null;
            } else {
                fqdVar = new fqd(R.string.oneme_profile_add_to_contacts, R.id.profile_action_primary, 12);
            }
            rt2VarM3 = M();
            if (rt2VarM3 != null || (nx2Var2 = rt2VarM3.b) == null || (nx2Var2.q0 & 1) == 0) {
                z5 = z;
            } else {
                z5 = true;
            }
            if (((f5d) ((wo6) this.v.getValue())).y() || vg4Var.D() || zC || !z5) {
                fqdVar2 = null;
            } else {
                fqdVar2 = new fqd(R.string.oneme_profile_more_action_block, R.id.profile_action_secondary, 4);
            }
            c79VarW3 = yab.w();
            if (listJ.isEmpty() || !c79VarJ.isEmpty()) {
                c79VarW3.add(new eqd(listJ, c79VarJ, true));
            }
            if (fqdVar != null) {
                c79VarW3.add(fqdVar);
            }
            if (fqdVar2 != null) {
                c79VarW3.add(fqdVar2);
            }
            c79VarW3.addAll(c79VarJ2);
            return new ylc(bkdVar, yab.j(c79VarW3));
        }
        if (yhcVar != null && (str = yhcVar.b) != null) {
            xnhVar = new xnh(str);
        }
        xnh xnhVar2 = xnhVar;
        if (yhcVar == null || (u8bVar = yhcVar.h) == null) {
            u8bVar = cqb.b;
        }
        c79VarW4.add(new xqd(0, true, xnhVar2, u8bVar, (Long) ww3.t1(S), 1, Long.valueOf(vg4Var.v()), 129));
        c79Var = c79VarW4;
        charSequence = charSequenceA;
        if (!zC2) {
            if (vg4Var.E()) {
                i4 = R.string.oneme_profile_section_description_bot;
            } else {
                i4 = R.string.oneme_profile_section_description_contact;
            }
            if (z8) {
                i5 = -1878982656;
            } else {
                i5 = 65536;
            }
            c79Var.add(new sqd(charSequence, new tnh(i4), i5));
        }
        pbfVar.b(rt2VarM4, vg4Var, c79Var);
        strI = vg4Var.i();
        if (strI != null) {
            z2 = z;
        } else {
            z2 = z;
        }
        if (jcd.d(pbfVar.g(), vg4Var, null, 2)) {
            gm0.x(c79.class.getName(), "Don't show phone section if profile portal blocked", null);
        } else if (((Boolean) ((f5d) ((wo6) pbfVar.e.getValue())).a.c3.a(zv8VarArr[212]).i()).booleanValue()) {
            jW = vg4Var.w();
            if (jW > 0) {
                vtc vtcVar2 = (vtc) pbfVar.b.getValue();
                String strValueOf2 = String.valueOf(jW);
                xb9 xb9Var2 = (xb9) pbfVar.d();
                strV = vd7.v(vtcVar2, strValueOf2, (String) xb9Var2.n0.m(xb9Var2, xb9.g1[2]), ((s7f) pbfVar.d()).m());
                if (strV.length() > 1) {
                    c79Var.add(new ard(new tnh(R.string.oneme_profile_section_phone), strV, true));
                }
            }
        } else {
            jW = vg4Var.w();
            if (jW > 0) {
                vtc vtcVar3 = (vtc) pbfVar.b.getValue();
                String strValueOf3 = String.valueOf(jW);
                xb9 xb9Var3 = (xb9) pbfVar.d();
                strV = vd7.v(vtcVar3, strValueOf3, (String) xb9Var3.n0.m(xb9Var3, xb9.g1[2]), ((s7f) pbfVar.d()).m());
                if (strV.length() > 1) {
                    c79Var.add(new ard(new tnh(R.string.oneme_profile_section_phone), strV, true));
                }
            }
        }
        pbfVar.a(rt2VarM4, vg4Var, c79Var);
        pbf.c(c79Var, rt2VarM4);
        c79 c79VarJ3 = yab.j(c79Var);
        i61Var = (i61) this.b.getValue();
        rt2VarM = M();
        z4 = this.j;
        i61Var.getClass();
        if (vg4Var.D()) {
            listJ = xw3.P0(new lyb(R.id.profile_unblock_button, Integer.valueOf(R.string.oneme_profile_unblock), (Integer) null, Integer.valueOf(R.drawable.icon_privacy), (Integer) null, 52), i61.c());
        } else {
            c79VarW = yab.w();
            boolean zC4 = ((jcd) i61Var.b.getValue()).c(rt2VarM, vg4Var);
            if (!z4) {
                c79VarW.add(i61.d());
            }
            if (!vg4Var.E()) {
                c79VarW.add(new lyb(R.id.profile_audio_button, Integer.valueOf(R.string.oneme_profile_audio), (Integer) null, Integer.valueOf(R.drawable.icon_call), (Integer) null, 52));
                c79VarW.add(new lyb(R.id.profile_video_button, Integer.valueOf(R.string.oneme_profile_video), (Integer) null, Integer.valueOf(R.drawable.icon_video_call), (Integer) null, 52));
            }
            if (rt2VarM != null) {
                kx2Var = null;
            } else {
                kx2Var = null;
            }
            if (kx2Var != kx2.d) {
                if (rt2VarM.s0((et3) i61Var.a.getValue())) {
                    lybVarB = i61.a();
                } else {
                    lybVarB = i61.b();
                }
                c79VarW.add(lybVarB);
            }
            listJ = yab.j(c79VarW);
        }
        fmdVar = (fmd) this.G.getValue();
        rt2VarM2 = M();
        zBooleanValue = ((Boolean) this.l.invoke()).booleanValue();
        fmdVar.getClass();
        c79VarW2 = yab.w();
        if (!fmdVar.a.c(rt2VarM2, vg4Var)) {
            if (vg4Var.h()) {
                c79VarW2.add((lyb) fmdVar.b.getValue());
            }
            if (rt2VarM2 != null) {
                c79VarW2.add((lyb) fmdVar.c.getValue());
            } else {
                c79VarW2.add((lyb) fmdVar.c.getValue());
            }
            if (rt2VarM2 != null) {
                c79VarW2.add((lyb) fmdVar.d.getValue());
            }
            if (zBooleanValue) {
                if (zB) {
                    i2 = R.string.stories_unhide_author_action;
                } else {
                    i2 = R.string.stories_hide_author_action;
                }
                Integer numValueOf2 = Integer.valueOf(i2);
                if (zB) {
                    i3 = R.drawable.icon_eye;
                } else {
                    i3 = R.drawable.icon_eye_crossed;
                }
                c79VarW2.add(new lyb(R.id.profile_more_action_hide_stories, numValueOf2, (Integer) null, Integer.valueOf(i3), (Integer) null, 52));
            }
            if (!vg4Var.D()) {
                c79VarW2.add((lyb) fmdVar.g.getValue());
            }
        }
        c79VarW2.add((lyb) fmdVar.h.getValue());
        c79VarJ = yab.j(c79VarW2);
        if (vg4Var.h()) {
            fqdVar = null;
        } else {
            fqdVar = null;
        }
        rt2VarM3 = M();
        if (rt2VarM3 != null) {
            z5 = z;
        } else {
            z5 = z;
        }
        if (((f5d) ((wo6) this.v.getValue())).y()) {
            fqdVar2 = null;
        } else {
            fqdVar2 = null;
        }
        c79VarW3 = yab.w();
        if (listJ.isEmpty()) {
            c79VarW3.add(new eqd(listJ, c79VarJ, true));
        } else {
            c79VarW3.add(new eqd(listJ, c79VarJ, true));
        }
        if (fqdVar != null) {
            c79VarW3.add(fqdVar);
        }
        if (fqdVar2 != null) {
            c79VarW3.add(fqdVar2);
        }
        c79VarW3.addAll(c79VarJ3);
        return new ylc(bkdVar, yab.j(c79VarW3));
    }

    public final vg4 L() {
        return (vg4) ((no4) this.n.getValue()).j(this.a).a.getValue();
    }

    public final rt2 M() {
        return ((xn3) this.o.getValue()).o(this.a);
    }

    public final Long N(vg4 vg4Var) {
        List listS = vg4Var.s();
        if (listS == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            Long l = (Long) obj;
            ny8 ny8Var = this.w;
            if (((Boolean) ((e5d) ny8Var.getValue()).i().i()).booleanValue()) {
                if (a.M0(l.longValue(), (long[]) ((e5d) ny8Var.getValue()).n().i())) {
                }
            }
            arrayList.add(obj);
        }
        return (Long) ww3.t1(arrayList);
    }

    @Override // defpackage.wjd
    public final Object a(zud zudVar) {
        Object objA = ((mh4) this.r.getValue()).a(this.a, zudVar);
        return objA == hu4.a ? objA : sbi.a;
    }

    @Override // defpackage.wjd
    public final void d() {
        il5 il5Var = this.I;
        il5Var.b.f(il5Var);
        zv8[] zv8VarArr = N;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.K;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
        y34 y34Var = this.E;
        if (y34Var != null) {
            p3c p3cVar2 = y34Var.l;
            t34 t34Var = (t34) y34Var.e.getValue();
            t34Var.a.f(t34Var);
            zv8[] zv8VarArr2 = y34.m;
            vo8 vo8Var2 = (vo8) p3cVar2.m(y34Var, zv8VarArr2[0]);
            if (vo8Var2 != null) {
                vo8Var2.b(null);
            }
            p3cVar2.B(y34Var, zv8VarArr2[0], null);
        }
        this.E = null;
    }

    @Override // defpackage.wjd
    public final mk0 e() {
        return new csd(this.a, kmd.CONTACT);
    }

    @Override // defpackage.wjd
    public final String i() {
        vg4 vg4VarL = L();
        if (vg4VarL != null) {
            return vg4VarL.o();
        }
        return null;
    }

    @Override // defpackage.wjd
    public final Long j() {
        rt2 rt2VarM = M();
        if (rt2VarM != null) {
            return Long.valueOf(rt2VarM.a);
        }
        return null;
    }

    @Override // defpackage.wjd
    public final Long k() {
        rt2 rt2VarM = M();
        if (rt2VarM != null) {
            return Long.valueOf(rt2VarM.A());
        }
        return null;
    }

    @Override // defpackage.wjd
    public final int l() {
        return 2;
    }

    @Override // defpackage.wjd
    public final kmd m() {
        return kmd.CONTACT;
    }

    @Override // defpackage.wjd
    public final Object p(mdh mdhVar) {
        return ((xn3) this.o.getValue()).r(this.a, mdhVar);
    }

    @Override // defpackage.wjd
    public final String q() {
        vg4 vg4VarL = L();
        if (vg4VarL != null) {
            return String.valueOf(vg4VarL.w());
        }
        return null;
    }

    @Override // defpackage.wjd
    public final boolean t() {
        return true;
    }

    @Override // defpackage.wjd
    public final void u() {
        y34 y34Var = this.E;
        if (y34Var != null) {
            y34Var.l.B(y34Var, y34.m[0], yab.i0(y34Var.k, null, 2, new qy3(y34Var, null, 3), 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.wjd
    public final Object v(int i, lq4 lq4Var) {
        tl4 tl4Var;
        if (lq4Var instanceof tl4) {
            tl4Var = (tl4) lq4Var;
            int i2 = tl4Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tl4Var.f = i2 - Integer.MIN_VALUE;
            } else {
                tl4Var = new tl4(this, (nq4) lq4Var);
            }
        } else {
            tl4Var = new tl4(this, (nq4) lq4Var);
        }
        tl4 tl4Var2 = tl4Var;
        Object obj = tl4Var2.d;
        int i3 = tl4Var2.f;
        if (i3 == 0) {
            ch3.d0(obj);
            ny8 ny8Var = this.y;
            ny8 ny8Var2 = this.v;
            if (i == R.id.profile_action_primary) {
                if (((f5d) ((wo6) ny8Var2.getValue())).y()) {
                    ((lh4) ny8Var.getValue()).a(1);
                }
                if (((Boolean) ((f5d) ((wo6) ny8Var2.getValue())).a.B2.a(e5d.S6[183]).i()).booleanValue()) {
                    vg4 vg4VarL = L();
                    if (vg4VarL != null) {
                        long jV = vg4VarL.v();
                        ((ah4) this.z.getValue()).a(jV);
                        return new kud(jV);
                    }
                } else {
                    ch4 ch4Var = (ch4) this.q.getValue();
                    tl4Var2.f = 1;
                    Object objA = ch4Var.a(this.a, tl4Var2, null, null);
                    hu4 hu4Var = hu4.a;
                    if (objA == hu4Var) {
                        return hu4Var;
                    }
                }
            } else if (i == R.id.profile_action_secondary) {
                if (((f5d) ((wo6) ny8Var2.getValue())).y()) {
                    ((lh4) ny8Var.getValue()).a(2);
                }
                ((mld) this.H.getValue()).getClass();
                return mld.b();
            }
            return null;
        }
        if (i3 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        return new pud(4, new tnh(R.string.profile_contact_added_snackbar_title), new Integer(R.drawable.icon_check));
    }

    @Override // defpackage.wjd
    public final void w() {
        this.M.set(((yfd) this.p.getValue()).H(this.a, qt4.j(hashCode(), vl4.class.getName(), "@")));
    }

    @Override // defpackage.wjd
    public final void x() {
        a2f a2fVar = (a2f) this.M.getAndUpdate(new g23(3));
        if (a2fVar != null) {
            a2fVar.a();
        }
    }
}
