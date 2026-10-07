package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m54 {
    public final long a;
    public final byte b;
    public final List c;

    public m54(long j, byte b, List list) {
        this.a = j;
        this.b = b;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m54)) {
            return false;
        }
        m54 m54Var = (m54) obj;
        return this.a == m54Var.a && this.b == m54Var.b && cqk.d(this.c, m54Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Byte.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "ComplainReasonsEntity(id=", ", typeId=");
        sbQ.append(", complainReason=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }

    public m54(byte b, List list) {
        this(0L, b, list);
    }
}
