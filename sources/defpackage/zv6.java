package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zv6 implements u25 {
    public final /* synthetic */ int a;
    public final u25 b;
    public final Object c;
    public final Serializable d;
    public Object e;

    public zv6(rsb rsbVar, yki ykiVar) {
        this.a = 0;
        this.b = rsbVar;
        this.c = ykiVar;
        this.d = zv6.class.getName();
        this.e = new AtomicBoolean(false);
    }

    @Override // defpackage.u25
    public final void close() {
        int i = this.a;
        u25 u25Var = this.b;
        switch (i) {
            case 0:
                ((rsb) u25Var).close();
                break;
            default:
                if (((CipherInputStream) this.e) != null) {
                    this.e = null;
                    u25Var.close();
                }
                break;
        }
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) {
        int i = this.a;
        u25 u25Var = this.b;
        switch (i) {
            case 0:
                return ((rsb) u25Var).f(a35Var);
            default:
                try {
                    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                    try {
                        cipher.init(2, new SecretKeySpec((byte[]) this.c, "AES"), new IvParameterSpec((byte[]) this.d));
                        x25 x25Var = new x25(u25Var, a35Var);
                        this.e = new CipherInputStream(x25Var, cipher);
                        x25Var.l();
                        return -1L;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        qr7.o(e);
                        return 0L;
                    }
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                    qr7.o(e2);
                    return 0L;
                }
        }
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        int i = this.a;
        u25 u25Var = this.b;
        switch (i) {
            case 0:
                return ((rsb) u25Var).getUri();
            default:
                return u25Var.getUri();
        }
    }

    @Override // defpackage.u25
    public final Map p() {
        int i = this.a;
        u25 u25Var = this.b;
        switch (i) {
            case 0:
                return ((rsb) u25Var).p();
            default:
                return u25Var.p();
        }
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                int i3 = ((rsb) this.b).read(bArr, i, i2);
                if (i3 > 0 && ((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    String str = (String) this.d;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "DataSource. First bytes received, total bytes read: " + i3 + ", from URI: " + ((rsb) this.b).getUri(), null);
                        }
                    }
                    yki ykiVar = (yki) this.c;
                    if (ykiVar != null) {
                        ((f3j) ykiVar.a).j.l();
                    }
                }
                return i3;
            default:
                ((CipherInputStream) this.e).getClass();
                int i4 = ((CipherInputStream) this.e).read(bArr, i, i2);
                if (i4 < 0) {
                    return -1;
                }
                return i4;
        }
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        int i = this.a;
        u25 u25Var = this.b;
        switch (i) {
            case 0:
                ((rsb) u25Var).w(v1iVar);
                break;
            default:
                v1iVar.getClass();
                u25Var.w(v1iVar);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zv6(u25 u25Var, byte[] bArr, byte[] bArr2) {
        this.a = 1;
        this.b = u25Var;
        this.c = bArr;
        this.d = bArr2;
    }
}
