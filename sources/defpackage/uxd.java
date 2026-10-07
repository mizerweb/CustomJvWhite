package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uxd {
    public final /* synthetic */ int a;
    public final dth b;
    public final nmc c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public uxd(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new dth(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new nmc();
                break;
            default:
                this.b = new dth(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new nmc();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(nmc nmcVar) {
        int i = nmcVar.b;
        if (nmcVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        nmcVar.k(0, bArr, 9);
        nmcVar.N(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(kj6 kj6Var) {
        int i = this.a;
        nmc nmcVar = this.c;
        switch (i) {
            case 0:
                byte[] bArr = vqi.b;
                nmcVar.getClass();
                nmcVar.L(bArr.length, bArr);
                this.d = true;
                kj6Var.q();
                break;
            default:
                byte[] bArr2 = vqi.b;
                nmcVar.getClass();
                nmcVar.L(bArr2.length, bArr2);
                this.d = true;
                kj6Var.q();
                break;
        }
    }
}
