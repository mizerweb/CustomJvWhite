package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class j45 implements Parcelable {
    public static final Parcelable.Creator<j45> CREATOR = new s9(24);
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final ynh f;

    public j45(long j, int i, int i2, int i3, String str, ynh ynhVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = ynhVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j45)) {
            return false;
        }
        j45 j45Var = (j45) obj;
        return this.a == j45Var.a && this.b == j45Var.b && this.c == j45Var.c && this.d == j45Var.d && cqk.d(this.e, j45Var.e) && cqk.d(this.f, j45Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + zo5.d(zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "Day(id=", ", day=");
        zo5.C(this.c, this.d, ", month=", ", year=", sbQ);
        sbQ.append(", calendarText=");
        sbQ.append(this.e);
        sbQ.append(", buttonText=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
    }
}
