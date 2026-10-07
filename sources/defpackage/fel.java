package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fel {
    public static final void a(cf7 cf7Var, Object obj, vt4 vt4Var) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionB = b(cf7Var, obj, null);
        if (undeliveredElementExceptionB != null) {
            e9i.f0(vt4Var, undeliveredElementExceptionB);
        }
    }

    public static final UndeliveredElementException b(cf7 cf7Var, Object obj, UndeliveredElementException undeliveredElementException) throws IllegalAccessException, InvocationTargetException {
        try {
            cf7Var.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(c0a.n(obj, "Exception in undelivered element handler for "), th);
            }
            gm0.b(undeliveredElementException, th);
            return undeliveredElementException;
        }
    }

    public static boolean d(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = d(file2) && z;
        }
        return z;
    }

    public static void e(Context context, pgg pggVar) {
        if (d(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            pggVar.d(14, null);
        } else {
            pggVar.d(15, null);
        }
    }
}
