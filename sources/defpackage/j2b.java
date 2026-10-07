package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j2b {
    public final int a;
    public final int b;
    public final float c;

    public j2b(int i, float f, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static j2b a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new j2b(i2, ((i & 511) * ((i & np0.o) != 0 ? -1 : 1)) / 10.0f, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j2b)) {
            return false;
        }
        j2b j2bVar = (j2b) obj;
        return this.a == j2bVar.a && this.b == j2bVar.b && Float.compare(this.c, j2bVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
