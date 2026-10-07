package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.bG;

/* JADX INFO: loaded from: classes3.dex */
public class z4k {
    public static final Charset q = Charset.forName("ISO-8859-1");
    public final e8k a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public Cipher i;
    public SecretKeySpec j;
    public SecretKeySpec k;
    public Cipher l;
    public int m;
    public boolean n;
    public volatile z4k o;
    public final /* synthetic */ int p;

    public z4k(e8k e8kVar, byte[] bArr, int i, ku8 ku8Var) {
        this.p = 0;
        this.m = 0;
        this.n = false;
        this.a = e8kVar;
        c(d(bArr, i == 1 ? "client in" : "server in", h()), true, true);
    }

    public final synchronized void a(boolean z) {
        try {
            byte[] bArrD = d(this.b, (this.a.b() ? "quicv2 " : "quic ").concat("ku"), h());
            this.c = bArrD;
            c(bArrD, false, z);
            if (z) {
                this.b = this.c;
                this.m++;
                this.c = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(byte[] bArr) {
        this.b = bArr;
        c(bArr, true, true);
    }

    public final void c(byte[] bArr, boolean z, boolean z2) {
        String str = this.a.b() ? "quicv2 " : "quic ";
        byte[] bArrD = d(bArr, str.concat("key"), g());
        if (z2) {
            this.d = bArrD;
            this.j = null;
        } else {
            this.e = bArrD;
            this.k = null;
        }
        byte[] bArrD2 = d(bArr, str.concat("iv"), (short) 12);
        if (z2) {
            this.f = bArrD2;
        } else {
            this.g = bArrD2;
        }
        if (z) {
            this.h = d(bArr, str.concat("hp"), g());
        }
    }

    public final byte[] d(byte[] bArr, String str, short s) {
        Charset charset = q;
        byte[] bytes = "tls13 ".getBytes(charset);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 3 + str.getBytes(charset).length + 1 + "".getBytes(charset).length);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.put((byte) (bytes.length + str.getBytes().length));
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.put(str.getBytes(charset));
        byteBufferAllocate.put((byte) "".getBytes(charset).length);
        byteBufferAllocate.put("".getBytes(charset));
        return i().d(bArr, byteBufferAllocate.array(), s);
    }

    public final synchronized void e() {
        if (this.n) {
            this.b = this.c;
            this.d = this.e;
            this.j = null;
            this.f = this.g;
            this.m++;
            this.c = null;
            this.n = false;
            this.e = null;
            this.g = null;
            if (this.o.m < this.m) {
                this.o.a(true);
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        switch (this.p) {
            case 0:
                if (this.i == null) {
                    try {
                        this.i = Cipher.getInstance("AES/ECB/NoPadding");
                        this.i.init(1, new SecretKeySpec(this.h, "AES"));
                    } catch (InvalidKeyException unused) {
                        hs4.b();
                        return null;
                    } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                        throw new bG(e);
                    }
                }
                try {
                    return this.i.doFinal(bArr);
                } catch (BadPaddingException | IllegalBlockSizeException unused2) {
                    hs4.b();
                    return null;
                }
            default:
                try {
                    try {
                        Cipher cipher = Cipher.getInstance("ChaCha20");
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 4, 16);
                        try {
                            int i = ByteBuffer.wrap(new byte[]{bArr[3], bArr[2], bArr[1], bArr[0]}).getInt();
                            u26.k();
                            cipher.init(1, (Key) new SecretKeySpec(this.h, "ChaCha20"), (AlgorithmParameterSpec) u26.j(i, bArrCopyOfRange));
                            return cipher.doFinal(new byte[]{0, 0, 0, 0, 0});
                        } catch (NoSuchPaddingException e2) {
                            e = e2;
                            throw new bG(e);
                        }
                    } catch (InvalidAlgorithmParameterException unused3) {
                        hs4.b();
                        return null;
                    } catch (InvalidKeyException unused4) {
                        hs4.b();
                        return null;
                    } catch (BadPaddingException unused5) {
                        hs4.b();
                        return null;
                    } catch (IllegalBlockSizeException unused6) {
                        hs4.b();
                        return null;
                    }
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
                    e = e3;
                }
                break;
        }
    }

    public short g() {
        switch (this.p) {
            case 0:
                return (short) 16;
            default:
                return (short) 32;
        }
    }

    public short h() {
        switch (this.p) {
        }
        return (short) 32;
    }

    public rai i() {
        switch (this.p) {
            case 0:
                break;
        }
        return rai.a();
    }

    public SecretKeySpec j() {
        if (this.n) {
            if (this.k == null) {
                this.k = new SecretKeySpec(this.e, "ChaCha20-Poly1305");
            }
            return this.k;
        }
        if (this.j == null) {
            this.j = new SecretKeySpec(this.d, "ChaCha20-Poly1305");
        }
        return this.j;
    }

    public Cipher k() {
        if (this.l == null) {
            try {
                this.l = Cipher.getInstance("ChaCha20-Poly1305");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new bG(e);
            }
        }
        return this.l;
    }

    public SecretKeySpec l() {
        if (this.n) {
            if (this.k == null) {
                this.k = new SecretKeySpec(this.e, "AES");
            }
            return this.k;
        }
        if (this.j == null) {
            this.j = new SecretKeySpec(this.d, "AES");
        }
        return this.j;
    }

    public Cipher m() {
        if (this.l == null) {
            try {
                this.l = Cipher.getInstance("AES/GCM/NoPadding");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new bG(e);
            }
        }
        return this.l;
    }

    public z4k(e8k e8kVar, int i, ku8 ku8Var, int i2) {
        this.p = i2;
        this.m = 0;
        this.n = false;
        this.a = e8kVar;
    }
}
