package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class lxe implements oqg {
    public final Context a;
    public final ny8 b;
    public final dq4 d;
    public final ifh e;
    public final ifh h;
    public final ifh j;
    public final i64 c = new i64();
    public final String f = "RuStore";
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final String k = "RuStore";
    public final syd l = syd.RUSTORE;

    public lxe(Context context, xhh xhhVar, gu4 gu4Var, ny8 ny8Var) {
        this.a = context;
        this.b = ny8Var;
        this.d = cqk.D(gu4Var, ((n0c) xhhVar).b());
        this.e = new ifh(new fu(ny8Var, 13));
        final int i = 0;
        this.h = new ifh(new af7(this) { // from class: fxe
            public final /* synthetic */ lxe b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                lxe lxeVar = this.b;
                switch (i2) {
                    case 0:
                        ljh ljhVarF = er3.F();
                        ljhVarF.d(new gxe(lxeVar, 2));
                        ljhVarF.c(new gxe(lxeVar, 0));
                        return ljhVarF;
                    default:
                        ljh ljhVarC = er3.c();
                        ljhVarC.d(new gxe(lxeVar, 3));
                        ljhVarC.c(new gxe(lxeVar, 1));
                        return ljhVarC;
                }
            }
        });
        final int i2 = 1;
        this.j = new ifh(new af7(this) { // from class: fxe
            public final /* synthetic */ lxe b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                lxe lxeVar = this.b;
                switch (i3) {
                    case 0:
                        ljh ljhVarF = er3.F();
                        ljhVarF.d(new gxe(lxeVar, 2));
                        ljhVarF.c(new gxe(lxeVar, 0));
                        return ljhVarF;
                    default:
                        ljh ljhVarC = er3.c();
                        ljhVarC.d(new gxe(lxeVar, 3));
                        ljhVarC.c(new gxe(lxeVar, 1));
                        return ljhVarC;
                }
            }
        });
    }

    @Override // defpackage.oqg
    public final String a() {
        return (String) ((ljh) this.h.getValue()).e();
    }

    @Override // defpackage.oqg
    public final String b() {
        return this.k;
    }

    @Override // defpackage.oqg
    public final int c() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r8 == r6) goto L30;
     */
    @Override // defpackage.oqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.lq4 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ixe
            if (r0 == 0) goto L13
            r0 = r8
            ixe r0 = (defpackage.ixe) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L1a
        L13:
            ixe r0 = new ixe
            nq4 r8 = (defpackage.nq4) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.d
            int r1 = r0.f
            r2 = 3
            r3 = 1
            r4 = 2
            r5 = 0
            hu4 r6 = defpackage.hu4.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r4) goto L30
            defpackage.ch3.d0(r8)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            goto L71
        L2e:
            r8 = move-exception
            goto L79
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r5
        L36:
            defpackage.ch3.d0(r8)
            goto L48
        L3a:
            defpackage.ch3.d0(r8)
            r0.f = r3
            i64 r8 = r7.c
            java.lang.Object r8 = r8.p(r0)
            if (r8 != r6) goto L48
            goto L70
        L48:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L56
            nqg r7 = new nqg
            r7.<init>(r5, r2)
            return r7
        L56:
            java.util.concurrent.atomic.AtomicReference r8 = r7.g     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            if (r8 != 0) goto L73
            ifh r8 = r7.h     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            ljh r8 = (defpackage.ljh) r8     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            r0.f = r4     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            java.lang.Object r8 = defpackage.upl.b(r8, r0)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            if (r8 != r6) goto L71
        L70:
            return r6
        L71:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
        L73:
            nqg r0 = new nqg     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            r0.<init>(r8, r4)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L86
            return r0
        L79:
            java.lang.String r7 = r7.k
            java.lang.String r0 = "getPushToken() fail"
            defpackage.gm0.V(r7, r0, r8)
            nqg r7 = new nqg
            r7.<init>(r5, r2)
            return r7
        L86:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxe.d(lq4):java.lang.Object");
    }

    @Override // defpackage.oqg
    public final boolean e() {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) this.c.z()).booleanValue();
        } catch (IllegalStateException unused) {
            zBooleanValue = false;
        }
        if (!zBooleanValue) {
            return false;
        }
        go6 go6Var = (go6) this.i.get();
        if (go6Var == null) {
            go6Var = (go6) ((ljh) this.j.getValue()).e();
        }
        return go6Var instanceof eo6;
    }

    @Override // defpackage.oqg
    public final syd f() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.oqg
    public final Object g(lq4 lq4Var) {
        jxe jxeVar;
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof jxe) {
            jxeVar = (jxe) lq4Var;
            int i = jxeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jxeVar.f = i - Integer.MIN_VALUE;
            } else {
                jxeVar = new jxe(this, (nq4) lq4Var);
            }
        } else {
            jxeVar = new jxe(this, (nq4) lq4Var);
        }
        Object obj = jxeVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = jxeVar.f;
        int i3 = 1;
        lq4 lq4Var2 = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            String name = lxe.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "initialize in " + Thread.currentThread().getName(), null);
                }
            }
            if (((owe) this.e.getValue()).a == 0) {
                this.c.Q(Boolean.FALSE);
                gm0.x(lxe.class.getName(), "ignore initialize", null);
                return sbiVar;
            }
            er3.G((Application) this.a.getApplicationContext(), "QWXdyVYexj34nwb1jWO-ry23UraaDbdX", new ac5(this.f, i3));
            this.c.Q(Boolean.TRUE);
            ghb ghbVar = ew5.b;
            long jO = qe7.O(30, lw5.SECONDS);
            ur8 ur8Var = new ur8(this, lq4Var2, 28);
            jxeVar.f = 1;
            Object objM0 = lvb.M0(jO, ur8Var, jxeVar);
            return objM0 == hu4Var ? hu4Var : objM0;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            boolean zBooleanValue = ((Boolean) ((e5d) this.b.getValue()).p().i()).booleanValue();
            String str = this.f;
            if (zBooleanValue) {
                gm0.V(str, "initialize fail", new mxe(th, "initialize fail"));
            } else {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str, "initialize fail", th);
                    }
                }
            }
            return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.oqg
    public final Object h(lq4 lq4Var) throws Throwable {
        hxe hxeVar;
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof hxe) {
            hxeVar = (hxe) lq4Var;
            int i = hxeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hxeVar.f = i - Integer.MIN_VALUE;
            } else {
                hxeVar = new hxe(this, (nq4) lq4Var);
            }
        } else {
            hxeVar = new hxe(this, (nq4) lq4Var);
        }
        Object objP = hxeVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = hxeVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objP);
                i64 i64Var = this.c;
                hxeVar.f = 1;
                objP = i64Var.p(hxeVar);
                if (objP != hu4Var) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    ch3.d0(objP);
                    return objP;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objP);
            if (!((Boolean) objP).booleanValue()) {
                gm0.Y(this.f, "deletePushToken ignored");
                return sbiVar;
            }
            ljh ljhVarD = er3.D();
            hxeVar.f = 2;
            Object objB = upl.b(ljhVarD, hxeVar);
            return objB == hu4Var ? hu4Var : objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            boolean zBooleanValue = ((Boolean) ((e5d) this.b.getValue()).p().i()).booleanValue();
            String str = this.f;
            if (zBooleanValue) {
                gm0.V(str, "RuStorePushClient.deleteToken() fail", new mxe(th, "RuStorePushClient.deleteToken() fail"));
            } else {
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "RuStorePushClient.deleteToken() fail", th);
                    }
                }
            }
            return sbiVar;
        }
    }

    @Override // defpackage.oqg
    public final int i() {
        return 0;
    }
}
