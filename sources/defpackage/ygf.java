package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class ygf {
    public final gu4 a;
    public final String b = ygf.class.getName();
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;

    public ygf(gu4 gu4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = gu4Var;
        this.c = ny8Var4;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var5;
        this.h = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Serializable a(ygf ygfVar, long j, long j2, dja djaVar, nq4 nq4Var) {
        xgf xgfVar;
        ygfVar.getClass();
        if (nq4Var instanceof xgf) {
            xgfVar = (xgf) nq4Var;
            int i = xgfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgfVar.f = i - Integer.MIN_VALUE;
            } else {
                xgfVar = new xgf(ygfVar, nq4Var);
            }
        } else {
            xgfVar = new xgf(ygfVar, nq4Var);
        }
        xgf xgfVar2 = xgfVar;
        Object objG = xgfVar2.d;
        int i2 = xgfVar2.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objG);
            d4b d4bVar = new d4b(j, j2, djaVar, null);
            lhb lhbVar = kfc.c;
            onf onfVar = (onf) ygfVar.f.getValue();
            gce gceVar = new gce(ygfVar, lq4Var, 14);
            xgfVar2.f = 1;
            objG = qe7.G(d4bVar, gceVar, "MSG_REACTION", 0L, onfVar, xgfVar2, 144);
            hu4 hu4Var = hu4.a;
            if (objG == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objG);
        }
        e4b e4bVar = (e4b) objG;
        if (e4bVar != null) {
            return e4bVar.c;
        }
        ore.p("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Code duplicated, block: B:107:0x0244  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:123:0x02a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [s5e] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    public final Object b(long j, long j2, s5e s5eVar, ija ijaVar, nq4 nq4Var) {
        wgf wgfVar;
        s5e s5eVar2;
        long j3;
        s5e s5eVar3;
        ija ijaVar2;
        rt2 rt2Var;
        s5e s5eVar4;
        ija ijaVar3;
        sfa sfaVar;
        dja djaVar;
        long j4;
        dja djaVar2;
        long j5;
        int i;
        long j6;
        long j7;
        wgf wgfVar2;
        dja djaVar3;
        long j8;
        int i2;
        hja hjaVar;
        qja qjaVar;
        long j9;
        wgf wgfVar3;
        long j10;
        String str;
        a4c a4cVar;
        qja qjaVar2;
        int i3;
        ygf ygfVar = this;
        long j11 = j;
        long j12 = j2;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (!(nq4Var instanceof wgf) || (s5eVar2 = (i3 = (wgfVar = (wgf) nq4Var).m) & Integer.MIN_VALUE) == 0) {
            wgfVar = new wgf(ygfVar, nq4Var);
        } else {
            wgfVar.m = i3 - Integer.MIN_VALUE;
        }
        Object objI = wgfVar.k;
        hu4 hu4Var = hu4.a;
        ija ijaVar4 = wgfVar.m;
        try {
            try {
                switch (ijaVar4) {
                    case 0:
                        ch3.d0(objI);
                        String str2 = ygfVar.b;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            j3 = 0;
                        } else {
                            je9 je9Var2 = je9.d;
                            if (a4cVar2.b(je9Var2)) {
                                j3 = 0;
                                StringBuilder sbS = qt4.s(j11, "execute ", ":");
                                sbS.append(j12);
                                a4cVar2.c(je9Var2, str2, sbS.toString(), null);
                            } else {
                                j3 = 0;
                            }
                        }
                        if (j12 == j3) {
                            gm0.Y(ygfVar.b, "invalid message id!");
                            return sbiVar;
                        }
                        xn3 xn3Var = (xn3) ygfVar.h.getValue();
                        s5eVar3 = s5eVar;
                        wgfVar.f = s5eVar3;
                        ijaVar2 = ijaVar;
                        wgfVar.g = ijaVar2;
                        wgfVar.d = j11;
                        wgfVar.e = j12;
                        wgfVar.m = 1;
                        objI = xn3Var.i(j11, wgfVar);
                        if (objI != hu4Var) {
                            rt2Var = (rt2) objI;
                            if (rt2Var != null || ((rt2Var.b.a == j3 && !((xn3) ygfVar.h.getValue()).j().V(rt2Var)) || !(rt2Var.W() || rt2Var.o0()))) {
                                gm0.Y(ygfVar.b, "execute skipped: chat is null or not synced with server or hidden or not active");
                                return sbiVar;
                            }
                            sua suaVar = (sua) ygfVar.g.getValue();
                            wgfVar.f = s5eVar3;
                            wgfVar.g = ijaVar2;
                            wgfVar.d = j11;
                            wgfVar.e = j12;
                            wgfVar.m = 2;
                            objI = suaVar.b(j12, wgfVar);
                            if (objI != hu4Var) {
                                long j13 = j12;
                                j12 = j11;
                                j11 = j13;
                                ija ijaVar5 = ijaVar2;
                                s5eVar4 = s5eVar3;
                                ijaVar3 = ijaVar5;
                                sfaVar = (sfa) objI;
                                if (sfaVar != null || sfaVar.j == wja.DELETED) {
                                    gm0.Y(ygfVar.b, "execute skipped: message or chat not found");
                                    return sbiVar;
                                }
                                ((lja) ygfVar.d.getValue()).getClass();
                                a6e a6eVarD = xml.d(ijaVar3.a());
                                qja qjaVar3 = (qja) ygfVar.c.getValue();
                                z5e z5eVar = new z5e(a6eVarD, s5eVar4);
                                wgfVar.f = s5eVar4;
                                wgfVar.g = ijaVar3;
                                wgfVar.h = null;
                                wgfVar.d = j12;
                                wgfVar.e = j11;
                                wgfVar.m = 3;
                                if (qjaVar3.B(sfaVar, z5eVar, wgfVar) != hu4Var) {
                                    s5eVar2 = s5eVar4;
                                    djaVar = new dja(ijaVar3, s5eVar2.a.toString());
                                    ijaVar4 = 0;
                                    try {
                                        wgfVar.f = null;
                                        wgfVar.g = null;
                                        wgfVar.h = djaVar;
                                        wgfVar.d = j12;
                                        wgfVar.e = j11;
                                        wgfVar.i = 0;
                                        wgfVar.j = 0;
                                        wgfVar.m = 5;
                                        j6 = j11;
                                        j7 = j12;
                                        wgfVar2 = wgfVar;
                                        try {
                                            objI = a(ygfVar, j7, j6, djaVar, wgfVar2);
                                            ygfVar = ygfVar;
                                            j4 = j7;
                                            wgfVar = wgfVar2;
                                            if (objI != hu4Var) {
                                                djaVar3 = djaVar;
                                                i = 0;
                                                j8 = j6;
                                                i2 = 0;
                                                try {
                                                    hjaVar = (hja) objI;
                                                    try {
                                                        qjaVar = (qja) ygfVar.c.getValue();
                                                        wgfVar.f = null;
                                                        wgfVar.g = null;
                                                        wgfVar.h = djaVar3;
                                                        wgfVar.d = j4;
                                                        wgfVar.e = j8;
                                                        wgfVar.i = i;
                                                        wgfVar.j = i2;
                                                        wgfVar.m = 6;
                                                        j9 = j8;
                                                        wgfVar3 = wgfVar;
                                                        j10 = j4;
                                                        try {
                                                            if (qjaVar.D(j10, j9, hjaVar, wgfVar3) != hu4Var) {
                                                                return sbiVar;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            j4 = j10;
                                                            j5 = j9;
                                                            wgfVar = wgfVar3;
                                                            djaVar2 = djaVar3;
                                                            str = ygfVar.b;
                                                            a4cVar = gm0.f;
                                                            if (a4cVar != null) {
                                                                StringBuilder sbS2 = qt4.s(j4, "fail to add reaction for chat ", " messageId=");
                                                                sbS2.append(j5);
                                                                a4cVar.c(je9Var, str, sbS2.toString(), th);
                                                            }
                                                            if (th instanceof TamErrorException) {
                                                                qjaVar2 = (qja) ygfVar.c.getValue();
                                                                wgfVar.f = null;
                                                                wgfVar.g = null;
                                                                wgfVar.h = null;
                                                                wgfVar.d = j4;
                                                                wgfVar.e = j5;
                                                                wgfVar.i = i;
                                                                wgfVar.j = 0;
                                                                wgfVar.m = 7;
                                                                if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                                                    s5eVar2 = s5eVar4;
                                                                    return hu4Var;
                                                                }
                                                            } else {
                                                                qjaVar2 = (qja) ygfVar.c.getValue();
                                                                wgfVar.f = null;
                                                                wgfVar.g = null;
                                                                wgfVar.h = null;
                                                                wgfVar.d = j4;
                                                                wgfVar.e = j5;
                                                                wgfVar.i = i;
                                                                wgfVar.j = 0;
                                                                wgfVar.m = 7;
                                                                if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                                                    s5eVar2 = s5eVar4;
                                                                    return hu4Var;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        j5 = j8;
                                                        djaVar2 = djaVar3;
                                                        str = ygfVar.b;
                                                        a4cVar = gm0.f;
                                                        if (a4cVar != null) {
                                                            StringBuilder sbS3 = qt4.s(j4, "fail to add reaction for chat ", " messageId=");
                                                            sbS3.append(j5);
                                                            a4cVar.c(je9Var, str, sbS3.toString(), th);
                                                        }
                                                        if (th instanceof TamErrorException) {
                                                            qjaVar2 = (qja) ygfVar.c.getValue();
                                                            wgfVar.f = null;
                                                            wgfVar.g = null;
                                                            wgfVar.h = null;
                                                            wgfVar.d = j4;
                                                            wgfVar.e = j5;
                                                            wgfVar.i = i;
                                                            wgfVar.j = 0;
                                                            wgfVar.m = 7;
                                                            if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                                                s5eVar2 = s5eVar4;
                                                                return hu4Var;
                                                            }
                                                        } else {
                                                            qjaVar2 = (qja) ygfVar.c.getValue();
                                                            wgfVar.f = null;
                                                            wgfVar.g = null;
                                                            wgfVar.h = null;
                                                            wgfVar.d = j4;
                                                            wgfVar.e = j5;
                                                            wgfVar.i = i;
                                                            wgfVar.j = 0;
                                                            wgfVar.m = 7;
                                                            if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                                                s5eVar2 = s5eVar4;
                                                                return hu4Var;
                                                            }
                                                        }
                                                        return sbiVar;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            ygfVar = ygfVar;
                                            j4 = j7;
                                            j5 = j6;
                                            djaVar2 = djaVar;
                                            wgfVar = wgfVar2;
                                            i = 0;
                                            str = ygfVar.b;
                                            a4cVar = gm0.f;
                                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                                StringBuilder sbS4 = qt4.s(j4, "fail to add reaction for chat ", " messageId=");
                                                sbS4.append(j5);
                                                a4cVar.c(je9Var, str, sbS4.toString(), th);
                                            }
                                            if ((th instanceof TamErrorException) || !cqk.d(th.a.b, "client.task.ignored")) {
                                                qjaVar2 = (qja) ygfVar.c.getValue();
                                                wgfVar.f = null;
                                                wgfVar.g = null;
                                                wgfVar.h = null;
                                                wgfVar.d = j4;
                                                wgfVar.e = j5;
                                                wgfVar.i = i;
                                                wgfVar.j = 0;
                                                wgfVar.m = 7;
                                                if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                                    s5eVar2 = s5eVar4;
                                                    return hu4Var;
                                                }
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        j4 = j12;
                                        djaVar2 = djaVar;
                                        j5 = j11;
                                    }
                                }
                            }
                        }
                        s5eVar2 = s5eVar4;
                        return hu4Var;
                    case 1:
                        long j14 = wgfVar.e;
                        long j15 = wgfVar.d;
                        ija ijaVar6 = wgfVar.g;
                        s5e s5eVar5 = wgfVar.f;
                        ch3.d0(objI);
                        j12 = j14;
                        j11 = j15;
                        ijaVar2 = ijaVar6;
                        s5eVar3 = s5eVar5;
                        j3 = 0;
                        rt2Var = (rt2) objI;
                        if (rt2Var != null) {
                            break;
                        }
                        gm0.Y(ygfVar.b, "execute skipped: chat is null or not synced with server or hidden or not active");
                        return sbiVar;
                    case 2:
                        j11 = wgfVar.e;
                        j12 = wgfVar.d;
                        ijaVar3 = wgfVar.g;
                        s5e s5eVar6 = wgfVar.f;
                        ch3.d0(objI);
                        s5eVar4 = s5eVar6;
                        sfaVar = (sfa) objI;
                        if (sfaVar != null) {
                            break;
                        }
                        gm0.Y(ygfVar.b, "execute skipped: message or chat not found");
                        return sbiVar;
                    case 3:
                        j11 = wgfVar.e;
                        j12 = wgfVar.d;
                        ijaVar3 = wgfVar.g;
                        s5e s5eVar7 = wgfVar.f;
                        ch3.d0(objI);
                        s5eVar2 = s5eVar7;
                        s5eVar2 = s5eVar4;
                        djaVar = new dja(ijaVar3, s5eVar2.a.toString());
                        ijaVar4 = 0;
                        wgfVar.f = null;
                        wgfVar.g = null;
                        wgfVar.h = djaVar;
                        wgfVar.d = j12;
                        wgfVar.e = j11;
                        wgfVar.i = 0;
                        wgfVar.j = 0;
                        wgfVar.m = 5;
                        j6 = j11;
                        j7 = j12;
                        wgfVar2 = wgfVar;
                        objI = a(ygfVar, j7, j6, djaVar, wgfVar2);
                        ygfVar = ygfVar;
                        j4 = j7;
                        wgfVar = wgfVar2;
                        if (objI != hu4Var) {
                            djaVar3 = djaVar;
                            i = 0;
                            j8 = j6;
                            i2 = 0;
                            hjaVar = (hja) objI;
                            qjaVar = (qja) ygfVar.c.getValue();
                            wgfVar.f = null;
                            wgfVar.g = null;
                            wgfVar.h = djaVar3;
                            wgfVar.d = j4;
                            wgfVar.e = j8;
                            wgfVar.i = i;
                            wgfVar.j = i2;
                            wgfVar.m = 6;
                            j9 = j8;
                            wgfVar3 = wgfVar;
                            j10 = j4;
                            if (qjaVar.D(j10, j9, hjaVar, wgfVar3) != hu4Var) {
                                return sbiVar;
                            }
                        }
                        s5eVar2 = s5eVar4;
                        return hu4Var;
                    case 4:
                        ch3.d0(objI);
                        return sbiVar;
                    case 5:
                        int i4 = wgfVar.j;
                        int i5 = wgfVar.i;
                        j8 = wgfVar.e;
                        j4 = wgfVar.d;
                        djaVar3 = wgfVar.h;
                        try {
                            ch3.d0(objI);
                            i2 = i4;
                            i = i5;
                            hjaVar = (hja) objI;
                            qjaVar = (qja) ygfVar.c.getValue();
                            wgfVar.f = null;
                            wgfVar.g = null;
                            wgfVar.h = djaVar3;
                            wgfVar.d = j4;
                            wgfVar.e = j8;
                            wgfVar.i = i;
                            wgfVar.j = i2;
                            wgfVar.m = 6;
                            j9 = j8;
                            wgfVar3 = wgfVar;
                            j10 = j4;
                            if (qjaVar.D(j10, j9, hjaVar, wgfVar3) != hu4Var) {
                                return sbiVar;
                            }
                            s5eVar2 = s5eVar4;
                            return hu4Var;
                        } catch (Throwable th6) {
                            th = th6;
                            i = i5;
                            j5 = j8;
                            djaVar2 = djaVar3;
                            str = ygfVar.b;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                StringBuilder sbS5 = qt4.s(j4, "fail to add reaction for chat ", " messageId=");
                                sbS5.append(j5);
                                a4cVar.c(je9Var, str, sbS5.toString(), th);
                            }
                            if (th instanceof TamErrorException) {
                                qjaVar2 = (qja) ygfVar.c.getValue();
                                wgfVar.f = null;
                                wgfVar.g = null;
                                wgfVar.h = null;
                                wgfVar.d = j4;
                                wgfVar.e = j5;
                                wgfVar.i = i;
                                wgfVar.j = 0;
                                wgfVar.m = 7;
                                if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                    s5eVar2 = s5eVar4;
                                    return hu4Var;
                                }
                            } else {
                                qjaVar2 = (qja) ygfVar.c.getValue();
                                wgfVar.f = null;
                                wgfVar.g = null;
                                wgfVar.h = null;
                                wgfVar.d = j4;
                                wgfVar.e = j5;
                                wgfVar.i = i;
                                wgfVar.j = 0;
                                wgfVar.m = 7;
                                if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                    s5eVar2 = s5eVar4;
                                    return hu4Var;
                                }
                            }
                            return sbiVar;
                        }
                    case 6:
                        i = wgfVar.i;
                        j5 = wgfVar.e;
                        j4 = wgfVar.d;
                        djaVar2 = wgfVar.h;
                        try {
                            ch3.d0(objI);
                            return sbiVar;
                        } catch (Throwable th7) {
                            th = th7;
                            str = ygfVar.b;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                StringBuilder sbS6 = qt4.s(j4, "fail to add reaction for chat ", " messageId=");
                                sbS6.append(j5);
                                a4cVar.c(je9Var, str, sbS6.toString(), th);
                            }
                            if (th instanceof TamErrorException) {
                                qjaVar2 = (qja) ygfVar.c.getValue();
                                wgfVar.f = null;
                                wgfVar.g = null;
                                wgfVar.h = null;
                                wgfVar.d = j4;
                                wgfVar.e = j5;
                                wgfVar.i = i;
                                wgfVar.j = 0;
                                wgfVar.m = 7;
                                if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                    s5eVar2 = s5eVar4;
                                    return hu4Var;
                                }
                            } else {
                                qjaVar2 = (qja) ygfVar.c.getValue();
                                wgfVar.f = null;
                                wgfVar.g = null;
                                wgfVar.h = null;
                                wgfVar.d = j4;
                                wgfVar.e = j5;
                                wgfVar.i = i;
                                wgfVar.j = 0;
                                wgfVar.m = 7;
                                if (qjaVar2.p(j5, djaVar2, wgfVar) == hu4Var) {
                                    s5eVar2 = s5eVar4;
                                    return hu4Var;
                                }
                            }
                            return sbiVar;
                        }
                    case 7:
                        ch3.d0(objI);
                        return sbiVar;
                    default:
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                String str3 = ygfVar.b;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, zo5.j(j11, "updateMessageBySelfReaction fail "), e2);
                }
                qja qjaVar4 = (qja) ygfVar.c.getValue();
                dja djaVar4 = new dja(ijaVar4, s5eVar2.a.toString());
                wgfVar.f = null;
                wgfVar.g = null;
                wgfVar.h = null;
                wgfVar.d = j12;
                wgfVar.e = j11;
                wgfVar.m = 4;
                if (qjaVar4.p(j11, djaVar4, wgfVar) == hu4Var) {
                    s5eVar2 = s5eVar4;
                    return hu4Var;
                }
            }
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
