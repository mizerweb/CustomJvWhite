package defpackage;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class s9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ s9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new t9(parcel);
            case 1:
                return new jb(parcel.readInt(), parcel.readInt(), parcel.readString());
            case 2:
                ss ssVar = new ss(parcel);
                ssVar.a = parcel.readByte() != 0;
                return ssVar;
            case 3:
                return new ul0(parcel);
            case 4:
                return new vl0(parcel);
            case 5:
                go0 go0Var = new go0();
                go0Var.i = 255;
                go0Var.k = -2;
                go0Var.l = -2;
                go0Var.m = -2;
                go0Var.t = Boolean.TRUE;
                go0Var.a = parcel.readInt();
                go0Var.b = (Integer) parcel.readSerializable();
                go0Var.c = (Integer) parcel.readSerializable();
                go0Var.d = (Integer) parcel.readSerializable();
                go0Var.e = (Integer) parcel.readSerializable();
                go0Var.f = (Integer) parcel.readSerializable();
                go0Var.g = (Integer) parcel.readSerializable();
                go0Var.h = (Integer) parcel.readSerializable();
                go0Var.i = parcel.readInt();
                go0Var.j = parcel.readString();
                go0Var.k = parcel.readInt();
                go0Var.l = parcel.readInt();
                go0Var.m = parcel.readInt();
                go0Var.o = parcel.readString();
                go0Var.p = parcel.readString();
                go0Var.q = parcel.readInt();
                go0Var.s = (Integer) parcel.readSerializable();
                go0Var.u = (Integer) parcel.readSerializable();
                go0Var.v = (Integer) parcel.readSerializable();
                go0Var.w = (Integer) parcel.readSerializable();
                go0Var.x = (Integer) parcel.readSerializable();
                go0Var.y = (Integer) parcel.readSerializable();
                go0Var.z = (Integer) parcel.readSerializable();
                go0Var.C = (Integer) parcel.readSerializable();
                go0Var.A = (Integer) parcel.readSerializable();
                go0Var.B = (Integer) parcel.readSerializable();
                go0Var.t = (Boolean) parcel.readSerializable();
                go0Var.n = (Locale) parcel.readSerializable();
                go0Var.D = (Boolean) parcel.readSerializable();
                return go0Var;
            case 6:
                return qx2.valueOf(parcel.readString());
            case 7:
                return i43.valueOf(parcel.readString());
            case 8:
                return e83.valueOf(parcel.readString());
            case 9:
                return new or3(parcel.readInt(), parcel.readFloat(), parcel.readInt());
            case 10:
                return new gu3(parcel.readInt());
            case 11:
                return new cy3(parcel);
            case 12:
                return new q24(parcel.readLong(), parcel.readLong());
            case 13:
                return new ic4(parcel.readLong(), parcel.readString(), parcel.readString());
            case 14:
                return new kc4(parcel.readInt(), (ynh) parcel.readParcelable(kc4.class.getClassLoader()), tt2.t(parcel.readString()), parcel.readInt() != 0, tt2.s(parcel.readString()), parcel.readInt() != 0 ? tt2.r(parcel.readString()) : 0);
            case 15:
                return new lc4((ynh) parcel.readParcelable(lc4.class.getClassLoader()), parcel.readInt() != 0);
            case 16:
                return new nc4(parcel.readInt(), parcel.createStringArrayList(), tt2.u(parcel.readString()), tt2.v(parcel.readString()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 17:
                return new oc4(parcel.readInt(), tt2.v(parcel.readString()), tt2.u(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 18:
                tx4 tx4Var = (tx4) parcel.readParcelable(zw4.class.getClassLoader());
                nx4 nx4VarCreateFromParcel = nx4.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(kbi.CREATOR.createFromParcel(parcel));
                }
                return new zw4(tx4Var, nx4VarCreateFromParcel, arrayList);
            case 19:
                return new nx4(parcel.createFloatArray(), parcel.readInt() != 0, parcel.readFloat());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new tx4(parcel.readInt(), (RectF) parcel.readParcelable(tx4.class.getClassLoader()), parcel.createFloatArray(), parcel.readFloat());
            case 21:
                return new vx4(parcel);
            case 22:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(parcel.readBundle(lz4.class.getClassLoader()));
                }
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(Long.valueOf(parcel.readLong()));
                }
                return new lz4(arrayList2, arrayList3, arrayList4, parcel.readInt());
            case 23:
                j45 j45VarCreateFromParcel = j45.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<zrh> creator = zrh.CREATOR;
                return new x35(j45VarCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 24:
                return new j45(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), (ynh) parcel.readParcelable(j45.class.getClassLoader()));
            case 25:
                return new ss5(parcel);
            case 26:
                return new qs5(parcel.readLong(), parcel.readLong());
            case 27:
                return new rs5(parcel.readLong(), parcel.readLong());
            case 28:
                return new mu5(parcel);
            default:
                return new wu5(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t9[i];
            case 1:
                return new jb[i];
            case 2:
                return new ss[i];
            case 3:
                return new ul0[i];
            case 4:
                return new vl0[i];
            case 5:
                return new go0[i];
            case 6:
                return new qx2[i];
            case 7:
                return new i43[i];
            case 8:
                return new e83[i];
            case 9:
                return new or3[i];
            case 10:
                return new gu3[i];
            case 11:
                return new cy3[i];
            case 12:
                return new q24[i];
            case 13:
                return new ic4[i];
            case 14:
                return new kc4[i];
            case 15:
                return new lc4[i];
            case 16:
                return new nc4[i];
            case 17:
                return new oc4[i];
            case 18:
                return new zw4[i];
            case 19:
                return new nx4[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new tx4[i];
            case 21:
                return new vx4[i];
            case 22:
                return new lz4[i];
            case 23:
                return new x35[i];
            case 24:
                return new j45[i];
            case 25:
                return new ss5[i];
            case 26:
                return new qs5[i];
            case 27:
                return new rs5[i];
            case 28:
                return new mu5[i];
            default:
                return new wu5[i];
        }
    }
}
