package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h62 {
    public final long a;
    public final yt1 b;

    public h62(yt1 yt1Var, long j) {
        this.a = j;
        this.b = yt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h62.class == obj.getClass()) {
            h62 h62Var = (h62) obj;
            if (this.a == h62Var.a && Objects.equals(this.b, h62Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "WaitingParticipantId{addedTs=" + this.a + ", participantId=" + this.b + '}';
    }
}
