package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class epd {
    public final Long a;
    public final ynh b;

    public epd(Long l, ynh ynhVar) {
        this.a = l;
        this.b = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epd)) {
            return false;
        }
        epd epdVar = (epd) obj;
        return cqk.d(this.a, epdVar.a) && this.b.equals(epdVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
