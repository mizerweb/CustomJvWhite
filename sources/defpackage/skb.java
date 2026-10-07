package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class skb extends kih {
    public final ysg c;

    public skb(ysg ysgVar) {
        this.c = ysgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skb) && this.c.equals(((skb) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(storiesPreview=" + this.c + ")";
    }
}
