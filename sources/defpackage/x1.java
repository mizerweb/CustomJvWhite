package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x1 implements mv8 {
    @Override // defpackage.mv8
    public void J0() {
        b("null");
    }

    public abstract void b(String str);

    public final void g(String str) {
        if (str != null) {
            p0(str);
        } else {
            J0();
        }
    }

    public final void l(double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            b(Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric value to be finite but was " + d);
        }
    }

    public final void y(int i) {
        b(Integer.toString(i));
    }
}
