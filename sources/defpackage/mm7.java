package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mm7 {
    public final String a;
    public final String b;
    public final tj0 c;

    public mm7(String str, String str2, tj0 tj0Var) {
        this.a = str;
        this.b = str2;
        this.c = tj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm7)) {
            return false;
        }
        mm7 mm7Var = (mm7) obj;
        return this.a.equals(mm7Var.a) && this.b.equals(mm7Var.b) && this.c.equals(mm7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("WebAppContactData(displayName=", this.a, ", avatarUrl=", this.b, ", abbreviationModel=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
