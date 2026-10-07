package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class l63 extends a8j implements xz9 {
    public static final /* synthetic */ zv8[] O1 = {new z8b(l63.class, "mediaStateHidingJob", "getMediaStateHidingJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, l63.class, "videoFetchJob", "getVideoFetchJob()Lkotlinx/coroutines/Job;"), new z8b(l63.class, "newPageJob", "getNewPageJob()Lkotlinx/coroutines/Job;"), new z8b(l63.class, "actionJob", "getActionJob()Lkotlinx/coroutines/Job;"), new z8b(l63.class, "loadFrameJob", "getLoadFrameJob()Lkotlinx/coroutines/Job;"), new z8b(l63.class, "changeOrientationJob", "getChangeOrientationJob()Lkotlinx/coroutines/Job;"), new z8b(l63.class, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;"), new z8b(l63.class, "openProfileJob", "getOpenProfileJob()Lkotlinx/coroutines/Job;"), new z8b(l63.class, "requestTotalCountJob", "getRequestTotalCountJob()Lkotlinx/coroutines/Job;")};
    public final ny8 A;
    public final pzf A1;
    public final ny8 B;
    public final q8e B1;
    public final ny8 C;
    public final mjg C1;
    public final ny8 D;
    public final r8e D1;
    public p20 E;
    public final mjg E1;
    public final bpa F;
    public final r8e F1;
    public final Set G;
    public final p3c G1;
    public final AtomicReference H;
    public final p3c H1;
    public final AtomicReference I;
    public final p3c I1;
    public final AtomicReference J;
    public final p3c J1;
    public final AtomicReference K;
    public final p3c K1;
    public final p3c L1;
    public final p3c M1;
    public final p3c N1;
    public final AtomicLong X;
    public final ic6 Y;
    public final ic6 Z;
    public final long c;
    public final mg5 d;
    public final String e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final xu1 i;
    public final Context j;
    public final sua k;
    public final xhh l;
    public final pvb m;
    public final dg0 n;
    public final mjg n1;
    public final e5d o;
    public final r8e o1;
    public final String p = l63.class.getName();
    public final mjg p1;
    public final ny8 q;
    public final r8e q1;
    public final ny8 r;
    public final mjg r1;
    public final ny8 s;
    public final r8e s1;
    public final ny8 t;
    public final mjg t1;
    public final ny8 u;
    public final r8e u1;
    public final ny8 v;
    public final mjg v1;
    public final ny8 w;
    public final r8e w1;
    public final ny8 x;
    public final mjg x1;
    public final ny8 y;
    public final r8e y1;
    public final ny8 z;
    public final p3c z1;

    public l63(long j, mg5 mg5Var, String str, long j2, boolean z, boolean z2, xu1 xu1Var, Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, sua suaVar, xhh xhhVar, pvb pvbVar, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, dg0 dg0Var, e5d e5dVar) {
        this.c = j;
        this.d = mg5Var;
        this.e = str;
        this.f = j2;
        this.g = z;
        this.h = z2;
        this.i = xu1Var;
        this.j = context;
        this.k = suaVar;
        this.l = xhhVar;
        this.m = pvbVar;
        this.n = dg0Var;
        this.o = e5dVar;
        this.q = ny8Var;
        this.r = ny8Var3;
        this.s = ny8Var4;
        this.t = ny8Var5;
        this.u = ny8Var6;
        this.v = ny8Var7;
        this.w = ny8Var8;
        this.x = ny8Var9;
        this.y = ny8Var11;
        this.z = ny8Var12;
        this.A = ny8Var13;
        this.B = ny8Var14;
        this.C = ny8Var15;
        this.D = ny8Var16;
        n0c n0cVar = (n0c) xhhVar;
        bpa bpaVarA = huk.a(cqk.D(this.b, n0cVar.a()), (t51) ny8Var10.getValue(), j, mg5Var);
        this.F = bpaVarA;
        this.G = a.p1(new w50[]{w50.PHOTO, w50.VIDEO});
        this.H = new AtomicReference(null);
        this.I = new AtomicReference(new l53(false, false));
        this.J = new AtomicReference(null);
        this.K = new AtomicReference(null);
        this.X = new AtomicLong();
        this.Y = new ic6(null);
        this.Z = new ic6(null);
        mjg mjgVarA = p90.a(m53.c);
        this.n1 = mjgVarA;
        this.o1 = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(new k53((CharSequence) null, (String) null, (CharSequence) null, false, false, 63));
        this.p1 = mjgVarA2;
        this.q1 = new r8e(mjgVarA2);
        xnh xnhVar = ynh.b;
        mjg mjgVarA3 = p90.a(new n53(xnhVar, xnhVar, false, false));
        this.r1 = mjgVarA3;
        this.s1 = new r8e(mjgVarA3);
        mjg mjgVarA4 = p90.a(new o53((py9) null, 3));
        this.t1 = mjgVarA4;
        this.u1 = new r8e(mjgVarA4);
        mjg mjgVarA5 = p90.a(nic.c);
        this.v1 = mjgVarA5;
        this.w1 = new r8e(mjgVarA5);
        mjg mjgVarA6 = p90.a(wr4.c);
        this.x1 = mjgVarA6;
        this.y1 = new r8e(mjgVarA6);
        this.z1 = qyj.S();
        pzf pzfVarA = e9i.a(1, 0, 2);
        this.A1 = pzfVarA;
        this.B1 = new q8e(pzfVarA);
        mjg mjgVarA7 = p90.a(Boolean.FALSE);
        this.C1 = mjgVarA7;
        this.D1 = new r8e(mjgVarA7);
        mjg mjgVarA8 = p90.a(Float.valueOf(((xb9) ((et3) ny8Var14.getValue())).a0() == 0.0f ? 1.0f : ((xb9) ((et3) ny8Var14.getValue())).a0()));
        this.E1 = mjgVarA8;
        this.F1 = new r8e(mjgVarA8);
        this.G1 = qyj.S();
        this.H1 = qyj.S();
        this.I1 = qyj.S();
        this.J1 = qyj.S();
        this.K1 = qyj.S();
        this.L1 = qyj.S();
        this.M1 = qyj.S();
        this.N1 = qyj.S();
        a8j.t(this, n0cVar.a(), new i53(this, ny8Var2, null), 2);
        e9i.j0(e9i.T(new fz6(bpaVarA.b(), new m20(2, this, l63.class, "handleMessageEvent", "handleMessageEvent(Lone/me/messages/list/loader/events/MessageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11), 3), n0cVar.a()), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0175, code lost:
    
        if (r15 == r10) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.l63 r13, defpackage.tga r14, defpackage.lq4 r15) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l63.B(l63, tga, lq4):java.lang.Object");
    }

    public static final boolean C(l63 l63Var, long j, String str) {
        qy9 qy9VarL = l63Var.L();
        return qy9VarL != null && qy9VarL.l() == j && cqk.d(qy9VarL.B(), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object D(l63 l63Var, int i, List list, nq4 nq4Var) {
        z53 z53Var;
        String str;
        int size;
        int i2;
        qy9 qy9Var;
        int i3;
        int i4 = i;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof z53) {
            z53Var = (z53) nq4Var;
            int i5 = z53Var.k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                z53Var.k = i5 - Integer.MIN_VALUE;
            } else {
                z53Var = new z53(l63Var, nq4Var);
            }
        } else {
            z53Var = new z53(l63Var, nq4Var);
        }
        Object obj = z53Var.i;
        Object obj2 = hu4.a;
        int i6 = z53Var.k;
        if (i6 == 0) {
            ch3.d0(obj);
            str = (String) l63Var.J.get();
            size = -1;
            if (str == null) {
                i2 = -1;
                break;
            }
            Iterator it = ((m53) l63Var.n1.getValue()).a.iterator();
            i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (cqk.d(((qy9) it.next()).B(), str)) {
                    break;
                }
                i2++;
            }
            if (i4 >= 0) {
                size = i4;
            } else if (i2 >= 0) {
                int size2 = ((m53) l63Var.n1.getValue()).a.size();
                size = size2 < list.size() ? list.size() - (size2 - i2) : i2;
            }
            vo8 vo8Var = (vo8) l63Var.H1.m(l63Var, O1[2]);
            if (vo8Var != null && vo8Var.isActive()) {
                String str2 = l63Var.p;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    StringBuilder sbP = qv1.p("Media viewer. Don't need update additional content because it already in progress,\n                    | initPos:", i4, ", \n                    | currPos:", i2, ", \n                    | currPageId:");
                    sbP.append(str);
                    a4cVar.c(je9Var, str2, s5h.y0(sbP.toString()), null);
                    return sbiVar;
                }
            } else if (size >= 0 && size < list.size()) {
                qy9 qy9Var2 = (qy9) list.get(size);
                if (str == null || cqk.d(qy9Var2.B(), str)) {
                    int size3 = list.size();
                    z53Var.g = str;
                    z53Var.h = qy9Var2;
                    z53Var.d = i4;
                    z53Var.e = i2;
                    z53Var.f = size;
                    z53Var.k = 1;
                    if (l63Var.V(size, qy9Var2, size3, z53Var) != obj2) {
                        qy9Var = qy9Var2;
                        i3 = i2;
                    }
                }
                String str3 = l63Var.p;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    String strB = qy9Var2.B();
                    StringBuilder sbP2 = qv1.p("Media viewer. Don't need update additional content because wrong pos, \n                        |initPos:", i4, ", \n                        |currPos:", i2, ", \n                        |currPageId:");
                    sbP2.append(str);
                    sbP2.append(", \n                        |calcPos:");
                    sbP2.append(size);
                    sbP2.append(", \n                        |foundPageId:");
                    sbP2.append(strB);
                    a4cVar2.c(je9Var, str3, s5h.y0(sbP2.toString()), null);
                    return sbiVar;
                }
            }
        }
        if (i6 != 1) {
            if (i6 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i7 = z53Var.f;
        i3 = z53Var.e;
        int i8 = z53Var.d;
        qy9Var = z53Var.h;
        str = z53Var.g;
        ch3.d0(obj);
        size = i7;
        i4 = i8;
        String str4 = l63Var.p;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            StringBuilder sbP3 = qv1.p("Media viewer. Call prepare info panel by pos, initPos:", i4, ", currPos:", i3, ", currPageId:");
            sbP3.append(str);
            a4cVar3.c(je9Var, str4, sbP3.toString(), null);
        }
        z53Var.g = null;
        z53Var.h = null;
        z53Var.d = i4;
        z53Var.e = i3;
        z53Var.f = size;
        z53Var.k = 2;
        return l63Var.U(qy9Var, z53Var) == obj2 ? obj2 : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[LOOP:0: B:30:0x009a->B:35:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object E(l63 l63Var, sfa sfaVar, nq4 nq4Var) {
        b63 b63Var;
        sfa sfaVar2;
        List listC;
        Iterator it;
        int i;
        int i2;
        String str;
        a4c a4cVar;
        je9 je9Var;
        qy9 qy9Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof b63) {
            b63Var = (b63) nq4Var;
            int i3 = b63Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b63Var.i = i3 - Integer.MIN_VALUE;
            } else {
                b63Var = new b63(l63Var, nq4Var);
            }
        } else {
            b63Var = new b63(l63Var, nq4Var);
        }
        b63 b63Var2 = b63Var;
        Object objV = b63Var2.g;
        Object obj = hu4.a;
        int i4 = b63Var2.i;
        if (i4 == 0) {
            ch3.d0(objV);
            xn3 xn3VarK = l63Var.K();
            long j = l63Var.c;
            sfaVar2 = sfaVar;
            b63Var2.d = sfaVar2;
            b63Var2.i = 1;
            objV = xn3VarK.v(j, b63Var2);
            if (objV != obj) {
            }
        }
        if (i4 == 1) {
            sfaVar2 = b63Var2.d;
            ch3.d0(objV);
        } else {
            if (i4 == 2) {
                ch3.d0(objV);
                listC = npk.c((MessageModel) objV);
                gm0.n(l63Var.p, "prepareSingleMode");
                it = listC.iterator();
                i = 0;
                while (true) {
                    if (it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (cqk.d(((qy9) it.next()).B(), l63Var.e)) {
                        i2 = i;
                        break;
                    }
                    i++;
                }
                if (i2 < 0 && i2 <= xw3.O0(listC)) {
                    qy9Var = (qy9) listC.get(i2);
                    mjg mjgVar = l63Var.n1;
                    m53 m53Var = new m53(i2, listC);
                    mjgVar.getClass();
                    mjgVar.j(null, m53Var);
                    int size = listC.size();
                    b63Var2.d = null;
                    b63Var2.e = qy9Var;
                    b63Var2.f = i2;
                    b63Var2.i = 3;
                    if (l63Var.V(i2, qy9Var, size, b63Var2) != obj) {
                    }
                }
                mjg mjgVar2 = l63Var.n1;
                m53 m53Var2 = new m53(2, 0, listC);
                mjgVar2.getClass();
                mjgVar2.j(null, m53Var2);
                str = l63Var.p;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.h(listC.size(), "Index not found for single media, mediaItemsSize="), null);
                    }
                }
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    ch3.d0(objV);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = b63Var2.f;
            qy9Var = b63Var2.e;
            ch3.d0(objV);
        }
        b63Var2.d = null;
        b63Var2.e = null;
        b63Var2.f = i2;
        b63Var2.i = 4;
        return l63Var.U(qy9Var, b63Var2) == obj ? obj : sbiVar;
        sfa sfaVar3 = sfaVar2;
        l0c l0cVar = (l0c) l63Var.r.getValue();
        b63Var2.d = null;
        b63Var2.i = 2;
        objV = l0c.l(l0cVar, sfaVar3, (rt2) objV, null, null, null, b63Var2, 60);
        if (objV != obj) {
            listC = npk.c((MessageModel) objV);
            gm0.n(l63Var.p, "prepareSingleMode");
            it = listC.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (cqk.d(((qy9) it.next()).B(), l63Var.e)) {
                    i2 = i;
                    break;
                }
                i++;
            }
            if (i2 < 0) {
            }
            mjg mjgVar3 = l63Var.n1;
            m53 m53Var3 = new m53(2, 0, listC);
            mjgVar3.getClass();
            mjgVar3.j(null, m53Var3);
            str = l63Var.p;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.h(listC.size(), "Index not found for single media, mediaItemsSize="), null);
                }
            }
        }
    }

    public static final boolean F(l63 l63Var, wz9 wz9Var) {
        if (wz9Var == null) {
            return false;
        }
        Set set = wz9Var.c;
        return wz9Var.d == l63Var.c && set.contains(w50.VIDEO) && set.contains(w50.PHOTO);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(nq4 nq4Var) {
        p53 p53Var;
        if (nq4Var instanceof p53) {
            p53Var = (p53) nq4Var;
            int i = p53Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                p53Var.f = i - Integer.MIN_VALUE;
            } else {
                p53Var = new p53(this, nq4Var);
            }
        } else {
            p53Var = new p53(this, nq4Var);
        }
        Object objV = p53Var.d;
        int i2 = p53Var.f;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3VarK = K();
            p53Var.f = 1;
            objV = xn3VarK.v(this.c, p53Var);
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
        return Boolean.valueOf(((rt2) objV).r0());
    }

    public final void H() {
        zv8[] zv8VarArr = O1;
        zv8 zv8Var = zv8VarArr[0];
        p3c p3cVar = this.z1;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[0], null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r11 == r7) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(defpackage.nq4 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.q53
            if (r0 == 0) goto L13
            r0 = r11
            q53 r0 = (defpackage.q53) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            q53 r0 = new q53
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.f
            java.lang.String r2 = r10.p
            r3 = 2
            r4 = 1
            sbi r5 = defpackage.sbi.a
            r6 = 0
            hu4 r7 = defpackage.hu4.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            defpackage.ch3.d0(r11)
            return r5
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r10)
            return r6
        L35:
            defpackage.ch3.d0(r11)
            goto L6b
        L39:
            defpackage.ch3.d0(r11)
            mjg r11 = r10.n1
            java.lang.Object r11 = r11.getValue()
            m53 r11 = (defpackage.m53) r11
            java.util.List r11 = r11.a
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L7f
            java.lang.String r1 = "Media viewer. Items count changed. Try request new totalCount"
            defpackage.gm0.n(r2, r1)
            java.lang.Object r11 = defpackage.ww3.t1(r11)
            qy9 r11 = (defpackage.qy9) r11
            if (r11 == 0) goto L6e
            long r8 = r11.l()
            r0.f = r4
            sua r11 = r10.k
            java.lang.Object r11 = r11.f(r8, r0)
            if (r11 != r7) goto L6b
            goto L7e
        L6b:
            r6 = r11
            sfa r6 = (defpackage.sfa) r6
        L6e:
            if (r6 != 0) goto L76
            java.lang.String r10 = "Media viewer. Items count changed. Can't request new totalCount, msg is null"
            defpackage.gm0.Y(r2, r10)
            return r5
        L76:
            r0.f = r3
            java.lang.Object r10 = r10.Y(r6, r0)
            if (r10 != r7) goto L7f
        L7e:
            return r7
        L7f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l63.I(nq4):java.lang.Object");
    }

    public final void J(long j, String str, boolean z) {
        String str2 = this.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, ewi.d(j, "Media viewer. Call fetch video msg:", ", attach:", str), null);
            }
        }
        this.G1.B(this, O1[1], yab.h0(this.b, ((n0c) this.l).b(), 2, new r53(this, j, str, z, null)));
    }

    public final xn3 K() {
        return (xn3) this.q.getValue();
    }

    public final qy9 L() {
        Object next;
        String str = (String) this.J.get();
        Iterator it = ((m53) this.n1.getValue()).a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (cqk.d(((qy9) next).B(), str)) {
                return (qy9) next;
            }
        }
        next = null;
        return (qy9) next;
    }

    public final qy9 M(long j, String str) {
        Object next;
        Iterator it = ((m53) this.o1.a.getValue()).a.iterator();
        while (it.hasNext()) {
            next = it.next();
            qy9 qy9Var = (qy9) next;
            if (qy9Var.l() == j && str.equals(qy9Var.B())) {
                return (qy9) next;
            }
        }
        next = null;
        return (qy9) next;
    }

    public final j0f N() {
        return (j0f) this.D.getValue();
    }

    public final void O(String str) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) this.l).b(), 2, new dn0(this, str, (lq4) null, 25));
        this.L1.B(this, O1[6], sggVarH0);
    }

    public final void P(String str, t59 t59Var) {
        int iOrdinal = t59Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 4) {
                String strA = ((w69) this.z.getValue()).a(str);
                if (strA == null) {
                    return;
                }
                O(strA);
                return;
            }
            if (iOrdinal != 6) {
                return;
            }
        }
        O(str);
    }

    public final void Q() {
        sgg sggVarI0 = yab.i0(this.b, null, 2, new v53(this, null), 1);
        this.z1.B(this, O1[0], sggVarI0);
    }

    public final void R(long j, String str) {
        qy9 qy9VarL = L();
        if (qy9VarL != null && qy9VarL.l() == j && cqk.d(qy9VarL.B(), str)) {
            a8j.x(this.Y, new jb6(5, false));
        }
    }

    public final void S(long j, String str) {
        qy9 qy9VarL = L();
        if (qy9VarL != null && qy9VarL.l() == j && cqk.d(qy9VarL.B(), str)) {
            a8j.x(this.Y, new jb6(4, false));
        }
    }

    public final void T(long j, String str) {
        qy9 qy9VarL = L();
        if (qy9VarL != null && qy9VarL.l() == j && cqk.d(qy9VarL.B(), str)) {
            a8j.x(this.Y, new jb6(1, false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object U(qy9 qy9Var, nq4 nq4Var) {
        a63 a63Var;
        qy9 qy9Var2;
        sfa sfaVar;
        qy9 qy9Var3;
        CharSequence charSequenceK;
        CharSequence charSequence;
        sfa sfaVar2;
        boolean z;
        sfa sfaVar3;
        qy9 qy9Var4;
        CharSequence charSequence2;
        CharSequence charSequenceM;
        vg4 vg4Var;
        CharSequence charSequence3;
        boolean z2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof a63) {
            a63Var = (a63) nq4Var;
            int i = a63Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                a63Var.j = i - Integer.MIN_VALUE;
            } else {
                a63Var = new a63(this, nq4Var);
            }
        } else {
            a63Var = new a63(this, nq4Var);
        }
        Object objF = a63Var.h;
        hu4 hu4Var = hu4.a;
        int i2 = a63Var.j;
        CharSequence charSequence4 = "";
        if (i2 == 0) {
            ch3.d0(objF);
            sua suaVar = this.k;
            long jL = qy9Var.l();
            qy9Var2 = qy9Var;
            a63Var.d = qy9Var2;
            a63Var.j = 1;
            objF = suaVar.f(jL, a63Var);
            if (objF != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            qy9Var2 = a63Var.d;
            ch3.d0(objF);
        } else {
            if (i2 == 2) {
                sfaVar = a63Var.e;
                qy9Var3 = a63Var.d;
                ch3.d0(objF);
                rt2 rt2Var = (rt2) objF;
                rt2Var.K0();
                charSequenceK = rt2Var.j;
                sfa sfaVar4 = sfaVar;
                charSequence = charSequenceK;
                sfaVar2 = sfaVar4;
                z = qy9Var3 instanceof ey9;
                if (!z) {
                    charSequenceM = ((p4c) this.t.getValue()).m(((p4c) this.t.getValue()).a(((p4c) this.t.getValue()).o(sfaVar2.g, sfaVar2.D), true), sfaVar2.D, (int) (vl5.e(q9i.s.k(bx5.b)) * yl5.d().getDisplayMetrics().density));
                    if (charSequenceM != null) {
                        charSequence4 = charSequenceM;
                    }
                }
                if (!this.d.h()) {
                }
                qy9Var4 = qy9Var3;
                charSequence3 = charSequence4;
                z2 = false;
                sfaVar3 = sfaVar2;
                mjg mjgVar = this.p1;
                k53 k53Var = new k53(charSequence, ((p4c) this.t.getValue()).e(sfaVar3.c), charSequence3, z2, qy9Var4 instanceof py9, 8);
                mjgVar.getClass();
                mjgVar.j(null, k53Var);
                return sbiVar;
            }
            if (i2 == 3) {
                sfaVar = a63Var.e;
                qy9Var3 = a63Var.d;
                ch3.d0(objF);
                vg4Var = (vg4) objF;
                if (vg4Var != null) {
                    charSequenceK = vg4Var.k();
                } else {
                    charSequenceK = null;
                }
                if (charSequenceK == null) {
                    charSequenceK = "";
                }
                sfa sfaVar5 = sfaVar;
                charSequence = charSequenceK;
                sfaVar2 = sfaVar5;
                z = qy9Var3 instanceof ey9;
                if (!z) {
                    charSequenceM = ((p4c) this.t.getValue()).m(((p4c) this.t.getValue()).a(((p4c) this.t.getValue()).o(sfaVar2.g, sfaVar2.D), true), sfaVar2.D, (int) (vl5.e(q9i.s.k(bx5.b)) * yl5.d().getDisplayMetrics().density));
                    if (charSequenceM != null) {
                        charSequence4 = charSequenceM;
                    }
                }
                if (!this.d.h() && !z) {
                    xn3 xn3VarK = K();
                    long j = this.c;
                    a63Var.d = qy9Var3;
                    a63Var.e = sfaVar2;
                    a63Var.f = charSequence;
                    a63Var.g = charSequence4;
                    a63Var.j = 4;
                    Object objV = xn3VarK.v(j, a63Var);
                    if (objV != hu4Var) {
                        qy9 qy9Var5 = qy9Var3;
                        sfaVar3 = sfaVar2;
                        objF = objV;
                        qy9Var4 = qy9Var5;
                        charSequence2 = charSequence4;
                    }
                    return hu4Var;
                }
                qy9Var4 = qy9Var3;
                charSequence3 = charSequence4;
                z2 = false;
                sfaVar3 = sfaVar2;
                mjg mjgVar2 = this.p1;
                k53 k53Var2 = new k53(charSequence, ((p4c) this.t.getValue()).e(sfaVar3.c), charSequence3, z2, qy9Var4 instanceof py9, 8);
                mjgVar2.getClass();
                mjgVar2.j(null, k53Var2);
                return sbiVar;
            }
            if (i2 != 4) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence2 = a63Var.g;
            charSequence = a63Var.f;
            sfaVar3 = a63Var.e;
            qy9Var4 = a63Var.d;
            ch3.d0(objF);
        }
        if (((rt2) objF).k0(this.o)) {
            charSequence4 = charSequence2;
            sfaVar2 = sfaVar3;
            qy9Var3 = qy9Var4;
            qy9Var4 = qy9Var3;
            charSequence3 = charSequence4;
            z2 = false;
            sfaVar3 = sfaVar2;
        } else {
            charSequence3 = charSequence2;
            z2 = true;
        }
        mjg mjgVar3 = this.p1;
        k53 k53Var3 = new k53(charSequence, ((p4c) this.t.getValue()).e(sfaVar3.c), charSequence3, z2, qy9Var4 instanceof py9, 8);
        mjgVar3.getClass();
        mjgVar3.j(null, k53Var3);
        return sbiVar;
        sfa sfaVar6 = (sfa) objF;
        if (sfaVar6 == null) {
            gm0.Y(l63.class.getName(), "Early return in prepareInfoPanelState cuz of messagesRepository.selectMessage(mediaItem.messageId) is null");
            return sbiVar;
        }
        if (sfaVar6.J == 4) {
            xn3 xn3VarK2 = K();
            long j2 = sfaVar6.h;
            a63Var.d = qy9Var2;
            a63Var.e = sfaVar6;
            a63Var.j = 2;
            Object objV2 = xn3VarK2.v(j2, a63Var);
            if (objV2 != hu4Var) {
                qy9 qy9Var6 = qy9Var2;
                sfaVar = sfaVar6;
                objF = objV2;
                qy9Var3 = qy9Var6;
                rt2 rt2Var2 = (rt2) objF;
                rt2Var2.K0();
                charSequenceK = rt2Var2.j;
                sfa sfaVar7 = sfaVar;
                charSequence = charSequenceK;
                sfaVar2 = sfaVar7;
                z = qy9Var3 instanceof ey9;
                if (!z) {
                    charSequenceM = ((p4c) this.t.getValue()).m(((p4c) this.t.getValue()).a(((p4c) this.t.getValue()).o(sfaVar2.g, sfaVar2.D), true), sfaVar2.D, (int) (vl5.e(q9i.s.k(bx5.b)) * yl5.d().getDisplayMetrics().density));
                    if (charSequenceM != null) {
                        charSequence4 = charSequenceM;
                    }
                }
                if (!this.d.h()) {
                }
                qy9Var4 = qy9Var3;
                charSequence3 = charSequence4;
                z2 = false;
                sfaVar3 = sfaVar2;
                mjg mjgVar4 = this.p1;
                k53 k53Var4 = new k53(charSequence, ((p4c) this.t.getValue()).e(sfaVar3.c), charSequence3, z2, qy9Var4 instanceof py9, 8);
                mjgVar4.getClass();
                mjgVar4.j(null, k53Var4);
                return sbiVar;
            }
        } else {
            no4 no4Var = (no4) this.s.getValue();
            long j3 = sfaVar6.e;
            a63Var.d = qy9Var2;
            a63Var.e = sfaVar6;
            a63Var.j = 3;
            Object objI = no4Var.i(j3);
            if (objI != hu4Var) {
                qy9 qy9Var7 = qy9Var2;
                sfaVar = sfaVar6;
                objF = objI;
                qy9Var3 = qy9Var7;
                vg4Var = (vg4) objF;
                if (vg4Var != null) {
                    charSequenceK = vg4Var.k();
                } else {
                    charSequenceK = null;
                }
                if (charSequenceK == null) {
                    charSequenceK = "";
                }
                sfa sfaVar8 = sfaVar;
                charSequence = charSequenceK;
                sfaVar2 = sfaVar8;
                z = qy9Var3 instanceof ey9;
                if (!z) {
                    charSequenceM = ((p4c) this.t.getValue()).m(((p4c) this.t.getValue()).a(((p4c) this.t.getValue()).o(sfaVar2.g, sfaVar2.D), true), sfaVar2.D, (int) (vl5.e(q9i.s.k(bx5.b)) * yl5.d().getDisplayMetrics().density));
                    if (charSequenceM != null) {
                        charSequence4 = charSequenceM;
                    }
                }
                if (!this.d.h()) {
                }
                qy9Var4 = qy9Var3;
                charSequence3 = charSequence4;
                z2 = false;
                sfaVar3 = sfaVar2;
                mjg mjgVar5 = this.p1;
                k53 k53Var5 = new k53(charSequence, ((p4c) this.t.getValue()).e(sfaVar3.c), charSequence3, z2, qy9Var4 instanceof py9, 8);
                mjgVar5.getClass();
                mjgVar5.j(null, k53Var5);
                return sbiVar;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x022c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0243  */
    /* JADX WARN: Code duplicated, block: B:115:0x0248  */
    /* JADX WARN: Code duplicated, block: B:118:0x0255  */
    /* JADX WARN: Code duplicated, block: B:119:0x0257  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:78:0x016e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code duplicated, block: B:83:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01be  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (r3 == r8) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V(int r19, defpackage.qy9 r20, int r21, defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l63.V(int, qy9, int, nq4):java.lang.Object");
    }

    public final void W(int i, Bundle bundle) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) this.l).a(), 2, new ht1(this, i, bundle, (lq4) null, 5));
        this.I1.B(this, O1[3], sggVarH0);
    }

    public final void X() {
        qy9 qy9VarL = L();
        if (qy9VarL instanceof ky9) {
            a8j.x(this.Y, new sb6((ky9) qy9VarL));
        } else if (qy9VarL instanceof py9) {
            py9 py9Var = (py9) qy9VarL;
            J(py9Var.a, py9Var.e, py9Var.d.l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(sfa sfaVar, nq4 nq4Var) {
        d63 d63Var;
        if (nq4Var instanceof d63) {
            d63Var = (d63) nq4Var;
            int i = d63Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                d63Var.g = i - Integer.MIN_VALUE;
            } else {
                d63Var = new d63(this, nq4Var);
            }
        } else {
            d63Var = new d63(this, nq4Var);
        }
        Object objV = d63Var.e;
        int i2 = d63Var.g;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3VarK = K();
            d63Var.d = sfaVar;
            d63Var.g = 1;
            objV = xn3VarK.v(this.c, d63Var);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sfaVar = d63Var.d;
            ch3.d0(objV);
        }
        rt2 rt2Var = (rt2) objV;
        long j = sfaVar.b;
        sbi sbiVar = sbi.a;
        if (j == 0 || rt2Var.b.a == 0) {
            gm0.Y(l63.class.getName(), "Early return in requestAttachesCount cuz of message.serverId == 0L || chat.data.serverId == 0L");
            return sbiVar;
        }
        gm0.n(this.p, "Media viewer. Start request media total count.");
        sgg sggVarH0 = yab.h0(this.b, ((n0c) this.l).a(), 2, new t20(rt2Var, sfaVar, this, (lq4) null));
        this.N1.B(this, O1[8], sggVarH0);
        return sbiVar;
    }

    public final void Z(sgg sggVar) {
        this.H1.B(this, O1[2], sggVar);
    }

    public final void a0(boolean z) {
        ny8 ny8Var = this.B;
        if (!z) {
            xb9 xb9Var = (xb9) ((et3) ny8Var.getValue());
            xb9Var.W0.B(xb9Var, xb9.g1[40], Float.valueOf(0.0f));
        } else {
            float fFloatValue = ((Number) this.E1.getValue()).floatValue();
            xb9 xb9Var2 = (xb9) ((et3) ny8Var.getValue());
            xb9Var2.W0.B(xb9Var2, xb9.g1[40], Float.valueOf(fFloatValue));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b0(lq4 lq4Var) {
        g63 g63Var;
        if (lq4Var instanceof g63) {
            g63Var = (g63) lq4Var;
            int i = g63Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g63Var.f = i - Integer.MIN_VALUE;
            } else {
                g63Var = new g63(this, (nq4) lq4Var);
            }
        } else {
            g63Var = new g63(this, (nq4) lq4Var);
        }
        Object objV = g63Var.d;
        int i2 = g63Var.f;
        if (i2 == 0) {
            ch3.d0(objV);
            xn3 xn3VarK = K();
            g63Var.f = 1;
            objV = xn3VarK.v(this.c, g63Var);
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
        return Boolean.valueOf(((rt2) objV).k0(this.o));
    }

    @Override // defpackage.xz9
    public final wz9 g() {
        wz9 wz9Var = (wz9) this.H.get();
        return wz9Var == null ? new wz9(0L, 0L, this.G, this.c) : wz9Var;
    }

    @Override // defpackage.a8j
    public final void y() {
        p20 p20Var = this.E;
        if (p20Var != null) {
            p20Var.c();
        }
        H();
        this.F.a();
    }
}
