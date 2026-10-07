package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class vxh {
    public static final AtomicReference a = new AtomicReference();

    public static final void a(Context context) {
        String string;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            ore.p("applicationContext required");
            return;
        }
        AtomicReference atomicReference = a;
        do {
            if (atomicReference.compareAndSet(null, applicationContext)) {
                String packageName = context.getPackageName();
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("tracer_is_disabled", "bool", packageName);
                Boolean boolValueOf = identifier != 0 ? Boolean.valueOf(resources.getBoolean(identifier)) : null;
                if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                    swh.b = true;
                    return;
                }
                PackageManager packageManager = applicationContext.getPackageManager();
                String packageName2 = applicationContext.getPackageName();
                Bundle bundle = (Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(packageName2, PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(packageName2, np0.m)).metaData;
                ArrayList arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    if (z5h.K0(str, "ru.ok.tracer.startup.Initializer@", false) && (string = bundle.getString(str)) != null) {
                        arrayList.add(Class.forName(string));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b(arrayList2, (Class) it.next());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((fg8) it2.next()).b(applicationContext);
                }
                return;
            }
        } while (atomicReference.get() == null);
        if (applicationContext == a.get()) {
            return;
        }
        ore.k("Trying to initialize again with different app context");
    }

    public static void b(ArrayList arrayList, Class cls) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((fg8) it.next()).getClass() == cls) {
                    return;
                }
            }
        }
        fg8 fg8Var = (fg8) cls.newInstance();
        Iterator it2 = fg8Var.a().iterator();
        while (it2.hasNext()) {
            b(arrayList, (Class) it2.next());
        }
        arrayList.add(fg8Var);
    }
}
