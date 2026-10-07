package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a8b {
    public float[] a;
    public int b;

    public a8b(int i) {
        this.a = i == 0 ? tx6.a : new float[i];
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            this.a = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        gol.e("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a8b) {
            a8b a8bVar = (a8b) obj;
            int i = a8bVar.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = a8bVar.a;
                hj8 hj8VarF0 = oc9.f0(0, i2);
                int i3 = hj8VarF0.a;
                int i4 = hj8VarF0.b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
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
        float[] fArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
