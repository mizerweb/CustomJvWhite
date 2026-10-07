package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j2a {
    public final c98 a;
    public final int b;
    public final long c;

    public j2a(int i, long j, List list) {
        this.a = c98.n(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2a)) {
            return false;
        }
        j2a j2aVar = (j2a) obj;
        c98 c98Var = j2aVar.a;
        c98 c98Var2 = this.a;
        c98Var2.getClass();
        return j8f.a(c98Var2, c98Var) && this.b == j2aVar.b && this.c == j2aVar.c;
    }

    public final int hashCode() {
        return gpk.c(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
