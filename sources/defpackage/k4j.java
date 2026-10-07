package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k4j {
    public static final k4j d = new k4j(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = vqi.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(3, 36);
    }

    public k4j(int i, float f2, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k4j) {
            k4j k4jVar = (k4j) obj;
            if (this.a == k4jVar.a && this.b == k4jVar.b && this.c == k4jVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public k4j(int i, int i2) {
        this(i, 1.0f, i2);
    }
}
