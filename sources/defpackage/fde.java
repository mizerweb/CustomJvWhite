package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fde {
    public final tnh a;
    public final ynh b;
    public final ede c;
    public final ede d;
    public final xnh e;
    public final boolean f;

    public fde(tnh tnhVar, tnh tnhVar2, ede edeVar, ede edeVar2, xnh xnhVar, boolean z) {
        this.a = tnhVar;
        this.b = tnhVar2;
        this.c = edeVar;
        this.d = edeVar2;
        this.e = xnhVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fde)) {
            return false;
        }
        fde fdeVar = (fde) obj;
        return this.a.equals(fdeVar.a) && cqk.d(this.b, fdeVar.b) && this.c.equals(fdeVar.c) && this.d.equals(fdeVar.d) && this.e.equals(fdeVar.e) && this.f == fdeVar.f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        ynh ynhVar = this.b;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExitWithRecordState(title=" + this.a + ", subtitle=" + this.b + ", negativeButton=" + this.c + ", positiveButton=" + this.d + ", recordTitle=" + this.e + ", canRemove=" + this.f + ")";
    }
}
