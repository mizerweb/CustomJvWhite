package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class azd {
    public static final /* synthetic */ int p = 0;
    public final ny8 a;
    public final ny8 b;
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
    public final ny8 o;

    public azd(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = ny8Var7;
        this.h = ny8Var8;
        this.i = ny8Var9;
        this.j = ny8Var10;
        this.k = ny8Var11;
        this.l = ny8Var12;
        this.m = ny8Var13;
        this.n = ny8Var14;
        this.o = ny8Var15;
    }

    public final boolean a() {
        if (((gue) this.b.getValue()).e()) {
            return true;
        }
        ny8 ny8Var = this.a;
        if (((od4) ny8Var.getValue()).d()) {
            return true;
        }
        return ((((od4) ny8Var.getValue()).c() && ((od4) ny8Var.getValue()).a().d()) || ((od4) ny8Var.getValue()).b()) ? false : true;
    }

    public final boolean b(ilb ilbVar, long j) {
        if (((svb) this.k.getValue()).b()) {
            return false;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return true;
        }
        je9 je9Var = je9.f;
        if (!a4cVar.b(je9Var)) {
            return true;
        }
        a4cVar.c(je9Var, "azd", "onMessagePush: skipped, not authorized: chatRef=" + ilbVar + ", messageId=" + j, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(xn6 xn6Var, hn6 hn6Var, nq4 nq4Var) {
        xyd xydVar;
        if (nq4Var instanceof xyd) {
            xydVar = (xyd) nq4Var;
            int i = xydVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xydVar.f = i - Integer.MIN_VALUE;
            } else {
                xydVar = new xyd(this, nq4Var);
            }
        } else {
            xydVar = new xyd(this, nq4Var);
        }
        Object obj = xydVar.d;
        int i2 = xydVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                yob yobVar = (yob) this.i.getValue();
                xydVar.f = 1;
                Object objI = yobVar.i(xn6Var, hn6Var, xydVar);
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V("azd", "notifyTracker: failed", new wyd(th));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x013e A[PHI: r0 r3
  0x013e: PHI (r0v6 syd) = (r0v5 syd), (r0v5 syd), (r0v16 syd) binds: [B:48:0x010e, B:50:0x013b, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]
  0x013e: PHI (r3v5 xn6) = (r3v4 xn6), (r3v4 xn6), (r3v9 xn6) binds: [B:48:0x010e, B:50:0x013b, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0162 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object d(xn6 xn6Var, hn6 hn6Var, syd sydVar, nq4 nq4Var) {
        yyd yydVar;
        hn6 hn6Var2;
        syd sydVar2;
        xn6 xn6Var2;
        syd sydVar3;
        v45 v45Var;
        long j;
        boolean z;
        String str;
        Object objK;
        xn6 xn6Var3 = xn6Var;
        je9 je9Var = je9.d;
        Object obj = sbi.a;
        if (nq4Var instanceof yyd) {
            yydVar = (yyd) nq4Var;
            int i = yydVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                yydVar.i = i - Integer.MIN_VALUE;
            } else {
                yydVar = new yyd(this, nq4Var);
            }
        } else {
            yydVar = new yyd(this, nq4Var);
        }
        yyd yydVar2 = yydVar;
        Object obj2 = yydVar2.g;
        Object obj3 = hu4.a;
        int i2 = yydVar2.i;
        if (i2 == 0) {
            ch3.d0(obj2);
            if (!b(xn6Var3.a, xn6Var3.b)) {
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "azd", "onMessagePush: chatRef=" + xn6Var3.a + ", messageId=" + xn6Var3.b, null);
                }
                pnb pnbVar = (pnb) this.h.getValue();
                yydVar2.d = xn6Var3;
                hn6Var2 = hn6Var;
                yydVar2.e = hn6Var2;
                sydVar2 = sydVar;
                yydVar2.f = sydVar2;
                yydVar2.i = 1;
                Object objI = ch3.I(yydVar2, pnbVar.a, false, true, new iaa(pnbVar, 18, xn6Var3));
                if (objI != obj3) {
                    objI = obj;
                }
                if (objI != obj3) {
                }
                return obj3;
            }
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "azd", "Early return in onMessagePush cuz of isNotAuth(" + xn6Var3.a + ", " + xn6Var3.b + ")", null);
                return obj;
            }
            return obj;
        }
        if (i2 == 1) {
            syd sydVar4 = yydVar2.f;
            hn6Var2 = yydVar2.e;
            xn6 xn6Var4 = yydVar2.d;
            ch3.d0(obj2);
            sydVar2 = sydVar4;
            xn6Var3 = xn6Var4;
        } else {
            if (i2 == 2) {
                sydVar3 = yydVar2.f;
                xn6Var2 = yydVar2.d;
                ch3.d0(obj2);
                if (xn6Var2.a.a()) {
                    v45Var = (v45) this.d.getValue();
                    j = xn6Var2.a.a;
                    z = !((gue) this.b.getValue()).e();
                    str = xn6Var2.n;
                    yydVar2.d = xn6Var2;
                    yydVar2.e = null;
                    yydVar2.f = sydVar3;
                    yydVar2.i = 3;
                    if (v45Var.b(j, z, str, yydVar2) != obj3) {
                    }
                }
                return obj3;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    ch3.d0(obj2);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sydVar3 = yydVar2.f;
            xn6Var2 = yydVar2.d;
            ch3.d0(obj2);
        }
        f(false, a());
        yydVar2.d = null;
        yydVar2.e = null;
        yydVar2.f = null;
        yydVar2.i = 4;
        objK = cqk.k(new uf3(xn6Var2, this, sydVar3, (lq4) null, 7), yydVar2);
        if (objK != obj3) {
            objK = obj;
        }
        if (objK == obj3) {
            return obj3;
        }
        return obj;
        yydVar2.d = xn6Var3;
        yydVar2.e = null;
        yydVar2.f = sydVar2;
        yydVar2.i = 2;
        if (c(xn6Var3, hn6Var2, yydVar2) != obj3) {
            xn6Var2 = xn6Var3;
            sydVar3 = sydVar2;
            if (xn6Var2.a.a()) {
                v45Var = (v45) this.d.getValue();
                j = xn6Var2.a.a;
                z = !((gue) this.b.getValue()).e();
                str = xn6Var2.n;
                yydVar2.d = xn6Var2;
                yydVar2.e = null;
                yydVar2.f = sydVar3;
                yydVar2.i = 3;
                if (v45Var.b(j, z, str, yydVar2) != obj3) {
                    f(false, a());
                    yydVar2.d = null;
                    yydVar2.e = null;
                    yydVar2.f = null;
                    yydVar2.i = 4;
                    objK = cqk.k(new uf3(xn6Var2, this, sydVar3, (lq4) null, 7), yydVar2);
                    if (objK != obj3) {
                        objK = obj;
                    }
                    if (objK == obj3) {
                        return obj;
                    }
                }
            } else {
                f(false, a());
                yydVar2.d = null;
                yydVar2.e = null;
                yydVar2.f = null;
                yydVar2.i = 4;
                objK = cqk.k(new uf3(xn6Var2, this, sydVar3, (lq4) null, 7), yydVar2);
                if (objK != obj3) {
                    objK = obj;
                }
                if (objK == obj3) {
                    return obj;
                }
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        if (r6.b(r7, r9, null, r11) == r5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wn6 r22, defpackage.nq4 r23) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azd.e(wn6, nq4):java.lang.Object");
    }

    public final void f(boolean z, boolean z2) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "azd", zo5.q("onPush: callPush=", ", forceConnection=", z, z2), null);
            }
        }
        xb9 xb9Var = ((zed) this.c.getValue()).a;
        xb9Var.E.B(xb9Var, s7f.j0[27], Long.valueOf(System.currentTimeMillis()));
        if (z2) {
            ((zed) this.c.getValue()).a.D(true);
            j0d j0dVar = (j0d) this.m.getValue();
            ((pvb) j0dVar.d.getValue()).A(((gn8) j0dVar.e.getValue()).a());
            ((dkh) this.e.getValue()).a();
        }
    }
}
