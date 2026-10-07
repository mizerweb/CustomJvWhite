package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class l8k extends o8k {
    public byte[] a;

    @Override // defpackage.o8k
    public final int a() {
        return 9;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        e8k e8kVar = z7kVar.a.a;
        byte[] bArr = this.a;
        m8k m8kVar = new m8k();
        if (bArr.length != 8) {
            ore.p("Path Response Frame must contain 8 bytes data");
        } else {
            m8kVar.a = bArr;
            z7kVar.h(m8kVar, new t81(4), false);
        }
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 26);
        byteBuffer.put(this.a);
    }

    public final String toString() {
        return c0a.o("PathChallengeFrame[", nl9.a(this.a), "]");
    }
}
