package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f4f {
    public final e4f a;
    public final x58 b;

    public f4f(e4f e4fVar, x58 x58Var) {
        this.a = e4fVar;
        this.b = x58Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4f)) {
            return false;
        }
        f4f f4fVar = (f4f) obj;
        return this.a == f4fVar.a && Objects.equals(this.b, f4fVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
