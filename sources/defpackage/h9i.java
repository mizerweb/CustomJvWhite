package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class h9i {
    public static final f83 a;
    public static final mj9 b;

    static {
        cqk.f("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new k9i(7);
        } else if (i >= 28) {
            a = new j9i();
        } else {
            a = new i9i();
        }
        b = new mj9(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context == null) {
            ore.p("Context cannot be null");
            return null;
        }
        qyj.j(i, "weight", 1, 1000);
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return a.j(context, typeface, i);
    }

    public static Typeface b(Context context, i77 i77Var, Resources resources, int i, String str, int i2, int i3, gm0 gm0Var, boolean z) {
        Typeface typefaceF;
        if (i77Var instanceof l77) {
            l77 l77Var = (l77) i77Var;
            String strD = l77Var.d();
            Typeface typeface = null;
            if (strD != null && !strD.isEmpty()) {
                Typeface typefaceCreate = Typeface.create(strD, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                    typeface = typefaceCreate;
                }
            }
            if (typeface != null) {
                if (gm0Var != null) {
                    new Handler(Looper.getMainLooper()).post(new yde(gm0Var, 1, typeface));
                }
                return typeface;
            }
            typefaceF = syl.b(context, l77Var.a() != null ? v0h.f(l77Var.c(), l77Var.a()) : v0h.e(l77Var.c()), i3, !z ? gm0Var != null : l77Var.b() != 0, z ? l77Var.e() : -1, new Handler(Looper.getMainLooper()), new g9i(gm0Var));
        } else {
            typefaceF = a.f(context, (j77) i77Var, resources, i3);
            if (gm0Var != null) {
                if (typefaceF != null) {
                    new Handler(Looper.getMainLooper()).post(new yde(gm0Var, 1, typefaceF));
                } else {
                    gm0Var.f(-3);
                }
            }
        }
        if (typefaceF != null) {
            b.d(c(resources, i, str, i2, i3), typefaceF);
        }
        return typefaceF;
    }

    public static String c(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
