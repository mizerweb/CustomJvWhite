package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bce implements dce {
    public final boolean a;
    public final boolean b;

    public bce(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bce)) {
            return false;
        }
        bce bceVar = (bce) obj;
        return this.a == bceVar.a && this.b == bceVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("Recording(afterPause=", this.a, ", isLocked=", this.b, ")");
    }
}
