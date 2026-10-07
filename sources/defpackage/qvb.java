package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import one.me.android.OneMeApplication;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class qvb {
    public final /* synthetic */ AccountInitializer a;
    public final /* synthetic */ OneMeApplication b;

    public qvb(AccountInitializer accountInitializer, OneMeApplication oneMeApplication) {
        this.a = accountInitializer;
        this.b = oneMeApplication;
    }

    public final void a() {
        AccountInitializer accountInitializer = this.a;
        c46 c46Var = accountInitializer.a;
        c46Var.d();
        StringBuilder sb = new StringBuilder();
        sb.append("Total tasks durations: ");
        z77 z77Var = (z77) c46Var.b;
        long j = 0;
        for (rp9 rp9Var : z77Var.a) {
            rp9Var.getClass();
            j += rp9Var.c / 1000000;
        }
        sb.append(j);
        sb.append("ms \nTopmost by durations:\n");
        TreeSet treeSet = new TreeSet(Comparator.reverseOrder());
        ww3.P1(z77Var, treeSet);
        ww3.y1(treeSet, sb, "\n", new c6(0), 44);
        sb.append("\nTopmost by waiting:\n");
        p6 p6Var = p6.b;
        TreeSet treeSet2 = new TreeSet(Comparator.comparingLong(new d6(0)).reversed());
        ww3.P1(z77Var, treeSet2);
        ww3.y1(treeSet2, sb, "\n", new c6(1), 44);
        sb.append("\nThreads info:\n");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : z77Var.a) {
            String str = ((rp9) obj).d;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            sb.append(c0a.l(list.size(), "Thread: ", str2, ", tasksCount = ", ","));
            List<rp9> list2 = list;
            long j2 = 0;
            for (rp9 rp9Var2 : list2) {
                rp9Var2.getClass();
                j2 += rp9Var2.c / 1000000;
            }
            sb.append(" totalDuration = " + j2 + "\n");
            ww3.y1(ww3.M1(list2, new o6(0)), sb, "\n", new c6(2), 60);
            sb.append("\n");
        }
        String string = sb.toString();
        gm0.n(accountInitializer.d, string);
        ((bu) accountInitializer.d().c()).getClass();
        if (((xwh) bu.h.getValue()) != null) {
            xwh.b(string);
        }
        e eVar = (e) c0a.j(accountInitializer, 1128);
        bk5 bk5VarC = ((f5d) ((wo6) eVar.b.getValue())).c();
        bk5VarC.getClass();
        zv8 zv8Var = bk5.c[0];
        if (bk5VarC.b("ab_event")) {
            yj5.a((yj5) eVar.a.getValue(), xj5.AB_EVENT, ((Number) ((f5d) ((wo6) eVar.b.getValue())).a.C1.a(e5d.S6[131]).i()).longValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, -4);
        }
    }

    public final void b() {
        final AccountInitializer accountInitializer = this.a;
        c46 c46Var = accountInitializer.a;
        OneMeApplication oneMeApplication = this.b;
        a4c a4cVar = oneMeApplication.a;
        if (a4cVar == null) {
            a4cVar = null;
        }
        xk5 xk5Var = new xk5(accountInitializer.b, new t5(accountInitializer, 14));
        r66 r66Var = r66.a;
        x77 x77VarC = accountInitializer.c(c46Var, "Scout", r66Var, xk5Var);
        x77 x77VarC2 = accountInitializer.c(c46Var, "Logger", xw3.P0(x77VarC, accountInitializer.c(c46Var, "AppTracerCrashService", Collections.singletonList(x77VarC), new t5(accountInitializer, 20))), new x5(a4cVar, accountInitializer));
        accountInitializer.c(c46Var, "IoPoolSize", Collections.singletonList(x77VarC2), new b6(0));
        x77 x77VarC3 = accountInitializer.c(c46Var, "Invalidate DB", xw3.P0(x77VarC, x77VarC2), new a6(accountInitializer, 12));
        accountInitializer.c(c46Var, "FrescoStartup", Collections.singletonList(x77VarC), new u5(oneMeApplication, accountInitializer, 9));
        accountInitializer.b(c46Var, "LibraryUpgrade", r66Var, new a6(accountInitializer, 13));
        c46Var.f("Account", xw3.P0(x77VarC, x77VarC3), new a6(accountInitializer, 14));
        accountInitializer.b(c46Var, "AnrWatcher", r66Var, new a6(accountInitializer, 16));
        c46Var.f("SetupRx", r66.a, new b6(2));
        x77 x77VarF = c46Var.f("Chroma.init", r66Var, new v5(oneMeApplication, 0));
        accountInitializer.b(c46Var, "Fresco", r66Var, new t5(accountInitializer, 15));
        accountInitializer.b(c46Var, "Chroma.dynamicChange", Collections.singletonList(x77VarF), new u5(oneMeApplication, accountInitializer, 1));
        accountInitializer.b(c46Var, "Theme background warmup", Collections.singletonList(accountInitializer.b(c46Var, "NativeMedia", r66Var, new t5(accountInitializer, 16))), new u5(accountInitializer, oneMeApplication, 2));
        accountInitializer.b(c46Var, "EmojiProvider", r66Var, new t5(accountInitializer, 17));
        accountInitializer.b(c46Var, "Animoji warmup", r66Var, new t5(accountInitializer, 18));
        accountInitializer.b(c46Var, "AppVisibilityLogicListener", r66Var, new t5(accountInitializer, 19));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
        x77 x77VarB = accountInitializer.b(c46Var, "InitialDataStorage.Banners", r66Var, new x5(accountInitializer, 0, atomicBoolean));
        final int i = 0;
        x77 x77VarB2 = accountInitializer.b(c46Var, "InitialDataStorage.Chats", r66Var, new af7() { // from class: y5
            @Override // defpackage.af7
            public final Object invoke() throws InterruptedException {
                switch (i) {
                    case 0:
                        AccountInitializer accountInitializer2 = accountInitializer;
                        AtomicReference atomicReference2 = atomicReference;
                        long jNanoTime = System.nanoTime();
                        final boolean zA = l3c.a((zya) ((l3c) qt4.i(accountInitializer2, 677)).b.getValue(), "loadChats");
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar2.b(je9Var)) {
                                ghb ghbVar = ew5.b;
                                a4cVar2.c(je9Var, "InitialDataTask", "initialDataStorage().loadChats() by ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime, lw5.NANOSECONDS))), null);
                            }
                        }
                        final int i2 = 1;
                        atomicReference2.getAndUpdate(new UnaryOperator() { // from class: m6
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i3 = i2;
                                boolean z = true;
                                boolean z2 = zA;
                                Boolean bool = (Boolean) obj;
                                switch (i3) {
                                    case 0:
                                        if (!bool.booleanValue() && !z2) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    default:
                                        if (!bool.booleanValue() && !z2) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                }
                            }
                        });
                        break;
                    default:
                        AccountInitializer accountInitializer3 = accountInitializer;
                        AtomicReference atomicReference3 = atomicReference;
                        long jNanoTime2 = System.nanoTime();
                        final boolean zA2 = l3c.a((iza) ((l3c) qt4.i(accountInitializer3, 677)).c.getValue(), "loadFolders");
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var2 = je9.d;
                            if (a4cVar3.b(je9Var2)) {
                                ghb ghbVar2 = ew5.b;
                                a4cVar3.c(je9Var2, "InitialDataTask", "initialDataStorage().loadFolders() by ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime2, lw5.NANOSECONDS))), null);
                            }
                        }
                        final int i3 = 0;
                        atomicReference3.getAndUpdate(new UnaryOperator() { // from class: m6
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i4 = i3;
                                boolean z = true;
                                boolean z2 = zA2;
                                Boolean bool = (Boolean) obj;
                                switch (i4) {
                                    case 0:
                                        if (!bool.booleanValue() && !z2) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    default:
                                        if (!bool.booleanValue() && !z2) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                }
                            }
                        });
                        break;
                }
                return sbi.a;
            }
        });
        final int i2 = 1;
        x77 x77VarB3 = accountInitializer.b(c46Var, "InitialDataStorage.Folders", r66Var, new af7() { // from class: y5
            @Override // defpackage.af7
            public final Object invoke() throws InterruptedException {
                switch (i2) {
                    case 0:
                        AccountInitializer accountInitializer2 = accountInitializer;
                        AtomicReference atomicReference2 = atomicReference;
                        long jNanoTime = System.nanoTime();
                        final boolean zA = l3c.a((zya) ((l3c) qt4.i(accountInitializer2, 677)).b.getValue(), "loadChats");
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar2.b(je9Var)) {
                                ghb ghbVar = ew5.b;
                                a4cVar2.c(je9Var, "InitialDataTask", "initialDataStorage().loadChats() by ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime, lw5.NANOSECONDS))), null);
                            }
                        }
                        final int i3 = 1;
                        atomicReference2.getAndUpdate(new UnaryOperator() { // from class: m6
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i4 = i3;
                                boolean z = true;
                                boolean z2 = zA;
                                Boolean bool = (Boolean) obj;
                                switch (i4) {
                                    case 0:
                                        if (!bool.booleanValue() && !z2) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    default:
                                        if (!bool.booleanValue() && !z2) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                }
                            }
                        });
                        break;
                    default:
                        AccountInitializer accountInitializer3 = accountInitializer;
                        AtomicReference atomicReference3 = atomicReference;
                        long jNanoTime2 = System.nanoTime();
                        final boolean zA2 = l3c.a((iza) ((l3c) qt4.i(accountInitializer3, 677)).c.getValue(), "loadFolders");
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var2 = je9.d;
                            if (a4cVar3.b(je9Var2)) {
                                ghb ghbVar2 = ew5.b;
                                a4cVar3.c(je9Var2, "InitialDataTask", "initialDataStorage().loadFolders() by ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime2, lw5.NANOSECONDS))), null);
                            }
                        }
                        final int i4 = 0;
                        atomicReference3.getAndUpdate(new UnaryOperator() { // from class: m6
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                int i5 = i4;
                                boolean z = true;
                                boolean z2 = zA2;
                                Boolean bool = (Boolean) obj;
                                switch (i5) {
                                    case 0:
                                        if (!bool.booleanValue() && !z2) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    default:
                                        if (!bool.booleanValue() && !z2) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                }
                            }
                        });
                        break;
                }
                return sbi.a;
            }
        });
        accountInitializer.b(c46Var, "InitialDataStorage.Stories", r66Var, new t5(accountInitializer, 21));
        accountInitializer.b(c46Var, "LegacyChats", xw3.P0(x77VarB2, x77VarB3, x77VarB), new z5(accountInitializer, atomicBoolean, atomicReference, 0));
        accountInitializer.b(c46Var, "DevicePerformanceClass", r66Var, new t5(accountInitializer, 22));
        x77 x77VarB4 = accountInitializer.b(c46Var, "ServerPayloadCatchMode", r66Var, new t5(accountInitializer, 24));
        accountInitializer.b(c46Var, "Connect", r66Var, new t5(accountInitializer, 25));
        List listSingletonList = Collections.singletonList(x77VarB4);
        accountInitializer.b(c46Var, "ForceUpdateLogic.clearForceUpdateVersionIfNeed", listSingletonList, new t5(accountInitializer, 26));
        accountInitializer.b(c46Var, "FailProcessingTasks", listSingletonList, new t5(accountInitializer, 27));
        accountInitializer.b(c46Var, "ContactsLoader", listSingletonList, new t5(accountInitializer, 28));
        accountInitializer.b(c46Var, "CallsHistoryLoader", listSingletonList, new t5(accountInitializer, 29));
        accountInitializer.b(c46Var, "RestoreMessageUploads", listSingletonList, new a6(accountInitializer, 0));
        accountInitializer.b(c46Var, "Phonebook", listSingletonList, new a6(accountInitializer, 1));
        accountInitializer.b(c46Var, "SystemServicesManager", r66Var, new a6(accountInitializer, oneMeApplication));
        accountInitializer.b(c46Var, "PermissionStats", r66Var, new u5(accountInitializer, oneMeApplication, 3));
        accountInitializer.b(c46Var, "Legacy.PhoneNumberUtil", listSingletonList, new a6(accountInitializer, 3));
        accountInitializer.b(c46Var, "Legacy.StartupListeners", listSingletonList, new a6(accountInitializer, 4));
        accountInitializer.b(c46Var, "Shortcuts and badge warmup", r66Var, new a6(accountInitializer, 5));
        accountInitializer.b(c46Var, "InAppReviewUncaughtExceptionHandler", r66Var, new u5(oneMeApplication, accountInitializer, 4));
        accountInitializer.b(c46Var, "HeartbeatScheduler", r66Var, new a6(accountInitializer, 6));
        accountInitializer.b(c46Var, "DbCleanUpScheduler", r66Var, new a6(accountInitializer, 7));
        accountInitializer.b(c46Var, "Db.NotMainThreadListener", r66Var, new a6(accountInitializer, 8));
        accountInitializer.b(c46Var, "Mytracker", r66Var, new u5(accountInitializer, oneMeApplication, 5));
        accountInitializer.b(c46Var, "SslIntegrity", r66Var, new a6(oneMeApplication, accountInitializer));
        accountInitializer.b(c46Var, "MemoryTrimmableRegistry", r66Var, new u5(oneMeApplication, accountInitializer, 6));
        accountInitializer.b(c46Var, "ConcurrencyFeatures", r66Var, new u5(oneMeApplication, accountInitializer, 7));
        accountInitializer.b(c46Var, "BackgroundWakeFeatureInit", r66Var, new a6(accountInitializer, 10));
        accountInitializer.b(c46Var, "NotificationPermissionObserver", r66Var, new a6(accountInitializer, 11));
        accountInitializer.b(c46Var, "Dps", r66Var, new u5(accountInitializer, oneMeApplication, 8));
    }

    public final void c() {
        final long j = OneMeApplication.f;
        final long j2 = OneMeApplication.e;
        final AccountInitializer accountInitializer = this.a;
        c46 c46Var = accountInitializer.a;
        c46Var.f("AppClockUpdater", r66.a, new af7() { // from class: w5
            @Override // defpackage.af7
            public final Object invoke() {
                AccountInitializer accountInitializer2 = accountInitializer;
                long j3 = j;
                long j4 = j2;
                xq xqVar = (xq) c0a.j(accountInitializer2, 1134);
                boolean zCompareAndSet = xqVar.h.compareAndSet(false, true);
                String str = xqVar.b;
                if (zCompareAndSet) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Starting app clock updater", null);
                        }
                    }
                    xqVar.d = new uq(60, j3, j4);
                    if (((gue) xqVar.c.getValue()).i) {
                        xqVar.g.set(false);
                        xqVar.a(Long.valueOf(((gue) xqVar.c.getValue()).h), ((gue) xqVar.c.getValue()).e());
                    }
                    ((gue) xqVar.c.getValue()).c(xqVar);
                } else {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str, "Already started, skip", null);
                        }
                    }
                }
                return sbi.a;
            }
        });
        c46Var.f("GalleryPrefetch", r66.a, new t5(accountInitializer, 3));
        OneMeApplication oneMeApplication = this.b;
        c46Var.f("TimeChangeReceiver", r66.a, new u5(accountInitializer, oneMeApplication, 0));
        c46Var.f("SendInstallInfo", r66.a, new t5(accountInitializer, 6));
        c46Var.f("DailyAnalytics", r66.a, new t5(accountInitializer, 7));
        c46Var.f("NotificationTrackerCleanupScheduler", r66.a, new t5(accountInitializer, 8));
        c46Var.f("MessageCommentsCleanup", r66.a, new t5(accountInitializer, 10));
        c46Var.f("Stickers warmup", r66.a, new t5(accountInitializer, 11));
        c46Var.f("CallHistoryPrefetch", r66.a, new t5(accountInitializer, 12));
        c46Var.f("HostReachabilityTask", r66.a, new t5(accountInitializer, 13));
        c46Var.f("unsafe-files migration", r66.a, new t5(accountInitializer, 23));
        c46Var.f("Fresco:renderscript", r66.a, new v5(oneMeApplication, 1));
        c46Var.f("Fresco:NativeFilters", r66.a, new b6(1));
        c46Var.f("MemoryRegistrar", r66.a, new a6(accountInitializer, 15));
        c46Var.f("ExitReasonRegistrar", r66.a, new a6(accountInitializer, 19));
        c46Var.f("RingtoneMoveFromCacheScheduler", r66.a, new a6(accountInitializer, 22));
        c46Var.f("BatteryRegistrar", r66.a, new a6(accountInitializer, 23));
        c46Var.f("CritLogSpamReport", r66.a, new t5(accountInitializer, 0));
        c46Var.f("DatabaseStatReport", r66.a, new t5(accountInitializer, 1));
        c46Var.f("UploadsCleanupScheduler", r66.a, new t5(accountInitializer, 2));
        c46Var.f("StoriesCleanupScheduler", r66.a, new t5(accountInitializer, 4));
        c46Var.f("videoPreload:warmup", r66.a, new t5(accountInitializer, 5));
    }
}
