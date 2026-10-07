package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class okh {
    public final ny8 b;
    public final f2 a = new pfh(3);
    public final String c = okh.class.getName();
    public final p41 d = yab.a(1, 2, null);

    public okh(ny8 ny8Var) {
        this.b = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r1 == r4) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d2 -> B:13:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r18, defpackage.nq4 r19) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okh.a(java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) {
        ikh ikhVar;
        if (nq4Var instanceof ikh) {
            ikhVar = (ikh) nq4Var;
            int i = ikhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikhVar.f = i - Integer.MIN_VALUE;
            } else {
                ikhVar = new ikh(this, nq4Var);
            }
        } else {
            ikhVar = new ikh(this, nq4Var);
        }
        Object objI = ikhVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = ikhVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            gm0.x(this.c, "failProcessingTasks start", null);
            ate ateVarC = c();
            ikhVar.f = 1;
            objI = ch3.I(ikhVar, ateVarC.b().a, false, true, new nre(12));
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
        int iIntValue = ((Number) objI).intValue();
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(iIntValue, "failProcessingTasks finished by count "), null);
            }
        }
        return sbi.a;
    }

    public final ate c() {
        return (ate) this.b.getValue();
    }

    public final void d(long j) {
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "remove task "), null);
            }
        }
        ((Number) ch3.G(c().b().a, false, true, new uy6(j, 6))).intValue();
        this.d.c(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(ArrayList arrayList, nq4 nq4Var) {
        jkh jkhVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof jkh) {
            jkhVar = (jkh) nq4Var;
            int i = jkhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkhVar.f = i - Integer.MIN_VALUE;
            } else {
                jkhVar = new jkh(this, nq4Var);
            }
        } else {
            jkhVar = new jkh(this, nq4Var);
        }
        Object obj = jkhVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = jkhVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.h(arrayList.size(), "remove tasks "), null);
                }
            }
            if (!arrayList.isEmpty()) {
                ate ateVarC = c();
                jkhVar.f = 1;
                xkh xkhVarB = ateVarC.b();
                Object objH = ch3.H(jkhVar, new vy6(xkhVarB, arrayList, null, 5), xkhVarB.a);
                if (objH != hu4Var) {
                    objH = sbiVar;
                }
                if (objH != hu4Var) {
                    objH = sbiVar;
                }
                if (objH != hu4Var) {
                }
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
        p41 p41Var = this.d;
        Boolean bool = Boolean.TRUE;
        jkhVar.f = 2;
        return p41Var.a(jkhVar, bool) == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object f(ctc ctcVar, nq4 nq4Var) {
        kkh kkhVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof kkh) {
            kkhVar = (kkh) nq4Var;
            int i = kkhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkhVar.f = i - Integer.MIN_VALUE;
            } else {
                kkhVar = new kkh(this, nq4Var);
            }
        } else {
            kkhVar = new kkh(this, nq4Var);
        }
        Object obj = kkhVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = kkhVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "remove tasks by type = " + ctcVar, null);
                }
            }
            ate ateVarC = c();
            kkhVar.f = 1;
            xkh xkhVarB = ateVarC.b();
            Object objI = ch3.I(kkhVar, xkhVarB.a, false, true, new yre(xkhVarB, ctcVar));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
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
        p41 p41Var = this.d;
        Boolean bool = Boolean.TRUE;
        kkhVar.f = 2;
        return p41Var.a(kkhVar, bool) == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object g(long j, nq4 nq4Var, ctc ctcVar) {
        lkh lkhVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof lkh) {
            lkhVar = (lkh) nq4Var;
            int i = lkhVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lkhVar.g = i - Integer.MIN_VALUE;
            } else {
                lkhVar = new lkh(this, nq4Var);
            }
        } else {
            lkhVar = new lkh(this, nq4Var);
        }
        Object obj = lkhVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = lkhVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "remove tasks by type = " + ctcVar + ", threshold = " + j, null);
                }
            }
            ate ateVarC = c();
            lkhVar.d = j;
            lkhVar.g = 1;
            xkh xkhVarB = ateVarC.b();
            Object objI = ch3.I(lkhVar, xkhVarB.a, false, true, new vkh(xkhVarB, ctcVar, j));
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
        j = lkhVar.d;
        ch3.d0(obj);
        p41 p41Var = this.d;
        Boolean bool = Boolean.TRUE;
        lkhVar.d = j;
        lkhVar.g = 2;
        return p41Var.a(lkhVar, bool) == hu4Var ? hu4Var : sbiVar;
    }

    public final List h(long j, ctc ctcVar) {
        ate ateVarC = c();
        xkh xkhVarB = ateVarC.b();
        return ateVarC.d((List) ch3.G(xkhVarB.a, true, false, new vkh(j, xkhVarB, ctcVar)));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r12 == r6) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(long r10, defpackage.nq4 r12, defpackage.ctc r13) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.mkh
            if (r0 == 0) goto L13
            r0 = r12
            mkh r0 = (defpackage.mkh) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            mkh r0 = new mkh
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.h
            int r1 = r0.j
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            hu4 r6 = defpackage.hu4.a
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            long r10 = r0.d
            java.lang.Throwable r13 = r0.f
            defpackage.ch3.d0(r12)
            goto L8b
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r5
        L36:
            int r10 = r0.g
            long r7 = r0.d
            java.lang.Throwable r11 = r0.f
            lq4 r11 = (defpackage.lq4) r11
            ctc r13 = r0.e
            defpackage.ch3.d0(r12)     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> Laf
            return r12
        L44:
            r11 = move-exception
            r12 = r10
            r1 = r13
            r13 = r11
            r10 = r7
            goto L67
        L4a:
            defpackage.ch3.d0(r12)
            ate r12 = r9.c()     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> Laf
            r0.e = r13     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> Laf
            r0.f = r5     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> Laf
            r0.d = r10     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> Laf
            r0.g = r4     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> Laf
            r0.j = r3     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> Laf
            java.lang.Object r9 = r12.g(r10, r0)     // Catch: java.lang.Throwable -> L63 java.util.concurrent.CancellationException -> Laf
            if (r9 != r6) goto L62
            goto L8a
        L62:
            return r9
        L63:
            r12 = move-exception
            r1 = r13
            r13 = r12
            r12 = r4
        L67:
            if (r1 != 0) goto L8e
            ate r1 = r9.c()
            r0.e = r5
            r0.f = r13
            r0.d = r10
            r0.g = r12
            r0.j = r2
            xkh r12 = r1.b()
            rre r1 = r12.a
            aa2 r2 = new aa2
            r7 = 29
            r2.<init>(r10, r12, r7)
            java.lang.Object r12 = defpackage.ch3.I(r0, r1, r3, r4, r2)
            if (r12 != r6) goto L8b
        L8a:
            return r6
        L8b:
            r1 = r12
            ctc r1 = (defpackage.ctc) r1
        L8e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "selectTask: id="
            r12.<init>(r0)
            r12.append(r10)
            java.lang.String r10 = "; type="
            r12.append(r10)
            r12.append(r1)
            java.lang.String r10 = r12.toString()
            vdf r11 = new vdf
            r11.<init>(r10, r13)
            java.lang.String r9 = r9.c
            defpackage.gm0.V(r9, r10, r11)
            return r5
        Laf:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okh.i(long, nq4, ctc):java.lang.Object");
    }

    public final tjh j(long j, ctc ctcVar) {
        try {
            ate ateVarC = c();
            xkh xkhVarB = ateVarC.b();
            ujh ujhVar = (ujh) ch3.G(xkhVarB.a, true, false, new aa2(j, xkhVarB, 28));
            if (ujhVar != null) {
                return ateVarC.i(ujhVar);
            }
            return null;
        } catch (Exception e) {
            String str = "selectTask: id=" + j + "; type=" + ctcVar;
            gm0.V(this.c, str, new vdf(str, e));
            return null;
        }
    }

    public final List k(List list) {
        ate ateVarC = c();
        xkh xkhVarB = ateVarC.b();
        xkhVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        return ateVarC.d((List) ch3.G(xkhVarB.a, true, false, new tj1(9, xkhVarB, nbh.x(")", sb, list), list)));
    }

    public final Object l(nq4 nq4Var) {
        xkh xkhVarB = c().b();
        List listP0 = xw3.P0(rkh.WAITING, rkh.FAILED);
        xkhVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks WHERE status in (");
        return ch3.I(nq4Var, xkhVarB.a, true, false, new yn6(nbh.x(")", sb, listP0), listP0, xkhVarB, 6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object m(long j, lq4 lq4Var) {
        nkh nkhVar;
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof nkh) {
            nkhVar = (nkh) lq4Var;
            int i = nkhVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkhVar.g = i - Integer.MIN_VALUE;
            } else {
                nkhVar = new nkh(this, lq4Var);
            }
        } else {
            nkhVar = new nkh(this, lq4Var);
        }
        Object obj = nkhVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = nkhVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(j, "remove task "), null);
                }
            }
            ate ateVarC = c();
            nkhVar.d = j;
            nkhVar.g = 1;
            Object objI = ch3.I(nkhVar, ateVarC.b().a, false, true, new uy6(j, 7));
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
        j = nkhVar.d;
        ch3.d0(obj);
        p41 p41Var = this.d;
        Boolean bool = Boolean.TRUE;
        nkhVar.d = j;
        nkhVar.g = 2;
        return p41Var.a(nkhVar, bool) == hu4Var ? hu4Var : sbiVar;
    }

    public final sbi n(btc btcVar) {
        ch3.G(c().b().a, false, true, new wkh(2, btcVar.getId(), btcVar.g()));
        return sbi.a;
    }

    public final Object o(long j, rkh rkhVar, nq4 nq4Var) {
        xkh xkhVarB = c().b();
        Object objI = ch3.I(nq4Var, xkhVarB.a, false, true, new lh3(xkhVarB, rkhVar, j));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }
}
