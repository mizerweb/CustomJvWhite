package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oy1 extends ry1 {
    public final ze1 F;

    public oy1(ze1 ze1Var) {
        this.F = ze1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oy1) && this.F.equals(((oy1) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "ShowOpponentInfo(contextInfo=" + this.F + ")";
    }
}
