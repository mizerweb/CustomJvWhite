package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rsk {
    public static final long a = -1;

    public static boolean a(b87 b87Var) {
        String str = b87Var.n;
        str.getClass();
        if (!str.equals("video/dolby-vision")) {
            return str.equals("video/avc") || str.equals("video/hevc");
        }
        Pair pairJ = v21.j(b87Var);
        pairJ.getClass();
        return ((Integer) pairJ.first).intValue() != 10;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007b A[EDGE_INSN: B:36:0x007b->B:37:0x007f BREAK  A[LOOP:1: B:10:0x002f->B:63:0x002f]] */
    public static ghe b(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            a98 a98Var = c98.b;
            return ghe.e;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        int iC = c(byteBufferAsReadOnlyBuffer.position(), byteBufferAsReadOnlyBuffer) + 3;
        oc9.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        boolean z = true;
        int i2 = iC;
        while (iC < byteBufferAsReadOnlyBuffer.limit()) {
            if (!z) {
                int iC2 = c(iC, byteBufferAsReadOnlyBuffer);
                if (iC2 == byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                i2 = iC2 + 3;
                iC = i2;
                z = true;
            } else {
                while (true) {
                    if (iC > byteBufferAsReadOnlyBuffer.limit() - 4) {
                        if (iC != byteBufferAsReadOnlyBuffer.limit() - 3) {
                            iC = byteBufferAsReadOnlyBuffer.limit();
                            break;
                        }
                        short s = byteBufferAsReadOnlyBuffer.getShort(iC);
                        byte b = byteBufferAsReadOnlyBuffer.get(iC + 2);
                        if (s != 0 || (b != 0 && b != 1)) {
                            iC = byteBufferAsReadOnlyBuffer.limit();
                            break;
                        }
                        break;
                        break;
                    }
                    int i3 = byteBufferAsReadOnlyBuffer.getInt(iC);
                    int i4 = i3 & (-256);
                    if (i4 == 0 || i4 == 256) {
                        break;
                    }
                    int i5 = 16777215 & i3;
                    if (i5 == 0 || i5 == 1) {
                        iC++;
                        break;
                    }
                    if ((65535 & i3) == 0) {
                        iC += 2;
                    } else {
                        iC = (i3 & 255) == 0 ? iC + 3 : iC + 4;
                    }
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.position(i2);
                byteBufferDuplicate.limit((iC - i2) + i2);
                ByteBuffer byteBufferSlice = byteBufferDuplicate.slice();
                byteBufferSlice.getClass();
                int i6 = i + 1;
                int iB = r88.b(objArrCopyOf.length, i6);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i] = byteBufferSlice;
                z = false;
                i = i6;
            }
        }
        return c98.j(objArrCopyOf, i);
    }

    public static int c(int i, ByteBuffer byteBuffer) {
        while (true) {
            boolean z = false;
            if (i > byteBuffer.limit() - 4) {
                if (i <= byteBuffer.limit() - 3) {
                    lvb.Z("Invalid NAL units", byteBuffer.getShort(i) == 0);
                    byte b = byteBuffer.get(i + 2);
                    if (b == 1) {
                        break;
                    }
                    lvb.Z("Invalid NAL units", b == 0);
                } else {
                    while (i < byteBuffer.limit()) {
                        lvb.Z("Invalid NAL units", byteBuffer.get(i) == 0);
                        i++;
                    }
                }
                return byteBuffer.limit();
            }
            int i2 = byteBuffer.getInt(i);
            int i3 = i2 & (-256);
            if (i3 == 256) {
                break;
            }
            lvb.Z("Invalid Nal units", i3 == 0);
            int i4 = i2 & 255;
            if (i4 == 1) {
                return i + 1;
            }
            if (i4 == 0) {
                z = true;
            }
            lvb.Z("Invalid Nal units", z);
            i++;
        }
        return i;
    }
}
