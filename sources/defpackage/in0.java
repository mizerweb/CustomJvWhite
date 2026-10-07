package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import one.me.background.wake.BackgroundCheckReceiver;
import one.me.background.wake.BackgroundListenService;

/* JADX INFO: loaded from: classes.dex */
public final class in0 implements ou {
    public final Application a;
    public final ite b;
    public final xhh c;
    public final pfh d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public volatile boolean i;
    public final gjg j;
    public volatile sgg k;

    public in0(Application application, ny8 ny8Var, e5d e5dVar, ny8 ny8Var2, ny8 ny8Var3, ite iteVar, xhh xhhVar, ny8 ny8Var4, eh9 eh9Var) {
        pfh pfhVar = new pfh(2);
        this.a = application;
        this.b = iteVar;
        this.c = xhhVar;
        this.d = pfhVar;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        gjg gjgVarH = e5dVar.D4.a(e5d.S6[291]).h();
        this.j = gjgVarH;
        lq4 lq4Var = null;
        new fh9(iteVar, eh9Var, new ym0(this, lq4Var, 0)).a();
        e9i.j0(new fz6(gjgVarH, new y73(this, lq4Var, 1), 3), iteVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.f(r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.in0 r5, defpackage.nq4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.an0
            if (r0 == 0) goto L13
            r0 = r6
            an0 r0 = (defpackage.an0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            an0 r0 = new an0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            hu4 r4 = defpackage.hu4.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            defpackage.ch3.d0(r6)
            roe r6 = (defpackage.roe) r6
            r6.getClass()
            goto L56
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r5)
            r5 = 0
            return r5
        L36:
            defpackage.ch3.d0(r6)
            goto L4d
        L3a:
            defpackage.ch3.d0(r6)
            java.lang.String r6 = "KeepBackground"
            java.lang.String r1 = "start handleBackground"
            defpackage.gm0.n(r6, r1)
            r0.f = r3
            java.lang.Object r6 = r5.i(r0)
            if (r6 != r4) goto L4d
            goto L55
        L4d:
            r0.f = r2
            java.lang.Object r5 = r5.f(r0)
            if (r5 != r4) goto L56
        L55:
            return r4
        L56:
            sbi r5 = defpackage.sbi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in0.a(in0, nq4):java.lang.Object");
    }

    public static final Object b(in0 in0Var, mdh mdhVar) {
        Object objK0 = yab.K0(((n0c) in0Var.c).c().S0(), new bn0(in0Var, null, 0), mdhVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public static final void c(in0 in0Var, gu4 gu4Var, String str) {
        sgg sggVar = in0Var.k;
        lq4 lq4Var = null;
        if (sggVar == null || !sggVar.isActive()) {
            in0Var.k = yab.i0(gu4Var, ((n0c) in0Var.c).c().S0(), 0, new i26(in0Var, str, lq4Var, 10), 2);
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "KeepBackground", str.concat(": ignore stop service because we in timeout now"), null);
        }
    }

    public final gue d() {
        return (gue) this.g.getValue();
    }

    public final boolean e() {
        s7f s7fVar = (s7f) ((et3) this.e.getValue());
        return ((Boolean) s7fVar.e0.m(s7fVar, s7f.j0[53])).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) {
        fn0 fn0Var;
        if (nq4Var instanceof fn0) {
            fn0Var = (fn0) nq4Var;
            int i = fn0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fn0Var.f = i - Integer.MIN_VALUE;
            } else {
                fn0Var = new fn0(this, nq4Var);
            }
        } else {
            fn0Var = new fn0(this, nq4Var);
        }
        Object objK0 = fn0Var.d;
        int i2 = fn0Var.f;
        lq4 lq4Var = null;
        int i3 = 1;
        if (i2 == 0) {
            ch3.d0(objK0);
            lk9 lk9VarS0 = ((n0c) this.c).c().S0();
            bn0 bn0Var = new bn0(this, lq4Var, i3);
            fn0Var.f = 1;
            objK0 = yab.K0(lk9VarS0, bn0Var, fn0Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object g(Context context, nq4 nq4Var) {
        gn0 gn0Var;
        long j;
        if (nq4Var instanceof gn0) {
            gn0Var = (gn0) nq4Var;
            int i = gn0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gn0Var.g = i - Integer.MIN_VALUE;
            } else {
                gn0Var = new gn0(this, nq4Var);
            }
        } else {
            gn0Var = new gn0(this, nq4Var);
        }
        Object obj = gn0Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = gn0Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            xm0 xm0Var = (xm0) this.j.getValue();
            if (xm0Var instanceof vm0) {
                ghb ghbVar = ew5.b;
                long jP = qe7.P(((vm0) xm0Var).b, lw5.MINUTES);
                AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) BackgroundCheckReceiver.class), 201326592);
                long jP2 = ew5.p(this.d.m(), jP);
                xt4 xt4VarB = ((n0c) this.c).b();
                zw9 zw9Var = new zw9(alarmManager, jP2, broadcast, (lq4) null, 1);
                gn0Var.d = jP;
                gn0Var.g = 1;
                if (yab.K0(xt4VarB, zw9Var, gn0Var) == hu4Var) {
                    return hu4Var;
                }
                j = jP;
            } else {
                if (!(xm0Var instanceof sm0)) {
                    ore.o();
                    return null;
                }
                gm0.n("KeepBackground", "scheduleExactAlarm: skipped, feature disabled");
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = gn0Var.d;
        ch3.d0(obj);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "KeepBackground", c0a.o("scheduleExactAlarm: set in ", ew5.t(ew5.e(1000, j)), "s"), null);
            }
        }
        return sbi.a;
    }

    @Override // defpackage.ou
    public final void h(long j) {
        gm0.n("KeepBackground", "onAppGoesForeground: from callback");
        if (!e()) {
            gm0.n("KeepBackground", "unregisterListener : onAppGoesForeground");
            d().d(this);
        } else {
            yab.i0(this.b, ((n0c) this.c).c().S0(), 0, new cn0(this, null, 2), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(nq4 nq4Var) {
        hn0 hn0Var;
        if (nq4Var instanceof hn0) {
            hn0Var = (hn0) nq4Var;
            int i = hn0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hn0Var.f = i - Integer.MIN_VALUE;
            } else {
                hn0Var = new hn0(this, nq4Var);
            }
        } else {
            hn0Var = new hn0(this, nq4Var);
        }
        Object objK0 = hn0Var.d;
        int i2 = hn0Var.f;
        lq4 lq4Var = null;
        sbi sbiVar = sbi.a;
        Context context = this.a;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objK0);
            hn0Var.f = 1;
            if (Build.VERSION.SDK_INT < 31) {
                objK0 = Boolean.TRUE;
            } else {
                objK0 = yab.K0(((n0c) this.c).b(), new jhc((AlarmManager) context.getSystemService("alarm"), lq4Var, 8), hn0Var);
            }
            if (objK0 != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objK0);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objK0);
        if (((Boolean) objK0).booleanValue()) {
            hn0Var.f = 2;
            if (g(context, hn0Var) == obj) {
                return obj;
            }
        }
        return sbiVar;
    }

    public final void j(boolean z) {
        yab.i0(this.b, ((n0c) this.c).c().S0(), 0, new en0(this, z, (lq4) null), 2);
    }

    @Override // defpackage.ou
    public final void w(long j) throws IllegalAccessException, InvocationTargetException {
        gm0.n("KeepBackground", "onAppGoesBackground: from callback");
        if (!e()) {
            gm0.n("KeepBackground", "unregisterListener : onAppGoesBackground");
            d().d(this);
            return;
        }
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "KeepBackground", zo5.s("onAppGoesBackground: shouldRunInBackground=", this.i), null);
            }
        }
        if (this.i) {
            gm0.n("KeepBackground", "onAppGoesBackground: starting foreground service");
            sgg sggVar = this.k;
            if (sggVar != null) {
                sggVar.b(null);
            }
            int i = BackgroundListenService.c;
            mu8.a(this.a);
        }
        yab.i0(this.b, ((n0c) this.c).c().S0(), 0, new cn0(this, lq4Var, 1), 2);
    }
}
