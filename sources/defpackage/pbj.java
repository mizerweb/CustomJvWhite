package defpackage;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.j;

/* JADX INFO: loaded from: classes3.dex */
public final class pbj extends gab {
    public final jfk a;
    public final short b;

    public pbj(ByteBuffer byteBuffer, jfk jfkVar) throws j {
        this.a = jfkVar;
        int iA = a(byteBuffer, ifk.supported_versions.a, 2);
        if (jfkVar != jfk.client_hello) {
            if (jfkVar != jfk.server_hello) {
                ore.a();
                throw null;
            }
            if (iA == 2) {
                this.b = byteBuffer.getShort();
                return;
            } else {
                p51.g("Incorrect extension length");
                throw null;
            }
        }
        int i = byteBuffer.get() & 255;
        if (i % 2 != 0 || iA != i + 1) {
            p51.g("invalid versions length");
            throw null;
        }
        for (int i2 = 0; i2 < i; i2 += 2) {
            short s = byteBuffer.getShort();
            if (s == 772 || this.b == 0) {
                this.b = s;
            }
        }
    }

    @Override // defpackage.gab
    public final byte[] b() {
        jfk jfkVar = jfk.client_hello;
        jfk jfkVar2 = this.a;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(jfkVar2.equals(jfkVar) ? 7 : 6);
        byteBufferAllocate.putShort(ifk.supported_versions.a);
        if (jfkVar2.equals(jfkVar)) {
            byteBufferAllocate.putShort((short) 3);
            byteBufferAllocate.put((byte) 2);
            byteBufferAllocate.put(new byte[]{3, 4});
        } else {
            byteBufferAllocate.putShort((short) 2);
            byteBufferAllocate.put(new byte[]{3, 4});
        }
        return byteBufferAllocate.array();
    }

    public pbj(jfk jfkVar) {
        this.a = jfkVar;
        this.b = (short) 772;
    }
}
