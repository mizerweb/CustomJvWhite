package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i09 {
    public final svb a;
    public final nni b;
    public final ny8 c;
    public final xhh d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;

    public i09(svb svbVar, nni nniVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, xhh xhhVar) {
        this.a = svbVar;
        this.b = nniVar;
        this.c = ny8Var;
        this.d = xhhVar;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var7;
        this.i = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:29:0x00b7->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r1 == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.i09 r17, defpackage.nq4 r18) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i09.a(i09, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:106:0x0208  */
    /* JADX WARN: Code duplicated, block: B:111:0x022a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0232  */
    /* JADX WARN: Code duplicated, block: B:114:0x0234  */
    /* JADX WARN: Code duplicated, block: B:120:0x025e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x014d A[PHI: r14 r15 r17
  0x014d: PHI (r14v5 java.lang.String) = (r14v2 java.lang.String), (r14v6 java.lang.String) binds: [B:49:0x00f8, B:66:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r15v4 int) = (r15v2 int), (r15v5 int) binds: [B:49:0x00f8, B:66:0x014c] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r17v8 sbi) = (r17v5 sbi), (r17v9 sbi) binds: [B:49:0x00f8, B:66:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ee  */
    public final Object b(nq4 nq4Var) {
        f09 f09Var;
        String str;
        int i;
        int i2;
        int i3;
        long jNanoTime;
        int i4;
        long jNanoTime2;
        a4c a4cVar;
        is3 is3Var;
        int i5;
        int i6;
        int i7;
        int i8;
        long jNanoTime3;
        a4c a4cVar2;
        lq4 lq4Var;
        a4c a4cVar3;
        long jNanoTime4;
        a4c a4cVar4;
        a4c a4cVar5;
        long jNanoTime5;
        a4c a4cVar6;
        lq4 lq4Var2;
        a4c a4cVar7;
        long jNanoTime6;
        a4c a4cVar8;
        lq4 lq4Var3;
        a4c a4cVar9;
        a4c a4cVar10;
        yn7 yn7Var = yn7.a;
        sbi sbiVar = sbi.a;
        lw5 lw5Var = lw5.NANOSECONDS;
        je9 je9Var = je9.d;
        if (nq4Var instanceof f09) {
            f09Var = (f09) nq4Var;
            int i9 = f09Var.i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                f09Var.i = i9 - Integer.MIN_VALUE;
            } else {
                f09Var = new f09(this, nq4Var);
            }
        } else {
            f09Var = new f09(this, nq4Var);
        }
        Object obj = f09Var.g;
        hu4 hu4Var = hu4.a;
        int i10 = f09Var.i;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "app.library.version";
                jNanoTime = f09Var.f;
                int i11 = f09Var.e;
                i2 = f09Var.d;
                ch3.d0(obj);
                sbiVar = sbiVar;
                i4 = i11;
            } else {
                if (i10 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j = f09Var.f;
                int i12 = f09Var.e;
                i5 = f09Var.d;
                ch3.d0(obj);
                sbiVar = sbiVar;
                i6 = i12;
                str = "app.library.version";
                jNanoTime2 = j;
            }
            a4cVar10 = gm0.f;
            if (a4cVar10 != null && a4cVar10.b(je9Var)) {
                ghb ghbVar = ew5.b;
                a4cVar10.c(je9Var, "LibraryUpgradeHelper", zo5.i(i6, "Upgrade to ", " complete. It takes ", ew5.t(qe7.P(System.nanoTime() - jNanoTime2, lw5Var))), null);
            }
            i2 = i5;
            i7 = 3;
            i8 = 0;
            if (i2 <= 3) {
                jNanoTime6 = System.nanoTime();
                a4cVar8 = gm0.f;
                if (a4cVar8 == null && a4cVar8.b(je9Var)) {
                    lq4Var3 = null;
                    a4cVar8.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 started", null);
                } else {
                    lq4Var3 = null;
                }
                yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var3, i8), 2);
                a4cVar9 = gm0.f;
                if (a4cVar9 != null && a4cVar9.b(je9Var)) {
                    ghb ghbVar2 = ew5.b;
                    a4cVar9.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime6, lw5Var))), null);
                }
            }
            if (i2 <= 4) {
                jNanoTime5 = System.nanoTime();
                a4cVar6 = gm0.f;
                if (a4cVar6 == null && a4cVar6.b(je9Var)) {
                    lq4Var2 = null;
                    a4cVar6.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 started", null);
                } else {
                    lq4Var2 = null;
                }
                yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var2, 1), 2);
                a4cVar7 = gm0.f;
                if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                    ghb ghbVar3 = ew5.b;
                    a4cVar7.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime5, lw5Var))), null);
                }
            }
            if (i2 <= 5) {
                jNanoTime4 = System.nanoTime();
                a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 started", null);
                }
                a4cVar5 = gm0.f;
                if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                    ghb ghbVar4 = ew5.b;
                    a4cVar5.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime4, lw5Var))), null);
                }
            }
            if (i2 <= 7) {
                jNanoTime3 = System.nanoTime();
                a4cVar2 = gm0.f;
                if (a4cVar2 == null && a4cVar2.b(je9Var)) {
                    lq4Var = null;
                    a4cVar2.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 started", null);
                } else {
                    lq4Var = null;
                }
                yab.i0((ite) this.i.getValue(), ((n0c) this.d).b(), 0, new af8(this, lq4Var, i7), 2);
                a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    ghb ghbVar5 = ew5.b;
                    a4cVar3.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime3, lw5Var))), null);
                }
            }
            this.b.d(9, str);
            return sbiVar;
        }
        str = "app.library.version";
        ch3.d0(obj);
        if (this.b.d.contains(str)) {
            i = 9;
        } else {
            boolean zB = this.a.b();
            nni nniVar = this.b;
            if (zB) {
                nniVar.d(5, str);
                i = 9;
            } else {
                i = 9;
                nniVar.d(9, str);
            }
        }
        i2 = this.b.d.getInt(str, i);
        if (i2 == i) {
            gm0.n("LibraryUpgradeHelper", "upgrade not needed");
            return sbiVar;
        }
        if (this.a.b()) {
            i3 = 1;
            if (i2 < 1) {
                jNanoTime = System.nanoTime();
                a4c a4cVar11 = gm0.f;
                if (a4cVar11 != null && a4cVar11.b(je9Var)) {
                    a4cVar11.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 1 started", null);
                }
                is3 is3Var2 = (is3) this.e.getValue();
                f09Var.d = i2;
                f09Var.e = 1;
                f09Var.f = jNanoTime;
                f09Var.i = 1;
                if (is3Var2.a(f09Var) != hu4Var) {
                    i4 = 1;
                }
            } else {
                sbiVar = sbiVar;
                if (i2 <= i3) {
                    jNanoTime2 = System.nanoTime();
                    a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 2 started", null);
                    }
                    is3Var = (is3) this.e.getValue();
                    f09Var.d = i2;
                    f09Var.e = 2;
                    f09Var.f = jNanoTime2;
                    f09Var.i = 2;
                    if (is3Var.a(f09Var) != hu4Var) {
                        i5 = i2;
                        i6 = 2;
                        a4cVar10 = gm0.f;
                        if (a4cVar10 != null) {
                            ghb ghbVar6 = ew5.b;
                            a4cVar10.c(je9Var, "LibraryUpgradeHelper", zo5.i(i6, "Upgrade to ", " complete. It takes ", ew5.t(qe7.P(System.nanoTime() - jNanoTime2, lw5Var))), null);
                        }
                        i2 = i5;
                        i7 = 3;
                        i8 = 0;
                        if (i2 <= 3) {
                            jNanoTime6 = System.nanoTime();
                            a4cVar8 = gm0.f;
                            if (a4cVar8 == null) {
                                lq4Var3 = null;
                            } else {
                                lq4Var3 = null;
                                a4cVar8.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 started", null);
                            }
                            yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var3, i8), 2);
                            a4cVar9 = gm0.f;
                            if (a4cVar9 != null) {
                                ghb ghbVar7 = ew5.b;
                                a4cVar9.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime6, lw5Var))), null);
                            }
                        }
                        if (i2 <= 4) {
                            jNanoTime5 = System.nanoTime();
                            a4cVar6 = gm0.f;
                            if (a4cVar6 == null) {
                                lq4Var2 = null;
                            } else {
                                lq4Var2 = null;
                                a4cVar6.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 started", null);
                            }
                            yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var2, 1), 2);
                            a4cVar7 = gm0.f;
                            if (a4cVar7 != null) {
                                ghb ghbVar8 = ew5.b;
                                a4cVar7.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime5, lw5Var))), null);
                            }
                        }
                        if (i2 <= 5) {
                            jNanoTime4 = System.nanoTime();
                            a4cVar4 = gm0.f;
                            if (a4cVar4 != null) {
                                a4cVar4.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 started", null);
                            }
                            a4cVar5 = gm0.f;
                            if (a4cVar5 != null) {
                                ghb ghbVar9 = ew5.b;
                                a4cVar5.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime4, lw5Var))), null);
                            }
                        }
                        if (i2 <= 7) {
                            jNanoTime3 = System.nanoTime();
                            a4cVar2 = gm0.f;
                            if (a4cVar2 == null) {
                                lq4Var = null;
                            } else {
                                lq4Var = null;
                                a4cVar2.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 started", null);
                            }
                            yab.i0((ite) this.i.getValue(), ((n0c) this.d).b(), 0, new af8(this, lq4Var, i7), 2);
                            a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                ghb ghbVar10 = ew5.b;
                                a4cVar3.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime3, lw5Var))), null);
                            }
                        }
                    }
                } else {
                    i7 = 3;
                    i8 = 0;
                    if (i2 <= 3) {
                        jNanoTime6 = System.nanoTime();
                        a4cVar8 = gm0.f;
                        if (a4cVar8 == null) {
                            lq4Var3 = null;
                        } else {
                            lq4Var3 = null;
                            a4cVar8.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 started", null);
                        }
                        yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var3, i8), 2);
                        a4cVar9 = gm0.f;
                        if (a4cVar9 != null) {
                            ghb ghbVar11 = ew5.b;
                            a4cVar9.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime6, lw5Var))), null);
                        }
                    }
                    if (i2 <= 4) {
                        jNanoTime5 = System.nanoTime();
                        a4cVar6 = gm0.f;
                        if (a4cVar6 == null) {
                            lq4Var2 = null;
                        } else {
                            lq4Var2 = null;
                            a4cVar6.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 started", null);
                        }
                        yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var2, 1), 2);
                        a4cVar7 = gm0.f;
                        if (a4cVar7 != null) {
                            ghb ghbVar12 = ew5.b;
                            a4cVar7.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime5, lw5Var))), null);
                        }
                    }
                    if (i2 <= 5) {
                        jNanoTime4 = System.nanoTime();
                        a4cVar4 = gm0.f;
                        if (a4cVar4 != null) {
                            a4cVar4.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 started", null);
                        }
                        a4cVar5 = gm0.f;
                        if (a4cVar5 != null) {
                            ghb ghbVar13 = ew5.b;
                            a4cVar5.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime4, lw5Var))), null);
                        }
                    }
                    if (i2 <= 7) {
                        jNanoTime3 = System.nanoTime();
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            lq4Var = null;
                        } else {
                            lq4Var = null;
                            a4cVar2.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 started", null);
                        }
                        yab.i0((ite) this.i.getValue(), ((n0c) this.d).b(), 0, new af8(this, lq4Var, i7), 2);
                        a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            ghb ghbVar14 = ew5.b;
                            a4cVar3.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime3, lw5Var))), null);
                        }
                    }
                }
            }
            return hu4Var;
        }
        sbiVar = sbiVar;
        this.b.d(9, str);
        return sbiVar;
        a4c a4cVar12 = gm0.f;
        if (a4cVar12 != null && a4cVar12.b(je9Var)) {
            ghb ghbVar15 = ew5.b;
            a4cVar12.c(je9Var, "LibraryUpgradeHelper", zo5.i(i4, "Upgrade to ", " complete. It takes ", ew5.t(qe7.P(System.nanoTime() - jNanoTime, lw5Var))), null);
        }
        i3 = 1;
        if (i2 <= i3) {
            jNanoTime2 = System.nanoTime();
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 2 started", null);
            }
            is3Var = (is3) this.e.getValue();
            f09Var.d = i2;
            f09Var.e = 2;
            f09Var.f = jNanoTime2;
            f09Var.i = 2;
            if (is3Var.a(f09Var) != hu4Var) {
                i5 = i2;
                i6 = 2;
                a4cVar10 = gm0.f;
                if (a4cVar10 != null) {
                    ghb ghbVar16 = ew5.b;
                    a4cVar10.c(je9Var, "LibraryUpgradeHelper", zo5.i(i6, "Upgrade to ", " complete. It takes ", ew5.t(qe7.P(System.nanoTime() - jNanoTime2, lw5Var))), null);
                }
                i2 = i5;
                i7 = 3;
                i8 = 0;
                if (i2 <= 3) {
                    jNanoTime6 = System.nanoTime();
                    a4cVar8 = gm0.f;
                    if (a4cVar8 == null) {
                        lq4Var3 = null;
                    } else {
                        lq4Var3 = null;
                        a4cVar8.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 started", null);
                    }
                    yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var3, i8), 2);
                    a4cVar9 = gm0.f;
                    if (a4cVar9 != null) {
                        ghb ghbVar17 = ew5.b;
                        a4cVar9.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime6, lw5Var))), null);
                    }
                }
                if (i2 <= 4) {
                    jNanoTime5 = System.nanoTime();
                    a4cVar6 = gm0.f;
                    if (a4cVar6 == null) {
                        lq4Var2 = null;
                    } else {
                        lq4Var2 = null;
                        a4cVar6.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 started", null);
                    }
                    yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var2, 1), 2);
                    a4cVar7 = gm0.f;
                    if (a4cVar7 != null) {
                        ghb ghbVar18 = ew5.b;
                        a4cVar7.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime5, lw5Var))), null);
                    }
                }
                if (i2 <= 5) {
                    jNanoTime4 = System.nanoTime();
                    a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        a4cVar4.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 started", null);
                    }
                    a4cVar5 = gm0.f;
                    if (a4cVar5 != null) {
                        ghb ghbVar19 = ew5.b;
                        a4cVar5.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime4, lw5Var))), null);
                    }
                }
                if (i2 <= 7) {
                    jNanoTime3 = System.nanoTime();
                    a4cVar2 = gm0.f;
                    if (a4cVar2 == null) {
                        lq4Var = null;
                    } else {
                        lq4Var = null;
                        a4cVar2.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 started", null);
                    }
                    yab.i0((ite) this.i.getValue(), ((n0c) this.d).b(), 0, new af8(this, lq4Var, i7), 2);
                    a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        ghb ghbVar110 = ew5.b;
                        a4cVar3.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime3, lw5Var))), null);
                    }
                }
            }
            return hu4Var;
        }
        i7 = 3;
        i8 = 0;
        if (i2 <= 3) {
            jNanoTime6 = System.nanoTime();
            a4cVar8 = gm0.f;
            if (a4cVar8 == null) {
                lq4Var3 = null;
            } else {
                lq4Var3 = null;
                a4cVar8.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 started", null);
            }
            yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var3, i8), 2);
            a4cVar9 = gm0.f;
            if (a4cVar9 != null) {
                ghb ghbVar111 = ew5.b;
                a4cVar9.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 4 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime6, lw5Var))), null);
            }
        }
        if (i2 <= 4) {
            jNanoTime5 = System.nanoTime();
            a4cVar6 = gm0.f;
            if (a4cVar6 == null) {
                lq4Var2 = null;
            } else {
                lq4Var2 = null;
                a4cVar6.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 started", null);
            }
            yab.i0(yn7Var, ((n0c) this.d).b(), 0, new g09(this, lq4Var2, 1), 2);
            a4cVar7 = gm0.f;
            if (a4cVar7 != null) {
                ghb ghbVar112 = ew5.b;
                a4cVar7.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 5 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime5, lw5Var))), null);
            }
        }
        if (i2 <= 5) {
            jNanoTime4 = System.nanoTime();
            a4cVar4 = gm0.f;
            if (a4cVar4 != null) {
                a4cVar4.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 started", null);
            }
            a4cVar5 = gm0.f;
            if (a4cVar5 != null) {
                ghb ghbVar113 = ew5.b;
                a4cVar5.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 6 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime4, lw5Var))), null);
            }
        }
        if (i2 <= 7) {
            jNanoTime3 = System.nanoTime();
            a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                lq4Var = null;
            } else {
                lq4Var = null;
                a4cVar2.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 started", null);
            }
            yab.i0((ite) this.i.getValue(), ((n0c) this.d).b(), 0, new af8(this, lq4Var, i7), 2);
            a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                ghb ghbVar114 = ew5.b;
                a4cVar3.c(je9Var, "LibraryUpgradeHelper", "Upgrade to 8 complete. It takes ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime3, lw5Var))), null);
            }
        }
        this.b.d(9, str);
        return sbiVar;
    }
}
