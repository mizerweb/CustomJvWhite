package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vij extends wij {
    public final String c;
    public final boolean d;

    public vij(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vij)) {
            return false;
        }
        vij vijVar = (vij) obj;
        return cqk.d(this.c, vijVar.c) && this.d == vijVar.d;
    }

    @Override // defpackage.wij
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionChange(queryId=" + this.c + ", disableVibrationFallback=" + this.d + ")";
    }
}
