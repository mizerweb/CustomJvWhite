package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ard extends erd {
    public final ynh a;
    public final String b;
    public final boolean c;

    public ard(ynh ynhVar, String str, boolean z) {
        this.a = ynhVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ard)) {
            return false;
        }
        ard ardVar = (ard) obj;
        return this.a.equals(ardVar.a) && this.b.equals(ardVar.b) && this.c == ardVar.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 16L;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 16;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phone(title=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append((Object) this.b);
        sb.append(", canCallByPhone=");
        return qt4.r(sb, this.c, ")");
    }
}
