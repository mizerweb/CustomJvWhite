package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class xy3 implements bz3 {
    public final q24 a;
    public final List b;

    public xy3(q24 q24Var, List list) {
        this.a = q24Var;
        this.b = list;
    }

    @Override // defpackage.bz3
    public final q24 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy3)) {
            return false;
        }
        xy3 xy3Var = (xy3) obj;
        return cqk.d(this.a, xy3Var.a) && cqk.d(this.b, xy3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeleteCommentEvent(commentsId=" + this.a + ", ids=" + this.b + ")";
    }
}
