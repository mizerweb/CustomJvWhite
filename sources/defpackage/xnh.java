package defpackage;

import android.os.Parcel;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class xnh extends ynh {
    public static final wnh CREATOR = new wnh();
    public final CharSequence c;

    public xnh(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnh) && cqk.d(this.c, ((xnh) obj).c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "SimpleText(text=" + ((Object) this.c) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.c, parcel, i);
    }
}
