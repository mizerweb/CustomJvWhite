package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yx1 extends ry1 {
    public final String F;

    public yx1(String str) {
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx1) && this.F.equals(((yx1) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return c0a.o("CopyCallLink(link=", this.F, ")");
    }
}
