package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uh7 implements wh7 {
    public final nh7 a;

    public uh7(nh7 nh7Var) {
        this.a = nh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh7) && cqk.d(this.a, ((uh7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectAlbum(album=" + this.a + ")";
    }
}
