package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dri {
    public static final ny8 a = rx8.P(3, new yfi(9));
    public static final ny8 b = rx8.P(3, new yfi(14));

    static {
        rx8.P(3, new yfi(15));
        rx8.P(3, new yfi(16));
        rx8.P(3, new yfi(17));
        rx8.P(3, new yfi(18));
        rx8.P(3, new yfi(19));
        rx8.P(3, new yfi(20));
        rx8.P(3, new yfi(10));
        rx8.P(3, new yfi(11));
        rx8.P(3, new yfi(12));
        rx8.P(3, new yfi(13));
    }

    public static float a(int i, float f) {
        return TypedValue.applyDimension(i, f, Resources.getSystem().getDisplayMetrics());
    }
}
