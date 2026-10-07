package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ti3 implements ui3 {
    public final int a;

    public ti3(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti3) && this.a == ((ti3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "ProcessClickMultiSelect(actionId=", ")");
    }
}
