package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rag {
    public static final /* synthetic */ zv8[] g = {new z8b(rag.class, "from", "getFrom$common()F"), zo5.e(zfe.a, rag.class, "to", "getTo$common()F"), new z8b(rag.class, "stepSize", "getStepSize$common()F")};
    public final qag a = new qag(this, 0);
    public final qag b = new qag(this, 1);
    public final qag c = new qag(this, 2);
    public int e = a();
    public float d;
    public float f = oc9.u(tqk.b(b(), c(), this.d), 0.0f, 1.0f);

    public final int a() {
        float fC = c() - b();
        zv8 zv8Var = g[2];
        return gm0.K(fC / ((Number) this.c.b).floatValue()) + 1;
    }

    public final float b() {
        zv8 zv8Var = g[0];
        return ((Number) this.a.b).floatValue();
    }

    public final float c() {
        zv8 zv8Var = g[1];
        return ((Number) this.b.b).floatValue();
    }

    public final void d(float f) {
        this.d = oc9.u(f, b(), c());
        this.f = oc9.u(tqk.b(b(), c(), this.d), 0.0f, 1.0f);
    }
}
