package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class de3 extends kih {
    public final ka3 c;

    public de3(ka3 ka3Var) {
        this.c = ka3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de3) && this.c.equals(((de3) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chatReactionsSettings=" + this.c + ")";
    }
}
