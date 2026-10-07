package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jc implements nc {
    public final q24 a;
    public final List b;

    public jc(q24 q24Var, List list) {
        this.a = q24Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj;
        return cqk.d(this.a, jcVar.a) && cqk.d(this.b, jcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeleteSelectedComments(commentsId=" + this.a + ", commentIds=" + this.b + ")";
    }
}
