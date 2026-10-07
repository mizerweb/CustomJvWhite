package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t2b implements jwa {
    public final int a;

    public t2b(int i) {
        lvb.O("Unsupported orientation", i == 0 || i == 90 || i == 180 || i == 270);
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2b) && this.a == ((t2b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + 527;
    }

    public final String toString() {
        return "Orientation= " + this.a;
    }
}
