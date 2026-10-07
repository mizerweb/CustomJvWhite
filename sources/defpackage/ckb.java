package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.messages.ChatException;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ckb {
    public final dp5 a;
    public final dp5 b;
    public final zed c;
    public final t51 d;
    public final dp5 e;
    public final dp5 f;
    public final dp5 g;
    public final dp5 h;
    public final dp5 i;
    public final dp5 j;
    public final dp5 k;
    public final dp5 l;
    public final dp5 m;
    public final dp5 n;
    public final dp5 o;
    public final dp5 p;
    public final dp5 q;
    public final dp5 r;
    public final dp5 s;

    public ckb(dp5 dp5Var, dp5 dp5Var2, zed zedVar, t51 t51Var, dp5 dp5Var3, dp5 dp5Var4, dp5 dp5Var5, dp5 dp5Var6, dp5 dp5Var7, dp5 dp5Var8, dp5 dp5Var9, dp5 dp5Var10, dp5 dp5Var11, dp5 dp5Var12, dp5 dp5Var13, dp5 dp5Var14, dp5 dp5Var15, dp5 dp5Var16, dp5 dp5Var17) {
        this.a = dp5Var;
        this.b = dp5Var2;
        this.c = zedVar;
        this.d = t51Var;
        this.e = dp5Var3;
        this.f = dp5Var4;
        this.g = dp5Var5;
        this.h = dp5Var6;
        this.i = dp5Var7;
        this.j = dp5Var8;
        this.k = dp5Var9;
        this.l = dp5Var10;
        this.m = dp5Var11;
        this.n = dp5Var12;
        this.o = dp5Var13;
        this.p = dp5Var14;
        this.q = dp5Var15;
        this.r = dp5Var16;
        this.s = dp5Var17;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x04e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(akb akbVar, mg5 mg5Var) {
        long j;
        long j2;
        gda gdaVar;
        sfa sfaVarB;
        sfa sfaVar;
        long j3;
        long j4;
        long j5;
        t51 t51Var;
        sfa sfaVar2;
        qw2 qw2Var;
        long j6;
        l40 l40Var;
        dia diaVar;
        gda gdaVar2;
        gda gdaVar3;
        long j7;
        gm0.m("ckb", "onNotifMessage: %s, %s", akbVar, mg5Var.name());
        try {
            ((a0b) this.m.get()).q(akbVar);
        } catch (TamErrorException unused) {
        }
        yfd yfdVar = (yfd) this.s.get();
        String str = akbVar.j;
        gda gdaVar4 = akbVar.f;
        long j8 = akbVar.c;
        int i = 6;
        lq4 lq4Var = null;
        if (((Boolean) yfdVar.p.i()).booleanValue()) {
            yab.i0(yfdVar.m, null, 0, new l0d(yfdVar, akbVar, lq4Var, i), 3);
        }
        dp5 dp5Var = this.e;
        qw2 qw2Var2 = (qw2) dp5Var.get();
        st2 st2Var = akbVar.d;
        rt2 rt2VarK = qw2Var2.K(j8);
        if (rt2VarK == null && st2Var != null && st2Var.a()) {
            long j9 = st2Var.j;
            Iterator it = qw2Var2.f.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rt2VarK = null;
                    break;
                }
                rt2 rt2Var = (rt2) it.next();
                if (rt2Var.b.d()) {
                    j7 = j9;
                    if (rt2Var.b.l == j7) {
                        rt2VarK = rt2Var;
                        break;
                    }
                } else {
                    j7 = j9;
                }
                j9 = j7;
            }
        }
        boolean z = st2Var != null && st2Var.b.equals("ACTIVE") && rt2VarK != null && rt2VarK.b.c == kx2.h;
        zed zedVar = this.c;
        if (rt2VarK != null || st2Var == null) {
            str = str;
        } else {
            long jG = qw2Var2.c0(Collections.singletonList(st2Var)).g();
            if (mg5Var.h()) {
                ((wzj) this.p.get()).c(new ulf(zedVar.a.g(), st2Var.a, 0, mg5.REGULAR));
                ((lz2) this.q.get()).a(6, Float.NaN);
            }
            gm0.W("ckb", "onNotifMessage: chat null, but is in notif; stored it with id = %d", Long.valueOf(jG));
            rt2VarK = qw2Var2.N(jG);
        }
        dp5 dp5Var2 = this.b;
        if (rt2VarK == null) {
            gm0.m("ckb", "onNotifMessage: %d chat not found, requesting chatInfo", Long.valueOf(j8));
            ((pvb) dp5Var2.get()).f(j8);
            return;
        }
        if (rt2VarK.b.a != j8) {
            gm0.V("ckb", "onNotifMessage: invalid chat in cache! chatServerId=" + j8 + " chat=" + rt2VarK, new ChatException.NotifMessage(j8, rt2VarK, gdaVar4));
        }
        dp5 dp5Var3 = this.f;
        qfa qfaVar = (qfa) dp5Var3.get();
        long j10 = rt2VarK.a;
        long j11 = gdaVar4.a;
        long j12 = gdaVar4.a;
        xja xjaVar = gdaVar4.e;
        long j13 = gdaVar4.d;
        b50 b50Var = gdaVar4.h;
        boolean z2 = z;
        boolean z3 = ((Long) ch3.G(((toa) ((ose) qfaVar.b.c()).h()).a, true, false, new x14(7, j10, j11))) != null;
        xb9 xb9Var = zedVar.a;
        xb9 xb9Var2 = zedVar.a;
        long j14 = 0;
        boolean z4 = j13 == xb9Var.t() || (j13 == 0 && rt2VarK.Z());
        if (st2Var != null) {
            m8b m8bVarC0 = qw2Var2.c0(Collections.singletonList(st2Var));
            if (m8bVarC0.i()) {
                gm0.W("ckb", "fail to store chat", new Object[0]);
                return;
            } else {
                rt2VarK = qw2Var2.N(m8bVarC0.g());
                if (rt2VarK == null) {
                    return;
                }
            }
        }
        rt2 rt2VarA = rt2VarK;
        fda fdaVar = rt2VarA.c;
        nx2 nx2Var = rt2VarA.b;
        long j15 = rt2VarA.a;
        xja xjaVar2 = xja.c;
        boolean z5 = z3;
        dp5 dp5Var4 = this.j;
        wja wjaVar = wja.DELETED;
        dp5 dp5Var5 = this.g;
        t51 t51Var2 = this.d;
        if (xjaVar == xjaVar2) {
            long j16 = nx2Var.a;
            List listSingletonList = Collections.singletonList(Long.valueOf(j12));
            rt2 rt2VarK2 = ((qw2) dp5Var.get()).K(j16);
            if (rt2VarK2 == null) {
                ((t1c) ((ed6) this.o.get())).a(new IllegalStateException("chat is null"));
                return;
            }
            long j17 = rt2VarK2.a;
            gm0.m("ckb", "onDelete: chat.id = %d, title = %s", Long.valueOf(j17), rt2VarK2.F());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                sfa sfaVarF = ((qfa) dp5Var3.get()).f(j17, ((Long) it2.next()).longValue());
                if (sfaVarF != null) {
                    arrayList.add(sfaVarF);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                try {
                    arrayList2.add(Long.valueOf(((sfa) it3.next()).a));
                } catch (Throwable th) {
                    qr7.o(th);
                    return;
                }
            }
            ((qfa) dp5Var3.get()).q(rt2VarK2.a, arrayList2, wjaVar, false);
            if (!mg5Var.a()) {
                nx2 nx2Var2 = rt2VarK2.b;
                gm0.m("ckb", "onDelete: chatId = %d, messageDbs.size() = %d", Long.valueOf(j17), Integer.valueOf(arrayList.size()));
                int i2 = nx2Var2.m;
                long j18 = nx2Var2.a;
                if (i2 > 0) {
                    long jZ = rt2VarK2.z();
                    Iterator it4 = arrayList.iterator();
                    int i3 = i2;
                    while (it4.hasNext()) {
                        if (((sfa) it4.next()).c > jZ) {
                            i3--;
                        }
                    }
                    if (i2 != i3) {
                        gm0.m("ckb", "onDelete: check new messages count, newCount = %d, afterDeleteCount = %d", Integer.valueOf(i2), Integer.valueOf(i3));
                        ((qw2) dp5Var.get()).j0(Math.max(0, i3), j17);
                        i8e i8eVar = (i8e) dp5Var4.get();
                        long j19 = nx2Var2.a;
                        i8eVar.getClass();
                        i8e.d(i8eVar, j19, jZ, -1L, false, false, false, 120);
                    }
                    if (i3 == 0) {
                        ((h5c) dp5Var5.get()).b(j18);
                    }
                }
                long j20 = nx2Var2.j;
                if (!arrayList.isEmpty()) {
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        try {
                            if (((sfa) it5.next()).a == j20) {
                                ((qw2) dp5Var.get()).I(j17);
                                break;
                            }
                        } catch (Throwable th2) {
                            qr7.o(th2);
                            return;
                        }
                    }
                }
                t51Var2.c(new wo3(Collections.singletonList(Long.valueOf(j17)), true));
                ((h5c) dp5Var5.get()).g(j18, null);
            }
            t51Var2.c(new j3b(j17, arrayList2, mg5Var));
            return;
        }
        sfa sfaVarF2 = ((qfa) dp5Var3.get()).f(j15, j12);
        if (sfaVarF2 == null) {
            gm0.n("ckb", "onNotifMessage: insert new message");
            j = j12;
            sfaVarF2 = ((qfa) dp5Var3.get()).l(((qfa) dp5Var3.get()).d(rt2VarA.a, akbVar.f, xb9Var2.t(), null));
        } else {
            j = j12;
            long j21 = sfaVarF2.a;
            wja wjaVar2 = sfaVarF2.j;
            if (mg5Var.a() && wjaVar2 == wjaVar) {
                gm0.m("ckb", "onNotifMessage: delayed message before respawn: id = %s, db status = %s, response status = %s", Long.valueOf(j21), wjaVar2, xjaVar);
                qfa qfaVar2 = (qfa) dp5Var3.get();
                qfaVar2.getClass();
                qfaVar2.c(j15, Collections.singletonList(Long.valueOf(j21)));
                sfaVarF2 = ((qfa) dp5Var3.get()).l(((qfa) dp5Var3.get()).d(rt2VarA.a, akbVar.f, xb9Var2.t(), null));
                gm0.m("ckb", "onNotifMessage: delayed message after respawn: id = %s, db status = %s", Long.valueOf(sfaVarF2.a), sfaVarF2.j);
                z5 = false;
            }
        }
        if ((rt2VarA.h0() && !rt2VarA.W()) || z2) {
            qw2Var2.w(j15, kx2.a);
            ((pvb) dp5Var2.get()).f(j8);
        }
        if (!z4 || gdaVar4.f == 0) {
            j2 = j15;
            gdaVar = gdaVar4;
            sfaVarB = sfaVarF2;
        } else {
            qfa qfaVar3 = (qfa) dp5Var3.get();
            long j22 = gdaVar4.f;
            ose oseVar = (ose) qfaVar3.b.c();
            toa toaVar = (toa) oseVar.h();
            rre rreVar = toaVar.a;
            koa koaVar = new koa(j15, j22, toaVar, 0);
            gdaVar = gdaVar4;
            j2 = j15;
            gga ggaVar = (gga) ch3.G(rreVar, true, false, koaVar);
            sfaVarB = ggaVar != null ? oseVar.b(ggaVar) : null;
            if (sfaVarB != null && sfaVarB.b == 0) {
                return;
            }
        }
        if (sfaVarB == null) {
            return;
        }
        dp5 dp5Var6 = this.h;
        if (!z5) {
            String str2 = str;
            gm0.n("ckb", "onNotifMessage: messageExistedBefore == false");
            ((b) dp5Var6.get()).d(qw2Var2.N(sfaVarB.h), sfaVarB);
            gm0.m("ckb", "onNotifMessage: chunks count = %d, lastEventTime = %d", Integer.valueOf(nx2Var.n.e(mg5Var).size()), Long.valueOf(nx2Var.k));
            boolean zB0 = sfaVarB.b0(xb9Var2.t());
            if (mg5Var.h() && fdaVar != null && rt2VarA.z() == fdaVar.a.c && zB0) {
                i8e i8eVar2 = (i8e) dp5Var4.get();
                long j23 = nx2Var.a;
                long j24 = sfaVarB.c;
                long j25 = sfaVarB.b;
                i8eVar2.getClass();
                i8e.d(i8eVar2, j23, j24, j25, false, false, false, 120);
            }
            if (mg5Var.ordinal() != 0) {
                sfaVar = sfaVarB;
            } else {
                sfa sfaVar3 = sfaVarB;
                rt2VarA = ((gei) this.r.get()).a(rt2VarA.a, sfaVar3, akbVar.h, akbVar.k, akbVar.l, true);
                sfaVar = sfaVar3;
            }
            rt2 rt2Var2 = rt2VarA;
            if (rt2Var2 != null) {
                long j26 = rt2Var2.a;
                nx2 nx2Var3 = rt2Var2.b;
                gm0.m("ckb", "onNotifMessage: chunks count = %d", Integer.valueOf(nx2Var3.n.e(mg5Var).size()));
                t51Var2.c(new wo3(Collections.singletonList(Long.valueOf(j26)), true));
                sfa sfaVar4 = sfaVar;
                t51Var2.c(new lc8(rt2Var2.a, sfaVar.a, akbVar.g, mg5Var, sfaVar.M(), sfaVar.e));
                if (mg5Var.h()) {
                    oc8 oc8Var = (oc8) this.k.get();
                    boolean zM = sfaVar4.M();
                    oc8Var.getClass();
                    if (!zM) {
                        gm0.n("oc8", "onIncomingMessage: chatId = " + j26);
                        oc8Var.e(j26, j13);
                    }
                }
                if (mg5Var.h() && !rt2Var2.s0(xb9Var2) && !z4 && (!akbVar.g || (!rt2Var2.d0() && ((gue) this.l.get()).e()))) {
                    ((h5c) dp5Var5.get()).g(nx2Var3.a, str2);
                }
                if (sfaVar4.C()) {
                    ((m40) this.n.get()).a(sfaVar4);
                    return;
                }
                return;
            }
            return;
        }
        gm0.n("ckb", "onNotifMessage: messageExistedBefore == true");
        if (b50Var.size() > 0) {
            l40 l40Var2 = (l40) b50Var.get(0);
            if (l40Var2.a != w50.CONTROL || (gdaVar3 = ((oq4) l40Var2).p) == null) {
                j3 = j2;
                j4 = 0;
            } else {
                long j27 = gdaVar3.a;
                sfa sfaVarF3 = ((qfa) dp5Var3.get()).f(j2, j27);
                if (sfaVarF3 != null) {
                    j14 = sfaVarF3.a;
                    j3 = j2;
                } else {
                    j3 = j2;
                }
                j4 = j27;
            }
        } else {
            j3 = j2;
            j4 = 0;
        }
        dp5 dp5Var7 = this.a;
        long j28 = j3;
        gda gdaVar5 = gdaVar;
        ((ose) ((n25) dp5Var7.get()).c()).E(gdaVar5, rt2VarA.a, 0L, false, null, false);
        ((qfa) dp5Var3.get()).o(sfaVarB, pm9.f(b50Var, (m7f) this.i.get(), j14, j4, null));
        sfa sfaVarL = ((qfa) dp5Var3.get()).l(sfaVarB.a);
        if (sfaVarL == null) {
            gm0.W("ckb", "message after update is null", new Object[0]);
            return;
        }
        sfa sfaVar5 = sfaVarL.q;
        long j29 = sfaVarL.a;
        ((b) dp5Var6.get()).d(qw2Var2.N(sfaVarL.h), sfaVarL);
        if (zedVar.b.a().s() && sfaVarL.H() && (diaVar = gdaVar5.i) != null && (gdaVar2 = diaVar.c) != null && gdaVar2.e == xjaVar2) {
            ((ose) ((n25) dp5Var7.get()).c()).A(j28, Collections.singleton(Long.valueOf(sfaVar5.a)));
            t51Var = t51Var2;
            t51Var.c(new j3b(j28, Collections.singletonList(Long.valueOf(sfaVar5.a)), mg5Var));
            j5 = j28;
            t51Var.c(new kfi(j5, j29, false));
        } else {
            j5 = j28;
            t51Var = t51Var2;
        }
        int iOrdinal = mg5Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            t51Var.c(new kfi(j5, j29, false));
            return;
        }
        if (fdaVar == null || fdaVar.a.a != j29) {
            sfaVar2 = sfaVarL;
            qw2Var = qw2Var2;
        } else {
            qw2Var = qw2Var2;
            qw2Var.g0(rt2VarA.a, sfaVarL, false, null);
            sfaVar2 = sfaVarL;
            t51Var.c(new wo3(Collections.singletonList(Long.valueOf(j5)), false));
        }
        if (z4 || !sfaVar2.G(xb9Var2.t())) {
            j6 = j5;
        } else {
            qw2 qw2Var3 = qw2Var;
            long j30 = j5;
            qw2Var = qw2Var3;
            j6 = j30;
            qw2Var.v(j6, true, new jw2(qw2Var3, sfaVar2, j30, 0));
        }
        if (z4) {
            qw2Var.f0(rt2VarA.a, rt2VarA.b, sfaVar2.s());
        }
        t51Var.c(new kfi(j6, j29, false));
        if (xjaVar == xja.b || (!
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v2 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            */
        /*
            Method dump skipped, instruction units count: 2118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckb.a(akb, mg5):void");
    }
}
