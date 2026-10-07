package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ki8 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public ki8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var5;
        this.e = ny8Var4;
        this.f = ny8Var6;
    }

    public static /* synthetic */ Object b(ki8 ki8Var, q24 q24Var, gda gdaVar, long j, boolean z, v7e v7eVar, nq4 nq4Var, int i) {
        boolean z2 = (i & 8) == 0;
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            v7eVar = new v7e(null);
        }
        return ki8Var.a(j, q24Var, nq4Var, gdaVar, v7eVar.a, z2, z);
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x033d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0371 -> B:71:0x0375). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(long r61, defpackage.q24 r63, defpackage.nq4 r64, defpackage.gda r65, java.lang.Long r66, boolean r67, boolean r68) {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki8.a(long, q24, nq4, gda, java.lang.Long, boolean, boolean):java.lang.Object");
    }

    public final g24 c() {
        return (g24) this.a.getValue();
    }

    public final Object d(zic zicVar, q24 q24Var, nq4 nq4Var) {
        long j = zicVar.a;
        String str = zicVar.b;
        c46 c46VarC = new f70().c();
        boolean z = zicVar.e;
        ku6 ku6Var = mg5.d;
        uy3 uy3Var = new uy3(0L, q24Var, 0L, 0L, 0L, 0L, j, str, xfa.SENDING, wja.ACTIVE, 0L, c46VarC, pm9.a(c46VarC), 1, z, 0, 0L, false, 0L, 0L, 0L, 0, r66.a, null, 0L);
        g24 g24VarC = c();
        Object objI = ch3.I(nq4Var, g24VarC.a, false, true, new i14(g24VarC, uy3Var, 0));
        return objI == hu4.a ? objI : sbi.a;
    }

    public final Object e(ky3 ky3Var, c46 c46Var, nq4 nq4Var) {
        Object objA = ((pei) this.f.getValue()).a(ky3Var.a, new oo(ky3Var, c46Var, this, 10), nq4Var);
        return objA == hu4.a ? objA : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (e(r15, r2, r1) == r7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.uy3 r15, defpackage.b50 r16, defpackage.nq4 r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.ii8
            if (r1 == 0) goto L15
            r1 = r0
            ii8 r1 = (defpackage.ii8) r1
            int r2 = r1.i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.i = r2
            goto L1a
        L15:
            ii8 r1 = new ii8
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.g
            int r2 = r1.i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            java.util.Iterator r14 = r1.f
            ky3 r14 = (defpackage.ky3) r14
            defpackage.ch3.d0(r0)
            goto L9e
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r14)
            return r5
        L36:
            java.util.Iterator r15 = r1.f
            c46 r2 = r1.e
            uy3 r6 = r1.d
            defpackage.ch3.d0(r0)
            r0 = r6
            goto L68
        L41:
            defpackage.ch3.d0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ny8 r2 = r14.b
            java.lang.Object r2 = r2.getValue()
            r7 = r2
            m7f r7 = (defpackage.m7f) r7
            ps3 r12 = new ps3
            r12.<init>(r4, r0)
            r8 = 0
            r10 = 0
            r6 = r16
            c46 r2 = defpackage.pm9.f(r6, r7, r8, r10, r12)
            java.util.Iterator r0 = r0.iterator()
            r13 = r0
            r0 = r15
            r15 = r13
        L68:
            boolean r6 = r15.hasNext()
            hu4 r7 = defpackage.hu4.a
            if (r6 == 0) goto L87
            java.lang.Object r6 = r15.next()
            zic r6 = (defpackage.zic) r6
            q24 r8 = r0.b
            r1.d = r0
            r1.e = r2
            r1.f = r15
            r1.i = r4
            java.lang.Object r6 = r14.d(r6, r8, r1)
            if (r6 != r7) goto L68
            goto L9d
        L87:
            jy3 r15 = defpackage.dnl.b(r0)
            ky3 r15 = r15.a()
            r1.d = r5
            r1.e = r5
            r1.f = r5
            r1.i = r3
            java.lang.Object r14 = r14.e(r15, r2, r1)
            if (r14 != r7) goto L9e
        L9d:
            return r7
        L9e:
            sbi r14 = defpackage.sbi.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki8.f(uy3, b50, nq4):java.lang.Object");
    }

    public final Object g(gda gdaVar, q24 q24Var, xfa xfaVar, boolean z, wja wjaVar, Long l, nq4 nq4Var) {
        dz3 dz3VarC = dnl.c(gdaVar, (lja) this.d.getValue(), q24Var, 0L, z, wjaVar);
        g24 g24VarC = c();
        long j = gdaVar.f;
        Long lA = v7e.a(l);
        return ch3.H(nq4Var, new e24(g24VarC, q24Var, j, dz3VarC, xfaVar, lA, null), g24VarC.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:63:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public final Object i(long j, q24 q24Var, nq4 nq4Var, gda gdaVar, Long l, boolean z, boolean z2) {
        ji8 ji8Var;
        long j2;
        q24 q24Var2;
        gda gdaVar2;
        boolean z3;
        wja wjaVar;
        Long l2;
        Object obj;
        boolean z4;
        boolean z5;
        q24 q24Var3;
        Long l3;
        Object obj2;
        boolean z6;
        gda gdaVar3;
        boolean z7;
        uy3 uy3Var;
        wja wjaVar2;
        wja wjaVar3;
        Object objH;
        uy3 uy3Var2;
        long j3 = j;
        Long l4 = l;
        boolean z8 = z2;
        wja wjaVar4 = wja.DELETED;
        if (nq4Var instanceof ji8) {
            ji8Var = (ji8) nq4Var;
            int i = ji8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ji8Var.l = i - Integer.MIN_VALUE;
            } else {
                ji8Var = new ji8(this, nq4Var);
            }
        } else {
            ji8Var = new ji8(this, nq4Var);
        }
        Object obj3 = ji8Var.j;
        hu4 hu4Var = hu4.a;
        int i2 = ji8Var.l;
        if (i2 == 0) {
            ch3.d0(obj3);
            if (z && gdaVar.e == xja.c) {
                j2 = j3;
                q24Var2 = q24Var;
                gdaVar2 = gdaVar;
                z3 = z;
                wjaVar = wjaVar4;
            } else if (((f5d) ((wo6) this.e.getValue())).s() && z && gdaVar.e == null) {
                g24 g24VarC = c();
                long j4 = gdaVar.a;
                ji8Var.d = gdaVar;
                ji8Var.e = q24Var;
                ji8Var.f = l4;
                ji8Var.g = j3;
                ji8Var.h = z;
                ji8Var.i = z8;
                ji8Var.l = 1;
                Object objE = g24VarC.e(q24Var, j4, ji8Var);
                if (objE != hu4Var) {
                    q24Var3 = q24Var;
                    l3 = l4;
                    obj2 = objE;
                    z6 = z;
                    gdaVar3 = gdaVar;
                    z7 = z8;
                    uy3Var = (uy3) obj2;
                    if (uy3Var != null) {
                        wjaVar2 = uy3Var.j;
                    } else {
                        wjaVar2 = null;
                    }
                    if (wjaVar2 == wjaVar4) {
                        wjaVar3 = uy3Var.j;
                    } else {
                        wjaVar3 = null;
                    }
                    j2 = j3;
                    l4 = l3;
                    z3 = z6;
                    q24Var2 = q24Var3;
                    gdaVar2 = gdaVar3;
                    wjaVar = wjaVar3;
                    z8 = z7;
                }
            } else if (z8) {
                g24 g24VarC2 = c();
                long j5 = gdaVar.a;
                ji8Var.d = gdaVar;
                ji8Var.e = q24Var;
                ji8Var.f = l4;
                ji8Var.g = j3;
                ji8Var.h = z;
                ji8Var.i = z8;
                ji8Var.l = 2;
                Object objE2 = g24VarC2.e(q24Var, j5, ji8Var);
                if (objE2 != hu4Var) {
                    q24Var2 = q24Var;
                    l2 = l4;
                    obj = objE2;
                    z4 = z;
                    gdaVar2 = gdaVar;
                    z5 = z8;
                    uy3Var2 = (uy3) obj;
                    if (uy3Var2 == null) {
                        z5 = z5;
                        j2 = j3;
                        l4 = l2;
                        z3 = z4;
                        wjaVar = null;
                    } else {
                        z5 = z5;
                        j2 = j3;
                        l4 = l2;
                        z3 = z4;
                        wjaVar = null;
                    }
                    z8 = z5;
                }
            } else {
                j2 = j3;
                q24Var2 = q24Var;
                gdaVar2 = gdaVar;
                z3 = z;
                wjaVar = null;
            }
            dz3 dz3VarC = dnl.c(gdaVar2, (lja) this.d.getValue(), q24Var2, j2, z3, wjaVar);
            g24 g24VarC3 = c();
            long j6 = gdaVar2.a;
            Long lA = v7e.a(l4);
            ji8Var.d = null;
            ji8Var.e = null;
            ji8Var.f = null;
            ji8Var.g = j2;
            ji8Var.h = z3;
            ji8Var.i = z8;
            ji8Var.l = 3;
            objH = ch3.H(ji8Var, new f24(g24VarC3, q24Var2, j6, dz3VarC, lA, (lq4) null), g24VarC3.a);
            if (objH != hu4Var) {
                return objH;
            }
        } else if (i2 == 1) {
            boolean z9 = ji8Var.i;
            boolean z10 = ji8Var.h;
            long j7 = ji8Var.g;
            l3 = ji8Var.f;
            q24Var3 = ji8Var.e;
            gdaVar3 = ji8Var.d;
            ch3.d0(obj3);
            z7 = z9;
            obj2 = obj3;
            z6 = z10;
            j3 = j7;
            uy3Var = (uy3) obj2;
            if (uy3Var != null) {
                wjaVar2 = uy3Var.j;
            } else {
                wjaVar2 = null;
            }
            if (wjaVar2 == wjaVar4) {
                wjaVar3 = uy3Var.j;
            } else {
                wjaVar3 = null;
            }
            j2 = j3;
            l4 = l3;
            z3 = z6;
            q24Var2 = q24Var3;
            gdaVar2 = gdaVar3;
            wjaVar = wjaVar3;
            z8 = z7;
            dz3 dz3VarC2 = dnl.c(gdaVar2, (lja) this.d.getValue(), q24Var2, j2, z3, wjaVar);
            g24 g24VarC4 = c();
            long j8 = gdaVar2.a;
            Long lA2 = v7e.a(l4);
            ji8Var.d = null;
            ji8Var.e = null;
            ji8Var.f = null;
            ji8Var.g = j2;
            ji8Var.h = z3;
            ji8Var.i = z8;
            ji8Var.l = 3;
            objH = ch3.H(ji8Var, new f24(g24VarC4, q24Var2, j8, dz3VarC2, lA2, (lq4) null), g24VarC4.a);
            if (objH != hu4Var) {
                return objH;
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(obj3);
                    return obj3;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z11 = ji8Var.i;
            boolean z12 = ji8Var.h;
            long j9 = ji8Var.g;
            l2 = ji8Var.f;
            q24Var2 = ji8Var.e;
            gdaVar2 = ji8Var.d;
            ch3.d0(obj3);
            z5 = z11;
            obj = obj3;
            z4 = z12;
            j3 = j9;
            uy3Var2 = (uy3) obj;
            if (uy3Var2 == null && uy3Var2.k && uy3Var2.j == wjaVar4 && gdaVar2.e != xja.c) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        long j10 = uy3Var2.a;
                        long j11 = gdaVar2.a;
                        wja wjaVar5 = uy3Var2.j;
                        xja xjaVar = gdaVar2.e;
                        StringBuilder sbS = qt4.s(j10, "updateByServerId, checkStatus, message status in process:\n                            |localId:", "\n                            |serverId:");
                        sbS.append(j11);
                        sbS.append("\n                            |localMsgStatus:");
                        sbS.append(wjaVar5);
                        sbS.append("\n                            |serverMsgStatus:");
                        sbS.append(xjaVar);
                        sbS.append(" \n                            |");
                        a4cVar.c(je9Var, "CommentsRepository", s5h.y0(sbS.toString()), null);
                    }
                }
                wja wjaVar6 = uy3Var2.j;
                j2 = j3;
                l4 = l2;
                z3 = z4;
                wjaVar = wjaVar6;
            } else {
                z5 = z5;
                j2 = j3;
                l4 = l2;
                z3 = z4;
                wjaVar = null;
            }
            z8 = z5;
            dz3 dz3VarC3 = dnl.c(gdaVar2, (lja) this.d.getValue(), q24Var2, j2, z3, wjaVar);
            g24 g24VarC5 = c();
            long j12 = gdaVar2.a;
            Long lA3 = v7e.a(l4);
            ji8Var.d = null;
            ji8Var.e = null;
            ji8Var.f = null;
            ji8Var.g = j2;
            ji8Var.h = z3;
            ji8Var.i = z8;
            ji8Var.l = 3;
            objH = ch3.H(ji8Var, new f24(g24VarC5, q24Var2, j12, dz3VarC3, lA3, (lq4) null), g24VarC5.a);
            if (objH != hu4Var) {
                return objH;
            }
        }
        return hu4Var;
    }
}
