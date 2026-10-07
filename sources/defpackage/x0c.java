package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class x0c implements Parcelable, k79 {
    public static final Parcelable.Creator<x0c> CREATOR = new eu1(3);
    public final String a;
    public final int b;
    public final String c;
    public final CharSequence d;
    public final Integer e;
    public final ynh f;

    public x0c(String str, int i, String str2, CharSequence charSequence, Integer num, ynh ynhVar) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = charSequence;
        this.e = num;
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
        if (!x0c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        x0c x0cVar = (x0c) obj;
        return this.b == x0cVar.b && cqk.d(this.e, x0cVar.e) && cqk.d(this.a, x0cVar.a) && cqk.d(this.c, x0cVar.c) && cqk.d(this.f, x0cVar.f) && String.valueOf(this.d).equals(String.valueOf(x0cVar.d));
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a.hashCode();
    }

    public final int hashCode() {
        int i = this.b * 31;
        Integer num = this.e;
        int iD = zo5.d(zo5.d((i + (num != null ? num.intValue() : 0)) * 31, 31, this.a), 31, this.c);
        ynh ynhVar = this.f;
        return String.valueOf(this.d).hashCode() + ((iD + (ynhVar != null ? ynhVar.hashCode() : 0)) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        TextUtils.writeToParcel(this.d, parcel, i);
        Integer num = this.e;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.f, i);
    }

    public /* synthetic */ x0c(String str, int i, String str2, Spannable spannable) {
        this(str, i, str2, spannable, null, null);
    }
}
