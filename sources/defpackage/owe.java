package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class owe {
    public final int a;

    public /* synthetic */ owe(int i) {
        this.a = i;
    }

    public static final boolean a(int i) {
        return i == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof owe) {
            return this.a == ((owe) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "RuStorePushMode(rawValue=", ")");
    }
}
