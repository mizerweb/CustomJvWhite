package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i8b {
    public long[] a;
    public int b;

    public i8b(int i) {
        this.a = i == 0 ? ui9.b : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        gol.e("Index must be between 0 and size");
        throw null;
    }

    public final void c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            gol.e("Index must be between 0 and size");
            throw null;
        }
        long[] jArr = this.a;
        long j = jArr[i];
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(jArr, i3, jArr, i, i2 - i3);
        }
        this.b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i8b) {
            i8b i8bVar = (i8b) obj;
            int i = i8bVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = i8bVar.a;
                hj8 hj8VarF0 = oc9.f0(0, i2);
                int i3 = hj8VarF0.a;
                int i4 = hj8VarF0.b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ i8b() {
        this(16);
    }
}
