package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class kf9 extends aq implements qih {
    public final int f;
    public final byte[] g;
    public final String h;
    public final String i;
    public final pih j;
    public long k;

    public kf9(long j, int i, Long l, byte[] bArr, String str) {
        super(j);
        this.f = i;
        this.g = bArr;
        this.h = str;
        String name = kf9.class.getName();
        this.i = name;
        gm0.n(name, "Creating Login task");
        this.j = new pih();
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return true;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        nf9 nf9Var = (nf9) kihVar;
        bq bqVar = this.e;
        lq4 lq4Var = null;
        if (bqVar == null) {
            bqVar = null;
        }
        wmi wmiVarL = bqVar.l();
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        yab.i0(wmiVarL, ((n0c) bqVar2.h()).a(), 0, new af8(this, nf9Var, lq4Var, 9), 2);
    }

    @Override // defpackage.qih
    public final pih c() {
        return this.j;
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        ((eg9) bqVar.m.getValue()).a(yhhVar, 0);
    }

    @Override // defpackage.qih
    public final Object i(yhh yhhVar, nq4 nq4Var) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        Object objV = qyj.V(((n0c) bqVar.h()).a(), new dx4(this, 27, yhhVar), nq4Var);
        return objV == hu4.a ? objV : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x022f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0245  */
    @Override // defpackage.aq
    public final Object m() {
        byte[] bArr;
        char c;
        zed zedVar;
        char c2;
        ug6 ug6Var;
        Throwable th;
        long j;
        String str;
        String str2;
        bq bqVar;
        String str3;
        bq bqVar2;
        long jLongValue;
        bq bqVar3;
        String strC;
        String name;
        a4c a4cVar;
        je9 je9Var = je9.d;
        bq bqVar4 = this.e;
        if (bqVar4 == null) {
            bqVar4 = null;
        }
        dh3 dh3Var = (dh3) bqVar4.p0.getValue();
        dh3Var.getClass();
        try {
            int iK = dh3Var.b.heightPixels / gm0.K(80.0f * Math.max(dh3Var.b.density, 1.0f));
            int i = 50;
            if (iK > 50) {
                iK = 50;
            }
            int i2 = 12;
            if (((wd4) dh3Var.a.getValue()).h()) {
                int iOrdinal = ((wd4) dh3Var.a.getValue()).a().ordinal();
                if (iOrdinal == 0) {
                    i = 20;
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i = 12;
                    } else if (iOrdinal == 3) {
                        i = 20;
                    } else if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                i2 = i;
            }
            bArr = new byte[]{(byte) iK, (byte) i2};
        } catch (Throwable th2) {
            String str4 = dh3.c;
            bh3 bh3Var = new bh3(th2);
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str4, "failed to count chats for login", bh3Var);
                }
            }
            bArr = null;
        }
        ug6 ug6Var2 = new ug6(bArr);
        zed zedVarT = t();
        xb9 xb9Var = zedVarT.a;
        this.k = xb9Var.x();
        long j2 = xb9Var.j();
        String name2 = kf9.class.getName();
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 == null) {
            zedVar = zedVarT;
            c = '$';
        } else if (a4cVar3.b(je9Var)) {
            c = '$';
            String strK = vd7.K(new Long(this.k));
            String strK2 = vd7.K(new Long(((Number) xb9Var.N.m(xb9Var, s7f.j0[36])).longValue()));
            String strK3 = vd7.K(new Long(j2));
            StringBuilder sbQ = qv1.q("LoginApiTask: chatsLastSync = ", strK, ", lastChatMarker = ", strK2, ", contactLastSync = ");
            sbQ.append(strK3);
            a4cVar3.c(je9Var, name2, sbQ.toString(), null);
            zedVar = zedVarT;
        } else {
            c = '$';
            zedVar = zedVarT;
        }
        b5d b5dVar = zedVar.b.M;
        zv8[] zv8VarArr = e5d.S6;
        String str5 = (String) b5dVar.a(zv8VarArr[31]).i();
        int i3 = zedVar.b.b().a.q().getInt("version", 1);
        String str6 = this.i;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null) {
            c2 = 31;
            je9 je9Var3 = je9.e;
            ug6Var = ug6Var2;
            if (a4cVar4.b(je9Var3)) {
                str5 = str5;
                th = null;
                a4cVar4.c(je9Var3, str6, zo5.h(i3, "version="), null);
            }
            if (i3 < 7) {
                zedVar.b.b().a.M.a(zv8VarArr[c2]).a(th);
                if (i3 != 6) {
                    name = kf9.class.getName();
                    a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "LoginApiTask: clear chatsLastSync and lastChatMarker", th);
                    }
                    j = 0;
                    this.k = 0L;
                    gm0.n(xb9Var.c, "clear chatsLastSync");
                    gvb gvbVar = xb9Var.c0;
                    zv8[] zv8VarArr2 = s7f.j0;
                    gvbVar.B(xb9Var, zv8VarArr2[51], 0L);
                    xb9Var.N.B(xb9Var, zv8VarArr2[c], 0L);
                } else {
                    j = 0;
                }
                zedVar.b.b().a.q().edit().putInt("version", 7).commit();
                str = null;
            } else {
                j = 0;
                str = str5;
            }
            str2 = this.h;
            if (str2 == null) {
                bqVar3 = this.e;
                if (bqVar3 == null) {
                    bqVar3 = null;
                }
                strC = ((svb) bqVar3.f.getValue()).c();
                if (strC != null) {
                    ore.p("Required value was null.");
                    return null;
                }
                str3 = strC;
                bqVar = null;
            } else {
                bqVar = null;
                str3 = str2;
            }
            bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = bqVar;
            }
            boolean zA = ((gn8) bqVar2.l0.getValue()).a();
            int i4 = this.f;
            byte[] bArr2 = this.g;
            long j3 = this.k;
            long jI = xb9Var.i();
            long jLongValue2 = ((Number) xb9Var.M.m(xb9Var, s7f.j0[35])).longValue();
            if (zedVar.b.a().u()) {
                jLongValue = ((Number) xb9Var.O0.m(xb9Var, xb9.g1[32])).longValue();
            } else {
                jLongValue = j;
            }
            return new mf9(str3, zA, i4, bArr2, j3, j2, str, jI, jLongValue2, jLongValue, ug6Var);
        }
        ug6Var = ug6Var2;
        c2 = 31;
        th = null;
        if (i3 < 7) {
            zedVar.b.b().a.M.a(zv8VarArr[c2]).a(th);
            if (i3 != 6) {
                name = kf9.class.getName();
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4cVar.c(je9Var, name, "LoginApiTask: clear chatsLastSync and lastChatMarker", th);
                }
                j = 0;
                this.k = 0L;
                gm0.n(xb9Var.c, "clear chatsLastSync");
                gvb gvbVar2 = xb9Var.c0;
                zv8[] zv8VarArr3 = s7f.j0;
                gvbVar2.B(xb9Var, zv8VarArr3[51], 0L);
                xb9Var.N.B(xb9Var, zv8VarArr3[c], 0L);
            } else {
                j = 0;
            }
            zedVar.b.b().a.q().edit().putInt("version", 7).commit();
            str = null;
        } else {
            j = 0;
            str = str5;
        }
        str2 = this.h;
        if (str2 == null) {
            bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            strC = ((svb) bqVar3.f.getValue()).c();
            if (strC != null) {
                ore.p("Required value was null.");
                return null;
            }
            str3 = strC;
            bqVar = null;
        } else {
            bqVar = null;
            str3 = str2;
        }
        bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = bqVar;
        }
        boolean zA2 = ((gn8) bqVar2.l0.getValue()).a();
        int i5 = this.f;
        byte[] bArr3 = this.g;
        long j4 = this.k;
        long jI2 = xb9Var.i();
        long jLongValue3 = ((Number) xb9Var.M.m(xb9Var, s7f.j0[35])).longValue();
        if (zedVar.b.a().u()) {
            jLongValue = ((Number) xb9Var.O0.m(xb9Var, xb9.g1[32])).longValue();
        } else {
            jLongValue = j;
        }
        return new mf9(str3, zA2, i5, bArr3, j4, j2, str, jI2, jLongValue3, jLongValue, ug6Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r14 == r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r14.i(r0.a, r10) == r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        return r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    @Override // defpackage.qih
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.nf9 r15, defpackage.nq4 r16) {
        /*
            r14 = this;
            r0 = r16
            boolean r1 = r0 instanceof defpackage.jf9
            if (r1 == 0) goto L16
            r1 = r0
            jf9 r1 = (defpackage.jf9) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.g = r2
        L14:
            r10 = r1
            goto L1c
        L16:
            jf9 r1 = new jf9
            r1.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r10.e
            int r1 = r10.g
            r11 = 2
            r2 = 1
            r12 = 0
            hu4 r13 = defpackage.hu4.a
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r11) goto L30
            defpackage.ch3.d0(r0)
            goto L98
        L30:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r14)
            return r12
        L36:
            int r1 = r10.d
            defpackage.ch3.d0(r0)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            goto L98
        L3c:
            r0 = move-exception
            goto L65
        L3e:
            defpackage.ch3.d0(r0)
            r1 = 0
            bq r0 = r14.e     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            if (r0 == 0) goto L47
            goto L48
        L47:
            r0 = r12
        L48:
            ny8 r0 = r0.j     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            jg9 r0 = (defpackage.jg9) r0     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            long r3 = r14.a     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            long r6 = r14.k     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            int r8 = r14.f     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            java.lang.String r9 = r14.h     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            r10.d = r1     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            r10.g = r2     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            r5 = r15
            r2 = r0
            java.lang.Object r14 = r2.g(r3, r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L9b
            if (r14 != r13) goto L98
            goto L77
        L65:
            boolean r2 = r0 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r2 == 0) goto L78
            ru.ok.tamtam.errors.TamErrorException r0 = (ru.ok.tamtam.errors.TamErrorException) r0
            r10.d = r1
            r10.g = r11
            yhh r0 = r0.a
            java.lang.Object r14 = r14.i(r0, r10)
            if (r14 != r13) goto L98
        L77:
            return r13
        L78:
            one.me.sdk.tasks.login.LoginException r1 = new one.me.sdk.tasks.login.LoginException
            r1.<init>(r0)
            java.lang.String r2 = r14.i
            java.lang.String r3 = "login failed"
            defpackage.gm0.V(r2, r3, r1)
            bq r14 = r14.e
            if (r14 == 0) goto L89
            r12 = r14
        L89:
            rg9 r14 = r12.a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            mg9 r1 = defpackage.mg9.LOGIN_WORK_UNKNOWN
            r14.D(r1, r0)
        L98:
            sbi r14 = defpackage.sbi.a
            return r14
        L9b:
            r0 = move-exception
            r14 = r0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf9.k(nf9, nq4):java.lang.Object");
    }
}
