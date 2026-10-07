package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ri2 {
    public static final Object s = new Object();
    public static final SparseArray t = new SparseArray();
    public final ui2 c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public jj0 g;
    public di2 h;
    public ni2 i;
    public h6f j;
    public ljf k;
    public final gpe l;
    public final u72 m;
    public final yg2 n;
    public final ifh o;
    public int p;
    public final Integer r;
    public final dh2 a = new dh2();
    public final Object b = new Object();
    public e89 q = g88.c;

    public ri2(Context context, q09 q09Var) {
        ComponentCallbacks2 componentCallbacks2;
        ti2 ti2Var;
        gpe athVar;
        u72 u72Var;
        ri2 ri2Var;
        boolean z = true;
        this.p = 1;
        Context contextA = jq4.a(context);
        Context applicationContext = context.getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (applicationContext instanceof Application) {
                    componentCallbacks2 = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof ti2) {
            ti2Var = (ti2) componentCallbacks2;
        } else {
            try {
                Context contextA2 = jq4.a(context);
                Bundle bundle = contextA2.getPackageManager().getServiceInfo(new ComponentName(contextA2, (Class<?>) MetadataHolderService.class), 640).metaData;
                String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
                if (string == null) {
                    tvj.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                    ti2Var = null;
                } else {
                    ti2Var = (ti2) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                }
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                tvj.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                tvj.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                tvj.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (InstantiationException e4) {
                e = e4;
                tvj.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                tvj.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (NullPointerException e6) {
                e = e6;
                tvj.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (InvocationTargetException e7) {
                e = e7;
                tvj.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            }
        }
        if (ti2Var == null) {
            ore.k("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            throw null;
        }
        ui2 cameraXConfig = ti2Var.getCameraXConfig();
        this.c = cameraXConfig;
        p2e p2eVarA = (p2e) cameraXConfig.a.b(ui2.k, null);
        if (p2eVarA != null) {
            tvj.a("CameraX", "QuirkSettings from CameraXConfig: " + p2eVarA);
        } else {
            try {
                Bundle bundle2 = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) r2e.class), 640).metaData;
                if (bundle2 == null) {
                    tvj.g("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                    p2eVarA = null;
                } else {
                    p2eVarA = uml.a(contextA, bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                tvj.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            }
            tvj.a("CameraX", "QuirkSettings from app metadata: " + p2eVarA);
        }
        if (p2eVarA == null) {
            p2eVarA = q2e.b;
            tvj.a("CameraX", "QuirkSettings by default: " + p2eVarA);
        }
        q2e.c.a.D(p2eVarA);
        Executor pe2Var = (Executor) this.c.a.b(ui2.e, null);
        Handler handler = (Handler) this.c.a.b(ui2.f, null);
        pe2Var = pe2Var == null ? new pe2() : pe2Var;
        this.d = pe2Var;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f = handlerThread;
            handlerThread.start();
            this.e = lvb.e0(handlerThread.getLooper());
        } else {
            this.f = null;
            this.e = handler;
        }
        Integer num = (Integer) this.c.b(ui2.g, null);
        this.r = num;
        synchronized (s) {
            try {
                if (num != null) {
                    qyj.j(num.intValue(), "minLogLevel", 3, 6);
                    SparseArray sparseArray = t;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gpe gpeVar = (gpe) this.c.a.b(ui2.j, gpe.a);
        Objects.requireNonNull(gpeVar);
        long jA = gpeVar.a();
        if (gpeVar instanceof bh2) {
            switch (((bh2) gpeVar).b) {
                case 0:
                    athVar = new bh2(jA, 0);
                    break;
                default:
                    athVar = new bh2(jA, 1);
                    break;
            }
        } else {
            athVar = new ath(jA, gpeVar);
        }
        this.l = athVar;
        this.n = new yg2(pe2Var, new us7(this.e));
        this.o = new ifh(new n52(contextA, 2));
        synchronized (this.b) {
            if (this.p != 1) {
                z = false;
            }
            qyj.l("CameraX.initInternal() should only be called once per instance", z);
            this.p = 2;
            r72 r72Var = new r72();
            r72Var.c = new gne();
            u72Var = new u72(r72Var);
            r72Var.b = u72Var;
            r72Var.a = qt4.class;
            try {
                Executor executor = this.d;
                ri2Var = this;
                try {
                    executor.execute(new qi2(ri2Var, contextA, executor, 1, r72Var, SystemClock.elapsedRealtime()));
                    r72Var.a = "CameraX initInternal";
                } catch (Exception e8) {
                    e = e8;
                    u72Var.c(e);
                }
            } catch (Exception e9) {
                e = e9;
                ri2Var = this;
            }
        }
        ri2Var.m = u72Var;
    }

    public static void a(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(zg2 zg2Var) throws Throwable {
        if (cqk.y()) {
            int i = zg2Var != null ? zg2Var.a : -1;
            if (Build.VERSION.SDK_INT >= 29) {
                li8.i(i, cqk.N("CX:CameraProvider-RetryStatus"));
                return;
            }
            String strN = cqk.N("CX:CameraProvider-RetryStatus");
            try {
                if (cqk.j == null) {
                    cqk.j = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                Method method = cqk.j;
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                method.invoke(null, Long.valueOf(cqk.f), strN, Integer.valueOf(i));
            } catch (Exception e) {
                cqk.w(e, "traceCounter");
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = t;
        if (sparseArray.size() == 0) {
            tvj.b = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            tvj.b = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            tvj.b = 4;
        } else if (sparseArray.get(5) != null) {
            tvj.b = 5;
        } else if (sparseArray.get(6) != null) {
            tvj.b = 6;
        }
    }
}
