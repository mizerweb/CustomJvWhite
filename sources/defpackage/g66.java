package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g66 implements qc8 {
    public final boolean a;

    public g66(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qc8
    public final rhb b() {
        return null;
    }

    @Override // defpackage.qc8
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return x05.i(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
