package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rl2 {
    public final List a;
    public final int b;
    public final t94 c;

    public rl2(List list, int i, t94 t94Var) {
        this.a = list;
        this.b = i;
        this.c = t94Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl2)) {
            return false;
        }
        rl2 rl2Var = (rl2) obj;
        return cqk.d(this.a, rl2Var.a) && this.b == rl2Var.b && cqk.d(this.c, rl2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MainCaptureParams(configs=" + this.a + ", requestTemplate=" + ((Object) pme.b(this.b)) + ", sessionConfigOptions=" + this.c + ')';
    }
}
