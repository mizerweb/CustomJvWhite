package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.android.initialization.AccountInitializer;
import one.me.sdk.database.OneMeRoomDatabase;
import one.me.statistics.androidperf.battery.BatteryRegistrarException;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONObject;
import ru.ok.tamtam.android.services.DbCleanUpScheduler$DbCleanUpWorker;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a6 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AccountInitializer b;

    public /* synthetic */ a6(OneMeApplication oneMeApplication, AccountInitializer accountInitializer) {
        this.a = 9;
        this.b = accountInitializer;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:180:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x0500  */
    /* JADX WARN: Code duplicated, block: B:185:0x0508  */
    @Override // defpackage.af7
    public final Object invoke() {
        boolean zE;
        a4c a4cVar;
        je9 je9Var;
        vn vnVar;
        JSONObject jSONObjectOptJSONObject;
        Object poeVar;
        Object poeVar2;
        final int i = 1;
        final int i2 = 0;
        switch (this.a) {
            case 0:
                ((ika) qt4.i(this.b, 533)).b();
                return sbi.a;
            case 1:
                final AccountInitializer accountInitializer = this.b;
                n30 n30Var = (n30) c0a.j(accountInitializer, 563);
                n30Var.h.add((xtc) qt4.i(accountInitializer, 663));
                xtc xtcVar = new xtc() { // from class: l6
                    @Override // defpackage.xtc
                    public final void a(List list) {
                        int i3 = i2;
                        AccountInitializer accountInitializer2 = accountInitializer;
                        switch (i3) {
                            case 0:
                                yab.i0((wmi) c0a.j(accountInitializer2, 139), null, 0, new i26(accountInitializer2, list, null, 2), 3);
                                break;
                            default:
                                u9c u9cVar = (u9c) qt4.i(accountInitializer2, 92);
                                u9cVar.g.B(u9cVar, u9c.l[2], Integer.valueOf(list.size()));
                                break;
                        }
                    }
                };
                CopyOnWriteArraySet copyOnWriteArraySet = n30Var.h;
                copyOnWriteArraySet.add(xtcVar);
                copyOnWriteArraySet.add((xtc) accountInitializer.d().getAccessor().d(685).getValue());
                copyOnWriteArraySet.add(new xtc() { // from class: l6
                    @Override // defpackage.xtc
                    public final void a(List list) {
                        int i3 = i;
                        AccountInitializer accountInitializer2 = accountInitializer;
                        switch (i3) {
                            case 0:
                                yab.i0((wmi) c0a.j(accountInitializer2, 139), null, 0, new i26(accountInitializer2, list, null, 2), 3);
                                break;
                            default:
                                u9c u9cVar = (u9c) qt4.i(accountInitializer2, 92);
                                u9cVar.g.B(u9cVar, u9c.l[2], Integer.valueOf(list.size()));
                                break;
                        }
                    }
                });
                return sbi.a;
            case 2:
                AccountInitializer accountInitializer2 = this.b;
                boolean zB = accountInitializer2.d().a().b();
                hgh hghVarI = accountInitializer2.d().i();
                yab.i0(hghVarI.l, null, 0, new k10(hghVarI, zB, null), 3);
                return sbi.a;
            case 3:
                return sbi.a;
            case 4:
                AccountInitializer accountInitializer3 = this.b;
                r7 r7Var = r7.a;
                ca2 ca2Var = new ca2(r7.d(accountInitializer3.b));
                int i3 = n6e.a;
                zed zedVarF = ca2Var.f();
                gu4 gu4Var = (gu4) ((ifh) accountInitializer3.d().g()).getValue();
                b5d b5dVar = zedVarF.b.d0;
                zv8[] zv8VarArr = e5d.S6;
                n6e.a = ((Number) b5dVar.a(zv8VarArr[53]).i()).intValue();
                e9i.j0(new fz6(zedVarF.b.d0.a(zv8VarArr[53]).h(), new i07(2, null, 2), 3), gu4Var);
                return sbi.a;
            case 5:
                AccountInitializer accountInitializer4 = this.b;
                eo0 eo0Var = (eo0) c0a.j(accountInitializer4, 1119);
                j3 j3VarD = eo0Var.c.d();
                ghb ghbVar = ew5.b;
                fz6 fz6Var = new fz6(tre.G0(j3VarD, qe7.O(1, lw5.SECONDS)), new l3(2, null, 2));
                dq4 dq4Var = eo0Var.d;
                tt4 tt4VarX0 = dq4Var.a.x0(xt4.b);
                if (tt4VarX0 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                e9i.j0(new fz6(e9i.T(new j3(e9i.T(fz6Var, tt4VarX0), 4, eo0Var), ((n0c) ((xhh) m94.l.getValue())).b()), new qn6(eo0Var, (lq4) null, 6), 3), dq4Var);
                ((p1g) accountInitializer4.d().getAccessor().c(1118)).e();
                return sbi.a;
            case 6:
                AccountInitializer accountInitializer5 = this.b;
                tu7 tu7Var = (tu7) qt4.i(accountInitializer5, 471);
                ha9 ha9Var = accountInitializer5.b;
                tu7Var.getClass();
                String strA = ha9Var.a("HEART_BEAT", null);
                gsc gscVar = (gsc) ((b) ((b) new b(HeartbeatScheduler$TaskHeartbeatWorker.class, 15L, TimeUnit.MINUTES).addTag(strA)).setInputData(f55.t(ha9Var, new ylc[0]))).build();
                gm0.m("tu7", "work %s try to add %s request", gscVar.getId(), strA);
                xyj.e(tu7Var.a, strA, 3, gscVar, 8);
                return sbi.a;
            case 7:
                AccountInitializer accountInitializer6 = this.b;
                o45 o45Var = (o45) qt4.i(accountInitializer6, 472);
                ha9 ha9Var2 = accountInitializer6.b;
                o45Var.getClass();
                String strA2 = ha9Var2.a("DB_CLEAN_UP", null);
                gsc gscVar2 = (gsc) ((b) ((b) new b(DbCleanUpScheduler$DbCleanUpWorker.class, 24L, TimeUnit.HOURS).addTag(strA2)).setInputData(f55.t(ha9Var2, new ylc[0]))).build();
                gm0.n("DbCleanUpScheduler", "Scheduling DbCleanUpWorker with request " + gscVar2);
                xyj.e(o45Var.a, strA2, 3, gscVar2, 8);
                return sbi.a;
            case 8:
                OneMeRoomDatabase.o = new f6(this.b);
                return sbi.a;
            case 9:
                qzb qzbVarD = this.b.d();
                xt4 xt4VarB = ((n0c) ((xhh) m94.l.getValue())).b();
                ghb ghbVar2 = ew5.b;
                yab.i0(yn7.a, xt4VarB, 0, new xfg(qe7.P(10L, lw5.MINUTES), qzbVarD, (lq4) null, 0), 2);
                return sbi.a;
            case 10:
                in0 in0Var = (in0) c0a.j(this.b, 339);
                if (in0Var.e()) {
                    xm0 xm0Var = (xm0) in0Var.j.getValue();
                    xm0Var.getClass();
                    if (!(xm0Var instanceof vm0)) {
                        gm0.n("KeepBackground", "onAppStart: PMS disabled, force-disabling feature");
                        in0Var.j(false);
                    } else if (in0Var.e()) {
                        in0Var.d().c(in0Var);
                        zE = in0Var.d().e();
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, "KeepBackground", zo5.s("onAppStart: appVisibility appVisible: ", zE), null);
                            }
                        }
                        yab.i0(in0Var.b, ((n0c) in0Var.c).c().S0(), 0, new en0(zE, in0Var, (lq4) null), 2);
                    }
                } else if (in0Var.e()) {
                    in0Var.d().c(in0Var);
                    zE = in0Var.d().e();
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "KeepBackground", zo5.s("onAppStart: appVisibility appVisible: ", zE), null);
                        }
                    }
                    yab.i0(in0Var.b, ((n0c) in0Var.c).c().S0(), 0, new en0(zE, in0Var, (lq4) null), 2);
                }
                return sbi.a;
            case 11:
                wmb wmbVar = (wmb) c0a.j(this.b, 1105);
                yab.i0((ite) wmbVar.a.getValue(), null, 0, new ai8(wmbVar, null, 9), 3);
                return sbi.a;
            case 12:
                yab.A0(k66.a, new q6(this.b, null, 1));
                return sbi.a;
            case 13:
                AccountInitializer accountInitializer7 = this.b;
                try {
                    yab.A0(k66.a, new qn6((i09) accountInitializer7.d().getAccessor().c(1126), (lq4) null, 1));
                    break;
                } catch (Throwable th) {
                    gm0.r(accountInitializer7.d, "fail to upgrade library!", th);
                }
                return sbi.a;
            case 14:
                ConcurrentComponent.INSTANCE.getExecutors().c().execute(new e6(0, this.b));
                return sbi.a;
            case 15:
                lba lbaVar = (lba) c0a.j(this.b, 37);
                bk5 bk5Var = (bk5) ((e5d) lbaVar.e.getValue()).j().i();
                bk5Var.getClass();
                zv8 zv8Var = bk5.c[6];
                if (bk5Var.b("memory") && lbaVar.l.compareAndSet(false, true)) {
                    yab.i0(lbaVar.m, null, 0, new qn6(lbaVar, (lq4) null, 25), 3);
                } else {
                    String str = lbaVar.d;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str, "Memory registrar already started or disabled", null);
                        }
                    }
                }
                return sbi.a;
            case 16:
                AccountInitializer accountInitializer8 = this.b;
                accountInitializer8.d().b().getClass();
                r7 r7Var2 = r7.a;
                String str2 = (String) ((e5d) new ca2(r7.d(accountInitializer8.b)).getAccessor().d(26).getValue()).s0.a(e5d.S6[68]).i();
                if (str2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.optBoolean("enabled") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("timeout")) != null) {
                            pk5 pk5Var = (pk5) accountInitializer8.d().getAccessor().c(88);
                            long jOptLong = jSONObjectOptJSONObject.optLong("low", -1L);
                            long jOptLong2 = jSONObjectOptJSONObject.optLong("avg", -1L);
                            long jOptLong3 = jSONObjectOptJSONObject.optLong("high", -1L);
                            int iOrdinal = pk5Var.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (jOptLong3 == -1) {
                                        vnVar = null;
                                    } else {
                                        jOptLong = jOptLong3;
                                        ghb ghbVar3 = ew5.b;
                                        vnVar = new vn(qe7.P(jOptLong, lw5.MILLISECONDS));
                                    }
                                } else if (jOptLong2 == -1) {
                                    vnVar = null;
                                } else {
                                    jOptLong = jOptLong2;
                                    ghb ghbVar4 = ew5.b;
                                    vnVar = new vn(qe7.P(jOptLong, lw5.MILLISECONDS));
                                }
                            } else if (jOptLong == -1) {
                                vnVar = null;
                            } else {
                                ghb ghbVar5 = ew5.b;
                                vnVar = new vn(qe7.P(jOptLong, lw5.MILLISECONDS));
                            }
                        } else {
                            vnVar = null;
                        }
                    } catch (Throwable th2) {
                        String strL = qv1.l("invalid anr json config ", str2, ", ", th2.getMessage());
                        gm0.V("AnrConfig", strL, new IllegalArgumentException(strL));
                    }
                    if (vnVar != null) {
                        String str3 = accountInitializer8.d;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var3 = je9.d;
                            if (a4cVar3.b(je9Var3)) {
                                a4cVar3.c(je9Var3, str3, "anr config = " + vnVar, null);
                            }
                        }
                        ifh ifhVar = m94.l;
                        vbf vbfVar = new vbf(vnVar, ((n0c) ((xhh) ifhVar.getValue())).c(), new a6(accountInitializer8, 18));
                        Handler handler = new Handler(Looper.getMainLooper());
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        bye byeVar = new bye(new ao(vbfVar, null, 1));
                        qid qidVar = qid.i;
                        e9i.j0(e9i.T(new j3(new fz6(n1g.v(byeVar, qidVar.f, n09.d), new r6(atomicBoolean, accountInitializer8, handler, null), 3), 14, new adh(accountInitializer8, (lq4) null, 2)), ((n0c) ((xhh) ifhVar.getValue())).a().R0(1, "AnrWatchDog-Observe")), tre.d0(qidVar));
                    }
                }
                return sbi.a;
            case 17:
                AccountInitializer accountInitializer9 = this.b;
                ((bi4) c0a.j(accountInitializer9, 219)).a();
                b5d b5dVar2 = accountInitializer9.d().f().c2;
                zv8[] zv8VarArr2 = e5d.S6;
                if (((Boolean) b5dVar2.a(zv8VarArr2[157]).i()).booleanValue()) {
                }
                ((qw2) qt4.i(accountInitializer9, 131)).t();
                e5d e5dVarF = accountInitializer9.d().f();
                wmi wmiVar = (wmi) c0a.j(accountInitializer9, 139);
                f7h f7hVar = new f7h(e5dVarF, wmiVar, accountInitializer9.d().getAccessor().d(144), accountInitializer9.d().getAccessor().d(114));
                if (((Boolean) e5dVarF.j6.a(zv8VarArr2[375]).i()).booleanValue()) {
                    f7hVar.e.B(f7hVar, f7h.f[0], yab.i0(wmiVar, null, 2, new d7h(f7hVar, null), 1));
                }
                return sbi.a;
            case 18:
                this.b.d().b().getClass();
                return Boolean.FALSE;
            case 19:
                xe6 xe6Var = (xe6) c0a.j(this.b, 39);
                je9 je9Var4 = je9.f;
                bk5 bk5Var2 = (bk5) ((e5d) xe6Var.c.getValue()).j().i();
                bk5Var2.getClass();
                zv8 zv8Var2 = bk5.c[9];
                if (!bk5Var2.b("exit_reason")) {
                    String str4 = xe6Var.b;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var4)) {
                        a4cVar4.c(je9Var4, str4, "init: exit reason stat disabled", null);
                    }
                } else if (!xe6Var.e.compareAndSet(false, true)) {
                    String str5 = xe6Var.b;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var4)) {
                        a4cVar5.c(je9Var4, str5, "init: already started", null);
                    }
                } else if (Build.VERSION.SDK_INT < 30) {
                    String str6 = xe6Var.b;
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null && a4cVar6.b(je9Var4)) {
                        a4cVar6.c(je9Var4, str6, "init: exit info not available below API R", null);
                    }
                } else {
                    Context context = xe6Var.a;
                    try {
                        Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                        if (systemService == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        poeVar = r4.d(ww3.t1(((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 1)));
                        Throwable thA = roe.a(poeVar);
                        if (thA != null) {
                            String name = context.getClass().getName();
                            a4c a4cVar7 = gm0.f;
                            if (a4cVar7 != null && a4cVar7.b(je9Var4)) {
                                a4cVar7.c(je9Var4, name, "Error during retrieving exit reason!", thA);
                            }
                        }
                        if (poeVar instanceof poe) {
                            poeVar = null;
                        }
                        ApplicationExitInfo applicationExitInfoD = r4.d(poeVar);
                        if (applicationExitInfoD == null) {
                            String str7 = xe6Var.b;
                            a4c a4cVar8 = gm0.f;
                            if (a4cVar8 != null && a4cVar8.b(je9Var4)) {
                                a4cVar8.c(je9Var4, str7, "init: no previous exit info", null);
                            }
                        } else {
                            ((we6) xe6Var.d.getValue()).a(applicationExitInfoD);
                        }
                    } catch (Throwable th3) {
                        poeVar = new poe(th3);
                    }
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return (lba) c0a.j(this.b, 37);
            case 21:
                return (rb8) c0a.j(this.b, 782);
            case 22:
                lqe lqeVar = (lqe) c0a.j(this.b, 366);
                if (lqeVar.g.compareAndSet(false, true)) {
                    lqeVar.h = yab.i0((ite) lqeVar.d.getValue(), ((n0c) ((xhh) lqeVar.f.getValue())).b(), 0, new ai8(lqeVar, null, 22), 2);
                }
                return sbi.a;
            default:
                AccountInitializer accountInitializer10 = this.b;
                sbi sbiVar = sbi.a;
                mv0 mv0Var = (mv0) c0a.j(accountInitializer10, 43);
                je9 je9Var5 = je9.f;
                b5d b5dVar3 = ((e5d) mv0Var.f.getValue()).m3;
                zv8[] zv8VarArr3 = e5d.S6;
                if (((Number) b5dVar3.a(zv8VarArr3[222]).i()).longValue() == 0 || !mv0Var.l.compareAndSet(false, true)) {
                    String str8 = mv0Var.e;
                    a4c a4cVar9 = gm0.f;
                    if (a4cVar9 != null && a4cVar9.b(je9Var5)) {
                        a4cVar9.c(je9Var5, str8, "Battery registrar is already started or disabled", null);
                    }
                } else if (((Boolean) ((e5d) mv0Var.f.getValue()).n3.a(zv8VarArr3[223]).i()).booleanValue()) {
                    try {
                        ((xo9) mv0Var.k.getValue()).H();
                        poeVar2 = sbiVar;
                    } catch (Throwable th4) {
                        poeVar2 = new poe(th4);
                    }
                    Throwable thA2 = roe.a(poeVar2);
                    if (thA2 != null) {
                        String str9 = mv0Var.e;
                        BatteryRegistrarException batteryRegistrarExceptionB = iwl.b(thA2);
                        a4c a4cVar10 = gm0.f;
                        if (a4cVar10 != null && a4cVar10.b(je9Var5)) {
                            a4cVar10.c(je9Var5, str9, "Failed to initialize battery lib", batteryRegistrarExceptionB);
                        }
                    }
                } else {
                    yab.i0(mv0Var.m, null, 0, new fv0(mv0Var, null, 0), 3);
                }
                return sbiVar;
        }
    }

    public /* synthetic */ a6(AccountInitializer accountInitializer, int i) {
        this.a = i;
        this.b = accountInitializer;
    }

    public /* synthetic */ a6(AccountInitializer accountInitializer, OneMeApplication oneMeApplication) {
        this.a = 2;
        this.b = accountInitializer;
    }
}
