package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wq0 extends xq0 {
    public wq0(String str, String str2) {
        uq0 uq0Var = new uq0(str, str2.toCharArray());
        super(uq0Var, (Character) '=');
        lvb.R(uq0Var.b.length == 64);
    }

    @Override // defpackage.xq0
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        lvb.Y(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            uq0 uq0Var = this.a;
            char[] cArr = uq0Var.b;
            char[] cArr2 = uq0Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            a(sb, bArr, i2, i - i2);
        }
    }
}
