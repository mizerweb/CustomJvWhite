package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class j8k extends o8k {
    public byte[] a;

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        if (this.a.length == 0) {
            z7kVar.e(7L, "empty token in NEW_TOKEN frame", 1);
        }
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 7);
        ti8.a(this.a.length, byteBuffer);
        byteBuffer.put(this.a);
    }

    public final String toString() {
        return c0a.o("NewTokenFrame[", nl9.a(this.a), "]");
    }
}
