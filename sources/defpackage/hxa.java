package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxa {
    public final ku8 a = new ku8();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxa) && this.a == ((hxa) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + zo5.c(0, Integer.hashCode(0) * 31, 31);
    }

    public final String toString() {
        return "MetadataTransform(past=0, future=0, transformFn=" + this.a + ')';
    }
}
