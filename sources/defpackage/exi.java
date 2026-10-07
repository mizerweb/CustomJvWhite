package defpackage;

import org.webrtc.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class exi {
    public final boolean a;
    public final ysj b;
    public final int c;
    public volatile Integer d;
    public jtc e;
    public Integer f;
    public Integer g;
    public Integer h;

    public exi(boolean z, int i, ysj ysjVar) {
        this.a = z;
        this.b = ysjVar;
        this.c = oc9.v(i - (i % 16), 320, np0.r);
    }

    public final jtc a(int i, int i2) {
        ylc ylcVar;
        float f;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num = this.d;
        int iIntValue = this.c;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iMax = Math.max(i, i2);
        if (iMax > iIntValue) {
            f = iIntValue / iMax;
            int iMin = Math.min(i, i2);
            if (iMin > 0) {
                float f2 = iMin;
                int iK = gm0.K(f * f2);
                int i9 = iK % 16;
                if (i9 > 0) {
                    int i10 = (iK - i9) + 16;
                    if (i9 > i10 - iK) {
                        f = i10 / f2;
                    }
                }
            }
            ylcVar = new ylc(bc1.k(f, i), bc1.k(f, i2));
            z = true;
        } else {
            ylcVar = new ylc(Integer.valueOf(i), Integer.valueOf(i2));
            f = 1.0f;
            z = false;
        }
        int iIntValue2 = ((Number) ylcVar.a).intValue();
        int iIntValue3 = ((Number) ylcVar.b).intValue();
        int iMax2 = Math.max(iIntValue2, iIntValue3);
        int iMax3 = iMax2 < 320 ? Math.max(320 / iMax2, 2) : 1;
        int i11 = iMax3 == 1 ? iMax2 : iMax2 * iMax3;
        int iMin2 = Math.min(iIntValue2, iIntValue3);
        int i12 = iMax3 == 1 ? iMin2 : iMin2 * iMax3;
        if (i11 < iIntValue) {
            iIntValue = i11 - (i11 % 16);
        }
        int i13 = iIntValue / 16;
        int i14 = i13 * 9;
        int iA = i14 > i12 ? tab.a(i12, i13, 0) : tab.a(i14, i13, i12);
        if (iMax3 == 1) {
            iMax2 = iIntValue;
        } else if (iIntValue != i11) {
            iMax2 = gm0.K(iIntValue / iMax3);
        }
        if (z) {
            iMax2 = gm0.K(iMax2 / f);
        }
        if (iMax3 == 1) {
            iMin2 = iA;
        } else if (iA != i12) {
            iMin2 = gm0.K(iA / iMax3);
        }
        if (z) {
            iMin2 = gm0.K(iMin2 / f);
        }
        if (i >= i2) {
            i3 = (i - iMax2) / 2;
            i4 = (i2 - iMin2) / 2;
            i6 = iIntValue;
            i5 = iA;
            i8 = iMin2;
            i7 = iMax2;
        } else {
            i3 = (i - iMin2) / 2;
            i4 = (i2 - iMax2) / 2;
            i5 = iIntValue;
            i6 = iA;
            i7 = iMin2;
            i8 = iMax2;
        }
        return new jtc(i3, i4, i7, i8, i6, i5, this.a);
    }

    public final Size b(int i, int i2) {
        if (i != 0 && i2 != 0) {
            jtc jtcVarA = a(i, i2);
            return new Size(jtcVarA.e, jtcVarA.f);
        }
        this.b.invoke("Wrong frame size: " + i + "x" + i2);
        return null;
    }
}
