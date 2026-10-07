package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g83 {
    public static final g83 d = new g83(0, s66.a);
    public final Map a;
    public final int b;
    public final List c;

    public g83(int i, List list, Map map) {
        this.a = map;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g83)) {
            return false;
        }
        g83 g83Var = (g83) obj;
        return cqk.d(this.a, g83Var.a) && this.b == g83Var.b && cqk.d(this.c, g83Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        if (equals(d)) {
            return g83.class.getSimpleName().concat(".Empty");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g83.class.getSimpleName());
        sb.append("(size=");
        Map map = this.a;
        sb.append(map.size());
        sb.append(",totalUnreadMessagesCount=");
        sb.append(this.b);
        sb.append(",notifications=" + map);
        sb.append(",extraDroppedMessages=");
        sb.append(this.c.size());
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ g83(int i, Map map) {
        this(i, r66.a, map);
    }
}
