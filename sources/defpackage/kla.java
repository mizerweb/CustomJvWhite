package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kla {
    public final boolean a;
    public final CharSequence b;

    public kla(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kla)) {
            return false;
        }
        kla klaVar = (kla) obj;
        return this.a == klaVar.a && cqk.d(this.b, klaVar.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "MiniAppData(isVisible=" + this.a + ", title=" + ((Object) this.b) + ")";
    }
}
