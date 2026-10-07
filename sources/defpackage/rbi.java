package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rbi {
    public final String a;
    public final int b;

    public rbi(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbi)) {
            return false;
        }
        rbi rbiVar = (rbi) obj;
        return this.a.equals(rbiVar.a) && this.b == rbiVar.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sbV = qt4.v("Uniform(name=", this.a, ", type=");
        int i = this.b;
        if (i == 1) {
            str = "Float";
        } else if (i != 2) {
            str = i != 3 ? "null" : "Vec4";
        } else {
            str = "Vec2";
        }
        sbV.append(str);
        sbV.append(")");
        return sbV.toString();
    }
}
