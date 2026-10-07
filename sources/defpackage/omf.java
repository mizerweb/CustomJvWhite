package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class omf {
    public final int a;
    public final List b;
    public final ArrayList c;
    public final Executor d;
    public final id2 e;
    public final int f;
    public final Map g;

    public omf(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, zm2 zm2Var, int i2, Map map) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = executor;
        this.e = zm2Var;
        this.f = i2;
        this.g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omf)) {
            return false;
        }
        omf omfVar = (omf) obj;
        return this.a == omfVar.a && cqk.d(this.b, omfVar.b) && this.c.equals(omfVar.c) && cqk.d(this.d, omfVar.d) && cqk.d(this.e, omfVar.e) && this.f == omfVar.f && cqk.d(this.g, omfVar.g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return v0h.c(this.g, zo5.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + x05.b(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.a + ", inputConfiguration=" + this.b + ", outputConfigurations=" + this.c + ", executor=" + this.d + ", stateCallback=" + this.e + ", sessionTemplateId=" + this.f + ", sessionParameters=" + this.g + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
