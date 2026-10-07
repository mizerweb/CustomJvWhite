package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class by8 {
    public final int a;

    public by8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by8) && this.a == ((by8) obj).a;
    }

    public final int hashCode() {
        return qt4.D(this.a);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LaunchContext(entryPoint=");
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? "null" : "DEFAULT";
        } else {
            str = "TABBAR";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
