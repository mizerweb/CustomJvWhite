package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wd implements xd {
    public final fu1 a;

    public wd(fu1 fu1Var) {
        this.a = fu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wd) && this.a.equals(((wd) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableScreenSharingForParticipant(id=" + this.a + ", isSuccess=true)";
    }
}
