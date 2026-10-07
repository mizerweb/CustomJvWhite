package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gy1 extends ry1 {
    public final fu1 F;

    public gy1(fu1 fu1Var) {
        this.F = fu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy1) && cqk.d(this.F, ((gy1) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "RaiseHandDialog(participantId=" + this.F + ")";
    }
}
