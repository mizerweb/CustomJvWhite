package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vpk {
    public static int a(int i, int i2, String str) {
        String strB;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strB = pqk.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                ore.p(zo5.h(i2, "negative size: "));
                return 0;
            }
            strB = pqk.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strB);
    }

    public static int b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        c.r(g(i, i2, "index"));
        return 0;
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        ore.n("Executor was null.");
        return null;
    }

    public static void d(boolean z) {
        if (z) {
            return;
        }
        ore.a();
    }

    public static void e(int i, int i2, int i3) {
        String strG;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strG = g(i, i3, "start index");
            } else {
                strG = (i2 < 0 || i2 > i3) ? g(i2, i3, "end index") : pqk.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static void f(boolean z, Object obj) {
        if (z) {
            return;
        }
        ore.k((String) obj);
    }

    private static String g(int i, int i2, String str) {
        if (i < 0) {
            return pqk.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return pqk.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ore.p(zo5.h(i2, "negative size: "));
        return null;
    }
}
