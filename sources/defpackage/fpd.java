package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fpd implements ipd {
    public final Long a;
    public final ynh b;

    public fpd(Long l, ynh ynhVar) {
        this.a = l;
        this.b = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpd)) {
            return false;
        }
        fpd fpdVar = (fpd) obj;
        return this.a.equals(fpdVar.a) && this.b.equals(fpdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
