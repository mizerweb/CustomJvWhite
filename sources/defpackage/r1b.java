package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r1b {
    public final u1b a;
    public final String b;
    public final String c;
    public final z1b d;
    public final svk e;
    public final g2b f;

    public r1b(u1b u1bVar, String str, String str2, z1b z1bVar, svk svkVar, g2b g2bVar) {
        this.a = u1bVar;
        this.b = str;
        this.c = str2;
        this.d = z1bVar;
        this.e = svkVar;
        this.f = g2bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1b)) {
            return false;
        }
        r1b r1bVar = (r1b) obj;
        return this.a.equals(r1bVar.a) && this.b.equals(r1bVar.b) && this.c.equals(r1bVar.c) && this.d == r1bVar.d && this.e.equals(r1bVar.e) && this.f.equals(r1bVar.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + zo5.d(zo5.d(Long.hashCode(this.a.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "Movie(movieId=" + this.a + ", externalMovieId=" + this.b + ", title=" + this.c + ", sourceType=" + this.d + ", duration=" + this.e + ", thumbnail=" + this.f + ")";
    }
}
