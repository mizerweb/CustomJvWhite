package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y36 {
    public final double a;
    public final double b;
    public final double c;
    public double d;

    public /* synthetic */ y36(double d, double d2, int i) {
        this(d, (i & 2) != 0 ? d : d2, (i & 4) != 0 ? Double.NaN : 0.0d);
    }

    public final void a(double d) {
        double d2 = this.d;
        if (!Double.isNaN(d2)) {
            double d3 = d > d2 ? this.a : this.b;
            d = (d * d3) + ((1.0d - d3) * d2);
        }
        this.d = d;
    }

    public y36(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d3;
    }
}
