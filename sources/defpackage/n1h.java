package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n1h implements t50 {
    public final long a;
    public final azg b;
    public final String c;

    public n1h(long j, azg azgVar, String str) {
        this.a = j;
        this.b = azgVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1h)) {
            return false;
        }
        n1h n1hVar = (n1h) obj;
        return this.a == n1hVar.a && cqk.d(this.b, n1hVar.b) && cqk.d(this.c, n1hVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryReplyInfo(storyId=");
        sb.append(this.a);
        sb.append(", storyOwner=");
        sb.append(this.b);
        return qt4.q(sb, ", previewUrl=", this.c, ")");
    }
}
