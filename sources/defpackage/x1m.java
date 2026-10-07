package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x1m {
    private z1m a;
    private Integer b;

    public final x1m a(z1m z1mVar) {
        this.a = z1mVar;
        return this;
    }

    public final x1m b(Integer num) {
        this.b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final d2m d() {
        return new d2m(this, null);
    }
}
