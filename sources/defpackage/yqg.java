package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yqg extends kih {
    public final ysg c;

    public yqg(ysg ysgVar) {
        this.c = ysgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqg) && this.c.equals(((yqg) obj).c);
    }

    public final ysg h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(storiesPreview=" + this.c + ")";
    }
}
