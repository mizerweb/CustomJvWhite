package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s9i implements Comparable {
    public final byte a;

    public /* synthetic */ s9i(byte b) {
        this.a = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return cqk.i(this.a & 255, ((s9i) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s9i) {
            return this.a == ((s9i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
