package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vx1 extends ry1 {
    public final x7j F;

    public vx1(x7j x7jVar) {
        this.F = x7jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vx1) && this.F == ((vx1) obj).F;
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "ChangeMode(mode=" + this.F + ")";
    }
}
