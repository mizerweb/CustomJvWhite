package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class be1 {
    public static final be1 n = new be1(null, null, null, null, null, null, null, false, 2044);
    public final Long a;
    public final Long b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;
    public final Long f;
    public final CharSequence g;
    public final boolean h;
    public final Long i;
    public final String j;
    public final Long k;
    public final boolean l;
    public final CharSequence m;

    public /* synthetic */ be1(Long l, Long l2, String str, String str2, String str3, Long l3, CharSequence charSequence, boolean z, int i) {
        this(l, l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : charSequence, (i & np0.m) != 0 ? false : z, null, null, null, false, null);
    }

    public static be1 a(be1 be1Var, Long l, Long l2, CharSequence charSequence, CharSequence charSequence2, String str, Long l3, CharSequence charSequence3, boolean z, Long l4, String str2, Long l5, boolean z2, CharSequence charSequence4, int i) {
        if ((i & 1) != 0) {
            l = be1Var.a;
        }
        Long l6 = l;
        Long l7 = (i & 2) != 0 ? be1Var.b : l2;
        CharSequence charSequence5 = (i & 4) != 0 ? be1Var.c : charSequence;
        CharSequence charSequence6 = (i & 8) != 0 ? be1Var.d : charSequence2;
        String str3 = (i & 16) != 0 ? be1Var.e : str;
        Long l8 = (i & 32) != 0 ? be1Var.f : l3;
        CharSequence charSequence7 = (i & 64) != 0 ? be1Var.g : charSequence3;
        boolean z3 = (i & np0.m) != 0 ? be1Var.h : z;
        Long l9 = (i & np0.n) != 0 ? be1Var.i : l4;
        String str4 = (i & np0.o) != 0 ? be1Var.j : str2;
        Long l10 = (i & 1024) != 0 ? be1Var.k : l5;
        boolean z4 = (i & np0.q) != 0 ? be1Var.l : z2;
        CharSequence charSequence8 = (i & np0.r) != 0 ? be1Var.m : charSequence4;
        be1Var.getClass();
        return new be1(l6, l7, charSequence5, charSequence6, str3, l8, charSequence7, z3, l9, str4, l10, z4, charSequence8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be1)) {
            return false;
        }
        be1 be1Var = (be1) obj;
        return cqk.d(this.a, be1Var.a) && cqk.d(this.b, be1Var.b) && cqk.d(this.c, be1Var.c) && cqk.d(this.d, be1Var.d) && cqk.d(this.e, be1Var.e) && cqk.d(this.f, be1Var.f) && cqk.d(this.g, be1Var.g) && this.h == be1Var.h && cqk.d(this.i, be1Var.i) && cqk.d(this.j, be1Var.j) && cqk.d(this.k, be1Var.k) && this.l == be1Var.l && cqk.d(this.m, be1Var.m);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        CharSequence charSequence3 = this.g;
        int iN = nbh.n((iHashCode6 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31, 31, this.h);
        Long l4 = this.i;
        int iHashCode7 = (iN + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l5 = this.k;
        int iN2 = nbh.n((iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31, 31, this.l);
        CharSequence charSequence4 = this.m;
        return iN2 + (charSequence4 != null ? charSequence4.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = gm0.c() ? this.c : "*****";
        return "CallChatInfo(chatId=" + this.a + ", serverId=" + this.b + ", name=" + ((Object) charSequence) + ", pushName=" + (gm0.c() ? this.d : "*****") + ", avatar=" + this.e + ", avatarColorId=" + this.f + ", avatarAbbreviation=" + (gm0.c() ? this.g : "**") + ", isLinkCall=" + this.h + ")";
    }

    public be1(Long l, Long l2, CharSequence charSequence, CharSequence charSequence2, String str, Long l3, CharSequence charSequence3, boolean z, Long l4, String str2, Long l5, boolean z2, CharSequence charSequence4) {
        this.a = l;
        this.b = l2;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = str;
        this.f = l3;
        this.g = charSequence3;
        this.h = z;
        this.i = l4;
        this.j = str2;
        this.k = l5;
        this.l = z2;
        this.m = charSequence4;
    }
}
