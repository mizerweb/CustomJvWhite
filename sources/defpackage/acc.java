package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acc implements dcc {
    public final lcc a;
    public final lcc b;
    public final lcc c;

    public acc(lcc lccVar, lcc lccVar2, lcc lccVar3) {
        this.a = lccVar;
        this.b = lccVar2;
        this.c = lccVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acc)) {
            return false;
        }
        acc accVar = (acc) obj;
        return cqk.d(this.a, accVar.a) && cqk.d(this.b, accVar.b) && cqk.d(this.c, accVar.c);
    }

    public final int hashCode() {
        lcc lccVar = this.a;
        int iHashCode = (lccVar == null ? 0 : lccVar.hashCode()) * 31;
        lcc lccVar2 = this.b;
        int iHashCode2 = (iHashCode + (lccVar2 == null ? 0 : lccVar2.hashCode())) * 31;
        lcc lccVar3 = this.c;
        return iHashCode2 + (lccVar3 != null ? lccVar3.hashCode() : 0);
    }

    public final String toString() {
        return "IconButtons(secondaryButton=" + this.a + ", primaryButton=" + this.b + ", thirdButton=" + this.c + ")";
    }
}
