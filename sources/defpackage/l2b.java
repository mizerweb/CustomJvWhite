package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l2b implements jwa {
    public final int a;

    public l2b(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2b) && this.a == ((l2b) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
