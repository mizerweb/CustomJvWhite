package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class fa9 {
    public final long a;
    public final float b;
    public final long c;

    public fa9(ea9 ea9Var) {
        this.a = ea9Var.a;
        this.b = ea9Var.b;
        this.c = ea9Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa9)) {
            return false;
        }
        fa9 fa9Var = (fa9) obj;
        return this.a == fa9Var.a && this.b == fa9Var.b && this.c == fa9Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
