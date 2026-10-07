package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m3j implements vve {
    public final l3j a;

    public m3j(l3j l3jVar) {
        this.a = l3jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3j) && this.a.equals(((m3j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoQualityUpdateNotification(videoQuality=" + this.a + ")";
    }
}
