package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nmh implements omh {
    public final Long a;
    public final CharSequence b;
    public final hoh c;

    public nmh(Long l, CharSequence charSequence, hoh hohVar) {
        this.a = l;
        this.b = charSequence;
        this.c = hohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmh)) {
            return false;
        }
        nmh nmhVar = (nmh) obj;
        return cqk.d(this.a, nmhVar.a) && cqk.d(this.b, nmhVar.b) && cqk.d(this.c, nmhVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        hoh hohVar = this.c;
        return iHashCode2 + (hohVar != null ? hohVar.hashCode() : 0);
    }

    public final String toString() {
        return "Visible(layerId=" + this.a + ", initialText=" + ((Object) this.b) + ", initialUiState=" + this.c + ")";
    }
}
