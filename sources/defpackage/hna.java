package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hna implements una {
    public final long a;

    public hna(long j) {
        this.a = j;
    }

    @Override // defpackage.una
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hna) && this.a == ((hna) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.una
    public final long l() {
        return this.a;
    }

    public final String toString() {
        return nbh.s(this.a, "OnUnsupportedAttachButtonClick(messageId=", ", isSkippableForMultiSelect=true)");
    }
}
