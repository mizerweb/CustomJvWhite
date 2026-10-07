package defpackage;

import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e2k {
    public static void a(String str, String str2, Object obj) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    public static final Field c(Field field, String str) {
        try {
            Field declaredField = ExecutorsRegistrar.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            field.setInt(declaredField, declaredField.getModifiers() & (-17));
            return declaredField;
        } catch (Throwable th) {
            dke dkeVar = new dke(th);
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return null;
            }
            je9 je9Var = je9.f;
            if (!a4cVar.b(je9Var)) {
                return null;
            }
            a4cVar.c(je9Var, "ReplaceExecutorRegistrarLogic", "fail to fetch executor field ".concat(str), dkeVar);
            return null;
        }
    }

    public static final void d(ny8 ny8Var, String[] strArr) throws IllegalAccessException {
        Field declaredField;
        gm0.n("ReplaceExecutorRegistrarLogic", "start");
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                declaredField = null;
                break;
            }
            try {
                declaredField = Field.class.getDeclaredField(strArr[i]);
                declaredField.setAccessible(true);
                break;
            } catch (Throwable unused) {
                i++;
            }
        }
        if (declaredField == null) {
            return;
        }
        Field fieldC = c(declaredField, "BG_EXECUTOR");
        if (fieldC != null) {
            e(fieldC, new eke(ny8Var, 0));
            gm0.n("ReplaceExecutorRegistrarLogic", "BG_EXECUTOR replaced");
        }
        Field fieldC2 = c(declaredField, "LITE_EXECUTOR");
        if (fieldC2 != null) {
            e(fieldC2, new eke(ny8Var, 1));
            gm0.n("ReplaceExecutorRegistrarLogic", "LITE_EXECUTOR replaced");
        }
        Field fieldC3 = c(declaredField, "BLOCKING_EXECUTOR");
        if (fieldC3 != null) {
            e(fieldC3, new eke(ny8Var, 2));
            gm0.n("ReplaceExecutorRegistrarLogic", "BLOCKING_EXECUTOR replaced");
        }
        Field fieldC4 = c(declaredField, "SCHEDULER");
        if (fieldC4 != null) {
            e(fieldC4, new eke(ny8Var, 3));
            gm0.n("ReplaceExecutorRegistrarLogic", "SCHEDULER replaced");
        }
        gm0.n("ReplaceExecutorRegistrarLogic", "finish");
    }

    public static final void e(Field field, af7 af7Var) throws IllegalAccessException {
        field.set(null, new oy8(new qv6(1, af7Var)));
    }

    public static void f(int i, int i2) {
        String strJ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strJ = yok.j("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ore.p(zo5.v(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strJ = yok.j("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static void g(int i, int i2, int i3) {
        String strH;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strH = h(i, i3, "start index");
            } else {
                strH = (i2 < 0 || i2 > i3) ? h(i2, i3, "end index") : yok.j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static String h(int i, int i2, String str) {
        if (i < 0) {
            return yok.j("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return yok.j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ore.p(zo5.v(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }
}
