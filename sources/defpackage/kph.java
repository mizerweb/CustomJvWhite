package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kph {
    public final int[] a;
    public final float b;

    public kph(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kph)) {
            return false;
        }
        kph kphVar = (kph) obj;
        return this.a.equals(kphVar.a) && Float.compare(this.b, kphVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Gradient(colors=" + Arrays.toString(this.a) + ", angle=" + this.b + ")";
    }
}
