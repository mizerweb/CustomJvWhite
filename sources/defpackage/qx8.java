package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qx8 extends qzd {
    public List a;
    public ArrayList b;
    public int c;

    @Override // defpackage.gab
    public final byte[] b() {
        int iSum = this.a.stream().mapToInt(new ao8(2)).sum();
        int iSum2 = this.b.stream().mapToInt(new ao8(3)).sum();
        int i = iSum + 4 + iSum2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 4);
        byteBufferAllocate.putShort(ifk.pre_shared_key.a);
        byteBufferAllocate.putShort((short) i);
        byteBufferAllocate.putShort((short) iSum);
        for (ox8 ox8Var : this.a) {
            byteBufferAllocate.putShort((short) ox8Var.a.length);
            byteBufferAllocate.put(ox8Var.a);
            byteBufferAllocate.putInt((int) ox8Var.b);
        }
        this.c = byteBufferAllocate.position();
        byteBufferAllocate.putShort((short) iSum2);
        for (nx8 nx8Var : this.b) {
            byteBufferAllocate.put((byte) nx8Var.a.length);
            byteBufferAllocate.put(nx8Var.a);
        }
        byte[] bArr = new byte[byteBufferAllocate.position()];
        byteBufferAllocate.get(bArr);
        return bArr;
    }
}
