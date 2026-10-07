package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class li0 {
    public final ux5 a;
    public final ux5 b;
    public final int c;
    public final ArrayList d;

    public li0(ux5 ux5Var, ux5 ux5Var2, int i, ArrayList arrayList) {
        this.a = ux5Var;
        this.b = ux5Var2;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof li0) {
            li0 li0Var = (li0) obj;
            if (this.a == li0Var.a && this.b == li0Var.b && this.c == li0Var.c && this.d.equals(li0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "In{edge=" + this.a + ", postviewEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormats=" + this.d + "}";
    }
}
