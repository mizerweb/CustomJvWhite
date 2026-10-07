package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v8i {
    public final ynh a;
    public final ynh b;
    public final ynh c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;

    public /* synthetic */ v8i(tnh tnhVar, ynh ynhVar, int i, int i2, int i3) {
        this(tnhVar, (i3 & 2) != 0 ? null : ynhVar, null, (i3 & 8) != 0, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0);
    }

    public static v8i a(v8i v8iVar, ynh ynhVar) {
        return new v8i(v8iVar.a, v8iVar.b, ynhVar, v8iVar.d, v8iVar.e, v8iVar.f, v8iVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8i)) {
            return false;
        }
        v8i v8iVar = (v8i) obj;
        return cqk.d(this.a, v8iVar.a) && cqk.d(this.b, v8iVar.b) && cqk.d(this.c, v8iVar.c) && this.d == v8iVar.d && this.e == v8iVar.e && this.f == v8iVar.f && this.g == v8iVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynh ynhVar = this.b;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        ynh ynhVar2 = this.c;
        return Boolean.hashCode(this.g) + zo5.c(this.f, zo5.c(this.e, nbh.n((iHashCode2 + (ynhVar2 != null ? ynhVar2.hashCode() : 0)) * 31, 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputState(hint=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", showMaxLengthLabel=");
        sb.append(this.d);
        sb.append(", minLength=");
        qt4.x(this.e, this.f, ", maxLength=", ", typingPassword=", sb);
        return qt4.r(sb, this.g, ")");
    }

    public v8i(ynh ynhVar, ynh ynhVar2, ynh ynhVar3, boolean z, int i, int i2, boolean z2) {
        this.a = ynhVar;
        this.b = ynhVar2;
        this.c = ynhVar3;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = z2;
    }
}
