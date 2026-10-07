package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hrg implements irg {
    public final tnh a;
    public final Integer b;

    public hrg(tnh tnhVar, Integer num) {
        this.a = tnhVar;
        this.b = num;
    }

    public final Integer a() {
        return this.b;
    }

    public final ynh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrg)) {
            return false;
        }
        hrg hrgVar = (hrg) obj;
        return cqk.d(this.a, hrgVar.a) && cqk.d(this.b, hrgVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", icon=" + this.b + ")";
    }

    public /* synthetic */ hrg(tnh tnhVar) {
        this(tnhVar, null);
    }
}
