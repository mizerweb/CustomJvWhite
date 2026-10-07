package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h8g implements iq9 {
    public final long a;
    public final String b;
    public final g58 c;
    public final r8e d;
    public final boolean e;

    public h8g(long j, String str, g58 g58Var, r8e r8eVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = g58Var;
        this.d = r8eVar;
        this.e = z;
    }

    public final boolean a() {
        gjg gjgVar = this.d.a;
        return (gjgVar.getValue() instanceof c50) || (gjgVar.getValue() instanceof g50) || (gjgVar.getValue() instanceof e50);
    }

    @Override // defpackage.iq9
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h8g) {
            h8g h8gVar = (h8g) obj;
            if (this.a == h8gVar.a && cqk.d(this.b, h8gVar.b) && cqk.d(this.c, h8gVar.c) && this.d == h8gVar.d && this.e == h8gVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "SingleImageAttach(messageId=", ", attachId=", this.b);
        sbT.append(", imageAttach=");
        sbT.append(this.c);
        sbT.append(", progressState=");
        sbT.append(this.d);
        return nbh.z(sbT, ", isMediaOrderedFirst=", this.e, ")");
    }
}
