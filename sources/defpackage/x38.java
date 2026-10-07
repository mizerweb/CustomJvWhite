package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x38 implements u25 {
    public final u25 a;
    public final int b;
    public final svd c;
    public final byte[] d;
    public int e;

    public x38(u25 u25Var, int i, svd svdVar) {
        lvb.R(i > 0);
        this.a = u25Var;
        this.b = i;
        this.c = svdVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.u25
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.u25
    public final Map p() {
        return this.a.p();
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        u25 u25Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (u25Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = u25Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        nmc nmcVar = new nmc(i5, bArr3);
                        svd svdVar = this.c;
                        long jMax = !svdVar.l ? svdVar.i : Math.max(svdVar.m.o(true), svdVar.i);
                        int iA = nmcVar.a();
                        kyh kyhVar = svdVar.k;
                        kyhVar.getClass();
                        kyhVar.f(iA, nmcVar);
                        kyhVar.a(jMax, 1, iA, 0, null);
                        svdVar.l = true;
                    }
                }
                this.e = this.b;
            }
            return -1;
        }
        int i8 = u25Var.read(bArr, i, Math.min(this.e, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        v1iVar.getClass();
        this.a.w(v1iVar);
    }
}
