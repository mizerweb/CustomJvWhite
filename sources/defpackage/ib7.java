package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ib7 implements Parcelable {
    public static final Parcelable.Creator<ib7> CREATOR = new uu5(4);
    public ArrayList a;
    public ArrayList b;
    public ul0[] c;
    public int d;
    public String e;
    public final ArrayList f;
    public final ArrayList g;
    public ArrayList h;

    public ib7(Parcel parcel) {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (ul0[]) parcel.createTypedArray(ul0.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(vl0.CREATOR);
        this.h = parcel.createTypedArrayList(db7.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
    }

    public ib7() {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }
}
