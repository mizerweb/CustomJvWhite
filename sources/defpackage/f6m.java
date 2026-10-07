package defpackage;

import android.view.View;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f6m {
    public static ptl a = null;
    public static boolean b = true;
    public static Field c;
    public static boolean d;

    public static final Integer b(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.optInt(str));
        }
        return null;
    }

    public static final Long c(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.optLong(str));
        }
        return null;
    }

    public static final String d(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static synchronized s5m f() {
        s5m s5mVar;
        x4m x4mVar = new x4m();
        synchronized (f6m.class) {
            try {
                if (a == null) {
                    a = new ptl(1);
                }
                s5mVar = (s5m) a.b(x4mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return s5mVar;
        return s5mVar;
    }

    public float a(View view) {
        if (b) {
            try {
                return s9j.a(view);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
        return view.getAlpha();
    }

    public void e(View view, float f) {
        if (b) {
            try {
                s9j.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
        view.setAlpha(f);
    }
}
