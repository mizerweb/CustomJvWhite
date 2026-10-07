package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wcd {
    public final CharSequence a;
    public final e8b b;

    public wcd(CharSequence charSequence, e8b e8bVar) {
        this.a = charSequence;
        this.b = e8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcd)) {
            return false;
        }
        wcd wcdVar = (wcd) obj;
        return this.a.equals(wcdVar.a) && this.b.equals(wcdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreProcessedPoll(title=" + ((Object) this.a) + ", answers=" + this.b + ")";
    }
}
