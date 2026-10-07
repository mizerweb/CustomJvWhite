package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x43 extends a8j implements xz9 {
    public static final /* synthetic */ zv8[] q1 = {new dwd(x43.class, "attachClickJob", "getAttachClickJob()Lru/ok/tamtam/coroutines/ReplaceableCompareJob;", 0), zo5.e(zfe.a, x43.class, "confirmationBottomSheetJob", "getConfirmationBottomSheetJob()Lkotlinx/coroutines/Job;"), new z8b(x43.class, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;"), new z8b(x43.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;")};
    public static final n11 r1 = new n11(true, (Object) us0.b, 5);
    public final ny8 B;
    public final ifh H;
    public t7a J;
    public p20 X;
    public boolean Y;
    public final ifh Z;
    public final long c;
    public final mg5 d;
    public final i43 e;
    public final xu1 f;
    public final xn3 g;
    public final sua h;
    public final pvb i;
    public final t51 j;
    public final ifh l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final mjg o1;
    public final ny8 p;
    public final r8e p1;
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
    public final String k = x43.class.getName();
    public final AtomicReference A = new AtomicReference(null);
    public final ks9 C = new ks9(25);
    public final p3c D = qyj.S();
    public final p3c E = qyj.S();
    public final p3c F = qyj.S();
    public final ifh G = new ifh(new k82(17));
    public final mjg I = p90.a(new i8b());
    public final ic6 K = new ic6(null);
    public final ex8 n1 = new ex8(9, this);

    public x43(long j, mg5 mg5Var, i43 i43Var, xu1 xu1Var, t23 t23Var, xn3 xn3Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, o7f o7fVar, ny8 ny8Var5, ny8 ny8Var6, sua suaVar, pvb pvbVar, t51 t51Var, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16) {
        this.c = j;
        this.d = mg5Var;
        this.e = i43Var;
        this.f = xu1Var;
        this.g = xn3Var;
        this.h = suaVar;
        this.i = pvbVar;
        this.j = t51Var;
        this.l = new ifh(new za2(o7fVar, 12, this));
        this.m = ny8Var;
        this.n = ny8Var2;
        this.o = ny8Var3;
        this.p = ny8Var4;
        this.q = ny8Var13;
        this.r = ny8Var7;
        this.s = ny8Var6;
        this.t = ny8Var8;
        this.u = ny8Var9;
        this.v = ny8Var10;
        this.w = ny8Var11;
        this.x = ny8Var14;
        this.y = ny8Var15;
        this.z = ny8Var16;
        lq4 lq4Var = null;
        this.B = ny8Var5;
        final int i = 0;
        this.H = new ifh(new af7(this) { // from class: k43
            public final /* synthetic */ x43 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                x43 x43Var = this.b;
                switch (i2) {
                    case 0:
                        return new r13((cea) x43Var.l.getValue());
                    default:
                        int iOrdinal = x43Var.e.ordinal();
                        if (iOrdinal == 0) {
                            return a.p1(new w50[]{w50.PHOTO, w50.VIDEO});
                        }
                        if (iOrdinal == 1) {
                            return Collections.singleton(w50.FILE);
                        }
                        if (iOrdinal == 2) {
                            return Collections.singleton(w50.SHARE);
                        }
                        if (iOrdinal == 3) {
                            return a.p1(new w50[]{w50.AUDIO, w50.VIDEO_MSG});
                        }
                        ore.o();
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.Z = new ifh(new af7(this) { // from class: k43
            public final /* synthetic */ x43 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                x43 x43Var = this.b;
                switch (i3) {
                    case 0:
                        return new r13((cea) x43Var.l.getValue());
                    default:
                        int iOrdinal = x43Var.e.ordinal();
                        if (iOrdinal == 0) {
                            return a.p1(new w50[]{w50.PHOTO, w50.VIDEO});
                        }
                        if (iOrdinal == 1) {
                            return Collections.singleton(w50.FILE);
                        }
                        if (iOrdinal == 2) {
                            return Collections.singleton(w50.SHARE);
                        }
                        if (iOrdinal == 3) {
                            return a.p1(new w50[]{w50.AUDIO, w50.VIDEO_MSG});
                        }
                        ore.o();
                        return null;
                }
            }
        });
        mjg mjgVarA = p90.a(m43.d);
        this.o1 = mjgVarA;
        this.p1 = new r8e(mjgVarA);
        rt2 rt2VarG = G();
        fda fdaVar = rt2VarG != null ? rt2VarG.c : null;
        if (fdaVar != null) {
            t51Var.d(this);
            if (i43Var == i43.b && !this.Y) {
                ((u3d) ny8Var6.getValue()).b();
                this.Y = true;
            }
            a8j.t(this, ((n0c) H()).a(), new fze(fdaVar, this, ny8Var12, lq4Var, 12), 2);
            e9i.j0(e9i.T(new fz6(new q8e(t23Var.a), new m20(2, this, x43.class, "handleChatMediaEvent", "handleChatMediaEvent(Lone/me/profile/screens/media/ChatMediaEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10), 3), ((n0c) H()).a()), this.b);
        }
    }

    public static final fda B(x43 x43Var, long j) {
        Object poeVar;
        try {
            poeVar = ((gb9) x43Var.m.getValue()).a(j, true);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        return (fda) poeVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, lq4, rt2, t7a] */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static final Object C(x43 x43Var, t7a t7aVar, nq4 nq4Var) throws Throwable {
        t43 t43Var;
        rt2 rt2VarG;
        rt2 rt2Var;
        Object objF;
        long j;
        bq6 bq6Var;
        Object obj;
        long j2;
        zfc zfcVar;
        sfa sfaVar;
        long j3;
        int i;
        hu4 hu4Var;
        ?? r5;
        Object objC;
        cig cigVar;
        long j4;
        lk9 lk9VarS0;
        r43 r43Var;
        t7a t7aVar2 = t7aVar;
        ny8 ny8Var = x43Var.p;
        ic6 ic6Var = x43Var.K;
        if (nq4Var instanceof t43) {
            t43Var = (t43) nq4Var;
            int i2 = t43Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t43Var.i = i2 - Integer.MIN_VALUE;
            } else {
                t43Var = new t43(x43Var, nq4Var);
            }
        } else {
            t43Var = new t43(x43Var, nq4Var);
        }
        t43 t43Var2 = t43Var;
        Object objA = t43Var2.g;
        int i3 = t43Var2.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var2 = hu4.a;
        if (i3 == 0) {
            ch3.d0(objA);
            rt2 rt2VarG2 = x43Var.G();
            if (rt2VarG2 != null) {
                long j5 = rt2VarG2.a;
                rt2VarG = x43Var.G();
                if (rt2VarG == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                h50 h50Var = (h50) t7aVar2.m.a.getValue();
                if (h50Var instanceof f50) {
                    rp6 rp6Var = (rp6) ny8Var.getValue();
                    long j6 = t7aVar2.b;
                    String str = t7aVar2.i;
                    String str2 = t7aVar2.e;
                    String str3 = t7aVar2.j;
                    int iD = qt4.D(t7aVar2.k);
                    if (iD == 0) {
                        bq6Var = bq6.a;
                    } else if (iD == 1) {
                        bq6Var = bq6.b;
                    } else {
                        if (iD != 2) {
                            ore.o();
                            return null;
                        }
                        bq6Var = bq6.c;
                    }
                    t43Var2.d = null;
                    t43Var2.e = null;
                    t43Var2.f = j5;
                    t43Var2.i = 1;
                    obj = null;
                    objA = rp6Var.a(j5, j6, str, str2, str3, bq6Var, t43Var2);
                    if (objA == hu4Var2) {
                        return hu4Var2;
                    }
                    j2 = j5;
                    zfcVar = (zfc) objA;
                    if (!cqk.d(zfcVar, wfc.a)) {
                        if (zfcVar instanceof xfc) {
                            xfc xfcVar = (xfc) zfcVar;
                            a8j.x(ic6Var, new i33(xfcVar.a, xfcVar.b));
                            return sbiVar;
                        }
                        if (zfcVar instanceof yfc) {
                            ore.o();
                            return obj;
                        }
                        yfc yfcVar = (yfc) zfcVar;
                        a8j.x(ic6Var, new j33(j2, yfcVar.a, yfcVar.b, true));
                        return sbiVar;
                    }
                } else {
                    rt2Var = null;
                    if ((h50Var instanceof g50) || (h50Var instanceof c50)) {
                        rp6 rp6Var2 = (rp6) ny8Var.getValue();
                        long j7 = t7aVar2.b;
                        long j8 = t7aVar2.c;
                        String str4 = t7aVar2.i;
                        long j9 = t7aVar2.g;
                        t43Var2.d = null;
                        t43Var2.e = null;
                        t43Var2.f = j5;
                        t43Var2.i = 2;
                        if (rp6Var2.b(j5, j7, j8, str4, j9, t43Var2) == hu4Var2) {
                            return hu4Var2;
                        }
                    } else if (h50Var instanceof d50) {
                        sua suaVar = x43Var.h;
                        long j10 = t7aVar2.b;
                        t43Var2.d = t7aVar2;
                        t43Var2.e = rt2VarG;
                        t43Var2.f = j5;
                        t43Var2.i = 3;
                        objF = suaVar.f(j10, t43Var2);
                        if (objF == hu4Var2) {
                            return hu4Var2;
                        }
                        j = j5;
                        sfaVar = (sfa) objF;
                        if (sfaVar != null) {
                            rp6 rp6Var3 = (rp6) ny8Var.getValue();
                            long jA = rt2VarG.A();
                            long j11 = sfaVar.b;
                            long j12 = t7aVar2.b;
                            long j13 = t7aVar2.c;
                            String str5 = t7aVar2.i;
                            String str6 = t7aVar2.e;
                            j3 = j;
                            long j14 = t7aVar2.g;
                            t43Var2.d = t7aVar2;
                            t43Var2.e = rt2Var;
                            t43Var2.f = j3;
                            t43Var2.i = 4;
                            i = 4;
                            hu4Var = hu4Var2;
                            r5 = 0;
                            objC = rp6Var3.c(jA, j11, j12, j13, str5, str6, j14, t43Var2);
                            if (objC == hu4Var) {
                                t43Var2 = t43Var2;
                                return hu4Var;
                            }
                            t43Var2 = t43Var2;
                            cigVar = (cig) objC;
                            if (!(cigVar instanceof big)) {
                                if (cigVar instanceof aig) {
                                    aig aigVar = (aig) cigVar;
                                    a8j.x(ic6Var, new q33(j3, t7aVar2.b, t7aVar2.i, t7aVar2.c, t7aVar2.e, aigVar.b, aigVar.a));
                                    return sbiVar;
                                }
                                j4 = j3;
                                if (cqk.d(cigVar, yhg.a)) {
                                    x43Var.J = t7aVar2;
                                    a8j.x(ic6Var, m33.b);
                                    return sbiVar;
                                }
                                if (cqk.d(cigVar, zhg.a)) {
                                    ore.o();
                                    return r5;
                                }
                                lk9VarS0 = ((n0c) x43Var.H()).c().S0();
                                r43Var = new r43(x43Var, r5, i);
                                t43Var2.d = r5;
                                t43Var2.e = r5;
                                t43Var2.f = j4;
                                t43Var2.i = 5;
                                if (yab.K0(lk9VarS0, r43Var, t43Var2) == hu4Var) {
                                    return hu4Var;
                                }
                            }
                        }
                    } else if (!(h50Var instanceof e50)) {
                        ore.o();
                        return null;
                    }
                }
            }
        } else if (i3 == 1) {
            long j15 = t43Var2.f;
            ch3.d0(objA);
            j2 = j15;
            obj = null;
            zfcVar = (zfc) objA;
            if (!cqk.d(zfcVar, wfc.a)) {
                if (zfcVar instanceof xfc) {
                    xfc xfcVar2 = (xfc) zfcVar;
                    a8j.x(ic6Var, new i33(xfcVar2.a, xfcVar2.b));
                    return sbiVar;
                }
                if (zfcVar instanceof yfc) {
                    ore.o();
                    return obj;
                }
                yfc yfcVar2 = (yfc) zfcVar;
                a8j.x(ic6Var, new j33(j2, yfcVar2.a, yfcVar2.b, true));
                return sbiVar;
            }
        } else {
            if (i3 == 2) {
                ch3.d0(objA);
                return sbiVar;
            }
            if (i3 == 3) {
                j = t43Var2.f;
                rt2 rt2Var2 = t43Var2.e;
                t7a t7aVar3 = t43Var2.d;
                ch3.d0(objA);
                rt2VarG = rt2Var2;
                t7aVar2 = t7aVar3;
                objF = objA;
                rt2Var = null;
                sfaVar = (sfa) objF;
                if (sfaVar != null) {
                    rp6 rp6Var4 = (rp6) ny8Var.getValue();
                    long jA2 = rt2VarG.A();
                    long j16 = sfaVar.b;
                    long j17 = t7aVar2.b;
                    long j18 = t7aVar2.c;
                    String str7 = t7aVar2.i;
                    String str8 = t7aVar2.e;
                    j3 = j;
                    long j19 = t7aVar2.g;
                    t43Var2.d = t7aVar2;
                    t43Var2.e = rt2Var;
                    t43Var2.f = j3;
                    t43Var2.i = 4;
                    i = 4;
                    hu4Var = hu4Var2;
                    r5 = 0;
                    objC = rp6Var4.c(jA2, j16, j17, j18, str7, str8, j19, t43Var2);
                    if (objC == hu4Var) {
                        t43Var2 = t43Var2;
                        return hu4Var;
                    }
                }
            } else {
                if (i3 != 4) {
                    if (i3 == 5) {
                        ch3.d0(objA);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j20 = t43Var2.f;
                t7aVar2 = t43Var2.d;
                ch3.d0(objA);
                objC = objA;
                i = 4;
                j3 = j20;
                r5 = 0;
                hu4Var = hu4Var2;
            }
            t43Var2 = t43Var2;
            cigVar = (cig) objC;
            if (!(cigVar instanceof big)) {
                if (cigVar instanceof aig) {
                    aig aigVar2 = (aig) cigVar;
                    a8j.x(ic6Var, new q33(j3, t7aVar2.b, t7aVar2.i, t7aVar2.c, t7aVar2.e, aigVar2.b, aigVar2.a));
                    return sbiVar;
                }
                j4 = j3;
                if (cqk.d(cigVar, yhg.a)) {
                    x43Var.J = t7aVar2;
                    a8j.x(ic6Var, m33.b);
                    return sbiVar;
                }
                if (cqk.d(cigVar, zhg.a)) {
                    ore.o();
                    return r5;
                }
                lk9VarS0 = ((n0c) x43Var.H()).c().S0();
                r43Var = new r43(x43Var, r5, i);
                t43Var2.d = r5;
                t43Var2.e = r5;
                t43Var2.f = j4;
                t43Var2.i = 5;
                if (yab.K0(lk9VarS0, r43Var, t43Var2) == hu4Var) {
                    return hu4Var;
                }
            }
        }
        return sbiVar;
    }

    public static final void D(x43 x43Var) {
        h8c h8cVarJ = x43Var.J();
        h8cVarJ.m(new tnh(R.string.profile_media_save_snackbar_error));
        h8cVarJ.h(new w8c(R.drawable.icon_warning));
        h8cVarJ.p();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public static final Object E(x43 x43Var, w7a w7aVar, nq4 nq4Var) {
        u43 u43Var;
        hu4 hu4Var;
        d3j d3jVar;
        w7a w7aVar2 = w7aVar;
        ny8 ny8Var = x43Var.u;
        ny8 ny8Var2 = x43Var.t;
        if (nq4Var instanceof u43) {
            u43Var = (u43) nq4Var;
            int i = u43Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                u43Var.g = i - Integer.MIN_VALUE;
            } else {
                u43Var = new u43(x43Var, nq4Var);
            }
        } else {
            u43Var = new u43(x43Var, nq4Var);
        }
        u43 u43Var2 = u43Var;
        Object obj = u43Var2.e;
        int i2 = u43Var2.g;
        d3j d3jVar2 = d3j.CHAT_MEDIA;
        sbi sbiVar = sbi.a;
        hu4 hu4Var2 = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            rt2 rt2VarG = x43Var.G();
            if (rt2VarG == null) {
                gm0.Y(x43.class.getName(), "Can't start play videoMsg because chat is null");
                return sbiVar;
            }
            b2a b2aVar = (b2a) ny8Var.getValue();
            if (((l4d) b2aVar.y.a.getValue()).a == w7aVar2.b) {
                hyi hyiVar = (hyi) ny8Var2.getValue();
                mg5 mg5Var = x43Var.d;
                long j = w7aVar2.b;
                String str = w7aVar2.d;
                l1j l1jVar = (l1j) ww3.t1(w7aVar2.h.d());
                u43Var2.d = null;
                u43Var2.g = 1;
                hu4Var = hu4Var2;
                if (hyiVar.b(rt2VarG, j, mg5Var, str, l1jVar, d3jVar2, null, true, u43Var2) != hu4Var) {
                    return sbiVar;
                }
            } else {
                hu4Var = hu4Var2;
                d3jVar = d3jVar2;
                ((b2a) ny8Var.getValue()).d(x43Var.c, x43Var.d, w7aVar2.b, true);
                hyi hyiVar2 = (hyi) ny8Var2.getValue();
                long j2 = x43Var.c;
                long j3 = w7aVar2.b;
                u43Var2.d = w7aVar2;
                u43Var2.g = 2;
                if (hyiVar2.c(j2, j3, d3jVar, u43Var2) != hu4Var) {
                }
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(obj);
            return sbiVar;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w7aVar2 = u43Var2.d;
        ch3.d0(obj);
        hu4Var = hu4Var2;
        d3jVar = d3jVar2;
        hyi hyiVar3 = (hyi) ny8Var2.getValue();
        long j4 = x43Var.c;
        long j5 = w7aVar2.b;
        mg5 mg5Var2 = x43Var.d;
        String str2 = w7aVar2.d;
        l1j l1jVar2 = (l1j) ww3.t1(w7aVar2.h.d());
        u43Var2.d = 0;
        u43Var2.g = 3;
        if (hyiVar3.d(j4, j5, mg5Var2, str2, l1jVar2, d3jVar, u43Var2) == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    public final void F(x7a x7aVar, boolean z) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) H()).b(), 2, new p43(this, x7aVar, z, null));
        this.E.B(this, q1[2], sggVarH0);
    }

    public final rt2 G() {
        return (rt2) this.g.k(this.c).a.getValue();
    }

    public final xhh H() {
        return (xhh) this.B.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable I(x7a x7aVar, nq4 nq4Var) {
        q43 q43Var;
        int i;
        if (nq4Var instanceof q43) {
            q43Var = (q43) nq4Var;
            int i2 = q43Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q43Var.g = i2 - Integer.MIN_VALUE;
            } else {
                q43Var = new q43(this, nq4Var);
            }
        } else {
            q43Var = new q43(this, nq4Var);
        }
        Object objV = q43Var.e;
        int i3 = q43Var.g;
        if (i3 == 0) {
            ch3.d0(objV);
            q43Var.d = x7aVar;
            q43Var.g = 1;
            objV = this.g.v(this.c, q43Var);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x7aVar = q43Var.d;
            ch3.d0(objV);
        }
        boolean zK0 = ((rt2) objV).k0((e5d) this.z.getValue());
        boolean z = !zK0;
        boolean z2 = x7aVar instanceof t7a;
        ifh ifhVar = this.G;
        if (z2) {
            w13 w13Var = (w13) ifhVar.getValue();
            w13Var.getClass();
            c79 c79VarW = yab.w();
            c79VarW.add((rp4) w13Var.b.getValue());
            if (!zK0) {
                c79VarW.add(w13.a(R.string.profile_media_action_forward_file));
            }
            c79VarW.add((rp4) w13Var.a.getValue());
            return yab.j(c79VarW);
        }
        if (x7aVar instanceof u7a) {
            w13 w13Var2 = (w13) ifhVar.getValue();
            w13Var2.getClass();
            c79 c79VarW2 = yab.w();
            c79VarW2.add(new rp4(R.id.profile_media_action_copy_link, new tnh(R.string.profile_media_action_copy_link), Integer.valueOf(R.drawable.icon_copy), (Integer) null, 20));
            if (!zK0) {
                c79VarW2.add(new rp4(R.id.profile_media_action_share_link, new tnh(R.string.profile_media_action_share_link), Integer.valueOf(R.drawable.icon_share_android), (Integer) null, 20));
            }
            c79VarW2.add((rp4) w13Var2.b.getValue());
            if (!zK0) {
                c79VarW2.add(w13.a(R.string.profile_media_action_forward_link));
            }
            c79VarW2.add((rp4) w13Var2.a.getValue());
            return yab.j(c79VarW2);
        }
        if (!(x7aVar instanceof v7a)) {
            if (!(x7aVar instanceof s7a) && !(x7aVar instanceof w7a)) {
                ore.o();
                return null;
            }
            return ((w13) ifhVar.getValue()).b(z);
        }
        w13 w13Var3 = (w13) ifhVar.getValue();
        w13Var3.getClass();
        v7a v7aVar = (v7a) x7aVar;
        int iD = qt4.D(v7aVar.e);
        if (iD == 0) {
            i = R.string.profile_media_action_forward_photo;
        } else if (iD == 1) {
            i = R.string.profile_media_action_forward_video;
        } else {
            if (iD != 2) {
                ore.o();
                return null;
            }
            i = R.string.profile_media_action_forward_gif;
        }
        c79 c79VarW3 = yab.w();
        if (!zK0) {
            c79VarW3.add(new rp4(R.id.profile_media_action_save, new tnh(R.string.profile_media_action_save), Integer.valueOf(R.drawable.icon_download), (Integer) null, 20));
        }
        c79VarW3.add((rp4) w13Var3.b.getValue());
        if (!zK0) {
            c79VarW3.add(w13.a(i));
        }
        if (!v7aVar.h) {
            c79VarW3.add((rp4) w13Var3.a.getValue());
        }
        return yab.j(c79VarW3);
    }

    public final h8c J() {
        return (h8c) this.r.getValue();
    }

    public final void K(x7a x7aVar) {
        h50 h50Var;
        Class<?> cls = null;
        t7a t7aVar = x7aVar instanceof t7a ? (t7a) x7aVar : null;
        if (t7aVar != null && (h50Var = (h50) t7aVar.m.a.getValue()) != null) {
            cls = h50Var.getClass();
        }
        zv8 zv8Var = q1[0];
        ((zu4) this.C.b).a(xw3.P0(x7aVar, cls), new za2(this, 11, x7aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r6v12 */
    public final void L(int i, x7a x7aVar) {
        CharSequence charSequence;
        u7a u7aVar;
        CharSequence charSequence2;
        CharSequence charSequence3;
        ic6 ic6Var = this.K;
        if (i == R.id.profile_media_action_goto_message) {
            a8j.x(ic6Var, new l33(this.c, x7aVar.l()));
            return;
        }
        if (i == R.id.profile_media_action_forward) {
            if (x7aVar instanceof t7a) {
                t7a t7aVar = (t7a) x7aVar;
                a8j.x(ic6Var, new n33(Long.valueOf(t7aVar.c), t7aVar.b, false));
                return;
            }
            if (x7aVar instanceof u7a) {
                u7a u7aVar2 = (u7a) x7aVar;
                a8j.x(ic6Var, new n33(Long.valueOf(u7aVar2.c), u7aVar2.b, true));
                return;
            }
            if (x7aVar instanceof v7a) {
                v7a v7aVar = (v7a) x7aVar;
                a8j.x(ic6Var, new n33(Long.valueOf(v7aVar.c), v7aVar.b, true));
                return;
            } else if (x7aVar instanceof s7a) {
                s7a s7aVar = (s7a) x7aVar;
                a8j.x(ic6Var, new n33(Long.valueOf(s7aVar.c), s7aVar.b, false));
                return;
            } else if (!(x7aVar instanceof w7a)) {
                ore.o();
                return;
            } else {
                w7a w7aVar = (w7a) x7aVar;
                a8j.x(ic6Var, new n33(Long.valueOf(w7aVar.c), w7aVar.b, false));
                return;
            }
        }
        dq4 dq4Var = this.b;
        u7a u7aVar3 = 0;
        if (i == R.id.profile_media_action_show_delete_confirmation) {
            this.D.B(this, q1[1], yab.h0(dq4Var, ((n0c) H()).b(), 2, new f00(this, x7aVar, (lq4) u7aVar3, 18)));
            return;
        }
        if (i == R.id.profile_media_action_delete_self) {
            F(x7aVar, true);
            return;
        }
        if (i == R.id.profile_media_action_delete_all) {
            F(x7aVar, false);
            return;
        }
        if (i == R.id.profile_media_action_open_link) {
            u7a u7aVar4 = x7aVar instanceof u7a ? (u7a) x7aVar : null;
            if (u7aVar4 == null || (charSequence3 = u7aVar4.g) == null) {
                return;
            }
            a8j.x(ic6Var, new k33(charSequence3.toString()));
            return;
        }
        if (i == R.id.profile_media_action_copy_link) {
            u7a u7aVar5 = x7aVar instanceof u7a ? (u7a) x7aVar : null;
            if (u7aVar5 == null || (charSequence2 = u7aVar5.g) == null) {
                return;
            }
            a8j.x(ic6Var, new g33(charSequence2.toString()));
            if (it3.b()) {
                h8c h8cVarJ = J();
                h8cVarJ.m(new tnh(R.string.profile_link_copy_snackbar_title));
                h8cVarJ.h(new w8c(R.drawable.copy_outline_28));
                h8cVarJ.p();
                return;
            }
            return;
        }
        if (i != R.id.profile_media_action_share_link) {
            if (i == R.id.profile_media_action_save && (x7aVar instanceof v7a)) {
                yab.i0(dq4Var, ((n0c) H()).b(), 0, new dn0(this, x7aVar, (lq4) u7aVar3, 24), 2);
                return;
            }
            return;
        }
        if (x7aVar instanceof u7a) {
            u7aVar = (u7a) x7aVar;
        }
        if (u7aVar3 == 0 || (charSequence = u7aVar3.g) == null) {
            u7aVar3 = u7aVar;
            return;
        } else {
            u7aVar3 = u7aVar;
            a8j.x(ic6Var, new o33(charSequence.toString()));
        }
    }

    @Override // defpackage.xz9
    public final wz9 g() {
        wz9 wz9Var = (wz9) this.A.get();
        return wz9Var == null ? new wz9(0L, 0L, (Set) this.Z.getValue(), this.c) : wz9Var;
    }

    @Override // defpackage.a8j
    public final void y() {
        p20 p20Var = this.X;
        if (p20Var != null) {
            p20Var.c();
        }
        if (this.Y) {
            ((u3d) this.s.getValue()).a();
            this.Y = false;
        }
        this.j.f(this);
    }
}
