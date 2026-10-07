package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g24 {
    public final rre a;
    public final ifh c;
    public final b24 b = new b24(0, this);
    public final c24 d = new c24(this, 0);
    public final c24 e = new c24(this, 1);
    public final c24 f = new c24(this, 2);

    public g24(rre rreVar) {
        this.c = new ifh(new q14(rreVar, 0));
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(g24 g24Var, q24 q24Var, uy3 uy3Var, nq4 nq4Var) {
        f14 f14Var;
        uy3 uy3Var2;
        if (nq4Var instanceof f14) {
            f14Var = (f14) nq4Var;
            int i = f14Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                f14Var.i = i - Integer.MIN_VALUE;
            } else {
                f14Var = new f14(g24Var, nq4Var);
            }
        } else {
            f14Var = new f14(g24Var, nq4Var);
        }
        Object objE = f14Var.g;
        int i2 = f14Var.i;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objE);
            long jH = uy3Var.h();
            f14Var.d = g24Var;
            f14Var.e = uy3Var;
            f14Var.i = 1;
            objE = g24Var.e(q24Var, jH, f14Var);
            if (objE != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            uy3Var = f14Var.e;
            g24Var = f14Var.d;
            ch3.d0(objE);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(objE);
                    return objE;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uy3Var2 = f14Var.f;
            ch3.d0(objE);
        }
        return new Long(uy3Var2.c());
        uy3 uy3Var3 = (uy3) objE;
        if (uy3Var3 != null) {
            cei ceiVar = new cei(uy3Var3.c(), uy3Var.a(), 0);
            f14Var.d = null;
            f14Var.e = null;
            f14Var.f = uy3Var3;
            f14Var.i = 2;
            if (ch3.I(f14Var, g24Var.a, false, true, new tc(g24Var, 28, ceiVar)) != hu4Var) {
                uy3Var2 = uy3Var3;
                return new Long(uy3Var2.c());
            }
        } else {
            f14Var.d = null;
            f14Var.e = null;
            f14Var.f = null;
            f14Var.i = 3;
            Object objI = ch3.I(f14Var, g24Var.a, false, true, new i14(g24Var, uy3Var, 0));
            if (objI != hu4Var) {
                return objI;
            }
        }
        return hu4Var;
    }

    public static dz3 d(g24 g24Var, uy3 uy3Var, dz3 dz3Var, q24 q24Var, Long l, Long l2, int i) {
        String strI;
        Long l3 = (i & 8) != 0 ? null : l;
        Long l4 = (i & 16) == 0 ? l2 : null;
        g24Var.getClass();
        String strH = dz3Var.h();
        if ((strH == null || strH.length() == 0) && (strI = uy3Var.i()) != null && strI.length() != 0) {
            strH = uy3Var.i();
        }
        String str = strH;
        long jD = dz3Var.d();
        if (jD == 0) {
            jD = uy3Var.e();
        }
        long j = jD;
        int iE = dz3Var.e();
        if (iE == 0) {
            iE = uy3Var.f();
        }
        int i2 = iE;
        kja kjaVarF = dz3Var.f();
        if (kjaVarF == null) {
            kjaVarF = uy3Var.g();
        }
        return dz3.a(dz3Var, uy3Var.c(), l3 != null ? l3.longValue() : dz3Var.g(), q24Var, l4 != null ? l4.longValue() : dz3Var.b(), str, kjaVarF, i2, j, uy3Var.d() && dz3Var.c());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x012c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0152  */
    /* JADX WARN: Code duplicated, block: B:45:0x015d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193  */
    /* JADX WARN: Code duplicated, block: B:51:0x0198  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [dz3, q24] */
    /* JADX WARN: Type inference failed for: r12v3, types: [dz3, q24, xfa] */
    /* JADX WARN: Type inference failed for: r12v4, types: [dz3, q24, xfa] */
    /* JADX WARN: Type inference failed for: r12v5, types: [dz3, g24, java.lang.Long, q24, uy3, xfa] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public static Object f(g24 g24Var, q24 q24Var, long j, dz3 dz3Var, xfa xfaVar, Long l, nq4 nq4Var) {
        g14 g14Var;
        Object obj;
        ?? r12;
        g24 g24Var2;
        q24 q24Var2;
        long j2;
        dz3 dz3Var2;
        xfa xfaVar2;
        Long l2;
        g24 g24Var3;
        xfa xfaVar3;
        Long l3;
        uy3 uy3Var;
        ?? r13;
        dz3 dz3Var3;
        long jC;
        Long l4;
        uy3 uy3Var2;
        dz3 dz3Var4;
        ?? r14;
        uy3 uy3Var3;
        Long l5;
        g24 g24Var4;
        ?? r15;
        int iIntValue;
        Object objI;
        int i;
        if (nq4Var instanceof g14) {
            g14Var = (g14) nq4Var;
            int i2 = g14Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g14Var.o = i2 - Integer.MIN_VALUE;
            } else {
                g14Var = new g14(g24Var, nq4Var);
            }
        } else {
            g14Var = new g14(g24Var, nq4Var);
        }
        g14 g14Var2 = g14Var;
        Object objI2 = g14Var2.m;
        int i3 = g14Var2.o;
        Object obj2 = hu4.a;
        if (i3 == 0) {
            ch3.d0(objI2);
            g14Var2.d = g24Var;
            g14Var2.e = q24Var;
            g14Var2.f = dz3Var;
            g14Var2.g = xfaVar;
            g14Var2.h = l;
            g14Var2.k = j;
            g14Var2.o = 1;
            obj = obj2;
            r12 = 0;
            objI2 = ch3.I(g14Var2, g24Var.a, true, false, new s14(q24Var.a(), q24Var.b(), j, g24Var, 2));
            if (objI2 != obj) {
                g24Var2 = g24Var;
                q24Var2 = q24Var;
                j2 = j;
                dz3Var2 = dz3Var;
                xfaVar2 = xfaVar;
                l2 = l;
            }
            return obj;
        }
        if (i3 == 1) {
            j2 = g14Var2.k;
            l2 = g14Var2.h;
            xfaVar2 = g14Var2.g;
            dz3Var2 = g14Var2.f;
            q24Var2 = g14Var2.e;
            g24Var2 = g14Var2.d;
            ch3.d0(objI2);
            obj = obj2;
            r12 = 0;
        } else {
            if (i3 == 2) {
                j2 = g14Var2.k;
                uy3Var = g14Var2.i;
                l3 = g14Var2.h;
                xfaVar3 = g14Var2.g;
                g24Var3 = g14Var2.d;
                ch3.d0(objI2);
                r13 = 0;
                obj = obj2;
                dz3Var3 = (dz3) objI2;
                jC = uy3Var.c();
                g14Var2.d = g24Var3;
                g14Var2.e = r13;
                g14Var2.f = r13;
                g14Var2.g = r13;
                g14Var2.h = l3;
                g14Var2.i = uy3Var;
                g14Var2.j = dz3Var3;
                g14Var2.k = j2;
                g14Var2.o = 3;
                if (g24Var3.h(jC, xfaVar3, g14Var2) != obj) {
                    l4 = l3;
                    uy3Var2 = uy3Var;
                    dz3Var4 = dz3Var3;
                    r14 = r13;
                    g14Var2.d = g24Var3;
                    g14Var2.e = r14;
                    g14Var2.f = r14;
                    g14Var2.g = r14;
                    g14Var2.h = l4;
                    g14Var2.i = uy3Var2;
                    g14Var2.j = r14;
                    g14Var2.k = j2;
                    g14Var2.o = 4;
                    objI2 = ch3.I(g14Var2, g24Var3.a, false, true, new tc(g24Var3, 29, dz3Var4));
                    if (objI2 != obj) {
                        uy3Var3 = uy3Var2;
                        l5 = l4;
                        g24Var4 = g24Var3;
                        r15 = r14;
                        iIntValue = ((Number) objI2).intValue();
                        if (l5 != null) {
                            long jC2 = uy3Var3.c();
                            long jLongValue = l5.longValue();
                            g14Var2.d = r15;
                            g14Var2.e = r15;
                            g14Var2.f = r15;
                            g14Var2.g = r15;
                            g14Var2.h = r15;
                            g14Var2.i = r15;
                            g14Var2.j = r15;
                            g14Var2.k = j2;
                            g14Var2.l = iIntValue;
                            g14Var2.o = 5;
                            objI = ch3.I(g14Var2, g24Var4.a, false, true, new x14(0, jLongValue, jC2));
                            if (objI != obj) {
                                objI = sbi.a;
                            }
                            if (objI != obj) {
                                i = iIntValue;
                            }
                        }
                        return new Integer(iIntValue);
                    }
                }
                return obj;
            }
            if (i3 == 3) {
                j2 = g14Var2.k;
                dz3Var4 = g14Var2.j;
                uy3Var2 = g14Var2.i;
                l4 = g14Var2.h;
                g24Var3 = g14Var2.d;
                ch3.d0(objI2);
                r14 = 0;
                obj = obj2;
                g14Var2.d = g24Var3;
                g14Var2.e = r14;
                g14Var2.f = r14;
                g14Var2.g = r14;
                g14Var2.h = l4;
                g14Var2.i = uy3Var2;
                g14Var2.j = r14;
                g14Var2.k = j2;
                g14Var2.o = 4;
                objI2 = ch3.I(g14Var2, g24Var3.a, false, true, new tc(g24Var3, 29, dz3Var4));
                if (objI2 != obj) {
                    uy3Var3 = uy3Var2;
                    l5 = l4;
                    g24Var4 = g24Var3;
                    r15 = r14;
                    iIntValue = ((Number) objI2).intValue();
                    if (l5 != null) {
                        long jC3 = uy3Var3.c();
                        long jLongValue2 = l5.longValue();
                        g14Var2.d = r15;
                        g14Var2.e = r15;
                        g14Var2.f = r15;
                        g14Var2.g = r15;
                        g14Var2.h = r15;
                        g14Var2.i = r15;
                        g14Var2.j = r15;
                        g14Var2.k = j2;
                        g14Var2.l = iIntValue;
                        g14Var2.o = 5;
                        objI = ch3.I(g14Var2, g24Var4.a, false, true, new x14(0, jLongValue2, jC3));
                        if (objI != obj) {
                            objI = sbi.a;
                        }
                        if (objI != obj) {
                            i = iIntValue;
                        }
                    }
                    return new Integer(iIntValue);
                }
                return obj;
            }
            if (i3 == 4) {
                j2 = g14Var2.k;
                uy3Var3 = g14Var2.i;
                l5 = g14Var2.h;
                g24Var4 = g14Var2.d;
                ch3.d0(objI2);
                r15 = 0;
                obj = obj2;
                iIntValue = ((Number) objI2).intValue();
                if (l5 != null) {
                    long jC4 = uy3Var3.c();
                    long jLongValue3 = l5.longValue();
                    g14Var2.d = r15;
                    g14Var2.e = r15;
                    g14Var2.f = r15;
                    g14Var2.g = r15;
                    g14Var2.h = r15;
                    g14Var2.i = r15;
                    g14Var2.j = r15;
                    g14Var2.k = j2;
                    g14Var2.l = iIntValue;
                    g14Var2.o = 5;
                    objI = ch3.I(g14Var2, g24Var4.a, false, true, new x14(0, jLongValue3, jC4));
                    if (objI != obj) {
                        objI = sbi.a;
                    }
                    if (objI != obj) {
                        i = iIntValue;
                    }
                    return obj;
                }
                return new Integer(iIntValue);
            }
            if (i3 != 5) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = g14Var2.l;
            ch3.d0(objI2);
        }
        iIntValue = i;
        return new Integer(iIntValue);
        uy3 uy3Var4 = (uy3) objI2;
        if (uy3Var4 == null) {
            return new Integer(0);
        }
        Long l6 = new Long(j2);
        g14Var2.d = g24Var2;
        g14Var2.e = r12;
        g14Var2.f = r12;
        g14Var2.g = xfaVar2;
        g14Var2.h = l2;
        g14Var2.i = uy3Var4;
        g14Var2.k = j2;
        g14Var2.o = 2;
        g24 g24Var5 = g24Var2;
        objI2 = d(g24Var5, uy3Var4, dz3Var2, q24Var2, null, l6, 8);
        g24Var3 = g24Var5;
        if (objI2 != obj) {
            xfaVar3 = xfaVar2;
            l3 = l2;
            uy3Var = uy3Var4;
            r13 = r12;
            dz3Var3 = (dz3) objI2;
            jC = uy3Var.c();
            g14Var2.d = g24Var3;
            g14Var2.e = r13;
            g14Var2.f = r13;
            g14Var2.g = r13;
            g14Var2.h = l3;
            g14Var2.i = uy3Var;
            g14Var2.j = dz3Var3;
            g14Var2.k = j2;
            g14Var2.o = 3;
            if (g24Var3.h(jC, xfaVar3, g14Var2) != obj) {
                l4 = l3;
                uy3Var2 = uy3Var;
                dz3Var4 = dz3Var3;
                r14 = r13;
                g14Var2.d = g24Var3;
                g14Var2.e = r14;
                g14Var2.f = r14;
                g14Var2.g = r14;
                g14Var2.h = l4;
                g14Var2.i = uy3Var2;
                g14Var2.j = r14;
                g14Var2.k = j2;
                g14Var2.o = 4;
                objI2 = ch3.I(g14Var2, g24Var3.a, false, true, new tc(g24Var3, 29, dz3Var4));
                if (objI2 != obj) {
                    uy3Var3 = uy3Var2;
                    l5 = l4;
                    g24Var4 = g24Var3;
                    r15 = r14;
                    iIntValue = ((Number) objI2).intValue();
                    if (l5 != null) {
                        long jC5 = uy3Var3.c();
                        long jLongValue4 = l5.longValue();
                        g14Var2.d = r15;
                        g14Var2.e = r15;
                        g14Var2.f = r15;
                        g14Var2.g = r15;
                        g14Var2.h = r15;
                        g14Var2.i = r15;
                        g14Var2.j = r15;
                        g14Var2.k = j2;
                        g14Var2.l = iIntValue;
                        g14Var2.o = 5;
                        objI = ch3.I(g14Var2, g24Var4.a, false, true, new x14(0, jLongValue4, jC5));
                        if (objI != obj) {
                            objI = sbi.a;
                        }
                        if (objI != obj) {
                            i = iIntValue;
                            iIntValue = i;
                        }
                    }
                    return new Integer(iIntValue);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x0174  */
    /* JADX WARN: Code duplicated, block: B:54:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
    
        if (r15.h(r7, r4, r5) == r14) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object g(defpackage.g24 r20, defpackage.q24 r21, long r22, defpackage.dz3 r24, java.lang.Long r25, defpackage.nq4 r26) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g24.g(g24, q24, long, dz3, java.lang.Long, nq4):java.lang.Object");
    }

    public final dwa a() {
        return (dwa) this.c.getValue();
    }

    public final Object b(long j, long j2, List list, nq4 nq4Var) {
        return ch3.I(nq4Var, this.a, false, true, new m14(nbh.x(")", nbh.C("DELETE FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND id in ("), list), j, j2, list, 0));
    }

    public Object e(q24 q24Var, long j, nq4 nq4Var) {
        return ch3.I(nq4Var, this.a, true, false, new s14(q24Var.a(), q24Var.b(), j, this, 1));
    }

    public final Object h(long j, xfa xfaVar, nq4 nq4Var) {
        Object objI = ch3.I(nq4Var, this.a, false, true, new t14(this, xfaVar, j, 0));
        return objI == hu4.a ? objI : sbi.a;
    }
}
