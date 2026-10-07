package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jq4 {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        int iHashCode = context.getApplicationContext().hashCode();
        int i = Build.VERSION.SDK_INT;
        Context context2 = null;
        String str = String.format("%d-%d-%s", Integer.valueOf(iHashCode), Integer.valueOf(i >= 34 ? v4.f(context) : 0), i >= 30 ? iq4.c(context) : null);
        synchronized (a) {
            try {
                HashMap map = b;
                WeakReference weakReference = (WeakReference) map.get(str);
                if (weakReference != null) {
                    Context context3 = (Context) weakReference.get();
                    if (context3 != null) {
                        context2 = context3;
                    } else {
                        map.remove(str);
                    }
                }
                if (context2 != null) {
                    return context2;
                }
                if (i >= 34) {
                    applicationContext = v4.a(applicationContext, v4.f(context));
                }
                if (i >= 30) {
                    String strC = iq4.c(context);
                    if (!Objects.equals(strC, iq4.c(applicationContext))) {
                        applicationContext = iq4.a(applicationContext, strC);
                    }
                }
                map.put(str, new WeakReference(applicationContext));
                return applicationContext;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
