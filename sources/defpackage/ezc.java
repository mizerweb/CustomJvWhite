package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ezc implements jwa {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public ezc(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static ezc d(nmc nmcVar) {
        int iM = nmcVar.m();
        String strN = uya.n(nmcVar.y(nmcVar.m(), StandardCharsets.US_ASCII));
        String strY = nmcVar.y(nmcVar.m(), StandardCharsets.UTF_8);
        int iM2 = nmcVar.m();
        int iM3 = nmcVar.m();
        int iM4 = nmcVar.m();
        int iM5 = nmcVar.m();
        int iM6 = nmcVar.m();
        byte[] bArr = new byte[iM6];
        nmcVar.k(0, bArr, iM6);
        return new ezc(iM, strN, strY, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // defpackage.jwa
    public final void b(zz9 zz9Var) {
        zz9Var.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ezc.class != obj.getClass()) {
            return false;
        }
        ezc ezcVar = (ezc) obj;
        return this.a == ezcVar.a && this.b.equals(ezcVar.b) && this.c.equals(ezcVar.c) && this.d == ezcVar.d && this.e == ezcVar.e && this.f == ezcVar.f && this.g == ezcVar.g && Arrays.equals(this.h, ezcVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((zo5.d(zo5.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
