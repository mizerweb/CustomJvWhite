package defpackage;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public final class r8k extends o8k {
    public int a;
    public long b;
    public long c;

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.c) + ti8.b(this.b) + ti8.b(this.a) + 1;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        try {
            zak zakVar = z7kVar.E;
            pak pakVar = (pak) zakVar.a.get(Integer.valueOf(this.a));
            if (pakVar != null) {
                zakVar.y += pakVar.e.l(this.c);
            }
        } catch (bJ e) {
            z7kVar.e(ewi.c(e.a), null, 1);
        }
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 4);
        ti8.a(this.a, byteBuffer);
        ti8.c(this.b, byteBuffer);
        ti8.c(this.c, byteBuffer);
    }

    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.a = o8k.e(byteBuffer);
        this.b = ti8.h(byteBuffer);
        this.c = ti8.h(byteBuffer);
    }

    public final String toString() {
        return zo5.k(this.c, "|", "]", zo5.x(this.a, this.b, "ResetStreamFrame[", "|"));
    }
}
