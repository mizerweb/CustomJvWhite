package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t88 extends q1 implements mpb {
    public final double a;

    public t88(double d) {
        this.a = d;
    }

    public final float B() {
        return (float) this.a;
    }

    @Override // defpackage.gri
    public final int a() {
        return 4;
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
        if (iA == 4) {
            return this.a == griVar.n().a;
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // defpackage.q1, defpackage.gri
    public final t88 n() {
        return this;
    }

    @Override // defpackage.gri
    public final String toJson() {
        double d = this.a;
        return (Double.isNaN(d) || Double.isInfinite(d)) ? "null" : Double.toString(d);
    }

    public final String toString() {
        return Double.toString(this.a);
    }

    @Override // defpackage.q1
    /* JADX INFO: renamed from: z */
    public final t88 n() {
        return this;
    }
}
