package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qia {
    public static final qia d = new qia(-1, null, null);
    public final long a;
    public final String b;
    public final CharSequence c;

    public qia(long j, CharSequence charSequence, String str) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qia)) {
            return false;
        }
        qia qiaVar = (qia) obj;
        return this.a == qiaVar.a && cqk.d(this.b, qiaVar.b) && cqk.d(this.c, qiaVar.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        return iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "AvatarParams(id=", ", url=", this.b);
        sbT.append(", placeholder=");
        sbT.append((Object) this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
