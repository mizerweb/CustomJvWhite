package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ky7 {
    public final String a;

    public ky7(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky7) && cqk.d(this.a, ((ky7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("HoldModeToggleError(description=", this.a, ")");
    }
}
