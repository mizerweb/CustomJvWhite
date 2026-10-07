package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class blc extends dlc {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ blc(int i, int i2, int i3, byte[] bArr) {
        super(bArr, i, i2);
        this.d = i3;
    }

    @Override // defpackage.dlc
    public final short a(int i) {
        int i2;
        int i3 = this.d;
        int i4 = this.c;
        byte[] bArr = this.b;
        switch (i3) {
            case 0:
                int i5 = (i << 1) + i4;
                i2 = ((bArr[i5 + 1] << 8) & 65280) + (bArr[i5] & 255);
                break;
            default:
                i2 = (bArr[i + i4] * 257) + np0.m;
                break;
        }
        return (short) i2;
    }

    public final String toString() {
        int i = this.d;
        int i2 = this.a;
        int i3 = 1;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("PCM 16 bit (");
                sb.append(i2);
                sb.append(") {");
                if (i2 > 0) {
                    sb.append((int) a(0));
                    while (i3 < i2) {
                        sb.append(", ");
                        sb.append((int) a(i3));
                        i3++;
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder("PCM 8 bit (");
                sb2.append(i2);
                sb2.append(") {");
                if (i2 > 0) {
                    byte[] bArr = this.b;
                    int i4 = this.c;
                    sb2.append((int) bArr[i4]);
                    while (i3 < i2) {
                        sb2.append(", ");
                        sb2.append((int) bArr[i3 + i4]);
                        i3++;
                    }
                }
                sb2.append('}');
                return sb2.toString();
        }
    }
}
