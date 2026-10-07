package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wj implements vj {
    public int[] a;
    public int b;

    public wj(int i) {
        switch (i) {
            case 1:
                this.a = new int[8];
                break;
            default:
                this.a = new int[]{1, 0, 2};
                break;
        }
    }

    public int a() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        qr7.d();
        return 0;
    }

    public int b() {
        int i = this.b;
        if (i == 0) {
            qr7.d();
            return 0;
        }
        int[] iArr = this.a;
        int i2 = i - 1;
        this.b = i2;
        return iArr[i2];
    }

    public void c(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            this.a[i2 - 1] = i;
        } else {
            qr7.d();
        }
    }

    public void d(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (this.b >= length) {
            int[] iArr2 = new int[length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.a = iArr2;
            iArr = iArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    @Override // defpackage.vj
    public int g() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = iArr[i];
        this.b = (i + 1) % iArr.length;
        return i2;
    }
}
