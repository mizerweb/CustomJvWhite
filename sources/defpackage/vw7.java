package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vw7 extends xw7 {
    public final CharSequence a;

    public vw7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw7) && cqk.d(this.a, ((vw7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.a) + ")";
    }
}
