package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x35 implements Parcelable {
    public static final Parcelable.Creator<x35> CREATOR = new s9(23);
    public final j45 a;
    public final zrh b;
    public final zrh c;

    public x35(j45 j45Var, zrh zrhVar, zrh zrhVar2) {
        this.a = j45Var;
        this.b = zrhVar;
        this.c = zrhVar2;
    }

    public static x35 a(x35 x35Var, j45 j45Var, zrh zrhVar, zrh zrhVar2, int i) {
        if ((i & 1) != 0) {
            j45Var = x35Var.a;
        }
        if ((i & 2) != 0) {
            zrhVar = x35Var.b;
        }
        if ((i & 4) != 0) {
            zrhVar2 = x35Var.c;
        }
        return new x35(j45Var, zrhVar, zrhVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x35)) {
            return false;
        }
        x35 x35Var = (x35) obj;
        return cqk.d(this.a, x35Var.a) && cqk.d(this.b, x35Var.b) && cqk.d(this.c, x35Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + zo5.c(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DateTime(day=" + this.a + ", hour=" + this.b + ", minutes=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }
}
