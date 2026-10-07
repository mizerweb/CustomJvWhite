package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class y74 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y74(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(Resources.Theme theme) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29) {
            io.g(theme);
            return;
        }
        synchronized (tok.a) {
            if (tok.c) {
                method = tok.b;
                if (method != null) {
                    method.invoke(theme, null);
                }
            } else {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    tok.b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                }
                tok.c = true;
                method = tok.b;
                if (method != null) {
                    try {
                        method.invoke(theme, null);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                        tok.b = null;
                    }
                }
            }
            throw th;
        }
    }
}
