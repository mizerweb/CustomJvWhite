package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import one.me.statistics.androidperf.battery.BatteryPercentIncreasedException;

/* JADX INFO: loaded from: classes3.dex */
public final class su0 {
    public final ny8 a = rx8.P(3, new va(15));
    public final ny8 b = rx8.P(3, new va(16));

    /* JADX WARN: Code duplicated, block: B:114:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02db  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:125:0x0305  */
    /* JADX WARN: Code duplicated, block: B:127:0x0309  */
    /* JADX WARN: Code duplicated, block: B:130:0x030e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0322  */
    /* JADX WARN: Code duplicated, block: B:136:0x0326  */
    /* JADX WARN: Code duplicated, block: B:137:0x0328  */
    /* JADX WARN: Code duplicated, block: B:79:0x0235  */
    public final ru0 a(List list, uq uqVar) {
        ou0 ou0Var;
        int i;
        ru0 pu0Var;
        u8b u8bVar;
        lw5 lw5Var;
        ylc ylcVar;
        int i2;
        String str;
        long j;
        String str2;
        a4c a4cVar;
        a4c a4cVar2;
        long j2;
        long j3;
        long j4;
        String str3;
        a4c a4cVar3;
        ylc ylcVar2;
        lw5 lw5Var2 = lw5.MILLISECONDS;
        maj majVar = maj.b;
        maj majVar2 = maj.a;
        ou0 ou0Var2 = ou0.a;
        je9 je9Var = je9.f;
        String str4 = "su0";
        char c = 2;
        if (list.isEmpty() || uqVar.a()) {
            ou0Var = ou0Var2;
            i = 1;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, "su0", "validate: nothing to calculate", null);
            }
            pu0Var = ou0Var;
        } else {
            List listM1 = ww3.M1(list, new lv5(8));
            if (listM1.size() >= 2) {
                int size = listM1.size();
                int i3 = 1;
                while (true) {
                    if (i3 >= size) {
                        i = 1;
                        ylcVar2 = null;
                        break;
                    }
                    ov0 ov0Var = (ov0) listM1.get(i3 - 1);
                    ov0 ov0Var2 = (ov0) listM1.get(i3);
                    char c2 = c;
                    i = 1;
                    if (ov0Var2.f > ov0Var.f) {
                        ylcVar2 = new ylc(ov0Var, ov0Var2);
                        break;
                    }
                    i3++;
                    c = c2;
                }
            } else {
                ylcVar2 = null;
                i = 1;
            }
            if (ylcVar2 != null) {
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                    a4cVar5.c(je9Var, "su0", qt4.l("calculate: found invalid battery pair diff prev->", ((ov0) ylcVar2.a).f, ((ov0) ylcVar2.b).f, ", second->"), null);
                }
                ov0 ov0Var3 = (ov0) ylcVar2.a;
                int i4 = ov0Var3.f;
                ov0 ov0Var4 = (ov0) ylcVar2.b;
                int i5 = ov0Var4.f;
                long j5 = ov0Var3.a;
                long j6 = ov0Var4.a;
                int size2 = listM1.size();
                ou0Var = ou0Var2;
                StringBuilder sbP = qv1.p("Battery percent increased between snapshots: prevPercent=", i4, ",currPercent=", i5, ",delta=");
                c0a.v(sbP, i5 - i4, ",prevSliceTime=", j5);
                qt4.z(j6, ",currSliceTime=", ",snapshotsCount=", sbP);
                sbP.append(size2);
                pu0Var = new pu0(new BatteryPercentIncreasedException(sbP.toString()));
            } else {
                ou0Var = ou0Var2;
                pu0Var = null;
            }
        }
        if (pu0Var != null) {
            return pu0Var;
        }
        List<ov0> listM2 = ww3.M1(list, new lv5(7));
        ru ruVarB = kuk.b(uqVar);
        if (listM2.isEmpty()) {
            u8bVar = new u8b();
        } else {
            u8b u8bVar2 = new u8b();
            for (ov0 ov0Var5 : listM2) {
                u8bVar2.b(new ba6(ov0Var5, ruVarB.a(ov0Var5.a)));
            }
            u8bVar = u8bVar2;
        }
        if (u8bVar.i()) {
            a4c a4cVar6 = gm0.f;
            if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                a4cVar6.c(je9Var, "su0", "No snapshots for calculating, skip it", null);
            }
            return ou0Var;
        }
        LinkedHashMap linkedHashMapS0 = wm9.S0(new ylc(majVar2, new wu0()), new ylc(majVar, new wu0()));
        ba6 ba6Var = (ba6) u8bVar.g(0);
        ((wu0) wm9.N0(linkedHashMapS0, ba6Var.b)).a(ba6Var.a);
        int i6 = u8bVar.b;
        int i7 = i;
        while (i7 < i6) {
            ba6 ba6Var2 = (ba6) u8bVar.g(i7 - 1);
            ba6 ba6Var3 = (ba6) u8bVar.g(i7);
            maj majVar3 = majVar;
            if (ba6Var3.a.a <= ba6Var2.a.a) {
                a4c a4cVar7 = gm0.f;
                if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                    a4cVar7.c(je9Var, str4, "Invalid sliceTime sorting in curr->" + ba6Var3 + ", prev->" + ba6Var2, null);
                }
                i2 = i7;
                str = str4;
            } else {
                wu0 wu0Var = (wu0) wm9.N0(linkedHashMapS0, ba6Var3.b);
                wu0Var.a(ba6Var3.a);
                ov0 ov0Var6 = ba6Var2.a;
                ov0 ov0Var7 = ba6Var3.a;
                long j7 = wu0Var.a;
                long j8 = ((long) ov0Var6.f) - ((long) ov0Var7.f);
                if (j8 < 0) {
                    j8 = 0;
                }
                wu0Var.a = j7 + j8;
                long j9 = wu0Var.b;
                i2 = i7;
                str = str4;
                long j10 = (((ov0Var7.b + ov0Var7.c) + ov0Var7.d) + ov0Var7.e) - (((ov0Var6.b + ov0Var6.c) + ov0Var6.d) + ov0Var6.e);
                if (j10 < 0) {
                    j10 = 0;
                }
                wu0Var.b = j9 + j10;
                je9 je9Var2 = je9.d;
                long j11 = ov0Var6.h;
                if (j11 >= 0 || ov0Var6.n >= 0) {
                    long j12 = ov0Var7.h;
                    if (j12 >= 0 || ov0Var7.n >= 0) {
                        int i8 = (j11 < 0 || j12 < 0) ? 0 : i;
                        if (i8 != 0) {
                            long j13 = j12 - j11;
                            if (j13 < 0) {
                                j13 = 0;
                            }
                            long j14 = ov0Var7.i - ov0Var6.i;
                            if (j14 < 0) {
                                j14 = 0;
                            }
                            long j15 = j14;
                            long j16 = ov0Var7.k - ov0Var6.k;
                            if (j16 < 0) {
                                j16 = 0;
                            }
                            long j17 = ov0Var7.l - ov0Var6.l;
                            if (j17 < 0) {
                                j17 = 0;
                            }
                            if (j13 + j15 + j16 + j17 > 0) {
                                long j18 = j17;
                                wu0Var.c += j13;
                                wu0Var.d += j15;
                                long j19 = wu0Var.e;
                                long j20 = ov0Var7.j - ov0Var6.j;
                                if (j20 < 0) {
                                    j20 = 0;
                                }
                                wu0Var.e = j19 + j20;
                                wu0Var.f += j16;
                                wu0Var.g += j18;
                                long j21 = wu0Var.h;
                                long j22 = ov0Var7.m - ov0Var6.m;
                                if (j22 < 0) {
                                    j22 = 0;
                                }
                                wu0Var.h = j21 + j22;
                                wu0Var.j |= 2;
                            } else {
                                j = ov0Var6.n;
                                if (j >= 0) {
                                    j2 = ov0Var7.n;
                                    if (j2 >= 0) {
                                        long j23 = wu0Var.c;
                                        j3 = j2 - j;
                                        if (j3 < 0) {
                                            j3 = 0;
                                        }
                                        wu0Var.c = j23 + j3;
                                        long j24 = wu0Var.d;
                                        j4 = ov0Var7.o - ov0Var6.o;
                                        if (j4 < 0) {
                                            j4 = 0;
                                        }
                                        wu0Var.d = j24 + j4;
                                        wu0Var.j |= 4;
                                    } else {
                                        str2 = wu0Var.n;
                                        if (i8 != 0) {
                                            a4cVar2 = gm0.f;
                                            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                                                a4cVar2.c(je9Var2, str2, "addNetworkDelta: HealthStats present but no diff and no TrafficStats", null);
                                            }
                                            wu0Var.j |= 2;
                                        } else {
                                            a4cVar = gm0.f;
                                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                                a4cVar.c(je9Var, str2, "addNetworkDelta: heterogeneous net sources in pair, cannot attribute delta", null);
                                            }
                                            wu0Var.j |= 1;
                                        }
                                    }
                                } else {
                                    str2 = wu0Var.n;
                                    if (i8 != 0) {
                                        a4cVar2 = gm0.f;
                                        if (a4cVar2 != null) {
                                            a4cVar2.c(je9Var2, str2, "addNetworkDelta: HealthStats present but no diff and no TrafficStats", null);
                                        }
                                        wu0Var.j |= 2;
                                    } else {
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, str2, "addNetworkDelta: heterogeneous net sources in pair, cannot attribute delta", null);
                                        }
                                        wu0Var.j |= 1;
                                    }
                                }
                            }
                        } else {
                            j = ov0Var6.n;
                            if (j >= 0) {
                                j2 = ov0Var7.n;
                                if (j2 >= 0) {
                                    long j25 = wu0Var.c;
                                    j3 = j2 - j;
                                    if (j3 < 0) {
                                        j3 = 0;
                                    }
                                    wu0Var.c = j25 + j3;
                                    long j26 = wu0Var.d;
                                    j4 = ov0Var7.o - ov0Var6.o;
                                    if (j4 < 0) {
                                        j4 = 0;
                                    }
                                    wu0Var.d = j26 + j4;
                                    wu0Var.j |= 4;
                                } else {
                                    str2 = wu0Var.n;
                                    if (i8 != 0) {
                                        a4cVar2 = gm0.f;
                                        if (a4cVar2 != null) {
                                            a4cVar2.c(je9Var2, str2, "addNetworkDelta: HealthStats present but no diff and no TrafficStats", null);
                                        }
                                        wu0Var.j |= 2;
                                    } else {
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, str2, "addNetworkDelta: heterogeneous net sources in pair, cannot attribute delta", null);
                                        }
                                        wu0Var.j |= 1;
                                    }
                                }
                            } else {
                                str2 = wu0Var.n;
                                if (i8 != 0) {
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 != null) {
                                        a4cVar2.c(je9Var2, str2, "addNetworkDelta: HealthStats present but no diff and no TrafficStats", null);
                                    }
                                    wu0Var.j |= 2;
                                } else {
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, str2, "addNetworkDelta: heterogeneous net sources in pair, cannot attribute delta", null);
                                    }
                                    wu0Var.j |= 1;
                                }
                            }
                        }
                    } else {
                        str3 = wu0Var.n;
                        a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                            a4cVar3.c(je9Var2, str3, "addNetworkDelta: unknown source in pair, skip bytes", null);
                        }
                        wu0Var.j |= 1;
                    }
                } else {
                    str3 = wu0Var.n;
                    a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        a4cVar3.c(je9Var2, str3, "addNetworkDelta: unknown source in pair, skip bytes", null);
                    }
                    wu0Var.j |= 1;
                }
                i7 = i2 + 1;
                majVar = majVar3;
                str4 = str;
            }
            i7 = i2 + 1;
            majVar = majVar3;
            str4 = str;
        }
        maj majVar4 = majVar;
        long j27 = uqVar.a;
        i8b i8bVar = uqVar.e;
        int i9 = i8bVar.b;
        if (i9 == 0) {
            long j28 = uqVar.c - j27;
            if (uqVar.f) {
                ghb ghbVar = ew5.b;
                lw5Var = lw5Var2;
                ylcVar = new ylc(new ew5(qe7.P(j28, lw5Var)), new ew5(0L));
            } else {
                lw5Var = lw5Var2;
                ylcVar = new ylc(new ew5(0L), new ew5(qe7.P(j28, lw5Var)));
            }
        } else {
            lw5Var = lw5Var2;
            long j29 = 0;
            boolean z = uqVar.f;
            long j30 = 0;
            long j31 = j27;
            int i10 = 0;
            while (i10 < i9) {
                long jB = i8bVar.b(i10);
                long j32 = jB - j31;
                if (z) {
                    j30 += j32;
                } else {
                    j29 += j32;
                }
                z = !z;
                i10++;
                j31 = jB;
            }
            long j33 = uqVar.c - j31;
            if (z) {
                j30 += j33;
            } else {
                j29 += j33;
            }
            ghb ghbVar2 = ew5.b;
            ylcVar = new ylc(new ew5(qe7.P(j30, lw5Var)), new ew5(qe7.P(j29, lw5Var)));
        }
        long j34 = ((ew5) ylcVar.a).a;
        long j35 = ((ew5) ylcVar.b).a;
        wu0 wu0Var2 = (wu0) wm9.N0(linkedHashMapS0, majVar2);
        wu0 wu0Var3 = (wu0) wm9.N0(linkedHashMapS0, majVar4);
        return new qu0(new nu0(qe7.P(uqVar.c - uqVar.a, lw5Var), qe7.P((uqVar.c - uqVar.a) - (uqVar.d - uqVar.b), lw5Var), j34, j35, ((Number) this.b.getValue()).doubleValue(), l6m.l(wu0Var2, j34, ((Number) this.a.getValue()).intValue(), ((Number) this.b.getValue()).doubleValue()), l6m.l(wu0Var3, j35, ((Number) this.a.getValue()).intValue(), ((Number) this.b.getValue()).doubleValue()), wu0Var2, wu0Var3));
    }
}
