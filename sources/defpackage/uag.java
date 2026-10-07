package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class uag {
    public static final vv2 h = new vv2(7);
    public static final vv2 i = new vv2(8);
    public final int a;
    public int e;
    public int f;
    public int g;
    public final tag[] c = new tag[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public uag(int i2) {
        this.a = i2;
    }

    public final void a(int i2, float f) {
        tag tagVar;
        int i3 = this.d;
        ArrayList arrayList = this.b;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i4 = this.g;
        tag[] tagVarArr = this.c;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.g = i5;
            tagVar = tagVarArr[i5];
        } else {
            tagVar = new tag();
        }
        int i6 = this.e;
        this.e = i6 + 1;
        tagVar.a = i6;
        tagVar.b = i2;
        tagVar.c = f;
        arrayList.add(tagVar);
        this.f += i2;
        while (true) {
            int i7 = this.f;
            int i8 = this.a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            tag tagVar2 = (tag) arrayList.get(0);
            int i10 = tagVar2.b;
            if (i10 <= i9) {
                this.f -= i10;
                arrayList.remove(0);
                int i11 = this.g;
                if (i11 < 5) {
                    this.g = i11 + 1;
                    tagVarArr[i11] = tagVar2;
                }
            } else {
                tagVar2.b = i10 - i9;
                this.f -= i9;
            }
        }
    }

    public final float b(float f) {
        int i2 = this.d;
        ArrayList arrayList = this.b;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f2 = f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            tag tagVar = (tag) arrayList.get(i4);
            i3 += tagVar.b;
            if (i3 >= f2) {
                return tagVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((tag) qv1.f(1, arrayList)).c;
    }
}
