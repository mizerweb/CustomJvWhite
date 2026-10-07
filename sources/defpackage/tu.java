package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tu {
    public final Boolean a;

    public tu(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu) && this.a.equals(((tu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Selection(isSelected=" + this.a + ")";
    }
}
