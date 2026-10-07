package defpackage;

import java.nio.ByteBuffer;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
public final class tbk extends nbk {
    @Override // defpackage.pbk
    public final int d(z7k z7kVar, c4h c4hVar) {
        return 2;
    }

    @Override // defpackage.pbk
    public final w4k n() {
        return w4k.b;
    }

    @Override // defpackage.pbk
    public final y4k o() {
        return y4k.c;
    }

    @Override // defpackage.nbk
    public final String toString() {
        char cCharAt = "ZeroRTT".charAt(0);
        long j = this.b;
        Object objValueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        return "Packet " + cCharAt + "|" + objValueOf + "|Z|" + (i >= 0 ? Integer.valueOf(i) : ".") + "|" + this.c.size() + "  " + ((String) this.c.stream().map(new lbk(4)).collect(Collectors.joining(" ")));
    }

    @Override // defpackage.nbk
    public final byte w() {
        return this.a.b() ? (byte) 2 : (byte) 1;
    }

    @Override // defpackage.nbk
    public final void x(ByteBuffer byteBuffer) {
    }

    @Override // defpackage.nbk
    public final int y() {
        return 0;
    }

    @Override // defpackage.nbk
    public final void z(ByteBuffer byteBuffer) {
    }
}
