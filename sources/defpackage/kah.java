package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kah {
    public final p8h a;
    public final boolean b;

    public kah(p8h p8hVar, boolean z) {
        this.a = p8hVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kah)) {
            return false;
        }
        kah kahVar = (kah) obj;
        return cqk.d(this.a, kahVar.a) && this.b == kahVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Item(suggest=" + this.a + ", fromContacts=" + this.b + ")";
    }
}
