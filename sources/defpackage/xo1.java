package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xo1 extends fp1 {
    public final ok0 a;

    public xo1(ok0 ok0Var) {
        this.a = ok0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo1) && this.a.equals(((xo1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Avatar(avatarInfo=" + this.a + ")";
    }
}
