package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i62 {
    public final int a;
    public final List b;
    public final List c;

    public i62(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i62)) {
            return false;
        }
        i62 i62Var = (i62) obj;
        return this.a == i62Var.a && this.b.equals(i62Var.b) && this.c.equals(i62Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qv1.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attendee(totalCount=");
        sb.append(this.a);
        sb.append(", addedParticipantIds=");
        sb.append(this.b);
        sb.append(", removedParticipantIds=");
        return qv1.n(")", sb, this.c);
    }
}
