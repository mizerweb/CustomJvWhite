package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wik {
    public final zik a;
    public final zik b;

    public wik(zik zikVar, zik zikVar2) {
        this.a = zikVar;
        this.b = zikVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wik)) {
            return false;
        }
        wik wikVar = (wik) obj;
        return this.a.equals(wikVar.a) && this.b.equals(wikVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PerTypeNetworkPair(mobile=" + this.a + ", wifi=" + this.b + ')';
    }
}
