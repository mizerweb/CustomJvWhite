package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class pj9 extends gab {
    public Long a;

    @Override // defpackage.gab
    public final byte[] b() {
        Long l = this.a;
        int i = l == null ? 0 : 4;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 4);
        byteBufferAllocate.putShort(ifk.early_data.a);
        byteBufferAllocate.putShort((short) i);
        if (l != null) {
            byteBufferAllocate.putInt((int) l.longValue());
        }
        return byteBufferAllocate.array();
    }

    public final String toString() {
        Long l = this.a;
        return "EarlyDataExtension ".concat(l == null ? "(empty)" : iic.m(l, "[", "]"));
    }
}
