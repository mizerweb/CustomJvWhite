package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w1j extends a2j {
    public final wxi a;
    public final boolean b;

    public w1j(wxi wxiVar, boolean z) {
        this.a = wxiVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1j)) {
            return false;
        }
        w1j w1jVar = (w1j) obj;
        return cqk.d(this.a, w1jVar.a) && this.b == w1jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackCamera(torchState=" + this.a + ", isTimerVisible=" + this.b + ")";
    }
}
