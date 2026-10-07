package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qph implements sph {
    public final tri a;

    public qph(tri triVar) {
        this.a = triVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qph) && this.a.equals(((qph) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Gradient(model=" + this.a + ")";
    }
}
