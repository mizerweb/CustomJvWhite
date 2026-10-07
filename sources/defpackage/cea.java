package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.messages.a;

/* JADX INFO: loaded from: classes3.dex */
public final class cea {
    public final gjg a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;

    public cea(gjg gjgVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.a = gjgVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var9;
        this.j = ny8Var8;
    }

    public static boolean i(fda fdaVar) {
        fda fdaVar2;
        sfa sfaVar;
        String str = fdaVar.a.g;
        if (str != null && !r5h.X0(str)) {
            return true;
        }
        eia eiaVar = fdaVar.c;
        String str2 = (eiaVar == null || (fdaVar2 = eiaVar.c) == null || (sfaVar = fdaVar2.a) == null) ? null : sfaVar.g;
        if (str2 != null && !r5h.X0(str2)) {
            return true;
        }
        String strT = fdaVar.a.t();
        return (strT == null || r5h.X0(strT)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    public final Object a(rt2 rt2Var, nq4 nq4Var, sfa sfaVar) {
        boolean z = true;
        boolean z2 = sfaVar.e == ((s7f) o()).t();
        if (rt2Var instanceof s04) {
            return j((s04) rt2Var, sfaVar, nq4Var);
        }
        boolean zC0 = rt2Var.C0();
        nx2 nx2Var = rt2Var.b;
        if (!zC0) {
            z = false;
        } else if (rt2Var.d0()) {
            boolean z3 = (rt2Var.R() && z2) || rt2Var.L();
            if (!rt2Var.Q() && !z3) {
                z = false;
            }
        } else if ((nx2Var.b() >= ((g5d) ((gjf) this.g.getValue())).j() && ((Boolean) q().T.a(e5d.S6[38]).i()).booleanValue()) || (nx2Var.K.i(np0.o) && !z2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:20:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.rt2 r6, java.util.List r7, defpackage.nq4 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.vda
            if (r0 == 0) goto L13
            r0 = r8
            vda r0 = (defpackage.vda) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            vda r0 = new vda
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.util.Iterator r6 = r0.e
            rt2 r7 = r0.d
            defpackage.ch3.d0(r8)
            goto L55
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r5)
            r5 = 0
            return r5
        L30:
            defpackage.ch3.d0(r8)
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r7 = r6
            r6 = r4
        L3a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L60
            java.lang.Object r8 = r6.next()
            sfa r8 = (defpackage.sfa) r8
            r0.d = r7
            r0.e = r6
            r0.h = r2
            java.lang.Object r8 = r5.a(r7, r0, r8)
            hu4 r1 = defpackage.hu4.a
            if (r8 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L3a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L60:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cea.b(rt2, java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(rt2 rt2Var, long[] jArr, nq4 nq4Var) {
        uda udaVar;
        if (nq4Var instanceof uda) {
            udaVar = (uda) nq4Var;
            int i = udaVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                udaVar.h = i - Integer.MIN_VALUE;
            } else {
                udaVar = new uda(this, nq4Var);
            }
        } else {
            udaVar = new uda(this, nq4Var);
        }
        Object objI = udaVar.f;
        int i2 = udaVar.h;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            j44 j44VarP = p();
            udaVar.d = this;
            udaVar.e = rt2Var;
            udaVar.h = 1;
            objI = j44VarP.i(jArr, udaVar);
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return objI;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rt2Var = udaVar.e;
        this = udaVar.d;
        ch3.d0(objI);
        udaVar.d = null;
        udaVar.e = null;
        udaVar.h = 2;
        Object objB = this.b(rt2Var, (List) objI, udaVar);
        return objB == hu4Var ? hu4Var : objB;
    }

    public final Object d(rt2 rt2Var, nq4 nq4Var, sfa sfaVar) {
        if (rt2Var instanceof s04) {
            return j((s04) rt2Var, sfaVar, nq4Var);
        }
        if (!rt2Var.h0()) {
            boolean zQ = rt2Var.Q();
            if (rt2Var.d0()) {
                return Boolean.valueOf(zQ || (rt2Var.R() && (sfaVar.e > ((s7f) o()).t() ? 1 : (sfaVar.e == ((s7f) o()).t() ? 0 : -1)) == 0) || rt2Var.L());
            }
            if (zQ && (rt2Var.B0() || rt2Var.z0())) {
                return Boolean.TRUE;
            }
        }
        boolean zD = sfaVar.D();
        long j = sfaVar.e;
        if (zD) {
            return Boolean.FALSE;
        }
        if (j != ((s7f) o()).t() && (j != 0 || !rt2Var.Z())) {
            return Boolean.FALSE;
        }
        if (rt2Var.Z() && j != 0) {
            return Boolean.FALSE;
        }
        i5d i5dVarA = sfaVar instanceof ky3 ? q().A.a(e5d.S6[18]) : q().z.a(e5d.S6[17]);
        ghb ghbVar = ew5.b;
        if (ew5.d(qe7.P(((s7f) o()).f() - sfaVar.c, lw5.MILLISECONDS), qe7.O(((Number) i5dVarA.i()).intValue(), lw5.SECONDS)) >= 0) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(sfaVar.b != 0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r9 == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r9 == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008c -> B:34:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.rt2 r7, java.util.List r8, defpackage.nq4 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.wda
            if (r0 == 0) goto L13
            r0 = r9
            wda r0 = (defpackage.wda) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            wda r0 = new wda
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.g
            int r1 = r0.i
            r2 = 2
            r3 = 0
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.f
            java.util.Iterator r8 = r0.e
            rt2 r1 = r0.d
            defpackage.ch3.d0(r9)
            goto L8f
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            r6 = 0
            return r6
        L38:
            rt2 r7 = r0.d
            defpackage.ch3.d0(r9)
            goto L52
        L3e:
            defpackage.ch3.d0(r9)
            j44 r9 = r6.p()
            java.util.Collection r8 = (java.util.Collection) r8
            r0.d = r7
            r0.i = r4
            java.lang.Object r9 = r9.j(r8, r0)
            if (r9 != r5) goto L52
            goto L8e
        L52:
            java.util.List r9 = (java.util.List) r9
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L5d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L5d:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r8 = r9 instanceof java.util.Collection
            if (r8 == 0) goto L6e
            r8 = r9
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L6e
        L6c:
            r3 = r4
            goto L97
        L6e:
            java.util.Iterator r8 = r9.iterator()
            r1 = r7
            r7 = r3
        L74:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L6c
            java.lang.Object r9 = r8.next()
            sfa r9 = (defpackage.sfa) r9
            r0.d = r1
            r0.e = r8
            r0.f = r7
            r0.i = r2
            java.lang.Object r9 = r6.d(r1, r0, r9)
            if (r9 != r5) goto L8f
        L8e:
            return r5
        L8f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L74
        L97:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cea.e(rt2, java.util.List, nq4):java.lang.Object");
    }

    public final boolean f(rt2 rt2Var, List list) {
        rt2Var.getClass();
        boolean z = rt2Var instanceof s04;
        if (!z && !rt2Var.k0(q())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sfa sfaVar = (sfa) it.next();
                ((uia) this.e.getValue()).getClass();
                if (!sfaVar.K() && !sfaVar.N() && !sfaVar.S()) {
                    if (!sfaVar.C() && ch3.r(sfaVar.g)) {
                        c46 c46Var = sfaVar.n;
                        if (c46Var != null && ((kg8) c46Var.b) != null) {
                            return false;
                        }
                        if (c46Var != null && ((kke) c46Var.c) != null) {
                            return false;
                        }
                    }
                    if (!rt2Var.b.g() || sfaVar.b == 0 || z) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean g(rt2 rt2Var, fda fdaVar) {
        if (r()) {
            return false;
        }
        ((uia) this.e.getValue()).getClass();
        if (rt2Var == null || !rt2Var.r0() || !rt2Var.b.g()) {
            return false;
        }
        sfa sfaVar = fdaVar.a;
        return (sfaVar.b == 0 || sfaVar.N()) ? false : true;
    }

    public final boolean h(sfa sfaVar) {
        j60 j60VarR;
        e70 e70Var;
        e70 e70Var2;
        if (((tt7) this.j.getValue()).a(sfaVar)) {
            return false;
        }
        return sfaVar.B(y60.d) || sfaVar.B(y60.c) || (sfaVar.B(y60.j) && (((j60VarR = sfaVar.r()) != null && (e70Var2 = j60VarR.d) != null && e70Var2.e()) || (j60VarR != null && (e70Var = j60VarR.d) != null && e70Var.h())));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(s04 s04Var, sfa sfaVar, nq4 nq4Var) {
        xda xdaVar;
        if (nq4Var instanceof xda) {
            xdaVar = (xda) nq4Var;
            int i = xdaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xdaVar.f = i - Integer.MIN_VALUE;
            } else {
                xdaVar = new xda(this, nq4Var);
            }
        } else {
            xdaVar = new xda(this, nq4Var);
        }
        Object objI = xdaVar.d;
        int i2 = xdaVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            if (sfaVar.e == ((s7f) o()).t()) {
                return Boolean.valueOf(!r());
            }
            xn3 xn3Var = (xn3) this.b.getValue();
            long j = s04Var.r.a;
            xdaVar.f = 1;
            objI = xn3Var.i(j, xdaVar);
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
        rt2 rt2Var = (rt2) objI;
        return Boolean.valueOf(rt2Var != null && rt2Var.L());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:120:0x020b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:134:0x0253  */
    /* JADX WARN: Code duplicated, block: B:146:0x0278  */
    /* JADX WARN: Code duplicated, block: B:150:0x0284  */
    /* JADX WARN: Code duplicated, block: B:153:0x028f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0293  */
    /* JADX WARN: Code duplicated, block: B:156:0x0298  */
    /* JADX WARN: Code duplicated, block: B:159:0x029e  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02af  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:194:0x0333  */
    /* JADX WARN: Code duplicated, block: B:200:0x034f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0355  */
    /* JADX WARN: Code duplicated, block: B:203:0x035a  */
    /* JADX WARN: Code duplicated, block: B:205:0x036a  */
    /* JADX WARN: Code duplicated, block: B:206:0x036d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0384  */
    /* JADX WARN: Code duplicated, block: B:216:0x0396  */
    /* JADX WARN: Code duplicated, block: B:225:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:228:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:232:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:235:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:239:0x0415  */
    /* JADX WARN: Code duplicated, block: B:242:0x041e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154  */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:80:0x0191  */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c1  */
    public final Serializable k(long j, nq4 nq4Var) {
        yda ydaVar;
        rt2 rt2Var;
        sfa sfaVar;
        fda fdaVarA;
        long j2;
        q24 q24Var;
        rt2 rt2Var2;
        sfa sfaVar2;
        fda fdaVar;
        rt2 rt2Var3;
        rt2 rt2Var4;
        boolean zK0;
        int i;
        c79 c79VarW;
        boolean zB;
        long j3;
        long j4;
        long j5;
        cea ceaVar;
        Object objA;
        int i2;
        long j6;
        sfa sfaVar3;
        int i3;
        List list;
        e5d e5dVarQ;
        o5d o5dVarU;
        Integer numValueOf;
        n5d n5dVar;
        boolean z;
        o5d o5dVarU2;
        boolean zM;
        String name;
        a4c a4cVar;
        long j7;
        long j8;
        fda fdaVar2;
        c46 c46Var;
        List list2;
        sfa sfaVar4;
        boolean z2;
        boolean z3;
        boolean zB2;
        List list3;
        List list4;
        List list5;
        List list6;
        long j9 = j;
        je9 je9Var = je9.f;
        hda hdaVar = hda.f;
        hda hdaVar2 = hda.j;
        hda hdaVar3 = hda.b;
        hda hdaVar4 = hda.k;
        r66 r66Var = r66.a;
        if (nq4Var instanceof yda) {
            ydaVar = (yda) nq4Var;
            int i4 = ydaVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ydaVar.n = i4 - Integer.MIN_VALUE;
            } else {
                ydaVar = new yda(this, nq4Var);
            }
        } else {
            ydaVar = new yda(this, nq4Var);
        }
        Object objD = ydaVar.l;
        hu4 hu4Var = hu4.a;
        int i5 = ydaVar.n;
        if (i5 == 0) {
            ch3.d0(objD);
            rt2 rt2Var5 = (rt2) this.a.getValue();
            if (rt2Var5 != null) {
                j44 j44VarP = p();
                ydaVar.e = rt2Var5;
                ydaVar.d = j9;
                ydaVar.n = 1;
                Object objF = j44VarP.f(j9, ydaVar);
                if (objF != hu4Var) {
                    rt2Var = rt2Var5;
                    objD = objF;
                }
                return hu4Var;
            }
            return r66Var;
        }
        if (i5 == 1) {
            j9 = ydaVar.d;
            rt2Var = ydaVar.e;
            ch3.d0(objD);
        } else {
            if (i5 == 2) {
                j2 = ydaVar.d;
                fdaVarA = ydaVar.g;
                sfaVar2 = ydaVar.f;
                rt2Var2 = ydaVar.e;
                ch3.d0(objD);
                rt2Var4 = (rt2) objD;
                if (rt2Var4 == null) {
                    sfaVar = sfaVar2;
                    rt2Var = rt2Var2;
                    fdaVar = fdaVarA;
                    rt2Var3 = rt2Var;
                    sfaVar2 = sfaVar;
                    rt2Var4 = rt2Var3;
                } else {
                    fdaVar = fdaVarA;
                    rt2Var3 = rt2Var2;
                }
                zK0 = rt2Var4.k0(q());
                i = !zK0 ? 1 : 0;
                c79VarW = yab.w();
                if (!sfaVar2.N()) {
                    if (r()) {
                        zB = false;
                    } else {
                        zB = ((uia) this.e.getValue()).b(rt2Var3, fdaVar);
                    }
                    if (zB) {
                        c79VarW.add(hdaVar4);
                    }
                    if (g(rt2Var3, fdaVar)) {
                        c79VarW.add(hda.e);
                    }
                    if (zK0 == 0 && f(rt2Var3, Collections.singletonList(fdaVar.a))) {
                        c79VarW.add(hda.a);
                    }
                    if (zK0 == 0) {
                        sfaVar4 = fdaVar.a;
                        if (sfaVar4.m() == 1 || !sfaVar4.P()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (sfaVar4.m() == 1 || !sfaVar4.Z()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z2 || z3) {
                            c79VarW.add(hda.n);
                        }
                    }
                    if (zK0 == 0 && i(fdaVar)) {
                        c79VarW.add(hdaVar3);
                    }
                    if (rt2Var3 == null && rt2Var3.d0()) {
                        j3 = 0;
                        if (sfaVar2.b != 0) {
                            c79VarW.add(hda.o);
                        }
                    } else {
                        j3 = 0;
                    }
                    if (rt2Var3 != null && rt2Var3.w0() && rt2Var3.e0() && !rt2Var3.y0() && sfaVar2.b != j3 && !(sfaVar2 instanceof ky3)) {
                        c79VarW.add(hda.p);
                    }
                    if (!rt2Var3.f0() && !(rt2Var3 instanceof s04) && (!rt2Var3.d0() || rt2Var3.A0())) {
                        c79VarW.add(hda.d);
                    }
                    if (zK0 == 0 && ((Boolean) ((f5d) ((wo6) this.h.getValue())).a.x5.a(e5d.S6[337]).i()).booleanValue() && h(sfaVar2)) {
                        c79VarW.add(hda.l);
                    }
                    if (zK0 == 0 && (c46Var = sfaVar2.n) != null && (list2 = (List) c46Var.a) != null && sfaVar2.B(y60.c) && list2.size() == 1) {
                        c79VarW.add(hda.m);
                    }
                    if (!sfaVar2.K() && rt2Var3.P()) {
                        j7 = sfaVar2.b;
                        if (j7 > j3) {
                            j8 = rt2Var3.b.M;
                            if (j8 == j3) {
                                fdaVar2 = rt2Var3.e;
                                if (fdaVar2 != null) {
                                    j8 = fdaVar2.a.b;
                                } else {
                                    j8 = j3;
                                }
                            }
                            if (j8 == j7) {
                                c79VarW.add(hda.i);
                            } else {
                                c79VarW.add(hda.h);
                            }
                        }
                    }
                    if (sfaVar2.S()) {
                        e5dVarQ = q();
                        o5dVarU = sfaVar2.u();
                        if (o5dVarU != null) {
                            numValueOf = Integer.valueOf(o5dVarU.f);
                        } else {
                            numValueOf = null;
                        }
                        if (e5dVarQ.v(numValueOf) || fdaVar.a.b == j3) {
                            j4 = j2;
                        } else {
                            o5d o5dVarU3 = sfaVar2.u();
                            if (o5dVarU3 == null) {
                                String name2 = cea.class.getName();
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                    j4 = j2;
                                    a4cVar2.c(je9Var, name2, nbh.s(sfaVar2.b, "canRevoteInPoll: poll for message(", ") is null"), null);
                                } else {
                                    j4 = j2;
                                }
                            } else {
                                j4 = j2;
                                if (!yil.b(o5dVarU3.d) && (o5dVarU3.d & 4) != 0 && (n5dVar = o5dVarU3.e) != null) {
                                    u8b u8bVar = n5dVar.b;
                                    Object[] objArr = u8bVar.a;
                                    int i6 = u8bVar.b;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < i6) {
                                            z = true;
                                            if ((((m5d) objArr[i7]).e & 1) != 0) {
                                                c79VarW.add(hda.s);
                                                break;
                                            }
                                            i7++;
                                        }
                                    }
                                }
                                o5dVarU2 = sfaVar2.u();
                                if (o5dVarU2 == null) {
                                    name = cea.class.getName();
                                    a4cVar = gm0.f;
                                    if (a4cVar != null && a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, name, nbh.s(sfaVar2.b, "canFinishPoll: poll for message(", ") is null"), null);
                                    }
                                } else {
                                    if (rt2Var3.d0()) {
                                        zM = rt2Var3.M();
                                    } else if (sfaVar2.e == ((s7f) o()).t()) {
                                        zM = z;
                                    } else {
                                        zM = false;
                                    }
                                    if (zM && sfaVar2.T() && !yil.b(o5dVarU2.d)) {
                                        c79VarW.add(hda.t);
                                    }
                                }
                            }
                            z = true;
                            o5dVarU2 = sfaVar2.u();
                            if (o5dVarU2 == null) {
                                name = cea.class.getName();
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    a4cVar.c(je9Var, name, nbh.s(sfaVar2.b, "canFinishPoll: poll for message(", ") is null"), null);
                                }
                            } else {
                                if (rt2Var3.d0()) {
                                    zM = rt2Var3.M();
                                } else if (sfaVar2.e == ((s7f) o()).t()) {
                                    zM = z;
                                } else {
                                    zM = false;
                                }
                                if (zM) {
                                    c79VarW.add(hda.t);
                                }
                            }
                        }
                    } else {
                        j4 = j2;
                    }
                    if (sfaVar2.e != ((s7f) o()).t() && !rt2Var3.b.K.i(np0.n) && (!rt2Var3.d0() || !rt2Var3.B0())) {
                        c79VarW.add(hda.c);
                    }
                    if (rt2Var3.d0() || rt2Var3.B0() || !zK0) {
                        c79VarW.add(hdaVar2);
                    }
                    ydaVar.e = rt2Var3;
                    ydaVar.f = sfaVar2;
                    ydaVar.g = null;
                    ydaVar.h = c79VarW;
                    ydaVar.i = c79VarW;
                    j5 = j4;
                    ydaVar.d = j5;
                    ydaVar.j = i;
                    ydaVar.k = 0;
                    ydaVar.n = 3;
                    ceaVar = this;
                    objA = ceaVar.a(rt2Var3, ydaVar, sfaVar2);
                    if (objA != hu4Var) {
                        i2 = 0;
                        j6 = j5;
                        sfaVar3 = sfaVar2;
                        i3 = i;
                        list = c79VarW;
                        list3 = c79VarW;
                        if (((Boolean) objA).booleanValue()) {
                            list.add(hdaVar);
                        }
                        ydaVar.e = null;
                        ydaVar.f = null;
                        ydaVar.g = null;
                        ydaVar.h = list3;
                        ydaVar.i = list;
                        ydaVar.d = j6;
                        ydaVar.j = i3;
                        ydaVar.k = i2;
                        ydaVar.n = 4;
                        objD = ceaVar.d(rt2Var3, ydaVar, sfaVar3);
                        if (objD != hu4Var) {
                            list4 = list3;
                            list6 = list;
                        }
                    }
                    return hu4Var;
                }
                if (r()) {
                    zB2 = false;
                } else {
                    zB2 = ((uia) this.e.getValue()).b(rt2Var3, fdaVar);
                }
                if (zB2) {
                    c79VarW.add(hdaVar4);
                }
                c79VarW.add(hda.q);
                c79VarW.add(hda.r);
                if (!zK0 && i(fdaVar)) {
                    c79VarW.add(hdaVar3);
                }
                c79VarW.add(hdaVar2);
                c79VarW.add(hdaVar);
                list5 = c79VarW;
                return yab.j(list5);
            }
            if (i5 == 3) {
                i2 = ydaVar.k;
                i3 = ydaVar.j;
                j6 = ydaVar.d;
                List list7 = ydaVar.i;
                List list8 = ydaVar.h;
                sfaVar3 = ydaVar.f;
                rt2Var3 = ydaVar.e;
                ch3.d0(objD);
                list3 = list8;
                objA = objD;
                ceaVar = this;
                list = list7;
                if (((Boolean) objA).booleanValue()) {
                    list.add(hdaVar);
                }
                ydaVar.e = null;
                ydaVar.f = null;
                ydaVar.g = null;
                ydaVar.h = list3;
                ydaVar.i = list;
                ydaVar.d = j6;
                ydaVar.j = i3;
                ydaVar.k = i2;
                ydaVar.n = 4;
                objD = ceaVar.d(rt2Var3, ydaVar, sfaVar3);
                if (objD != hu4Var) {
                    list4 = list3;
                    list6 = list;
                }
                return hu4Var;
            }
            if (i5 != 4) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list9 = ydaVar.i;
            List list10 = ydaVar.h;
            ch3.d0(objD);
            list6 = list9;
            list4 = list10;
        }
        if (((Boolean) objD).booleanValue()) {
            list6.add(hda.g);
        }
        list5 = list4;
        return yab.j(list5);
        sfaVar = (sfa) objD;
        if (sfaVar != null && !sfaVar.M()) {
            fdaVarA = a.a((a) this.d.getValue(), sfaVar);
            s04 s04Var = rt2Var instanceof s04 ? (s04) rt2Var : null;
            if (s04Var == null || (q24Var = s04Var.r) == null) {
                j2 = j9;
                fdaVar = fdaVarA;
                rt2Var3 = rt2Var;
                sfaVar2 = sfaVar;
                rt2Var4 = rt2Var3;
                zK0 = rt2Var4.k0(q());
                i = !zK0 ? 1 : 0;
                c79VarW = yab.w();
                if (!sfaVar2.N()) {
                    if (r()) {
                        zB2 = false;
                    } else {
                        zB2 = ((uia) this.e.getValue()).b(rt2Var3, fdaVar);
                    }
                    if (zB2) {
                        c79VarW.add(hdaVar4);
                    }
                    c79VarW.add(hda.q);
                    c79VarW.add(hda.r);
                    if (!zK0) {
                        c79VarW.add(hdaVar3);
                    }
                    c79VarW.add(hdaVar2);
                    c79VarW.add(hdaVar);
                    list5 = c79VarW;
                } else {
                    if (r()) {
                        zB = false;
                    } else {
                        zB = ((uia) this.e.getValue()).b(rt2Var3, fdaVar);
                    }
                    if (zB) {
                        c79VarW.add(hdaVar4);
                    }
                    if (g(rt2Var3, fdaVar)) {
                        c79VarW.add(hda.e);
                    }
                    if (zK0 == 0) {
                        c79VarW.add(hda.a);
                    }
                    if (zK0 == 0) {
                        sfaVar4 = fdaVar.a;
                        if (sfaVar4.m() == 1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (sfaVar4.m() == 1) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            c79VarW.add(hda.n);
                        } else {
                            c79VarW.add(hda.n);
                        }
                    }
                    if (zK0 == 0) {
                        c79VarW.add(hdaVar3);
                    }
                    if (rt2Var3 == null) {
                        j3 = 0;
                    } else {
                        j3 = 0;
                    }
                    if (rt2Var3 != null) {
                        c79VarW.add(hda.p);
                    }
                    if (!rt2Var3.f0()) {
                        c79VarW.add(hda.d);
                    }
                    if (zK0 == 0) {
                        c79VarW.add(hda.l);
                    }
                    if (zK0 == 0) {
                        c79VarW.add(hda.m);
                    }
                    if (!sfaVar2.K()) {
                        j7 = sfaVar2.b;
                        if (j7 > j3) {
                            j8 = rt2Var3.b.M;
                            if (j8 == j3) {
                                fdaVar2 = rt2Var3.e;
                                if (fdaVar2 != null) {
                                    j8 = fdaVar2.a.b;
                                } else {
                                    j8 = j3;
                                }
                            }
                            if (j8 == j7) {
                                c79VarW.add(hda.i);
                            } else {
                                c79VarW.add(hda.h);
                            }
                        }
                    }
                    if (sfaVar2.S()) {
                        e5dVarQ = q();
                        o5dVarU = sfaVar2.u();
                        if (o5dVarU != null) {
                            numValueOf = Integer.valueOf(o5dVarU.f);
                        } else {
                            numValueOf = null;
                        }
                        if (e5dVarQ.v(numValueOf)) {
                            j4 = j2;
                        } else {
                            j4 = j2;
                        }
                    } else {
                        j4 = j2;
                    }
                    if (sfaVar2.e != ((s7f) o()).t()) {
                        c79VarW.add(hda.c);
                    }
                    if (rt2Var3.d0()) {
                        c79VarW.add(hdaVar2);
                    } else {
                        c79VarW.add(hdaVar2);
                    }
                    ydaVar.e = rt2Var3;
                    ydaVar.f = sfaVar2;
                    ydaVar.g = null;
                    ydaVar.h = c79VarW;
                    ydaVar.i = c79VarW;
                    j5 = j4;
                    ydaVar.d = j5;
                    ydaVar.j = i;
                    ydaVar.k = 0;
                    ydaVar.n = 3;
                    ceaVar = this;
                    objA = ceaVar.a(rt2Var3, ydaVar, sfaVar2);
                    if (objA != hu4Var) {
                        i2 = 0;
                        j6 = j5;
                        sfaVar3 = sfaVar2;
                        i3 = i;
                        list = c79VarW;
                        list3 = c79VarW;
                        if (((Boolean) objA).booleanValue()) {
                            list.add(hdaVar);
                        }
                        ydaVar.e = null;
                        ydaVar.f = null;
                        ydaVar.g = null;
                        ydaVar.h = list3;
                        ydaVar.i = list;
                        ydaVar.d = j6;
                        ydaVar.j = i3;
                        ydaVar.k = i2;
                        ydaVar.n = 4;
                        objD = ceaVar.d(rt2Var3, ydaVar, sfaVar3);
                        if (objD != hu4Var) {
                            list4 = list3;
                            list6 = list;
                            if (((Boolean) objD).booleanValue()) {
                                list6.add(hda.g);
                            }
                            list5 = list4;
                        }
                    }
                }
                return yab.j(list5);
            }
            long j10 = q24Var.a;
            xn3 xn3Var = (xn3) this.b.getValue();
            ydaVar.e = rt2Var;
            ydaVar.f = sfaVar;
            ydaVar.g = fdaVarA;
            ydaVar.d = j9;
            long j11 = j9;
            ydaVar.j = 0;
            ydaVar.n = 2;
            Object objI = xn3Var.i(j10, ydaVar);
            if (objI != hu4Var) {
                rt2Var2 = rt2Var;
                sfaVar2 = sfaVar;
                objD = objI;
                j2 = j11;
                rt2Var4 = (rt2) objD;
                if (rt2Var4 == null) {
                    sfaVar = sfaVar2;
                    rt2Var = rt2Var2;
                    fdaVar = fdaVarA;
                    rt2Var3 = rt2Var;
                    sfaVar2 = sfaVar;
                    rt2Var4 = rt2Var3;
                } else {
                    fdaVar = fdaVarA;
                    rt2Var3 = rt2Var2;
                }
                zK0 = rt2Var4.k0(q());
                i = !zK0 ? 1 : 0;
                c79VarW = yab.w();
                if (!sfaVar2.N()) {
                    if (r()) {
                        zB2 = false;
                    } else {
                        zB2 = ((uia) this.e.getValue()).b(rt2Var3, fdaVar);
                    }
                    if (zB2) {
                        c79VarW.add(hdaVar4);
                    }
                    c79VarW.add(hda.q);
                    c79VarW.add(hda.r);
                    if (!zK0) {
                        c79VarW.add(hdaVar3);
                    }
                    c79VarW.add(hdaVar2);
                    c79VarW.add(hdaVar);
                    list5 = c79VarW;
                } else {
                    if (r()) {
                        zB = false;
                    } else {
                        zB = ((uia) this.e.getValue()).b(rt2Var3, fdaVar);
                    }
                    if (zB) {
                        c79VarW.add(hdaVar4);
                    }
                    if (g(rt2Var3, fdaVar)) {
                        c79VarW.add(hda.e);
                    }
                    if (zK0 == 0) {
                        c79VarW.add(hda.a);
                    }
                    if (zK0 == 0) {
                        sfaVar4 = fdaVar.a;
                        if (sfaVar4.m() == 1) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (sfaVar4.m() == 1) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            c79VarW.add(hda.n);
                        } else {
                            c79VarW.add(hda.n);
                        }
                    }
                    if (zK0 == 0) {
                        c79VarW.add(hdaVar3);
                    }
                    if (rt2Var3 == null) {
                        j3 = 0;
                    } else {
                        j3 = 0;
                    }
                    if (rt2Var3 != null) {
                        c79VarW.add(hda.p);
                    }
                    if (!rt2Var3.f0()) {
                        c79VarW.add(hda.d);
                    }
                    if (zK0 == 0) {
                        c79VarW.add(hda.l);
                    }
                    if (zK0 == 0) {
                        c79VarW.add(hda.m);
                    }
                    if (!sfaVar2.K()) {
                        j7 = sfaVar2.b;
                        if (j7 > j3) {
                            j8 = rt2Var3.b.M;
                            if (j8 == j3) {
                                fdaVar2 = rt2Var3.e;
                                if (fdaVar2 != null) {
                                    j8 = fdaVar2.a.b;
                                } else {
                                    j8 = j3;
                                }
                            }
                            if (j8 == j7) {
                                c79VarW.add(hda.i);
                            } else {
                                c79VarW.add(hda.h);
                            }
                        }
                    }
                    if (sfaVar2.S()) {
                        e5dVarQ = q();
                        o5dVarU = sfaVar2.u();
                        if (o5dVarU != null) {
                            numValueOf = Integer.valueOf(o5dVarU.f);
                        } else {
                            numValueOf = null;
                        }
                        if (e5dVarQ.v(numValueOf)) {
                            j4 = j2;
                        } else {
                            j4 = j2;
                        }
                    } else {
                        j4 = j2;
                    }
                    if (sfaVar2.e != ((s7f) o()).t()) {
                        c79VarW.add(hda.c);
                    }
                    if (rt2Var3.d0()) {
                        c79VarW.add(hdaVar2);
                    } else {
                        c79VarW.add(hdaVar2);
                    }
                    ydaVar.e = rt2Var3;
                    ydaVar.f = sfaVar2;
                    ydaVar.g = null;
                    ydaVar.h = c79VarW;
                    ydaVar.i = c79VarW;
                    j5 = j4;
                    ydaVar.d = j5;
                    ydaVar.j = i;
                    ydaVar.k = 0;
                    ydaVar.n = 3;
                    ceaVar = this;
                    objA = ceaVar.a(rt2Var3, ydaVar, sfaVar2);
                    if (objA != hu4Var) {
                        i2 = 0;
                        j6 = j5;
                        sfaVar3 = sfaVar2;
                        i3 = i;
                        list = c79VarW;
                        list3 = c79VarW;
                        if (((Boolean) objA).booleanValue()) {
                            list.add(hdaVar);
                        }
                        ydaVar.e = null;
                        ydaVar.f = null;
                        ydaVar.g = null;
                        ydaVar.h = list3;
                        ydaVar.i = list;
                        ydaVar.d = j6;
                        ydaVar.j = i3;
                        ydaVar.k = i2;
                        ydaVar.n = 4;
                        objD = ceaVar.d(rt2Var3, ydaVar, sfaVar3);
                        if (objD != hu4Var) {
                            list4 = list3;
                            list6 = list;
                            if (((Boolean) objD).booleanValue()) {
                                list6.add(hda.g);
                            }
                            list5 = list4;
                        }
                    }
                }
                return yab.j(list5);
            }
            return hu4Var;
        }
        return r66Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x0218  */
    /* JADX WARN: Code duplicated, block: B:107:0x0221  */
    /* JADX WARN: Code duplicated, block: B:108:0x0222 A[PHI: r1 r14
  0x0222: PHI (r1v8 java.util.List) = (r1v18 java.util.List), (r1v19 java.util.List) binds: [B:100:0x01f6, B:107:0x0221] A[DONT_GENERATE, DONT_INLINE]
  0x0222: PHI (r14v9 java.util.List) = (r14v13 java.util.List), (r14v10 java.util.List) binds: [B:100:0x01f6, B:107:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec A[PHI: r1 r3 r5 r9 r13
  0x00ec: PHI (r1v2 long) = (r1v4 long), (r1v5 long) binds: [B:48:0x00ea, B:46:0x00e7] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r3v9 rt2) = (r3v36 rt2), (r3v38 rt2) binds: [B:48:0x00ea, B:46:0x00e7] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r5v8 fda) = (r5v18 fda), (r5v19 fda) binds: [B:48:0x00ea, B:46:0x00e7] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r9v2 sfa) = (r9v3 sfa), (r9v4 sfa) binds: [B:48:0x00ea, B:46:0x00e7] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r13v2 rt2) = (r13v3 rt2), (r13v4 rt2) binds: [B:48:0x00ea, B:46:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x0160  */
    /* JADX WARN: Code duplicated, block: B:79:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b5 A[PHI: r5
  0x01b5: PHI (r5v12 long) = (r5v10 long), (r5v11 long) binds: [B:86:0x01b3, B:90:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [cea] */
    /* JADX WARN: Type inference failed for: r3v40, types: [int] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v46 */
    public final Serializable l(long j, nq4 nq4Var) {
        zda zdaVar;
        rt2 rt2Var;
        sfa sfaVar;
        fda fdaVarA;
        q24 q24Var;
        sfa sfaVar2;
        rt2 rt2Var2;
        boolean zK0;
        c79 c79VarW;
        boolean zR;
        ny8 ny8Var;
        boolean zB;
        boolean zN;
        long j2;
        boolean z;
        int i;
        Object objA;
        sfa sfaVar3;
        long j3;
        List list;
        long j4;
        long j5;
        fda fdaVar;
        sfa sfaVar4;
        List list2;
        ?? r3;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        long j6 = j;
        if (nq4Var instanceof zda) {
            zdaVar = (zda) nq4Var;
            int i2 = zdaVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zdaVar.n = i2 - Integer.MIN_VALUE;
            } else {
                zdaVar = new zda(this, nq4Var);
            }
        } else {
            zdaVar = new zda(this, nq4Var);
        }
        Object objD = zdaVar.l;
        int i3 = zdaVar.n;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(objD);
            rt2 rt2Var3 = (rt2) this.a.getValue();
            if (rt2Var3 != null) {
                j44 j44VarP = p();
                zdaVar.e = rt2Var3;
                zdaVar.d = j6;
                zdaVar.n = 1;
                Object objF = j44VarP.f(j6, zdaVar);
                if (objF != hu4Var) {
                    rt2Var = rt2Var3;
                    objD = objF;
                }
                return hu4Var;
            }
            return r66.a;
        }
        if (i3 == 1) {
            j6 = zdaVar.d;
            rt2 rt2Var4 = zdaVar.e;
            ch3.d0(objD);
            rt2Var = rt2Var4;
        } else {
            if (i3 == 2) {
                j6 = zdaVar.d;
                fdaVarA = zdaVar.g;
                sfaVar2 = zdaVar.f;
                rt2Var = zdaVar.e;
                ch3.d0(objD);
                rt2Var2 = (rt2) objD;
                if (rt2Var2 == null) {
                    sfaVar = sfaVar2;
                    sfaVar2 = sfaVar;
                    rt2Var2 = rt2Var;
                    zK0 = rt2Var2.k0(q());
                    boolean z2 = !zK0;
                    c79VarW = yab.w();
                    zR = r();
                    ny8Var = this.e;
                    if (zR) {
                        zB = false;
                    } else {
                        zB = ((uia) ny8Var.getValue()).b(rt2Var, fdaVarA);
                    }
                    if (zB) {
                        c79VarW.add(hda.k);
                    }
                    if (!zK0) {
                        ((uia) ny8Var.getValue()).getClass();
                        if (ch3.s(fdaVarA.a.t())) {
                            c79VarW.add(hda.b);
                        } else {
                            sfaVar4 = fdaVarA.a;
                            if (uia.a(sfaVar4) || (sfaVar4.E() && uia.a(sfaVar4.q))) {
                                c79VarW.add(hda.b);
                            }
                        }
                    }
                    if (!zK0 && fdaVarA.a.m() == 1 && fdaVarA.a.P()) {
                        c79VarW.add(hda.n);
                    }
                    if (!zK0 && ((Boolean) ((f5d) ((wo6) this.h.getValue())).a.y5.a(e5d.S6[338]).i()).booleanValue() && h(sfaVar2)) {
                        c79VarW.add(hda.l);
                    }
                    zN = sfaVar2.N();
                    j2 = sfaVar2.b;
                    if (!zN && !sfaVar2.K() && rt2Var.P()) {
                        j4 = 0;
                        if (j2 > 0) {
                            j5 = rt2Var.b.M;
                            if (j5 == 0) {
                                fdaVar = rt2Var.e;
                                if (fdaVar != null) {
                                    j5 = fdaVar.a.b;
                                    j4 = j5;
                                }
                            } else {
                                j4 = j5;
                            }
                            if (j4 == j2) {
                                c79VarW.add(hda.i);
                            } else {
                                c79VarW.add(hda.h);
                            }
                        }
                    }
                    zdaVar.e = rt2Var;
                    zdaVar.f = sfaVar2;
                    zdaVar.g = null;
                    zdaVar.h = c79VarW;
                    zdaVar.i = c79VarW;
                    zdaVar.d = j6;
                    z = z2;
                    zdaVar.j = z ? 1 : 0;
                    i = 0;
                    zdaVar.k = 0;
                    zdaVar.n = 3;
                    objA = a(rt2Var, zdaVar, sfaVar2);
                    if (objA != hu4Var) {
                        sfaVar3 = sfaVar2;
                        j3 = j6;
                        list = c79VarW;
                        r3 = z;
                        list2 = c79VarW;
                        list6 = list;
                        list5 = list2;
                        if (((Boolean) objA).booleanValue()) {
                            list5.add(hda.f);
                            list4 = list6;
                        } else {
                            zdaVar.e = null;
                            zdaVar.f = null;
                            zdaVar.g = null;
                            zdaVar.h = list;
                            zdaVar.i = list2;
                            zdaVar.d = j3;
                            zdaVar.j = r3;
                            zdaVar.k = i;
                            zdaVar.n = 4;
                            objD = d(rt2Var, zdaVar, sfaVar3);
                            if (objD != hu4Var) {
                                list3 = list2;
                                list7 = list;
                            }
                        }
                        return yab.j(list4);
                    }
                } else {
                    zK0 = rt2Var2.k0(q());
                    boolean z3 = !zK0;
                    c79VarW = yab.w();
                    zR = r();
                    ny8Var = this.e;
                    if (zR) {
                        zB = false;
                    } else {
                        zB = ((uia) ny8Var.getValue()).b(rt2Var, fdaVarA);
                    }
                    if (zB) {
                        c79VarW.add(hda.k);
                    }
                    if (!zK0) {
                        ((uia) ny8Var.getValue()).getClass();
                        if (ch3.s(fdaVarA.a.t())) {
                            sfaVar4 = fdaVarA.a;
                            if (uia.a(sfaVar4)) {
                                c79VarW.add(hda.b);
                            } else {
                                c79VarW.add(hda.b);
                            }
                        } else {
                            c79VarW.add(hda.b);
                        }
                    }
                    if (!zK0) {
                        c79VarW.add(hda.n);
                    }
                    if (!zK0) {
                        c79VarW.add(hda.l);
                    }
                    zN = sfaVar2.N();
                    j2 = sfaVar2.b;
                    if (!zN) {
                        j4 = 0;
                        if (j2 > 0) {
                            j5 = rt2Var.b.M;
                            if (j5 == 0) {
                                fdaVar = rt2Var.e;
                                if (fdaVar != null) {
                                    j5 = fdaVar.a.b;
                                    j4 = j5;
                                }
                            } else {
                                j4 = j5;
                            }
                            if (j4 == j2) {
                                c79VarW.add(hda.i);
                            } else {
                                c79VarW.add(hda.h);
                            }
                        }
                    }
                    zdaVar.e = rt2Var;
                    zdaVar.f = sfaVar2;
                    zdaVar.g = null;
                    zdaVar.h = c79VarW;
                    zdaVar.i = c79VarW;
                    zdaVar.d = j6;
                    z = z3;
                    zdaVar.j = z ? 1 : 0;
                    i = 0;
                    zdaVar.k = 0;
                    zdaVar.n = 3;
                    objA = a(rt2Var, zdaVar, sfaVar2);
                    if (objA != hu4Var) {
                        sfaVar3 = sfaVar2;
                        j3 = j6;
                        list = c79VarW;
                        r3 = z;
                        list2 = c79VarW;
                        list6 = list;
                        list5 = list2;
                        if (((Boolean) objA).booleanValue()) {
                            zdaVar.e = null;
                            zdaVar.f = null;
                            zdaVar.g = null;
                            zdaVar.h = list;
                            zdaVar.i = list2;
                            zdaVar.d = j3;
                            zdaVar.j = r3;
                            zdaVar.k = i;
                            zdaVar.n = 4;
                            objD = d(rt2Var, zdaVar, sfaVar3);
                            if (objD != hu4Var) {
                                list3 = list2;
                                list7 = list;
                            }
                        } else {
                            list5.add(hda.f);
                            list4 = list6;
                        }
                        return yab.j(list4);
                    }
                }
                return hu4Var;
            }
            if (i3 == 3) {
                int i4 = zdaVar.k;
                int i5 = zdaVar.j;
                j3 = zdaVar.d;
                List list8 = zdaVar.i;
                List list9 = zdaVar.h;
                sfaVar3 = zdaVar.f;
                rt2Var = zdaVar.e;
                ch3.d0(objD);
                r3 = i5;
                list = list9;
                i = i4;
                objA = objD;
                list2 = list8;
                list6 = list;
                list5 = list2;
                if (((Boolean) objA).booleanValue()) {
                    zdaVar.e = null;
                    zdaVar.f = null;
                    zdaVar.g = null;
                    zdaVar.h = list;
                    zdaVar.i = list2;
                    zdaVar.d = j3;
                    zdaVar.j = r3;
                    zdaVar.k = i;
                    zdaVar.n = 4;
                    objD = d(rt2Var, zdaVar, sfaVar3);
                    if (objD != hu4Var) {
                        list3 = list2;
                        list7 = list;
                    }
                    return hu4Var;
                }
                list5.add(hda.f);
                list4 = list6;
                return yab.j(list4);
            }
            if (i3 != 4) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list10 = zdaVar.i;
            List list11 = zdaVar.h;
            ch3.d0(objD);
            list3 = list10;
            list7 = list11;
        }
        list4 = list7;
        if (((Boolean) objD).booleanValue()) {
            list5 = list3;
            list6 = list7;
            list5.add(hda.f);
            list4 = list6;
        }
        return yab.j(list4);
        sfaVar = (sfa) objD;
        if (sfaVar != null && !sfaVar.M()) {
            fdaVarA = a.a((a) this.d.getValue(), sfaVar);
            s04 s04Var = rt2Var instanceof s04 ? (s04) rt2Var : null;
            if (s04Var == null || (q24Var = s04Var.r) == null) {
                sfaVar2 = sfaVar;
                rt2Var2 = rt2Var;
                zK0 = rt2Var2.k0(q());
                boolean z4 = !zK0;
                c79VarW = yab.w();
                zR = r();
                ny8Var = this.e;
                if (zR) {
                    zB = false;
                } else {
                    zB = ((uia) ny8Var.getValue()).b(rt2Var, fdaVarA);
                }
                if (zB) {
                    c79VarW.add(hda.k);
                }
                if (!zK0) {
                    ((uia) ny8Var.getValue()).getClass();
                    if (ch3.s(fdaVarA.a.t())) {
                        sfaVar4 = fdaVarA.a;
                        if (uia.a(sfaVar4)) {
                            c79VarW.add(hda.b);
                        } else {
                            c79VarW.add(hda.b);
                        }
                    } else {
                        c79VarW.add(hda.b);
                    }
                }
                if (!zK0) {
                    c79VarW.add(hda.n);
                }
                if (!zK0) {
                    c79VarW.add(hda.l);
                }
                zN = sfaVar2.N();
                j2 = sfaVar2.b;
                if (!zN) {
                    j4 = 0;
                    if (j2 > 0) {
                        j5 = rt2Var.b.M;
                        if (j5 == 0) {
                            fdaVar = rt2Var.e;
                            if (fdaVar != null) {
                                j5 = fdaVar.a.b;
                                j4 = j5;
                            }
                        } else {
                            j4 = j5;
                        }
                        if (j4 == j2) {
                            c79VarW.add(hda.i);
                        } else {
                            c79VarW.add(hda.h);
                        }
                    }
                }
                zdaVar.e = rt2Var;
                zdaVar.f = sfaVar2;
                zdaVar.g = null;
                zdaVar.h = c79VarW;
                zdaVar.i = c79VarW;
                zdaVar.d = j6;
                z = z4;
                zdaVar.j = z ? 1 : 0;
                i = 0;
                zdaVar.k = 0;
                zdaVar.n = 3;
                objA = a(rt2Var, zdaVar, sfaVar2);
                if (objA != hu4Var) {
                    sfaVar3 = sfaVar2;
                    j3 = j6;
                    list = c79VarW;
                    r3 = z;
                    list2 = c79VarW;
                    list6 = list;
                    list5 = list2;
                    if (((Boolean) objA).booleanValue()) {
                        zdaVar.e = null;
                        zdaVar.f = null;
                        zdaVar.g = null;
                        zdaVar.h = list;
                        zdaVar.i = list2;
                        zdaVar.d = j3;
                        zdaVar.j = r3;
                        zdaVar.k = i;
                        zdaVar.n = 4;
                        objD = d(rt2Var, zdaVar, sfaVar3);
                        if (objD != hu4Var) {
                            list3 = list2;
                            list7 = list;
                            list4 = list7;
                            if (((Boolean) objD).booleanValue()) {
                                list5 = list3;
                                list6 = list7;
                                list5.add(hda.f);
                                list4 = list6;
                            }
                        }
                    } else {
                        list5.add(hda.f);
                        list4 = list6;
                    }
                    return yab.j(list4);
                }
            } else {
                long j7 = q24Var.a;
                xn3 xn3Var = (xn3) this.b.getValue();
                zdaVar.e = rt2Var;
                zdaVar.f = sfaVar;
                zdaVar.g = fdaVarA;
                zdaVar.d = j6;
                zdaVar.j = 0;
                zdaVar.n = 2;
                Object objI = xn3Var.i(j7, zdaVar);
                if (objI != hu4Var) {
                    sfaVar2 = sfaVar;
                    objD = objI;
                    rt2Var2 = (rt2) objD;
                    if (rt2Var2 == null) {
                        sfaVar = sfaVar2;
                        sfaVar2 = sfaVar;
                        rt2Var2 = rt2Var;
                        zK0 = rt2Var2.k0(q());
                        boolean z5 = !zK0;
                        c79VarW = yab.w();
                        zR = r();
                        ny8Var = this.e;
                        if (zR) {
                            zB = false;
                        } else {
                            zB = ((uia) ny8Var.getValue()).b(rt2Var, fdaVarA);
                        }
                        if (zB) {
                            c79VarW.add(hda.k);
                        }
                        if (!zK0) {
                            ((uia) ny8Var.getValue()).getClass();
                            if (ch3.s(fdaVarA.a.t())) {
                                sfaVar4 = fdaVarA.a;
                                if (uia.a(sfaVar4)) {
                                    c79VarW.add(hda.b);
                                } else {
                                    c79VarW.add(hda.b);
                                }
                            } else {
                                c79VarW.add(hda.b);
                            }
                        }
                        if (!zK0) {
                            c79VarW.add(hda.n);
                        }
                        if (!zK0) {
                            c79VarW.add(hda.l);
                        }
                        zN = sfaVar2.N();
                        j2 = sfaVar2.b;
                        if (!zN) {
                            j4 = 0;
                            if (j2 > 0) {
                                j5 = rt2Var.b.M;
                                if (j5 == 0) {
                                    fdaVar = rt2Var.e;
                                    if (fdaVar != null) {
                                        j5 = fdaVar.a.b;
                                        j4 = j5;
                                    }
                                } else {
                                    j4 = j5;
                                }
                                if (j4 == j2) {
                                    c79VarW.add(hda.i);
                                } else {
                                    c79VarW.add(hda.h);
                                }
                            }
                        }
                        zdaVar.e = rt2Var;
                        zdaVar.f = sfaVar2;
                        zdaVar.g = null;
                        zdaVar.h = c79VarW;
                        zdaVar.i = c79VarW;
                        zdaVar.d = j6;
                        z = z5;
                        zdaVar.j = z ? 1 : 0;
                        i = 0;
                        zdaVar.k = 0;
                        zdaVar.n = 3;
                        objA = a(rt2Var, zdaVar, sfaVar2);
                        if (objA != hu4Var) {
                            sfaVar3 = sfaVar2;
                            j3 = j6;
                            list = c79VarW;
                            r3 = z;
                            list2 = c79VarW;
                            list6 = list;
                            list5 = list2;
                            if (((Boolean) objA).booleanValue()) {
                                zdaVar.e = null;
                                zdaVar.f = null;
                                zdaVar.g = null;
                                zdaVar.h = list;
                                zdaVar.i = list2;
                                zdaVar.d = j3;
                                zdaVar.j = r3;
                                zdaVar.k = i;
                                zdaVar.n = 4;
                                objD = d(rt2Var, zdaVar, sfaVar3);
                                if (objD != hu4Var) {
                                    list3 = list2;
                                    list7 = list;
                                    list4 = list7;
                                    if (((Boolean) objD).booleanValue()) {
                                        list5 = list3;
                                        list6 = list7;
                                        list5.add(hda.f);
                                        list4 = list6;
                                    }
                                }
                            } else {
                                list5.add(hda.f);
                                list4 = list6;
                            }
                            return yab.j(list4);
                        }
                    } else {
                        zK0 = rt2Var2.k0(q());
                        boolean z6 = !zK0;
                        c79VarW = yab.w();
                        zR = r();
                        ny8Var = this.e;
                        if (zR) {
                            zB = false;
                        } else {
                            zB = ((uia) ny8Var.getValue()).b(rt2Var, fdaVarA);
                        }
                        if (zB) {
                            c79VarW.add(hda.k);
                        }
                        if (!zK0) {
                            ((uia) ny8Var.getValue()).getClass();
                            if (ch3.s(fdaVarA.a.t())) {
                                sfaVar4 = fdaVarA.a;
                                if (uia.a(sfaVar4)) {
                                    c79VarW.add(hda.b);
                                } else {
                                    c79VarW.add(hda.b);
                                }
                            } else {
                                c79VarW.add(hda.b);
                            }
                        }
                        if (!zK0) {
                            c79VarW.add(hda.n);
                        }
                        if (!zK0) {
                            c79VarW.add(hda.l);
                        }
                        zN = sfaVar2.N();
                        j2 = sfaVar2.b;
                        if (!zN) {
                            j4 = 0;
                            if (j2 > 0) {
                                j5 = rt2Var.b.M;
                                if (j5 == 0) {
                                    fdaVar = rt2Var.e;
                                    if (fdaVar != null) {
                                        j5 = fdaVar.a.b;
                                        j4 = j5;
                                    }
                                } else {
                                    j4 = j5;
                                }
                                if (j4 == j2) {
                                    c79VarW.add(hda.i);
                                } else {
                                    c79VarW.add(hda.h);
                                }
                            }
                        }
                        zdaVar.e = rt2Var;
                        zdaVar.f = sfaVar2;
                        zdaVar.g = null;
                        zdaVar.h = c79VarW;
                        zdaVar.i = c79VarW;
                        zdaVar.d = j6;
                        z = z6;
                        zdaVar.j = z ? 1 : 0;
                        i = 0;
                        zdaVar.k = 0;
                        zdaVar.n = 3;
                        objA = a(rt2Var, zdaVar, sfaVar2);
                        if (objA != hu4Var) {
                            sfaVar3 = sfaVar2;
                            j3 = j6;
                            list = c79VarW;
                            r3 = z;
                            list2 = c79VarW;
                            list6 = list;
                            list5 = list2;
                            if (((Boolean) objA).booleanValue()) {
                                zdaVar.e = null;
                                zdaVar.f = null;
                                zdaVar.g = null;
                                zdaVar.h = list;
                                zdaVar.i = list2;
                                zdaVar.d = j3;
                                zdaVar.j = r3;
                                zdaVar.k = i;
                                zdaVar.n = 4;
                                objD = d(rt2Var, zdaVar, sfaVar3);
                                if (objD != hu4Var) {
                                    list3 = list2;
                                    list7 = list;
                                    list4 = list7;
                                    if (((Boolean) objD).booleanValue()) {
                                        list5 = list3;
                                        list6 = list7;
                                        list5.add(hda.f);
                                        list4 = list6;
                                    }
                                }
                            } else {
                                list5.add(hda.f);
                                list4 = list6;
                            }
                            return yab.j(list4);
                        }
                    }
                }
            }
            return hu4Var;
        }
        return r66.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fd A[PHI: r3 r4
  0x01fd: PHI (r3v4 java.util.List) = (r3v2 java.util.List), (r3v5 java.util.List) binds: [B:85:0x01a5, B:101:0x01fb] A[DONT_GENERATE, DONT_INLINE]
  0x01fd: PHI (r4v19 java.util.List) = (r4v16 java.util.List), (r4v20 java.util.List) binds: [B:85:0x01a5, B:101:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[PHI: r1 r14
  0x00d7: PHI (r1v4 rt2) = (r1v3 rt2), (r1v3 rt2), (r1v6 rt2) binds: [B:35:0x00ac, B:37:0x00b0, B:42:0x00d1] A[DONT_GENERATE, DONT_INLINE]
  0x00d7: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v3 java.util.List), (r14v26 java.util.List) binds: [B:35:0x00ac, B:37:0x00b0, B:42:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c9  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (r15 == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01eb, code lost:
    
        if (r15 == r8) goto L96;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01eb -> B:97:0x01ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m(java.util.Set r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cea.m(java.util.Set, nq4):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable n(Set set, nq4 nq4Var) {
        bea beaVar;
        rt2 rt2Var;
        if (nq4Var instanceof bea) {
            beaVar = (bea) nq4Var;
            int i = beaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                beaVar.g = i - Integer.MIN_VALUE;
            } else {
                beaVar = new bea(this, nq4Var);
            }
        } else {
            beaVar = new bea(this, nq4Var);
        }
        Object obj = beaVar.e;
        int i2 = beaVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            rt2 rt2Var2 = (rt2) this.a.getValue();
            if (rt2Var2 != null) {
                j44 j44VarP = p();
                beaVar.d = rt2Var2;
                beaVar.g = 1;
                Object objJ = j44VarP.j(set, beaVar);
                hu4 hu4Var = hu4.a;
                if (objJ == hu4Var) {
                    return hu4Var;
                }
                obj = objJ;
                rt2Var = rt2Var2;
            }
            return r66.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rt2Var = beaVar.d;
        ch3.d0(obj);
        List list = (List) obj;
        if (!list.isEmpty()) {
            sfa sfaVar = (sfa) ww3.r1(list);
            mg5 mg5Var = sfaVar.H;
            c79 c79VarW = yab.w();
            if (list.size() == 1 && g(rt2Var, a.a((a) this.d.getValue(), sfaVar))) {
                c79VarW.add(hda.e);
            }
            if (mg5Var.h() && f(rt2Var, list)) {
                c79VarW.add(hda.a);
            }
            return yab.j(c79VarW);
        }
        return r66.a;
    }

    public final et3 o() {
        return (et3) this.f.getValue();
    }

    public final j44 p() {
        return (j44) this.c.getValue();
    }

    public final e5d q() {
        return (e5d) this.i.getValue();
    }

    public final boolean r() {
        rt2 rt2Var;
        Object value = this.a.getValue();
        s04 s04Var = value instanceof s04 ? (s04) value : null;
        return (s04Var == null || (rt2Var = (rt2) ((xn3) this.b.getValue()).l(s04Var.r.a).a.getValue()) == null || (rt2Var.b.q0 & 2) == 0) ? false : true;
    }
}
