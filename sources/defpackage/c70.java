package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c70 implements o21 {
    public int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public c70(int i) {
        lvb.R(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.a = 0;
        this.b = -1;
        this.c = 0;
        this.e = new long[i];
        this.d = i - 1;
    }

    @Override // defpackage.o21
    public int a() {
        nmc nmcVar = (nmc) this.e;
        int i = this.b;
        if (i == 8) {
            return nmcVar.A();
        }
        if (i == 16) {
            return nmcVar.H();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        if (i2 % 2 != 0) {
            return this.d & 15;
        }
        int iA = nmcVar.A();
        this.d = iA;
        return (iA & 240) >> 4;
    }

    public void b(long j) {
        int i = this.c;
        long[] jArr = (long[]) this.e;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                c.t();
                return;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.a;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) this.e, 0, jArr2, i3, i2);
            this.a = 0;
            this.b = this.c - 1;
            this.e = jArr2;
            this.d = length - 1;
        }
        int i4 = (this.b + 1) & this.d;
        this.b = i4;
        ((long[]) this.e)[i4] = j;
        this.c++;
    }

    @Override // defpackage.o21
    public int c() {
        return -1;
    }

    @Override // defpackage.o21
    public int d() {
        return this.a;
    }

    public long e() {
        if (this.c != 0) {
            return ((long[]) this.e)[this.a];
        }
        qr7.d();
        return 0L;
    }

    public long f() {
        int i = this.c;
        if (i == 0) {
            qr7.d();
            return 0L;
        }
        long[] jArr = (long[]) this.e;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = this.d & (i2 + 1);
        this.c = i - 1;
        return j;
    }

    public c70() {
        this(16);
    }

    public c70(String str, int i, int i2, int i3, int i4) {
        this.e = str;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
