package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sxl {
    public static final float a(float f, long j) {
        return tqk.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f);
    }

    public static long b(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return qx6.a(f, f2);
    }

    public static final boolean c(float f, float f2, float f3) {
        return Math.abs(f - f2) < f3;
    }

    public static final String d(Thread thread) {
        String name = thread.getName();
        return (name == null || name.length() == 0) ? String.valueOf(thread.getId()) : thread.getName();
    }
}
