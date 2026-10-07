package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xvd implements w4a {
    public final s25 a;
    public final qyb b;
    public kr6 c;
    public final l6m d;
    public final int e;
    public b87 f;

    public xvd(s25 s25Var, nj6 nj6Var) {
        qyb qybVar = new qyb(14, nj6Var);
        kr6 kr6Var = new kr6(7, false);
        l6m l6mVar = new l6m(22);
        this.a = s25Var;
        this.b = qybVar;
        this.c = kr6Var;
        this.d = l6mVar;
        this.e = 1048576;
    }

    @Override // defpackage.w4a
    public final w4a e(kr6 kr6Var) {
        lvb.W(kr6Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = kr6Var;
        return this;
    }

    @Override // defpackage.w4a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final yvd a(ry9 ry9Var) {
        ry9Var.b.getClass();
        return new yvd(ry9Var, this.a, this.b, this.c.D(ry9Var), this.d, this.e, this.f);
    }

    public final void g(b87 b87Var) {
        this.f = b87Var;
    }

    public xvd(s25 s25Var) {
        this(s25Var, new ra5());
    }
}
