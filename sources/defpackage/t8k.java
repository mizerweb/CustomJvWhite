package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public final class t8k extends o8k implements tak {
    public u8k a;
    public int b;
    public long c;
    public int d;
    public byte[] e;
    public boolean f;
    public int g;

    public t8k(int i, long j, byte[] bArr, int i2, int i3, boolean z, int i4) {
        this.a = (u8k) Stream.of((Object[]) u8k.values()).filter(new r4k(i, 3)).findFirst().get();
        this.b = i;
        this.c = j;
        byte[] bArr2 = new byte[i3];
        this.e = bArr2;
        ByteBuffer.wrap(bArr2).put(bArr, i2, i3);
        this.d = i3;
        this.f = z;
        this.g = ti8.b(this.d) + ti8.b(this.c) + ti8.b(i) + 1 + this.d;
    }

    @Override // defpackage.o8k
    public final int a() {
        return this.g;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        try {
            z7kVar.E.e(this);
        } catch (bJ e) {
            z7kVar.e(ewi.c(e.a), null, 1);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        tak takVar = (tak) obj;
        return this.c != takVar.d() ? Long.compare(this.c, takVar.d()) : Long.compare(this.d, takVar.e());
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        if (this.g > byteBuffer.remaining()) {
            ore.a();
            return;
        }
        byteBuffer.put(this.f ? (byte) 15 : (byte) 14);
        ti8.a(this.b, byteBuffer);
        ti8.c(this.c, byteBuffer);
        ti8.a(this.d, byteBuffer);
        byteBuffer.put(this.e);
    }

    @Override // defpackage.tak
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8k)) {
            return false;
        }
        t8k t8kVar = (t8k) obj;
        return this.b == t8kVar.b && this.c == t8kVar.c && this.d == t8kVar.d && this.f == t8kVar.f && Arrays.equals(this.e, t8kVar.e);
    }

    @Override // defpackage.tak
    public final long f() {
        return this.c + ((long) this.d);
    }

    @Override // defpackage.tak
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final void i(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte b = byteBuffer.get();
        boolean z = (b & 4) == 4;
        boolean z2 = (b & 2) == 2;
        this.f = (b & 1) == 1;
        this.b = o8k.e(byteBuffer);
        this.a = (u8k) Stream.of((Object[]) u8k.values()).filter(new u6(26, this)).findFirst().get();
        if (z) {
            this.c = ti8.h(byteBuffer);
        }
        if (z2) {
            this.d = ti8.f(byteBuffer);
        } else {
            this.d = byteBuffer.limit() - byteBuffer.position();
        }
        byte[] bArr = new byte[this.d];
        this.e = bArr;
        byteBuffer.get(bArr);
        this.g = byteBuffer.position() - iPosition;
    }

    public final String toString() {
        int i = this.b;
        String str = this.a.b;
        long j = this.c;
        int i2 = this.d;
        String str2 = this.f ? ",fin" : "";
        StringBuilder sbA = nbh.A(i, "StreamFrame[", "(", str, "),");
        c0a.w(sbA, j, ",", i2);
        return zo5.w(sbA, str2, "]");
    }

    @Override // defpackage.tak
    public final byte[] b() {
        return this.e;
    }

    @Override // defpackage.tak
    public final long d() {
        return this.c;
    }
}
