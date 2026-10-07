package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oyc {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final CharSequence e;

    public oyc(long j, long j2, CharSequence charSequence, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyc)) {
            return false;
        }
        oyc oycVar = (oyc) obj;
        return this.a == oycVar.a && this.b == oycVar.b && cqk.d(this.c, oycVar.c) && this.d.equals(oycVar.d) && cqk.d(this.e, oycVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + zo5.d(zo5.d(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "PickerChip(id=", ", avatarSourceId=");
        qv1.s(this.b, ", title=", this.c, sbS);
        sbS.append(", avatarUrl=");
        sbS.append(this.d);
        sbS.append(", abbreviation=");
        sbS.append((Object) this.e);
        sbS.append(")");
        return sbS.toString();
    }
}
