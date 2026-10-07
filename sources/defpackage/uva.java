package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uva extends wva {
    public final String b;
    public final s5e c;

    public uva(String str, s5e s5eVar) {
        this.b = str;
        this.c = s5eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uva)) {
            return false;
        }
        uva uvaVar = (uva) obj;
        return cqk.d(this.b, uvaVar.b) && cqk.d(this.c, uvaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OnReactionSelected(url=" + this.b + ", reaction=" + ((Object) this.c) + ")";
    }
}
