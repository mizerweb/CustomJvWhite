package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class az3 implements bz3 {
    public final q24 a;
    public final List b;
    public final boolean c;

    public az3(q24 q24Var, List list, boolean z) {
        this.a = q24Var;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.bz3
    public final q24 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az3)) {
            return false;
        }
        az3 az3Var = (az3) obj;
        return cqk.d(this.a, az3Var.a) && cqk.d(this.b, az3Var.b) && this.c == az3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qv1.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateCommentEvent(commentsId=");
        sb.append(this.a);
        sb.append(", ids=");
        sb.append(this.b);
        sb.append(", reactionsChanged=");
        return qt4.r(sb, this.c, ")");
    }

    public /* synthetic */ az3(q24 q24Var, List list) {
        this(q24Var, list, false);
    }
}
