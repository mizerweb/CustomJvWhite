package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ss1 extends xs1 {
    public final String a;

    public ss1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss1) && this.a.equals(((ss1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Description(description=" + ((Object) this.a) + ")";
    }
}
