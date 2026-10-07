package defpackage;

import android.media.MediaMetadataRetriever;

/* JADX INFO: loaded from: classes3.dex */
public final class w4j {
    public final MediaMetadataRetriever a;
    public final long b;

    public w4j(MediaMetadataRetriever mediaMetadataRetriever, long j) {
        this.a = mediaMetadataRetriever;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4j)) {
            return false;
        }
        w4j w4jVar = (w4j) obj;
        return cqk.d(this.a, w4jVar.a) && this.b == w4jVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RetrieverInfo(retriever=" + this.a + ", durationMs=" + this.b + ")";
    }
}
