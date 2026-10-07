package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yjh {
    public final String a;
    public final Class b;

    public yjh(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjh)) {
            return false;
        }
        yjh yjhVar = (yjh) obj;
        return cqk.d(this.a, yjhVar.a) && this.b.equals(yjhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TaskFinishedArgs(taskId=" + this.a + ", taskClass=" + this.b + ")";
    }
}
