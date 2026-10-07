package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.net.URI;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class uii implements wkc {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public uii(n81 n81Var, iaa iaaVar) {
        this.a = 1;
        n81Var.getClass();
        this.b = n81Var;
        this.c = iaaVar;
        this.d = new y36(n81Var.c, n81Var.d, 1.0d);
        this.e = new y36(n81Var.f, n81Var.g, 0.0d);
        this.f = new y36(n81Var.k, 0.0d, 2);
        this.g = new y36(n81Var.j, 0.0d, 2);
        this.h = new y36(n81Var.w, n81Var.x, 4);
        this.i = new y36(n81Var.y, n81Var.z, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(uii uiiVar, fd4 fd4Var, URI uri, nq4 nq4Var) throws Throwable {
        qii qiiVar;
        uii uiiVar2;
        j28 j28Var;
        String strS;
        if (nq4Var instanceof qii) {
            qiiVar = (qii) nq4Var;
            int i = qiiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qiiVar.g = i - Integer.MIN_VALUE;
            } else {
                qiiVar = new qii(nq4Var);
            }
        } else {
            qiiVar = new qii(nq4Var);
        }
        Object obj = qiiVar.f;
        int i2 = qiiVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            j28 j28Var2 = new j28(((lt6) uiiVar.d).b);
            qiiVar.d = uiiVar;
            qiiVar.e = j28Var2;
            qiiVar.g = 1;
            Object objK = uiiVar.k(fd4Var, uri, j28Var2, qiiVar);
            hu4 hu4Var = hu4.a;
            if (objK == hu4Var) {
                return hu4Var;
            }
            uiiVar2 = uiiVar;
            j28Var = j28Var2;
            obj = objK;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j28Var = qiiVar.e;
            uiiVar2 = qiiVar.d;
            ch3.d0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        sbi sbiVar = sbi.a;
        if (zBooleanValue && (strS = j28Var.s("X-Last-Known-Byte")) != null && strS.length() != 0) {
            Long lC0 = y5h.C0(strS);
            if (lC0 != null) {
                long jLongValue = lC0.longValue();
                if (jLongValue >= 0) {
                    long j = jLongValue + 1;
                    ((u8b) uiiVar2.h).b(new wfi(0L, j, j));
                    return sbiVar;
                }
            } else {
                String strO = c0a.o("X-Last-Known-Byte=", strS, ", value is not parsed");
                gm0.V((String) uiiVar2.f, strO, new nii(strO, null));
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object j(uii uiiVar, fd4 fd4Var, URI uri, nq4 nq4Var) throws Throwable {
        rii riiVar;
        uii uiiVar2;
        j28 j28Var;
        String strS;
        Long lC0;
        if (nq4Var instanceof rii) {
            riiVar = (rii) nq4Var;
            int i = riiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                riiVar.g = i - Integer.MIN_VALUE;
            } else {
                riiVar = new rii(nq4Var);
            }
        } else {
            riiVar = new rii(nq4Var);
        }
        Object obj = riiVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = riiVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            j28 j28Var2 = new j28(((lt6) uiiVar.d).b);
            riiVar.d = uiiVar;
            riiVar.e = j28Var2;
            riiVar.g = 1;
            Object objK = uiiVar.k(fd4Var, uri, j28Var2, riiVar);
            if (objK == hu4Var) {
                return hu4Var;
            }
            uiiVar2 = uiiVar;
            j28Var = j28Var2;
            obj = objK;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j28Var = riiVar.e;
            uiiVar2 = riiVar.d;
            ch3.d0(obj);
        }
        if (((Boolean) obj).booleanValue() && (strS = j28Var.s("Range")) != null && strS.length() != 0) {
            String str = (String) uiiVar2.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "initChunksForFile: got headers from server = ".concat(strS), null);
                }
            }
            for (String str2 : r5h.m1(strS, new String[]{","}, 6)) {
                if (str2.length() != 0) {
                    List listM1 = r5h.m1(str2, new String[]{"/"}, 6);
                    if (listM1.size() == 2 && ((CharSequence) listM1.get(0)).length() != 0) {
                        List listM2 = r5h.m1((CharSequence) listM1.get(0), new String[]{"-"}, 6);
                        if (listM2.size() == 2 && (lC0 = y5h.C0((String) listM2.get(0))) != null) {
                            long jLongValue = lC0.longValue();
                            Long lC1 = y5h.C0((String) listM2.get(1));
                            if (lC1 != null) {
                                long jLongValue2 = 1 + (lC1.longValue() - jLongValue);
                                ((u8b) uiiVar2.h).b(new wfi(jLongValue, jLongValue2, jLongValue2));
                            }
                        }
                    }
                }
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(nq4 nq4Var) {
        oii oiiVar;
        l9b l9bVar;
        wfi wfiVar;
        wfi wfiVarB;
        if (nq4Var instanceof oii) {
            oiiVar = (oii) nq4Var;
            int i = oiiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                oiiVar.g = i - Integer.MIN_VALUE;
            } else {
                oiiVar = new oii(this, nq4Var);
            }
        } else {
            oiiVar = new oii(this, nq4Var);
        }
        Object obj = oiiVar.e;
        int i2 = oiiVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = (l9b) this.g;
            oiiVar.d = l9bVar2;
            oiiVar.g = 1;
            Object objB = l9bVar2.b(oiiVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = oiiVar.d;
            ch3.d0(obj);
        }
        try {
            switch (qt4.D(((lt6) this.d).a)) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 6:
                    long j = ((mt6) this.c).e;
                    u8b u8bVar = (u8b) this.h;
                    int i3 = u8bVar.b;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            if (u8bVar.i()) {
                                gol.f("ObjectList is empty.");
                                throw null;
                            }
                            long j2 = ((wfi) u8bVar.a[0]).b;
                            if (j2 != j) {
                                wfiVar = new wfi(j2, j - j2);
                                u8bVar.b(wfiVar);
                            }
                        }
                        wfiVarB = null;
                    } else {
                        wfiVar = new wfi(0L, j);
                        u8bVar.b(wfiVar);
                    }
                    wfiVarB = wfiVar;
                    break;
                case 2:
                case 4:
                    wfiVarB = b();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            l9bVar.g(null);
            return wfiVarB;
        } catch (Throwable th) {
            l9bVar.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    public wfi b() {
        int i;
        long jMin;
        u8b u8bVar = (u8b) this.h;
        if (u8bVar.i()) {
            return e();
        }
        long j = ((lt6) this.d).e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= u8bVar.b - 1) {
                break;
            }
            wfi wfiVar = (wfi) u8bVar.g(i3);
            int i4 = i3 + 1;
            wfi wfiVar2 = (wfi) u8bVar.g(i4);
            long j2 = wfiVar.b;
            if ((j2 != wfiVar.c ? 0 : 1) != 0 && wfiVar2.b == wfiVar2.c && wfiVar.a + j2 == wfiVar2.a) {
                u8bVar.l(i4);
                u8bVar.l(i3);
                long j3 = wfiVar.a;
                long j4 = j2 + wfiVar2.b;
                u8bVar.a(i3, new wfi(j3, j4, j4));
            } else {
                i3 = i4;
            }
        }
        wfi wfiVarE = (wfi) (u8bVar.i() ? null : u8bVar.g(0));
        if (wfiVarE == null) {
            wfiVarE = e();
        }
        long j5 = wfiVarE.a;
        if (j5 != 0) {
            wfi wfiVar3 = new wfi(0L, Math.min(j, j5));
            u8bVar.a(0, wfiVar3);
            return wfiVar3;
        }
        while (i2 < u8bVar.b) {
            wfi wfiVar4 = (wfi) u8bVar.g(i2);
            long j6 = wfiVar4.a;
            long j7 = wfiVar4.b;
            long j8 = j6 + j7;
            wfi wfiVar5 = i2 != u8bVar.b - i ? (wfi) u8bVar.g(i2 + 1) : null;
            int i5 = i;
            long j9 = wfiVar4.a;
            if (wfiVar5 == null) {
                long j10 = j9 + j7;
                long j11 = ((mt6) this.c).e;
                if (j10 < j11) {
                    jMin = Math.min(j, j11 - j10);
                } else {
                    jMin = -1;
                }
            } else {
                long j12 = j9 + j7;
                long j13 = wfiVar5.a;
                if (j12 < j13) {
                    jMin = Math.min(j, j13 - j12);
                } else {
                    jMin = -1;
                }
            }
            if (jMin > 0) {
                wfi wfiVar6 = new wfi(j8, jMin);
                u8bVar.a(i2 + i5, wfiVar6);
                return wfiVar6;
            }
            i2++;
            i = i5;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    @Override // defpackage.wkc
    public double c(double d, double d2, double d3, boolean z) {
        double d4;
        double d5;
        double dPow;
        double dMin;
        double dPow2;
        y36 y36Var = (y36) this.i;
        iaa iaaVar = (iaa) this.c;
        n81 n81Var = (n81) this.b;
        y36 y36Var2 = (y36) this.f;
        y36 y36Var3 = (y36) this.g;
        y36 y36Var4 = (y36) this.h;
        y36 y36Var5 = (y36) this.e;
        y36Var5.a(d);
        if (z) {
            y36Var4.a(d3);
            iaaVar.invoke("EMAs: rtt=" + y36Var5.d + " bitrateE=" + y36Var4.d + " bitrateR=" + y36Var.d);
        } else {
            y36Var3.a(d2);
            y36Var2.a(d2);
            iaaVar.invoke("EMAs: rtt=" + y36Var5.d + " lossFast=" + y36Var3.d + " lossSlow=" + y36Var2.d);
        }
        double d6 = y36Var5.d;
        double d7 = n81Var.n;
        if (d7 <= 0.0d || d6 <= d7) {
            double d8 = n81Var.e;
            d4 = 0.0d;
            double d9 = n81Var.h;
            d5 = 1.0d;
            double d10 = n81Var.i;
            int iJ = gm0.J((d6 - d8) / d9);
            if (iJ < 0) {
                iJ = 0;
            }
            dPow = Math.pow(1.0d - d10, iJ);
        } else {
            d4 = 0.0d;
            dPow = 0.0d;
            d5 = 1.0d;
        }
        if (z) {
            if (n81Var.u) {
                double d11 = y36Var.d;
                double d12 = y36Var4.d;
                double d13 = n81Var.v;
                if (Math.abs(d11) <= Double.MAX_VALUE && Math.abs(d12) <= Double.MAX_VALUE) {
                    dMin = d5 - ((d5 - (Math.min(d12, d11) / Math.max(d12, d11))) * d13);
                    if (dMin <= d5) {
                        dPow2 = dMin;
                    }
                }
            }
            dPow2 = d5;
        } else {
            double d14 = y36Var2.d;
            double d15 = y36Var3.d;
            double d16 = n81Var.o;
            if (d16 <= d4 || d15 <= d16) {
                double d17 = n81Var.p;
                if (d17 > d4 && d14 > d17) {
                    dPow2 = d4;
                } else if (n81Var.q) {
                    double d18 = n81Var.r;
                    double d19 = n81Var.s;
                    double d20 = n81Var.t;
                    int iJ2 = gm0.J((d14 - d18) / d19);
                    dPow2 = Math.pow(d5 - d20, iJ2 >= 0 ? iJ2 : 0);
                } else {
                    double d21 = n81Var.l;
                    double d22 = n81Var.m;
                    if (d15 > d4) {
                        dMin = (d5 - (d15 * d21)) - (d14 * d22);
                        dPow2 = dMin;
                    } else {
                        dPow2 = d5;
                    }
                }
            } else {
                dPow2 = d4;
            }
        }
        return dPow * dPow2;
    }

    @Override // defpackage.wkc
    public void d(double d) {
        ((y36) this.i).a(d);
    }

    public wfi e() {
        wfi wfiVar = (wfi) this.i;
        if (wfiVar == null) {
            wfiVar = new wfi(0L, Math.min(((lt6) this.d).e, ((mt6) this.c).e));
        }
        ((u8b) this.h).b(wfiVar);
        return wfiVar;
    }

    public uv9 f() {
        return new uv9((String) this.f, (CharSequence) this.b, (CharSequence) this.c, (CharSequence) this.d, (Bitmap) this.e, (Uri) this.g, (Bundle) this.h, (Uri) this.i);
    }

    public fsb g() {
        z18 z18Var = new z18();
        z18Var.e = (r6a) this.b;
        z18Var.g = (r6a) this.c;
        z18Var.f = (r6a) this.d;
        z18Var.i = new ex8(7, (xd5) ((ny8) this.e).getValue());
        z18Var.c = new ot4(15, this);
        ((wxb) ((ny8) this.f).getValue()).getClass();
        if (((Number) ((g5d) ((gjf) ((ny8) this.h).getValue())).a.d().i()).intValue() == 3) {
            z18Var.d = (ks1) this.i;
        }
        return z18Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0083 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #1 {all -> 0x007f, blocks: (B:22:0x0061, B:25:0x0072, B:26:0x0076, B:27:0x0079, B:28:0x007e, B:31:0x0083, B:33:0x0090, B:35:0x009c, B:36:0x00a0, B:37:0x00a3, B:38:0x00a8, B:39:0x00a9, B:43:0x00bd, B:46:0x00cf, B:49:0x00dd, B:52:0x00ef, B:53:0x00f4, B:54:0x00f5, B:57:0x0107), top: B:73:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:60:0x0119, B:66:0x013d, B:63:0x0122, B:65:0x012a), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:60:0x0119, B:66:0x013d, B:63:0x0122, B:65:0x012a), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0116, code lost:
    
        if (i(r9, r10, r12, r1) == r2) goto L59;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x012a, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(defpackage.fd4 r10, java.net.URI r11, defpackage.nq4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uii.h(fd4, java.net.URI, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0161  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ad, code lost:
    
        if (r2 == r6) goto L78;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01ad -> B:79:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(defpackage.fd4 r17, java.net.URI r18, defpackage.j28 r19, defpackage.nq4 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uii.k(fd4, java.net.URI, j28, nq4):java.lang.Object");
    }

    public void l(CharSequence charSequence) {
        this.d = charSequence;
    }

    public void m(Bundle bundle) {
        this.h = bundle;
    }

    public void n(Bitmap bitmap) {
        this.e = bitmap;
    }

    public void o(Uri uri) {
        this.g = uri;
    }

    public void p(String str) {
        this.f = str;
    }

    public void q(Uri uri) {
        this.i = uri;
    }

    public void r(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.wkc
    public void reset() {
        y36 y36Var = (y36) this.d;
        y36Var.d = y36Var.c;
        y36 y36Var2 = (y36) this.e;
        y36Var2.d = y36Var2.c;
        y36 y36Var3 = (y36) this.f;
        y36Var3.d = y36Var3.c;
        y36 y36Var4 = (y36) this.g;
        y36Var4.d = y36Var4.c;
        y36 y36Var5 = (y36) this.h;
        y36Var5.d = y36Var5.c;
        y36 y36Var6 = (y36) this.i;
        y36Var6.d = y36Var6.c;
    }

    public void s(CharSequence charSequence) {
        this.b = charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(nq4 nq4Var) {
        tii tiiVar;
        l9b l9bVar;
        if (nq4Var instanceof tii) {
            tiiVar = (tii) nq4Var;
            int i = tiiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tiiVar.g = i - Integer.MIN_VALUE;
            } else {
                tiiVar = new tii(this, nq4Var);
            }
        } else {
            tiiVar = new tii(this, nq4Var);
        }
        Object obj = tiiVar.e;
        int i2 = tiiVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = (l9b) this.g;
            tiiVar.d = l9bVar2;
            tiiVar.g = 1;
            Object objB = l9bVar2.b(tiiVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = tiiVar.d;
            ch3.d0(obj);
        }
        try {
            u8b u8bVar = (u8b) this.h;
            Object[] objArr = u8bVar.a;
            int i3 = u8bVar.b;
            long j = 0;
            for (int i4 = 0; i4 < i3; i4++) {
                j += ((wfi) objArr[i4]).c;
            }
            return new Long(j);
        } finally {
            l9bVar.g(null);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sbC = nbh.C("(");
                u8b u8bVar = (u8b) this.h;
                Object[] objArr = u8bVar.a;
                int i = u8bVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    wfi wfiVar = (wfi) objArr[i2];
                    if (sbC.length() > 1) {
                        sbC.append(",");
                    }
                    sbC.append(wfiVar.a);
                    sbC.append("-");
                    sbC.append((wfiVar.a + wfiVar.b) - 1);
                }
                sbC.append(")");
                return sbC.toString();
            default:
                return super.toString();
        }
    }

    public uii(r6a r6aVar, r6a r6aVar2, r6a r6aVar3, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = 2;
        this.b = r6aVar;
        this.c = r6aVar2;
        this.d = r6aVar3;
        this.e = ny8Var4;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = new ks1();
    }

    public uii(z18 z18Var, mt6 mt6Var, lt6 lt6Var, wze wzeVar) {
        this.a = 0;
        this.b = z18Var;
        this.c = mt6Var;
        this.d = lt6Var;
        this.e = wzeVar;
        this.f = uii.class.getName();
        this.g = new l9b();
        this.h = new u8b();
    }

    public uii(lx2 lx2Var, xhh xhhVar, jah jahVar, g85 g85Var) {
        this.a = 5;
        this.b = lx2Var;
        this.c = xhhVar;
        this.d = jahVar;
        this.e = g85Var;
    }

    public uii(Uri uri, String str) {
        this.a = 3;
        this.f = str;
        this.b = uri;
        this.h = null;
        this.i = null;
    }

    public uii() {
        this.a = 4;
    }
}
