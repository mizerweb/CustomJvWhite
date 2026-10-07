package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class opf implements ppf {
    public final fof a;

    public opf(fof fofVar) {
        this.a = fofVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opf) && this.a == ((opf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsInfo(event=" + this.a + ")";
    }
}
