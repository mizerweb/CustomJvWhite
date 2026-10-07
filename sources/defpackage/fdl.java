package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fdl {
    public static byte[] a(ByteBuffer byteBuffer) {
        int iRemaining;
        ArrayList arrayList = new ArrayList();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList<xrb> arrayList2 = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = byteBufferAsReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b2 & 127) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList2.add(new xrb(i, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        ByteBuffer byteBufferB = null;
        ByteBuffer byteBuffer2 = null;
        for (xrb xrbVar : arrayList2) {
            int i3 = xrbVar.a;
            if (i3 == 5) {
                arrayList.add(b(xrbVar));
            } else if (i3 == 1 && byteBufferB == null) {
                byteBufferB = b(xrbVar);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                byteBufferAllocate.put((byte) -127);
                yrb yrbVar = new yrb(xrbVar);
                lvb.W(yrbVar, "No sequence header available.");
                byteBufferAllocate.put((byte) ((yrbVar.e << 5) | yrbVar.f));
                byteBufferAllocate.put((byte) ((yrbVar.n ? 4 : 0) | (yrbVar.g > 0 ? 128 : 0) | (yrbVar.j ? 64 : 0) | (yrbVar.k ? 32 : 0) | (yrbVar.l ? 16 : 0) | (yrbVar.m ? 8 : 0) | yrbVar.o));
                boolean z = yrbVar.h;
                byteBufferAllocate.put((byte) ((z ? yrbVar.i & 15 : 0) | (z ? 16 : 0)));
                byteBufferAllocate.flip();
                byteBuffer2 = byteBufferAllocate;
            }
        }
        lvb.W(byteBufferB, "No sequence header available.");
        ByteBuffer byteBufferA = dfl.a(byteBufferB, dfl.a((ByteBuffer[]) arrayList.toArray(new ByteBuffer[0])));
        lvb.W(byteBuffer2, "csdHeader is null.");
        return dfl.a(byteBuffer2, byteBufferA).array();
    }

    public static ByteBuffer b(xrb xrbVar) {
        ByteBuffer byteBuffer = xrbVar.b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 9);
        byteBufferAllocate.put((byte) ((xrbVar.a << 3) | 2));
        int iRemaining = byteBuffer.remaining();
        lvb.R(iRemaining > 0);
        int i = iRemaining;
        int i2 = 0;
        do {
            i2++;
            i >>= 7;
        } while (i != 0);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
        lvb.b0(i2 < 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (byte) (iRemaining & 127);
            iRemaining >>= 7;
            if (iRemaining != 0) {
                i4 |= np0.m;
            }
            byteBufferAllocate2.put((byte) i4);
        }
        byteBufferAllocate2.flip();
        byteBufferAllocate.put(byteBufferAllocate2);
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ObjectAnimator c(Object obj, Property property, Path path) {
        return wpb.a(obj, property, path);
    }
}
