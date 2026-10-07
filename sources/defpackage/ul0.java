package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ul0 implements Parcelable {
    public static final Parcelable.Creator<ul0> CREATOR = new s9(3);
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public ul0(tl0 tl0Var) {
        int size = tl0Var.a.size();
        this.a = new int[size * 6];
        if (!tl0Var.g) {
            ore.k("Not on back stack");
            throw null;
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            nb7 nb7Var = (nb7) tl0Var.a.get(i2);
            int i3 = i + 1;
            this.a[i] = nb7Var.a;
            ArrayList arrayList = this.b;
            a aVar = nb7Var.b;
            arrayList.add(aVar != null ? aVar.e : null);
            int[] iArr = this.a;
            iArr[i3] = nb7Var.c ? 1 : 0;
            iArr[i + 2] = nb7Var.d;
            iArr[i + 3] = nb7Var.e;
            int i4 = i + 5;
            iArr[i + 4] = nb7Var.f;
            i += 6;
            iArr[i4] = nb7Var.g;
            this.c[i2] = nb7Var.h.ordinal();
            this.d[i2] = nb7Var.i.ordinal();
        }
        this.e = tl0Var.f;
        this.f = tl0Var.h;
        this.g = tl0Var.s;
        this.h = tl0Var.i;
        this.i = tl0Var.j;
        this.j = tl0Var.k;
        this.k = tl0Var.l;
        this.l = tl0Var.m;
        this.m = tl0Var.n;
        this.n = tl0Var.o;
    }

    public final tl0 a(c cVar) {
        tl0 tl0Var = new tl0(cVar);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i2 >= iArr.length) {
                break;
            }
            nb7 nb7Var = new nb7();
            int i4 = i2 + 1;
            nb7Var.a = iArr[i2];
            if (c.K(2)) {
                Log.v("FragmentManager", "Instantiate " + tl0Var + " op #" + i3 + " base fragment #" + iArr[i4]);
            }
            nb7Var.h = n09.values()[this.c[i3]];
            nb7Var.i = n09.values()[this.d[i3]];
            int i5 = i2 + 2;
            if (iArr[i4] == 0) {
                z = false;
            }
            nb7Var.c = z;
            int i6 = iArr[i5];
            nb7Var.d = i6;
            int i7 = iArr[i2 + 3];
            nb7Var.e = i7;
            int i8 = i2 + 5;
            int i9 = iArr[i2 + 4];
            nb7Var.f = i9;
            i2 += 6;
            int i10 = iArr[i8];
            nb7Var.g = i10;
            tl0Var.b = i6;
            tl0Var.c = i7;
            tl0Var.d = i9;
            tl0Var.e = i10;
            tl0Var.b(nb7Var);
            i3++;
        }
        tl0Var.f = this.e;
        tl0Var.h = this.f;
        tl0Var.g = true;
        tl0Var.i = this.h;
        tl0Var.j = this.i;
        tl0Var.k = this.j;
        tl0Var.l = this.k;
        tl0Var.m = this.l;
        tl0Var.n = this.m;
        tl0Var.o = this.n;
        tl0Var.s = this.g;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                tl0Var.c(1);
                return tl0Var;
            }
            String str = (String) arrayList.get(i);
            if (str != null) {
                ((nb7) tl0Var.a.get(i)).b = cVar.c.b(str);
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public ul0(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
