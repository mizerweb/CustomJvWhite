package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import ru.ok.tamtam.internal.MalformedPacketException;

/* JADX INFO: loaded from: classes.dex */
public final class hlc {
    public static final byte[] h = new byte[0];
    public final byte a;
    public final byte b;
    public final short c;
    public final short d;
    public final byte e;
    public final byte[] f;
    public final int g;

    public hlc(byte[] bArr) throws MalformedPacketException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap.remaining() < 10) {
            int iRemaining = byteBufferWrap.remaining();
            byte[] bArr2 = new byte[iRemaining];
            if (iRemaining > 0) {
                byteBufferWrap.get(bArr2);
            }
            throw new MalformedPacketException(bArr2);
        }
        int iPosition = byteBufferWrap.position();
        byte b = byteBufferWrap.get();
        this.a = b;
        if (b < 5 || 10 < b) {
            int iMin = Math.min(10, byteBufferWrap.remaining());
            byte[] bArr3 = new byte[iMin];
            if (iMin > 0) {
                byteBufferWrap.get(bArr3);
            }
            throw new MalformedPacketException(bArr3);
        }
        this.b = byteBufferWrap.get();
        this.c = byteBufferWrap.getShort();
        this.d = byteBufferWrap.getShort();
        int i = byteBufferWrap.getInt();
        this.e = (byte) (i >> 24);
        int i2 = i & 16777215;
        this.g = i2;
        if (i2 > 0) {
            this.f = new byte[i2];
        } else {
            this.f = h;
        }
    }

    public static hlc a(hih hihVar, byte b, short s) {
        byte[] byteArray;
        mw mwVar = hihVar.a;
        mw mwVar2 = hihVar.a;
        if (mwVar.c > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ch3.Y(mwVar2, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                qr7.o(e);
                return null;
            }
        } else {
            byteArray = h;
        }
        byte[] bArr = byteArray;
        return new hlc(b, s, hihVar.k(), bArr, mwVar2.c > 0 ? bArr.length : 0);
    }

    public final byte[] b(short s) {
        int i = this.g;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 10);
        byteBufferAllocate.put(this.a);
        byteBufferAllocate.put(this.b);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putShort(this.d);
        byteBufferAllocate.putInt(i);
        if (i > 0) {
            byteBufferAllocate.put(this.f);
        }
        return byteBufferAllocate.array();
    }

    public final byte[] c(short s) {
        int i = this.g;
        if (i < 32) {
            return b(s);
        }
        int iMaxCompressedLength = rx8.G().fastCompressor().maxCompressedLength(i);
        byte[] bArr = new byte[iMaxCompressedLength];
        int iCompress = rx8.G().fastCompressor().compress(this.f, 0, this.g, bArr, 0, iMaxCompressedLength);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iCompress + 10);
        byteBufferAllocate.put(this.a);
        byteBufferAllocate.put(this.b);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putShort(this.d);
        byteBufferAllocate.putInt((((i / iCompress) + 1) << 24) | iCompress);
        if (iCompress > 0) {
            byteBufferAllocate.put(bArr, 0, iCompress);
        }
        return byteBufferAllocate.array();
    }

    public final String toString() {
        kfc.c.getClass();
        String strP = lhb.p(this.d);
        StringBuilder sbP = qv1.p("Packet{ver=", this.a, ", cmd=", this.b, ", seq=");
        sbP.append((int) this.c);
        sbP.append(", opcode=");
        sbP.append(strP);
        sbP.append(", cof=");
        sbP.append((int) this.e);
        sbP.append(", payloadLength=");
        sbP.append(this.g);
        sbP.append("}");
        return sbP.toString();
    }

    public hlc(byte b, short s, short s2, byte[] bArr, int i) {
        this.a = (byte) 10;
        this.b = b;
        this.c = s;
        this.d = s2;
        this.e = (byte) 0;
        this.f = bArr;
        this.g = i;
    }
}
