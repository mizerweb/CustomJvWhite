package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rih {
    public final aq a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;

    public rih(aq aqVar, boolean z, boolean z2, long j, int i) {
        this.a = aqVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rih)) {
            return false;
        }
        rih rihVar = (rih) obj;
        return this.a.equals(rihVar.a) && this.b == rihVar.b && this.c == rihVar.c && this.d == rihVar.d && this.e == rihVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qt4.g(nbh.n(nbh.n(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task(apiTask=");
        sb.append(this.a);
        sb.append(", executeAndSave=");
        sb.append(this.b);
        sb.append(", retry=");
        sb.append(this.c);
        sb.append(", dependsRequestId=");
        sb.append(this.d);
        return qv1.o(sb, ", dependencyType=", this.e, ")");
    }
}
