package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qqk {
    public static final yr8 a = new yr8(19);

    public static void a(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void b(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
