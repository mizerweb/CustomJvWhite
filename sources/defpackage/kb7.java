package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a;

/* JADX INFO: loaded from: classes2.dex */
public final class kb7 implements Parcelable {
    public static final Parcelable.Creator<kb7> CREATOR = new uu5(5);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final String m;
    public final int n;
    public final boolean o;

    public kb7(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }

    public final a a(bb7 bb7Var) {
        a aVarA = bb7Var.a(this.a);
        aVarA.e = this.b;
        aVarA.n = this.c;
        aVarA.p = this.d;
        aVarA.q = true;
        aVarA.x = this.e;
        aVarA.y = this.f;
        aVarA.z = this.g;
        aVarA.C = this.h;
        aVarA.l = this.i;
        aVarA.B = this.j;
        aVarA.A = this.k;
        aVarA.n1 = n09.values()[this.l];
        aVarA.h = this.m;
        aVarA.i = this.n;
        aVarA.J = this.o;
        return aVarA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(np0.m);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        String str2 = this.m;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.n);
        }
        if (this.o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public kb7(a aVar) {
        this.a = aVar.getClass().getName();
        this.b = aVar.e;
        this.c = aVar.n;
        this.d = aVar.p;
        this.e = aVar.x;
        this.f = aVar.y;
        this.g = aVar.z;
        this.h = aVar.C;
        this.i = aVar.l;
        this.j = aVar.B;
        this.k = aVar.A;
        this.l = aVar.n1.ordinal();
        this.m = aVar.h;
        this.n = aVar.i;
        this.o = aVar.J;
    }
}
