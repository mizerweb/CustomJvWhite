package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zui {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final d1e e;
    public final float f;
    public final float g;
    public final boolean h;

    public zui(String str, String str2, String str3, String str4, d1e d1eVar, float f, float f2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d1eVar;
        this.f = f;
        this.g = f2;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zui)) {
            return false;
        }
        zui zuiVar = (zui) obj;
        return cqk.d(this.a, zuiVar.a) && cqk.d(this.b, zuiVar.b) && cqk.d(this.c, zuiVar.c) && cqk.d(this.d, zuiVar.d) && this.e.equals(zuiVar.e) && Float.compare(this.f, zuiVar.f) == 0 && Float.compare(this.g, zuiVar.g) == 0 && this.h == zuiVar.h;
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.h) + nbh.m(nbh.m((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("VideoConversionSpec(sourceUri=", this.a, ", preparedPath=", this.b, ", resultPath=");
        nbh.G(sbQ, this.c, ", srcMimeType=", this.d, ", quality=");
        sbQ.append(this.e);
        sbQ.append(", startPosition=");
        sbQ.append(this.f);
        sbQ.append(", endPosition=");
        sbQ.append(this.g);
        sbQ.append(", mute=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
