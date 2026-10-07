package defpackage;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.j;

/* JADX INFO: loaded from: classes3.dex */
public final class q5k extends p5k {
    public long a;
    public byte[] b;
    public byte[] c;
    public int d;
    public pj9 e;

    public static byte[] e(ByteBuffer byteBuffer, int i, int i2, String str) {
        if (i2 < i) {
            throw new j("No length specified for ".concat(str));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 << 8) | (byteBuffer.get() & 255);
        }
        if (i2 - i < i3) {
            throw new j("Message too short for given length of ".concat(str));
        }
        byte[] bArr = new byte[i3];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // defpackage.p5k
    public final jfk b() {
        return jfk.new_session_ticket;
    }

    @Override // defpackage.p5k
    public final byte[] d() {
        pj9 pj9Var = this.e;
        int length = pj9Var != null ? pj9Var.b().length : 0;
        int length2 = this.c.length + 11 + this.b.length + 2 + length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 + 4);
        byteBufferAllocate.putInt(length2 | (jfk.new_session_ticket.a << 24));
        byteBufferAllocate.putInt(this.d);
        byteBufferAllocate.putInt((int) this.a);
        byteBufferAllocate.put((byte) this.c.length);
        byteBufferAllocate.put(this.c);
        byteBufferAllocate.putShort((short) this.b.length);
        byteBufferAllocate.put(this.b);
        byteBufferAllocate.putShort((short) length);
        pj9 pj9Var2 = this.e;
        if (pj9Var2 != null) {
            byteBufferAllocate.put(pj9Var2.b());
        }
        return byteBufferAllocate.array();
    }
}
