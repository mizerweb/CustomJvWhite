package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class mv0 {
    public final xhh a;
    public final Context b;
    public final trc c;
    public final qv0 d;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 k;
    public final dq4 m;
    public final pzf n;
    public final ifh o;
    public final ifh p;
    public final ifh q;
    public final String e = mv0.class.getName();
    public final ny8 j = rx8.P(3, new b6(16));
    public final AtomicBoolean l = new AtomicBoolean(false);

    public mv0(qv0 qv0Var, yt4 yt4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, trc trcVar, xhh xhhVar, Context context) {
        this.a = xhhVar;
        this.b = context;
        this.c = trcVar;
        this.d = qv0Var;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        final int i = 0;
        this.k = rx8.P(3, new af7(this) { // from class: dv0
            public final /* synthetic */ mv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                mv0 mv0Var = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = mv0Var.b;
                        xhh xhhVar2 = mv0Var.a;
                        Context applicationContext = context2.getApplicationContext();
                        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                        if (application == null) {
                            application = context2 instanceof Application ? (Application) context2 : null;
                            if (application == null) {
                                ore.k("Battery lib requires an Application context");
                                return null;
                            }
                        }
                        xo9.a aVarD = new xo9.a(application).f(new uik(2, (lu0) mv0Var.i.getValue())).h(new i1m(mv0Var.d)).e(((zid) mv0Var.g.getValue()).c()).d(so2.d);
                        ghb ghbVar = ew5.b;
                        n0c n0cVar = (n0c) xhhVar2;
                        return aVarD.g(qe7.P(((Number) ((e5d) mv0Var.f.getValue()).m3.a(e5d.S6[222]).i()).longValue(), lw5.MILLISECONDS)).b(n0cVar.a()).c(n0cVar.b()).a();
                    case 1:
                        Object systemService = mv0Var.b.getSystemService((Class<Object>) BatteryManager.class);
                        if (systemService != null) {
                            return (BatteryManager) systemService;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        Object systemService2 = mv0Var.b.getSystemService((Class<Object>) ActivityManager.class);
                        if (systemService2 != null) {
                            return (ActivityManager) systemService2;
                        }
                        ore.p("Required value was null.");
                        return null;
                }
            }
        });
        xt4 xt4VarA = ((n0c) xhhVar).a();
        nah nahVarA = wk8.a();
        xt4VarA.getClass();
        this.m = cqk.a(lvb.x0(xt4VarA, nahVarA).u0(new zt4(yt4Var, jv0.a)));
        this.n = e9i.b(0, 0, 7);
        this.o = new ifh(new b6(17));
        final int i2 = 1;
        this.p = new ifh(new af7(this) { // from class: dv0
            public final /* synthetic */ mv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                mv0 mv0Var = this.b;
                switch (i3) {
                    case 0:
                        Context context2 = mv0Var.b;
                        xhh xhhVar2 = mv0Var.a;
                        Context applicationContext = context2.getApplicationContext();
                        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                        if (application == null) {
                            application = context2 instanceof Application ? (Application) context2 : null;
                            if (application == null) {
                                ore.k("Battery lib requires an Application context");
                                return null;
                            }
                        }
                        xo9.a aVarD = new xo9.a(application).f(new uik(2, (lu0) mv0Var.i.getValue())).h(new i1m(mv0Var.d)).e(((zid) mv0Var.g.getValue()).c()).d(so2.d);
                        ghb ghbVar = ew5.b;
                        n0c n0cVar = (n0c) xhhVar2;
                        return aVarD.g(qe7.P(((Number) ((e5d) mv0Var.f.getValue()).m3.a(e5d.S6[222]).i()).longValue(), lw5.MILLISECONDS)).b(n0cVar.a()).c(n0cVar.b()).a();
                    case 1:
                        Object systemService = mv0Var.b.getSystemService((Class<Object>) BatteryManager.class);
                        if (systemService != null) {
                            return (BatteryManager) systemService;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        Object systemService2 = mv0Var.b.getSystemService((Class<Object>) ActivityManager.class);
                        if (systemService2 != null) {
                            return (ActivityManager) systemService2;
                        }
                        ore.p("Required value was null.");
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.q = new ifh(new af7(this) { // from class: dv0
            public final /* synthetic */ mv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                mv0 mv0Var = this.b;
                switch (i4) {
                    case 0:
                        Context context2 = mv0Var.b;
                        xhh xhhVar2 = mv0Var.a;
                        Context applicationContext = context2.getApplicationContext();
                        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                        if (application == null) {
                            application = context2 instanceof Application ? (Application) context2 : null;
                            if (application == null) {
                                ore.k("Battery lib requires an Application context");
                                return null;
                            }
                        }
                        xo9.a aVarD = new xo9.a(application).f(new uik(2, (lu0) mv0Var.i.getValue())).h(new i1m(mv0Var.d)).e(((zid) mv0Var.g.getValue()).c()).d(so2.d);
                        ghb ghbVar = ew5.b;
                        n0c n0cVar = (n0c) xhhVar2;
                        return aVarD.g(qe7.P(((Number) ((e5d) mv0Var.f.getValue()).m3.a(e5d.S6[222]).i()).longValue(), lw5.MILLISECONDS)).b(n0cVar.a()).c(n0cVar.b()).a();
                    case 1:
                        Object systemService = mv0Var.b.getSystemService((Class<Object>) BatteryManager.class);
                        if (systemService != null) {
                            return (BatteryManager) systemService;
                        }
                        ore.p("Required value was null.");
                        return null;
                    default:
                        Object systemService2 = mv0Var.b.getSystemService((Class<Object>) ActivityManager.class);
                        if (systemService2 != null) {
                            return (ActivityManager) systemService2;
                        }
                        ore.p("Required value was null.");
                        return null;
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(mv0 mv0Var, nq4 nq4Var) {
        iv0 iv0Var;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        je9 je9Var2 = je9.f;
        if (nq4Var instanceof iv0) {
            iv0Var = (iv0) nq4Var;
            int i = iv0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                iv0Var.f = i - Integer.MIN_VALUE;
            } else {
                iv0Var = new iv0(mv0Var, nq4Var);
            }
        } else {
            iv0Var = new iv0(mv0Var, nq4Var);
        }
        Object objH = iv0Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = iv0Var.f;
        if (i2 == 0) {
            ch3.d0(objH);
            qv0 qv0Var = mv0Var.d;
            iv0Var.f = 1;
            objH = qv0Var.h(iv0Var);
            if (objH == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objH);
        }
        List list = (List) objH;
        boolean zIsEmpty = list.isEmpty();
        String str = mv0Var.e;
        if (zIsEmpty) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var2)) {
                a4cVar.c(je9Var2, str, "No previous snapshots found", null);
                return sbiVar;
            }
        } else {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str, zo5.h(list.size(), "Restoring metrics from previous session, got size->"), null);
            }
            uq uqVar = mv0Var.c.b.i;
            if (uqVar.a()) {
                String str2 = mv0Var.e;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str2, "Previous session dump is empty", null);
                    return sbiVar;
                }
            } else {
                ru0 ru0VarA = ((su0) mv0Var.j.getValue()).a(list, uqVar);
                if (ru0VarA instanceof qu0) {
                    String str3 = mv0Var.e;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                        a4cVar4.c(je9Var, str3, "Calculated report -> " + ((qu0) ru0VarA).a(), null);
                    }
                    ((lu0) mv0Var.i.getValue()).b(((qu0) ru0VarA).a());
                    return sbiVar;
                }
                if (ru0VarA instanceof pu0) {
                    String str4 = mv0Var.e;
                    Throwable thA = ((pu0) ru0VarA).a();
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                        a4cVar5.c(je9Var2, str4, "Battery stats are invalid, skip sending", thA);
                        return sbiVar;
                    }
                } else {
                    if (!ru0VarA.equals(ou0.a)) {
                        ore.o();
                        return null;
                    }
                    String str5 = mv0Var.e;
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null && a4cVar6.b(je9Var2)) {
                        a4cVar6.c(je9Var2, str5, "Report is empty, nothing to send", null);
                    }
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[PHI: r10
  0x00b2: PHI (r10v3 java.lang.Object) = (r10v8 java.lang.Object), (r10v1 java.lang.Object) binds: [B:30:0x00af, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c0 -> B:24:0x0054). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.mv0 r9, defpackage.nq4 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.lv0
            if (r0 == 0) goto L13
            r0 = r10
            lv0 r0 = (defpackage.lv0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            lv0 r0 = new lv0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.d
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L39
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.ch3.d0(r10)
            goto L54
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r3
        L34:
            defpackage.ch3.d0(r10)
            goto Lb2
        L39:
            defpackage.ch3.d0(r10)
            goto La5
        L3d:
            defpackage.ch3.d0(r10)
            java.lang.String r10 = r9.e
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L47
            goto L54
        L47:
            je9 r7 = defpackage.je9.d
            boolean r8 = r2.b(r7)
            if (r8 == 0) goto L54
            java.lang.String r8 = "Starting interval slice of battery"
            r2.c(r7, r10, r8, r3)
        L54:
            vt4 r10 = r0.getContext()
            boolean r10 = defpackage.vd7.E(r10)
            if (r10 == 0) goto Lc3
            ghb r10 = defpackage.ew5.b
            ny8 r10 = r9.f
            java.lang.Object r10 = r10.getValue()
            e5d r10 = (defpackage.e5d) r10
            b5d r10 = r10.m3
            zv8[] r2 = defpackage.e5d.S6
            r3 = 222(0xde, float:3.11E-43)
            r2 = r2[r3]
            i5d r10 = r10.a(r2)
            java.lang.Object r10 = r10.i()
            java.lang.Number r10 = (java.lang.Number) r10
            long r2 = r10.longValue()
            lw5 r10 = defpackage.lw5.MILLISECONDS
            long r2 = defpackage.qe7.P(r2, r10)
            ew5 r7 = new ew5
            r7.<init>(r2)
            r2 = 10000(0x2710, float:1.4013E-41)
            long r2 = defpackage.qe7.O(r2, r10)
            ew5 r10 = new ew5
            r10.<init>(r2)
            java.lang.Comparable r10 = defpackage.oc9.s(r7, r10)
            ew5 r10 = (defpackage.ew5) r10
            long r2 = r10.a
            r0.f = r6
            java.lang.Object r10 = defpackage.rx8.u(r2, r0)
            if (r10 != r1) goto La5
            goto Lc2
        La5:
            r0.f = r5
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r10 = r9.c(r2, r0)
            if (r10 != r1) goto Lb2
            goto Lc2
        Lb2:
            psh r10 = (defpackage.psh) r10
            java.lang.Object r10 = r10.a
            ov0 r10 = (defpackage.ov0) r10
            pzf r2 = r9.n
            r0.f = r4
            java.lang.Object r10 = r2.emit(r10, r0)
            if (r10 != r1) goto L54
        Lc2:
            return r1
        Lc3:
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv0.b(mv0, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(long j, nq4 nq4Var) {
        kv0 kv0Var;
        long j2;
        long j3;
        int intExtra;
        if (nq4Var instanceof kv0) {
            kv0Var = (kv0) nq4Var;
            int i = kv0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                kv0Var.h = i - Integer.MIN_VALUE;
            } else {
                kv0Var = new kv0(this, nq4Var);
            }
        } else {
            kv0Var = new kv0(this, nq4Var);
        }
        Object objK0 = kv0Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = kv0Var.h;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            long jC = g1b.c();
            kv0Var.d = j;
            kv0Var.e = jC;
            kv0Var.h = 1;
            objK0 = yab.K0(((n0c) this.a).b(), new sfd(this, lq4Var, 23), kv0Var);
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            j2 = jC;
            j3 = j;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = kv0Var.e;
            long j4 = kv0Var.d;
            ch3.d0(objK0);
            j3 = j4;
        }
        ev0 ev0Var = (ev0) objK0;
        mcb mcbVarA = ((pcb) this.h.getValue()).a();
        Intent intentZ = np4.z(this.b, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null, 4);
        int i3 = (intentZ == null || (intExtra = intentZ.getIntExtra("temperature", 0)) < 0) ? 0 : intExtra;
        boolean zA = fkl.a(this.b);
        boolean zA2 = prk.a((ActivityManager) this.q.getValue());
        long jD = ev0Var.d();
        long jC2 = ev0Var.c();
        long jB = ev0Var.b();
        long jA = ev0Var.a();
        int intProperty = ((BatteryManager) this.p.getValue()).getIntProperty(4);
        int i4 = intProperty < 0 ? 0 : intProperty;
        ncb ncbVarA = mcbVarA.a();
        long jB2 = ncbVarA != null ? ncbVarA.a().b() : -1L;
        ncb ncbVarA2 = mcbVarA.a();
        long jC3 = ncbVarA2 != null ? ncbVarA2.a().c() : -1L;
        ncb ncbVarA3 = mcbVarA.a();
        long jA2 = ncbVarA3 != null ? ncbVarA3.a().a() : -1L;
        ncb ncbVarA4 = mcbVarA.a();
        long jB3 = ncbVarA4 != null ? ncbVarA4.b().b() : -1L;
        ncb ncbVarA5 = mcbVarA.a();
        long jC4 = ncbVarA5 != null ? ncbVarA5.b().c() : -1L;
        ncb ncbVarA6 = mcbVarA.a();
        long jA3 = ncbVarA6 != null ? ncbVarA6.b().a() : -1L;
        ncb ncbVarB = mcbVarA.b();
        long jB4 = ncbVarB != null ? ncbVarB.a().b() : -1L;
        ncb ncbVarB2 = mcbVarA.b();
        ov0 ov0Var = new ov0(j3, jD, jC2, jB, jA, i4, i3, jB2, jC3, jA2, jB3, jC4, jA3, jB4, ncbVarB2 != null ? ncbVarB2.a().c() : -1L, ((zid) this.g.getValue()).b(), zA, zA2);
        long jA4 = ish.a(j2);
        psh pshVar = new psh(jA4, ov0Var);
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Sliced snapshot for ".concat(ew5.t(jA4)), null);
            }
        }
        return pshVar;
    }
}
