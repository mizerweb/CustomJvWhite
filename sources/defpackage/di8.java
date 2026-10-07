package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class di8 {
    public final zg a;
    public final pc7 b;

    public di8(zg zgVar, pc7 pc7Var) {
        this.a = zgVar;
        this.b = pc7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof di8) {
            di8 di8Var = (di8) obj;
            if (this.a == di8Var.a && this.b.equals(di8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InputRequest(image=" + this.a + ", frameInfo=" + this.b + ')';
    }
}
