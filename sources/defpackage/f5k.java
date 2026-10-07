package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class f5k extends o8k {
    public long b;
    public byte[] c = new byte[0];
    public int d = -1;
    public int e = 28;
    public long a = 0;

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.c.length) + ti8.b(this.a) + 1 + (this.e == 28 ? ti8.b(0L) : 0) + this.c.length;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        long j;
        String str;
        w4k w4kVarN = pbkVar.n();
        if (ewi.a(z7kVar.p)) {
            return;
        }
        String str2 = null;
        z7kVar.f(new v5k(2, true, i() ? Long.valueOf(this.a) : null, g() ? Long.valueOf(this.a) : null));
        if ((i() || g()) && z7kVar.p == 2) {
            String strK = "";
            if (i()) {
                int i = this.d;
                if (i == -1) {
                    j = this.a;
                    byte[] bArr = this.c;
                    if (bArr != null) {
                        try {
                            str2 = new String(bArr, "UTF-8");
                        } catch (UnsupportedEncodingException unused) {
                        }
                        strK = qv1.k(": ", str2);
                    }
                    str = "transport error ";
                    strK = nbh.s(j, str, strK);
                } else {
                    if (i == -1) {
                        ore.k("Close does not have a TLS error");
                        return;
                    }
                    long j2 = i;
                    byte[] bArr2 = this.c;
                    if (bArr2 != null) {
                        try {
                            str2 = new String(bArr2, "UTF-8");
                        } catch (UnsupportedEncodingException unused2) {
                        }
                        strK = qv1.k(": ", str2);
                    }
                    strK = nbh.s(j2, "TLS error ", strK);
                }
            } else if (g()) {
                j = this.a;
                byte[] bArr3 = this.c;
                if (bArr3 != null) {
                    try {
                        str2 = new String(bArr3, "UTF-8");
                    } catch (UnsupportedEncodingException unused3) {
                    }
                    strK = qv1.k(": ", str2);
                }
                str = "application protocol error ";
                strK = nbh.s(j, str, strK);
            }
            z7kVar.T = "Server closed connection: ".concat(strK);
        }
        z7kVar.B.g();
        z7kVar.E.f();
        e8k e8kVar = z7kVar.a.a;
        z7kVar.B.d(new f5k(), w4kVarN, hak.y);
        z7kVar.p = 5;
        try {
            z7kVar.s.schedule(new x7k(z7kVar, 4), z7kVar.B.i() * 3, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused4) {
        }
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        if (this.e != 28) {
            byteBuffer.put((byte) 29);
            ti8.c(this.a, byteBuffer);
            ti8.a(this.c.length, byteBuffer);
            byteBuffer.put(this.c);
            return;
        }
        byteBuffer.put((byte) 28);
        ti8.c(this.a, byteBuffer);
        ti8.a(0, byteBuffer);
        ti8.a(this.c.length, byteBuffer);
        byteBuffer.put(this.c);
    }

    public final boolean g() {
        return this.e == 29 && this.a != 0;
    }

    @Override // defpackage.o8k
    public final boolean h() {
        return false;
    }

    public final boolean i() {
        return this.e == 28 && this.a != 0;
    }

    public final String toString() {
        int i = this.d;
        Object objH = i != -1 ? zo5.h(i, "TLS ") : Long.valueOf(this.a);
        long j = this.b;
        byte[] bArr = this.c;
        String str = bArr != null ? new String(bArr) : "-";
        StringBuilder sb = new StringBuilder("ConnectionCloseFrame[");
        sb.append(objH);
        sb.append("|");
        sb.append(j);
        return qt4.q(sb, "|", str, "]");
    }
}
