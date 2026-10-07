package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cce implements dce {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ cce(boolean z, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cce)) {
            return false;
        }
        cce cceVar = (cce) obj;
        return this.a == cceVar.a && this.b == cceVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("Stop(wasLocked=", this.a, ", afterSwipe=", this.b, ")");
    }

    public cce(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
