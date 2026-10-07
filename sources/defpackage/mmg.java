package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mmg implements nmg {
    public final int a;

    public mmg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmg) && this.a == ((mmg) obj).a;
    }

    public final int hashCode() {
        return qt4.D(this.a);
    }

    public final String toString() {
        return "TypeChange(newType=" + pye.m(this.a) + ")";
    }
}
