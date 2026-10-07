package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zmi implements k79 {
    public final r17 a;
    public final ymi b;
    public final ynh c;
    public final int d;
    public final long e;

    public zmi(r17 r17Var, ymi ymiVar, ynh ynhVar) {
        String str;
        this.a = r17Var;
        this.b = ymiVar;
        this.c = ynhVar;
        this.d = ymiVar.ordinal();
        this.e = (ymiVar.hashCode() * 33) + ((r17Var == null || (str = r17Var.a) == null) ? 0 : str.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmi)) {
            return false;
        }
        zmi zmiVar = (zmi) obj;
        return cqk.d(this.a, zmiVar.a) && this.b == zmiVar.b && this.c.equals(zmiVar.c);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.e;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        if (!(k79Var instanceof zmi)) {
            return false;
        }
        r17 r17Var = this.a;
        String str = r17Var != null ? r17Var.a : null;
        r17 r17Var2 = ((zmi) k79Var).a;
        return cqk.d(str, r17Var2 != null ? r17Var2.a : null);
    }

    public final int hashCode() {
        r17 r17Var = this.a;
        int iHashCode = r17Var == null ? 0 : r17Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return this.d;
    }

    public final String toString() {
        return "UserFolderListItem(folder=" + this.a + ", type=" + this.b + ", processedTitle=" + this.c + ")";
    }
}
