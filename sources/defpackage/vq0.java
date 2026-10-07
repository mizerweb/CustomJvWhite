package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vq0 extends xq0 {
    public final char[] e;

    public vq0(uq0 uq0Var) {
        super(uq0Var, (Character) null);
        this.e = new char[np0.o];
        char[] cArr = uq0Var.b;
        lvb.R(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | np0.n] = cArr[i & 15];
        }
    }

    @Override // defpackage.xq0
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        lvb.Y(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | np0.n]);
        }
    }
}
