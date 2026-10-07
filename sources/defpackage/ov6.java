package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class ov6 {
    public static final Object j = new Object();
    public static final mw k = new mw(0);
    public final Context a;
    public final String b;
    public final yv6 c;
    public final r74 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final oy8 g;
    public final xwd h;
    public final CopyOnWriteArrayList i;

    public ov6(Context context, String str, yv6 yv6Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        new CopyOnWriteArrayList();
        this.a = context;
        yab.p(str);
        this.b = str;
        this.c = yv6Var;
        vi0 vi0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListR = new v2a(context, 14, new pgg(ComponentDiscoveryService.class)).r();
        Trace.endSection();
        Trace.beginSection("Runtime");
        qai qaiVar = qai.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListR);
        arrayList.add(new o74(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new o74(new ExecutorsRegistrar(), 1));
        arrayList2.add(v64.c(context, Context.class, new Class[0]));
        arrayList2.add(v64.c(this, ov6.class, new Class[0]));
        arrayList2.add(v64.c(yv6Var, yv6.class, new Class[0]));
        l6m l6mVar = new l6m(20);
        if (e2m.a(context) && FirebaseInitProvider.b.get()) {
            arrayList2.add(v64.c(vi0Var, vi0.class, new Class[0]));
        }
        r74 r74Var = new r74(qaiVar, arrayList, arrayList2, l6mVar);
        this.d = r74Var;
        Trace.endSection();
        this.g = new oy8(new xa5(this, context));
        this.h = r74Var.n(za5.class);
        lv6 lv6Var = new lv6(this);
        a();
        if (atomicBoolean.get()) {
            em0.e.a.get();
        }
        copyOnWriteArrayList.add(lv6Var);
        Trace.endSection();
    }

    public static ov6 b() {
        ov6 ov6Var;
        synchronized (j) {
            try {
                ov6Var = (ov6) k.get("[DEFAULT]");
                if (ov6Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + gm0.u() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((za5) ov6Var.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ov6Var;
    }

    public static ov6 e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return b();
                }
                yv6 yv6VarA = yv6.a(context);
                if (yv6VarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, yv6VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ov6 f(Context context, yv6 yv6Var) {
        ov6 ov6Var;
        AtomicReference atomicReference = mv6.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = mv6.a;
            if (atomicReference2.get() == null) {
                mv6 mv6Var = new mv6();
                do {
                    if (atomicReference2.compareAndSet(null, mv6Var)) {
                        em0.a(application);
                        em0 em0Var = em0.e;
                        em0Var.getClass();
                        synchronized (em0Var) {
                            em0Var.c.add(mv6Var);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            mw mwVar = k;
            yab.u("FirebaseApp name [DEFAULT] already exists!", !mwVar.containsKey("[DEFAULT]"));
            yab.t(context, "Application context cannot be null.");
            ov6Var = new ov6(context, "[DEFAULT]", yv6Var);
            mwVar.put("[DEFAULT]", ov6Var);
        }
        ov6Var.d();
        return ov6Var;
    }

    public final void a() {
        yab.u("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        Context context = this.a;
        boolean zA = e2m.a(context);
        String str = this.b;
        if (zA) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            a();
            this.d.c("[DEFAULT]".equals(str));
            ((za5) this.h.get()).b();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        AtomicReference atomicReference = nv6.b;
        if (atomicReference.get() == null) {
            nv6 nv6Var = new nv6(context);
            while (!atomicReference.compareAndSet(null, nv6Var)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(nv6Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ov6)) {
            return false;
        }
        ov6 ov6Var = (ov6) obj;
        ov6Var.a();
        return this.b.equals(ov6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        qg7Var.e(this.b, SdkMetricStatEvent.NAME_KEY);
        qg7Var.e(this.c, "options");
        return qg7Var.toString();
    }
}
