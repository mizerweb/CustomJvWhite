package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ab4 extends mk0 {
    public final String b;

    public ab4(String str) {
        super(6);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab4) && cqk.d(this.b, ((ab4) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return c0a.o("GoToStartScreen(phone=", this.b, ")");
    }
}
