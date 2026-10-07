package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class otg extends kih {
    public final u8b c;
    public final ysg d;

    public otg(u8b u8bVar, ysg ysgVar) {
        this.c = u8bVar;
        this.d = ysgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otg)) {
            return false;
        }
        otg otgVar = (otg) obj;
        return cqk.d(this.c, otgVar.c) && cqk.d(this.d, otgVar.d);
    }

    public final u8b h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        ysg ysgVar = this.d;
        return iHashCode + (ysgVar == null ? 0 : ysgVar.hashCode());
    }

    public final ysg i() {
        return this.d;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(stories=" + this.c + ", storiesPreview=" + this.d + ")";
    }
}
