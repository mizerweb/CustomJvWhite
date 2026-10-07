package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eqa implements iqa {
    public final int a;

    public eqa(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eqa) && this.a == ((eqa) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "ProcessClickMultiSelect(actionId=", ")");
    }
}
