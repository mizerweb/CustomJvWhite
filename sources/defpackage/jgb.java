package defpackage;

import java.util.concurrent.CancellationException;
import ru.ok.tamtam.services.ServiceTaskProcessException;

/* JADX INFO: loaded from: classes3.dex */
public final class jgb implements wzj {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final String e = jgb.class.getName();
    public volatile p3c f;

    public jgb(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0171  */
    /* JADX WARN: Code duplicated, block: B:86:0x0175  */
    /* JADX WARN: Code duplicated, block: B:90:0x0182 A[Catch: all -> 0x0047, CancellationException -> 0x01e7, TryCatch #3 {CancellationException -> 0x01e7, all -> 0x0047, blocks: (B:18:0x0042, B:88:0x0179, B:90:0x0182, B:93:0x0191), top: B:120:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0190  */
    /* JADX WARN: Code duplicated, block: B:93:0x0191 A[Catch: all -> 0x0047, CancellationException -> 0x01e7, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x01e7, all -> 0x0047, blocks: (B:18:0x0042, B:88:0x0179, B:90:0x0182, B:93:0x0191), top: B:120:0x0035 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.StringBuilder] */
    public static final Object e(jgb jgbVar, mjf mjfVar, nq4 nq4Var) {
        ggb ggbVar;
        String string;
        mjf mjfVar2;
        mjf mjfVar3;
        tjh tjhVar;
        btc btcVar;
        int iL;
        mjf mjfVar4 = mjfVar;
        hu4 hu4Var = hu4.a;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        je9 je9Var2 = je9.d;
        if (nq4Var instanceof ggb) {
            ggbVar = (ggb) nq4Var;
            int i = ggbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ggbVar.g = i - Integer.MIN_VALUE;
            } else {
                ggbVar = new ggb(jgbVar, nq4Var);
            }
        } else {
            ggbVar = new ggb(jgbVar, nq4Var);
        }
        Object objI = ggbVar.e;
        int i2 = ggbVar.g;
        try {
            if (i2 != 0) {
                ?? r2 = 1;
                try {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            mjf mjfVar5 = ggbVar.d;
                            ch3.d0(objI);
                            mjfVar2 = mjfVar5;
                            if (mjfVar2 instanceof btc) {
                                okh okhVar = (okh) jgbVar.b.getValue();
                                long id = ((btc) mjfVar2).getId();
                                ggbVar.d = mjfVar2;
                                ggbVar.g = 3;
                                Object objA = okhVar.c().a(id, ggbVar);
                                if (objA != hu4Var) {
                                    objA = sbiVar;
                                }
                                if (objA == hu4Var) {
                                    return hu4Var;
                                }
                                okh okhVar2 = (okh) jgbVar.b.getValue();
                                btc btcVar2 = (btc) mjfVar2;
                                long id2 = btcVar2.getId();
                                ctc type = btcVar2.getType();
                                ggbVar.d = mjfVar2;
                                ggbVar.g = 4;
                                objI = okhVar2.i(id2, ggbVar, type);
                                mjfVar3 = mjfVar2;
                                if (objI == hu4Var) {
                                    return hu4Var;
                                }
                                tjhVar = (tjh) objI;
                                btcVar = (btc) mjfVar3;
                                if (btcVar.e()) {
                                    iL = btcVar.l();
                                } else {
                                    iL = 10;
                                }
                                if (tjhVar != null) {
                                    if (((btc) mjfVar3).a()) {
                                        ggbVar.d = mjfVar3;
                                        ggbVar.g = 5;
                                        if (((btc) mjfVar3).h(ggbVar) == hu4Var) {
                                            r2 = mjfVar3;
                                            return hu4Var;
                                        }
                                    } else {
                                        ((btc) mjfVar3).d();
                                        r2 = mjfVar3;
                                    }
                                }
                            }
                            return sbiVar;
                        }
                        if (i2 == 3) {
                            mjfVar2 = ggbVar.d;
                            ch3.d0(objI);
                            okh okhVar3 = (okh) jgbVar.b.getValue();
                            btc btcVar3 = (btc) mjfVar2;
                            long id3 = btcVar3.getId();
                            ctc type2 = btcVar3.getType();
                            ggbVar.d = mjfVar2;
                            ggbVar.g = 4;
                            objI = okhVar3.i(id3, ggbVar, type2);
                            mjfVar3 = mjfVar2;
                            if (objI == hu4Var) {
                                return hu4Var;
                            }
                            tjhVar = (tjh) objI;
                            btcVar = (btc) mjfVar3;
                            if (btcVar.e()) {
                                iL = btcVar.l();
                            } else {
                                iL = 10;
                            }
                            if (tjhVar != null) {
                                if (((btc) mjfVar3).a()) {
                                    ggbVar.d = mjfVar3;
                                    ggbVar.g = 5;
                                    if (((btc) mjfVar3).h(ggbVar) == hu4Var) {
                                        r2 = mjfVar3;
                                        return hu4Var;
                                    }
                                } else {
                                    ((btc) mjfVar3).d();
                                    r2 = mjfVar3;
                                }
                            }
                            return sbiVar;
                        }
                        if (i2 == 4) {
                            mjf mjfVar6 = ggbVar.d;
                            ch3.d0(objI);
                            mjfVar3 = mjfVar6;
                            tjhVar = (tjh) objI;
                            btcVar = (btc) mjfVar3;
                            if (btcVar.e()) {
                                iL = btcVar.l();
                            } else {
                                iL = 10;
                            }
                            if (tjhVar != null && tjhVar.c >= iL) {
                                if (((btc) mjfVar3).a()) {
                                    ggbVar.d = mjfVar3;
                                    ggbVar.g = 5;
                                    if (((btc) mjfVar3).h(ggbVar) == hu4Var) {
                                        r2 = mjfVar3;
                                        return hu4Var;
                                    }
                                } else {
                                    ((btc) mjfVar3).d();
                                    r2 = mjfVar3;
                                }
                            }
                            return sbiVar;
                        }
                        if (i2 != 5) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mjf mjfVar7 = ggbVar.d;
                        ch3.d0(objI);
                        r2 = mjfVar7;
                        r2 = mjfVar3;
                        ((okh) jgbVar.b.getValue()).d(((btc) r2).getId());
                        String str = jgbVar.e;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var2)) {
                            a4cVar.c(je9Var2, str, "remove task because it cause too many exceptions: " + r2, null);
                        }
                        return sbiVar;
                    }
                    mjf mjfVar8 = ggbVar.d;
                    ch3.d0(objI);
                    mjfVar4 = mjfVar8;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    String str2 = jgbVar.e;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "fail to execute onMaxFailCount " + r2, th);
                    }
                }
            } else {
                ch3.d0(objI);
                String str3 = jgbVar.e;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str3, "set beans for task " + mjfVar4, null);
                }
                mjfVar4.a = (njf) jgbVar.d.getValue();
                String str4 = jgbVar.e;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, str4, "start processing task " + mjfVar4, null);
                }
                mjfVar4.B();
                mjfVar4 = mjfVar4;
            }
            String str5 = jgbVar.e;
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                a4cVar5.c(je9Var2, str5, "finish processing task " + mjfVar4, null);
            }
        } catch (CancellationException e2) {
            String str6 = jgbVar.e;
            a4c a4cVar6 = gm0.f;
            if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                a4cVar6.c(je9Var, str6, "cancelled task " + mjfVar4, null);
            }
            throw e2;
        } catch (Exception e3) {
            String str7 = jgbVar.e;
            btc btcVar4 = mjfVar4 instanceof btc ? (btc) mjfVar4 : null;
            if (btcVar4 == null || (string = btcVar4.getType().toString()) == null) {
                string = mjfVar4.toString();
            }
            ServiceTaskProcessException serviceTaskProcessException = new ServiceTaskProcessException(string, e3);
            a4c a4cVar7 = gm0.f;
            if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                a4cVar7.c(je9Var, str7, "fail to process task " + mjfVar4, serviceTaskProcessException);
            }
            mjfVar4.getClass();
            mjfVar4.A();
            mjfVar2 = mjfVar4;
        }
        return sbiVar;
    }

    @Override // defpackage.wzj
    public final void a(p3c p3cVar) {
        this.f = p3cVar;
    }

    @Override // defpackage.wzj
    public final void b() {
        p3c p3cVar = this.f;
        if (p3cVar != null) {
            p3cVar.r();
        }
    }

    @Override // defpackage.wzj
    public final void c(mjf mjfVar) {
        xt4 xt4VarB;
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "execute task " + mjfVar + "|" + mjfVar.getClass().getName(), null);
            }
        }
        if (mjfVar.y()) {
            xt4VarB = mjfVar.n((njf) this.d.getValue());
            if (xt4VarB == null) {
                String str2 = "dispatcher for " + mjfVar + " is null";
                gm0.r(this.e, str2, new IllegalStateException(str2));
            }
        } else {
            xt4VarB = null;
        }
        if (xt4VarB == null) {
            xt4VarB = ((n0c) ((xhh) this.c.getValue())).b();
        }
        yab.i0((gu4) this.a.getValue(), xt4VarB, 0, new igb(this, mjfVar, null, 0), 2);
    }

    @Override // defpackage.wzj
    public final void d(mjf mjfVar) {
        yab.i0((gu4) this.a.getValue(), null, 0, new igb(this, mjfVar, null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, mjf] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [mjf] */
    public final Object f(mjf mjfVar, nq4 nq4Var) {
        hgb hgbVar;
        if (nq4Var instanceof hgb) {
            hgbVar = (hgb) nq4Var;
            int i = hgbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hgbVar.g = i - Integer.MIN_VALUE;
            } else {
                hgbVar = new hgb(this, nq4Var);
            }
        } else {
            hgbVar = new hgb(this, nq4Var);
        }
        hgb hgbVar2 = hgbVar;
        Object obj = hgbVar2.e;
        hu4 hu4Var = hu4.a;
        int i2 = hgbVar2.g;
        if (i2 == 0) {
            ch3.d0(obj);
            if (mjfVar == 0) {
                c.p(mjfVar, " must be instance of PersistableTask", "task ");
                return null;
            }
            okh okhVar = (okh) this.b.getValue();
            btc btcVar = (btc) mjfVar;
            hgbVar2.d = mjfVar;
            hgbVar2.g = 1;
            String str = okhVar.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "save task = " + btcVar, null);
                }
            }
            Object objC = okhVar.c().c(btcVar, 0L, 0, hgbVar2);
            if (objC != hu4Var) {
                objC = sbi.a;
            }
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mjfVar = hgbVar2.d;
            ch3.d0(obj);
        }
        b();
        return new Long(((btc) mjfVar).getId());
    }
}
