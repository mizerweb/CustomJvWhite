package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class i5k extends o8k {
    public byte[] a;

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        if (z7kVar.u == 3 || z7kVar.u == 4) {
            return;
        }
        z7kVar.e(10L, "Datagram frame received, but datagram extension is not enabled", 1);
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 49);
        ti8.a(this.a.length, byteBuffer);
        byteBuffer.put(this.a);
    }

    public final String toString() {
        return c0a.o("DatagramFrame [", nl9.a(this.a), "]");
    }
}
