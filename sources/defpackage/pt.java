package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class pt extends nql {
    public final /* synthetic */ int a;

    public static tc6 e(nmc nmcVar) {
        String strV = nmcVar.v();
        strV.getClass();
        String strV2 = nmcVar.v();
        strV2.getClass();
        return new tc6(strV, strV2, nmcVar.u(), nmcVar.u(), Arrays.copyOfRange(nmcVar.a, nmcVar.b, nmcVar.c));
    }

    @Override // defpackage.nql
    public final lwa b(rwa rwaVar, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                mo2 mo2Var = new mo2(byteBuffer.limit(), byteBuffer.array());
                mo2Var.t(12);
                int iF = (mo2Var.f() + mo2Var.i(12)) - 4;
                mo2Var.t(44);
                mo2Var.u(mo2Var.i(12));
                mo2Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (mo2Var.f() < iF) {
                    mo2Var.t(48);
                    int i = mo2Var.i(8);
                    mo2Var.t(4);
                    int iF2 = mo2Var.f() + mo2Var.i(12);
                    String str = null;
                    String str2 = null;
                    while (mo2Var.f() < iF2) {
                        int i2 = mo2Var.i(8);
                        int i3 = mo2Var.i(8);
                        int iF3 = mo2Var.f() + i3;
                        if (i2 == 2) {
                            int i4 = mo2Var.i(16);
                            mo2Var.t(8);
                            if (i4 == 3) {
                                while (mo2Var.f() < iF3) {
                                    int i5 = mo2Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i5];
                                    mo2Var.l(i5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i6 = mo2Var.i(8);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        mo2Var.u(mo2Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i3];
                            mo2Var.l(i3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        mo2Var.q(iF3 * 8);
                    }
                    mo2Var.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new ot(i, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new lwa(arrayList);
            default:
                return new lwa(e(new nmc(byteBuffer.limit(), byteBuffer.array())));
        }
    }

    public /* synthetic */ pt(int i) {
        this.a = i;
    }
}
