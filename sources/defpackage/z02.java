package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z02 {
    public final String a;

    public /* synthetic */ z02(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z02) {
            return cqk.d(this.a, ((z02) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
