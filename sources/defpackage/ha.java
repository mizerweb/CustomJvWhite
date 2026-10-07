package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ha implements dg7, Serializable {
    public final Object a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;

    public ha(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.e = false;
        this.f = i;
        this.g = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha)) {
            return false;
        }
        ha haVar = (ha) obj;
        return this.e == haVar.e && this.f == haVar.f && this.g == haVar.g && cqk.d(this.a, haVar.a) && cqk.d(this.b, haVar.b) && this.c.equals(haVar.c) && this.d.equals(haVar.d);
    }

    @Override // defpackage.dg7
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((zo5.d(zo5.d((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        zfe.a.getClass();
        return age.a(this);
    }

    public ha(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, l72.NO_RECEIVER, str, str2);
    }
}
