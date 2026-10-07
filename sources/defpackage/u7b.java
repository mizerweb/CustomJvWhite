package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class u7b {
    public final CharSequence a;
    public final CharSequence b;
    public final Map c;

    public u7b(CharSequence charSequence, CharSequence charSequence2, Map map) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = map;
    }

    public final CharSequence a() {
        return this.a;
    }

    public final Map b() {
        return this.c;
    }

    public final CharSequence c() {
        return this.b;
    }

    public final boolean d() {
        if (this.b.length() != 0) {
            return false;
        }
        CharSequence charSequence = this.a;
        return (charSequence == null || charSequence.length() == 0) && this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7b)) {
            return false;
        }
        u7b u7bVar = (u7b) obj;
        return cqk.d(this.a, u7bVar.a) && this.b.equals(u7bVar.b) && this.c.equals(u7bVar.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.c.hashCode() + mw7.f((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "MediaMetadata(artist=" + ((Object) this.a) + ", track=" + ((Object) this.b) + ", extras=" + this.c + ")";
    }
}
