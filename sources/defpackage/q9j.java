package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q9j {
    public static final w9j a;
    public static final p19 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new x9j();
        } else {
            a = new w9j();
        }
        b = new p19(3, Float.class, "translationAlpha");
        new p19(4, Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return a.a(view);
    }

    public static void b() {
        a.getClass();
    }

    public static void c(View view, int i, int i2, int i3, int i4) {
        a.g(view, i, i2, i3, i4);
    }

    public static void d(View view, float f) {
        a.e(view, f);
    }

    public static void e(View view, int i) {
        a.h(view, i);
    }
}
