package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r9i extends gab {
    public List a;

    @Override // defpackage.gab
    public final byte[] b() {
        List list = this.a;
        int size = list.size() << 1;
        int i = size + 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 6);
        byteBufferAllocate.putShort(ifk.signature_algorithms.a);
        byteBufferAllocate.putShort((short) i);
        byteBufferAllocate.putShort((short) (list.size() << 1));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.putShort(((mfk) it.next()).a);
        }
        return byteBufferAllocate.array();
    }
}
