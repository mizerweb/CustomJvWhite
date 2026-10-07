package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g5i {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(kyh kyhVar, jyh jyhVar) {
        if (this.c > 0) {
            kyhVar.a(this.d, this.e, this.f, this.g, jyhVar);
            this.c = 0;
        }
    }

    public final void b(kyh kyhVar, long j, int i, int i2, int i3, jyh jyhVar) {
        lvb.Z("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(kyhVar, jyhVar);
            }
        }
    }

    public final void c(kj6 kj6Var) {
        if (this.b) {
            return;
        }
        int i = 0;
        byte[] bArr = this.a;
        kj6Var.u(0, bArr, 10);
        kj6Var.q();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
