package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class akj extends ckj {
    public final String a;

    public akj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akj) && cqk.d(this.a, ((akj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("InternalNavigation(deeplink=", this.a, ")");
    }
}
