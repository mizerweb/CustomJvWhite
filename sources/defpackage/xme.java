package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xme implements ny8 {
    public af7 a;
    public Object b;

    @Override // defpackage.ny8
    public final boolean d() {
        return this.b != khb.k;
    }

    @Override // defpackage.ny8
    public final Object getValue() {
        if (this.b == khb.k) {
            this.b = this.a.invoke();
        }
        return this.b;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
