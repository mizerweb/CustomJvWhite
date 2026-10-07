package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class xr {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static xr c;
    public hne a;

    public static synchronized xr a() {
        try {
            if (c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            xr xrVar = new xr();
            c = xrVar;
            xrVar.a = hne.c();
            hne hneVar = c.a;
            s80 s80Var = new s80();
            synchronized (hneVar) {
                hneVar.e = s80Var;
            }
        }
    }

    public static void d(Drawable drawable, lh6 lh6Var, int[] iArr) {
        PorterDuff.Mode mode = hne.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = lh6Var.c;
        if (!z && !lh6Var.b) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? (ColorStateList) lh6Var.d : null;
        PorterDuff.Mode mode2 = lh6Var.b ? (PorterDuff.Mode) lh6Var.e : hne.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterF = hne.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.e(context, i);
    }
}
