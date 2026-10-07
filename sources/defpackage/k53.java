package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k53 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final j53 d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ k53(String str, String str2, String str3, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, new j53(null, 7), (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2);
    }

    public static k53 a(k53 k53Var, j53 j53Var) {
        CharSequence charSequence = k53Var.a;
        CharSequence charSequence2 = k53Var.b;
        CharSequence charSequence3 = k53Var.c;
        boolean z = k53Var.e;
        boolean z2 = k53Var.f;
        k53Var.getClass();
        return new k53(charSequence, charSequence2, charSequence3, j53Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k53)) {
            return false;
        }
        k53 k53Var = (k53) obj;
        return cqk.d(this.a, k53Var.a) && cqk.d(this.b, k53Var.b) && cqk.d(this.c, k53Var.c) && cqk.d(this.d, k53Var.d) && this.e == k53Var.e && this.f == k53Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + nbh.n((this.d.hashCode() + mw7.f(mw7.f(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoPanelState(author=");
        sb.append((Object) this.a);
        sb.append(", dateText=");
        sb.append((Object) this.b);
        sb.append(", captionText=");
        sb.append((Object) this.c);
        sb.append(", frameState=");
        sb.append(this.d);
        sb.append(", forwardButtonVisible=");
        return bc1.m(", playbackSettingsButtonVisible=", ")", sb, this.e, this.f);
    }

    public k53(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, j53 j53Var, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = j53Var;
        this.e = z;
        this.f = z2;
    }
}
