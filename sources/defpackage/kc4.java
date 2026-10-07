package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kc4 implements Parcelable {
    public static final Parcelable.Creator<kc4> CREATOR = new s9(14);
    public final int a;
    public final ynh b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;

    public /* synthetic */ kc4(int i, ynh ynhVar, int i2, int i3) {
        this(i, ynhVar, i2, (i3 & 8) == 0, (i3 & 16) != 0 ? 2 : 3, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc4)) {
            return false;
        }
        kc4 kc4Var = (kc4) obj;
        return this.a == kc4Var.a && cqk.d(this.b, kc4Var.b) && this.c == kc4Var.c && this.d == kc4Var.d && this.e == kc4Var.e && this.f == kc4Var.f;
    }

    public final int hashCode() {
        int iF = c0a.f(this.e, nbh.n(c0a.f(this.c, bc1.h(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31);
        int i = this.f;
        return iF + (i == 0 ? 0 : qt4.D(i));
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", type=");
        String str3 = "NEGATIVE";
        int i = this.c;
        if (i == 1) {
            str = "NEGATIVE";
        } else if (i == 2) {
            str = "NEUTRAL";
        } else if (i != 3) {
            str = i != 4 ? "null" : "THEMED";
        } else {
            str = "PRIMARY";
        }
        sb.append(str);
        sb.append(", filledButton=");
        sb.append(this.d);
        sb.append(", size=");
        int i2 = this.e;
        if (i2 == 1) {
            str2 = "SMALL";
        } else if (i2 != 2) {
            str2 = i2 != 3 ? "null" : "LARGE";
        } else {
            str2 = "MEDIUM";
        }
        sb.append(str2);
        sb.append(", appearance=");
        int i3 = this.f;
        if (i3 != 1) {
            if (i3 == 2) {
                str3 = "NEUTRAL";
            } else if (i3 != 3) {
                str3 = i3 != 4 ? "null" : "THEMED_ACCENT";
            } else {
                str3 = "NEUTRAL_THEMED";
            }
        }
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        String str3 = "NEGATIVE";
        int i2 = this.c;
        if (i2 == 1) {
            str = "NEGATIVE";
        } else if (i2 == 2) {
            str = "NEUTRAL";
        } else if (i2 == 3) {
            str = "PRIMARY";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "THEMED";
        }
        parcel.writeString(str);
        parcel.writeInt(this.d ? 1 : 0);
        int i3 = this.e;
        if (i3 == 1) {
            str2 = "SMALL";
        } else if (i3 == 2) {
            str2 = "MEDIUM";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "LARGE";
        }
        parcel.writeString(str2);
        int i4 = this.f;
        if (i4 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        if (i4 != 1) {
            if (i4 == 2) {
                str3 = "NEUTRAL";
            } else if (i4 == 3) {
                str3 = "NEUTRAL_THEMED";
            } else {
                if (i4 != 4) {
                    throw null;
                }
                str3 = "THEMED_ACCENT";
            }
        }
        parcel.writeString(str3);
    }

    public kc4(int i, ynh ynhVar, int i2, boolean z, int i3, int i4) {
        this.a = i;
        this.b = ynhVar;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
    }
}
