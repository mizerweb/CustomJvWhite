package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tqk {
    public static final do6 a;
    public static final do6[] b;

    static {
        do6 do6Var = new do6("moduleinstall", 7L);
        a = do6Var;
        b = new do6[]{do6Var};
    }

    public static final float a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    public static final float b(float f, float f2, float f3) {
        float f4 = f2 - f;
        if (f4 == 0.0f) {
            return 0.0f;
        }
        return (f3 - f) / f4;
    }

    public static final float c(float f, float f2, float f3) {
        return c0a.c(f2, f, f3, f);
    }
}
