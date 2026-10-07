package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fcj implements vve {
    public final d2b a;

    public fcj(d2b d2bVar) {
        this.a = d2bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcj) && this.a.equals(((fcj) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "WatchTogetherUpdateNotification(updates=" + this.a + ")";
    }
}
