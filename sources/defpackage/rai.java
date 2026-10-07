package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class rai implements zc0 {
    public static rai b;
    public final Object a;

    public /* synthetic */ rai(Object obj) {
        this.a = obj;
    }

    public static rai a() {
        if (b == null) {
            b = new rai(new n6k("HmacSHA256"));
        }
        return b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, nq4 nq4Var) {
        pik pikVar;
        if (nq4Var instanceof pik) {
            pikVar = (pik) nq4Var;
            int i = pikVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pikVar.f = i - Integer.MIN_VALUE;
            } else {
                pikVar = new pik(this, nq4Var);
            }
        } else {
            pikVar = new pik(this, nq4Var);
        }
        Object obj = pikVar.d;
        int i2 = pikVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return ((roe) obj).a;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        hik hikVar = (hik) this.a;
        pikVar.f = 1;
        Object objA = hikVar.a(str, pikVar);
        hu4 hu4Var = hu4.a;
        return objA == hu4Var ? hu4Var : objA;
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        n6k n6kVar = (n6k) this.a;
        String str = (String) n6kVar.a;
        SecretKeySpec secretKeySpec = bArr.length <= 0 ? null : new SecretKeySpec(bArr, str);
        if (secretKeySpec == null) {
            int macLength = n6kVar.b().getMacLength();
            secretKeySpec = macLength <= 0 ? null : new SecretKeySpec(new byte[macLength], str);
        }
        if (bArr2 == null || bArr2.length <= 0) {
            ore.p("provided inputKeyingMaterial must be at least of size 1 and not null");
            return null;
        }
        try {
            Mac macB = n6kVar.b();
            macB.init(secretKeySpec);
            return macB.doFinal(bArr2);
        } catch (Exception e) {
            ore.l("could not make hmac hasher in hkdf", e);
            return null;
        }
    }

    public byte[] d(byte[] bArr, byte[] bArr2, int i) {
        n6k n6kVar = (n6k) this.a;
        SecretKeySpec secretKeySpec = (bArr == null || bArr.length <= 0) ? null : new SecretKeySpec(bArr, (String) n6kVar.a);
        if (i <= 0) {
            ore.p("out length bytes must be at least 1");
            return null;
        }
        if (secretKeySpec == null) {
            ore.p("provided pseudoRandomKey must not be null");
            return null;
        }
        try {
            Mac macB = n6kVar.b();
            macB.init(secretKeySpec);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArrDoFinal = new byte[0];
            int iCeil = (int) Math.ceil(((double) i) / ((double) macB.getMacLength()));
            if (iCeil > 255) {
                ore.p(c0a.k(i, "out length must be maximal 255 * hash-length; requested: ", " bytes"));
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            int i2 = 0;
            while (i2 < iCeil) {
                macB.update(bArrDoFinal);
                macB.update(bArr2);
                i2++;
                macB.update((byte) i2);
                bArrDoFinal = macB.doFinal();
                int iMin = Math.min(i, bArrDoFinal.length);
                byteBufferAllocate.put(bArrDoFinal, 0, iMin);
                i -= iMin;
            }
            return byteBufferAllocate.array();
        } catch (Exception e) {
            ore.l("could not make hmac hasher in hkdf", e);
            return null;
        }
    }

    public void e() {
        ((skk) this.a).o.m.post(new rda(24, this));
    }

    @Override // defpackage.zc0
    public void f(float f) {
        ((izi) this.a).b0(f * 100.0f, false);
    }

    @Override // defpackage.zc0
    public void j(float f) {
        ((izi) this.a).getAudioWaveView().f(f, true, true);
    }
}
