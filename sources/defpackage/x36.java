package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x36 {
    public final double a = 0.3d;
    public volatile double b;

    public x36() {
    }

    public final void a(double d) {
        double d2 = this.b;
        double d3 = this.a;
        this.b = ((1.0d - d3) * d2) + (d * d3);
    }

    public x36(double d) {
        this.b = d;
    }
}
