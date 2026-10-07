package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uu implements k79 {
    public final su a;
    public final Boolean b;
    public final ynh c;

    public uu(su suVar, Boolean bool, ynh ynhVar) {
        this.a = suVar;
        this.b = bool;
        this.c = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        return this.a == uuVar.a && this.b.equals(uuVar.b) && this.c.equals(uuVar.c);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a.ordinal();
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return getItemId() == k79Var.getItemId();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        uu uuVar = k79Var instanceof uu ? (uu) k79Var : null;
        if (uuVar != null) {
            Boolean bool = uuVar.b;
            if (!this.b.equals(bool)) {
                return new tu(bool);
            }
        }
        return null;
    }

    public final String toString() {
        return "AppearanceModeItem(mode=" + this.a + ", isSelected=" + this.b + ", title=" + this.c + ")";
    }
}
