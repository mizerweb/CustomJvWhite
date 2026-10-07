package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r3g extends ji3 {
    public final ynh a;
    public final Integer b;
    public final ynh c;

    public /* synthetic */ r3g(ynh ynhVar, Integer num, tnh tnhVar, int i) {
        this(ynhVar, (i & 4) != 0 ? null : tnhVar, (i & 2) != 0 ? null : num);
    }

    public final ynh a() {
        return this.c;
    }

    public final Integer b() {
        return this.b;
    }

    public final ynh c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3g)) {
            return false;
        }
        r3g r3gVar = (r3g) obj;
        return cqk.d(this.a, r3gVar.a) && cqk.d(this.b, r3gVar.b) && cqk.d(this.c, r3gVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ynh ynhVar = this.c;
        return iHashCode2 + (ynhVar != null ? ynhVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }

    public r3g(ynh ynhVar, ynh ynhVar2, Integer num) {
        this.a = ynhVar;
        this.b = num;
        this.c = ynhVar2;
    }
}
