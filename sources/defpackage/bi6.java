package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bi6 {
    public final ArrayList a;
    public final ww0 b;
    public final id2 c;
    public final int d;
    public final Map e;
    public final Integer f;
    public final ci6 g;
    public final kh h;

    public bi6(ArrayList arrayList, ww0 ww0Var, zm2 zm2Var, int i, Map map, Integer num, ci6 ci6Var, kh khVar) {
        this.a = arrayList;
        this.b = ww0Var;
        this.c = zm2Var;
        this.d = i;
        this.e = map;
        this.f = num;
        this.g = ci6Var;
        this.h = khVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bi6) {
            bi6 bi6Var = (bi6) obj;
            if (this.a.equals(bi6Var.a) && this.b == bi6Var.b && cqk.d(this.c, bi6Var.c) && this.d == bi6Var.d && cqk.d(this.e, bi6Var.e) && this.f.equals(bi6Var.f) && this.g == bi6Var.g && cqk.d(this.h, bi6Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + v0h.c(this.e, zo5.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + x05.b(this.a, Integer.hashCode(2) * 31, 31)) * 31)) * 31, 31), 31)) * 31)) * 31;
        kh khVar = this.h;
        return iHashCode + (khVar == null ? 0 : khVar.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.a + ", executor=" + this.b + ", stateCallback=" + this.c + ", sessionTemplateId=" + this.d + ", sessionParameters=" + this.e + ", extensionMode=" + this.f + ", extensionStateCallback=" + this.g + ", postviewOutputConfiguration=" + this.h + ')';
    }
}
