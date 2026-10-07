package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wy3 implements bz3 {
    public final q24 a;

    public wy3(q24 q24Var) {
        this.a = q24Var;
    }

    @Override // defpackage.bz3
    public final q24 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy3) && cqk.d(this.a, ((wy3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommentsUpdateEvent(commentsId=" + this.a + ")";
    }
}
