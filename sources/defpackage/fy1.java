package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fy1 extends ry1 {
    public final fu1 F;

    public fy1(fu1 fu1Var) {
        this.F = fu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy1) && this.F.equals(((fy1) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "OpenRemoveUserConfirmation(participantId=" + this.F + ")";
    }
}
