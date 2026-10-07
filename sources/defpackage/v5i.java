package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v5i implements x5i {
    public final String a;
    public final pk8 b;

    public v5i(String str, pk8 pk8Var) {
        this.a = str;
        this.b = pk8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5i)) {
            return false;
        }
        v5i v5iVar = (v5i) obj;
        return cqk.d(this.a, v5iVar.a) && this.b.equals(v5iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GoToRestore(trackId=" + this.a + ", navData=" + this.b + ")";
    }
}
