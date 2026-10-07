package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public enum mdi {
    ;

    public static final Unsafe a;
    public static final long b;
    public static final int c;
    public static final long d;
    public static final int e;
    public static final long f;
    public static final int g;

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Unsafe unsafe = (Unsafe) declaredField.get(null);
            a = unsafe;
            b = unsafe.arrayBaseOffset(byte[].class);
            c = unsafe.arrayIndexScale(byte[].class);
            d = unsafe.arrayBaseOffset(int[].class);
            e = unsafe.arrayIndexScale(int[].class);
            f = unsafe.arrayBaseOffset(short[].class);
            g = unsafe.arrayIndexScale(short[].class);
        } catch (IllegalAccessException unused) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (NoSuchFieldException unused2) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (SecurityException unused3) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        }
    }

    public static byte a(int i, byte[] bArr) {
        return a.getByte(bArr, b + ((long) (c * i)));
    }

    public static int b(int i, byte[] bArr) {
        return a.getInt(bArr, b + ((long) i));
    }

    public static int d(int i, int[] iArr) {
        return a.getInt(iArr, d + ((long) (e * i)));
    }

    public static long e(int i, byte[] bArr) {
        return a.getLong(bArr, b + ((long) i));
    }

    public static int f(short[] sArr, int i) {
        return a.getShort(sArr, f + ((long) (g * i))) & 65535;
    }

    public static short g(int i, byte[] bArr) {
        return a.getShort(bArr, b + ((long) i));
    }

    public static void h(byte[] bArr, int i, byte b2) {
        a.putByte(bArr, b + ((long) (c * i)), b2);
    }

    public static void i(int i, int i2, int[] iArr) {
        a.putInt(iArr, d + ((long) (e * i)), i2);
    }

    public static void k(int i, byte[] bArr, int i2) {
        a.putInt(bArr, b + ((long) i), i2);
    }

    public static void m(int i, long j, byte[] bArr) {
        a.putLong(bArr, b + ((long) i), j);
    }

    public static void n(byte[] bArr, int i, short s) {
        a.putShort(bArr, b + ((long) i), s);
    }

    public static void o(short[] sArr, int i, int i2) {
        a.putShort(sArr, f + ((long) (g * i)), (short) i2);
    }

    public static mdi valueOf(String str) {
        qt4.A(Enum.valueOf(mdi.class, str));
        v0h.g(null);
        throw null;
    }
}
