package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hy1 extends ry1 {
    public final CharSequence F;

    public hy1(CharSequence charSequence) {
        this.F = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy1) && cqk.d(this.F, ((hy1) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return "RecordStart(name=" + ((Object) this.F) + ")";
    }
}
