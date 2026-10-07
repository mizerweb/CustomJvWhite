package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jz7 {
    public final boolean a;
    public final boolean b;

    public jz7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return !this.a && this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz7)) {
            return false;
        }
        jz7 jz7Var = (jz7) obj;
        return this.a == jz7Var.a && this.b == jz7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("Result(pushReachable=", this.a, ", oneMeReachable=", this.b, ")");
    }
}
