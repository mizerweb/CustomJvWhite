package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ptg {
    public final ynh a;
    public final String b;
    public final String c;
    public final tj0 d;
    public final boolean e;
    public final v1h f;

    public ptg(ynh ynhVar, String str, String str2, tj0 tj0Var, boolean z, v1h v1hVar) {
        this.a = ynhVar;
        this.b = str;
        this.c = str2;
        this.d = tj0Var;
        this.e = z;
        this.f = v1hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptg)) {
            return false;
        }
        ptg ptgVar = (ptg) obj;
        return this.a.equals(ptgVar.a) && this.b.equals(ptgVar.b) && cqk.d(this.c, ptgVar.c) && this.d.equals(ptgVar.d) && this.e == ptgVar.e && cqk.d(this.f, ptgVar.f);
    }

    public final int hashCode() {
        int iN = nbh.n((this.d.hashCode() + zo5.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e);
        v1h v1hVar = this.f;
        return iN + (v1hVar == null ? 0 : Integer.hashCode(v1hVar.a));
    }

    public final String toString() {
        return "StoriesStoryOwnerToolbarState(title=" + this.a + ", subtitle=" + ((Object) this.b) + ", avatarUrl=" + this.c + ", avatarAbbreviationModel=" + this.d + ", showAuthorButtons=" + this.e + ", storySettings=" + this.f + ")";
    }
}
