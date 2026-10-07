package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nla implements pla {
    public final boolean a;

    public nla(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nla) && this.a == ((nla) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("OnReactToStory(removeReaction=", ")", this.a);
    }
}
