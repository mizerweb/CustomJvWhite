package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fef {
    public final eef a;
    public final a2d b;

    public fef(eef eefVar, a2d a2dVar) {
        this.a = eefVar;
        this.b = a2dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fef)) {
            return false;
        }
        fef fefVar = (fef) obj;
        return cqk.d(this.a, fefVar.a) && cqk.d(this.b, fefVar.b);
    }

    public final int hashCode() {
        eef eefVar = this.a;
        return this.b.hashCode() + ((eefVar == null ? 0 : eefVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectedAvatarInfo(avatar=" + this.a + ", placeholder=" + this.b + ")";
    }
}
