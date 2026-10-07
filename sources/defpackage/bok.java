package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class bok extends qkk implements xpk {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ wrh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bok(wrh wrhVar) {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate", 4);
        this.d = wrhVar;
    }

    @Override // defpackage.qkk
    public final boolean l0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        int i4 = parcel.readInt();
        duk.b(parcel);
        trh trhVarA = this.d.a(i2, i3, i4);
        parcel2.writeNoException();
        if (trhVarA == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        trhVarA.writeToParcel(parcel2, 1);
        return true;
    }
}
