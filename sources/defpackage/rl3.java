package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class rl3 extends a8j {
    public static final /* synthetic */ zv8[] Z1 = {new z8b(rl3.class, "unblockContactJob", "getUnblockContactJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, rl3.class, "showChatContextMenuJob", "getShowChatContextMenuJob()Lkotlinx/coroutines/Job;"), new z8b(rl3.class, "trailingButtonClickedJob", "getTrailingButtonClickedJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public pk3 A1;
    public final ny8 B;
    public final tm3 B1;
    public final ny8 C;
    public final mjg C1;
    public final ny8 D;
    public final mjg D1;
    public final ny8 E;
    public final r8e E1;
    public final ny8 F;
    public final r8e F1;
    public final ny8 G;
    public final mjg G1;
    public final ny8 H;
    public final r8e H1;
    public final ny8 I;
    public final mjg I1;
    public final ny8 J;
    public final r8e J1;
    public final ny8 K;
    public final ic6 K1;
    public final ic6 L1;
    public volatile m8b M1;
    public final l8b N1;
    public final mjg O1;
    public final p3c P1;
    public final p3c Q1;
    public final pzf R1;
    public final xx6 S1;
    public final sgg T1;
    public final String U1;
    public final p3c V1;
    public sgg W1;
    public final ny8 X;
    public final ifh X1;
    public final ny8 Y;
    public final ifh Y1;
    public final ny8 Z;
    public final hk4 c;
    public final String d;
    public final xu1 e;
    public final b00 f;
    public final Context g;
    public final xhh h;
    public final jk3 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 n1;
    public final ny8 o;
    public final ny8 o1;
    public final ny8 p;
    public final ny8 p1;
    public final ny8 q;
    public final ny8 q1;
    public final ny8 r;
    public final ny8 r1;
    public final ny8 s;
    public final ny8 s1;
    public final ny8 t;
    public final ny8 t1;
    public final ny8 u;
    public final ny8 u1;
    public final ny8 v;
    public final ny8 v1;
    public final ny8 w;
    public final mjg w1;
    public final ny8 x;
    public final mjg x1;
    public final ny8 y;
    public final mjg y1;
    public final ny8 z;
    public final r8e z1;

    public rl3(hk4 hk4Var, String str, xu1 xu1Var, b00 b00Var, of8 of8Var, Context context, xhh xhhVar, jk3 jk3Var, vz8 vz8Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18, ny8 ny8Var19, ny8 ny8Var20, ny8 ny8Var21, ny8 ny8Var22, ny8 ny8Var23, ny8 ny8Var24, ny8 ny8Var25, ny8 ny8Var26, ny8 ny8Var27, ny8 ny8Var28, ny8 ny8Var29, ny8 ny8Var30, ny8 ny8Var31, ny8 ny8Var32, ny8 ny8Var33, ny8 ny8Var34, ny8 ny8Var35, ny8 ny8Var36, ny8 ny8Var37, ny8 ny8Var38, ny8 ny8Var39, ny8 ny8Var40, ny8 ny8Var41, ny8 ny8Var42) {
        mjg mjgVar;
        String str2;
        tm3 tm3Var;
        r8e r8eVar;
        r17 r17VarK;
        lw5 lw5Var = lw5.SECONDS;
        this.c = hk4Var;
        this.d = str;
        this.e = xu1Var;
        this.f = b00Var;
        this.g = context;
        this.h = xhhVar;
        this.i = jk3Var;
        this.j = ny8Var2;
        this.k = ny8Var7;
        this.l = ny8Var8;
        this.m = ny8Var9;
        this.n = ny8Var42;
        this.o = ny8Var3;
        this.p = ny8Var4;
        this.q = ny8Var5;
        this.r = ny8Var6;
        this.s = ny8Var;
        this.t = ny8Var10;
        this.u = ny8Var11;
        this.v = ny8Var12;
        this.w = ny8Var14;
        this.x = ny8Var15;
        this.y = ny8Var16;
        this.z = ny8Var17;
        this.A = ny8Var18;
        this.B = ny8Var19;
        this.C = ny8Var20;
        this.D = ny8Var21;
        this.E = ny8Var22;
        this.F = ny8Var23;
        this.G = ny8Var24;
        this.H = ny8Var25;
        this.I = ny8Var26;
        this.J = ny8Var27;
        this.K = ny8Var28;
        this.X = ny8Var29;
        this.Y = ny8Var31;
        this.Z = ny8Var32;
        this.n1 = ny8Var33;
        this.o1 = ny8Var34;
        this.p1 = ny8Var35;
        this.q1 = ny8Var36;
        this.r1 = ny8Var37;
        this.s1 = ny8Var38;
        this.t1 = ny8Var39;
        this.u1 = ny8Var40;
        this.v1 = ny8Var41;
        mjg mjgVarA = p90.a(of8Var.a());
        this.w1 = mjgVarA;
        this.x1 = p90.a(c76.a);
        mjg mjgVarA2 = p90.a(0);
        this.y1 = mjgVarA2;
        r07 r07Var = new r07(mjgVarA, mjgVarA2, new adh(this, (lq4) null, 5), 0);
        Object value = mjgVarA.getValue();
        a8g a8gVar = j0g.a;
        this.z1 = e9i.G0(r07Var, this.b, a8gVar, value);
        if (((f5d) ((wo6) ny8Var8.getValue())).p()) {
            str2 = null;
            tm3Var = new tm3(this.b, xhhVar, mjgVarA, str, new uk3(this, null), new z00(1, this));
            mjgVar = mjgVarA;
        } else {
            mjgVar = mjgVarA;
            str2 = null;
            tm3Var = null;
        }
        this.B1 = tm3Var;
        mjg mjgVarA3 = p90.a(r66.a);
        this.C1 = mjgVarA3;
        mjg mjgVarA4 = p90.a(mjgVarA3.getValue());
        this.D1 = mjgVarA4;
        this.E1 = e9i.G0(new cl3(mjgVarA4, 0), this.b, a8gVar, mjgVarA4.getValue());
        this.F1 = e9i.G0(new cl3(mjgVarA4, 1), this.b, a8gVar, mjgVarA4.getValue());
        mjg mjgVarA5 = p90.a(Boolean.FALSE);
        this.G1 = mjgVarA5;
        this.H1 = new r8e(mjgVarA5);
        mjg mjgVarA6 = p90.a(str2);
        this.I1 = mjgVarA6;
        this.J1 = new r8e(mjgVarA6);
        String str3 = str2;
        this.K1 = new ic6(str3);
        this.L1 = new ic6(str3);
        this.M1 = ui9.a;
        l8b l8bVar = ki9.a;
        this.N1 = new l8b();
        this.O1 = p90.a(0L);
        this.P1 = qyj.S();
        this.Q1 = qyj.S();
        this.R1 = e9i.a(20, 20, 2);
        String name = rl3.class.getName();
        this.U1 = name;
        String strP = zo5.p(name, "-", str);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strP, this + " init", null);
            }
        }
        if (str.equals("all.chat.folder")) {
            gza gzaVar = (gza) ny8Var13.getValue();
            gzaVar.getClass();
            String name2 = gza.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, name2, gzaVar + " startObserve", null);
                }
            }
            tz tzVar = new tz(9, e9i.K(b00Var.N, 1));
            ghb ghbVar = ew5.b;
            sgg sggVarM0 = tre.m0(e9i.p(new j3(e9i.T(new fz6(e9i.T(new j3(e9i.T(e9i.H(new j3(tre.G0(tzVar, qe7.O(5, lw5Var)), 28, gzaVar), new dz(gzaVar)), gzaVar.c), 29, gzaVar), gzaVar.d), new ai8(gzaVar, null, 6), 3), gzaVar.c), 14, new ql3(3, null, 1))), gzaVar.e);
            sggVarM0.Y(new g3(20, gzaVar));
            this.T1 = sggVarM0;
        }
        n0c n0cVar = (n0c) xhhVar;
        e9i.j0(e9i.T(new fz6(new j3(e9i.C(b00Var.N, vz8Var.d, jk3Var.q, new lk3(this, null)), 5, this), new bp(2, mjgVar, f9b.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4), 3), n0cVar.a()), this.b);
        dq4 dq4Var = this.b;
        if (((Boolean) ((g5d) ((gjf) ny8Var9.getValue())).a.v0.a(e5d.S6[71]).i()).booleanValue()) {
            String strV = ((xb9) ((et3) ny8Var7.getValue())).V();
            strV = strV == null ? "" : strV;
            StringBuilder sb = new StringBuilder();
            int length = strV.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = strV.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            e9i.j0(e9i.T(new fz6(e9i.k0(new l30(new r07(this.c.b(), new fz6(new j3(new j3(this.O1, 6, this), 7, this), new l3(2, null, 3)), new il3(3, null, 0), 0), new zc6(new o6(2), 2), this, y5h.C0(sb.toString())), new el3(1, this, null)), new rk3(1, this, null)), n0cVar.a()), dq4Var);
            e9i.j0(e9i.T(new fz6(this.z1, new mk3(2, this, null), 3), n0cVar.a()), dq4Var);
        }
        dq4 dq4Var2 = this.b;
        xt4 xt4VarA = ((n0c) this.h).a();
        yt4 yt4VarJ = J();
        xt4VarA.getClass();
        yab.i0(dq4Var2, lvb.x0(xt4VarA, yt4VarJ), 0, new rk3(0, this, null), 2);
        jz jzVar = new jz(e9i.I(this.R1), 4);
        ghb ghbVar2 = ew5.b;
        e9i.j0(e9i.T(new j3(new fz6(new tz(3, new j3(e9i.r(new cy6(qe7.O(5, lw5Var), null, jzVar)), 9, this)), new mk3(3, this, null), 3), 14, new ql3(3, null, 0)), ((n0c) this.h).b().R0(1, "missed")), this.b);
        e9i.j0(e9i.T(new fz6(this.w1, new el3(2, this, null), 3), ((n0c) this.h).b()), this.b);
        if (((f5d) ((wo6) this.l.getValue())).o() && (r17VarK = K()) != null && r17VarK.s) {
            dq4 dq4Var3 = this.b;
            xt4 xt4VarA2 = ((n0c) this.h).a();
            yt4 yt4VarJ2 = J();
            xt4VarA2.getClass();
            yab.i0(dq4Var3, lvb.x0(xt4VarA2, yt4VarJ2), 0, new el3(0, this, null), 2);
        }
        this.S1 = e9i.T(new jz(e9i.I(new j3(new r07(this.z1, ((sy4) this.u.getValue()).n, new adh(3, (lq4) null, 6), 0), 8, this)), 3), ((n0c) this.h).a());
        tm3 tm3Var2 = this.B1;
        if (tm3Var2 != null && (r8eVar = tm3Var2.h) != null) {
            e9i.j0(new fz6(r8eVar, new mk3(0, this, null), 3), this.b);
        }
        e9i.j0(new fz6(((vi3) this.n1.getValue()).e, new mk3(1, this, null), 3), this.b);
        this.V1 = qyj.S();
        this.X1 = new ifh(new x5(this, 8, ny8Var30));
        this.Y1 = new ifh(new d2(8, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object B(rl3 rl3Var, long j, nq4 nq4Var) {
        qk3 qk3Var;
        rl3Var.getClass();
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof qk3) {
            qk3Var = (qk3) nq4Var;
            int i = qk3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qk3Var.f = i - Integer.MIN_VALUE;
            } else {
                qk3Var = new qk3(rl3Var, nq4Var);
            }
        } else {
            qk3Var = new qk3(rl3Var, nq4Var);
        }
        Object objH = qk3Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = qk3Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objH);
                rt2 rt2Var = (rt2) rl3Var.I().k(j).a.getValue();
                if (rt2Var == null) {
                    String str = rl3Var.U1;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, nbh.s(j, "chat#", " is null"), null);
                        }
                    }
                    return sbiVar;
                }
                eb ebVar = (eb) rl3Var.E.getValue();
                String str2 = rl3Var.d;
                long jA = rt2Var.A();
                qk3Var.f = 1;
                objH = ebVar.h(jA, qk3Var, str2);
                if (objH == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objH);
            }
            if (((Boolean) objH).booleanValue()) {
                a8j.x(rl3Var.L1, new o6f(true));
                return sbiVar;
            }
            F(rl3Var);
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            rl3Var.Q();
            return sbiVar;
        }
    }

    public static final boolean C(rl3 rl3Var, wh3 wh3Var) {
        return wh3Var.a.size() <= 10 && !wh3Var.b;
    }

    public static final void D(rl3 rl3Var, long j, long j2) {
        ((qw2) rl3Var.p.getValue()).W(j, ew5.g(j2) + ((s7f) ((et3) rl3Var.k.getValue())).f());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object E(rl3 rl3Var, long j, nq4 nq4Var) {
        xk3 xk3Var;
        rl3Var.getClass();
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof xk3) {
            xk3Var = (xk3) nq4Var;
            int i = xk3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk3Var.f = i - Integer.MIN_VALUE;
            } else {
                xk3Var = new xk3(rl3Var, nq4Var);
            }
        } else {
            xk3Var = new xk3(rl3Var, nq4Var);
        }
        Object obj = xk3Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = xk3Var.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            rt2 rt2Var = (rt2) rl3Var.I().k(j).a.getValue();
            if (rt2Var == null) {
                String str = rl3Var.U1;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, nbh.s(j, "chat#", " is null"), null);
                        return sbiVar;
                    }
                }
            } else {
                yie yieVar = (yie) rl3Var.F.getValue();
                String str2 = rl3Var.d;
                long jA = rt2Var.A();
                xk3Var.f = 1;
                if (yieVar.h(jA, xk3Var, str2) == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            rl3Var.Q();
            return sbiVar;
        }
    }

    public static final void F(rl3 rl3Var) {
        a8j.x(rl3Var.L1, new r3g(new vnh(R.string.favorite_chats_limit_exceeded, a.n1(new Object[]{Integer.valueOf(((g5d) ((gjf) rl3Var.m.getValue())).h())})), null, null, 6));
    }

    public static final void G(rl3 rl3Var, Set set) {
        mjg mjgVar = rl3Var.x1;
        LinkedHashSet linkedHashSetZ = lof.Z((Set) mjgVar.getValue(), set);
        mjgVar.j(null, linkedHashSetZ);
        mjg mjgVar2 = rl3Var.y1;
        Integer numValueOf = Integer.valueOf(linkedHashSetZ.hashCode());
        mjgVar2.getClass();
        mjgVar2.j(null, numValueOf);
        rl3Var.O(set);
    }

    public static final void H(rl3 rl3Var, long j, boolean z) {
        xt4 xt4VarB = ((n0c) rl3Var.h).b();
        yt4 yt4VarJ = rl3Var.J();
        xt4VarB.getClass();
        rl3Var.P1.B(rl3Var, Z1[0], yab.h0(rl3Var.b, lvb.x0(xt4VarB, yt4VarJ), 2, new c03(rl3Var, j, z, null, 3)));
    }

    public final xn3 I() {
        return (xn3) this.o.getValue();
    }

    public final yt4 J() {
        return (yt4) this.B.getValue();
    }

    public final r17 K() {
        return (r17) ((sy4) this.u.getValue()).j(this.d).getValue();
    }

    public final void L(int i, long j) {
        xt4 xt4VarA = ((n0c) this.h).a();
        yt4 yt4VarJ = J();
        xt4VarA.getClass();
        a8j.t(this, lvb.x0(xt4VarA, yt4VarJ), new x53(i, this, j, (lq4) null, 1), 2);
    }

    public final void M() {
        mjg mjgVar = this.O1;
        mjgVar.j(null, Long.valueOf(((Number) mjgVar.getValue()).longValue() + 1));
    }

    public final void N(long j) {
        zv8[] zv8VarArr = Z1;
        zv8 zv8Var = zv8VarArr[1];
        p3c p3cVar = this.Q1;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null && vo8Var.isActive()) {
            gm0.Y(this.U1, "early return because of contextmenu is already launched");
            return;
        }
        xt4 xt4VarA = ((n0c) this.h).a();
        yt4 yt4VarJ = J();
        xt4VarA.getClass();
        p3cVar.B(this, zv8VarArr[1], yab.h0(this.b, lvb.x0(xt4VarA, yt4VarJ), 2, new tk3(this, j, null, 3)));
    }

    public final void O(Set set) {
        ynh tnhVar;
        int i;
        if (set.isEmpty()) {
            return;
        }
        if (set.size() > 1) {
            tnhVar = new rnh(R.plurals.chat_list_multiselect_delete_count, set.size(), a.n1(new Object[]{Integer.valueOf(set.size())}));
        } else {
            Long l = (Long) ww3.s1(set);
            if (l != null) {
                rt2 rt2Var = (rt2) I().k(l.longValue()).a.getValue();
                if (rt2Var != null && rt2Var.d0()) {
                    i = R.string.chat_list_multiselect_delete_channel_single;
                } else if (rt2Var == null || !rt2Var.b0()) {
                    i = (rt2Var == null || !rt2Var.h0()) ? R.string.chat_list_multiselect_delete_group_single : R.string.chat_list_multiselect_delete_dialog_single;
                } else {
                    i = R.string.chat_list_multiselect_delete_bot_single;
                }
                tnhVar = new tnh(i);
            } else {
                tnhVar = ynh.b;
            }
        }
        a8j.x(this.L1, new r1g(tnhVar, new tc(this, 25, set)));
    }

    public final void P() {
        sgg sggVar = this.W1;
        if (sggVar == null || !sggVar.isActive()) {
            lk9 lk9VarC = ((n0c) this.h).c();
            yt4 yt4VarJ = J();
            lk9VarC.getClass();
            this.W1 = a8j.t(this, lvb.x0(lk9VarC, yt4VarJ), new jd3(this, (lq4) null, 5), 2);
        }
    }

    public final void Q() {
        a8j.x(this.L1, new r3g(new tnh(R.string.snack_network_error_title), null, new tnh(R.string.snack_network_error_description), 2));
    }

    public final void R(long j) {
        xt4 xt4VarB = ((n0c) this.h).b();
        zhb zhbVar = zhb.b;
        xt4VarB.getClass();
        yab.h0(this.b, lvb.x0(xt4VarB, zhbVar).u0(J()), 3, new tk3(this, j, null, 4));
    }

    @Override // defpackage.a8j
    public final void y() throws IllegalAccessException, InvocationTargetException {
        String strP = zo5.p(this.U1, "-", this.d);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strP, this + " onCleared()", null);
            }
        }
        sgg sggVar = this.T1;
        if (sggVar != null) {
            sggVar.b(null);
        }
        jk3 jk3Var = this.i;
        String str = this.d;
        ConcurrentHashMap concurrentHashMap = jk3Var.n;
        concurrentHashMap.remove(str);
        jk3Var.d(str);
        if (concurrentHashMap.isEmpty()) {
            jk3Var.o.clear();
        }
    }
}
