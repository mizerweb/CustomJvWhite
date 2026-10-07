package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wi0 {
    public final Throwable a;

    public wi0(Throwable th) {
        if (th != null) {
            this.a = th;
        } else {
            ore.n("Null error");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wi0) {
            return this.a.equals(((wi0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.a + "}";
    }
}
