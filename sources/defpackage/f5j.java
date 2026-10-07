package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f5j extends kih {
    public final List c;
    public final Integer d;

    public f5j(List list, Integer num) {
        this.c = list;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5j)) {
            return false;
        }
        f5j f5jVar = (f5j) obj;
        return cqk.d(this.c, f5jVar.c) && cqk.d(this.d, f5jVar.d);
    }

    public final int hashCode() {
        List list = this.c;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(info=" + this.c + ", uploaderType=" + this.d + ")";
    }
}
