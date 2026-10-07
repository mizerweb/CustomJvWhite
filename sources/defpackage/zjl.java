package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zjl {
    public static jm5 a() {
        if (jm5.b != null) {
            return jm5.b;
        }
        synchronized (jm5.class) {
            try {
                if (jm5.b == null) {
                    jm5.b = new jm5(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jm5.b;
    }

    public static gx0 b() {
        if (gx0.c != null) {
            return gx0.c;
        }
        synchronized (gx0.class) {
            try {
                if (gx0.c == null) {
                    gx0.c = new gx0(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gx0.c;
    }

    public static xm8 c() {
        if (xm8.c != null) {
            return xm8.c;
        }
        synchronized (xm8.class) {
            try {
                if (xm8.c == null) {
                    xm8.c = new xm8();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xm8.c;
    }

    public static us7 d() {
        if (nl9.a != null) {
            return nl9.a;
        }
        synchronized (nl9.class) {
            try {
                if (nl9.a == null) {
                    nl9.a = new us7(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nl9.a;
    }

    public static void e(PopupWindow popupWindow) {
        popupWindow.setWindowLayoutType(2);
    }
}
