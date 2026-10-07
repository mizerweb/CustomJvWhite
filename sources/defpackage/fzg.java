package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fzg {
    public final u8b a;
    public final String b;

    public fzg(u8b u8bVar, String str) {
        this.a = u8bVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzg)) {
            return false;
        }
        fzg fzgVar = (fzg) obj;
        return cqk.d(this.a, fzgVar.a) && cqk.d(this.b, fzgVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StoryPageModel(previews=" + this.a + ", cursor=" + this.b + ")";
    }
}
