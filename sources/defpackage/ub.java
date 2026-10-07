package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ub {
    public final String a;
    public final String b;
    public final ynh c;

    public ub(String str, String str2, ynh ynhVar) {
        this.a = str;
        this.b = str2;
        this.c = ynhVar;
    }

    public static ub a(ub ubVar, String str, String str2, ynh ynhVar, int i) {
        if ((i & 1) != 0) {
            str = ubVar.a;
        }
        if ((i & 2) != 0) {
            str2 = ubVar.b;
        }
        if ((i & 4) != 0) {
            ynhVar = ubVar.c;
        }
        ubVar.getClass();
        return new ub(str, str2, ynhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return this.a.equals(ubVar.a) && this.b.equals(ubVar.b) && cqk.d(this.c, ubVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("AddStoryLinkUiState(url=", this.a, ", title=", this.b, ", urlErrorText=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
