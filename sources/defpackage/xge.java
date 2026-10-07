package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class xge implements Parcelable {
    public static final Parcelable.Creator<xge> CREATOR = new c5e(1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public xge(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    public static xge a(xge xgeVar, Long l) {
        String str = xgeVar.a;
        String str2 = xgeVar.b;
        String str3 = xgeVar.c;
        String str4 = xgeVar.d;
        xgeVar.getClass();
        return new xge(str, str2, str3, str4, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xge)) {
            return false;
        }
        xge xgeVar = (xge) obj;
        return cqk.d(this.a, xgeVar.a) && cqk.d(this.b, xgeVar.b) && cqk.d(this.c, xgeVar.c) && cqk.d(this.d, xgeVar.d) && cqk.d(this.e, xgeVar.e);
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return iD + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("RegistrationData(token=", this.a, ", phone=", this.b, ", name=");
        nbh.G(sbQ, this.c, ", surname=", this.d, ", photoId=");
        sbQ.append(this.e);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Long l = this.e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }
}
