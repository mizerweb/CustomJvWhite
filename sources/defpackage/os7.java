package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class os7 extends mk0 {
    public final lad b;

    public os7(lad ladVar) {
        super(11);
        this.b = ladVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os7) && this.b == ((os7) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "HandleResult(result=" + this.b + ")";
    }
}
