package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cfg implements efg {
    public final e3h a;

    public cfg(e3h e3hVar) {
        this.a = e3hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfg) && this.a == ((cfg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FrameAvailable(frame=" + this.a + ")";
    }
}
