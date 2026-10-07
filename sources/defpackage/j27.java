package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j27 implements k79 {
    public final tnh a;

    public j27(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j27) && this.a.equals(((j27) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 9223372036854775802L;
    }

    public final int hashCode() {
        return Long.hashCode(9223372036854775802L) + (Integer.hashCode(this.a.c) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 64;
    }

    public final String toString() {
        return x05.g("FolderEditDescriptionItem(description=", this.a, ", itemId=9223372036854775802)");
    }
}
