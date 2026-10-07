package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ek1 implements gk1 {
    public final if1 a;

    public ek1(if1 if1Var) {
        this.a = if1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek1) && this.a.equals(((ek1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreateJoinLinkEvent(event=" + this.a + ")";
    }
}
