package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t3f implements Parcelable {
    public static final Parcelable.Creator<t3f> CREATOR = new eu1(4);
    public static final t3f d = new t3f("default", null, 2);
    public static final t3f e = new t3f("", null, 2);
    public final String a;
    public final int b;
    public final ifh c;

    public t3f(String str, int i) {
        this.a = str;
        this.b = i;
        this.c = new ifh(new ap9(24, this));
    }

    public static t3f a(t3f t3fVar, int i, int i2) {
        String str = (i2 & 1) != 0 ? t3fVar.a : "LoginScope";
        if ((i2 & 2) != 0) {
            i = t3fVar.b;
        }
        t3fVar.getClass();
        return new t3f(str, i);
    }

    public final ha9 b() {
        return (ha9) this.c.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3f)) {
            return false;
        }
        t3f t3fVar = (t3f) obj;
        return cqk.d(this.a, t3fVar.a) && this.b == t3fVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return c0a.l(this.b, "ScopeId(value=", this.a, ", rawLocalAccountId=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public t3f(String str, ha9 ha9Var) {
        this(str, ha9Var.a);
    }

    public /* synthetic */ t3f(String str, ha9 ha9Var, int i) {
        this((i & 1) != 0 ? "default" : str, (i & 2) != 0 ? ha9.b : ha9Var);
    }
}
