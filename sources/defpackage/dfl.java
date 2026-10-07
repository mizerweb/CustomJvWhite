package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dfl {
    public static ByteBuffer a(ByteBuffer... byteBufferArr) {
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            iRemaining += byteBuffer.remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static int b(int i) {
        int[] iArr = qic.$EnumSwitchMapping$0;
        int i2 = iArr[qt4.D(3)];
        if (3 != i) {
            if (i2 == 4) {
                int i3 = iArr[qt4.D(i)];
                if (i3 == 1) {
                    return 180;
                }
                if (i3 == 2) {
                    return -90;
                }
                if (i3 == 3) {
                    return 90;
                }
            } else if (i2 == 2) {
                int i4 = iArr[qt4.D(i)];
                if (i4 == 1) {
                    return -90;
                }
                if (i4 == 3) {
                    return 180;
                }
                if (i4 == 4) {
                    return 90;
                }
            } else if (i2 == 1) {
                int i5 = iArr[qt4.D(i)];
                if (i5 == 2) {
                    return 90;
                }
                if (i5 == 3) {
                    return -90;
                }
                if (i5 == 4) {
                    return 180;
                }
            } else {
                if (i2 != 3) {
                    ore.o();
                    return 0;
                }
                int i6 = iArr[qt4.D(i)];
                if (i6 == 1) {
                    return 90;
                }
                if (i6 == 2) {
                    return 180;
                }
                if (i6 == 4) {
                    return -90;
                }
            }
        }
        return 0;
    }

    public static ByteBuffer c(String str, List list) {
        int iRemaining = 8;
        for (int i = 0; i < list.size(); i++) {
            iRemaining += ((ByteBuffer) list.get(i)).remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        byteBufferAllocate.putInt(iRemaining);
        byteBufferAllocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put((ByteBuffer) list.get(i2));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer d(String str, ByteBuffer byteBuffer) {
        return e(byteBuffer, str.getBytes(StandardCharsets.UTF_8));
    }

    public static ByteBuffer e(ByteBuffer byteBuffer, byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        byteBufferAllocate.putInt(byteBuffer.remaining() + 8);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
