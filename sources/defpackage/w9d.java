package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w9d extends kih {
    public final ed7 c;

    public w9d(ed7 ed7Var) {
        this.c = ed7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9d) && this.c == ((w9d) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(state=" + this.c + ")";
    }
}
