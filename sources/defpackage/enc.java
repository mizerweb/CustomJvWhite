package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class enc {
    public final tmc a;
    public final Map b;
    public final Map c;
    public final fu1 d;
    public final fu1 e;
    public final Map f;
    public final Map g;
    public final boolean h;

    public enc(tmc tmcVar, Map map, Map map2, fu1 fu1Var, fu1 fu1Var2, Map map3, Map map4, boolean z) {
        this.a = tmcVar;
        this.b = map;
        this.c = map2;
        this.d = fu1Var;
        this.e = fu1Var2;
        this.f = map3;
        this.g = map4;
        this.h = z;
    }

    public final fu1 a() {
        Object next;
        fu1 id;
        Map map = this.f;
        Iterator it = map.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((tmc) next).a.j());
        tmc tmcVar = (tmc) next;
        return (tmcVar == null || (id = tmcVar.a.getId()) == null) ? (fu1) ww3.s1(map.keySet()) : id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enc)) {
            return false;
        }
        enc encVar = (enc) obj;
        return cqk.d(this.a, encVar.a) && cqk.d(this.b, encVar.b) && cqk.d(this.c, encVar.c) && cqk.d(this.d, encVar.d) && cqk.d(this.e, encVar.e) && cqk.d(this.f, encVar.f) && cqk.d(this.g, encVar.g) && this.h == encVar.h;
    }

    public final int hashCode() {
        int iC = v0h.c(this.c, v0h.c(this.b, this.a.hashCode() * 31, 31), 31);
        fu1 fu1Var = this.d;
        int iHashCode = (iC + (fu1Var == null ? 0 : fu1Var.hashCode())) * 31;
        fu1 fu1Var2 = this.e;
        return Boolean.hashCode(this.h) + v0h.c(this.g, v0h.c(this.f, (iHashCode + (fu1Var2 != null ? fu1Var2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "ParticipantsState(me=" + this.a + ", usersInCall=" + this.b + ", participants=" + this.c + ", primarySpeaker=" + this.d + ", opponentSpeaker=" + this.e + ", screenShareSpeakers=" + this.f + ", raisedHands=" + this.g + ", hasAnyEnabledCamera=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ enc(tmc tmcVar) {
        s66 s66Var = s66.a;
        this(tmcVar, s66Var, s66Var, null, null, s66Var, s66Var, false);
    }
}
