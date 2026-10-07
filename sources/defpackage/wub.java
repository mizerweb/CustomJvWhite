package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wub extends qe7 {
    public final tub g;
    public final sub h;

    public wub(tub tubVar, sub subVar) {
        this.g = tubVar;
        this.h = subVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wub)) {
            return false;
        }
        wub wubVar = (wub) obj;
        return this.g == wubVar.g && this.h == wubVar.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        return "Manual(side=" + this.g + ", alignment=" + this.h + ")";
    }
}
