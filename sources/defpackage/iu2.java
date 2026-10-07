package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iu2 {
    public final long a;
    public final String b;

    public iu2(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final long a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu2)) {
            return false;
        }
        iu2 iu2Var = (iu2) obj;
        return this.a == iu2Var.a && cqk.d(this.b, iu2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "ChatAndFolderCrossRef(chatId=", ", folderId=", this.b);
        sbT.append(")");
        return sbT.toString();
    }
}
