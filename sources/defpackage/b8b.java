package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b8b {
    public final long a;

    public b8b(int i, float f) {
        this.a = (((long) Float.floatToIntBits(f)) & 4294967295L) | (((long) i) << 32);
    }

    public static b8b a(b8b b8bVar, float f) {
        int iB = b8bVar.b();
        b8bVar.getClass();
        return new b8b(iB, f);
    }

    public final int b() {
        return (int) (this.a >> 32);
    }

    public final String toString() {
        return "(" + b() + ", " + Float.intBitsToFloat((int) this.a) + ")";
    }
}
