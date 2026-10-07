package defpackage;

import android.content.IntentFilter;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeApplication b;
    public final /* synthetic */ AccountInitializer c;

    public /* synthetic */ u5(OneMeApplication oneMeApplication, AccountInitializer accountInitializer, int i) {
        this.a = i;
        this.b = oneMeApplication;
        this.c = accountInitializer;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        int i2 = 14;
        int i3 = 1;
        int i4 = 20;
        int i5 = 2;
        lq4 lq4Var = null;
        int i6 = 0;
        OneMeApplication oneMeApplication = this.b;
        sbi sbiVar = sbi.a;
        int i7 = 3;
        AccountInitializer accountInitializer = this.c;
        switch (i) {
            case 0:
                ec9 ec9Var = new ec9(accountInitializer.d().getAccessor().d(27), accountInitializer.d().getAccessor().d(292), accountInitializer.d().getAccessor().d(481), accountInitializer.d().getAccessor().d(131), accountInitializer.d().getAccessor().d(54));
                ((a2c) ec9Var.b.getValue()).a().execute(new e6(i4, ec9Var));
                IntentFilter intentFilter = new IntentFilter("android.intent.action.DATE_CHANGED");
                OneMeApplication oneMeApplication2 = this.b;
                oneMeApplication2.registerReceiver(ec9Var, intentFilter);
                oneMeApplication2.registerReceiver(ec9Var, new IntentFilter("android.intent.action.TIME_SET"));
                oneMeApplication2.registerReceiver(ec9Var, new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
                np4.z(oneMeApplication2, ec9Var, new IntentFilter("action.LOCALE_CHANGED"), null, null, 4);
                break;
            case 1:
                v6 v6Var = new v6(oneMeApplication);
                oneMeApplication.registerActivityLifecycleCallbacks(v6Var);
                zt4 zt4Var = new zt4((yt4) qt4.i(accountInitializer, 48), new c6(i7));
                yab.i0((gu4) ((ifh) accountInitializer.d().g()).getValue(), zt4Var, 0, new qob(oneMeApplication, v6Var, lq4Var, i3), 2);
                e9i.j0(new j3(new fz6((r8e) pq3.j.e(oneMeApplication).h, new t6(accountInitializer, null, 0), i7), i2, new adh(zt4Var, lq4Var, i7)), (gu4) ((ifh) accountInitializer.d().g()).getValue());
                break;
            case 2:
                yab.i0((gu4) ((ifh) accountInitializer.d().g()).getValue(), null, 0, new qob(accountInitializer, oneMeApplication, lq4Var, i5), 3);
                break;
            case 3:
                rsc rscVar = (rsc) c0a.j(accountInitializer, 234);
                rscVar.getClass();
                oneMeApplication.registerActivityLifecycleCallbacks(new qsc(rscVar));
                break;
            case 4:
                Thread.setDefaultUncaughtExceptionHandler(new qa8(oneMeApplication, accountInitializer.d().getAccessor().d(92), accountInitializer.d().getAccessor().d(69), new ifh(new a6(accountInitializer, i4))));
                break;
            case 5:
                r7 r7Var = r7.a;
                if (((Boolean) ((e5d) new ca2(r7.d(accountInitializer.b)).getAccessor().d(26).getValue()).Q0.a(e5d.S6[93]).i()).booleanValue()) {
                    fab fabVar = fab.a;
                    r7 r7Var2 = r7.a;
                    ca2 ca2Var = new ca2(r7.d(ha9.b));
                    e5d e5dVar = (e5d) ca2Var.getAccessor().d(26).getValue();
                    if (((Boolean) e5dVar.Q0.a(e5d.S6[93]).i()).booleanValue()) {
                        s7f s7fVar = (s7f) ca2Var.getAccessor().c(163);
                        long jT = s7fVar.t();
                        if (jT != -1) {
                            MyTracker.getTrackerParams().setCustomUserId(String.valueOf(jT));
                        } else {
                            MyTracker.getTrackerParams().setCustomUserId(null);
                        }
                        MyTrackerConfig kidMode = MyTracker.getTrackerConfig().setOkHttpClientProvider(new qr7(i2)).setKidMode(false);
                        a2c executors = ConcurrentComponent.INSTANCE.getExecutors();
                        od6 od6Var = executors.o;
                        zv8 zv8Var = a2c.t[4];
                        kidMode.setBackgroundExecutor(executors.e(od6Var)).setLogger(new gve(e5dVar));
                        MyTracker.setAttributionListener(new qr7(15));
                        fz6 fz6Var = new fz6(s7fVar.u(), new eab(2, null, 0), i7);
                        dq4 dq4Var = fab.c;
                        e9i.j0(fz6Var, dq4Var);
                        ifh ifhVar = fab.b;
                        e9i.j0(new fz6(new tz(11, new dab(((cg9) ((qzb) ifhVar.getValue()).getAccessor().c(619)).stream(), s7fVar, i6)), new eab(2, null, 1), i7), dq4Var);
                        try {
                            ((ek5) ((qzb) ifhVar.getValue()).getAccessor().c(76)).f.set(MyTracker.getInstanceId(oneMeApplication));
                        } catch (Throwable th) {
                            gm0.V(fab.class.getName(), "fail to fetch mytracker instance id", new aab(th));
                        }
                    }
                }
                break;
            case 6:
                oneMeApplication.registerComponentCallbacks((tba) c0a.j(accountInitializer, 41));
                break;
            case 7:
                jcj jcjVar = jcj.a;
                gu4 gu4Var = (gu4) ((ifh) accountInitializer.d().g()).getValue();
                r7 r7Var3 = r7.a;
                ha9 ha9Var = accountInitializer.b;
                f5d f5dVarA = new ca2(r7.d(ha9Var)).f().b.a();
                jcjVar.getClass();
                b5d b5dVar = f5dVarA.a.Y3;
                zv8[] zv8VarArr = e5d.S6;
                j3 j3Var = new j3(new fz6(b5dVar.a(zv8VarArr[260]).h(), new y73(oneMeApplication, lq4Var, i4), i7), i2, new adh(i7, lq4Var, i3));
                ifh ifhVar2 = m94.l;
                tre.m0(e9i.T(j3Var, ((n0c) ((xhh) ifhVar2.getValue())).a()), gu4Var);
                tre.m0(e9i.T(new fz6(new ca2(r7.d(ha9Var)).f().b.a().a.X3.a(zv8VarArr[259]).h(), new yd7(2, null, oneMeApplication), i7), ((n0c) ((xhh) ifhVar2.getValue())).a()), (gu4) ((ifh) accountInitializer.d().g()).getValue());
                break;
            case 8:
                AccountInitializer.a(oneMeApplication, accountInitializer);
                break;
            default:
                gu4 gu4Var2 = (gu4) ((ifh) accountInitializer.d().g()).getValue();
                r7 r7Var4 = r7.a;
                tre.m0(e9i.T(new fz6(new ca2(r7.d(accountInitializer.b)).f().b.a().a.Z3.a(e5d.S6[261]).h(), new yd7(0, null, oneMeApplication), i7), ((n0c) ((xhh) m94.l.getValue())).a()), gu4Var2);
                fe7 fe7Var = (fe7) accountInitializer.d().getAccessor().c(1099);
                gm0.n(accountInitializer.d, "load " + fe7Var + " success!");
                break;
        }
        return sbiVar;
        return sbiVar;
    }

    public /* synthetic */ u5(AccountInitializer accountInitializer, OneMeApplication oneMeApplication, int i) {
        this.a = i;
        this.c = accountInitializer;
        this.b = oneMeApplication;
    }
}
