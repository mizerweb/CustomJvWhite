package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bvi implements cvi {
    public final gka a;
    public final wui b;

    public bvi(gka gkaVar, wui wuiVar) {
        this.a = gkaVar;
        this.b = wuiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvi)) {
            return false;
        }
        bvi bviVar = (bvi) obj;
        return cqk.d(this.a, bviVar.a) && this.b.equals(bviVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReadyToUpload(preparedMessageUpload=" + this.a + ", preparedConversion=" + this.b + ")";
    }
}
