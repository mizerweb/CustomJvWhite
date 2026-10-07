package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class npf implements ppf {
    public final cof a;

    public npf(cof cofVar) {
        this.a = cofVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npf) && this.a == ((npf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsClose(event=" + this.a + ")";
    }
}
