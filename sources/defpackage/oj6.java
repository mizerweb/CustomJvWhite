package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes3.dex */
public final class oj6 {
    public static final Charset u = Charset.forName("ISO-8859-1");
    public static final String v = "tls13 ";
    public final MessageDigest a;
    public final rai b;
    public final byte[] c;
    public final short d;
    public final short e;
    public boolean f;
    public PublicKey g;
    public PrivateKey h;
    public final byte[] i;
    public byte[] j;
    public byte[] k;
    public byte[] l;
    public byte[] m;
    public byte[] n;
    public byte[] o;
    public byte[] p;
    public byte[] q;
    public final kr6 r;
    public byte[] s;
    public byte[] t;

    /* JADX WARN: Multi-variable type inference failed */
    public oj6(kr6 kr6Var, byte[] bArr, int i, int i2) {
        this.i = bArr;
        this.r = kr6Var;
        this.d = (short) i;
        int i3 = (short) i2;
        this.e = i3;
        int i4 = i3 << 3;
        String strH = zo5.h(i4, "SHA-");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(strH);
            this.a = messageDigest;
            this.b = new rai(new n6k(zo5.h(i4, "HmacSHA")));
            byte[] bArrDigest = messageDigest.digest(new byte[0]);
            this.c = bArrDigest;
            t5k.a(bArrDigest);
            b(bArr == null ? new byte[i3] : bArr);
        } catch (NoSuchAlgorithmException unused) {
            ore.q(c0a.o("Missing ", strH, " support"));
            throw null;
        }
    }

    public final byte[] a(byte[] bArr, String str, byte[] bArr2, short s) {
        String str2 = v;
        int length = str2.length() + 3;
        Charset charset = u;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + str.getBytes(charset).length + 1 + bArr2.length);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) (str2.length() + str.getBytes().length));
        byteBufferAllocate.put(str2.getBytes(charset));
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.put((byte) bArr2.length);
        byteBufferAllocate.put(bArr2);
        return this.b.d(bArr, byteBufferAllocate.array(), s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(byte[] bArr) {
        int i = this.e;
        byte[] bArrC = this.b.c(new byte[i], bArr);
        this.j = bArrC;
        t5k.a(bArrC);
        byte[] bArrA = a(this.j, "res binder", this.c, i);
        this.k = bArrA;
        t5k.a(bArrA);
    }
}
