package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k62 {
    public final int a;
    public final List b;
    public final List c;

    public k62(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k62)) {
            return false;
        }
        k62 k62Var = (k62) obj;
        return this.a == k62Var.a && this.b.equals(k62Var.b) && this.c.equals(k62Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv1.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandUp(totalCount=");
        sb.append(this.a);
        sb.append(", addedParticipantIds=");
        sb.append(this.b);
        sb.append(", removedParticipantIds=");
        return qv1.n(")", sb, this.c);
    }
}
