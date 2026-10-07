package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class m8k extends o8k {
    public byte[] a;

    @Override // defpackage.o8k
    public final int a() {
        return 9;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 27);
        byteBuffer.put(this.a);
    }

    public final String toString() {
        return c0a.o("PathResponseFrame[", nl9.a(this.a), "]");
    }
}
