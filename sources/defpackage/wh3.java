package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wh3 {
    public static final wh3 c = new wh3(r66.a, true);
    public final List a;
    public final boolean b;

    public wh3(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh3)) {
            return false;
        }
        wh3 wh3Var = (wh3) obj;
        return this.a.equals(wh3Var.a) && this.b == wh3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatsList(chats=" + this.a + ", hasMore=" + this.b + ")";
    }
}
