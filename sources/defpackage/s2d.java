package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class s2d {
    public static final s2d d = new s2d(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = vqi.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public s2d(float f2, float f3) {
        lvb.R(f2 > 0.0f);
        lvb.R(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s2d.class == obj.getClass()) {
            s2d s2dVar = (s2d) obj;
            if (this.a == s2dVar.a && this.b == s2dVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = vqi.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public s2d(float f2) {
        this(f2, 1.0f);
    }
}
