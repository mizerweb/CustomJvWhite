package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class kr {
    public static final iif a = new iif(new rg(1));
    public static final int b = -100;
    public static mc9 c = null;
    public static mc9 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final pw g = new pw(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static void a() {
        mc9 mc9Var;
        pw pwVar = g;
        pwVar.getClass();
        hw hwVar = new hw(pwVar);
        while (hwVar.hasNext()) {
            kr krVar = (kr) ((WeakReference) hwVar.next()).get();
            if (krVar != null) {
                vr vrVar = (vr) krVar;
                Context context = vrVar.k;
                if (d(context) && (mc9Var = c) != null && !mc9Var.equals(d)) {
                    a.execute(new hr(context, 1));
                }
                vrVar.o(true, true);
            }
        }
    }

    public static Object b() {
        Context context;
        pw pwVar = g;
        pwVar.getClass();
        hw hwVar = new hw(pwVar);
        while (hwVar.hasNext()) {
            kr krVar = (kr) ((WeakReference) hwVar.next()).get();
            if (krVar != null && (context = ((vr) krVar).k) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean d(Context context) {
        if (e == null) {
            try {
                int i2 = AppLocalesMetadataHolderService.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), rt.a() | np0.m).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void g(vr vrVar) {
        synchronized (h) {
            try {
                pw pwVar = g;
                pwVar.getClass();
                hw hwVar = new hw(pwVar);
                while (hwVar.hasNext()) {
                    kr krVar = (kr) ((WeakReference) hwVar.next()).get();
                    if (krVar == vrVar || krVar == null) {
                        hwVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(mc9 mc9Var) {
        Objects.requireNonNull(mc9Var);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objB = b();
            if (objB != null) {
                jr.b(objB, ir.a(mc9Var.a.a.toLanguageTags()));
                return;
            }
            return;
        }
        if (mc9Var.equals(c)) {
            return;
        }
        synchronized (h) {
            c = mc9Var;
            a();
        }
    }

    public static void n(Context context) {
        if (d(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f) {
                    return;
                }
                a.execute(new hr(context, 0));
                return;
            }
            synchronized (i) {
                try {
                    mc9 mc9Var = c;
                    if (mc9Var == null) {
                        if (d == null) {
                            d = mc9.a(np4.y(context));
                        }
                        if (d.c()) {
                        } else {
                            c = d;
                        }
                    } else if (!mc9Var.equals(d)) {
                        mc9 mc9Var2 = c;
                        d = mc9Var2;
                        np4.x(context, mc9Var2.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void c();

    public abstract void e();

    public abstract void f();

    public abstract boolean h(int i2);

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
