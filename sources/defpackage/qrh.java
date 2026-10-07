package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qrh implements jwa {
    public final long a;

    public qrh(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qrh.class == obj.getClass() && this.a == ((qrh) obj).a;
    }

    public final int hashCode() {
        return gpk.c(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
