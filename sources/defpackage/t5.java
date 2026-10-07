package defpackage;

import android.content.SharedPreferences;
import androidx.work.b;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;
import one.me.android.DailyAnalyticsWorker;
import one.me.android.di.ConcurrentComponent;
import one.me.android.initialization.AccountInitializer;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.WebmConfig;
import one.me.stories.core.workers.StoriesCleanupScheduler$StoriesCleanupWorker;
import one.me.upload.cleanup.UploadsCleanupScheduler$UploadsCleanupWorker;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.android.messages.comments.MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AccountInitializer b;

    public /* synthetic */ t5(AccountInitializer accountInitializer, int i) {
        this.a = i;
        this.b = accountInitializer;
    }

    @Override // defpackage.af7
    public final Object invoke() throws InterruptedException {
        int i = this.a;
        TimeUnit timeUnit = TimeUnit.HOURS;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        AccountInitializer accountInitializer = this.b;
        switch (i) {
            case 0:
                cw4 cw4Var = (cw4) c0a.j(accountInitializer, 1135);
                if (((bk5) ((e5d) cw4Var.d.getValue()).j().i()).a(xj5.CRIT_LOG)) {
                    yab.i0((wmi) cw4Var.e.getValue(), null, 0, new vq(cw4Var, (lq4) null, 23), 3);
                } else {
                    String str = cw4Var.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "report: crit_log devnull event disabled, skip", null);
                        }
                    }
                }
                return sbi.a;
            case 1:
                o35 o35Var = (o35) c0a.j(accountInitializer, 1136);
                if (((bk5) ((e5d) o35Var.d.getValue()).j().i()).a(xj5.DATABASE_STAT)) {
                    yab.i0((wmi) o35Var.e.getValue(), null, 0, new qh4(o35Var, (lq4) null, 11), 3);
                } else {
                    String str2 = o35Var.a;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.d;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "report: db_stat devnull event disabled, skip", null);
                        }
                    }
                }
                return sbi.a;
            case 2:
                iki ikiVar = (iki) qt4.i(accountInitializer, 475);
                ha9 ha9Var = accountInitializer.b;
                ikiVar.getClass();
                String strA = ha9Var.a("UPLOADS_CLEAN_UP", null);
                gsc gscVar = (gsc) ((b) ((b) new b(UploadsCleanupScheduler$UploadsCleanupWorker.class, 24L, timeUnit).addTag(strA)).setInputData(f55.t(ha9Var, new ylc[0]))).build();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, "UploadsCleanupScheduler", "Scheduling UploadsCleanupWorker with request " + gscVar, null);
                    }
                }
                xyj.e(ikiVar.a, strA, 3, gscVar, 8);
                return sbi.a;
            case 3:
                ConcurrentComponent.INSTANCE.getExecutors().c().execute(new hed(0, new en8(new ifh(new a6(accountInitializer, 21)))));
                return sbi.a;
            case 4:
                sqg sqgVar = (sqg) qt4.i(accountInitializer, 283);
                ha9 ha9Var2 = accountInitializer.b;
                sqgVar.getClass();
                String strA2 = ha9Var2.a("STORIES_CLEAN_UP", null);
                gsc gscVar2 = (gsc) ((b) ((b) new b(StoriesCleanupScheduler$StoriesCleanupWorker.class, 24L, timeUnit).addTag(strA2)).setInputData(f55.t(ha9Var2, new ylc[0]))).build();
                String name = sqg.class.getName();
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var4 = je9.d;
                    if (a4cVar4.b(je9Var4)) {
                        a4cVar4.c(je9Var4, name, "Scheduling StoriesCleanupWorker", null);
                    }
                }
                xyj.e(sqgVar.a, strA2, 3, gscVar2, 8);
                return sbi.a;
            case 5:
                iec iecVar = (iec) accountInitializer.d().f().l().i();
                iecVar.getClass();
                if (iecVar instanceof gec) {
                    ((h3j) c0a.j(accountInitializer, 199)).b();
                }
                return sbi.a;
            case 6:
                yab.i0((gu4) ((ifh) accountInitializer.d().g()).getValue(), null, 0, new t6(accountInitializer, null, 1), 3);
                return sbi.a;
            case 7:
                ha9 ha9Var3 = accountInitializer.b;
                xyj xyjVar = (xyj) qt4.i(accountInitializer, 292);
                xyjVar.d("ru.ok.messages.analytics.DailyAnalyticsWorker");
                kg4 kg4Var = new kg4(new adb(null), 1, false, false, false, false, -1L, -1L, ww3.X1(new LinkedHashSet()));
                String strA3 = ha9Var3.a("one.me.android.DailyAnalyticsWorker", null);
                gsc gscVar3 = (gsc) ((b) ((b) ((b) new b(DailyAnalyticsWorker.class, 1L, timeUnit2).setConstraints(kg4Var)).setInputData(f55.t(ha9Var3, new ylc[0]))).addTag(strA3)).build();
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9 je9Var5 = je9.d;
                    if (a4cVar5.b(je9Var5)) {
                        a4cVar5.c(je9Var5, "one.me.android.DailyAnalyticsWorker", "work " + gscVar3.getId() + " try to add one.me.android.DailyAnalyticsWorker request", null);
                    }
                }
                xyj.e(xyjVar, strA3, 3, gscVar3, 24);
                return sbi.a;
            case 8:
                jnb jnbVar = (jnb) qt4.i(accountInitializer, 473);
                ha9 ha9Var4 = accountInitializer.b;
                jnbVar.getClass();
                gm0.n("NotificationTrackerCleanupScheduler", "schedule task");
                String strA4 = ha9Var4.a("NotificationTrackerCleanupScheduler", null);
                xyj.e(jnbVar.a, strA4, 3, (gsc) ((b) ((b) ((b) new b(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class, 7L, timeUnit2).setInitialDelay(7L, timeUnit2)).setInputData(f55.t(ha9Var4, new ylc[0]))).addTag(strA4)).build(), 8);
                return sbi.a;
            case 9:
                r7 r7Var = r7.a;
                return new qzb(r7.d(accountInitializer.b));
            case 10:
                qzb qzbVarD = accountInitializer.d();
                ha9 ha9Var5 = accountInitializer.b;
                if (((f5d) qzbVarD.d()).q()) {
                    wea weaVar = (wea) qt4.i(accountInitializer, 474);
                    weaVar.getClass();
                    gm0.n("MessageCommentsCleanupScheduler", "schedule task");
                    String strA5 = ha9Var5.a("MessageCommentsCleanupScheduler", null);
                    xyj.e(weaVar.a, strA5, 3, (gsc) ((b) ((b) ((b) new b(MessageCommentsCleanupScheduler$MessageCommentsCleanupWorker.class, 7L, timeUnit2).setInitialDelay(7L, timeUnit2)).setInputData(f55.t(ha9Var5, new ylc[0]))).addTag(strA5)).build(), 8);
                } else {
                    wea weaVar2 = (wea) qt4.i(accountInitializer, 474);
                    weaVar2.getClass();
                    gm0.n("MessageCommentsCleanupScheduler", "cancel task");
                    weaVar2.a.c(ha9Var5.a("MessageCommentsCleanupScheduler", null));
                }
                return sbi.a;
            case 11:
                ((vw8) c0a.j(accountInitializer, 361)).a();
                return sbi.a;
            case 12:
                ((nl1) c0a.j(accountInitializer, 603)).b();
                return sbi.a;
            case 13:
                ((tz7) c0a.j(accountInitializer, 1127)).c();
                return sbi.a;
            case 14:
                Boolean bool = (Boolean) accountInitializer.d().f().F3.a(e5d.S6[241]).i();
                bool.getClass();
                return bool;
            case 15:
                return sbi.a;
            case 16:
                cqk.e = (abb) c0a.j(accountInitializer, 1115);
                boolean zBooleanValue = ((Boolean) accountInitializer.d().f().b6.a(e5d.S6[367]).i()).booleanValue();
                uab uabVar = (uab) c0a.j(accountInitializer, 1129);
                if (zBooleanValue) {
                    RLottie.initConfig((RLottie.Config) c0a.j(accountInitializer, 1113));
                    Object objR = f55.r();
                    if (!(objR instanceof poe)) {
                        long j = ((ew5) objR).a;
                        a4c a4cVar6 = gm0.f;
                        if (a4cVar6 != null) {
                            je9 je9Var6 = je9.d;
                            if (a4cVar6.b(je9Var6)) {
                                a4cVar6.c(je9Var6, "NativeLibMergerLoader", c0a.o("Native library max was successfully loaded in ", ew5.t(j), " ms"), null);
                            }
                        }
                        uabVar.a(ew5.s(j, lw5.MILLISECONDS), "max");
                    }
                    Throwable thA = roe.a(objR);
                    if (thA != null) {
                        gm0.V("NativeLibMergerLoader", "Error loading max lib", thA);
                        AccountInitializer.e(uabVar, accountInitializer);
                    }
                } else {
                    AccountInitializer.e(uabVar, accountInitializer);
                }
                WebmConfig.init((WebmConfig.Config) c0a.j(accountInitializer, 1114));
                return sbi.a;
            case 17:
                return sbi.a;
            case 18:
                xm xmVar = (xm) c0a.j(accountInitializer, 312);
                xmVar.j.B(xmVar, xm.o[0], yab.i0(xmVar.i, null, 2, new vm(xmVar, null, 1), 1));
                return sbi.a;
            case 19:
                accountInitializer.d().getAccessor().d(1106).getValue();
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                bu buVar = bu.a;
                e5d e5dVarF = accountInitializer.d().f();
                bu.c = new j6(e5dVarF, 0);
                bu.f = new j6(e5dVarF, 1);
                final dd6 dd6Var = (dd6) c0a.j(accountInitializer, 1122);
                bu.d = new IntConsumer() { // from class: k6
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i2) {
                        Object value;
                        Object value2;
                        dd6 dd6Var2 = dd6Var;
                        dd6Var2.getClass();
                        String name2 = dd6.class.getName();
                        a4c a4cVar7 = gm0.f;
                        if (a4cVar7 != null) {
                            je9 je9Var7 = je9.e;
                            if (a4cVar7.b(je9Var7)) {
                                a4cVar7.c(je9Var7, name2, "setOrIncrement value=" + i2 + ", counter.value=" + dd6Var2.b.getValue(), null);
                            }
                        }
                        if (i2 > 0) {
                            boolean andSet = dd6Var2.c.getAndSet(true);
                            mjg mjgVar = dd6Var2.b;
                            if (andSet) {
                                do {
                                    value2 = mjgVar.getValue();
                                } while (!mjgVar.h(value2, Integer.valueOf(((Number) value2).intValue() + 1)));
                            } else {
                                do {
                                    value = mjgVar.getValue();
                                } while (!mjgVar.h(value, Integer.valueOf(((Number) value).intValue() + i2)));
                            }
                        }
                    }
                };
                buVar.c("subversion", String.valueOf(54107));
                oqg oqgVar = (oqg) accountInitializer.d().getAccessor().c(84);
                buVar.c("services_name", oqgVar.b());
                buVar.c("services_status", String.valueOf(oqgVar.i()));
                buVar.c("services_version", String.valueOf(oqgVar.c()));
                return sbi.a;
            case 21:
                sbi sbiVar = sbi.a;
                if (((Boolean) accountInitializer.d().f().B().i()).booleanValue()) {
                    long jC = g1b.c();
                    l3c.a((qza) ((l3c) qt4.i(accountInitializer, 677)).d.getValue(), "loadStories");
                    long jA = ish.a(jC);
                    a4c a4cVar7 = gm0.f;
                    if (a4cVar7 != null) {
                        je9 je9Var7 = je9.d;
                        if (a4cVar7.b(je9Var7)) {
                            a4cVar7.c(je9Var7, "InitialDataTask", zo5.j(ew5.h(jA), "initialDataStorage().loadStories() by "), null);
                        }
                    }
                }
                return sbiVar;
            case 22:
                String str3 = accountInitializer.d;
                a4c a4cVar8 = gm0.f;
                if (a4cVar8 != null) {
                    je9 je9Var8 = je9.d;
                    if (a4cVar8.b(je9Var8)) {
                        a4cVar8.c(je9Var8, str3, "performance.class = " + ((pk5) c0a.j(accountInitializer, 88)), null);
                    }
                }
                return sbi.a;
            case 23:
                if (!((nni) c0a.j(accountInitializer, 161)).d.getBoolean("app.privacy.unsafe.files.default", true) && ((Boolean) accountInitializer.d().f().T1.a(e5d.S6[148]).i()).booleanValue()) {
                    yab.i0((wmi) c0a.j(accountInitializer, 139), null, 0, new m5(accountInitializer, null, 1), 3);
                }
                return sbi.a;
            case 24:
                accountInitializer.d().b().getClass();
                pye.a = 1;
                fjf.a.add(new n6(accountInitializer));
                return sbi.a;
            case 25:
                lfc lfcVar = (lfc) c0a.j(accountInitializer, 626);
                bk5 bk5VarC = ((f5d) lfcVar.c()).c();
                bk5VarC.getClass();
                zv8 zv8Var = bk5.c[1];
                if (bk5VarC.b("opcode")) {
                    u9c u9cVar = (u9c) lfcVar.d.getValue();
                    gvb gvbVar = u9cVar.f;
                    zv8[] zv8VarArr = u9c.l;
                    String str4 = (String) gvbVar.m(u9cVar, zv8VarArr[1]);
                    u9c u9cVar2 = (u9c) lfcVar.d.getValue();
                    u9cVar2.f.B(u9cVar2, zv8VarArr[1], "");
                    if (str4.length() == 0) {
                        gm0.Y(lfc.class.getName(), "Early return in send cuz of savedStats.isEmpty()");
                    } else {
                        yab.i0(lfcVar.a, null, 0, new qz9(str4, lfcVar, null, 15), 3);
                    }
                }
                yfd yfdVar = (yfd) qt4.i(accountInitializer, 480);
                if (((Boolean) yfdVar.p.i()).booleanValue()) {
                    vfd vfdVarC = yfdVar.C();
                    gm0.x(vfdVarC.h, "send", null);
                    String[] strArr = vfd.x;
                    ul9 ul9Var = new ul9(11);
                    for (int i2 = 0; i2 < 11; i2++) {
                        String str5 = strArr[i2];
                        int i3 = ((SharedPreferences) vfdVarC.k.getValue()).getInt(str5, 0);
                        Integer numValueOf = Integer.valueOf(i3);
                        if (i3 <= 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                        }
                    }
                    ul9 ul9VarB = ul9Var.b();
                    vfdVarC.i = true;
                    if (ul9VarB.isEmpty()) {
                        gm0.x(vfdVarC.h, "presence stat is empty!", null);
                    } else {
                        ae9.k((ae9) vfdVarC.d.getValue(), "PRESENCE", "EVENT_MESSAGE_COUNTER", ul9VarB, 8);
                        gm0.x(vfdVarC.h, "clear", null);
                        vfdVarC.a();
                    }
                }
                ((mih) qt4.i(accountInitializer, 326)).e(true);
                onf onfVar = (onf) accountInitializer.d().getAccessor().d(325).getValue();
                zne zneVar = (zne) c0a.j(accountInitializer, 1121);
                mjg mjgVar = zneVar.d;
                ghb ghbVar = ew5.b;
                tre.m0(new fz6(new ey6(tre.G0(mjgVar, qe7.O(10, lw5.SECONDS)), 1), new wyj(zneVar, null, 13), 3), zneVar.c);
                ((rnf) onfVar).c(zneVar);
                return sbi.a;
            case 26:
                cxb cxbVar = (cxb) c0a.j(accountInitializer, 225);
                xb9 xb9Var = (xb9) cxbVar.b;
                gvb gvbVar2 = xb9Var.B0;
                zv8[] zv8VarArr2 = xb9.g1;
                String str6 = (String) gvbVar2.m(xb9Var, zv8VarArr2[18]);
                cxbVar.d.getClass();
                if (!cqk.d(str6, "26.28.0")) {
                    xb9Var.B0.B(xb9Var, zv8VarArr2[18], null);
                }
                return sbi.a;
            case 27:
                yab.i0((wmi) c0a.j(accountInitializer, 139), ((n0c) ((xhh) m94.l.getValue())).b(), 0, new q6(accountInitializer, null, 0), 2);
                return sbi.a;
            case 28:
                un4 un4Var = (un4) c0a.j(accountInitializer, 600);
                r07 r07Var = new r07(((cg9) un4Var.c.getValue()).stream(), new wz(new q8e(((ij4) un4Var.d.getValue()).c), 2), new sn4(3, null), 0);
                ghb ghbVar2 = ew5.b;
                tre.m0(new j3(new fz6(e9i.G(r07Var, qe7.O(1, lw5.SECONDS)), new qn6(un4Var, (lq4) null, 14), 3), 14, new adh(un4Var, (lq4) null, 9)), un4Var.a);
                return sbi.a;
            default:
                i92 i92Var = (i92) c0a.j(accountInitializer, 601);
                i92Var.o.S0().D0(k66.a, new e6(6, i92Var));
                return sbi.a;
        }
    }
}
