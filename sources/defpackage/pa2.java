package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pa2 implements ra2 {
    public final String a;

    public pa2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa2) && cqk.d(this.a, ((pa2) obj).a);
    }

    @Override // defpackage.ra2
    public final String getDescription() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("BlockReason(description=", this.a, ")");
    }
}
