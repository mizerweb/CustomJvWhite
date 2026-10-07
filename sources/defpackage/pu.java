package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu implements ou {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(long j) {
    }

    @Override // defpackage.ou
    public final void h(long j) {
        switch (this.a) {
            case 0:
                ((njd) this.b).c(new ylc(Boolean.TRUE, Long.valueOf(j)));
                break;
            case 1:
                qu quVar = (qu) this.b;
                ((xt4) quVar.d).D0(k66.a, new e6(4, quVar));
                break;
            case 2:
                tbb tbbVar = (tbb) this.b;
                if (tbbVar.k != 0) {
                    nkg nkgVar = (nkg) tbbVar.n.get();
                    String str = tbbVar.h;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Navigation stats. Try update session id on warmStart, lastTime:" + tbbVar.k + "|lastCondition:" + nkgVar, null);
                        }
                    }
                    if (!tbbVar.d()) {
                        nkgVar.getClass();
                        if (nkgVar != nkg.b && nkgVar != nkg.c) {
                            yab.i0(tbbVar.g, null, 0, new wz6(tbbVar, null, 22), 3);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.ou
    public final void w(long j) {
        char c;
        long j2;
        long j3;
        long j4;
        char c2;
        Object[] objArr;
        int i;
        switch (this.a) {
            case 0:
                ((njd) this.b).c(new ylc(Boolean.FALSE, Long.valueOf(j)));
                break;
            case 1:
                qu quVar = (qu) this.b;
                ((xt4) quVar.d).D0(k66.a, new c3(5, quVar));
                break;
            case 2:
                Object obj = ((tbb) this.b).m.get();
                tbb tbbVar = (tbb) this.b;
                if (obj != null) {
                    tbbVar.k = j;
                    tbb.g((tbb) this.b, y3f.APPLICATION_BACKGROUND);
                } else {
                    gm0.U(tbbVar.h, "Skip send stats, no navigation events before");
                }
                break;
            default:
                rnf rnfVar = (rnf) this.b;
                e8b e8bVar = new e8b(rnfVar.u.e);
                e8b e8bVar2 = rnfVar.u;
                int[] iArr = e8bVar2.b;
                Object[] objArr2 = e8bVar2.c;
                long[] jArr = e8bVar2.a;
                int length = jArr.length - 2;
                char c3 = 7;
                long j5 = -9187201950435737472L;
                int i2 = 8;
                if (length >= 0) {
                    j3 = 128;
                    int i3 = 0;
                    while (true) {
                        long j6 = jArr[i3];
                        j4 = 255;
                        if ((((~j6) << c3) & j6 & j5) != j5) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j6 & 255) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    int i7 = iArr[i6];
                                    Object obj2 = objArr2[i6];
                                    int iA = e8bVar.a(i7);
                                    e8bVar.b[iA] = i7;
                                    e8bVar.c[iA] = obj2;
                                }
                                j6 >>= 8;
                                i5++;
                                c3 = c3;
                                j5 = j5;
                            }
                            c = c3;
                            j2 = j5;
                            if (i4 == 8) {
                            }
                        } else {
                            c = c3;
                            j2 = j5;
                        }
                        if (i3 != length) {
                            i3++;
                            c3 = c;
                            j5 = j2;
                        }
                    }
                } else {
                    c = 7;
                    j2 = -9187201950435737472L;
                    j3 = 128;
                    j4 = 255;
                }
                lfc lfcVar = (lfc) rnfVar.h.getValue();
                bk5 bk5VarC = ((f5d) lfcVar.c()).c();
                bk5VarC.getClass();
                char c4 = 1;
                zv8 zv8Var = bk5.c[1];
                if (bk5VarC.b("opcode") && e8bVar.e != 0) {
                    StringBuilder sb = new StringBuilder();
                    int[] iArr2 = e8bVar.b;
                    Object[] objArr3 = e8bVar.c;
                    long[] jArr2 = e8bVar.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j7 = jArr2[i8];
                            if ((((~j7) << c) & j7 & j2) != j2) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((j7 & j4) < j3) {
                                        int i11 = (i8 << 3) + i10;
                                        int i12 = iArr2[i11];
                                        long j8 = ((bj8) objArr3[i11]).a;
                                        if (sb.length() > 0) {
                                            sb.append(',');
                                        }
                                        sb.append(i12);
                                        sb.append(',');
                                        sb.append((int) (j8 >> 32));
                                        sb.append(',');
                                        sb.append((int) (j8 & 4294967295L));
                                    }
                                    j7 >>= i2;
                                    i10++;
                                    i2 = i2;
                                    c4 = c4;
                                    objArr3 = objArr3;
                                }
                                c2 = c4;
                                objArr = objArr3;
                                i = i2;
                                if (i9 == i) {
                                }
                            } else {
                                c2 = c4;
                                objArr = objArr3;
                                i = i2;
                            }
                            if (i8 != length2) {
                                i8++;
                                i2 = i;
                                c4 = c2;
                                objArr3 = objArr;
                            }
                        }
                    } else {
                        c2 = 1;
                    }
                    String string = sb.toString();
                    u9c u9cVar = (u9c) lfcVar.d.getValue();
                    gvb gvbVar = u9cVar.f;
                    zv8[] zv8VarArr = u9c.l;
                    if (!cqk.d((String) gvbVar.m(u9cVar, zv8VarArr[c2]), string)) {
                        u9c u9cVar2 = (u9c) lfcVar.d.getValue();
                        u9cVar2.f.B(u9cVar2, zv8VarArr[c2], string);
                        String str = lfcVar.b;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "Saved opcode stats", null);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
