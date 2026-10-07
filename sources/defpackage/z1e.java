package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z1e implements b2e {
    public final long a;

    public z1e(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1e) && this.a == ((z1e) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ModeRecordingVideo(startTimeMs=", ")");
    }
}
