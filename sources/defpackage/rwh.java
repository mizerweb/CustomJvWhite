package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rwh {
    public final String a;
    public final String b;

    public rwh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwh)) {
            return false;
        }
        rwh rwhVar = (rwh) obj;
        return cqk.d(this.a, rwhVar.a) && cqk.d(this.b, rwhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return nbh.w("TraceTrack(name=", this.a, ", sharedKey=", this.b, ")");
    }
}
