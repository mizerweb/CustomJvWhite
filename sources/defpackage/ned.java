package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class ned {
    public final Object a;
    public final Collection b;

    public ned(Object obj, Collection collection) {
        this.a = obj;
        this.b = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ned)) {
            return false;
        }
        ned nedVar = (ned) obj;
        return cqk.d(this.a, nedVar.a) && this.b.equals(nedVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbC = nbh.C("PrefetchItem@");
        sbC.append(super.hashCode());
        sbC.append("{#");
        sbC.append(this.a);
        sbC.append(';');
        Collection collection = this.b;
        sbC.append(collection.size());
        sbC.append(':');
        ww3.y1(collection, sbC, ",", null, 112);
        sbC.append('}');
        return sbC.toString();
    }
}
