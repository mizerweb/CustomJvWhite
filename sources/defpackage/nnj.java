package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nnj implements ynj {
    public final String a;

    public nnj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnj) && cqk.d(this.a, ((nnj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("ShowCloseDialog(appName=", this.a, ")");
    }
}
