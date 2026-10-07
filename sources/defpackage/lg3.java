package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lg3 implements ng3 {
    public final ynh a;

    public lg3(ynh ynhVar) {
        this.a = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg3) && this.a.equals(((lg3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Fail(errorText=" + this.a + ")";
    }
}
