package defpackage;

import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v8k extends o8k {
    public boolean a;
    public long b;

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.b) + 1;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        Objects.toString(this);
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a ? (byte) 22 : (byte) 23);
        ti8.c(this.b, byteBuffer);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "StreamsBlockedFrame[", this.a ? "B" : "U", "|");
        sbB.append("]");
        return sbB.toString();
    }
}
