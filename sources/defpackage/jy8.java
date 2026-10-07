package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jy8 implements Parcelable {
    public static final Parcelable.Creator<jy8> CREATOR = new uu5(15);
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final List e;

    public jy8(Parcel parcel) {
        String string = parcel.readString();
        if (string == null) {
            ore.n("Name is null");
        } else if (!string.equals("DRAWING")) {
            ore.p("No enum constant one.me.photoeditor.state.LayerState.Type.".concat(string));
        }
        this.b = 1;
        this.a = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readFloat();
        this.e = parcel.createTypedArrayList(mu5.CREATOR);
    }

    public static AbstractMap.SimpleEntry a(jy8 jy8Var, Rect rect, Rect rect2) {
        int i = jy8Var.b;
        List<mu5> list = jy8Var.e;
        if (qt4.D(i) != 0) {
            return null;
        }
        ArrayList<mu5> arrayList = new ArrayList(list.size());
        for (mu5 mu5Var : list) {
            arrayList.add(new mu5(mu5Var.a, (float[]) mu5Var.b.clone()));
        }
        float fWidth = rect2.width() / rect.width();
        float fHeight = rect2.height() / rect.height();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            float[] fArr = ((mu5) it.next()).b;
            if (fArr != null) {
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (i2 % 2 == 0) {
                        float f = fArr[i2] - rect.left;
                        fArr[i2] = f;
                        float f2 = f * fWidth;
                        fArr[i2] = f2;
                        fArr[i2] = f2 + rect2.left;
                    } else {
                        float f3 = fArr[i2] - rect.top;
                        fArr[i2] = f3;
                        float f4 = f3 * fHeight;
                        fArr[i2] = f4;
                        fArr[i2] = f4 + rect2.top;
                    }
                }
            }
        }
        ju5 ju5Var = new ju5(jy8Var.c, (rect2.width() / rect.width()) * jy8Var.d);
        for (mu5 mu5Var2 : arrayList) {
            float[] fArr2 = mu5Var2.b;
            if (fArr2 != null) {
                int i3 = mu5Var2.a;
                int i4 = i3 == 0 ? -1 : iu5.$EnumSwitchMapping$0[qt4.D(i3)];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            ore.o();
                            return null;
                        }
                        if (fArr2.length >= 6) {
                            ju5Var.a(fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5], false);
                        }
                    } else if (fArr2.length >= 8) {
                        ju5Var.c(fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5], fArr2[6], fArr2[7]);
                    }
                } else if (fArr2.length >= 4) {
                    ju5Var.d(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
                }
            }
        }
        return new AbstractMap.SimpleEntry(Integer.valueOf(jy8Var.a), ju5Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jy8.class != obj.getClass()) {
            return false;
        }
        jy8 jy8Var = (jy8) obj;
        if (this.a != jy8Var.a || this.c != jy8Var.c || Float.compare(jy8Var.d, this.d) != 0 || this.b != jy8Var.b) {
            return false;
        }
        List list = jy8Var.e;
        List list2 = this.e;
        if (list2 != null) {
            return list2.equals(list);
        }
        return list == null;
    }

    public final int hashCode() {
        int i = this.a * 31;
        int i2 = this.b;
        int iD = (((i + (i2 != 0 ? qt4.D(i2) : 0)) * 31) + this.c) * 31;
        float f = this.d;
        int iFloatToIntBits = (iD + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        List list = this.e;
        return iFloatToIntBits + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b != 1) {
            throw null;
        }
        parcel.writeString("DRAWING");
        parcel.writeInt(this.a);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeTypedList(this.e);
    }

    public jy8(int i, int i2, int i3, float f, List list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = list;
    }
}
