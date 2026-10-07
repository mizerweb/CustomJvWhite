package defpackage;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.g;
import one.video.calls.sdk_private.l;

/* JADX INFO: loaded from: classes3.dex */
public final class g5k extends o8k implements tak {
    public long a;
    public int b;
    public byte[] c;

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.c.length) + ti8.b(this.a) + 1 + this.c.length;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) throws Exception {
        int iC;
        try {
            z7kVar.a(pbkVar.n()).b(this);
            d5k d5kVarA = z7kVar.a(pbkVar.n());
            d5kVarA.a(d5kVarA.g);
        } catch (bJ e) {
            if (z7kVar.p == 2) {
                z7kVar.T = e.toString();
            }
            z7kVar.e(ewi.c(e.a), "", 1);
        } catch (g e2) {
            if (z7kVar.p == 2) {
                z7kVar.T = e2.toString();
            }
            if (e2 instanceof l) {
                iC = ((l) e2).a.a + 256;
            } else {
                iC = e2.getCause() instanceof bJ ? ewi.c(((bJ) e2.getCause()).a) : 1;
            }
            z7kVar.e(iC, e2.getMessage(), 1);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        tak takVar = (tak) obj;
        return this.a != takVar.d() ? Long.compare(this.a, takVar.d()) : Long.compare(this.b, takVar.e());
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 6);
        ti8.c(this.a, byteBuffer);
        ti8.a(this.c.length, byteBuffer);
        byteBuffer.put(this.c);
    }

    @Override // defpackage.tak
    public final int e() {
        return this.b;
    }

    @Override // defpackage.tak
    public final long f() {
        return this.a + ((long) this.b);
    }

    @Override // defpackage.tak
    public final boolean g() {
        return false;
    }

    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.a = ti8.h(byteBuffer);
        int iF = ti8.f(byteBuffer);
        this.b = iF;
        byte[] bArr = new byte[iF];
        this.c = bArr;
        byteBuffer.get(bArr);
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "CryptoFrame[", ",");
        sbQ.append("]");
        return sbQ.toString();
    }

    @Override // defpackage.tak
    public final long d() {
        return this.a;
    }

    @Override // defpackage.tak
    public final byte[] b() {
        return this.c;
    }
}
