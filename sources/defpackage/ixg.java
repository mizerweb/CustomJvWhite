package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ixg {
    public final long a;
    public final String b;

    public ixg(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixg)) {
            return false;
        }
        ixg ixgVar = (ixg) obj;
        return this.a == ixgVar.a && cqk.d(this.b, ixgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "StoryDraftTextAttrsEntity(draftId=", ", backgroundName=", this.b);
        sbT.append(")");
        return sbT.toString();
    }
}
