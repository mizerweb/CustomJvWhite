package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class flc implements qr3 {
    public final Class a;

    public flc(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.qr3
    public final Class d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof flc) {
            return cqk.d(this.a, ((flc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
