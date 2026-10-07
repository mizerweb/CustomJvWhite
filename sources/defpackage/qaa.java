package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qaa extends a8j {
    public static final /* synthetic */ zv8[] E = {new z8b(qaa.class, "loadContentJob", "getLoadContentJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, qaa.class, "loadMembersJob", "getLoadMembersJob()Lkotlinx/coroutines/Job;"), new z8b(qaa.class, "loadReactionsJob", "getLoadReactionsJob()Lkotlinx/coroutines/Job;")};
    public final ic6 A;
    public final ic6 B;
    public final ifh C;
    public final String D;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final gjf g;
    public final et3 h;
    public final xhh i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final r8a r;
    public final p3c s;
    public final p3c t;
    public final p3c u;
    public final xt4 v;
    public final ConcurrentHashMap w;
    public final mjg x;
    public final r8e y;
    public final lv5 z;

    public qaa(long j, long j2, long j3, boolean z, gjf gjfVar, et3 et3Var, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, yt ytVar) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = gjfVar;
        this.h = et3Var;
        this.i = xhhVar;
        this.j = ny8Var;
        this.k = ny8Var2;
        this.l = ny8Var3;
        this.m = ny8Var4;
        this.n = ny8Var5;
        this.o = ny8Var6;
        this.p = ny8Var7;
        this.q = ny8Var8;
        h5 h5Var = ytVar.a;
        this.r = new r8a(j2, j, (t51) h5Var.c(116), (xhh) h5Var.c(23));
        this.s = qyj.S();
        this.t = qyj.S();
        this.u = qyj.S();
        this.v = ((n0c) xhhVar).a().R0(1, "load-members-and-reactions");
        this.w = new ConcurrentHashMap();
        mjg mjgVarA = p90.a(r66.a);
        this.x = mjgVarA;
        this.y = new r8e(mjgVarA);
        this.z = lv5.c;
        this.A = new ic6(null);
        this.B = new ic6(null);
        this.C = new ifh(new ww8(20, this));
        this.D = qaa.class.getName();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if (r14 == r2) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.qaa r12, defpackage.rt2 r13, defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qaa.B(qaa, rt2, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object C(qaa qaaVar, rt2 rt2Var, nq4 nq4Var) {
        oaa oaaVar;
        Object value;
        ArrayList arrayList;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof oaa) {
            oaaVar = (oaa) nq4Var;
            int i = oaaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                oaaVar.f = i - Integer.MIN_VALUE;
            } else {
                oaaVar = new oaa(qaaVar, nq4Var);
            }
        } else {
            oaaVar = new oaa(qaaVar, nq4Var);
        }
        Object objK0 = oaaVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = oaaVar.f;
        int i3 = 1;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            gm0.n(qaaVar.D, "load reactions");
            xt4 xt4VarB = ((n0c) qaaVar.i).b();
            maa maaVar = new maa(qaaVar, rt2Var, lq4Var, i3);
            oaaVar.f = 1;
            objK0 = yab.K0(xt4VarB, maaVar, oaaVar);
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        mja mjaVar = (mja) objK0;
        String str = qaaVar.D;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qv1.j("reactions count: ", mjaVar != null ? new Integer(mjaVar.a.size()) : null), null);
            }
        }
        if (mjaVar == null) {
            gm0.Y(qaa.class.getName(), "Early return in loadReactions cuz of reactionsResponse == null");
            return sbiVar;
        }
        qaaVar.w.clear();
        for (gja gjaVar : mjaVar.a) {
            qaaVar.w.put(new Long(gjaVar.a), gjaVar.b);
        }
        ConcurrentHashMap concurrentHashMap = qaaVar.w;
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        mjg mjgVar = qaaVar.x;
        if (zIsEmpty) {
            do {
                value = mjgVar.getValue();
                List<Object> list = (List) value;
                arrayList = new ArrayList(yw3.W0(list, 10));
                for (Object objI : list) {
                    k8a k8aVar = objI instanceof k8a ? (k8a) objI : null;
                    if ((k8aVar != null ? k8aVar.h : null) != null) {
                        objI = k8a.i((k8a) objI, null);
                    }
                    arrayList.add(objI);
                }
            } while (!mjgVar.h(value, arrayList));
        } else {
            List list2 = (List) mjgVar.getValue();
            m8b m8bVar = new m8b();
            Iterator it = concurrentHashMap.keySet().iterator();
            while (it.hasNext()) {
                m8bVar.a(((Long) it.next()).longValue());
            }
            List<Object> list3 = list2;
            ArrayList arrayList2 = new ArrayList(yw3.W0(list3, 10));
            for (Object objI2 : list3) {
                k8a k8aVar2 = objI2 instanceof k8a ? (k8a) objI2 : null;
                if (k8aVar2 != null) {
                    long j = k8aVar2.a;
                    if (concurrentHashMap.containsKey(Long.valueOf(j))) {
                        m8bVar.n(j);
                        objI2 = k8a.i((k8a) objI2, (s5e) concurrentHashMap.get(Long.valueOf(j)));
                    } else {
                        objI2 = k8a.i((k8a) objI2, null);
                    }
                }
                arrayList2.add(objI2);
            }
            mjgVar.j(null, arrayList2);
            if (m8bVar.j()) {
                gm0.Y(qaa.class.getName(), "Reactions without members: " + m8bVar);
            }
        }
        return sbiVar;
    }

    public final rt2 D() {
        return (rt2) ((xn3) this.j.getValue()).k(this.c).a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x015e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0188 -> B:61:0x018b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable E(defpackage.rt2 r28, defpackage.nq4 r29, defpackage.sfa r30) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qaa.E(rt2, nq4, sfa):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Serializable F(rt2 rt2Var, nq4 nq4Var, sfa sfaVar) {
        laa laaVar;
        c79 c79VarW;
        c79 c79Var;
        c79 c79Var2;
        c79 c79Var3;
        c79 c79VarJ;
        String str;
        a4c a4cVar;
        je9 je9Var;
        r66 r66Var = r66.a;
        if (nq4Var instanceof laa) {
            laaVar = (laa) nq4Var;
            int i = laaVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                laaVar.j = i - Integer.MIN_VALUE;
            } else {
                laaVar = new laa(this, nq4Var);
            }
        } else {
            laaVar = new laa(this, nq4Var);
        }
        Object objK0 = laaVar.h;
        hu4 hu4Var = hu4.a;
        int i2 = laaVar.j;
        int i3 = 0;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            gm0.n(this.D, "load members from server");
            xt4 xt4VarB = ((n0c) this.i).b();
            maa maaVar = new maa(this, rt2Var, lq4Var, i3);
            laaVar.d = sfaVar;
            laaVar.j = 1;
            objK0 = yab.K0(xt4VarB, maaVar, laaVar);
            if (objK0 != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            sfaVar = laaVar.d;
            ch3.d0(objK0);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c79Var3 = laaVar.g;
            c79Var2 = laaVar.f;
            c79Var = laaVar.e;
            ch3.d0(objK0);
        }
        c79Var3.add(objK0);
        c79VarW = c79Var2;
        bx3.Y0(c79VarW, this.z);
        c79VarJ = yab.j(c79Var);
        str = this.D;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(c79VarJ.getSize(), "members count from server: "), null);
            }
        }
        return c79VarJ;
        q63 q63Var = (q63) objK0;
        if (q63Var != null) {
            List list = q63Var.c;
            if (!list.isEmpty()) {
                c79VarW = yab.w();
                cx3.b1(c79VarW, new m2i(yhf.m0(new sw(1, list), new iaa(this, i3, sfaVar)), new lh9(8, this)));
                if (!this.f && sfaVar.e == ((s7f) this.h).t()) {
                    laaVar.d = null;
                    laaVar.e = c79VarW;
                    laaVar.f = c79VarW;
                    laaVar.g = c79VarW;
                    laaVar.j = 2;
                    Object objI = I(laaVar);
                    if (objI != hu4Var) {
                        c79Var2 = c79VarW;
                        c79Var = c79Var2;
                        objK0 = objI;
                        c79Var3 = c79Var;
                        c79Var3.add(objK0);
                        c79VarW = c79Var2;
                    }
                    return hu4Var;
                }
                c79Var = c79VarW;
                bx3.Y0(c79VarW, this.z);
                c79VarJ = yab.j(c79Var);
                str = this.D;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.h(c79VarJ.getSize(), "members count from server: "), null);
                    }
                }
                return c79VarJ;
            }
        }
        return r66Var;
    }

    public final void G(boolean z) {
        sgg sggVarI0 = yab.i0(this.b, this.v, 0, new qi4(this, z, (lq4) null, 6), 2);
        this.s.B(this, E[0], sggVarI0);
    }

    public final boolean H() {
        rt2 rt2VarD = D();
        if (rt2VarD == null) {
            return false;
        }
        nx2 nx2Var = rt2VarD.b;
        return (rt2VarD.h0() || rt2VarD.d0() || this.e == 0 || nx2Var.b() > ((Number) this.C.getValue()).intValue() || nx2Var.b() <= 1) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(nq4 nq4Var) {
        paa paaVar;
        qaa qaaVar;
        if (nq4Var instanceof paa) {
            paaVar = (paa) nq4Var;
            int i = paaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                paaVar.g = i - Integer.MIN_VALUE;
            } else {
                paaVar = new paa(this, nq4Var);
            }
        } else {
            paaVar = new paa(this, nq4Var);
        }
        Object objB = paaVar.e;
        int i2 = paaVar.g;
        et3 et3Var = this.h;
        if (i2 == 0) {
            ch3.d0(objB);
            utd utdVar = (utd) this.l.getValue();
            long jT = ((s7f) et3Var).t();
            paaVar.d = this;
            paaVar.g = 1;
            objB = utdVar.b(jT, paaVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            qaaVar = this;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qaaVar = paaVar.d;
            ch3.d0(objB);
        }
        pj4 pj4VarQ = pm9.q(((vjd) objB).d);
        qfd qfdVarB = ((yfd) this.p.getValue()).B(((s7f) et3Var).t());
        return qaaVar.J(new o63(pj4VarQ, new rfd(qfdVarB.a, qfdVarB.b), 0L, 0L, 0L));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    public final k8a J(o63 o63Var) {
        ynh xnhVar;
        tnh tnhVar;
        String strA;
        String str;
        String str2;
        String strD = o63Var.a.d(us0.c);
        pj4 pj4Var = o63Var.a;
        ix2 ix2Var = pj4Var.s;
        ix2 ix2Var2 = pj4Var.s;
        long j = pj4Var.a;
        if (!ix2Var.h() || !ix2Var2.j()) {
            if (ix2Var2.h()) {
                tnhVar = new tnh(R.string.bot);
            } else {
                yfd yfdVar = (yfd) this.m.getValue();
                rfd rfdVar = o63Var.b;
                xnhVar = new xnh(yfdVar.A(rfdVar != null ? rfdVar.a : 0, rfdVar != null ? rfdVar.b : agd.WAS_RECENTLY));
            }
            long j2 = pj4Var.a;
            strA = pj4Var.a();
            if (strA == null) {
                str = "";
            } else {
                str = strA;
            }
            if (strD == null) {
                str2 = "";
            } else {
                str2 = strD;
            }
            boolean zB = ((yfd) this.p.getValue()).B(j).b();
            long j3 = o63Var.c;
            s5e s5eVar = (s5e) this.w.get(Long.valueOf(j));
            boolean z = j == ((s7f) this.h).t();
            Pattern pattern = m3c.a;
            String strB = pj4Var.b();
            return new k8a(j2, str, xnhVar, str2, zB, j3, m3c.b(strB != null ? strB : "", pj4Var.c()), s5eVar, z);
        }
        tnhVar = new tnh(R.string.service_notifications);
        xnhVar = tnhVar;
        long j4 = pj4Var.a;
        strA = pj4Var.a();
        if (strA == null) {
            str = "";
        } else {
            str = strA;
        }
        if (strD == null) {
            str2 = "";
        } else {
            str2 = strD;
        }
        boolean zB2 = ((yfd) this.p.getValue()).B(j).b();
        long j5 = o63Var.c;
        s5e s5eVar2 = (s5e) this.w.get(Long.valueOf(j));
        boolean z2 = j == ((s7f) this.h).t();
        Pattern pattern2 = m3c.a;
        String strB2 = pj4Var.b();
        return new k8a(j4, str, xnhVar, str2, zB2, j5, m3c.b(strB2 != null ? strB2 : "", pj4Var.c()), s5eVar2, z2);
    }

    @Override // defpackage.a8j
    public final void y() {
        this.w.clear();
        r8a r8aVar = this.r;
        r8aVar.c.f(r8aVar);
    }
}
