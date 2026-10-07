package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0k {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, eve eveVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            eveVar.getClass();
            yue yueVar = new yue(resources, bitmap, paint);
            b(yueVar, eveVar);
            return yueVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            dve dveVar = new dve((NinePatchDrawable) drawable);
            b(dveVar, eveVar);
            return dveVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            pj6.l("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        zue zueVar = new zue(((ColorDrawable) drawable).getColor());
        b(zueVar, eveVar);
        return zueVar;
    }

    public static void b(xue xueVar, eve eveVar) {
        xueVar.b(eveVar.b);
        xueVar.m(eveVar.c);
        xueVar.a(eveVar.f, eveVar.e);
        xueVar.e(eveVar.g);
        xueVar.l();
        xueVar.j();
        xueVar.h();
    }

    public static Drawable c(Drawable drawable, eve eveVar, Resources resources) {
        try {
            qe7.v();
            if (drawable != null && eveVar != null && eveVar.a == 2) {
                if (!(drawable instanceof t97)) {
                    return a(drawable, eveVar, resources);
                }
                pt5 pt5Var = (t97) drawable;
                while (true) {
                    Object objK = pt5Var.k();
                    if (objK == pt5Var || !(objK instanceof pt5)) {
                        break;
                        break;
                    }
                    pt5Var = (pt5) objK;
                }
                pt5Var.d(a(pt5Var.d(a), eveVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            qe7.v();
        }
    }

    public static Drawable d(Drawable drawable, eve eveVar) {
        try {
            qe7.v();
            if (drawable != null && eveVar != null && eveVar.a == 1) {
                bve bveVar = new bve(drawable);
                b(bveVar, eveVar);
                bveVar.m = eveVar.d;
                bveVar.invalidateSelf();
                return bveVar;
            }
            return drawable;
        } finally {
            qe7.v();
        }
    }

    public static Drawable e(Drawable drawable, cqk cqkVar) {
        qe7.v();
        if (drawable == null || cqkVar == null) {
            qe7.v();
            return drawable;
        }
        h1f h1fVar = new h1f(drawable, cqkVar);
        qe7.v();
        return h1fVar;
    }
}
