package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class uj2 {
    public final String a = uj2.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public uj2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.b = ny8Var3;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var4;
        this.f = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Serializable a(uj2 uj2Var, long j, long j2, nq4 nq4Var) {
        tj2 tj2Var;
        uj2Var.getClass();
        if (nq4Var instanceof tj2) {
            tj2Var = (tj2) nq4Var;
            int i = tj2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj2Var.f = i - Integer.MIN_VALUE;
            } else {
                tj2Var = new tj2(uj2Var, nq4Var);
            }
        } else {
            tj2Var = new tj2(uj2Var, nq4Var);
        }
        tj2 tj2Var2 = tj2Var;
        Object objG = tj2Var2.d;
        int i2 = tj2Var2.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objG);
            d3b d3bVar = new d3b(j, j2, null);
            lhb lhbVar = kfc.c;
            onf onfVar = (onf) uj2Var.d.getValue();
            qt1 qt1Var = new qt1(uj2Var, lq4Var, 18);
            tj2Var2.f = 1;
            objG = qe7.G(d3bVar, qt1Var, "MSG_CANCEL_REACTION", 0L, onfVar, tj2Var2, 144);
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
        e3b e3bVar = (e3b) objG;
        if (e3bVar != null) {
            return e3bVar.c;
        }
        ore.p("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0236 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x0237 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x016c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v8, types: [z5e] */
    public final Object b(long j, long j2, z5e z5eVar, nq4 nq4Var) {
        sj2 sj2Var;
        z5e z5eVar2;
        rt2 rt2Var;
        z5e z5eVar3;
        sfa sfaVar;
        long j3;
        long j4;
        z5e z5eVar4;
        int i;
        long j5;
        long j6;
        z5e z5eVar5;
        int i2;
        long j7;
        long j8;
        int i3;
        boolean z;
        hja hjaVar;
        qja qjaVar;
        z5e z5eVar6;
        String str;
        a4c a4cVar;
        qja qjaVar2;
        uj2 uj2Var = this;
        long j9 = j;
        long j10 = j2;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof sj2) {
            sj2Var = (sj2) nq4Var;
            int i4 = sj2Var.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sj2Var.k = i4 - Integer.MIN_VALUE;
            } else {
                sj2Var = new sj2(uj2Var, nq4Var);
            }
        } else {
            sj2Var = new sj2(uj2Var, nq4Var);
        }
        sj2 sj2Var2 = sj2Var;
        Object objI = sj2Var2.i;
        Object obj = hu4.a;
        z5e z5eVar7 = sj2Var2.k;
        try {
            try {
                switch (z5eVar7) {
                    case 0:
                        ch3.d0(objI);
                        String str2 = uj2Var.a;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.d;
                            if (a4cVar2.b(je9Var2)) {
                                StringBuilder sbS = qt4.s(j9, "execute ", ":");
                                sbS.append(j10);
                                a4cVar2.c(je9Var2, str2, sbS.toString(), null);
                            }
                        }
                        xn3 xn3Var = (xn3) uj2Var.f.getValue();
                        z5e z5eVar8 = z5eVar;
                        sj2Var2.f = z5eVar8;
                        sj2Var2.d = j9;
                        sj2Var2.e = j10;
                        sj2Var2.k = 1;
                        objI = xn3Var.i(j9, sj2Var2);
                        z5eVar2 = z5eVar8;
                        if (objI != obj) {
                            rt2Var = (rt2) objI;
                            if (rt2Var != null || ((rt2Var.b.a == 0 && !((xn3) uj2Var.f.getValue()).j().V(rt2Var)) || !(rt2Var.W() || rt2Var.o0()))) {
                                gm0.Y(uj2Var.a, "execute skipped: chat is null or not synced with server or hidden or not active");
                                return sbiVar;
                            }
                            sua suaVar = (sua) uj2Var.e.getValue();
                            sj2Var2.f = z5eVar2;
                            sj2Var2.d = j9;
                            sj2Var2.e = j10;
                            sj2Var2.k = 2;
                            objI = suaVar.b(j10, sj2Var2);
                            if (objI != obj) {
                                long j11 = j10;
                                j10 = j9;
                                j9 = j11;
                                z5eVar3 = z5eVar2;
                                sfaVar = (sfa) objI;
                                if (sfaVar != null || sfaVar.j == wja.DELETED) {
                                    gm0.Y(uj2Var.a, "execute skipped: message or chat not found");
                                    return sbiVar;
                                }
                                qja qjaVar3 = (qja) uj2Var.b.getValue();
                                sj2Var2.f = z5eVar3;
                                sj2Var2.d = j10;
                                sj2Var2.e = j9;
                                sj2Var2.k = 3;
                                if (qjaVar3.B(sfaVar, z5eVar3, sj2Var2) != obj) {
                                    try {
                                        z5eVar7 = z5eVar3;
                                        sj2Var2.f = z5eVar7;
                                        sj2Var2.d = j10;
                                        sj2Var2.e = j9;
                                        sj2Var2.g = 0;
                                        sj2Var2.h = 0;
                                        sj2Var2.k = 5;
                                        j5 = j9;
                                        j6 = j10;
                                        try {
                                            objI = a(uj2Var, j6, j5, sj2Var2);
                                            uj2Var = uj2Var;
                                            sj2Var2 = sj2Var2;
                                            if (objI != obj) {
                                                z5eVar5 = z5eVar7;
                                                i2 = 0;
                                                j7 = j6;
                                                j8 = j5;
                                                i3 = 0;
                                                z = false;
                                                try {
                                                    hjaVar = (hja) objI;
                                                    qjaVar = (qja) uj2Var.b.getValue();
                                                    sj2Var2.f = z5eVar5;
                                                    sj2Var2.d = j7;
                                                    sj2Var2.e = j8;
                                                    sj2Var2.g = i3;
                                                    sj2Var2.h = i2;
                                                    sj2Var2.k = 6;
                                                    try {
                                                        if (qjaVar.D(j7, j8, hjaVar, sj2Var2) != obj) {
                                                            return sbiVar;
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        i = i3;
                                                        j4 = j8;
                                                        j3 = j7;
                                                        z5eVar4 = z5eVar5;
                                                        str = uj2Var.a;
                                                        a4cVar = gm0.f;
                                                        if (a4cVar != null) {
                                                            StringBuilder sbS2 = qt4.s(j3, "fail to add reaction for chat ", " messageId=");
                                                            sbS2.append(j4);
                                                            a4cVar.c(je9Var, str, sbS2.toString(), th);
                                                        }
                                                        if (th instanceof TamErrorException) {
                                                            qjaVar2 = (qja) uj2Var.b.getValue();
                                                            sj2Var2.f = null;
                                                            sj2Var2.d = j3;
                                                            sj2Var2.e = j4;
                                                            sj2Var2.g = i;
                                                            sj2Var2.h = 0;
                                                            sj2Var2.k = 7;
                                                            if (qjaVar2.o(j4, z5eVar4, sj2Var2) == obj) {
                                                                z5eVar7 = z5eVar3;
                                                                return obj;
                                                            }
                                                        } else {
                                                            qjaVar2 = (qja) uj2Var.b.getValue();
                                                            sj2Var2.f = null;
                                                            sj2Var2.d = j3;
                                                            sj2Var2.e = j4;
                                                            sj2Var2.g = i;
                                                            sj2Var2.h = 0;
                                                            sj2Var2.k = 7;
                                                            if (qjaVar2.o(j4, z5eVar4, sj2Var2) == obj) {
                                                                z5eVar7 = z5eVar3;
                                                                return obj;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            uj2Var = uj2Var;
                                            j3 = j6;
                                            j4 = j5;
                                            sj2Var2 = sj2Var2;
                                            z5eVar4 = z5eVar7;
                                            i = 0;
                                            str = uj2Var.a;
                                            a4cVar = gm0.f;
                                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                                StringBuilder sbS3 = qt4.s(j3, "fail to add reaction for chat ", " messageId=");
                                                sbS3.append(j4);
                                                a4cVar.c(je9Var, str, sbS3.toString(), th);
                                            }
                                            if ((th instanceof TamErrorException) || !cqk.d(th.a.b, "client.task.ignored")) {
                                                qjaVar2 = (qja) uj2Var.b.getValue();
                                                sj2Var2.f = null;
                                                sj2Var2.d = j3;
                                                sj2Var2.e = j4;
                                                sj2Var2.g = i;
                                                sj2Var2.h = 0;
                                                sj2Var2.k = 7;
                                                if (qjaVar2.o(j4, z5eVar4, sj2Var2) == obj) {
                                                    z5eVar7 = z5eVar3;
                                                    return obj;
                                                }
                                            }
                                            return sbiVar;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        j3 = j10;
                                        j4 = j9;
                                    }
                                }
                            }
                        }
                        z5eVar7 = z5eVar3;
                        return obj;
                    case 1:
                        long j12 = sj2Var2.e;
                        long j13 = sj2Var2.d;
                        z5e z5eVar9 = sj2Var2.f;
                        ch3.d0(objI);
                        j10 = j12;
                        j9 = j13;
                        z5eVar2 = z5eVar9;
                        rt2Var = (rt2) objI;
                        if (rt2Var != null) {
                            break;
                        }
                        gm0.Y(uj2Var.a, "execute skipped: chat is null or not synced with server or hidden or not active");
                        return sbiVar;
                    case 2:
                        j9 = sj2Var2.e;
                        j10 = sj2Var2.d;
                        z5e z5eVar10 = sj2Var2.f;
                        ch3.d0(objI);
                        z5eVar3 = z5eVar10;
                        sfaVar = (sfa) objI;
                        if (sfaVar != null) {
                            break;
                        }
                        gm0.Y(uj2Var.a, "execute skipped: message or chat not found");
                        return sbiVar;
                    case 3:
                        j9 = sj2Var2.e;
                        j10 = sj2Var2.d;
                        z5e z5eVar11 = sj2Var2.f;
                        ch3.d0(objI);
                        z5eVar7 = z5eVar11;
                        z5eVar7 = z5eVar3;
                        sj2Var2.f = z5eVar7;
                        sj2Var2.d = j10;
                        sj2Var2.e = j9;
                        sj2Var2.g = 0;
                        sj2Var2.h = 0;
                        sj2Var2.k = 5;
                        j5 = j9;
                        j6 = j10;
                        objI = a(uj2Var, j6, j5, sj2Var2);
                        uj2Var = uj2Var;
                        sj2Var2 = sj2Var2;
                        if (objI != obj) {
                            z5eVar5 = z5eVar7;
                            i2 = 0;
                            j7 = j6;
                            j8 = j5;
                            i3 = 0;
                            z = false;
                            hjaVar = (hja) objI;
                            qjaVar = (qja) uj2Var.b.getValue();
                            sj2Var2.f = z5eVar5;
                            sj2Var2.d = j7;
                            sj2Var2.e = j8;
                            sj2Var2.g = i3;
                            sj2Var2.h = i2;
                            sj2Var2.k = 6;
                            if (qjaVar.D(j7, j8, hjaVar, sj2Var2) != obj) {
                                return sbiVar;
                            }
                        }
                        z5eVar7 = z5eVar3;
                        return obj;
                    case 4:
                        ch3.d0(objI);
                        return sbiVar;
                    case 5:
                        i2 = sj2Var2.h;
                        i3 = sj2Var2.g;
                        long j14 = sj2Var2.e;
                        j3 = sj2Var2.d;
                        z5e z5eVar12 = sj2Var2.f;
                        try {
                            ch3.d0(objI);
                            z5eVar5 = z5eVar12;
                            z = false;
                            j7 = j3;
                            j8 = j14;
                            hjaVar = (hja) objI;
                            qjaVar = (qja) uj2Var.b.getValue();
                            sj2Var2.f = z5eVar5;
                            sj2Var2.d = j7;
                            sj2Var2.e = j8;
                            sj2Var2.g = i3;
                            sj2Var2.h = i2;
                            sj2Var2.k = 6;
                            if (qjaVar.D(j7, j8, hjaVar, sj2Var2) != obj) {
                                return sbiVar;
                            }
                            z5eVar7 = z5eVar3;
                            return obj;
                        } catch (Throwable th5) {
                            th = th5;
                            i = i3;
                            j4 = j14;
                            z5eVar6 = z5eVar12;
                            z5eVar4 = z5eVar6;
                            str = uj2Var.a;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                StringBuilder sbS4 = qt4.s(j3, "fail to add reaction for chat ", " messageId=");
                                sbS4.append(j4);
                                a4cVar.c(je9Var, str, sbS4.toString(), th);
                            }
                            if (th instanceof TamErrorException) {
                                qjaVar2 = (qja) uj2Var.b.getValue();
                                sj2Var2.f = null;
                                sj2Var2.d = j3;
                                sj2Var2.e = j4;
                                sj2Var2.g = i;
                                sj2Var2.h = 0;
                                sj2Var2.k = 7;
                                if (qjaVar2.o(j4, z5eVar4, sj2Var2) == obj) {
                                    z5eVar7 = z5eVar3;
                                    return obj;
                                }
                            } else {
                                qjaVar2 = (qja) uj2Var.b.getValue();
                                sj2Var2.f = null;
                                sj2Var2.d = j3;
                                sj2Var2.e = j4;
                                sj2Var2.g = i;
                                sj2Var2.h = 0;
                                sj2Var2.k = 7;
                                if (qjaVar2.o(j4, z5eVar4, sj2Var2) == obj) {
                                    z5eVar7 = z5eVar3;
                                    return obj;
                                }
                            }
                            return sbiVar;
                        }
                    case 6:
                        int i5 = sj2Var2.g;
                        j4 = sj2Var2.e;
                        j3 = sj2Var2.d;
                        z5e z5eVar13 = sj2Var2.f;
                        try {
                            ch3.d0(objI);
                            return sbiVar;
                        } catch (Throwable th6) {
                            th = th6;
                            i = i5;
                            z5eVar6 = z5eVar13;
                            z5eVar4 = z5eVar6;
                            str = uj2Var.a;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                StringBuilder sbS5 = qt4.s(j3, "fail to add reaction for chat ", " messageId=");
                                sbS5.append(j4);
                                a4cVar.c(je9Var, str, sbS5.toString(), th);
                            }
                            if (th instanceof TamErrorException) {
                                qjaVar2 = (qja) uj2Var.b.getValue();
                                sj2Var2.f = null;
                                sj2Var2.d = j3;
                                sj2Var2.e = j4;
                                sj2Var2.g = i;
                                sj2Var2.h = 0;
                                sj2Var2.k = 7;
                                if (qjaVar2.o(j4, z5eVar4, sj2Var2) == obj) {
                                    z5eVar7 = z5eVar3;
                                    return obj;
                                }
                            } else {
                                qjaVar2 = (qja) uj2Var.b.getValue();
                                sj2Var2.f = null;
                                sj2Var2.d = j3;
                                sj2Var2.e = j4;
                                sj2Var2.g = i;
                                sj2Var2.h = 0;
                                sj2Var2.k = 7;
                                if (qjaVar2.o(j4, z5eVar4, sj2Var2) == obj) {
                                    z5eVar7 = z5eVar3;
                                    return obj;
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
                String str3 = uj2Var.a;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, zo5.j(j9, "updateMessageBySelfReaction fail "), e2);
                }
                qja qjaVar4 = (qja) uj2Var.b.getValue();
                sj2Var2.f = null;
                sj2Var2.d = j10;
                sj2Var2.e = j9;
                sj2Var2.k = 4;
                if (qjaVar4.o(j9, z5eVar7, sj2Var2) == obj) {
                    z5eVar7 = z5eVar3;
                    return obj;
                }
            }
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
