package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mg1 {
    public final x52 a;
    public final yvi b;

    public mg1(x52 x52Var, yvi yviVar) {
        this.a = x52Var;
        this.b = yviVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mg1.class != obj.getClass()) {
            return false;
        }
        mg1 mg1Var = (mg1) obj;
        return this.a.equals(mg1Var.a) && this.b.equals(mg1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "DisplayLayoutItem{videoTrackParticipantKey=" + this.a + ", layout=" + this.b + '}';
    }
}
