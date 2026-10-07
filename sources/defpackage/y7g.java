package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y7g implements vwd {
    public static final Object c = new Object();
    public volatile y05 a;
    public volatile Object b;

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        y05 y05Var = this.a;
        if (y05Var == null) {
            return this.b;
        }
        Object obj2 = y05Var.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
