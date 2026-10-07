package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xx {
    public final String a;

    public xx(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx) && this.a.equals(((xx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 1096806818;
    }

    public final String toString() {
        return c0a.o("Key(system=ov_sdk, subSystem=", this.a, ")");
    }
}
