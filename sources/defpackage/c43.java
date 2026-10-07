package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c43 {
    public final fcc a;
    public final String b;

    public c43(fcc fccVar, String str) {
        this.a = fccVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c43)) {
            return false;
        }
        c43 c43Var = (c43) obj;
        return this.a.equals(c43Var.a) && this.b.equals(c43Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMediaTabsViewState(avatarParams=" + this.a + ", chatName=" + ((Object) this.b) + ")";
    }
}
