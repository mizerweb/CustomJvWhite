package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class de6 implements k79 {
    public final String a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final long h;

    public de6(String str, int i, long j, int i2, int i3, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de6)) {
            return false;
        }
        de6 de6Var = (de6) obj;
        return cqk.d(this.a, de6Var.a) && this.b == de6Var.b && this.c == de6Var.c && this.d == de6Var.d && this.e == de6Var.e && this.f == de6Var.f && this.g == de6Var.g;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + nbh.n(zo5.c(this.e, zo5.c(this.d, qt4.g(zo5.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31, this.f);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "ExecutorState(name=", this.a, ", numberOfIdleThreads=", ", completedTasksCount=");
        c0a.w(sbR, this.c, ", activeTasksCount=", this.d);
        sbR.append(", tasksInQueue=");
        sbR.append(this.e);
        sbR.append(", shutdown=");
        sbR.append(this.f);
        return nbh.z(sbR, ", terminated=", this.g, ")");
    }
}
