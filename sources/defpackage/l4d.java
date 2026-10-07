package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l4d {
    public static final l4d c = new l4d(0, null);
    public final long a;
    public final String b;

    public l4d(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4d)) {
            return false;
        }
        l4d l4dVar = (l4d) obj;
        return this.a == l4dVar.a && cqk.d(this.b, l4dVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "CurrentItem(messageId=", ", attachId=", this.b);
        sbT.append(")");
        return sbT.toString();
    }
}
