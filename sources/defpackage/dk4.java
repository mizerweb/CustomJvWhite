package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dk4 {
    public final Boolean a;

    public dk4(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk4) && cqk.d(this.a, ((dk4) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Selection(isSelected=" + this.a + ")";
    }
}
