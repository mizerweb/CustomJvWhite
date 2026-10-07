package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tpk {
    public static final Object a = new Object();
    public static vbj b;

    public static int a(int i) {
        if (i < 3) {
            oc9.p(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void b(Context context) {
        if (b == null) {
            vbj vbjVar = new vbj(context);
            b = vbjVar;
            synchronized (vbjVar.a) {
                vbjVar.g = true;
            }
        }
    }

    public static void c(Intent intent) {
        synchronized (a) {
            try {
                if (b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    b.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ComponentName e(Context context, Intent intent) {
        synchronized (a) {
            try {
                b(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    b.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String f(g98 g98Var) {
        int size = g98Var.size();
        oc9.p(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : g98Var.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
