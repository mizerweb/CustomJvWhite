package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class vl5 {
    public final long a;

    public /* synthetic */ vl5(long j) {
        this.a = j;
    }

    public static final /* synthetic */ vl5 a(long j) {
        return new vl5(j);
    }

    public static long b(int i, float f) {
        return ((long) Float.floatToIntBits(f)) + (((long) i) << 32);
    }

    public static final float c(long j, Context context) {
        return d(j, context.getResources().getDisplayMetrics());
    }

    public static final float d(long j, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension((int) (j >> 32), e(j), displayMetrics);
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vl5) {
            return this.a == ((vl5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Dimension(encodedValue=", ")");
    }
}
