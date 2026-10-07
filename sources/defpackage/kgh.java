package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class kgh extends qzd {
    public int a;

    @Override // defpackage.gab
    public final byte[] b() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.putShort(ifk.pre_shared_key.a);
        byteBufferAllocate.putShort((short) 2);
        byteBufferAllocate.putShort((short) this.a);
        return byteBufferAllocate.array();
    }
}
