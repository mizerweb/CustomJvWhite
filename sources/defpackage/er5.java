package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class er5 implements o18 {
    public final pjh a;
    public final int b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public o18 p;
    public volatile int q;
    public volatile long r;
    public volatile int s;
    public volatile rq5 u;
    public final ifh v;
    public xva w;
    public final String o = zo5.h(fr5.a.incrementAndGet(), "DownloadFileAttachOperation");
    public final long t = 500;
    public String x = "";

    public er5(pjh pjhVar, int i, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12) {
        this.a = pjhVar;
        this.b = i;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = ny8Var6;
        this.i = ny8Var7;
        this.j = ny8Var8;
        this.k = ny8Var9;
        this.l = ny8Var10;
        this.m = ny8Var11;
        this.n = ny8Var12;
        this.v = new ifh(new ja1(this, ny8Var, ny8Var12, ny8Var2, 5));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (q(r1, r2, 0, 0, r7) == r8) goto L34;
     */
    @Override // defpackage.o18
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.nq4 r16) {
        /*
            r15 = this;
            r1 = r16
            boolean r2 = r1 instanceof defpackage.tq5
            if (r2 == 0) goto L16
            r2 = r1
            tq5 r2 = (defpackage.tq5) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            tq5 r2 = new tq5
            r2.<init>(r15, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r7.d
            hu4 r8 = defpackage.hu4.a
            int r2 = r7.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            defpackage.ch3.d0(r1)
            goto L9a
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r3
        L35:
            defpackage.ch3.d0(r1)
            goto L58
        L39:
            defpackage.ch3.d0(r1)
            os5 r9 = r15.i()
            ls5 r10 = defpackage.ls5.USER_CANCELLED
            java.lang.String r11 = r15.x
            r13 = 0
            r14 = 28
            r12 = 0
            defpackage.qrc.o(r9, r10, r11, r12, r13, r14)
            o18 r1 = r15.p
            if (r1 == 0) goto L58
            r7.f = r5
            java.lang.Object r1 = r1.a(r7)
            if (r1 != r8) goto L58
            goto L99
        L58:
            java.lang.String r1 = r15.o
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L5f
            goto L7a
        L5f:
            je9 r5 = defpackage.je9.d
            boolean r6 = r2.b(r5)
            if (r6 == 0) goto L7a
            pjh r6 = r15.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "onFileDownloadCancelled: "
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r2.c(r5, r1, r6, r3)
        L7a:
            pjh r1 = r15.a
            boolean r1 = r1.b()
            if (r1 == 0) goto L9a
            pjh r1 = r15.a
            boolean r1 = r1.h
            if (r1 == 0) goto L9a
            u60 r1 = defpackage.u60.b
            int r2 = r15.q
            r7.f = r4
            r3 = 0
            r5 = 0
            r0 = r15
            java.lang.Object r1 = r0.q(r1, r2, r3, r5, r7)
            if (r1 != r8) goto L9a
        L99:
            return r8
        L9a:
            lq5 r1 = defpackage.lq5.a
            r15.u = r1
            sbi r0 = defpackage.sbi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er5.a(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.o18
    public final Object b(nq4 nq4Var) {
        vq5 vq5Var;
        if (nq4Var instanceof vq5) {
            vq5Var = (vq5) nq4Var;
            int i = vq5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vq5Var.f = i - Integer.MIN_VALUE;
            } else {
                vq5Var = new vq5(this, nq4Var);
            }
        } else {
            vq5Var = new vq5(this, nq4Var);
        }
        Object obj = vq5Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = vq5Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            o18 o18Var = this.p;
            if (o18Var != null) {
                vq5Var.f = 1;
                if (o18Var.b(vq5Var) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        String str = this.o;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onFileDownloadFailed: " + this.a, null);
            }
        }
        if (this.a.h) {
            t51 t51Var = (t51) this.h.getValue();
            pjh pjhVar = this.a;
            t51Var.c(new gq5(pjhVar.p, pjhVar.a, pjhVar.g, pjhVar.b));
        }
        this.u = nq5.a;
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // defpackage.o18
    public final Object c(nq4 nq4Var, String str, boolean z, boolean z2) {
        wq5 wq5Var;
        String str2;
        boolean z3;
        e70 e70VarQ;
        int i;
        rq5 oq5Var;
        u60 u60Var;
        String str3 = str;
        boolean z4 = z;
        boolean z5 = z2;
        if (nq4Var instanceof wq5) {
            wq5Var = (wq5) nq4Var;
            int i2 = wq5Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wq5Var.i = i2 - Integer.MIN_VALUE;
            } else {
                wq5Var = new wq5(this, nq4Var);
            }
        } else {
            wq5Var = new wq5(this, nq4Var);
        }
        Object objF = wq5Var.g;
        hu4 hu4Var = hu4.a;
        int i3 = wq5Var.i;
        if (i3 == 0) {
            ch3.d0(objF);
            o18 o18Var = this.p;
            if (o18Var != null) {
                wq5Var.f = str3;
                wq5Var.d = z4;
                wq5Var.e = z5;
                wq5Var.i = 1;
                if (o18Var.c(wq5Var, str3, z4, z5) != hu4Var) {
                }
            }
            return hu4Var;
        }
        if (i3 == 1) {
            boolean z6 = wq5Var.e;
            z4 = wq5Var.d;
            String str4 = wq5Var.f;
            ch3.d0(objF);
            z5 = z6;
            str3 = str4;
        } else {
            if (i3 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = wq5Var.e;
            z4 = wq5Var.d;
            String str5 = wq5Var.f;
            ch3.d0(objF);
            str2 = str5;
        }
        e70VarQ = cqk.q((sfa) objF, this.a.b);
        if (z4) {
            i = this.s;
            this.s = i + 1;
        } else {
            i = 0;
        }
        if (e70VarQ == null && (u60Var = e70VarQ.q) != null && u60Var.a()) {
            qrc.o(i(), ls5.USER_CANCELLED, this.x, null, null, 28);
            gm0.Y(this.o, "File download. onFileDownloadInterrupted: cancelled outside!");
            oq5Var = lq5.a;
        } else if (z4 || i > 10) {
            if (z3) {
                qrc.o(i(), ls5.NOT_ENOUGH_SPACE, this.x, null, null, 28);
            } else {
                qrc.o(i(), ls5.INTERRUPTED_UNKNOWN, this.x, null, str2, 20);
            }
            oq5Var = new oq5(false);
        } else {
            oq5Var = new oq5(true);
        }
        this.u = oq5Var;
        return sbi.a;
        String str6 = this.o;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str6, "onFileDownloadInterrupted: " + this.a + ", isNetworkProblem:" + z4 + ", retryCount:" + this.s, null);
            }
        }
        if (this.a.h) {
            t51 t51Var = (t51) this.h.getValue();
            pjh pjhVar = this.a;
            t51Var.c(new gq5(pjhVar.p, pjhVar.a, pjhVar.g, pjhVar.b));
        }
        sua suaVarJ = j();
        long j = this.a.a;
        wq5Var.f = str3;
        wq5Var.d = z4;
        wq5Var.e = z5;
        wq5Var.i = 2;
        objF = suaVarJ.f(j, wq5Var);
        if (objF != hu4Var) {
            str2 = str3;
            z3 = z5;
            e70VarQ = cqk.q((sfa) objF, this.a.b);
            if (z4) {
                i = this.s;
                this.s = i + 1;
            } else {
                i = 0;
            }
            if (e70VarQ == null) {
                if (z4) {
                    if (z3) {
                        qrc.o(i(), ls5.NOT_ENOUGH_SPACE, this.x, null, null, 28);
                    } else {
                        qrc.o(i(), ls5.INTERRUPTED_UNKNOWN, this.x, null, str2, 20);
                    }
                    oq5Var = new oq5(false);
                } else {
                    if (z3) {
                        qrc.o(i(), ls5.NOT_ENOUGH_SPACE, this.x, null, null, 28);
                    } else {
                        qrc.o(i(), ls5.INTERRUPTED_UNKNOWN, this.x, null, str2, 20);
                    }
                    oq5Var = new oq5(false);
                }
            } else if (z4) {
                if (z3) {
                    qrc.o(i(), ls5.NOT_ENOUGH_SPACE, this.x, null, null, 28);
                } else {
                    qrc.o(i(), ls5.INTERRUPTED_UNKNOWN, this.x, null, str2, 20);
                }
                oq5Var = new oq5(false);
            } else {
                if (z3) {
                    qrc.o(i(), ls5.NOT_ENOUGH_SPACE, this.x, null, null, 28);
                } else {
                    qrc.o(i(), ls5.INTERRUPTED_UNKNOWN, this.x, null, str2, 20);
                }
                oq5Var = new oq5(false);
            }
            this.u = oq5Var;
            return sbi.a;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r1 == r5) goto L36;
     */
    @Override // defpackage.o18
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.nq4 r18) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er5.d(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d A[PHI: r2
  0x014d: PHI (r2v20 int) = (r2v15 int), (r2v15 int), (r2v17 int), (r2v19 int) binds: [B:59:0x014b, B:64:0x0158, B:71:0x0165, B:63:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x0158  */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183  */
    /* JADX WARN: Code duplicated, block: B:80:0x018d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x0196  */
    /* JADX WARN: Code duplicated, block: B:85:0x019e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dd  */
    @Override // defpackage.o18
    public final Object e(float f, long j, long j2, nq4 nq4Var) {
        xq5 xq5Var;
        long jCurrentTimeMillis;
        Object obj;
        float f2;
        long j3;
        long j4;
        long j5;
        long j6;
        u60 u60Var;
        Object obj2;
        xq5 xq5Var2;
        long j7;
        float f3;
        long j8;
        long j9;
        Object objF;
        long j10;
        long j11;
        sfa sfaVar;
        rq5 rq5Var;
        pq5 pq5Var;
        String str;
        a4c a4cVar;
        je9 je9Var;
        xva xvaVar;
        DownloadFileAttachWorker downloadFileAttachWorker;
        Object objN;
        e70 e70VarQ;
        int i;
        int iK;
        int i2;
        u60 u60Var2 = u60.e;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof xq5) {
            xq5Var = (xq5) nq4Var;
            int i3 = xq5Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xq5Var.j = i3 - Integer.MIN_VALUE;
            } else {
                xq5Var = new xq5(this, nq4Var);
            }
        } else {
            xq5Var = new xq5(this, nq4Var);
        }
        xq5 xq5Var3 = xq5Var;
        Object obj3 = xq5Var3.h;
        hu4 hu4Var = hu4.a;
        int i4 = xq5Var3.j;
        if (i4 != 0) {
            if (i4 == 1) {
                jCurrentTimeMillis = xq5Var3.g;
                j3 = xq5Var3.f;
                j6 = xq5Var3.e;
                f2 = xq5Var3.d;
                ch3.d0(obj3);
                obj = null;
            } else if (i4 == 2) {
                long j12 = xq5Var3.g;
                j9 = xq5Var3.f;
                long j13 = xq5Var3.e;
                float f4 = xq5Var3.d;
                ch3.d0(obj3);
                u60Var = u60Var2;
                obj2 = hu4Var;
                j7 = j13;
                f3 = f4;
                j8 = j12;
                xq5Var2 = xq5Var3;
                sua suaVarJ = j();
                long j14 = this.a.a;
                xq5Var2.d = f3;
                xq5Var2.e = j7;
                xq5Var2.f = j9;
                xq5Var2.g = j8;
                xq5Var2.j = 3;
                objF = suaVarJ.f(j14, xq5Var2);
                if (objF == obj2) {
                    return obj2;
                }
                j10 = j9;
                j11 = j7;
            } else {
                if (i4 != 3) {
                    if (i4 == 4) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j8 = xq5Var3.g;
                j10 = xq5Var3.f;
                j11 = xq5Var3.e;
                f3 = xq5Var3.d;
                ch3.d0(obj3);
                objF = obj3;
                u60Var = u60Var2;
                obj2 = hu4Var;
                xq5Var2 = xq5Var3;
            }
            sfaVar = (sfa) objF;
            if (sfaVar != null && sfaVar.C() && ((sfaVar.r() != null || sfaVar.z() != null) && (e70VarQ = cqk.q(sfaVar, this.a.b)) != null && e70VarQ.q == u60Var)) {
                i = 0;
                if (Float.isNaN(f3)) {
                    i2 = i;
                } else {
                    iK = gm0.K(f3);
                    if (iK < 0) {
                        i = -1;
                    } else if (iK != 0) {
                        if (1 <= iK || iK >= 101) {
                            i = 100;
                        } else {
                            i2 = iK;
                        }
                    }
                    i2 = i;
                }
                this.u = new pq5(i2, sfaVar.c, sfaVar.h);
            }
            rq5Var = this.u;
            if (rq5Var instanceof pq5) {
                pq5Var = (pq5) rq5Var;
            } else {
                pq5Var = null;
            }
            if (pq5Var == null) {
                gm0.Y(er5.class.getName(), "Early return in onFileDownloadProgress cuz of state as? State.Loading is null");
                return sbiVar;
            }
            str = this.o;
            a4cVar = gm0.f;
            if (a4cVar == null) {
                je9Var = je9.c;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "progress=".concat(ezl.e(pq5Var.a)), null);
                }
            }
            xvaVar = this.w;
            if (xvaVar != null) {
                return sbiVar;
            }
            xq5Var2.d = f3;
            xq5Var2.e = j11;
            xq5Var2.f = j10;
            xq5Var2.g = j8;
            xq5Var2.j = 4;
            downloadFileAttachWorker = (DownloadFileAttachWorker) xvaVar.b;
            if ((downloadFileAttachWorker.m(pq5Var.a) && Build.VERSION.SDK_INT < 34) || (objN = downloadFileAttachWorker.n(xq5Var2)) != obj2) {
            }
            if (objN != obj2) {
                objN = sbiVar;
            }
            if (objN == obj2) {
                return obj2;
            }
            return sbiVar;
        }
        ch3.d0(obj3);
        jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.r < this.t) {
            return sbiVar;
        }
        this.r = jCurrentTimeMillis;
        o18 o18Var = this.p;
        if (o18Var != null) {
            xq5Var3.d = f;
            xq5Var3.e = j;
            xq5Var3.f = j2;
            xq5Var3.g = jCurrentTimeMillis;
            xq5Var3.j = 1;
            obj = null;
            if (o18Var.e(f, j, j2, xq5Var3) == hu4Var) {
                return hu4Var;
            }
            f2 = f;
            j6 = j;
            j3 = j2;
        } else {
            obj = null;
            f2 = f;
            j3 = j2;
            j4 = jCurrentTimeMillis;
            j5 = j;
        }
        if (this.a.b() || !this.a.h) {
            gm0.Y(er5.class.getName(), "Early return in onFileDownloadProgress cuz of taskAttachDownloadData");
            return sbiVar;
        }
        u60Var = u60Var2;
        int iK2 = gm0.K(f2);
        xq5Var3.d = f2;
        xq5Var3.e = j5;
        xq5Var3.f = j3;
        xq5Var3.g = j4;
        xq5Var3.j = 2;
        obj2 = hu4Var;
        long j15 = j3;
        xq5Var2 = xq5Var3;
        if (q(u60Var, iK2, j5, j15, xq5Var2) == obj2) {
            return obj2;
        }
        j7 = j5;
        f3 = f2;
        j8 = j4;
        j9 = j15;
        sua suaVarJ2 = j();
        long j16 = this.a.a;
        xq5Var2.d = f3;
        xq5Var2.e = j7;
        xq5Var2.f = j9;
        xq5Var2.g = j8;
        xq5Var2.j = 3;
        objF = suaVarJ2.f(j16, xq5Var2);
        if (objF == obj2) {
            return obj2;
        }
        j10 = j9;
        j11 = j7;
        sfaVar = (sfa) objF;
        if (sfaVar != null) {
            i = 0;
            if (Float.isNaN(f3)) {
                iK = gm0.K(f3);
                if (iK < 0) {
                    i = -1;
                } else if (iK != 0) {
                    if (1 <= iK) {
                    }
                    i = 100;
                }
                i2 = i;
            } else {
                i2 = i;
            }
            this.u = new pq5(i2, sfaVar.c, sfaVar.h);
        }
        rq5Var = this.u;
        if (rq5Var instanceof pq5) {
            pq5Var = (pq5) rq5Var;
        } else {
            pq5Var = null;
        }
        if (pq5Var == null) {
            gm0.Y(er5.class.getName(), "Early return in onFileDownloadProgress cuz of state as? State.Loading is null");
            return sbiVar;
        }
        str = this.o;
        a4cVar = gm0.f;
        if (a4cVar == null) {
            je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "progress=".concat(ezl.e(pq5Var.a)), null);
            }
        }
        xvaVar = this.w;
        if (xvaVar != null) {
            return sbiVar;
        }
        xq5Var2.d = f3;
        xq5Var2.e = j11;
        xq5Var2.f = j10;
        xq5Var2.g = j8;
        xq5Var2.j = 4;
        downloadFileAttachWorker = (DownloadFileAttachWorker) xvaVar.b;
        objN = downloadFileAttachWorker.m(pq5Var.a) ? sbiVar : sbiVar;
        if (objN != obj2) {
            objN = sbiVar;
        }
        if (objN == obj2) {
            return obj2;
        }
        return sbiVar;
        j5 = j6;
        j4 = jCurrentTimeMillis;
        if (this.a.b()) {
        }
        gm0.Y(er5.class.getName(), "Early return in onFileDownloadProgress cuz of taskAttachDownloadData");
        return sbiVar;
    }

    @Override // defpackage.o18
    public final String f() {
        pjh pjhVar = this.a;
        long j = pjhVar.c;
        if (j > 0) {
            long j2 = pjhVar.a;
            StringBuilder sb = new StringBuilder();
            sb.append(j2);
            sb.append(j);
            return sb.toString();
        }
        long j3 = pjhVar.d;
        if (j3 > 0) {
            long j4 = pjhVar.a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j4);
            sb2.append(j3);
            return sb2.toString();
        }
        long j5 = pjhVar.e;
        if (j5 > 0) {
            long j6 = pjhVar.a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j6);
            sb3.append(j5);
            return sb3.toString();
        }
        long j7 = pjhVar.f;
        if (j7 > 0) {
            long j8 = pjhVar.a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j8);
            sb4.append(j7);
            return sb4.toString();
        }
        long j9 = pjhVar.j;
        if (j9 <= 0) {
            c.e("DownloadListener.getContext() must return not null value");
            return null;
        }
        long j10 = pjhVar.a;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(j10);
        sb5.append(j9);
        return sb5.toString();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #1 {all -> 0x00e4, blocks: (B:34:0x00c2, B:36:0x00cf, B:37:0x00d5, B:38:0x00e0), top: B:87:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x0153  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:67:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // defpackage.o18
    public final Object g(File file, nq4 nq4Var) {
        uq5 uq5Var;
        File file2;
        sfa sfaVar;
        int i;
        long j;
        File file3;
        File file4;
        File fileM;
        h4c h4cVar;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap frameAtTime;
        pjh pjhVar;
        File file5 = file;
        Object obj = sbi.a;
        if (nq4Var instanceof uq5) {
            uq5Var = (uq5) nq4Var;
            int i2 = uq5Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uq5Var.g = i2 - Integer.MIN_VALUE;
            } else {
                uq5Var = new uq5(this, nq4Var);
            }
        } else {
            uq5Var = new uq5(this, nq4Var);
        }
        uq5 uq5Var2 = uq5Var;
        Object objF = uq5Var2.e;
        Object obj2 = hu4.a;
        int i3 = uq5Var2.g;
        if (i3 == 0) {
            ch3.d0(objF);
            o18 o18Var = this.p;
            if (o18Var != null) {
                uq5Var2.d = file5;
                uq5Var2.g = 1;
                if (o18Var.g(file5, uq5Var2) != obj2) {
                }
            }
            return obj2;
        }
        if (i3 == 1) {
            file5 = uq5Var2.d;
            ch3.d0(objF);
        } else {
            if (i3 == 2) {
                file5 = uq5Var2.d;
                ch3.d0(objF);
                file2 = file5;
                sfaVar = (sfa) objF;
                if (this.a.e > 0) {
                    c2a c2aVar = (c2a) this.f.getValue();
                    fileM = ((ju6) ((rs6) this.c.getValue())).m(String.valueOf(this.a.e));
                    h4cVar = (h4c) c2aVar;
                    h4cVar.getClass();
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(file2.toString());
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 0);
                        if (frameAtTime != null) {
                            try {
                                sb8.l0(fileM.toString(), frameAtTime, ((g5d) h4cVar.c).n(), Bitmap.CompressFormat.JPEG);
                            } catch (IOException unused) {
                            }
                            frameAtTime.recycle();
                        }
                    } catch (Throwable th) {
                        try {
                            gm0.V("h4c", "fail to release", th);
                        } catch (Throwable th2) {
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused2) {
                            }
                            throw th2;
                        }
                    }
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused3) {
                    }
                    if (sfaVar != null) {
                        ((qfa) j().f.getValue()).n(sfaVar.a, this.a.b, new nua(0, new w83(27)));
                    }
                }
                if (this.a.b() || !this.a.h) {
                    i = 1;
                    j = 0;
                    file3 = file2;
                    if (file3 != null) {
                        if (this.a.h) {
                            t51 t51Var = (t51) this.h.getValue();
                            pjh pjhVar2 = this.a;
                            long j2 = pjhVar2.p;
                            String str = pjhVar2.g;
                            String absolutePath = file3.getAbsolutePath();
                            pjh pjhVar3 = this.a;
                            t51Var.c(new eq5(j2, pjhVar3.a, str, absolutePath, pjhVar3.b));
                        }
                        pjhVar = this.a;
                        if (pjhVar.c != j && !pjhVar.n) {
                            h4c h4cVar2 = (h4c) ((c2a) this.f.getValue());
                            yab.i0(h4cVar2.k, null, 0, new g4c(h4cVar2, file3, null, i), 3);
                        }
                    }
                    if (this.a.j <= j) {
                        file3 = null;
                    }
                    if (file3 != null) {
                        ((dr6) this.i.getValue()).b(file3);
                    }
                    i().B(this.x);
                    this.u = mq5.a;
                    if (this.w != null) {
                        uq5Var2.d = null;
                        uq5Var2.g = 4;
                        if (obj == obj2) {
                        }
                    }
                    return obj;
                }
                u60 u60Var = u60.c;
                uq5Var2.d = file2;
                uq5Var2.g = 3;
                i = 1;
                j = 0;
                if (r(sfaVar, u60Var, 100, 0L, 0L, file2, uq5Var2) != obj2) {
                    file4 = file2;
                }
                return obj2;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    ch3.d0(objF);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file4 = uq5Var2.d;
            ch3.d0(objF);
            i = 1;
            j = 0;
        }
        file3 = file4;
        if (file3 != null) {
            if (this.a.h) {
                t51 t51Var2 = (t51) this.h.getValue();
                pjh pjhVar4 = this.a;
                long j3 = pjhVar4.p;
                String str2 = pjhVar4.g;
                String absolutePath2 = file3.getAbsolutePath();
                pjh pjhVar5 = this.a;
                t51Var2.c(new eq5(j3, pjhVar5.a, str2, absolutePath2, pjhVar5.b));
            }
            pjhVar = this.a;
            if (pjhVar.c != j) {
                h4c h4cVar3 = (h4c) ((c2a) this.f.getValue());
                yab.i0(h4cVar3.k, null, 0, new g4c(h4cVar3, file3, null, i), 3);
            }
        }
        if (this.a.j <= j) {
            file3 = null;
        }
        if (file3 != null) {
            ((dr6) this.i.getValue()).b(file3);
        }
        i().B(this.x);
        this.u = mq5.a;
        if (this.w != null) {
            uq5Var2.d = null;
            uq5Var2.g = 4;
            if (obj == obj2) {
                return obj2;
            }
        }
        return obj;
        gm0.m(this.o, "onFileDownloadCompleted: %s", this.a);
        sua suaVarJ = j();
        long j4 = this.a.a;
        uq5Var2.d = file5;
        uq5Var2.g = 2;
        objF = suaVarJ.f(j4, uq5Var2);
        if (objF != obj2) {
            file2 = file5;
            sfaVar = (sfa) objF;
            if (this.a.e > 0) {
                c2a c2aVar2 = (c2a) this.f.getValue();
                fileM = ((ju6) ((rs6) this.c.getValue())).m(String.valueOf(this.a.e));
                h4cVar = (h4c) c2aVar2;
                h4cVar.getClass();
                mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(file2.toString());
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 0);
                if (frameAtTime != null) {
                    sb8.l0(fileM.toString(), frameAtTime, ((g5d) h4cVar.c).n(), Bitmap.CompressFormat.JPEG);
                    frameAtTime.recycle();
                }
                mediaMetadataRetriever.release();
                if (sfaVar != null) {
                    ((qfa) j().f.getValue()).n(sfaVar.a, this.a.b, new nua(0, new w83(27)));
                }
            }
            if (this.a.b()) {
            }
            i = 1;
            j = 0;
            file3 = file2;
            if (file3 != null) {
                if (this.a.h) {
                    t51 t51Var3 = (t51) this.h.getValue();
                    pjh pjhVar6 = this.a;
                    long j5 = pjhVar6.p;
                    String str3 = pjhVar6.g;
                    String absolutePath3 = file3.getAbsolutePath();
                    pjh pjhVar7 = this.a;
                    t51Var3.c(new eq5(j5, pjhVar7.a, str3, absolutePath3, pjhVar7.b));
                }
                pjhVar = this.a;
                if (pjhVar.c != j) {
                    h4c h4cVar4 = (h4c) ((c2a) this.f.getValue());
                    yab.i0(h4cVar4.k, null, 0, new g4c(h4cVar4, file3, null, i), 3);
                }
            }
            if (this.a.j <= j) {
                file3 = null;
            }
            if (file3 != null) {
                ((dr6) this.i.getValue()).b(file3);
            }
            i().B(this.x);
            this.u = mq5.a;
            if (this.w != null) {
                uq5Var2.d = null;
                uq5Var2.g = 4;
                if (obj == obj2) {
                }
            }
            return obj;
        }
        return obj2;
    }

    public final Object h(nq4 nq4Var) {
        String str = this.o;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.n(gm0.c() ? k() : "*****", "File download. CancelLoading: "), null);
            }
        }
        Object objA = ((q18) this.e.getValue()).a(k(), this.a.b, nq4Var);
        return objA == hu4.a ? objA : sbi.a;
    }

    public final os5 i() {
        return (os5) this.m.getValue();
    }

    public final sua j() {
        return (sua) this.d.getValue();
    }

    public final File k() {
        return (File) this.v.getValue();
    }

    public final rq5 l() {
        return this.u;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0112 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0118 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x011e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0124 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x012e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0136 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0140 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0148 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0152 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0165 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003d, B:41:0x00f5, B:43:0x00fb, B:45:0x0112, B:47:0x0118, B:49:0x011e, B:51:0x0124, B:53:0x012e, B:55:0x0136, B:57:0x0140, B:59:0x0148, B:61:0x0152, B:63:0x015a, B:65:0x0165, B:20:0x0045, B:34:0x00b7, B:36:0x00bb, B:38:0x00d4, B:31:0x0087), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017c, code lost:
    
        if (h(r2) == r3) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.xva r18, defpackage.o18 r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er5.m(xva, o18, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(nq4 nq4Var) {
        br5 br5Var;
        Long l;
        Long l2;
        Object poeVar;
        ntg ntgVar;
        if (nq4Var instanceof br5) {
            br5Var = (br5) nq4Var;
            int i = br5Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                br5Var.f = i - Integer.MIN_VALUE;
            } else {
                br5Var = new br5(this, nq4Var);
            }
        } else {
            br5Var = new br5(this, nq4Var);
        }
        Object objO = br5Var.d;
        int i2 = br5Var.f;
        pjh pjhVar = this.a;
        if (i2 == 0) {
            ch3.d0(objO);
            sua suaVarJ = j();
            long j = pjhVar.a;
            String str = pjhVar.b;
            br5Var.f = 1;
            objO = suaVarJ.o(j, br5Var, str);
            hu4 hu4Var = hu4.a;
            if (objO == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objO);
        }
        e70 e70Var = (e70) objO;
        sbi sbiVar = sbi.a;
        if (e70Var == null) {
            gm0.Y(this.o, "Got empty message for download, can't start metric!");
            return sbiVar;
        }
        y60 y60Var = e70Var.a;
        int i3 = y60Var == null ? -1 : sq5.$EnumSwitchMapping$1[y60Var.ordinal()];
        if (i3 == 1) {
            o60 o60Var = e70Var.b;
            if (o60Var != null) {
                l = new Long(o60Var.i);
                l2 = l;
            } else {
                l2 = null;
            }
        } else if (i3 == 2) {
            d70 d70Var = e70Var.d;
            if (d70Var != null) {
                l = new Long(d70Var.a);
                l2 = l;
            } else {
                l2 = null;
            }
        } else if (i3 == 3) {
            b60 b60Var = e70Var.e;
            if (b60Var != null) {
                l = new Long(b60Var.a);
                l2 = l;
            } else {
                l2 = null;
            }
        } else if (i3 == 4) {
            j60 j60Var = e70Var.j;
            if (j60Var != null) {
                l = new Long(j60Var.a);
                l2 = l;
            } else {
                l2 = null;
            }
        } else if (i3 == 5 && (ntgVar = e70Var.p) != null) {
            l = new Long(ntgVar.b);
            l2 = l;
        } else {
            l2 = null;
        }
        os5 os5VarI = i();
        int iB = yvk.b(e70Var);
        ns5 ns5Var = pjhVar.o;
        try {
            poeVar = URI.create(pjhVar.g).getHost();
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        this.x = os5VarI.D(iB, ns5Var, (String) (poeVar instanceof poe ? null : poeVar), this.b, l2);
        return sbiVar;
    }

    public final Object p(w93 w93Var) {
        gm0.U(this.o, "stop");
        Object objC = ((q18) this.e.getValue()).c(k(), this.a.b, w93Var);
        return objC == hu4.a ? objC : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r((defpackage.sfa) r1, r2, r8, r11, r6, null, r9) == r10) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(defpackage.u60 r18, int r19, long r20, long r22, defpackage.nq4 r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r24
            boolean r2 = r1 instanceof defpackage.cr5
            if (r2 == 0) goto L18
            r2 = r1
            cr5 r2 = (defpackage.cr5) r2
            int r3 = r2.j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.j = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            cr5 r2 = new cr5
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r9.h
            int r2 = r9.j
            r3 = 0
            r4 = 2
            r5 = 1
            hu4 r10 = defpackage.hu4.a
            if (r2 == 0) goto L48
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            defpackage.ch3.d0(r1)
            goto L83
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r3
        L37:
            long r5 = r9.g
            long r7 = r9.f
            int r2 = r9.e
            u60 r11 = r9.d
            defpackage.ch3.d0(r1)
            r15 = r7
            r8 = r2
            r2 = r11
            r11 = r15
            r6 = r5
            goto L6d
        L48:
            defpackage.ch3.d0(r1)
            sua r1 = r0.j()
            pjh r2 = r0.a
            long r6 = r2.a
            r2 = r18
            r9.d = r2
            r8 = r19
            r9.e = r8
            r11 = r20
            r9.f = r11
            r13 = r22
            r9.g = r13
            r9.j = r5
            java.lang.Object r1 = r1.f(r6, r9)
            if (r1 != r10) goto L6c
            goto L82
        L6c:
            r6 = r13
        L6d:
            sfa r1 = (defpackage.sfa) r1
            r9.d = r3
            r9.e = r8
            r9.f = r11
            r9.g = r6
            r9.j = r4
            r3 = r8
            r8 = 0
            r4 = r11
            java.lang.Object r0 = r0.r(r1, r2, r3, r4, r6, r8, r9)
            if (r0 != r10) goto L83
        L82:
            return r10
        L83:
            sbi r0 = defpackage.sbi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er5.q(u60, int, long, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0166  */
    /* JADX WARN: Code duplicated, block: B:48:0x0169  */
    /* JADX WARN: Code duplicated, block: B:49:0x018e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0194  */
    /* JADX WARN: Code duplicated, block: B:52:0x0197  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01af  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public final Object r(sfa sfaVar, u60 u60Var, int i, long j, long j2, File file, nq4 nq4Var) {
        dr5 dr5Var;
        e70 e70VarQ;
        sbi sbiVar;
        e70 e70Var;
        sfa sfaVar2;
        u60 u60Var2;
        e70 e70Var2;
        long j3;
        long j4;
        long j5;
        e70 e70Var3;
        int iOrdinal;
        j60 j60Var;
        Long l;
        Long l2;
        sfa sfaVar3 = sfaVar;
        int i2 = i;
        long j6 = j;
        long j7 = j2;
        sbi sbiVar2 = sbi.a;
        if (nq4Var instanceof dr5) {
            dr5Var = (dr5) nq4Var;
            int i3 = dr5Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dr5Var.l = i3 - Integer.MIN_VALUE;
            } else {
                dr5Var = new dr5(this, nq4Var);
            }
        } else {
            dr5Var = new dr5(this, nq4Var);
        }
        dr5 dr5Var2 = dr5Var;
        Object obj = dr5Var2.j;
        Object obj2 = hu4.a;
        int i4 = dr5Var2.l;
        int i5 = 2;
        if (i4 != 0) {
            if (i4 == 1) {
                j3 = dr5Var2.i;
                e70Var2 = dr5Var2.f;
                sfa sfaVar4 = dr5Var2.d;
                ch3.d0(obj);
                sfaVar3 = sfaVar4;
                this.u = lq5.a;
                ((i50) this.l.getValue()).a(new l5e(sfaVar3.a, j3, e70Var2.t, null));
                return sbiVar2;
            }
            if (i4 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j8 = dr5Var2.i;
            j6 = dr5Var2.h;
            int i6 = dr5Var2.g;
            e70 e70Var4 = dr5Var2.f;
            u60 u60Var3 = dr5Var2.e;
            sfa sfaVar5 = dr5Var2.d;
            ch3.d0(obj);
            u60Var2 = u60Var3;
            sfaVar2 = sfaVar5;
            sbiVar = sbiVar2;
            e70Var = e70Var4;
            i2 = i6;
            j7 = j8;
            j4 = j6;
            j5 = j7;
            e70Var3 = e70Var;
            iOrdinal = u60Var2.ordinal();
            if (iOrdinal != i5) {
                ((i50) this.l.getValue()).a(new n5e(sfaVar2.a, e70Var3.w, e70Var3.t, null));
            } else if (iOrdinal != 4) {
                ((i50) this.l.getValue()).a(new l5e(sfaVar2.a, e70Var3.w, e70Var3.t, null));
            } else {
                if (e70Var3.c()) {
                    j60Var = e70Var3.j;
                } else {
                    j60Var = null;
                }
                i50 i50Var = (i50) this.l.getValue();
                long j9 = sfaVar2.a;
                float f = i2;
                if (j60Var != null) {
                    l = new Long(j60Var.a);
                } else {
                    l = null;
                }
                if (j60Var != null) {
                    l2 = new Long(j60Var.b);
                } else {
                    l2 = null;
                }
                i50Var.a(new k5e(j9, j5, f, j4, l, l2, e70Var3.t, null));
            }
            ((t51) this.h.getValue()).c(new kfi(sfaVar2.h, sfaVar2.a, false));
            return sbiVar;
        }
        ch3.d0(obj);
        if (sfaVar3 == null || sfaVar3.j == wja.DELETED || (e70VarQ = cqk.q(sfaVar3, this.a.b)) == null) {
            return sbiVar2;
        }
        if (e70VarQ.q.a() && !u60Var.a()) {
            gm0.Y(this.o, "File download. updateAttachStatus: cancelled!");
            dr5Var2.d = sfaVar3;
            dr5Var2.e = null;
            dr5Var2.f = e70VarQ;
            dr5Var2.g = i2;
            dr5Var2.h = j6;
            dr5Var2.i = j7;
            dr5Var2.l = 1;
            if (h(dr5Var2) == obj2) {
                return obj2;
            }
            e70Var2 = e70VarQ;
            j3 = j7;
            this.u = lq5.a;
            ((i50) this.l.getValue()).a(new l5e(sfaVar3.a, j3, e70Var2.t, null));
            return sbiVar2;
        }
        this.q = i2;
        sfe sfeVar = new sfe();
        sbiVar = sbiVar2;
        e70Var = e70VarQ;
        ((qfa) j().f.getValue()).n(this.a.a, e70VarQ.t, new nua(0, new kq5(u60Var, i2, j6, j7, file, this, sfeVar)));
        if (sfeVar.a && ((Boolean) ((e5d) this.n.getValue()).R3.a(e5d.S6[253]).i()).booleanValue()) {
            ct9 ct9Var = (ct9) this.g.getValue();
            long j10 = this.a.a;
            String str = e70Var.t;
            sfaVar2 = sfaVar;
            dr5Var2.d = sfaVar2;
            u60Var2 = u60Var;
            dr5Var2.e = u60Var2;
            dr5Var2.f = e70Var;
            dr5Var2.g = i2;
            dr5Var2.h = j6;
            dr5Var2.i = j7;
            i5 = 2;
            dr5Var2.l = 2;
            if (ct9Var.c(j10, dr5Var2, str) == obj2) {
                return obj2;
            }
        } else {
            sfaVar2 = sfaVar;
            u60Var2 = u60Var;
            i5 = 2;
        }
        j4 = j6;
        j5 = j7;
        e70Var3 = e70Var;
        iOrdinal = u60Var2.ordinal();
        if (iOrdinal != i5) {
            ((i50) this.l.getValue()).a(new n5e(sfaVar2.a, e70Var3.w, e70Var3.t, null));
        } else if (iOrdinal != 4) {
            ((i50) this.l.getValue()).a(new l5e(sfaVar2.a, e70Var3.w, e70Var3.t, null));
        } else {
            if (e70Var3.c()) {
                j60Var = e70Var3.j;
            } else {
                j60Var = null;
            }
            i50 i50Var2 = (i50) this.l.getValue();
            long j11 = sfaVar2.a;
            float f2 = i2;
            if (j60Var != null) {
                l = new Long(j60Var.a);
            } else {
                l = null;
            }
            if (j60Var != null) {
                l2 = new Long(j60Var.b);
            } else {
                l2 = null;
            }
            i50Var2.a(new k5e(j11, j5, f2, j4, l, l2, e70Var3.t, null));
        }
        ((t51) this.h.getValue()).c(new kfi(sfaVar2.h, sfaVar2.a, false));
        return sbiVar;
    }
}
