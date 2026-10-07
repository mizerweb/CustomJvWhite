package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x80 {
    public final boolean a;
    public final boolean b;

    public x80(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return this.a == x80Var.a && this.b == x80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("Config(isEnabled=", this.a, ", reportWeirdConfig=", this.b, ")");
    }
}
