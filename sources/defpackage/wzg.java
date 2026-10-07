package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wzg {
    public final long a;
    public final azg b;

    public wzg(long j, azg azgVar) {
        this.a = j;
        this.b = azgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzg)) {
            return false;
        }
        wzg wzgVar = (wzg) obj;
        return this.a == wzgVar.a && this.b.equals(wzgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StoryPublishConfig(draftId=" + this.a + ", owner=" + this.b + ")";
    }
}
