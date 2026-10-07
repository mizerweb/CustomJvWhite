package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class w9j extends f6m {
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;

    public void g(View view, int i, int i2, int i3, int i4) {
        if (g) {
            try {
                u9j.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    public void h(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (h) {
                try {
                    v9j.a(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    h = false;
                    return;
                }
            }
            return;
        }
        if (!f6m.d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6m.c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f6m.d = true;
        }
        Field field = f6m.c;
        if (field != null) {
            try {
                f6m.c.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void i(View view, Matrix matrix) {
        if (e) {
            try {
                t9j.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }

    public void j(ViewGroup viewGroup, Matrix matrix) {
        if (f) {
            try {
                t9j.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
