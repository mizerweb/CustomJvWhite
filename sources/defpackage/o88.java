package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o88 extends q1 implements gri {
    public static final o88 b = new o88(true);
    public static final o88 c = new o88(false);
    public final boolean a;

    public o88(boolean z) {
        this.a = z;
    }

    public final boolean B() {
        return this.a;
    }

    @Override // defpackage.gri
    public final int a() {
        return 2;
    }

    @Override // defpackage.gri
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        gri griVar = (gri) obj;
        int iA = ((q1) griVar).a();
        if (iA == 0) {
            throw null;
        }
        if (iA == 2) {
            return this.a == griVar.u().a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    @Override // defpackage.gri
    public final String toJson() {
        return Boolean.toString(this.a);
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.q1, defpackage.gri
    public final o88 u() {
        return this;
    }

    @Override // defpackage.q1
    /* JADX INFO: renamed from: x */
    public final o88 u() {
        return this;
    }
}
