package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class g62 {
    public final h62 a;
    public final hi1 b;

    public g62(h62 h62Var, hi1 hi1Var) {
        this.a = h62Var;
        this.b = hi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g62.class != obj.getClass()) {
            return false;
        }
        g62 g62Var = (g62) obj;
        return this.a.equals(g62Var.a) && Objects.equals(this.b, g62Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "WaitingParticipant{waitingParticipantId=" + this.a + ", externalId=" + this.b + '}';
    }
}
