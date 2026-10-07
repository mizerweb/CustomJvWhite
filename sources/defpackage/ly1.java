package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ly1 extends ry1 {
    public final String F;

    public ly1(String str) {
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly1) && this.F.equals(((ly1) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return c0a.o("ShareLinkToChat(link=", this.F, ")");
    }
}
