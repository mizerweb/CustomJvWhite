package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gz7 {
    public final Boolean a;

    public gz7(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz7) && this.a.equals(((gz7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Selection(isSelected=" + this.a + ")";
    }
}
