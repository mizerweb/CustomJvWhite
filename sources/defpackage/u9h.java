package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u9h implements k79 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence d;
    public final String e;
    public final List f;
    public final int g;

    public u9h(long j, CharSequence charSequence, String str, CharSequence charSequence2, String str2, List list, int i) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.d = charSequence2;
        this.e = str2;
        this.f = list;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9h)) {
            return false;
        }
        u9h u9hVar = (u9h) obj;
        return this.a == u9hVar.a && this.b.equals(u9hVar.b) && this.c.equals(u9hVar.c) && this.d.equals(u9hVar.d) && this.e.equals(u9hVar.e) && this.f.equals(u9hVar.f) && this.g == u9hVar.g;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return qt4.D(this.g) + qv1.c(zo5.d(mw7.f(zo5.d(mw7.f(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final CharSequence i() {
        if (this.g != 3) {
            CharSequence charSequence = this.d;
            if (charSequence.length() != 0) {
                return charSequence;
            }
        }
        return this.b;
    }

    @Override // defpackage.k79
    public final int j() {
        return 1;
    }

    public final String toString() {
        return "SuggestionsState(id=" + this.a + ", name=" + ((Object) this.b) + ", avatar=" + this.c + ", shortName=" + ((Object) this.d) + ", query=" + this.e + ", contextActions=" + this.f + ", type=" + v0h.s(this.g) + ")";
    }
}
