package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dbf {
    public final ynh a;
    public final float b;

    public dbf(ynh ynhVar, float f) {
        this.a = ynhVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbf)) {
            return false;
        }
        dbf dbfVar = (dbf) obj;
        return cqk.d(this.a, dbfVar.a) && Float.compare(this.b, dbfVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Step(label=" + this.a + ", stepValue=" + this.b + ")";
    }
}
