package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dr7 implements fr7 {
    public final String a;
    public final ynh b;
    public final List c;

    public dr7(String str, ynh ynhVar, List list) {
        this.a = str;
        this.b = ynhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr7)) {
            return false;
        }
        dr7 dr7Var = (dr7) obj;
        return cqk.d(this.a, dr7Var.a) && cqk.d(this.b, dr7Var.b) && cqk.d(this.c, dr7Var.c);
    }

    public final int hashCode() {
        int iH = bc1.h(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iH + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(conversationId=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", avatarInfo=");
        return qv1.n(")", sb, this.c);
    }
}
