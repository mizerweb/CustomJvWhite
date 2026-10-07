package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wg1 implements lh1 {
    public final wo3 a;

    public wg1(wo3 wo3Var) {
        this.a = wo3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg1) && this.a.equals(((wg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChatsUpdate(info=" + this.a + ")";
    }
}
