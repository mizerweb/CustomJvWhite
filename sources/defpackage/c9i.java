package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c9i implements d8h {
    public final nmc a = new nmc();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public c9i(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = vqi.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // defpackage.d8h
    public final int F() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d8h
    public final void k(byte[] bArr, int i, int i2, c8h c8hVar, qg4 qg4Var) {
        String strY;
        int i3;
        nmc nmcVar = this.a;
        nmcVar.L(i + i2, bArr);
        nmcVar.N(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        lvb.R(nmcVar.a() >= 2);
        int iH = nmcVar.H();
        if (iH == 0) {
            strY = "";
        } else {
            int i7 = nmcVar.b;
            Charset charsetJ = nmcVar.J();
            int i8 = iH - (nmcVar.b - i7);
            if (charsetJ == null) {
                charsetJ = StandardCharsets.UTF_8;
            }
            strY = nmcVar.y(i8, charsetJ);
        }
        if (strY.isEmpty()) {
            a98 a98Var = c98.b;
            qg4Var.accept(new bz4(-9223372036854775807L, -9223372036854775807L, ghe.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strY);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.f;
        while (nmcVar.a() >= 8) {
            int i9 = nmcVar.b;
            int iM = nmcVar.m();
            int iM2 = nmcVar.m();
            if (iM2 == 1937013100) {
                lvb.R(nmcVar.a() >= i6 ? i4 : i5);
                int iH2 = nmcVar.H();
                int i10 = i5;
                while (i10 < iH2) {
                    lvb.R(nmcVar.a() >= 12 ? i4 : i5);
                    int iH3 = nmcVar.H();
                    int iH4 = nmcVar.H();
                    nmcVar.O(i6);
                    int i11 = i10;
                    int iA = nmcVar.A();
                    nmcVar.O(i4);
                    int iM3 = nmcVar.m();
                    if (iH4 > spannableStringBuilder.length()) {
                        StringBuilder sbY = zo5.y(iH4, "Truncating styl end (", ") to cueText.length() (");
                        sbY.append(spannableStringBuilder.length());
                        sbY.append(").");
                        lvb.G0("Tx3gParser", sbY.toString());
                        iH4 = spannableStringBuilder.length();
                    }
                    if (iH3 >= iH4) {
                        lvb.G0("Tx3gParser", nbh.u("Ignoring styl with start (", iH3, ") >= end (", iH4, ")."));
                    } else {
                        int i12 = iH4;
                        b(spannableStringBuilder, iA, this.c, iH3, i12, 0);
                        a(spannableStringBuilder, iM3, this.d, iH3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM2 == 1952608120 && this.b) {
                i3 = 2;
                lvb.R(nmcVar.a() >= 2);
                fI = vqi.i(nmcVar.H() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            nmcVar.N(i9 + iM);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        qg4Var.accept(new bz4(-9223372036854775807L, -9223372036854775807L, c98.r(new yy4(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }
}
