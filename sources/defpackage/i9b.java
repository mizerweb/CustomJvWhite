package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i9b {
    public final h9b a;
    public final boolean b;

    public i9b(h9b h9bVar, boolean z) {
        this.a = h9bVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i9b) {
            i9b i9bVar = (i9b) obj;
            if (this.a == i9bVar.a && this.b == i9bVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MuteState(muteEvent=" + this.a + ", isForAll=" + this.b + ")";
    }
}
