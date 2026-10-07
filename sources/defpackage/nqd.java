package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nqd extends erd {
    public final int a;

    public nqd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqd) && this.a == ((nqd) obj).a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 16777216L;
    }

    public final int hashCode() {
        return Integer.hashCode(-2130706432) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return -2130706432;
    }

    public final String toString() {
        return "CommentsBlackList(count=" + this.a + ", itemViewType=" + jll.b(-2130706432) + ")";
    }
}
