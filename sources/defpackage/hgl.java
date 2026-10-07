package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hgl {
    public static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        ByteBuffer byteBuffer2;
        float f;
        float f2;
        int i5;
        int i6;
        byte b;
        int i7;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        int i8 = i3;
        while (byteBuffer.hasRemaining() && i8 < i4) {
            if (i == 2) {
                byteBuffer2 = null;
                f = 2.1474836E9f;
                f2 = -2.1474836E9f;
                i5 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
            } else if (i == 3) {
                byteBuffer2 = null;
                f = 2.1474836E9f;
                f2 = -2.1474836E9f;
                i5 = (byteBuffer.get() & 255) << 24;
            } else if (i != 4) {
                if (i != 21) {
                    if (i == 22) {
                        byteBuffer2 = null;
                        f = 2.1474836E9f;
                        i6 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                        b = byteBuffer.get();
                    } else if (i == 268435456) {
                        byteBuffer2 = null;
                        f = 2.1474836E9f;
                        i6 = (byteBuffer.get() & 255) << 24;
                        i7 = (byteBuffer.get() & 255) << 16;
                    } else if (i == 1342177280) {
                        byteBuffer2 = null;
                        f = 2.1474836E9f;
                        i6 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                        i7 = (byteBuffer.get() & 255) << 8;
                    } else {
                        if (i != 1610612736) {
                            c.t();
                            return null;
                        }
                        byteBuffer2 = null;
                        f = 2.1474836E9f;
                        i6 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                        i7 = byteBuffer.get() & 255;
                    }
                    i5 = i6 | i7;
                    f2 = -2.1474836E9f;
                } else {
                    byteBuffer2 = null;
                    f = 2.1474836E9f;
                    i6 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                    b = byteBuffer.get();
                }
                i7 = (b & 255) << 24;
                i5 = i6 | i7;
                f2 = -2.1474836E9f;
            } else {
                byteBuffer2 = null;
                f = 2.1474836E9f;
                f2 = -2.1474836E9f;
                float fI = vqi.i(byteBuffer.getFloat(), -1.0f, 1.0f);
                i5 = (int) (fI < 0.0f ? (-fI) * (-2.1474836E9f) : fI * 2.1474836E9f);
            }
            int i9 = (int) ((((long) i5) * ((long) i8)) / ((long) i4));
            if (i == 2) {
                byteBufferOrder.put((byte) (i9 >> 16));
                byteBufferOrder.put((byte) (i9 >> 24));
            } else if (i == 3) {
                byteBufferOrder.put((byte) (i9 >> 24));
            } else if (i != 4) {
                if (i == 21) {
                    byteBufferOrder.put((byte) (i9 >> 8));
                    byteBufferOrder.put((byte) (i9 >> 16));
                    byteBufferOrder.put((byte) (i9 >> 24));
                } else if (i == 22) {
                    byteBufferOrder.put((byte) i9);
                    byteBufferOrder.put((byte) (i9 >> 8));
                    byteBufferOrder.put((byte) (i9 >> 16));
                    byteBufferOrder.put((byte) (i9 >> 24));
                } else if (i == 268435456) {
                    byteBufferOrder.put((byte) (i9 >> 24));
                    byteBufferOrder.put((byte) (i9 >> 16));
                } else if (i == 1342177280) {
                    byteBufferOrder.put((byte) (i9 >> 24));
                    byteBufferOrder.put((byte) (i9 >> 16));
                    byteBufferOrder.put((byte) (i9 >> 8));
                } else {
                    if (i != 1610612736) {
                        c.t();
                        return byteBuffer2;
                    }
                    byteBufferOrder.put((byte) (i9 >> 24));
                    byteBufferOrder.put((byte) (i9 >> 16));
                    byteBufferOrder.put((byte) (i9 >> 8));
                    byteBufferOrder.put((byte) i9);
                }
            } else if (i9 < 0) {
                byteBufferOrder.putFloat((-i9) / f2);
            } else {
                byteBufferOrder.putFloat(i9 / f);
            }
            if (byteBuffer.position() == iPosition + i2) {
                i8++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }

    public static final b81 b(s71 s71Var) {
        switch (c81.$EnumSwitchMapping$0[s71Var.ordinal()]) {
            case 1:
                return b81.c;
            case 2:
                return b81.d;
            case 3:
                return b81.e;
            case 4:
                return b81.f;
            case 5:
                return b81.h;
            case 6:
                return b81.i;
            case 7:
                return b81.l;
            default:
                ore.o();
                return null;
        }
    }
}
