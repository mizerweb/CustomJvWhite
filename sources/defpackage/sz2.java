package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sz2 extends kih {
    public final st2 c;

    public sz2(st2 st2Var) {
        this.c = st2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz2) && this.c == ((sz2) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chat=" + this.c + ")";
    }
}
