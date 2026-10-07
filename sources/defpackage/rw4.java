package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rw4 implements sw4 {
    public final tx4 a;
    public final float b;

    public rw4(tx4 tx4Var, float f) {
        this.a = tx4Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw4)) {
            return false;
        }
        rw4 rw4Var = (rw4) obj;
        return cqk.d(this.a, rw4Var.a) && Float.compare(this.b, rw4Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Undo(viewState=" + this.a + ", cropRotationWheelAngle=" + this.b + ")";
    }
}
