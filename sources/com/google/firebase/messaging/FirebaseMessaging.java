package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.a9m;
import defpackage.ae7;
import defpackage.aid;
import defpackage.bw3;
import defpackage.c01;
import defpackage.cml;
import defpackage.fe6;
import defpackage.fv9;
import defpackage.g3m;
import defpackage.gwl;
import defpackage.jm5;
import defpackage.kam;
import defpackage.mw;
import defpackage.oo;
import defpackage.ouk;
import defpackage.ov6;
import defpackage.ove;
import defpackage.q1j;
import defpackage.q7h;
import defpackage.qjh;
import defpackage.tf;
import defpackage.tv6;
import defpackage.vn6;
import defpackage.wv6;
import defpackage.xp9;
import defpackage.xv6;
import defpackage.xwd;
import defpackage.yab;
import defpackage.yfj;
import defpackage.zo7;
import defpackage.zpe;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {
    public static zo7 j;
    public static xwd k = new fe6(4);
    public static ScheduledThreadPoolExecutor l;
    public final ov6 a;
    public final Context b;
    public final yfj c;
    public final xp9 d;
    public final ae7 e;
    public final ScheduledThreadPoolExecutor f;
    public final ThreadPoolExecutor g;
    public final q1j h;
    public boolean i;

    public FirebaseMessaging(ov6 ov6Var, xwd xwdVar, xwd xwdVar2, tv6 tv6Var, xwd xwdVar3, q7h q7hVar) {
        ov6Var.a();
        Context context = ov6Var.a;
        final q1j q1jVar = new q1j(context);
        ov6Var.a();
        ove oveVar = new ove(ov6Var.a);
        final yfj yfjVar = new yfj();
        yfjVar.a = ov6Var;
        yfjVar.b = q1jVar;
        yfjVar.c = oveVar;
        yfjVar.d = xwdVar;
        yfjVar.e = xwdVar2;
        yfjVar.f = tv6Var;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new aid("Firebase-Messaging-Task", 2));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new aid("Firebase-Messaging-Init", 2));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new aid("Firebase-Messaging-File-Io", 2));
        final int i2 = 0;
        this.i = false;
        k = xwdVar3;
        this.a = ov6Var;
        this.e = new ae7(this, q7hVar);
        ov6Var.a();
        final Context context2 = ov6Var.a;
        this.b = context2;
        vn6 vn6Var = new vn6();
        this.h = q1jVar;
        this.c = yfjVar;
        this.d = new xp9(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        ov6Var.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(vn6Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: vv6
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i3 = i2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.e.f() && firebaseMessaging.l(firebaseMessaging.h())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.k(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.b;
                        cml.a(context3);
                        fml.c(context3, firebaseMessaging.c, firebaseMessaging.j());
                        if (firebaseMessaging.j()) {
                            firebaseMessaging.i();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new aid("Firebase-Messaging-Topics-Io", 2));
        gwl.c(new Callable() { // from class: vvh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                uvh uvhVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                q1j q1jVar2 = q1jVar;
                yfj yfjVar2 = yfjVar;
                synchronized (uvh.class) {
                    try {
                        WeakReference weakReference = uvh.c;
                        uvh uvhVar2 = weakReference != null ? (uvh) weakReference.get() : null;
                        if (uvhVar2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            uvhVar = new uvh(sharedPreferences, scheduledThreadPoolExecutor3);
                            synchronized (uvhVar) {
                                uvhVar.a = g85.D(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            uvh.c = new WeakReference(uvhVar);
                        } else {
                            uvhVar = uvhVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new wvh(firebaseMessaging, q1jVar2, uvhVar, yfjVar2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).e(scheduledThreadPoolExecutor, new wv6(this, 0));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: vv6
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i3 = i;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.e.f() && firebaseMessaging.l(firebaseMessaging.h())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.k(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.b;
                        cml.a(context3);
                        fml.c(context3, firebaseMessaging.c, firebaseMessaging.j());
                        if (firebaseMessaging.j()) {
                            firebaseMessaging.i();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void c(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new ScheduledThreadPoolExecutor(1, new aid("TAG", 2));
                }
                l.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging d() {
        return getInstance(ov6.b());
    }

    public static synchronized zo7 e(Context context) {
        try {
            if (j == null) {
                j = new zo7(context, 28);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public static synchronized FirebaseMessaging getInstance(ov6 ov6Var) {
        FirebaseMessaging firebaseMessaging;
        ov6Var.a();
        firebaseMessaging = (FirebaseMessaging) ov6Var.d.a(FirebaseMessaging.class);
        yab.t(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskF;
        c01 c01VarH = h();
        if (!l(c01VarH)) {
            return c01VarH.a;
        }
        String strC = q1j.c(this.a);
        xp9 xp9Var = this.d;
        synchronized (xp9Var) {
            taskF = (Task) ((mw) xp9Var.c).get(strC);
            if (taskF == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strC);
                }
                yfj yfjVar = this.c;
                taskF = yfjVar.k(yfjVar.q(q1j.c((ov6) yfjVar.a), "*", new Bundle())).m(this.g, new oo(8, this, c01VarH, strC)).f((Executor) xp9Var.b, new fv9(xp9Var, 27, strC));
                ((mw) xp9Var.c).put(strC, taskF);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strC);
            }
        }
        try {
            return (String) gwl.a(taskF);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final kam b() {
        if (h() == null) {
            return gwl.e(null);
        }
        qjh qjhVar = new qjh();
        Executors.newSingleThreadExecutor(new aid("Firebase-Messaging-Network-Io", 2)).execute(new xv6(this, qjhVar, 0));
        return qjhVar.a;
    }

    public final String f() {
        ov6 ov6Var = this.a;
        ov6Var.a();
        return "[DEFAULT]".equals(ov6Var.b) ? "" : ov6Var.c();
    }

    public final kam g() {
        qjh qjhVar = new qjh();
        this.f.execute(new xv6(this, qjhVar, 1));
        return qjhVar.a;
    }

    public final c01 h() {
        c01 c01VarB;
        zo7 zo7VarE = e(this.b);
        String strF = f();
        String strC = q1j.c(this.a);
        synchronized (zo7VarE) {
            c01VarB = c01.b(((SharedPreferences) zo7VarE.b).getString(zo7.h(strF, strC), null));
        }
        return c01VarB;
    }

    public final void i() {
        kam kamVarD;
        int i;
        ove oveVar = (ove) this.c.c;
        if (oveVar.c.E() >= 241100000) {
            a9m a9mVarL = a9m.l(oveVar.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (a9mVarL) {
                i = a9mVarL.b;
                a9mVarL.b = i + 1;
            }
            kamVarD = a9mVarL.m(new g3m(i, 5, bundle, 1)).l(jm5.d, zpe.o);
        } else {
            kamVarD = gwl.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        kamVarD.e(this.f, new wv6(this, 1));
    }

    public final boolean j() throws Throwable {
        Context context = this.b;
        cml.a(context);
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                ov6 ov6Var = this.a;
                ov6Var.a();
                if (ov6Var.d.a(tf.class) != null) {
                    return true;
                }
                if (ouk.b() && k != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public final synchronized void k(long j2) {
        c(new bw3(this, Math.min(Math.max(30L, 2 * j2), 28800L)), j2);
        this.i = true;
    }

    public final boolean l(c01 c01Var) {
        if (c01Var != null) {
            return System.currentTimeMillis() > c01Var.c + 604800000 || !this.h.b().equals(c01Var.b);
        }
        return true;
    }
}
