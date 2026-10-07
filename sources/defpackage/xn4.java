package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xn4 implements zn4 {
    public final nl4 a;

    public xn4(nl4 nl4Var) {
        this.a = nl4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn4) && this.a == ((xn4) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnResult(contactsResult=" + this.a + ")";
    }
}
