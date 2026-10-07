package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ez2 extends aq implements qih {
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;
    public final int k;
    public final int l;
    public final long m;
    public final boolean n;
    public final mg5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez2(long j, long j2, long j3, long j4, long j5, boolean z, long j6, mg5 mg5Var, int i) {
        super(j);
        int i2 = (i & np0.m) != 0 ? 0 : 40;
        long j7 = (i & 1024) != 0 ? 0L : j6;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = z;
        this.k = i2;
        this.l = 40;
        this.m = j7;
        this.n = true;
        this.o = mg5Var;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.qih
    public final Object i(yhh yhhVar, nq4 nq4Var) {
        cz2 cz2Var;
        vg4 vg4VarW;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof cz2) {
            cz2Var = (cz2) nq4Var;
            int i = cz2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cz2Var.g = i - Integer.MIN_VALUE;
            } else {
                cz2Var = new cz2(this, nq4Var);
            }
        } else {
            cz2Var = new cz2(this, nq4Var);
        }
        Object obj = cz2Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = cz2Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            if (!this.j) {
                String name = ez2.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "ignored noninteractive request " + yhhVar, null);
                    }
                }
                if (this.i != 0) {
                    v().d(this.i);
                    return sbiVar;
                }
            } else if ("client.task.ignored".equals(yhhVar.b)) {
                if (this.i != 0) {
                    v().d(this.i);
                    return sbiVar;
                }
            } else if ("not.found".equals(yhhVar.b)) {
                rt2 rt2VarN = p().N(this.f);
                if (rt2VarN != null && rt2VarN.h0() && (vg4VarW = rt2VarN.w()) != null) {
                    bq bqVar = this.e;
                    if (bqVar == null) {
                        bqVar = null;
                    }
                    an9 an9Var = (an9) bqVar.m0.getValue();
                    long jV = vg4VarW.v();
                    cz2Var.d = yhhVar;
                    cz2Var.g = 1;
                    if (an9Var.a(jV, cz2Var) != hu4Var) {
                    }
                    return hu4Var;
                }
            } else {
                o().c(new yq0(this.a, yhhVar));
            }
            return sbiVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i2 == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yhhVar = cz2Var.d;
        ch3.d0(obj);
        if (this.i != 0) {
            if (yhhVar instanceof thh) {
                okh okhVarV = v();
                long j = this.i;
                rkh rkhVar = rkh.WAITING;
                cz2Var.d = null;
                cz2Var.g = 2;
                if (okhVarV.o(j, rkhVar, cz2Var) == hu4Var) {
                    return hu4Var;
                }
            } else {
                okh okhVarV2 = v();
                long j2 = this.i;
                cz2Var.d = null;
                cz2Var.g = 3;
                if (okhVarV2.m(j2, cz2Var) == hu4Var) {
                    return hu4Var;
                }
            }
        }
        return sbiVar;
    }

    @Override // defpackage.aq
    public final Object m() {
        int i = np0.q;
        return new wy2(this.g, this.h, this.k, 0L, this.l, this.m, this.n, this.j, this.o, (String) null, (Long) null, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(nq4 nq4Var) {
        bz2 bz2Var;
        if (nq4Var instanceof bz2) {
            bz2Var = (bz2) nq4Var;
            int i = bz2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bz2Var.f = i - Integer.MIN_VALUE;
            } else {
                bz2Var = new bz2(this, nq4Var);
            }
        } else {
            bz2Var = new bz2(this, nq4Var);
        }
        Object objI = bz2Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = bz2Var.f;
        if (i2 == 0) {
            ch3.d0(objI);
            if (this.i != 0) {
                okh okhVarV = v();
                long j = this.i;
                bz2Var.f = 1;
                objI = okhVarV.i(j, bz2Var, null);
                if (objI == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objI);
        tjh tjhVar = (tjh) objI;
        if (tjhVar != null) {
            String name = ez2.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.j(tjhVar.f.getId(), "checkAttachedSyncTask: run ServiceTaskSyncChatHistory "), null);
                }
            }
            bq bqVar = this.e;
            ((wzj) (bqVar != null ? bqVar : null).g.getValue()).c((ulf) tjhVar.f);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r11.k(r10, r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (w(r0) == r1) goto L41;
     */
    @Override // defpackage.qih
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.fz2 r10, defpackage.nq4 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dz2
            if (r0 == 0) goto L13
            r0 = r11
            dz2 r0 = (defpackage.dz2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            dz2 r0 = new dz2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.e
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.g
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 2
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 == r6) goto L35
            if (r2 != r3) goto L2f
            defpackage.ch3.d0(r11)
            goto L9f
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r5
        L35:
            defpackage.ch3.d0(r11)
            goto L94
        L39:
            fz2 r10 = r0.d
            defpackage.ch3.d0(r11)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            goto L73
        L3f:
            r11 = move-exception
            goto L5b
        L41:
            defpackage.ch3.d0(r11)
            a0b r11 = r9.s()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            ghb r2 = defpackage.ew5.b     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            lw5 r2 = defpackage.lw5.SECONDS     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            long r7 = defpackage.qe7.O(r6, r2)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            r0.d = r10     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            r0.g = r4     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            java.lang.Object r11 = r11.k(r10, r7, r0)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            if (r11 != r1) goto L73
            goto L9e
        L5b:
            java.lang.Class<ez2> r2 = defpackage.ez2.class
            java.lang.String r2 = r2.getName()
            a4c r4 = defpackage.gm0.f
            if (r4 != 0) goto L66
            goto L73
        L66:
            je9 r7 = defpackage.je9.f
            boolean r8 = r4.b(r7)
            if (r8 == 0) goto L73
            java.lang.String r8 = "fail to get missed contacts for chat history"
            r4.c(r7, r2, r8, r11)
        L73:
            bq r11 = r9.e
            if (r11 == 0) goto L78
            goto L79
        L78:
            r11 = r5
        L79:
            xhh r11 = r11.h()
            n0c r11 = (defpackage.n0c) r11
            xt4 r11 = r11.b()
            za2 r2 = new za2
            r4 = 5
            r2.<init>(r9, r4, r10)
            r0.d = r5
            r0.g = r6
            java.lang.Object r10 = defpackage.qyj.V(r11, r2, r0)
            if (r10 != r1) goto L94
            goto L9e
        L94:
            r0.d = r5
            r0.g = r3
            java.lang.Object r9 = r9.w(r0)
            if (r9 != r1) goto L9f
        L9e:
            return r1
        L9f:
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez2.k(fz2, nq4):java.lang.Object");
    }
}
