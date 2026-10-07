package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k89 extends l89 {
    public final d25 a = d25.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k89.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((k89) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (k89.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
