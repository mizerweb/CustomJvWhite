package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mud extends qud {
    public final long a;
    public final List b;
    public final int c;

    public mud(long j, c79 c79Var, int i) {
        this.a = j;
        this.b = c79Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mud)) {
            return false;
        }
        mud mudVar = (mud) obj;
        return this.a == mudVar.a && cqk.d(this.b, mudVar.b) && this.c == mudVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qv1.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowParticipantActionsMenu(id=");
        sb.append(this.a);
        sb.append(", actions=");
        sb.append(this.b);
        return qv1.o(sb, ", position=", this.c, ")");
    }
}
