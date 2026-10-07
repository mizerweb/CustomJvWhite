package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c8k {
    public byte[] a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean j;
    public dc9 k;
    public byte[] n;
    public byte[] o;
    public byte[] q;
    public h6f r;
    public int i = 3;
    public int l = 25;
    public int m = 2;
    public long s = 0;
    public int p = 1500;

    public final String toString() {
        byte[] bArr = this.a;
        String strA = bArr != null ? nl9.a(bArr) : "null";
        long j = this.b / 1000;
        int i = this.p;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        long j6 = this.g;
        long j7 = this.h;
        int i2 = this.i;
        int i3 = this.l;
        boolean z = this.j;
        int i4 = this.m;
        byte[] bArr2 = this.n;
        String strA2 = bArr2 != null ? nl9.a(bArr2) : "null";
        byte[] bArr3 = this.o;
        String strA3 = bArr3 != null ? nl9.a(bArr3) : "null";
        long j8 = this.s;
        StringBuilder sbB = nbh.B(j, "\n- original destination connection id\t", strA, "\n- max idle timeout\t");
        sbB.append("\n- max udp payload size\t");
        sbB.append(i);
        sbB.append("\n- initial max data\t\t\t");
        sbB.append(j2);
        qt4.z(j3, "\n- initial max stream data bidi local\t", "\n- initial max stream data bidi remote\t", sbB);
        sbB.append(j4);
        qt4.z(j5, "\n- initial max stream data uni\t\t", "\n- initial max streams bidi\t\t", sbB);
        sbB.append(j6);
        qt4.z(j7, "\n- initial max streams uni\t\t", "\n- ack delay exponent\t\t\t", sbB);
        qt4.x(i2, i3, "\n- max ack delay\t\t\t\t", "\n- disable migration\t\t\t", sbB);
        sbB.append(z);
        sbB.append("\n- active connection id limit\t\t");
        sbB.append(i4);
        sbB.append("\n- initial source connection id\t\t");
        nbh.G(sbB, strA2, "\n- retry source connection id\t\t", strA3, "\n- max datagram frame size\t\t");
        sbB.append(j8);
        return sbB.toString();
    }
}
