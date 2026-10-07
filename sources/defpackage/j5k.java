package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class j5k extends o8k {
    @Override // defpackage.o8k
    public final int a() {
        return 1;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        synchronized (z7kVar.g) {
            try {
                if (qt4.D(z7kVar.f) < qt4.D(5)) {
                    z7kVar.f = 5;
                    z7kVar.h.forEach(new w7k(z7kVar, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z7kVar.B.a(y4k.b);
        b5k b5kVar = z7kVar.e;
        b5kVar.j[2] = true;
        b5kVar.f[2] = null;
        b5kVar.g[2] = null;
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 30);
    }

    public final String toString() {
        return "HandshakeDoneFrame[]";
    }
}
