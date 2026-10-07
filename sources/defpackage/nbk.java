package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.bp;
import one.video.calls.sdk_private.bq;
import one.video.calls.sdk_private.bz;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nbk extends pbk {
    public byte[] g;

    public nbk(e8k e8kVar, byte[] bArr, byte[] bArr2) {
        this.a = e8kVar;
        this.g = bArr;
        this.e = bArr2;
        this.c = new ArrayList();
    }

    @Override // defpackage.pbk
    public final int b(int i) {
        int iC = pbk.c(this.b);
        int iSum = this.c.stream().mapToInt(new ao8(14)).sum() + i;
        return pbk.c(this.b) + y() + this.e.length + 7 + this.g.length + (iSum + 1 > 63 ? 2 : 1) + iSum + Integer.max(0, (4 - iC) - iSum) + 16;
    }

    @Override // defpackage.pbk
    public final void e(byte b) throws bJ {
        if ((b & 12) != 0) {
            throw new bJ(11, "Reserved bits in long header packet are not zero");
        }
    }

    @Override // defpackage.pbk
    public final void i(ByteBuffer byteBuffer, z4k z4kVar, long j, ku8 ku8Var, int i) throws bJ, bz {
        if (byteBuffer.position() != 0) {
            c.t();
            return;
        }
        if (byteBuffer.remaining() < 10) {
            dzh.a();
            return;
        }
        byte b = byteBuffer.get();
        if (((b & 48) >> 4) != w()) {
            hs4.b();
            return;
        }
        if (!new e8k(byteBuffer.getInt()).equals(this.a)) {
            throw new bz("Version does not match version of the connection");
        }
        int i2 = byteBuffer.get();
        if (i2 < 0 || i2 > 20) {
            dzh.a();
            return;
        }
        if (byteBuffer.remaining() < i2) {
            dzh.a();
            return;
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i3 = byteBuffer.get();
        if (i3 < 0 || i3 > 20) {
            dzh.a();
            return;
        }
        if (byteBuffer.remaining() < i3) {
            dzh.a();
            return;
        }
        byte[] bArr2 = new byte[i3];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        z(byteBuffer);
        try {
            try {
                g(byteBuffer, b, ti8.f(byteBuffer), z4kVar, j);
            } finally {
                this.d = byteBuffer.position();
            }
        } catch (IllegalArgumentException | bp | bq unused) {
            throw new bJ(8);
        }
    }

    @Override // defpackage.pbk
    public final byte[] j(z4k z4kVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        byte bA = pbk.a(this.b, (byte) ((w() << 4) | 192));
        pbk.a(this.b, bA);
        byteBufferAllocate.put(bA);
        byteBufferAllocate.put(this.a.a());
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        x(byteBufferAllocate);
        byte[] bArrM = pbk.m(this.b);
        ByteBuffer byteBufferK = k(bArrM.length);
        ti8.a(byteBufferK.limit() + 16 + bArrM.length, byteBufferAllocate);
        byteBufferAllocate.put(bArrM);
        h(byteBufferAllocate, bArrM.length, byteBufferK, z4kVar);
        this.d = byteBufferAllocate.limit();
        int iPosition = byteBufferAllocate.position();
        byte[] bArr = new byte[iPosition];
        byteBufferAllocate.get(bArr);
        this.d = iPosition;
        return bArr;
    }

    public String toString() {
        String str = this.f ? "P" : "";
        char cCharAt = n().name().charAt(0);
        long j = this.b;
        Object objValueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        Object objValueOf2 = i >= 0 ? Integer.valueOf(i) : ".";
        int size = this.c.size();
        String str2 = (String) this.c.stream().map(new lbk(1)).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(str);
        sb.append(cCharAt);
        sb.append("|");
        sb.append(objValueOf);
        sb.append("|L|");
        sb.append(objValueOf2);
        sb.append("|");
        sb.append(size);
        return zo5.w(sb, "  ", str2);
    }

    public abstract byte w();

    public abstract void x(ByteBuffer byteBuffer);

    public abstract int y();

    public abstract void z(ByteBuffer byteBuffer);

    public nbk(e8k e8kVar) {
        this.a = e8kVar;
    }
}
