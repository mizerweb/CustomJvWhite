package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qoj implements Parcelable {
    public static final Parcelable.Creator<qoj> CREATOR = new c5e(27);
    public final String a;
    public final boolean b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public qoj(String str, boolean z, String str2, int i, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = i;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoj)) {
            return false;
        }
        qoj qojVar = (qoj) obj;
        return cqk.d(this.a, qojVar.a) && this.b == qojVar.b && cqk.d(this.c, qojVar.c) && this.d == qojVar.d && this.e == qojVar.e && this.f == qojVar.f && this.g == qojVar.g;
    }

    public final int hashCode() {
        int iN = nbh.n(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.g) + nbh.n(nbh.n(c0a.f(this.d, (iN + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        StringBuilder sbA = zo5.A("WebAppRootViewStateParc(title=", this.a, ", isVerified=", ", url=", this.b);
        sbA.append(this.c);
        sbA.append(", loadingState=");
        int i = this.d;
        if (i == 1) {
            str = "LOADING";
        } else if (i != 2) {
            str = i != 3 ? "null" : "ERROR";
        } else {
            str = "WEB_VIEW";
        }
        sbA.append(str);
        sbA.append(", showBackButton=");
        qt4.B(", needShowCloseConfirmationDialog=", ", isBrightnessMaximized=", sbA, this.e, this.f);
        return qt4.r(sbA, this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        int i2 = this.d;
        if (i2 == 1) {
            str = "LOADING";
        } else if (i2 == 2) {
            str = "WEB_VIEW";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "ERROR";
        }
        parcel.writeString(str);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
