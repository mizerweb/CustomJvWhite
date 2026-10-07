package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l37 implements k79 {
    public final long a;
    public final ynh b;
    public final String c;
    public final Long d;
    public final CharSequence e;
    public final boolean f;
    public final Integer g;
    public final int h;

    public /* synthetic */ l37(long j, ynh ynhVar, String str, Long l, String str2, boolean z, Integer num, int i, int i2) {
        this(j, ynhVar, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : num, i);
    }

    public static l37 i(l37 l37Var, int i) {
        return new l37(l37Var.a, l37Var.b, l37Var.c, l37Var.d, l37Var.e, l37Var.f, l37Var.g, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l37)) {
            return false;
        }
        l37 l37Var = (l37) obj;
        return this.a == l37Var.a && cqk.d(this.b, l37Var.b) && cqk.d(this.c, l37Var.c) && cqk.d(this.d, l37Var.d) && cqk.d(this.e, l37Var.e) && this.f == l37Var.f && cqk.d(this.g, l37Var.g) && this.h == l37Var.h;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iH = bc1.h(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        int iN = nbh.n(mw7.f((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31, this.f);
        Integer num = this.g;
        return Integer.hashCode(this.h) + ((iN + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.h;
    }

    public final String toString() {
        return "FolderMemberItem(itemId=" + this.a + ", title=" + this.b + ", avatarUrl=" + this.c + ", avatarSourceId=" + this.d + ", abbreviation=" + ((Object) this.e) + ", isVerified=" + this.f + ", iconRes=" + this.g + ", viewType=" + this.h + ")";
    }

    public l37(long j, ynh ynhVar, String str, Long l, CharSequence charSequence, boolean z, Integer num, int i) {
        this.a = j;
        this.b = ynhVar;
        this.c = str;
        this.d = l;
        this.e = charSequence;
        this.f = z;
        this.g = num;
        this.h = i;
    }
}
