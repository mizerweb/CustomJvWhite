package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pj6 {
    public static af9 a = qj6.b;

    public static void a(Class cls, String str, Object... objArr) {
        if (a.h(6)) {
            a.e(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void b(String str, Class cls) {
        if (a.h(6)) {
            a.e(cls.getSimpleName(), str);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (a.h(6)) {
            a.e(str, str2, th);
        }
    }

    public static void d(Class cls, Object obj, String str) {
        if (a.h(2)) {
            a.v(cls.getSimpleName(), String.format(null, str, obj));
        }
    }

    public static void e(Class cls, String str, Object obj, Object obj2) {
        if (a.h(2)) {
            a.v(cls.getSimpleName(), String.format(null, str, obj, obj2));
        }
    }

    public static void f(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (a.h(2)) {
            String str2 = String.format(null, str, obj, obj2, obj3);
            if (a.h(2)) {
                a.v(cls.getSimpleName(), str2);
            }
        }
    }

    public static void g(String str, Long l, String str2, Object obj) {
        if (a.h(2)) {
            a.v("RequestLoggingListener", String.format(null, str, l, str2, obj));
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (a.h(2)) {
            a.v(str, String.format(null, str2, objArr));
        }
    }

    public static void i(Class cls, String str, Exception exc) {
        if (a.h(5)) {
            a.w(cls.getSimpleName(), str, exc);
        }
    }

    public static void j(Class cls, String str, Object... objArr) {
        if (a.h(5)) {
            a.w(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void k(Exception exc, String str, Object... objArr) {
        if (a.h(5)) {
            i(w41.class, String.format(null, str, objArr), exc);
        }
    }

    public static void l(String str, String str2, Object... objArr) {
        if (a.h(5)) {
            a.w(str, String.format(null, str2, objArr));
        }
    }

    public static void m(String str, String str2, Object... objArr) {
        if (a.h(6)) {
            a.a(str, String.format(null, str2, objArr));
        }
    }
}
