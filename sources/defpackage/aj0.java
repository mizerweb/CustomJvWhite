package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aj0 {
    public final cch a;

    public aj0(cch cchVar) {
        this.a = cchVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof aj0) && this.a == ((aj0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }
}
