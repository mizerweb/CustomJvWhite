package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xd3 extends a8j {
    public static final /* synthetic */ zv8[] X1 = {new z8b(xd3.class, "sendMediaJob", "getSendMediaJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, xd3.class, "sendStickerJob", "getSendStickerJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "sendTypingJob", "getSendTypingJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "sendContactsJob", "getSendContactsJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "sendLocationJob", "getSendLocationJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "sendPollJob", "getSendPollJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "sendBotCommandJob", "getSendBotCommandJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "joinChatJob", "getJoinChatJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "subscribeChannelJob", "getSubscribeChannelJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "saveDraftJob", "getSaveDraftJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "restoreDraftJob", "getRestoreDraftJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "clearDraftJob", "getClearDraftJob()Lkotlinx/coroutines/Job;"), new z8b(xd3.class, "businessStatusJob", "getBusinessStatusJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public final p3c A1;
    public final ny8 B;
    public final p3c B1;
    public final ny8 C;
    public final p3c C1;
    public final ny8 D;
    public final p3c D1;
    public final ny8 E;
    public final p3c E1;
    public final ny8 F;
    public final r8e F1;
    public final ny8 G;
    public final r8e G1;
    public final ny8 H;
    public final r8e H1;
    public final ny8 I;
    public final r8e I1;
    public final ny8 J;
    public final r8e J1;
    public final ny8 K;
    public final pzf K1;
    public final ic6 L1;
    public qc3 M1;
    public final mjg N1;
    public final mjg O1;
    public final p3c P1;
    public final r8e Q1;
    public final r8e R1;
    public final r8e S1;
    public final AtomicLong T1;
    public volatile ylc U1;
    public final AtomicReference V1;
    public final AtomicReference W1;
    public final ny8 X;
    public final ny8 Y;
    public final int Z;
    public final t73 c;
    public volatile String d;
    public final q24 e;
    public final t51 f;
    public final us6 g;
    public final wz5 h;
    public final oz5 i;
    public final xne j;
    public final os3 k;
    public final lt5 l;
    public final iva m;
    public final wxb n;
    public final boolean n1;
    public final ite o;
    public final int o1;
    public final String p;
    public final long p1;
    public final ny8 q;
    public final x51 q1;
    public final ny8 r;
    public final ej6 r1;
    public final ny8 s;
    public final p3c s1;
    public final ny8 t;
    public final p3c t1;
    public final ny8 u;
    public final p3c u1;
    public final ny8 v;
    public final p3c v1;
    public final ny8 w;
    public final p3c w1;
    public final ny8 x;
    public final p3c x1;
    public final ny8 y;
    public final p3c y1;
    public final ny8 z;
    public final p3c z1;

    public xd3(long j, t73 t73Var, qx2 qx2Var, String str, q24 q24Var, boolean z, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, se4 se4Var, vz8 vz8Var, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18, ny8 ny8Var19, t51 t51Var, us6 us6Var, no4 no4Var, wz5 wz5Var, oz5 oz5Var, xne xneVar, os3 os3Var, lt5 lt5Var, iva ivaVar, wxb wxbVar, ny8 ny8Var20, v99 v99Var, Context context, ny8 ny8Var21, ny8 ny8Var22, ny8 ny8Var23, ny8 ny8Var24, ny8 ny8Var25, i5d i5dVar, i5d i5dVar2, i5d i5dVar3, i5d i5dVar4, i5d i5dVar5, ij4 ij4Var, ite iteVar) {
        int i;
        gjg gjgVarK;
        r8e r8eVarG0;
        Object tzVar;
        lq4 lq4Var;
        Object obj;
        vg4 vg4VarW;
        vg4 vg4VarW2;
        this.c = t73Var;
        this.d = str;
        this.e = q24Var;
        this.f = t51Var;
        this.g = us6Var;
        this.h = wz5Var;
        this.i = oz5Var;
        this.j = xneVar;
        this.k = os3Var;
        this.l = lt5Var;
        this.m = ivaVar;
        this.n = wxbVar;
        this.o = iteVar;
        this.p = xd3.class.getName() + "-" + j;
        this.q = ny8Var4;
        this.r = ny8Var5;
        this.s = ny8Var6;
        this.t = ny8Var7;
        this.u = ny8Var8;
        this.v = ny8Var9;
        this.w = ny8Var10;
        this.x = ny8Var11;
        this.y = ny8Var;
        this.z = ny8Var2;
        this.A = ny8Var3;
        this.B = ny8Var12;
        this.C = ny8Var13;
        this.D = ny8Var14;
        this.E = ny8Var15;
        this.F = ny8Var16;
        this.G = ny8Var17;
        this.H = ny8Var21;
        this.I = ny8Var18;
        this.J = ny8Var22;
        this.K = ny8Var23;
        this.X = ny8Var24;
        this.Y = ny8Var25;
        this.Z = ((Number) i5dVar.i()).intValue();
        this.n1 = ((Number) i5dVar2.i()).longValue() != 0;
        this.o1 = ((Number) i5dVar3.i()).intValue();
        this.p1 = ((Number) i5dVar4.i()).longValue();
        this.q1 = (x51) i5dVar5.i();
        ej6 ej6Var = new ej6((xhh) ny8Var9.getValue(), t51Var, j, qx2Var, ny8Var18, ny8Var19, ((s7f) ((et3) ny8Var5.getValue())).t());
        this.r1 = ej6Var;
        this.s1 = qyj.S();
        this.t1 = qyj.S();
        this.u1 = qyj.S();
        this.v1 = qyj.S();
        this.w1 = qyj.S();
        this.x1 = qyj.S();
        this.y1 = qyj.S();
        this.z1 = qyj.S();
        this.A1 = qyj.S();
        this.B1 = qyj.S();
        this.C1 = qyj.S();
        this.D1 = qyj.S();
        this.E1 = qyj.S();
        l7 l7Var = new l7((r8e) pq3.j.e(context).h, v99Var, context, 3);
        a8g a8gVar = j0g.a;
        this.F1 = e9i.G0(l7Var, this.b, a8gVar, null);
        if (q24Var != null) {
            gjgVarK = ((xn3) ny8Var18.getValue()).c.i(q24Var);
        } else {
            xn3 xn3Var = (xn3) ny8Var18.getValue();
            int iOrdinal = qx2Var.ordinal();
            if (iOrdinal == 0) {
                i = 1;
            } else {
                if (iOrdinal != 1) {
                    ore.o();
                    throw null;
                }
                i = 2;
            }
            xn3Var.getClass();
            int iD = qt4.D(i);
            if (iD == 0) {
                gjgVarK = xn3Var.k(j);
            } else {
                if (iD != 1) {
                    ore.o();
                    throw null;
                }
                gjgVarK = xn3Var.l(j);
            }
        }
        r8e r8eVar = (r8e) gjgVarK;
        this.G1 = r8eVar;
        this.H1 = e9i.G0(new bye(new dn0(this, ny8Var18, (lq4) null, 27)), this.b, a8gVar, Boolean.valueOf(q24Var != null));
        if (q24Var != null) {
            r8eVarG0 = e9i.G0(e9i.I(new hz1(((xn3) ny8Var18.getValue()).l(q24Var.a), 3)), this.b, a8gVar, Boolean.FALSE);
        } else {
            Boolean bool = Boolean.FALSE;
            r8eVarG0 = e9i.G0(new tz(7, bool), this.b, a8gVar, bool);
        }
        this.I1 = r8eVarG0;
        this.J1 = e9i.G0(new cu2(new jz(gjgVarK, 13), 3), this.b, a8gVar, null);
        this.K1 = e9i.b(0, 0, 7);
        this.L1 = new ic6(null);
        this.M1 = qc3.a;
        xx6 xx6VarI = e9i.I(new ie(e9i.I(new ie(vz8Var.d, this, 22)), ny8Var20, 23));
        xx6 xx6VarI2 = e9i.I(new ie(new r8e(se4Var.a), this, 24));
        this.N1 = p90.a(Boolean.valueOf(z));
        Boolean bool2 = Boolean.FALSE;
        mjg mjgVarA = p90.a(bool2);
        this.O1 = mjgVarA;
        this.P1 = qyj.S();
        jz jzVar = new jz(gjgVarK, 13);
        ghb ghbVar = ew5.b;
        this.Q1 = e9i.G0(e9i.A(e9i.H(tre.G0(jzVar, qe7.O(1, lw5.SECONDS)), new s81(6, this)), xx6VarI, xx6VarI2, e9i.I(e9i.R(new jz(gjgVarK, 13), new in1(ny8Var23, (lq4) null, 29))), mjgVarA, new wd3(this, context, null)), this.b, a8gVar, null);
        rt2 rt2Var = (rt2) r8eVar.a.getValue();
        if (rt2Var == null || (vg4VarW2 = rt2Var.w()) == null) {
            lq4Var = null;
            tzVar = new tz(7, null);
        } else {
            tzVar = no4Var.j(vg4VarW2.v());
            lq4Var = null;
        }
        this.R1 = e9i.G0(new r07(new jz(gjgVarK, 13), tzVar, new vc3(this, ny8Var5, lq4Var, 0), 0), this.b, a8gVar, lq4Var);
        this.S1 = e9i.G0(e9i.T(new ua1(new q8e(ej6Var.d), 1), ((n0c) ((xhh) ny8Var9.getValue())).b()), this.b, a8gVar, bool2);
        this.T1 = new AtomicLong(0L);
        this.V1 = new AtomicReference(null);
        e9i.j0(e9i.T(new bye(new jd3(new jz(gjgVarK, 13), (lq4) null, this)), ((n0c) H()).b()), this.b);
        e9i.j0(new fz6(new q8e(us6Var.b), new xb3(this, null, 0), 3), this.b);
        rt2 rt2Var2 = (rt2) r8eVar.a.getValue();
        ly2 ly2Var = new ly2((xhh) ny8Var9.getValue(), t51Var, rt2Var2 != null ? rt2Var2.a : j);
        e9i.j0(new dz6(new fz6(tre.G0(new p5(ly2Var.e, 29), qe7.O(300, lw5.MILLISECONDS)), new yb3(this, null, 0), 3), new zu(ly2Var, (lq4) null, 4)), this.b);
        e9i.j0(new fz6((xx6) ((gbj) ny8Var25.getValue()).d.getValue(), new yb3(this, null, 1), 3), this.b);
        rt2 rt2Var3 = (rt2) r8eVar.a.getValue();
        if (rt2Var3 == null || (vg4VarW = rt2Var3.w()) == null) {
            obj = null;
        } else {
            obj = null;
            e9i.j0(new fz6(new uc3(new l50(new q8e(ij4Var.c), vg4VarW.v(), 1), 0), new xb3(this, null, 1), 3), this.b);
        }
        this.W1 = new AtomicReference(obj);
    }

    public static final hcc B(final xd3 xd3Var, boolean z, final long j) {
        if (z) {
            final int i = 0;
            return new hcc(R.drawable.icon_call, new cf7(xd3Var) { // from class: wb3
                public final /* synthetic */ xd3 b;

                {
                    this.b = xd3Var;
                }

                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    int i2 = i;
                    sbi sbiVar = sbi.a;
                    xd3 xd3Var2 = this.b;
                    switch (i2) {
                        case 0:
                            boolean zA = ((gbj) xd3Var2.Y.getValue()).a();
                            ic6 ic6Var = xd3Var2.L1;
                            if (!zA) {
                                a8j.x(ic6Var, new oc3(14, j, 0L, null));
                            } else {
                                a8j.x(ic6Var, new nc3(true, false));
                            }
                            break;
                        default:
                            boolean zA2 = ((gbj) xd3Var2.Y.getValue()).a();
                            ic6 ic6Var2 = xd3Var2.L1;
                            if (!zA2) {
                                a8j.x(ic6Var2, new oc3(6, j, 0L, null));
                            } else {
                                a8j.x(ic6Var2, new nc3(true, false));
                            }
                            break;
                    }
                    return sbiVar;
                }
            });
        }
        final int i2 = 1;
        return new hcc(R.drawable.icon_video_call, new cf7(xd3Var) { // from class: wb3
            public final /* synthetic */ xd3 b;

            {
                this.b = xd3Var;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                xd3 xd3Var2 = this.b;
                switch (i3) {
                    case 0:
                        boolean zA = ((gbj) xd3Var2.Y.getValue()).a();
                        ic6 ic6Var = xd3Var2.L1;
                        if (!zA) {
                            a8j.x(ic6Var, new oc3(14, j, 0L, null));
                        } else {
                            a8j.x(ic6Var, new nc3(true, false));
                        }
                        break;
                    default:
                        boolean zA2 = ((gbj) xd3Var2.Y.getValue()).a();
                        ic6 ic6Var2 = xd3Var2.L1;
                        if (!zA2) {
                            a8j.x(ic6Var2, new oc3(6, j, 0L, null));
                        } else {
                            a8j.x(ic6Var2, new nc3(true, false));
                        }
                        break;
                }
                return sbiVar;
            }
        });
    }

    public static final hcc C(final xd3 xd3Var, boolean z, final long j, final String str) {
        if (z) {
            final int i = 0;
            return new hcc(R.drawable.icon_call, new cf7(xd3Var) { // from class: vb3
                public final /* synthetic */ xd3 b;

                {
                    this.b = xd3Var;
                }

                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    int i2 = i;
                    sbi sbiVar = sbi.a;
                    xd3 xd3Var2 = this.b;
                    switch (i2) {
                        case 0:
                            boolean zA = ((gbj) xd3Var2.Y.getValue()).a();
                            ic6 ic6Var = xd3Var2.L1;
                            if (!zA) {
                                a8j.x(ic6Var, new oc3(9, 0L, j, str));
                            } else {
                                a8j.x(ic6Var, new nc3(true, false));
                            }
                            break;
                        default:
                            boolean zA2 = ((gbj) xd3Var2.Y.getValue()).a();
                            ic6 ic6Var2 = xd3Var2.L1;
                            if (!zA2) {
                                a8j.x(ic6Var2, new oc3(1, 0L, j, str));
                            } else {
                                a8j.x(ic6Var2, new nc3(true, false));
                            }
                            break;
                    }
                    return sbiVar;
                }
            });
        }
        final int i2 = 1;
        return new hcc(R.drawable.icon_video_call, new cf7(xd3Var) { // from class: vb3
            public final /* synthetic */ xd3 b;

            {
                this.b = xd3Var;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                xd3 xd3Var2 = this.b;
                switch (i3) {
                    case 0:
                        boolean zA = ((gbj) xd3Var2.Y.getValue()).a();
                        ic6 ic6Var = xd3Var2.L1;
                        if (!zA) {
                            a8j.x(ic6Var, new oc3(9, 0L, j, str));
                        } else {
                            a8j.x(ic6Var, new nc3(true, false));
                        }
                        break;
                    default:
                        boolean zA2 = ((gbj) xd3Var2.Y.getValue()).a();
                        ic6 ic6Var2 = xd3Var2.L1;
                        if (!zA2) {
                            a8j.x(ic6Var2, new oc3(1, 0L, j, str));
                        } else {
                            a8j.x(ic6Var2, new nc3(true, false));
                        }
                        break;
                }
                return sbiVar;
            }
        });
    }

    public static final wzj D(xd3 xd3Var) {
        return (wzj) xd3Var.B.getValue();
    }

    public static void Y(xd3 xd3Var, long j, Long l, g4b g4bVar, Long l2, int i, int i2) {
        if ((i2 & 8) != 0) {
            l2 = null;
        }
        Long l3 = l2;
        xd3Var.t1.B(xd3Var, X1[1], yab.h0(xd3Var.b, ((n0c) xd3Var.H()).b(), 2, new ld3(xd3Var, g4bVar, (i2 & 16) != 0 ? 0 : i, l, j, l3, null)));
    }

    public final void E() {
        boolean zH = this.c.h();
        String str = this.p;
        if (zH) {
            gm0.n(str, "clear draft");
            sgg sggVarH0 = yab.h0(this.o, ((n0c) H()).a(), 2, new k23(this, null, 10));
            sggVarH0.Y(new ub3(this, 1));
            this.E1.B(this, X1[12], sggVarH0);
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "draft disabled in mode " + this.c, null);
        }
    }

    public final void F(CharSequence charSequence, Long l, ArrayList arrayList, boolean z) {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        if (l == null || rt2Var == null) {
            gm0.Y(xd3.class.getName(), "Early return in editMessage cuz of editedMessageId == null || chat == null");
            return;
        }
        sgg sggVarT = a8j.t(this, null, new ad3(rt2Var, this, l, charSequence, arrayList, z, null), 1);
        this.z1.B(this, X1[7], sggVarT);
    }

    public final et3 G() {
        return (et3) this.r.getValue();
    }

    public final xhh H() {
        return (xhh) this.v.getValue();
    }

    public final h4b I() {
        return (h4b) this.H.getValue();
    }

    public final boolean J() {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        return rt2Var != null && rt2Var.d0();
    }

    public final boolean K() {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        return rt2Var != null && rt2Var.h0();
    }

    public final void L() {
        a8j.t(this, ((n0c) H()).b(), new cd3(this, I().J(2), null, 0), 2);
    }

    public final void M(int i, int i2) {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        String strF = rt2Var != null ? rt2Var.F() : null;
        if (strF == null) {
            strF = "";
        }
        a8j.x(this.L1, new jc3(new tnh(R.string.oneme_confirm_send_message_title), new vnh(R.string.oneme_confirm_send_message_description, a.n1(Arrays.copyOf(new Object[]{strF}, 1))), xw3.P0(new kc4(i, new tnh(R.string.oneme_confirm_send_message_positive), 3, 32), new kc4(i2, new tnh(R.string.oneme_confirm_send_message_negative), 2, 32))));
    }

    public final void N(qc3 qc3Var) {
        if (this.M1 == qc3.b) {
            this.M1 = qc3.a;
        } else {
            this.M1 = qc3Var;
        }
    }

    public final void O() {
        a8j.x(this.L1, new jc3(new tnh(R.string.oneme_chat_notifications_bottom_sheet_title), null, xw3.P0(new kc4(R.id.oneme_notifications_confirmation_sheet_1_hour, new tnh(R.string.oneme_chat_notifications_disable_1_hour), 3, 56), new kc4(R.id.oneme_notifications_confirmation_sheet_4_hour, new tnh(R.string.oneme_chat_notifications_disable_4_hour), 3, 56), new kc4(R.id.oneme_notifications_confirmation_sheet_1_day, new tnh(R.string.oneme_chat_notifications_disable_1_day), 3, 56), new kc4(R.id.oneme_notifications_confirmation_sheet_forever, new tnh(R.string.oneme_chat_notifications_disable_forever), 1, 56), new kc4(R.id.oneme_confirmation_sheet_cancel, new tnh(R.string.oneme_chat_notifications_disable_cancel), 3, 56))));
    }

    public final Object P(mdh mdhVar) {
        return yab.K0(((n0c) H()).b(), new dd3(this, null, 2), mdhVar);
    }

    public final void Q(Long l) {
        boolean zH = this.c.h();
        String str = this.p;
        if (zH) {
            gm0.n(str, "restore draft");
            this.D1.B(this, X1[11], yab.h0(this.b, ((n0c) H()).b(), 2, new dn0(this, l, (lq4) null, 28)));
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "draft disabled in mode " + this.c, null);
        }
    }

    public final void R() {
        String str;
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        if (rt2Var == null || !rt2Var.b0() || rt2Var.t0() || (str = this.d) == null || str.length() == 0) {
            return;
        }
        L();
    }

    public final void S(ArrayList arrayList, ArrayList arrayList2, Long l, q87 q87Var, g4b g4bVar, Long l2) {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        if (rt2Var == null) {
            gm0.Y(xd3.class.getName(), "Early return in sendContacts cuz of chatFlow.value?.id is null");
            return;
        }
        long j = rt2Var.a;
        sgg sggVarH0 = yab.h0(this.b, ((n0c) H()).b(), 2, new fd3(this, j, l, arrayList, arrayList2, q87Var, g4bVar, l2, null));
        this.v1.B(this, X1[3], sggVarH0);
    }

    public final void T(Uri uri, Long l, q87 q87Var, g4b g4bVar, Long l2) {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        if (rt2Var == null) {
            gm0.Y(xd3.class.getName(), "Early return in sendFile cuz of chatFlow.value?.id is null");
            return;
        }
        long j = rt2Var.a;
        a0(yab.h0(this.b, ((n0c) H()).b(), 2, new gd3(uri, j, this, l, g4bVar, q87Var, l2, null)));
    }

    public final void U(vc9 vc9Var, float f, Long l, q87 q87Var, g4b g4bVar, Long l2) {
        String name = xd3.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "sendLocation " + vc9Var, null);
            }
        }
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        Long lValueOf = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
        if (lValueOf == null) {
            I().B(f4b.EMPTY_CHAT, g4bVar);
        } else {
            this.w1.B(this, X1[4], yab.h0(this.b, ((n0c) H()).b(), 2, new hd3(lValueOf, vc9Var, f, this, l, g4bVar, q87Var, l2, null)));
        }
    }

    public final void V(CharSequence charSequence, List list, boolean z, Long l, q87 q87Var, g4b g4bVar, Long l2) {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        Long lValueOf = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
        if (lValueOf == null) {
            I().B(f4b.EMPTY_CHAT, g4bVar);
        } else {
            a0(a8j.t(this, null, new id3(this, lValueOf, charSequence, list, z, l, q87Var, g4bVar, l2, null), 1));
        }
    }

    public final void W(lad ladVar, Long l, q87 q87Var, g4b g4bVar, Long l2) {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        Long lValueOf = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
        if (lValueOf == null) {
            I().B(f4b.EMPTY_CHAT, g4bVar);
        } else {
            this.x1.B(this, X1[5], yab.h0(this.b, ((n0c) H()).b(), 2, new kd3(ladVar, lValueOf, this, q87Var, l, g4bVar, l2, null)));
        }
    }

    public final void X(l2f l2fVar) {
        long jIncrementAndGet = this.T1.incrementAndGet();
        this.U1 = new ylc(Long.valueOf(jIncrementAndGet), l2fVar);
        ic6 ic6Var = this.L1;
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        a8j.x(ic6Var, new fc3(jIncrementAndGet, rt2Var != null ? vol.c(rt2Var) : r2f.c));
    }

    public final void Z(lzi lziVar, Long l, q87 q87Var, g4b g4bVar, Long l2) {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        Long lValueOf = rt2Var != null ? Long.valueOf(rt2Var.a) : null;
        if (lValueOf == null) {
            I().B(f4b.EMPTY_CHAT, g4bVar);
        } else {
            a0(a8j.t(this, null, new md3(this, lValueOf, lziVar, l, q87Var, g4bVar, l2, null), 1));
        }
    }

    public final void a0(sgg sggVar) {
        this.s1.B(this, X1[0], sggVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r9 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r9 == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b0(defpackage.lq4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.nd3
            if (r0 == 0) goto L13
            r0 = r9
            nd3 r0 = (defpackage.nd3) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L1a
        L13:
            nd3 r0 = new nd3
            nq4 r9 = (defpackage.nq4) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            ny8 r2 = r8.t
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2c
            defpackage.ch3.d0(r9)
            goto L83
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            r8 = 0
            return r8
        L33:
            defpackage.ch3.d0(r9)
            goto L66
        L37:
            defpackage.ch3.d0(r9)
            r9 = 13
            q24 r1 = r8.e
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L73
            t73 r6 = r8.c
            boolean r6 = r6.a()
            if (r6 == 0) goto L73
            ny8 r8 = r8.I
            java.lang.Object r8 = r8.getValue()
            xn3 r8 = (defpackage.xn3) r8
            long r6 = r1.a
            r8e r8 = r8.l(r6)
            jz r1 = new jz
            r1.<init>(r8, r9)
            r0.f = r4
            java.lang.Object r9 = defpackage.e9i.N(r1, r0)
            if (r9 != r5) goto L66
            goto L82
        L66:
            rt2 r9 = (defpackage.rt2) r9
            java.lang.Object r8 = r2.getValue()
            e5d r8 = (defpackage.e5d) r8
            boolean r8 = r9.k0(r8)
            goto L8f
        L73:
            jz r1 = new jz
            r8e r8 = r8.G1
            r1.<init>(r8, r9)
            r0.f = r3
            java.lang.Object r9 = defpackage.e9i.N(r1, r0)
            if (r9 != r5) goto L83
        L82:
            return r5
        L83:
            rt2 r9 = (defpackage.rt2) r9
            java.lang.Object r8 = r2.getValue()
            e5d r8 = (defpackage.e5d) r8
            boolean r8 = r9.k0(r8)
        L8f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd3.b0(lq4):java.lang.Object");
    }

    public final void c0() {
        rt2 rt2Var = (rt2) this.G1.a.getValue();
        if (rt2Var == null) {
            return;
        }
        vg4 vg4VarW = rt2Var.w();
        boolean z = this.q1.a;
        zv8[] zv8VarArr = X1;
        p3c p3cVar = this.P1;
        mjg mjgVar = this.O1;
        if (!z || !rt2Var.h0() || rt2Var.b0() || vg4VarW == null || (vg4VarW.a.b.z.b & np0.m) == 0) {
            p3cVar.B(this, zv8VarArr[13], null);
            Boolean bool = Boolean.FALSE;
            mjgVar.getClass();
            mjgVar.j(null, bool);
            return;
        }
        if (mjgVar.h(Boolean.FALSE, Boolean.TRUE)) {
            p3cVar.B(this, zv8VarArr[13], yab.i0(this.b, null, 0, new dd3(this, null, 4), 3));
        }
    }

    @Override // defpackage.a8j
    public final void y() {
        ej6 ej6Var = this.r1;
        ej6Var.b.f(ej6Var);
        us6 us6Var = this.g;
        us6Var.a.f(us6Var);
    }
}
