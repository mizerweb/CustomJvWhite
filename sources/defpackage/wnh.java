package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class wnh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        return cqk.d(charSequence, "") ? ynh.b : new xnh(charSequence);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new xnh[i];
    }
}
