package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kvj {
    public final jvj a;
    public final kzi b;
    public final kg8 c;
    public final d d;

    public kvj(jvj jvjVar, kzi kziVar, kg8 kg8Var, d dVar) {
        this.a = jvjVar;
        this.b = kziVar;
        this.c = kg8Var;
        this.d = dVar;
    }

    public final List a() {
        kzi kziVar = this.b;
        List list = kziVar != null ? (List) kziVar.a : null;
        return list == null ? r66.a : list;
    }

    public final d b() {
        return this.d;
    }

    public final kg8 c() {
        return this.c;
    }

    public final String d() {
        kzi kziVar = this.b;
        String str = kziVar != null ? (String) kziVar.b : null;
        return str == null ? "" : str;
    }

    public final jvj e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvj)) {
            return false;
        }
        kvj kvjVar = (kvj) obj;
        return this.a == kvjVar.a && cqk.d(this.b, kvjVar.b) && cqk.d(this.c, kvjVar.c) && cqk.d(this.d, kvjVar.d);
    }

    public final boolean f() {
        return this.a == jvj.f && this.c != null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kzi kziVar = this.b;
        int iHashCode2 = (iHashCode + (kziVar == null ? 0 : kziVar.hashCode())) * 31;
        kg8 kg8Var = this.c;
        int iHashCode3 = (iHashCode2 + (kg8Var == null ? 0 : kg8Var.hashCode())) * 31;
        d dVar = this.d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Content(type=" + this.a + ", textContent=" + this.b + ", keyboard=" + this.c + ", icon=" + this.d + ")";
    }
}
