package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class x6h {
    public final long a;
    public final int[] b;

    public x6h(long j, int[] iArr) {
        this.a = j;
        this.b = iArr;
        if (iArr.length != 0) {
            return;
        }
        ore.p("A style must contain at least one color");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6h)) {
            return false;
        }
        x6h x6hVar = (x6h) obj;
        return this.a == x6hVar.a && Arrays.equals(this.b, x6hVar.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "StyleItem(id=", ", colors=", Arrays.toString(this.b));
        sbT.append(", hasNoise=false)");
        return sbT.toString();
    }
}
