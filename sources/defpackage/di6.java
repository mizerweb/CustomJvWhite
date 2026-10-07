package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class di6 {
    public final byte a;
    public final int b;

    public di6(int i, byte b) {
        if (!(i >= 0)) {
            ore.p("length must be >= 0");
            throw null;
        }
        this.a = b;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final byte b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof di6) {
            di6 di6Var = (di6) obj;
            if (this.a == di6Var.a && this.b == di6Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.a), Integer.valueOf(this.b));
    }
}
