package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.bB;
import one.video.calls.sdk_private.bG;
import one.video.calls.sdk_private.bz;

/* JADX INFO: loaded from: classes3.dex */
public final class qbk extends pbk {
    public static final byte[] k = {-52, -50, 24, 126, -48, -102, 9, -48, 87, 40, 21, 90, 108, -71, 107, -31};
    public static final byte[] l = {-66, 12, 105, 11, -97, 102, 87, 90, 29, 118, 107, 84, -29, 104, -56, 78};
    public static final byte[] m = {-113, -76, -80, 27, 86, -84, 72, -30, 96, -5, -53, -50, -83, 124, -52, -110};
    public static final byte[] n = {-27, 73, 48, -7, 127, 33, 54, -16, 83, 10, -116, 28};
    public static final byte[] o = {70, 21, -103, -45, 93, 99, 43, -14, 35, -104, 37, -69};
    public static final byte[] p = {-40, 105, 105, -68, 45, 124, 109, -103, -112, -17, -80, 74};
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    @Override // defpackage.pbk
    public final int b(int i) {
        throw new bB();
    }

    @Override // defpackage.pbk
    public final int d(z7k z7kVar, c4h c4hVar) {
        if (Arrays.equals(w(z7kVar.G.g), this.j) && !z7kVar.V) {
            z7kVar.V = true;
            z7kVar.K = this.h;
            hak hakVar = z7kVar.B;
            byte[] bArr = z7kVar.K;
            if (bArr != null) {
                ((mck) ((qck[]) hakVar.i.b)[0]).i = bArr;
            }
            w4k w4kVar = w4k.a;
            d5k d5kVarA = z7kVar.a(w4kVar);
            d5kVarA.l = 0;
            d5kVarA.m = 0;
            d5kVarA.j.clear();
            byte[] bArr2 = this.g;
            s4k s4kVar = z7kVar.G.e;
            s4kVar.a.put(0, new z5k(0, bArr2, 2));
            s4kVar.b = bArr2;
            z7kVar.G.i = bArr2;
            nl9.a(bArr2);
            b5k b5kVar = z7kVar.e;
            s4k s4kVar2 = z7kVar.G.e;
            b5kVar.d(s4kVar2 != null ? s4kVar2.b : new byte[0]);
            z7kVar.D.h = bArr2;
            eck eckVar = z7kVar.B.k;
            if (!eckVar.p) {
                ybk ybkVar = eckVar.e[0];
                synchronized (ybkVar) {
                    ybkVar.d.b((List) ybkVar.f.values().stream().filter(new lak(22)).filter(new lak(8)).collect(Collectors.toList()));
                    ybkVar.f.clear();
                    ybkVar.g.set(0);
                    ybkVar.i = null;
                    ybkVar.j = null;
                    ybkVar.h = -1L;
                }
                synchronized (eckVar.l) {
                    eckVar.k.cancel(false);
                    eckVar.n = null;
                    eckVar.k = new dck();
                }
            }
            z7kVar.a(w4kVar).c(z7kVar.U);
        }
        return 1;
    }

    @Override // defpackage.pbk
    public final void i(ByteBuffer byteBuffer, z4k z4kVar, long j, ku8 ku8Var, int i) throws bz {
        if (byteBuffer.remaining() < 23) {
            dzh.a();
            return;
        }
        int iRemaining = byteBuffer.remaining();
        this.d = iRemaining;
        this.i = new byte[iRemaining];
        byteBuffer.get(this.i);
        byteBuffer.get();
        if (!new e8k(byteBuffer.getInt()).equals(this.a)) {
            dzh.a();
            return;
        }
        int i2 = byteBuffer.get();
        if (byteBuffer.remaining() < i2 + 17) {
            dzh.a();
            return;
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i3 = byteBuffer.get();
        if (byteBuffer.remaining() < i3) {
            dzh.a();
            return;
        }
        byte[] bArr2 = new byte[i3];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        if (byteBuffer.remaining() < 16) {
            dzh.a();
            return;
        }
        byte[] bArr3 = new byte[byteBuffer.remaining() - 16];
        this.h = bArr3;
        byteBuffer.get(bArr3);
        byte[] bArr4 = new byte[16];
        this.j = bArr4;
        byteBuffer.get(bArr4);
    }

    @Override // defpackage.pbk
    public final byte[] j(z4k z4kVar) {
        int length = this.e.length + 7 + this.g.length + this.h.length + 16;
        this.d = length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put((byte) (((this.a.b() ? 0 : 3) << 4) | 192));
        byteBufferAllocate.put(this.a.a());
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        byteBufferAllocate.put(this.h);
        this.i = byteBufferAllocate.array();
        w(null);
        throw null;
    }

    @Override // defpackage.pbk
    public final w4k n() {
        return w4k.a;
    }

    @Override // defpackage.pbk
    public final y4k o() {
        return null;
    }

    @Override // defpackage.pbk
    public final Long p() {
        return null;
    }

    @Override // defpackage.pbk
    public final boolean s() {
        return false;
    }

    @Override // defpackage.pbk
    public final boolean t() {
        return false;
    }

    public final String toString() {
        char cCharAt = "Initial".charAt(0);
        int i = this.d;
        byte[] bArr = this.h;
        return "Packet " + cCharAt + "|-|R|" + i + "| Retry Token (" + bArr.length + "): " + nl9.a(bArr);
    }

    @Override // defpackage.pbk
    public final boolean u() {
        return false;
    }

    public final byte[] w(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 7 + this.e.length + 1 + this.g.length + this.h.length);
        byteBufferAllocate.put((byte) bArr.length);
        byteBufferAllocate.put(bArr);
        byte[] bArr4 = this.i;
        byteBufferAllocate.put(bArr4, 0, bArr4.length - 16);
        try {
            e8k e8kVar = this.a;
            if (e8kVar.a == 1) {
                bArr2 = l;
            } else {
                bArr2 = e8kVar.b() ? m : k;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            e8k e8kVar2 = this.a;
            if (e8kVar2.a == 1) {
                bArr3 = o;
            } else {
                bArr3 = e8kVar2.b() ? p : n;
            }
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(np0.m, bArr3);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, gCMParameterSpec);
            cipher.updateAAD(byteBufferAllocate.array());
            return cipher.doFinal(new byte[0]);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException unused) {
            hs4.b();
            return null;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new bG(e);
        }
    }
}
