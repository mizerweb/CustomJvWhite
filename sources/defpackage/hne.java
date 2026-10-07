package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class hne {
    public static hne g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public s80 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final yx0 h = new yx0(6, 1);

    public static synchronized hne c() {
        try {
            if (g == null) {
                g = new hne();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        yx0 yx0Var = h;
        yx0Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) yx0Var.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        keg kegVar = (keg) this.a.get(context);
        if (kegVar == null) {
            kegVar = new keg(0);
            this.a.put(context, kegVar);
        }
        int i2 = kegVar.c;
        if (i2 != 0 && i <= kegVar.a[i2 - 1]) {
            kegVar.b(i, colorStateList);
            return;
        }
        if (i2 >= kegVar.a.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            kegVar.a = Arrays.copyOf(kegVar.a, i6);
            kegVar.b = Arrays.copyOf(kegVar.b, i6);
        }
        kegVar.a[i2] = i;
        kegVar.b[i2] = colorStateList;
        kegVar.c = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    public final Drawable b(Context context, int i) {
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableM;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            vi9 vi9Var = (vi9) this.b.get(context);
            if (vi9Var != null && (weakReference = (WeakReference) vi9Var.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    vi9Var.h(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e == null) {
            layerDrawableM = null;
        } else if (i == R.drawable.abc_cab_background_top_material) {
            layerDrawableM = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        } else if (i == R.drawable.abc_ratingbar_material) {
            layerDrawableM = s80.m(this, context, R.dimen.abc_star_big);
        } else if (i == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableM = s80.m(this, context, R.dimen.abc_star_medium);
        } else if (i == R.drawable.abc_ratingbar_small_material) {
            layerDrawableM = s80.m(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableM = null;
        }
        if (layerDrawableM == null) {
            return layerDrawableM;
        }
        layerDrawableM.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableM;
                }
                vi9 vi9Var2 = (vi9) this.b.get(context);
                if (vi9Var2 == null) {
                    vi9Var2 = new vi9((Object) null);
                    this.b.put(context, vi9Var2);
                }
                vi9Var2.f(j, new WeakReference(constantState2));
                return layerDrawableM;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(int i, Context context, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableE = e(context, R.drawable.abc_vector_test);
                if (drawableE == null || (!(drawableE instanceof dsi) && !"android.graphics.drawable.VectorDrawable".equals(drawableE.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                vt5.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized Drawable e(Context context, int i) {
        return d(i, context, false);
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        keg kegVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListP = null;
        colorStateList = (weakHashMap == null || (kegVar = (keg) weakHashMap.get(context)) == null) ? null : (ColorStateList) kegVar.a(i);
        if (colorStateList == null) {
            s80 s80Var = this.e;
            if (s80Var != null) {
                colorStateListP = s80Var.p(context, i);
            }
            if (colorStateListP != null) {
                a(context, i, colorStateListP);
            }
            colorStateList = colorStateListP;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterF;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        s80 s80Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (s80Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = dqh.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = xr.b;
                s80.w(drawableFindDrawableByLayerId, iC, mode2);
                s80.w(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), dqh.c(context, R.attr.colorControlNormal), mode2);
                s80.w(layerDrawable.findDrawableByLayerId(android.R.id.progress), dqh.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = dqh.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = xr.b;
                s80.w(drawableFindDrawableByLayerId2, iB, mode3);
                s80.w(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), dqh.c(context, R.attr.colorControlActivated), mode3);
                s80.w(layerDrawable2.findDrawableByLayerId(android.R.id.progress), dqh.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        s80 s80Var2 = this.e;
        boolean z3 = false;
        if (s80Var2 != null) {
            PorterDuff.Mode mode4 = xr.b;
            if (s80.d(i, (int[]) s80Var2.a)) {
                z2 = true;
                iRound = -1;
            } else {
                if (s80.d(i, (int[]) s80Var2.c)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zD = s80.d(i, (int[]) s80Var2.d);
                    i2 = android.R.attr.colorBackground;
                    if (zD) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                int iC2 = dqh.c(context, i2);
                synchronized (xr.class) {
                    porterDuffColorFilterF = f(iC2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterF);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
