package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ose implements uoa {
    public final m7f a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;

    public ose(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, m7f m7fVar, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = m7fVar;
        this.b = ny8Var5;
        this.c = ny8Var6;
        this.d = ny8Var8;
        this.e = ny8Var7;
        this.f = ny8Var;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var2;
    }

    public static rfa B(gga ggaVar) {
        rfa rfaVar = new rfa();
        rfaVar.a = ggaVar.a;
        rfaVar.b = ggaVar.b;
        rfaVar.c = ggaVar.c;
        rfaVar.d = ggaVar.d;
        rfaVar.e = ggaVar.e;
        rfaVar.f = ggaVar.f;
        String str = ggaVar.g;
        rfaVar.g = str != null ? str.intern() : null;
        rfaVar.h = ggaVar.z;
        rfaVar.i = ggaVar.h;
        rfaVar.j = ggaVar.i;
        rfaVar.k = ggaVar.k;
        rfaVar.l = ggaVar.l;
        rfaVar.m = ggaVar.m;
        rfaVar.n = ggaVar.n;
        rfaVar.o = ggaVar.q;
        rfaVar.p = ggaVar.t;
        rfaVar.r = ggaVar.u;
        rfaVar.s = ggaVar.v;
        rfaVar.t = ggaVar.w;
        rfaVar.H = ggaVar.K;
        rfaVar.y = ggaVar.y;
        rfaVar.x = ggaVar.x;
        rfaVar.u = ggaVar.p;
        rfaVar.v = ggaVar.A;
        rfaVar.w = ggaVar.B;
        rfaVar.I = ggaVar.L;
        rfaVar.A = ggaVar.C;
        rfaVar.B = ggaVar.D;
        rfaVar.C = ggaVar.E;
        rfaVar.b(ggaVar.F);
        kja kjaVar = ggaVar.G;
        long j = ggaVar.J;
        rfaVar.E = kjaVar;
        rfaVar.G = j;
        return rfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x020c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0219  */
    /* JADX WARN: Code duplicated, block: B:80:0x0227 A[PHI: r14
  0x0227: PHI (r14v1 b50) = (r14v0 b50), (r14v0 b50), (r14v2 b50) binds: [B:74:0x021b, B:76:0x021f, B:79:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0256  */
    /* JADX WARN: Code duplicated, block: B:86:0x025a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0270  */
    /* JADX WARN: Code duplicated, block: B:90:0x0273 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static long i(ose oseVar, long j, gda gdaVar, long j2, Long l, boolean z, int i) {
        long j3;
        boolean z2;
        long j4;
        long jI;
        gda gdaVar2;
        ose oseVar2;
        long j5;
        long j6;
        boolean z3;
        long j7;
        int i2;
        int i3;
        ose oseVar3;
        long j8;
        gda gdaVar3;
        long j9;
        sfa sfaVarC;
        gga ggaVar;
        long j10;
        b50 b50Var;
        boolean z4 = (i & 16) == 0;
        boolean z5 = (i & 32) != 0 ? false : z;
        wna wnaVarH = oseVar.h();
        long j11 = gdaVar.a;
        long j12 = gdaVar.f;
        b50 b50Var2 = gdaVar.h;
        dia diaVar = gdaVar.i;
        boolean z6 = ((Long) ch3.G(((toa) wnaVarH).a, true, false, new x14(7, j, j11))) != null;
        if (j12 != 0 && j2 == gdaVar.d) {
            j3 = j11;
            Long l2 = (Long) ch3.G(((toa) oseVar.h()).a, true, false, new x14(8, j, j12));
            if (l2 != null && (l2.longValue() == 0 || l2.longValue() == j3)) {
                z2 = true;
            }
            if (diaVar != null) {
                j4 = j3;
                jI = i(oseVar, j, diaVar.c, j2, null, false, 32);
            } else {
                j4 = j3;
                jI = 0;
            }
            if (b50Var2.size() > 0 || !(b50Var2.get(0) instanceof oq4)) {
                gdaVar2 = null;
            } else {
                gdaVar2 = ((oq4) b50Var2.get(0)).p;
            }
            if (gdaVar2 != null) {
                oseVar2 = oseVar;
                long jI2 = i(oseVar2, j, gdaVar2, j2, null, false, 32);
                j6 = gdaVar2.a;
                j5 = jI2;
            } else {
                oseVar2 = oseVar;
                j5 = 0;
                j6 = 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z6 && !z2) {
                xfa xfaVar = xfa.SENT;
                ps3 ps3Var = new ps3(4, arrayList);
                Long lA = v7e.a(l);
                long jLongValue = lA != null ? lA.longValue() : 0L;
                c46 c46VarF = (diaVar == null || jI <= 0 || diaVar.a != 3) ? pm9.f(b50Var2, oseVar2.a, j5, j6, ps3Var) : pm9.f(diaVar.c.h, oseVar2.a, 0L, 0L, null);
                zia ziaVarL = oseVar2.l(j, gdaVar, jI, z4, pm9.n(gdaVar.e));
                long jE = ziaVarL.e();
                long jS = ziaVarL.s();
                long jV = ziaVarL.v();
                long jY = ziaVarL.y();
                long jR = ziaVarL.r();
                long jC = ziaVarL.c();
                int iX = ziaVarL.x();
                String strU = ziaVarL.u();
                wja wjaVarT = ziaVarL.t();
                int iA = pm9.a(c46VarF);
                List listD = ziaVarL.d();
                kja kjaVarQ = ziaVarL.q();
                int iN = ziaVarL.n();
                long jM = ziaVarL.m();
                long jL = ziaVarL.l();
                String strK = ziaVarL.k();
                String strJ = ziaVarL.j();
                String strI = ziaVarL.i();
                int iH = ziaVarL.h();
                boolean zF = ziaVarL.f();
                vja vjaVar = gdaVar.k;
                return ((Number) oseVar.e().a(new tqa(oseVar, new gga(jE, jS, jV, jY, jR, jC, strU, xfaVar, wjaVarT, 0L, c46VarF, iA, false, iN, jM, zF, jL, strK, strJ, strI, iH, 0L, 0L, iX, j, vjaVar != null ? vjaVar.a : 0, vjaVar != null ? vjaVar.b : 0, ziaVarL.z(), ziaVarL.p(), ziaVarL.g(), listD, kjaVarQ, ziaVarL.w(), ziaVarL.o(), jLongValue), l, arrayList, gdaVar, j))).longValue();
            }
            z3 = z4;
            j7 = jI;
            if (z6) {
                oseVar3 = oseVar;
                i2 = 4;
                i3 = 3;
                j8 = j;
                gdaVar3 = gdaVar;
                oseVar3.E(gdaVar3, j8, j7, z3, l, z5);
            } else {
                i2 = 4;
                i3 = 3;
                if (z2) {
                    List list = xfa.b;
                    oseVar3 = oseVar;
                    j8 = j;
                    gdaVar3 = gdaVar;
                    oseVar3.D(gdaVar3, j8, z3, null, j2, l);
                } else {
                    oseVar3 = oseVar;
                    j8 = j;
                    gdaVar3 = gdaVar;
                }
            }
            j9 = j4;
            sfaVarC = oseVar3.c(j8, j9);
            if (sfaVarC != null) {
                toa toaVar = (toa) oseVar3.h();
                ggaVar = (gga) ch3.G(toaVar.a, true, false, new hoa(j9, toaVar, i2));
                if (ggaVar != null) {
                    return ggaVar.a;
                }
                return 0L;
            }
            j10 = sfaVarC.a;
            if (diaVar == null && diaVar.a == i3) {
                gda gdaVar4 = diaVar.c;
                if (gdaVar4 != null) {
                    b50Var2 = gdaVar4.h;
                    b50Var = b50Var2;
                } else {
                    b50Var = null;
                }
            } else {
                b50Var = b50Var2;
            }
            oseVar3.C(j10, new oo(sfaVarC, pm9.f(b50Var, oseVar3.a, j5, j6, new gw2(oseVar3, j8, 6)), oseVar3, 23));
            if (((f5d) ((wo6) oseVar3.b.getValue())).q()) {
                oseVar3.F(j10, gdaVar3);
            }
            return j10;
        }
        j3 = j11;
        z2 = false;
        if (diaVar != null) {
            j4 = j3;
            jI = i(oseVar, j, diaVar.c, j2, null, false, 32);
        } else {
            j4 = j3;
            jI = 0;
        }
        if (b50Var2.size() > 0) {
            gdaVar2 = null;
        } else {
            gdaVar2 = null;
        }
        if (gdaVar2 != null) {
            oseVar2 = oseVar;
            long jI3 = i(oseVar2, j, gdaVar2, j2, null, false, 32);
            j6 = gdaVar2.a;
            j5 = jI3;
        } else {
            oseVar2 = oseVar;
            j5 = 0;
            j6 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z6) {
        }
        z3 = z4;
        j7 = jI;
        if (z6) {
            oseVar3 = oseVar;
            i2 = 4;
            i3 = 3;
            j8 = j;
            gdaVar3 = gdaVar;
            oseVar3.E(gdaVar3, j8, j7, z3, l, z5);
        } else {
            i2 = 4;
            i3 = 3;
            if (z2) {
                List list2 = xfa.b;
                oseVar3 = oseVar;
                j8 = j;
                gdaVar3 = gdaVar;
                oseVar3.D(gdaVar3, j8, z3, null, j2, l);
            } else {
                oseVar3 = oseVar;
                j8 = j;
                gdaVar3 = gdaVar;
            }
        }
        j9 = j4;
        sfaVarC = oseVar3.c(j8, j9);
        if (sfaVarC != null) {
            toa toaVar2 = (toa) oseVar3.h();
            ggaVar = (gga) ch3.G(toaVar2.a, true, false, new hoa(j9, toaVar2, i2));
            if (ggaVar != null) {
                return ggaVar.a;
            }
            return 0L;
        }
        j10 = sfaVarC.a;
        if (diaVar == null) {
            b50Var = b50Var2;
        } else {
            b50Var = b50Var2;
        }
        oseVar3.C(j10, new oo(sfaVarC, pm9.f(b50Var, oseVar3.a, j5, j6, new gw2(oseVar3, j8, 6)), oseVar3, 23));
        if (((f5d) ((wo6) oseVar3.b.getValue())).q()) {
            oseVar3.F(j10, gdaVar3);
        }
        return j10;
    }

    public final void A(long j, Collection collection) {
        wna wnaVarH = h();
        List listT1 = ww3.T1(collection);
        toa toaVar = (toa) wnaVarH;
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE messages SET text = NULL, elements = ?, attaches = NULL, status = 10, media_type = 0 WHERE chat_id = ? AND id in (");
        int size = listT1.size();
        vd7.b(sb, size);
        sb.append(") AND id NOT IN (SELECT DISTINCT msg_link_id FROM messages WHERE msg_link_type = 2 AND msg_link_id in (");
        vd7.b(sb, listT1.size());
        sb.append(")) AND id IN (SELECT DISTINCT msg_link_id FROM messages WHERE msg_link_type = 1 AND msg_link_id in (");
        vd7.b(sb, listT1.size());
        sb.append("))");
        ch3.G(toaVar.a, false, true, new noa(sb.toString(), toaVar, r66.a, j, listT1, size));
    }

    public final int C(long j, tg4 tg4Var) {
        try {
            return ((Number) e().a(new k01(this, j, tg4Var, 8))).intValue();
        } catch (Throwable th) {
            gm0.V("RoomMessagesDatabase", "Can't update attach", new ase(th, null, 2, null));
            return 0;
        }
    }

    public final int D(gda gdaVar, long j, boolean z, wja wjaVar, long j2, Long l) {
        List list = xfa.b;
        zia ziaVarL = l(j, gdaVar, 0L, z, wjaVar);
        dia diaVar = gdaVar.i;
        zia ziaVarA = (z || diaVar == null || diaVar.a != 3) ? ziaVarL : zia.a(ziaVarL, 0L, 0L, 0L, 0L, null, null, 0, i(this, j, diaVar.c, j2, null, false, 32), false, 0L, null, null, null, 0, 33552383);
        toa toaVar = (toa) h();
        return ((Number) ch3.G(toaVar.a, false, true, new moa(toaVar, j, gdaVar.f, ziaVarA, v7e.a(l)))).intValue();
    }

    public final int E(gda gdaVar, long j, long j2, boolean z, Long l, boolean z2) {
        wja wjaVar = wja.DELETED;
        wja wjaVar2 = null;
        if (((f5d) ((wo6) this.b.getValue())).s() && z && gdaVar.e == null) {
            sfa sfaVarC = c(j, gdaVar.a);
            if ((sfaVarC != null ? sfaVarC.j : null) == wjaVar) {
                wjaVar2 = sfaVarC.j;
            }
        } else if (z2) {
            gga ggaVarF = ((toa) h()).f(j, gdaVar.a);
            if (ggaVarF != null && ggaVarF.j && ggaVarF.i == wjaVar && gdaVar.e != xja.c) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        long j3 = ggaVarF.a;
                        long j4 = gdaVar.a;
                        wja wjaVar3 = ggaVarF.i;
                        xja xjaVar = gdaVar.e;
                        StringBuilder sbS = qt4.s(j3, "updateByServerId, checkStatus, message status in process:\n                            |localId:", "\n                            |serverId:");
                        sbS.append(j4);
                        sbS.append("\n                            |localMsgStatus:");
                        sbS.append(wjaVar3);
                        sbS.append("\n                            |serverMsgStatus:");
                        sbS.append(xjaVar);
                        sbS.append(" \n                            |");
                        a4cVar.c(je9Var, "RoomMessagesDatabase", s5h.y0(sbS.toString()), null);
                    }
                }
                wjaVar2 = ggaVarF.i;
            }
        }
        zia ziaVarL = l(j, gdaVar, j2, z, wjaVar2);
        toa toaVar = (toa) h();
        return ((Number) ch3.G(toaVar.a, false, true, new moa(toaVar, j, gdaVar.a, ziaVarL, v7e.a(l), 1))).intValue();
    }

    public final void F(long j, gda gdaVar) {
        afa afaVar = gdaVar.s;
        if (afaVar != null) {
            yea yeaVarG = g();
            ((Number) ch3.G(yeaVarG.a, false, true, new iaa(yeaVarG, 3, new zea(afaVar.a(), j, System.currentTimeMillis())))).longValue();
        }
    }

    public final sfa b(gga ggaVar) {
        e70 e70VarL;
        h60 h60Var;
        rfa rfaVarB = B(ggaVar);
        Boolean bool = ggaVar.I;
        long j = ggaVar.r;
        ng5 ng5Var = null;
        if (j > 0) {
            gga ggaVarG = ((toa) h()).g(j);
            rfaVarB.q = ggaVarG != null ? b(ggaVarG) : null;
        }
        c46 c46Var = ggaVar.n;
        long j2 = (c46Var == null || (e70VarL = c46Var.l(y60.b)) == null || (h60Var = e70VarL.c) == null) ? 0L : h60Var.m;
        if (j2 > 0) {
            gga ggaVarG2 = ((toa) h()).g(j2);
            rfaVarB.z = ggaVarG2 != null ? b(ggaVarG2) : null;
        }
        Long l = ggaVar.H;
        if (l != null && bool != null) {
            ng5Var = new ng5(l.longValue(), bool.booleanValue());
        }
        rfaVarB.F = ng5Var;
        return rfaVarB.a();
    }

    public final sfa c(long j, long j2) {
        gga ggaVarF = ((toa) h()).f(j, j2);
        if (ggaVarF != null) {
            return b(ggaVarF);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(nq4 nq4Var) {
        bse bseVar;
        if (nq4Var instanceof bse) {
            bseVar = (bse) nq4Var;
            int i = bseVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bseVar.f = i - Integer.MIN_VALUE;
            } else {
                bseVar = new bse(this, nq4Var);
            }
        } else {
            bseVar = new bse(this, nq4Var);
        }
        Object obj = bseVar.d;
        int i2 = bseVar.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            wna wnaVarH = h();
            bseVar.f = 1;
            Object objI = ch3.I(bseVar, ((toa) wnaVarH).a, false, true, new s9a(10));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        yea yeaVarG = g();
        bseVar.f = 2;
        Object objI2 = ch3.I(bseVar, yeaVarG.a, false, true, new s9a(6));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }

    public final j35 e() {
        return (j35) this.g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable f(long j, nq4 nq4Var) {
        cse cseVar;
        if (nq4Var instanceof cse) {
            cseVar = (cse) nq4Var;
            int i = cseVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cseVar.f = i - Integer.MIN_VALUE;
            } else {
                cseVar = new cse(this, nq4Var);
            }
        } else {
            cseVar = new cse(this, nq4Var);
        }
        Object objI = cseVar.d;
        int i2 = cseVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            wna wnaVarH = h();
            cseVar.f = 1;
            objI = ch3.I(cseVar, ((toa) wnaVarH).a, true, false, new aa2(j, 10));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        Long l = (Long) objI;
        if (l == null) {
            return new ew5(0L);
        }
        ghb ghbVar = ew5.b;
        return new ew5(qe7.P(l.longValue(), lw5.MILLISECONDS));
    }

    public final yea g() {
        return (yea) this.i.getValue();
    }

    public final wna h() {
        return (wna) this.f.getValue();
    }

    public final void j(zic zicVar, long j) {
        long j2 = zicVar.a;
        String str = zicVar.b;
        c46 c46VarC = new f70().c();
        boolean z = zicVar.e;
        ku6 ku6Var = mg5.d;
        gga ggaVar = new gga(0L, 0L, 0L, 0L, 0L, j2, str, xfa.SENDING, wja.ACTIVE, 0L, c46VarC, pm9.a(c46VarC), z, 0, 0L, false, 0L, null, null, null, 0, 0L, 0L, 1, j, 0, 0, 0L, 0, 0L, r66.a, null, null, null, 0L);
        toa toaVar = (toa) h();
        ((Number) ch3.G(toaVar.a, false, true, new iaa(toaVar, 7, ggaVar))).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(gga ggaVar, nq4 nq4Var) {
        dse dseVar;
        rfa rfaVarB;
        int i;
        rfa rfaVar;
        c46 c46Var;
        long j;
        gga ggaVar2;
        rfa rfaVar2;
        rfa rfaVar3;
        rfa rfaVar4;
        e70 e70VarL;
        h60 h60Var;
        Long l;
        Boolean bool;
        if (nq4Var instanceof dse) {
            dseVar = (dse) nq4Var;
            int i2 = dseVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dseVar.k = i2 - Integer.MIN_VALUE;
            } else {
                dseVar = new dse(this, nq4Var);
            }
        } else {
            dseVar = new dse(this, nq4Var);
        }
        Object objS = dseVar.i;
        int i3 = dseVar.k;
        ng5 ng5Var = null;
        Object obj = hu4.a;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = dseVar.h;
                rfaVarB = dseVar.f;
                rfaVar = dseVar.e;
                gga ggaVar3 = dseVar.d;
                ch3.d0(objS);
                i = i4;
                ggaVar = ggaVar3;
            } else {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rfaVar2 = dseVar.g;
                rfaVar3 = dseVar.f;
                rfaVar4 = dseVar.e;
                ggaVar2 = dseVar.d;
                ch3.d0(objS);
            }
            rfaVar2.z = (sfa) objS;
            rfaVar = rfaVar4;
            rfaVarB = rfaVar3;
            ggaVar = ggaVar2;
            l = ggaVar.H;
            bool = ggaVar.I;
            if (l != null && bool != null) {
                ng5Var = new ng5(l.longValue(), bool.booleanValue());
            }
            rfaVarB.F = ng5Var;
            return rfaVar.a();
        }
        ch3.d0(objS);
        rfaVarB = B(ggaVar);
        long j2 = ggaVar.r;
        i = 0;
        if (j2 <= 0) {
            rfaVar = rfaVarB;
            c46Var = ggaVar.n;
            if (c46Var != null || (e70VarL = c46Var.l(y60.b)) == null || (h60Var = e70VarL.c) == null) {
                j = 0;
            } else {
                j = h60Var.m;
            }
            if (j > 0) {
                dseVar.d = ggaVar;
                dseVar.e = rfaVar;
                dseVar.f = rfaVarB;
                dseVar.g = rfaVarB;
                dseVar.h = i;
                dseVar.k = 2;
                objS = s(j, dseVar);
                if (objS != obj) {
                    ggaVar2 = ggaVar;
                    rfaVar2 = rfaVarB;
                    rfaVar3 = rfaVar2;
                    rfaVar4 = rfaVar;
                    rfaVar2.z = (sfa) objS;
                    rfaVar = rfaVar4;
                    rfaVarB = rfaVar3;
                    ggaVar = ggaVar2;
                }
            }
            l = ggaVar.H;
            bool = ggaVar.I;
            if (l != null) {
                ng5Var = new ng5(l.longValue(), bool.booleanValue());
            }
            rfaVarB.F = ng5Var;
            return rfaVar.a();
        }
        dseVar.d = ggaVar;
        dseVar.e = rfaVarB;
        dseVar.f = rfaVarB;
        dseVar.h = 0;
        dseVar.k = 1;
        objS = s(j2, dseVar);
        if (objS != obj) {
            rfaVar = rfaVarB;
        }
        return obj;
        rfaVarB.q = (sfa) objS;
        c46Var = ggaVar.n;
        if (c46Var != null) {
            j = 0;
        } else {
            j = 0;
        }
        if (j > 0) {
            dseVar.d = ggaVar;
            dseVar.e = rfaVar;
            dseVar.f = rfaVarB;
            dseVar.g = rfaVarB;
            dseVar.h = i;
            dseVar.k = 2;
            objS = s(j, dseVar);
            if (objS != obj) {
                ggaVar2 = ggaVar;
                rfaVar2 = rfaVarB;
                rfaVar3 = rfaVar2;
                rfaVar4 = rfaVar;
                rfaVar2.z = (sfa) objS;
                rfaVar = rfaVar4;
                rfaVarB = rfaVar3;
                ggaVar = ggaVar2;
            }
            return obj;
        }
        l = ggaVar.H;
        bool = ggaVar.I;
        if (l != null) {
            ng5Var = new ng5(l.longValue(), bool.booleanValue());
        }
        rfaVarB.F = ng5Var;
        return rfaVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    public final zia l(long j, gda gdaVar, long j2, boolean z, wja wjaVar) {
        String string;
        ArrayList arrayListR;
        int i;
        dia diaVar = gdaVar.i;
        ng5 ng5Var = gdaVar.q;
        if (diaVar == null || j2 <= 0 || diaVar.a != 3) {
            String str = gdaVar.g;
            string = str != null ? r5h.y1(str).toString() : null;
            arrayListR = pm9.r(gdaVar.p);
        } else {
            gda gdaVar2 = diaVar.c;
            string = gdaVar2.g;
            arrayListR = pm9.r(gdaVar2.p);
        }
        ArrayList arrayList = arrayListR;
        String str2 = string;
        long j3 = gdaVar.a;
        long j4 = gdaVar.b;
        long j5 = gdaVar.c;
        long j6 = gdaVar.d;
        long j7 = gdaVar.f;
        int iK = pm9.k(gdaVar.j);
        wja wjaVarN = wjaVar == null ? pm9.n(gdaVar.e) : wjaVar;
        hja hjaVar = gdaVar.r;
        kja kjaVarY = hjaVar != null ? pm9.y(hjaVar, (lja) this.e.getValue()) : null;
        int i2 = diaVar != null ? diaVar.a : 0;
        if (i2 == 0) {
            i = 0;
        } else {
            int iD = qt4.D(i2);
            int i3 = 1;
            if (iD != 1) {
                i3 = 2;
                if (iD != 2) {
                    i = 0;
                }
            }
            i = i3;
        }
        return new zia(0L, j3, j4, j, j5, j6, j7, str2, arrayList, kjaVarY, i, j2, z, diaVar != null ? diaVar.b : 0L, diaVar != null ? diaVar.d : null, diaVar != null ? diaVar.e : null, diaVar != null ? diaVar.f : null, diaVar != null ? diaVar.g : 0, wjaVarN, iK, gdaVar.l, gdaVar.m, gdaVar.n, ng5Var != null ? Long.valueOf(ng5Var.b()) : null, ng5Var != null ? Boolean.valueOf(ng5Var.a()) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r11 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(long r9, defpackage.lq4 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ese
            if (r0 == 0) goto L13
            r0 = r11
            ese r0 = (defpackage.ese) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ese r0 = new ese
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ch3.d0(r11)
            goto L63
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r2
        L31:
            long r9 = r0.d
            defpackage.ch3.d0(r11)
            goto L54
        L37:
            defpackage.ch3.d0(r11)
            wna r11 = r8.h()
            r0.d = r9
            r0.g = r4
            toa r11 = (defpackage.toa) r11
            rre r1 = r11.a
            hoa r6 = new hoa
            r7 = 3
            r6.<init>(r9, r11, r7)
            r11 = 0
            java.lang.Object r11 = defpackage.ch3.I(r0, r1, r4, r11, r6)
            if (r11 != r5) goto L54
            goto L62
        L54:
            gga r11 = (defpackage.gga) r11
            if (r11 == 0) goto L66
            r0.d = r9
            r0.g = r3
            java.lang.Object r11 = r8.k(r11, r0)
            if (r11 != r5) goto L63
        L62:
            return r5
        L63:
            sfa r11 = (defpackage.sfa) r11
            return r11
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ose.m(long, lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b6 -> B:26:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(java.util.Collection r10, defpackage.nq4 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.fse
            if (r0 == 0) goto L13
            r0 = r11
            fse r0 = (defpackage.fse) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            fse r0 = new fse
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.i
            int r1 = r0.k
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L45
            if (r1 != r2) goto L3e
            int r10 = r0.h
            int r1 = r0.g
            java.util.Collection r3 = r0.f
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r4 = r0.e
            java.util.Collection r6 = r0.d
            java.util.Collection r6 = (java.util.Collection) r6
            defpackage.ch3.d0(r11)
            r8 = r0
            r0 = r10
            r10 = r1
            r1 = r8
            goto Lbb
        L3e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            r9 = 0
            return r9
        L45:
            defpackage.ch3.d0(r11)
            goto L7f
        L49:
            defpackage.ch3.d0(r11)
            wna r11 = r9.h()
            r0.k = r3
            toa r11 = (defpackage.toa) r11
            r11.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "SELECT * FROM messages WHERE id IN ("
            r1.append(r6)
            int r6 = r10.size()
            defpackage.vd7.b(r1, r6)
            java.lang.String r6 = ")"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            rre r6 = r11.a
            loa r7 = new loa
            r7.<init>(r1, r10, r11, r4)
            java.lang.Object r11 = defpackage.ch3.I(r0, r6, r3, r4, r7)
            if (r11 != r5) goto L7f
            goto Lb5
        L7f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r10 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.yw3.W0(r11, r1)
            r10.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
            r3 = r10
            r10 = r4
            r4 = r11
            r11 = r10
        L94:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r4.next()
            gga r1 = (defpackage.gga) r1
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            r0.d = r6
            r0.e = r4
            r0.f = r6
            r0.g = r10
            r0.h = r11
            r0.k = r2
            java.lang.Object r1 = r9.k(r1, r0)
            if (r1 != r5) goto Lb6
        Lb5:
            return r5
        Lb6:
            r6 = r0
            r0 = r11
            r11 = r1
            r1 = r6
            r6 = r3
        Lbb:
            sfa r11 = (defpackage.sfa) r11
            r3.add(r11)
            r11 = r0
            r0 = r1
            r3 = r6
            goto L94
        Lc4:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ose.n(java.util.Collection, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b5 -> B:26:0x00ba). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(long[] r11, defpackage.nq4 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.gse
            if (r0 == 0) goto L13
            r0 = r12
            gse r0 = (defpackage.gse) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            gse r0 = new gse
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.i
            int r1 = r0.k
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L45
            if (r1 != r2) goto L3e
            int r11 = r0.h
            int r1 = r0.g
            java.util.Collection r3 = r0.f
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r4 = r0.e
            java.util.Collection r6 = r0.d
            java.util.Collection r6 = (java.util.Collection) r6
            defpackage.ch3.d0(r12)
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
            goto Lba
        L3e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r10)
            r10 = 0
            return r10
        L45:
            defpackage.ch3.d0(r12)
            goto L7e
        L49:
            defpackage.ch3.d0(r12)
            wna r12 = r10.h()
            r0.k = r3
            toa r12 = (defpackage.toa) r12
            r12.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "SELECT * FROM messages WHERE id IN ("
            r1.append(r6)
            int r6 = r11.length
            defpackage.vd7.b(r1, r6)
            java.lang.String r6 = ")"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            rre r6 = r12.a
            os1 r7 = new os1
            r8 = 13
            r7.<init>(r1, r11, r12, r8)
            java.lang.Object r12 = defpackage.ch3.I(r0, r6, r3, r4, r7)
            if (r12 != r5) goto L7e
            goto Lb4
        L7e:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.yw3.W0(r12, r1)
            r11.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
            r3 = r11
            r11 = r4
            r4 = r12
            r12 = r11
        L93:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r4.next()
            gga r1 = (defpackage.gga) r1
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            r0.d = r6
            r0.e = r4
            r0.f = r6
            r0.g = r11
            r0.h = r12
            r0.k = r2
            java.lang.Object r1 = r10.k(r1, r0)
            if (r1 != r5) goto Lb5
        Lb4:
            return r5
        Lb5:
            r6 = r0
            r0 = r12
            r12 = r1
            r1 = r6
            r6 = r3
        Lba:
            sfa r12 = (defpackage.sfa) r12
            r3.add(r12)
            r12 = r0
            r0 = r1
            r3 = r6
            goto L93
        Lc3:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ose.o(long[], nq4):java.lang.Object");
    }

    public final Object p(long j, long j2, nq4 nq4Var) {
        return yab.K0(((n0c) ((xhh) this.c.getValue())).b(), new ag0(this, j, j2, null, 7), nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b6 -> B:26:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object q(java.util.HashSet r10, defpackage.nq4 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.hse
            if (r0 == 0) goto L13
            r0 = r11
            hse r0 = (defpackage.hse) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            hse r0 = new hse
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.i
            int r1 = r0.k
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L45
            if (r1 != r2) goto L3e
            int r10 = r0.h
            int r1 = r0.g
            java.util.Collection r3 = r0.f
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r4 = r0.e
            java.util.Collection r6 = r0.d
            java.util.Collection r6 = (java.util.Collection) r6
            defpackage.ch3.d0(r11)
            r8 = r0
            r0 = r10
            r10 = r1
            r1 = r8
            goto Lbb
        L3e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            r9 = 0
            return r9
        L45:
            defpackage.ch3.d0(r11)
            goto L7f
        L49:
            defpackage.ch3.d0(r11)
            wna r11 = r9.h()
            r0.k = r3
            toa r11 = (defpackage.toa) r11
            r11.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "SELECT * FROM messages WHERE server_id IN("
            r1.append(r6)
            int r6 = r10.size()
            defpackage.vd7.b(r1, r6)
            java.lang.String r6 = ")"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            rre r6 = r11.a
            loa r7 = new loa
            r7.<init>(r1, r10, r11, r3)
            java.lang.Object r11 = defpackage.ch3.I(r0, r6, r3, r4, r7)
            if (r11 != r5) goto L7f
            goto Lb5
        L7f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r10 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.yw3.W0(r11, r1)
            r10.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
            r3 = r10
            r10 = r4
            r4 = r11
            r11 = r10
        L94:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r4.next()
            gga r1 = (defpackage.gga) r1
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            r0.d = r6
            r0.e = r4
            r0.f = r6
            r0.g = r10
            r0.h = r11
            r0.k = r2
            java.lang.Object r1 = r9.k(r1, r0)
            if (r1 != r5) goto Lb6
        Lb5:
            return r5
        Lb6:
            r6 = r0
            r0 = r11
            r11 = r1
            r1 = r6
            r6 = r3
        Lbb:
            sfa r11 = (defpackage.sfa) r11
            r3.add(r11)
            r11 = r0
            r0 = r1
            r3 = r6
            goto L94
        Lc4:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ose.q(java.util.HashSet, nq4):java.lang.Object");
    }

    public final sfa r(long j, mg5 mg5Var) {
        List listA;
        int iOrdinal = mg5Var.ordinal();
        if (iOrdinal == 0) {
            toa toaVar = (toa) h();
            listA = (List) ch3.G(toaVar.a, true, false, new xna(j, toaVar, wja.DELETED, 1));
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return null;
            }
            listA = wna.a(h(), j);
        }
        List list = listA;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((gga) it.next()));
        }
        return (sfa) ww3.t1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r11 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(long r9, defpackage.nq4 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.jse
            if (r0 == 0) goto L13
            r0 = r11
            jse r0 = (defpackage.jse) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            jse r0 = new jse
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ch3.d0(r11)
            goto L63
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r2
        L31:
            long r9 = r0.d
            defpackage.ch3.d0(r11)
            goto L54
        L37:
            defpackage.ch3.d0(r11)
            wna r11 = r8.h()
            r0.d = r9
            r0.g = r4
            toa r11 = (defpackage.toa) r11
            rre r1 = r11.a
            hoa r6 = new hoa
            r7 = 3
            r6.<init>(r9, r11, r7)
            r11 = 0
            java.lang.Object r11 = defpackage.ch3.I(r0, r1, r4, r11, r6)
            if (r11 != r5) goto L54
            goto L62
        L54:
            gga r11 = (defpackage.gga) r11
            if (r11 == 0) goto L66
            r0.d = r9
            r0.g = r3
            java.lang.Object r11 = r8.k(r11, r0)
            if (r11 != r5) goto L63
        L62:
            return r5
        L63:
            sfa r11 = (defpackage.sfa) r11
            return r11
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ose.s(long, nq4):java.lang.Object");
    }

    public final l8b t(Collection collection) {
        l8b l8bVar = new l8b(collection.size());
        sw swVar = new sw(1, collection);
        qe7.k(200, 200);
        pu6 pu6Var = new pu6(new kx6(new abg(swVar, 200, 200), new yre(0, this), new nre(2)));
        while (pu6Var.hasNext()) {
            sfa sfaVarB = b((gga) pu6Var.next());
            l8bVar.i(sfaVarB.a, sfaVarB);
        }
        return l8bVar;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x022d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0252  */
    /* JADX WARN: Code duplicated, block: B:55:0x025a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0252 -> B:54:0x0253). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u(long r22, final long r24, final java.util.Set r26, java.lang.Integer r27, boolean r28, defpackage.mg5 r29, defpackage.nq4 r30) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ose.u(long, long, java.util.Set, java.lang.Integer, boolean, mg5, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(long[] jArr, nq4 nq4Var) {
        lse lseVar;
        h8b h8bVar;
        if (nq4Var instanceof lse) {
            lseVar = (lse) nq4Var;
            int i = lseVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lseVar.g = i - Integer.MIN_VALUE;
            } else {
                lseVar = new lse(this, nq4Var);
            }
        } else {
            lseVar = new lse(this, nq4Var);
        }
        Object obj = lseVar.e;
        int i2 = lseVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            h8b h8bVar2 = new h8b(jArr.length);
            yea yeaVarG = g();
            lseVar.d = h8bVar2;
            lseVar.g = 1;
            yeaVarG.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM message_comments WHERE message_id IN (");
            vd7.b(sb, jArr.length);
            sb.append(")");
            Object objI = ch3.I(lseVar, yeaVarG.a, true, false, new iaa(sb.toString(), 1, jArr));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
            obj = objI;
            h8bVar = h8bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h8bVar = lseVar.d;
            ch3.d0(obj);
        }
        for (zea zeaVar : (Iterable) obj) {
            h8bVar.d(zeaVar.a(), zeaVar.b());
        }
        return h8bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r0 == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(long r14, defpackage.nq4 r16, java.util.List r17) {
        /*
            r13 = this;
            r0 = r16
            boolean r1 = r0 instanceof defpackage.mse
            if (r1 == 0) goto L15
            r1 = r0
            mse r1 = (defpackage.mse) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1a
        L15:
            mse r1 = new mse
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.e
            int r2 = r1.g
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            defpackage.ch3.d0(r0)
            goto L90
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            r13 = 0
            return r13
        L33:
            long r6 = r1.d
            defpackage.ch3.d0(r0)
            goto L6e
        L39:
            defpackage.ch3.d0(r0)
            wna r0 = r13.h()
            r1.d = r14
            r1.g = r4
            r11 = r0
            toa r11 = (defpackage.toa) r11
            r11.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT * FROM messages WHERE chat_id = ? AND status != 10 AND server_id in ("
            r0.append(r2)
            java.lang.String r2 = ")"
            r10 = r17
            java.lang.String r7 = defpackage.nbh.x(r2, r0, r10)
            rre r0 = r11.a
            foa r6 = new foa
            r12 = 1
            r8 = r14
            r6.<init>(r7, r8, r10, r11, r12)
            r2 = 0
            java.lang.Object r0 = defpackage.ch3.I(r1, r0, r4, r2, r6)
            if (r0 != r5) goto L6d
            goto L8f
        L6d:
            r6 = r14
        L6e:
            java.util.List r0 = (java.util.List) r0
            ny8 r2 = r13.c
            java.lang.Object r2 = r2.getValue()
            xhh r2 = (defpackage.xhh) r2
            n0c r2 = (defpackage.n0c) r2
            xt4 r2 = r2.b()
            k9d r4 = new k9d
            r8 = 29
            r4.<init>(r0, r8, r13)
            r1.d = r6
            r1.g = r3
            java.lang.Object r0 = defpackage.qyj.V(r2, r4, r1)
            if (r0 != r5) goto L90
        L8f:
            return r5
        L90:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ose.w(long, nq4, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00db -> B:27:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x(final long r19, final java.util.Collection r21, final java.util.Set r22, defpackage.nq4 r23) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ose.x(long, java.util.Collection, java.util.Set, nq4):java.lang.Object");
    }

    public final ArrayList y(long j, List list) {
        toa toaVar = (toa) h();
        toaVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE chat_id = ? AND msg_link_type = 1 AND msg_link_id IN (");
        List list2 = (List) ch3.G(toaVar.a, true, false, new foa(nbh.x(") AND status != 10", sb, list), j, list, toaVar, 0));
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b((gga) it.next()));
        }
        return arrayList;
    }

    public final sfa z(long j, long j2, mg5 mg5Var) {
        List list;
        int iOrdinal = mg5Var.ordinal();
        wja wjaVar = wja.DELETED;
        if (iOrdinal == 0) {
            toa toaVar = (toa) h();
            list = (List) ch3.G(toaVar.a, true, false, new ooa(j, j2, toaVar, wjaVar, 0));
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return null;
            }
            toa toaVar2 = (toa) h();
            list = (List) ch3.G(toaVar2.a, true, false, new ooa(j, j2, toaVar2, wjaVar, 1));
        }
        gga ggaVar = (gga) ww3.t1(list);
        if (ggaVar != null) {
            return b(ggaVar);
        }
        return null;
    }
}
