package com.google.firebase.concurrent;

import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bh5;
import defpackage.fe6;
import defpackage.h74;
import defpackage.iz0;
import defpackage.k19;
import defpackage.o75;
import defpackage.oy8;
import defpackage.qai;
import defpackage.sai;
import defpackage.sz4;
import defpackage.tre;
import defpackage.u64;
import defpackage.v64;
import defpackage.x0e;
import defpackage.yl0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final oy8 BG_EXECUTOR = new oy8(new fe6(0));
    static final oy8 LITE_EXECUTOR = new oy8(new fe6(1));
    static final oy8 BLOCKING_EXECUTOR = new oy8(new fe6(2));
    static final oy8 SCHEDULER = new oy8(new fe6(3));

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i) {
        return new sz4(str, i, null);
    }

    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(h74 h74Var) {
        return (ScheduledExecutorService) BG_EXECUTOR.get();
    }

    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(h74 h74Var) {
        return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();
    }

    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(h74 h74Var) {
        return (ScheduledExecutorService) LITE_EXECUTOR.get();
    }

    public static /* synthetic */ Executor lambda$getComponents$7(h74 h74Var) {
        return qai.a;
    }

    public static /* synthetic */ ScheduledExecutorService lambda$static$0() {
        return scheduled(Executors.newFixedThreadPool(4, factory("Firebase Background", 10, bgPolicy())));
    }

    public static /* synthetic */ ScheduledExecutorService lambda$static$1() {
        return scheduled(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), factory("Firebase Lite", 0, litePolicy())));
    }

    public static /* synthetic */ ScheduledExecutorService lambda$static$2() {
        return scheduled(Executors.newCachedThreadPool(factory("Firebase Blocking", 11)));
    }

    public static /* synthetic */ ScheduledExecutorService lambda$static$3() {
        return Executors.newSingleThreadScheduledExecutor(factory("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new bh5(executorService, (ScheduledExecutorService) SCHEDULER.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<v64> getComponents() {
        x0e x0eVar = new x0e(yl0.class, ScheduledExecutorService.class);
        x0e[] x0eVarArr = {new x0e(yl0.class, ExecutorService.class), new x0e(yl0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(x0eVar);
        for (x0e x0eVar2 : x0eVarArr) {
            tre.L(x0eVar2, "Null interface");
        }
        Collections.addAll(hashSet, x0eVarArr);
        v64 v64Var = new v64(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new o75(21), hashSet3);
        x0e x0eVar3 = new x0e(iz0.class, ScheduledExecutorService.class);
        x0e[] x0eVarArr2 = {new x0e(iz0.class, ExecutorService.class), new x0e(iz0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(x0eVar3);
        for (x0e x0eVar4 : x0eVarArr2) {
            tre.L(x0eVar4, "Null interface");
        }
        Collections.addAll(hashSet4, x0eVarArr2);
        v64 v64Var2 = new v64(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new o75(22), hashSet6);
        x0e x0eVar5 = new x0e(k19.class, ScheduledExecutorService.class);
        x0e[] x0eVarArr3 = {new x0e(k19.class, ExecutorService.class), new x0e(k19.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(x0eVar5);
        for (x0e x0eVar6 : x0eVarArr3) {
            tre.L(x0eVar6, "Null interface");
        }
        Collections.addAll(hashSet7, x0eVarArr3);
        v64 v64Var3 = new v64(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new o75(23), hashSet9);
        u64 u64VarA = v64.a(new x0e(sai.class, Executor.class));
        u64VarA.f = new o75(24);
        return Arrays.asList(v64Var, v64Var2, v64Var3, u64VarA.b());
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new sz4(str, i, threadPolicy);
    }
}
