package defpackage;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hza {
    public final String a;
    public final String b;
    public final ou4 c;
    public final Set d;
    public final sia[] e;

    public hza(String str, String str2, ou4 ou4Var, Set set, sia[] siaVarArr) {
        this.a = str;
        this.b = str2;
        this.c = ou4Var;
        this.d = set;
        this.e = siaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hza)) {
            return false;
        }
        hza hzaVar = (hza) obj;
        return cqk.d(this.a, hzaVar.a) && cqk.d(this.b, hzaVar.b) && this.c.equals(hzaVar.c) && this.d.equals(hzaVar.d) && Arrays.equals(this.e, hzaVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + nbh.o(this.d, zo5.c(this.c.a, zo5.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
