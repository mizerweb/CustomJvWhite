package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vdd {
    public final String a;

    public vdd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vdd)) {
            return false;
        }
        return this.a.equals(((vdd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
