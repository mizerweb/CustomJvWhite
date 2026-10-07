package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d5e implements Parcelable {
    public static final Parcelable.Creator<d5e> CREATOR = new c5e(0);
    public final int a;
    public final float b;
    public Object c;

    public d5e(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static d5e a(Parcelable parcelable) {
        d5e d5eVarM;
        if (parcelable == null) {
            return null;
        }
        Rating rating = (Rating) parcelable;
        int ratingStyle = rating.getRatingStyle();
        if (rating.isRated()) {
            switch (ratingStyle) {
                case 1:
                    d5eVarM = h(rating.hasHeart());
                    break;
                case 2:
                    d5eVarM = l(rating.isThumbUp());
                    break;
                case 3:
                case 4:
                case 5:
                    d5eVarM = k(ratingStyle, rating.getStarRating());
                    break;
                case 6:
                    d5eVarM = j(rating.getPercentRating());
                    break;
                default:
                    return null;
            }
        } else {
            d5eVarM = m(ratingStyle);
        }
        d5eVarM.getClass();
        d5eVarM.c = parcelable;
        return d5eVarM;
    }

    public static d5e h(boolean z) {
        return new d5e(1, z ? 1.0f : 0.0f);
    }

    public static d5e j(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new d5e(6, f);
        }
        lvb.k0("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static d5e k(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                lvb.k0("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new d5e(i, f);
        }
        lvb.k0("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static d5e l(boolean z) {
        return new d5e(2, z ? 1.0f : 0.0f);
    }

    public static d5e m(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new d5e(i, -1.0f);
            default:
                return null;
        }
    }

    public final float b() {
        if (this.a == 6 && f()) {
            return this.b;
        }
        return -1.0f;
    }

    public final int c() {
        return this.a;
    }

    public final float d() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && f()) {
            return this.b;
        }
        return -1.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final boolean e() {
        return this.a == 1 && this.b == 1.0f;
    }

    public final boolean f() {
        return this.b >= 0.0f;
    }

    public final boolean g() {
        return this.a == 2 && this.b == 1.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
