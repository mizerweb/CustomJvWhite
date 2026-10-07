package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a51 implements b51 {
    public final Boolean a;

    public a51(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a51) && this.a.equals(((a51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Set(value=" + this.a + ")";
    }
}
