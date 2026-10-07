package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class bi9 {
    public int a;
    public long[] b;

    public bi9(int i, int i2) {
        switch (i2) {
            case 1:
                this.a = i;
                long[] jArr = new long[i];
                this.b = jArr;
                Arrays.fill(jArr, -1L);
                break;
            default:
                this.b = new long[i];
                break;
        }
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public void b(long[] jArr) {
        int length = this.a + jArr.length;
        long[] jArr2 = this.b;
        if (length > jArr2.length) {
            this.b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.b, this.a, jArr.length);
        this.a = length;
    }

    public long c(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        ch9.b(zo5.y(i, "Invalid index ", ", size is "), this.a);
        return 0L;
    }

    public int d() {
        return this.a;
    }
}
