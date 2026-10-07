package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mph {
    public final geh a;

    public mph(geh gehVar) {
        this.a = gehVar;
    }

    public static mph a(geh gehVar) {
        return new mph(gehVar);
    }

    public final geh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mph) && cqk.d(this.a, ((mph) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SvgPattern(svgPattern=" + this.a + ")";
    }
}
