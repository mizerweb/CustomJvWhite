package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mbe implements pbe {
    public final fbe a;
    public final boolean b;

    public mbe(fbe fbeVar, boolean z) {
        this.a = fbeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbe)) {
            return false;
        }
        mbe mbeVar = (mbe) obj;
        return this.a == mbeVar.a && this.b == mbeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTyping(type=" + this.a + ", isTyping=" + this.b + ")";
    }
}
