package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class af {
    public static final ze Companion = new ze();
    public final Boolean a;
    public final String b;
    public final String c;

    public /* synthetic */ af(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return cqk.d(this.a, afVar.a) && cqk.d(this.b, afVar.b) && cqk.d(this.c, afVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiBweConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", label=");
        return zo5.w(sb, this.c, ")");
    }

    public af() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
