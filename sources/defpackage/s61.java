package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public enum s61 {
    ;

    public static void a(int i, ByteBuffer byteBuffer) {
        if (i < 0 || i >= byteBuffer.capacity()) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static void b(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 0) {
            ore.p("lengths must be >= 0");
        } else if (i2 > 0) {
            a(i, byteBuffer);
            a((i + i2) - 1, byteBuffer);
        }
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = wqi.a;
        return byteOrderOrder.equals(byteOrder) ? byteBuffer : byteBuffer.duplicate().order(byteOrder);
    }

    public static byte e(int i, ByteBuffer byteBuffer) {
        return byteBuffer.get(i);
    }

    public static int f(int i, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i);
    }

    public static int g(int i, ByteBuffer byteBuffer) {
        return ((byteBuffer.get(i + 1) & 255) << 8) | (byteBuffer.get(i) & 255);
    }

    public static void h(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(i, (byte) i2);
    }

    public static void i(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put(i, (byte) i2);
        byteBuffer.put(i + 1, (byte) (i2 >>> 8));
    }

    public static s61 valueOf(String str) {
        qt4.A(Enum.valueOf(s61.class, str));
        throw null;
    }
}
