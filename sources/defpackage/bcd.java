package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class bcd extends View.BaseSavedState {
    public static final acd CREATOR = new acd();
    public final int a;
    public final boolean b;

    public bcd(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readByte() > 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public bcd(Parcelable parcelable, int i, boolean z) {
        super(parcelable);
        this.a = i;
        this.b = z;
    }
}
