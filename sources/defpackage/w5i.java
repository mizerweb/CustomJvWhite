package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w5i implements x5i {
    public final String a;

    public w5i(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5i) && this.a.equals(((w5i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("GoToTwoFASettings(trackId=", this.a, ")");
    }
}
