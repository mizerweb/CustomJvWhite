package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public abstract class yl5 {
    public static final ny8 a = rx8.P(2, new i94(15));
    public static final ny8 b = rx8.P(2, new i94(16));
    public static final ny8 c = rx8.P(2, new i94(17));

    public static final float a(Context context) {
        Display defaultDisplay = sb8.M(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return Math.min(point.x, point.y) / c();
    }

    public static final int b(int i) {
        return gm0.K(i * d().getDisplayMetrics().density);
    }

    public static final float c() {
        return ((Number) c.getValue()).floatValue();
    }

    public static final Resources d() {
        return (Resources) a.getValue();
    }

    public static final boolean e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((float) displayMetrics.widthPixels) / displayMetrics.density <= 360.0f;
    }
}
