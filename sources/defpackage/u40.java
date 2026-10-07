package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u40 {
    public static final u40 d = new u40(v40.a, null, null);
    public final long a;
    public final t50 b;
    public final kg8 c;

    public u40(long j, t50 t50Var, kg8 kg8Var) {
        this.a = j;
        this.b = t50Var;
        this.c = kg8Var;
    }

    public final boolean a() {
        int i = v40.b;
        return (4 & this.a) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        long j = u40Var.a;
        int i = v40.b;
        return this.a == j && cqk.d(this.b, u40Var.b) && cqk.d(this.c, u40Var.c);
    }

    public final int hashCode() {
        int i = v40.b;
        int iHashCode = Long.hashCode(this.a) * 31;
        t50 t50Var = this.b;
        int iHashCode2 = (iHashCode + (t50Var == null ? 0 : t50Var.hashCode())) * 31;
        kg8 kg8Var = this.c;
        return iHashCode2 + (kg8Var != null ? kg8Var.hashCode() : 0);
    }

    public final String toString() {
        int i = v40.b;
        return "AttachInfo(flags=" + nbh.s(this.a, "AttachInfoFlags(rawValue=", ")") + ", attachModel=" + this.b + ", inlineKeyboard=" + this.c + ")";
    }
}
