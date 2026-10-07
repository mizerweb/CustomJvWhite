package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m3m {
    public static final xui a(zui zuiVar) {
        a70 a70Var = new a70(1);
        a70Var.a = zuiVar.e.a;
        a70Var.b = zuiVar.f;
        a70Var.c = zuiVar.g;
        a70Var.e = zuiVar.h;
        fvi fviVar = new fvi(a70Var);
        wze wzeVar = new wze(10);
        wzeVar.b = zuiVar.a;
        wzeVar.c = fviVar;
        return new xui(wzeVar);
    }

    public static final wui b(wui wuiVar, xzh xzhVar, d1e d1eVar, xui xuiVar, long j) {
        int i;
        long jA = bj8.a(d1eVar.g, d1eVar.h);
        long jA2 = bj8.a(xzhVar.d, xzhVar.e);
        int i2 = d1eVar.i;
        int i3 = d1eVar.d;
        int i4 = xzhVar.f;
        float f = d1eVar.j;
        long j2 = d1eVar.e;
        long j3 = xzhVar.b;
        long j4 = xzhVar.c;
        String str = xzhVar.g;
        Float f2 = d1eVar.k;
        Integer num = d1eVar.l;
        Integer num2 = d1eVar.m;
        Integer num3 = d1eVar.n;
        boolean z = d1eVar.f;
        fvi fviVar = xuiVar.b;
        float f3 = fviVar.b;
        float f4 = fviVar.c;
        boolean z2 = fviVar.e;
        if (!z) {
            i = 1;
        } else if (yab.A(f3, 0.0f) && yab.A(f4, 1.0f)) {
            i = z2 ? 3 : 0;
        } else {
            i = 2;
        }
        return wui.a(wuiVar, null, null, null, jA, jA2, i2, i3, i4, f, 0L, j2, j, j3, j4, str, f2, num, num2, num3, i != 0 ? Integer.valueOf(qt4.D(i)) : null, 8317);
    }

    public static final boolean c(wui wuiVar, et3 et3Var) {
        if (!wuiVar.b || !ku6.p(wuiVar.e)) {
            return false;
        }
        xb9 xb9Var = (xb9) et3Var;
        return !((Boolean) xb9Var.d1.m(xb9Var, xb9.g1[49])).booleanValue();
    }

    public static void d(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void e(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
