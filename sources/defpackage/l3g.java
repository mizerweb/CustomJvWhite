package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l3g implements vpa {
    public final long a;
    public final String b;
    public final g61 c;
    public final c61 d;
    public final tnh e;
    public final List f;

    public l3g(long j, String str, g61 g61Var, c61 c61Var, tnh tnhVar, List list) {
        this.a = j;
        this.b = str;
        this.c = g61Var;
        this.d = c61Var;
        this.e = tnhVar;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3g)) {
            return false;
        }
        l3g l3gVar = (l3g) obj;
        return this.a == l3gVar.a && cqk.d(this.b, l3gVar.b) && cqk.d(this.c, l3gVar.c) && cqk.d(this.d, l3gVar.d) && this.e.equals(l3gVar.e) && this.f.equals(l3gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + zo5.c(this.e.c, (this.d.hashCode() + ((this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "ShowShareContactForBotConfirmation(messageId=", ", keyboardId=", this.b);
        sbT.append(", buttonPosition=");
        sbT.append(this.c);
        sbT.append(", button=");
        sbT.append(this.d);
        sbT.append(", title=");
        sbT.append(this.e);
        sbT.append(", buttons=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
