package defpackage;

import java.nio.ByteBuffer;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.bq;
import one.video.calls.sdk_private.bz;

/* JADX INFO: loaded from: classes3.dex */
public final class mbk extends nbk {
    public byte[] h;

    @Override // defpackage.pbk
    public final int d(z7k z7kVar, c4h c4hVar) {
        byte[] bArr = this.h;
        if (bArr != null && bArr.length > 0) {
            return 2;
        }
        if (!this.a.equals(z7kVar.a.a)) {
            e8k e8kVar = this.a;
            if (!e8kVar.equals(z7kVar.a.a) && e8kVar.equals(null) && z7kVar.d == 1) {
                z7kVar.d = 2;
                z7kVar.a.a = e8kVar;
                b5k b5kVar = z7kVar.e;
                b5kVar.d(b5kVar.i);
            }
        }
        b6k b6kVar = z7kVar.G;
        byte[] bArr2 = this.g;
        s4k s4kVar = b6kVar.e;
        s4kVar.a.put(0, new z5k(0, bArr2, 2));
        s4kVar.b = bArr2;
        z7kVar.i(this, c4hVar);
        z7kVar.P = true;
        return 1;
    }

    @Override // defpackage.pbk
    public final w4k n() {
        return w4k.a;
    }

    @Override // defpackage.pbk
    public final y4k o() {
        return y4k.a;
    }

    @Override // defpackage.nbk
    public final String toString() {
        String str = this.f ? "P" : "";
        char cCharAt = "Initial".charAt(0);
        long j = this.b;
        Object objValueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        Object objValueOf2 = i >= 0 ? Integer.valueOf(i) : ".";
        int size = this.c.size();
        byte[] bArr = this.h;
        String strA = bArr != null ? nl9.a(bArr) : "[]";
        String str2 = (String) this.c.stream().map(new lbk(0)).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(str);
        sb.append(cCharAt);
        sb.append("|");
        sb.append(objValueOf);
        sb.append("|L|");
        sb.append(objValueOf2);
        sb.append("|");
        sb.append(size);
        return nbh.y(sb, "  Token=", strA, " ", str2);
    }

    @Override // defpackage.nbk
    public final byte w() {
        return this.a.b() ? (byte) 1 : (byte) 0;
    }

    @Override // defpackage.nbk
    public final void x(ByteBuffer byteBuffer) {
        byte[] bArr = this.h;
        if (bArr == null) {
            byteBuffer.put((byte) 0);
        } else {
            ti8.a(bArr.length, byteBuffer);
            byteBuffer.put(this.h);
        }
    }

    @Override // defpackage.nbk
    public final int y() {
        byte[] bArr = this.h;
        if (bArr == null) {
            return 1;
        }
        return bArr.length + 1;
    }

    @Override // defpackage.nbk
    public final void z(ByteBuffer byteBuffer) throws bz {
        try {
            long jH = ti8.h(byteBuffer);
            if (jH > 0) {
                if (jH > byteBuffer.remaining()) {
                    throw new bz();
                }
                byte[] bArr = new byte[(int) jH];
                this.h = bArr;
                byteBuffer.get(bArr);
            }
        } catch (bq unused) {
            dzh.a();
        }
    }
}
