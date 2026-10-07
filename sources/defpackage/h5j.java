package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h5j {
    public final String a;
    public final List b;

    public h5j(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5j)) {
            return false;
        }
        h5j h5jVar = (h5j) obj;
        return this.a.equals(h5jVar.a) && this.b.equals(h5jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoFetchItem(fetchId=" + this.a + ", messageIds=" + this.b + ")";
    }
}
