package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xg0 {
    public final int a;

    public xg0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof xg0) && this.a == ((xg0) obj).a;
    }

    public final int hashCode() {
        return (this.a ^ 1000003) * 1000003;
    }

    public final String toString() {
        return zo5.t(new StringBuilder("StateError{code="), this.a, ", cause=null}");
    }
}
