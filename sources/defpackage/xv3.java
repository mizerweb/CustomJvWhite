package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xv3 {
    public static final /* synthetic */ zv8[] o;
    public final Context a;
    public final ViewGroup b;
    public final ny8 c;
    public int d;
    public int e;
    public boolean f;
    public final n11 g;
    public final zb h;
    public final mw i;
    public cf7 j;
    public float[] k;
    public uik l;
    public final int m;
    public final ArrayList n;

    static {
        z8b z8bVar = new z8b(xv3.class, "imageAttaches", "getImageAttaches()Ljava/util/List;");
        zfe.a.getClass();
        o = new zv8[]{z8bVar};
    }

    public xv3(ny8 ny8Var, Context context, ViewGroup viewGroup) {
        this.a = context;
        this.b = viewGroup;
        this.c = ny8Var;
        n11 n11Var = new n11(10);
        n11Var.b = false;
        n11Var.c = new ArrayList();
        this.g = n11Var;
        this.h = new zb(this);
        this.i = new mw(0);
        int i = 7;
        this.j = new w83(i);
        this.k = zl2.a;
        this.l = new uik(i, r66.a);
        this.m = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
        this.n = new ArrayList();
        viewGroup.addOnAttachStateChangeListener(new vn2(1, this));
    }

    public static final void a(xv3 xv3Var, h58 h58Var, jv3 jv3Var, int i) {
        hv3 hv3Var = jv3Var.b;
        ev3 ev3Var = ev3.a;
        if (!cqk.d(hv3Var, ev3Var)) {
            n(h58Var, jv3Var, ev3Var);
        }
        ((v50) ((ny8) jv3Var.c.b).getValue()).setLevel(i);
    }

    public static int h(int i) {
        return (int) Math.rint(i * 0.4f);
    }

    public static void i(Drawable drawable, Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int intrinsicWidth = rect.right - i;
        int intrinsicHeight = rect.bottom - i2;
        int i3 = (intrinsicWidth / 2) + i;
        int i4 = (intrinsicHeight / 2) + i2;
        if (drawable.getIntrinsicWidth() > 0) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        int i5 = intrinsicWidth / 2;
        int i6 = intrinsicHeight / 2;
        drawable.setBounds(i3 - i5, i4 - i6, i3 + i5, i4 + i6);
    }

    public static void n(h58 h58Var, jv3 jv3Var, hv3 hv3Var) {
        Drawable drawableB;
        if (!(jv3Var.b instanceof bv3) || (hv3Var instanceof av3)) {
            jv3Var.b = hv3Var;
            du5 du5Var = h58Var.d;
            du5Var.getClass();
            ((wj7) du5Var).k(jv3Var.b());
            Rect rect = jv3Var.e;
            if (rect.isEmpty() || (drawableB = jv3Var.b()) == null) {
                return;
            }
            i(drawableB, rect);
        }
    }

    public final void b() {
        n11 n11Var = this.g;
        n11Var.l();
        mw mwVar = this.i;
        Iterator it = ((kw) mwVar.values()).iterator();
        while (it.hasNext()) {
            ((jv3) it.next()).a();
        }
        mwVar.clear();
        ArrayList arrayList = (ArrayList) n11Var.c;
        if (n11Var.b) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((eu5) arrayList.get(i)).g();
            }
        }
        arrayList.clear();
    }

    public final yu3 c(int i, int i2) {
        ote oteVarD;
        int length = this.k.length;
        for (int i3 = 0; i3 < length; i3++) {
            eu5 eu5VarB = this.g.b(i3);
            h58 h58Var = eu5VarB instanceof h58 ? (h58) eu5VarB : null;
            if (h58Var != null && (oteVarD = h58Var.d()) != null && oteVarD.getBounds().contains(i, i2)) {
                zv8 zv8Var = o[0];
                yu3 yu3Var = (yu3) ww3.u1(i3, (List) this.h.b);
                if (yu3Var == null) {
                    break;
                }
                return yu3Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
    
        if (r2.f != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        return defpackage.ev3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        if (r2.f != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gv3 d(defpackage.yu3 r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.g58
            r1 = 0
            if (r0 == 0) goto L13
            g58 r3 = (defpackage.g58) r3
            boolean r3 = r3.g
            if (r3 == 0) goto Le
            fv3 r2 = defpackage.fv3.a
            return r2
        Le:
            boolean r2 = r2.f
            if (r2 == 0) goto L1e
            goto L1b
        L13:
            boolean r3 = r3 instanceof defpackage.fti
            if (r3 == 0) goto L1f
            boolean r2 = r2.f
            if (r2 == 0) goto L1e
        L1b:
            ev3 r2 = defpackage.ev3.a
            return r2
        L1e:
            return r1
        L1f:
            defpackage.ore.o()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv3.d(yu3):gv3");
    }

    public final boolean e(MotionEvent motionEvent) {
        jv3 jv3Var;
        Drawable drawableB;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
            int length = this.k.length;
            for (int i = 0; i < length; i++) {
                eu5 eu5VarB = this.g.b(i);
                h58 h58Var = eu5VarB instanceof h58 ? (h58) eu5VarB : null;
                if (h58Var != null && (jv3Var = (jv3) this.i.get(h58Var)) != null && (drawableB = jv3Var.b()) != null) {
                    if (drawableB.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        hv3 hv3Var = jv3Var.b;
                        if (!(hv3Var instanceof bv3)) {
                            if (!(hv3Var instanceof ev3)) {
                                if (!(hv3Var instanceof fv3)) {
                                    break;
                                }
                                m(h58Var, jv3Var.a, true);
                                return true;
                            }
                            jv3Var.a();
                            n(h58Var, jv3Var, fv3.a);
                            return true;
                        }
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final List f(int i, int i2, int i3) {
        ote oteVarD;
        jv3 jv3Var;
        jv3 jv3Var2;
        List list;
        jv3 jv3Var3;
        boolean zX = ((f5d) ((wo6) this.c.getValue())).x();
        ArrayList arrayList = this.n;
        int i4 = 0;
        n11 n11Var = this.g;
        int i5 = this.m;
        mw mwVar = this.i;
        if (!zX) {
            arrayList.clear();
            int length = this.k.length;
            int i6 = i;
            int i7 = i2;
            for (int i8 = 0; i8 < length; i8++) {
                eu5 eu5VarB = n11Var.b(i8);
                h58 h58Var = eu5VarB instanceof h58 ? (h58) eu5VarB : null;
                if (h58Var != null && (oteVarD = h58Var.d()) != null && (jv3Var = (jv3) mwVar.get(h58Var)) != null) {
                    Rect rect = jv3Var.e;
                    if (h58Var.g + i6 > i + this.d) {
                        i7 += ((h58) n11Var.b(i8 - 1)).h + i5;
                        i6 = i;
                    }
                    int i9 = h58Var.g + i6;
                    int i10 = h58Var.h + i7;
                    rect.set(i6, i7, i9, i10);
                    oteVarD.setBounds(i6, i7, i9, i10);
                    Drawable drawableB = jv3Var.b();
                    if (drawableB != null) {
                        i(drawableB, rect);
                    }
                    i6 += h58Var.g + i5;
                    arrayList.add(rect);
                }
            }
            return arrayList;
        }
        arrayList.clear();
        if (((List) this.l.b).size() == 2) {
            int length2 = this.k.length;
            int i11 = i;
            int i12 = i2;
            for (int i13 = 0; i13 < length2; i13++) {
                eu5 eu5VarB2 = n11Var.b(i13);
                h58 h58Var2 = eu5VarB2 instanceof h58 ? (h58) eu5VarB2 : null;
                if (h58Var2 != null && (jv3Var3 = (jv3) mwVar.get(h58Var2)) != null) {
                    Rect rect2 = jv3Var3.e;
                    ote oteVarD2 = h58Var2.d();
                    if (oteVarD2 != null) {
                        if (i13 > 0) {
                            i11 = i + ((h58) n11Var.b(0)).g + i5;
                        }
                        if (i13 == 1) {
                            i12 = i2;
                        } else if (i13 == 2) {
                            i12 = i2 + ((h58) n11Var.b(1)).h + i5;
                        }
                        int i14 = h58Var2.g + i11;
                        int i15 = h58Var2.h + i12;
                        oteVarD2.setBounds(i11, i12, i14, i15);
                        rect2.set(i11, i12, i14, i15);
                        Drawable drawableB2 = jv3Var3.b();
                        if (drawableB2 != null) {
                            i(drawableB2, rect2);
                        }
                        arrayList.add(rect2);
                    }
                }
            }
        } else {
            zu3 zu3Var = (zu3) ww3.t1((List) this.l.b);
            if (zu3Var == null) {
                return r66.a;
            }
            List list2 = zu3Var.a;
            int size = list2.size();
            int i16 = i;
            int i17 = i2;
            int i18 = i3;
            int i19 = 0;
            int i20 = 0;
            while (i19 < size) {
                mv3 mv3Var = (mv3) list2.get(i19);
                if (mv3Var instanceof lv3) {
                    int length3 = mv3Var.a.length;
                    for (int i21 = i4; i21 < length3; i21++) {
                        eu5 eu5VarB3 = n11Var.b(i21);
                        h58 h58Var3 = eu5VarB3 instanceof h58 ? (h58) eu5VarB3 : null;
                        if (h58Var3 != null && (jv3Var2 = (jv3) mwVar.get(h58Var3)) != null) {
                            Rect rect3 = jv3Var2.e;
                            ote oteVarD3 = h58Var3.d();
                            if (oteVarD3 != null) {
                                if (i21 > 0) {
                                    i17 = i17 + ((h58) n11Var.b(i4)).h + i5;
                                }
                                int i22 = h58Var3.g + i16;
                                int i23 = h58Var3.h + i17;
                                oteVarD3.setBounds(i16, i17, i22, i23);
                                rect3.set(i16, i17, i22, i23);
                                Drawable drawableB3 = jv3Var2.b();
                                if (drawableB3 != null) {
                                    i(drawableB3, rect3);
                                }
                                arrayList.add(rect3);
                            }
                        }
                    }
                    break;
                }
                if (mv3Var instanceof kv3) {
                    i17 = i19 == 0 ? i2 : i18 + i5;
                    int i24 = i4;
                    while (i24 < mv3Var.a.length) {
                        eu5 eu5VarB4 = n11Var.b(i20);
                        h58 h58Var4 = eu5VarB4 instanceof h58 ? (h58) eu5VarB4 : null;
                        if (h58Var4 != null) {
                            jv3 jv3Var4 = (jv3) mwVar.get(h58Var4);
                            if (jv3Var4 != null) {
                                Rect rect4 = jv3Var4.e;
                                list = list2;
                                ote oteVarD4 = h58Var4.d();
                                if (oteVarD4 != null) {
                                    i16 = i24 == 0 ? i : i16 + ((h58) n11Var.b(i20 - 1)).g + i5;
                                    int i25 = h58Var4.g + i16;
                                    int i26 = h58Var4.h + i17;
                                    oteVarD4.setBounds(i16, i17, i25, i26);
                                    rect4.set(i16, i17, i25, i26);
                                    Drawable drawableB4 = jv3Var4.b();
                                    if (drawableB4 != null) {
                                        i(drawableB4, rect4);
                                    }
                                    arrayList.add(rect4);
                                    i18 = i26;
                                }
                            }
                        } else {
                            list = list2;
                        }
                        i24++;
                        i20++;
                        list2 = list;
                    }
                }
                i19++;
                list2 = list2;
                i4 = 0;
            }
        }
        return arrayList;
    }

    public final void g(int i) {
        int i2;
        String str;
        int iH;
        int i3;
        int i4;
        n11 n11Var;
        float f;
        boolean zX = ((f5d) ((wo6) this.c.getValue())).x();
        float[] fArr = this.k;
        float f2 = 1.0f;
        int i5 = 1;
        int i6 = 0;
        n11 n11Var2 = this.g;
        int i7 = this.m;
        if (!zX) {
            int i8 = 1;
            if (fArr.length != 0 && ((ArrayList) n11Var2.c).size() > 0) {
                this.e = 0;
                float[] fArr2 = this.k;
                String str2 = "Array is empty.";
                if (fArr2.length == 0) {
                    ore.f("Array is empty.");
                    return;
                }
                float f3 = i;
                double d = 0.45f * f3;
                double d2 = f3 * 0.6f;
                int iV = oc9.v((int) Math.rint(((int) Math.rint(d)) / fArr2[0]), (int) Math.rint(d), (int) Math.rint(d2));
                int length = this.k.length;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < length) {
                    float f4 = f2;
                    eu5 eu5VarB = n11Var2.b(i9);
                    h58 h58Var = eu5VarB instanceof h58 ? (h58) eu5VarB : null;
                    if (h58Var == null) {
                        i2 = length;
                        str = str2;
                        i3 = i8;
                    } else {
                        float f5 = iV;
                        int iRint = iV;
                        i2 = length;
                        int iRint2 = (int) Math.rint(this.k[i9] * f5);
                        float[] fArr3 = this.k;
                        str = str2;
                        if (fArr3.length == 0) {
                            ore.f(str);
                            return;
                        }
                        int i12 = 0;
                        int i13 = (fArr3[0] <= f4 || i9 != 0) ? 0 : i8;
                        int i14 = i9 == fArr3.length + (-1) ? i8 : 0;
                        int i15 = (i9 >= fArr3.length + (-1) || Float.compare(fArr3[i9], fArr3[i9 + 1]) != 0) ? 0 : i8;
                        if (i13 != 0 || i14 != 0) {
                            iRint = (i13 == 0 || this.k.length <= 3) ? iRint : (int) Math.rint(d2);
                            iH = i - i10;
                            i3 = 1;
                            i12 = 1;
                        } else if (i15 == 0 || i11 != 0) {
                            if (i11 == i8) {
                                iH = i - i10;
                            } else {
                                int i16 = i - i10;
                                if (i16 - iRint2 < h(i)) {
                                    if (i16 - h(i) < h(i)) {
                                        iH = i16;
                                    } else {
                                        iH = i16 - h(i);
                                    }
                                    i3 = 1;
                                } else {
                                    iH = iRint2 < h(i) ? h(i) : (int) Math.rint(f5 * this.k[i9]);
                                }
                            }
                            i3 = 1;
                        } else {
                            iH = i / 2;
                            i3 = i8;
                            i12 = 0;
                            iRint = iRint;
                        }
                        if (i11 == i3 && i12 == 0) {
                            i12 = i3;
                        }
                        h58Var.h = iRint;
                        h58Var.g = iH;
                        i11++;
                        int i17 = iH + i7 + i10;
                        if (i12 != 0) {
                            this.e = iRint + i7 + this.e;
                            iV = oc9.v((int) Math.rint(((int) Math.rint(d)) / this.k[i9]), (int) Math.rint(d), (int) Math.rint(d2));
                            i10 = 0;
                            i11 = 0;
                        } else {
                            i10 = i17;
                            iV = iRint;
                        }
                    }
                    i9++;
                    i8 = i3;
                    f2 = f4;
                    length = i2;
                    str2 = str;
                }
                this.e -= i7;
                this.d = i;
                return;
            }
            return;
        }
        if (fArr.length != 0 && ((ArrayList) n11Var2.c).size() > 0) {
            this.e = 0;
            int size = ((List) this.l.b).size();
            uik uikVar = this.l;
            if (size == 2) {
                float[] fArr4 = ((mv3) ww3.r1(((zu3) ((List) uikVar.b).get(1)).a)).a;
                if (fArr4.length != 2) {
                    f = 0.0f;
                    break;
                }
                int length2 = fArr4.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length2) {
                        f = 0.375f;
                        break;
                    }
                    if (fArr4[i18] != 0.75f) {
                        int length3 = fArr4.length;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= length3) {
                                f = 0.8888889f;
                                break;
                            }
                            if (fArr4[i19] != 1.7777778f) {
                                int length4 = fArr4.length;
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= length4) {
                                        f = 0.5f;
                                        break;
                                    }
                                    if (fArr4[i20] != 1.0f) {
                                        int length5 = fArr4.length;
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < length5) {
                                                if (fArr4[i21] == 0.75f) {
                                                    int length6 = fArr4.length;
                                                    int i22 = 0;
                                                    while (true) {
                                                        if (i22 < length6) {
                                                            if (fArr4[i22] == 1.7777778f) {
                                                                f = 0.52747256f;
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                    }
                                                } else {
                                                    i21++;
                                                }
                                            }
                                            int length7 = fArr4.length;
                                            int i23 = 0;
                                            while (true) {
                                                if (i23 < length7) {
                                                    if (fArr4[i23] == 0.75f) {
                                                        int length8 = fArr4.length;
                                                        int i24 = 0;
                                                        while (true) {
                                                            if (i24 < length8) {
                                                                if (fArr4[i24] == 1.0f) {
                                                                    f = 0.42857143f;
                                                                    break;
                                                                }
                                                                i24++;
                                                            }
                                                        }
                                                    } else {
                                                        i23++;
                                                    }
                                                }
                                                int length9 = fArr4.length;
                                                int i25 = 0;
                                                while (true) {
                                                    if (i25 < length9) {
                                                        if (fArr4[i25] == 1.7777778f) {
                                                            int length10 = fArr4.length;
                                                            int i26 = 0;
                                                            while (true) {
                                                                if (i26 < length10) {
                                                                    if (fArr4[i26] == 1.0f) {
                                                                        f = 0.64f;
                                                                        break;
                                                                    }
                                                                    i26++;
                                                                }
                                                            }
                                                        } else {
                                                            i25++;
                                                        }
                                                    }
                                                    f = 0.0f;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    i20++;
                                }
                            } else {
                                i19++;
                            }
                        }
                    } else {
                        i18++;
                    }
                }
                int iRint3 = (int) Math.rint((i - i7) / (f + 0.75f));
                float f6 = iRint3;
                int iRint4 = (int) Math.rint(0.75f * f6);
                int iRint5 = (int) Math.rint(f6 * f);
                int length11 = this.k.length;
                while (i6 < length11) {
                    eu5 eu5VarB2 = n11Var2.b(i6);
                    h58 h58Var2 = eu5VarB2 instanceof h58 ? (h58) eu5VarB2 : null;
                    if (h58Var2 != null) {
                        h58Var2.g = i6 == 0 ? iRint4 : iRint5;
                        h58Var2.h = i6 == 0 ? iRint3 : (int) Math.rint(iRint5 / this.k[i6]);
                    }
                    i6++;
                }
                this.e = iRint3;
                this.d = i;
                return;
            }
            zu3 zu3Var = (zu3) ww3.t1((List) uikVar.b);
            if (zu3Var != null) {
                List list = zu3Var.a;
                int size2 = list.size();
                int i27 = 0;
                int i28 = 0;
                while (i27 < size2) {
                    mv3 mv3Var = (mv3) list.get(i27);
                    if (mv3Var instanceof lv3) {
                        while (true) {
                            float[] fArr5 = mv3Var.a;
                            if (i6 >= fArr5.length) {
                                this.d = i;
                                this.e += i7;
                                return;
                            }
                            float f7 = fArr5[i6];
                            eu5 eu5VarB3 = n11Var2.b(i6);
                            h58 h58Var3 = eu5VarB3 instanceof h58 ? (h58) eu5VarB3 : null;
                            if (h58Var3 != null) {
                                h58Var3.g = i;
                                int iRint6 = (int) Math.rint(i / f7);
                                h58Var3.h = iRint6;
                                this.e += iRint6;
                            }
                            i6++;
                        }
                    } else {
                        if (mv3Var instanceof kv3) {
                            float[] fArr6 = mv3Var.a;
                            float length12 = i - ((fArr6.length - i5) * i7);
                            int length13 = fArr6.length;
                            float f8 = 0.0f;
                            for (int i29 = i6; i29 < length13; i29++) {
                                f8 += fArr6[i29];
                            }
                            int iRint7 = (int) Math.rint(length12 / f8);
                            this.e += iRint7;
                            int i30 = i6;
                            int i31 = i30;
                            while (i30 < fArr6.length) {
                                float f9 = fArr6[i30];
                                eu5 eu5VarB4 = n11Var2.b(i28);
                                int i32 = i5;
                                h58 h58Var4 = eu5VarB4 instanceof h58 ? (h58) eu5VarB4 : null;
                                if (h58Var4 != null) {
                                    int iRint8 = (int) Math.rint(iRint7 * f9);
                                    h58Var4.g = iRint8;
                                    h58Var4.h = iRint7;
                                    i31 += iRint8 + (i30 != fArr6.length + (-1) ? i7 : 0);
                                }
                                i30++;
                                i28++;
                                i5 = i32;
                                n11Var2 = n11Var2;
                            }
                            i4 = i5;
                            n11 n11Var3 = n11Var2;
                            if (i31 != i) {
                                int i33 = i28 - 1;
                                if (i31 > i) {
                                    int i34 = i31 - i;
                                    if (i34 % fArr6.length == 0) {
                                        int i35 = 0;
                                        while (i35 < fArr6.length) {
                                            n11 n11Var4 = n11Var3;
                                            eu5 eu5VarB5 = n11Var4.b(i33 - i35);
                                            h58 h58Var5 = eu5VarB5 instanceof h58 ? (h58) eu5VarB5 : null;
                                            if (h58Var5 != null) {
                                                h58Var5.g -= i34 / fArr6.length;
                                            }
                                            i35++;
                                            n11Var3 = n11Var4;
                                        }
                                        n11Var = n11Var3;
                                    } else {
                                        n11Var = n11Var3;
                                        eu5 eu5VarB6 = n11Var.b(i33);
                                        h58 h58Var6 = eu5VarB6 instanceof h58 ? (h58) eu5VarB6 : null;
                                        if (h58Var6 != null) {
                                            h58Var6.g -= i34;
                                        }
                                    }
                                } else {
                                    n11Var = n11Var3;
                                    int i36 = i - i31;
                                    if (i36 % fArr6.length == 0) {
                                        for (int i37 = 0; i37 < fArr6.length; i37++) {
                                            eu5 eu5VarB7 = n11Var.b(i33 - i37);
                                            h58 h58Var7 = eu5VarB7 instanceof h58 ? (h58) eu5VarB7 : null;
                                            if (h58Var7 != null) {
                                                h58Var7.g = (i36 / fArr6.length) + h58Var7.g;
                                            }
                                        }
                                    } else {
                                        eu5 eu5VarB8 = n11Var.b(i33);
                                        h58 h58Var8 = eu5VarB8 instanceof h58 ? (h58) eu5VarB8 : null;
                                        if (h58Var8 != null) {
                                            h58Var8.g += i36;
                                        }
                                    }
                                }
                            } else {
                                n11Var = n11Var3;
                            }
                        } else {
                            i4 = i5;
                            n11Var = n11Var2;
                        }
                        i27++;
                        n11Var2 = n11Var;
                        i5 = i4;
                        i6 = 0;
                    }
                }
                this.d = i;
                int i38 = this.e;
                zu3 zu3Var2 = (zu3) ww3.t1((List) this.l.b);
                this.e = i38 + (zu3Var2 != null ? zu3Var2.a.size() - 1 : 0);
            }
        }
    }

    public final void j(float[] fArr, ArrayList arrayList) {
        uik uikVar;
        uik uikVar2;
        if (((f5d) ((wo6) this.c.getValue())).x()) {
            int i = 7;
            if (fArr.length == 0) {
                uikVar = new uik(i, r66.a);
            } else {
                int length = fArr.length;
                if (length == 1) {
                    uikVar = new uik(i, Collections.singletonList(new zu3(zl2.a(fArr, false))));
                } else if (length == 2) {
                    float f = fArr[0];
                    if (f == 1.7777778f) {
                        float f2 = fArr[1];
                        if (f2 == 1.7777778f) {
                            uikVar2 = new uik(i, Collections.singletonList(new zu3(Collections.singletonList(new lv3(new float[]{f, f2})))));
                            uikVar = uikVar2;
                        }
                    }
                    uikVar = new uik(i, Collections.singletonList(new zu3(zl2.a(fArr, false))));
                } else if (length == 3) {
                    float f3 = fArr[0];
                    if (f3 == 1.7777778f || f3 == 1.0f) {
                        uikVar = new uik(i, Collections.singletonList(new zu3(zl2.a(fArr, true))));
                    } else {
                        uikVar2 = new uik(i, xw3.P0(new zu3(Collections.singletonList(new lv3(new float[]{f3}))), new zu3(Collections.singletonList(new lv3(new float[]{fArr[1], fArr[2]})))));
                        uikVar = uikVar2;
                    }
                } else if (length == 4 || length == 5) {
                    uikVar = new uik(i, Collections.singletonList(new zu3(zl2.a(fArr, fArr[0] == 1.7777778f))));
                } else if (length != 7) {
                    uikVar = new uik(i, Collections.singletonList(new zu3(zl2.a(fArr, fArr[0] == 1.7777778f && fArr[1] == 1.7777778f && fArr[2] == 1.7777778f))));
                } else {
                    uikVar = new uik(i, Collections.singletonList(new zu3(zl2.a(fArr, fArr[0] == 1.7777778f && fArr[1] == 1.7777778f && fArr[2] == 1.7777778f && fArr[3] == 1.7777778f))));
                }
            }
            this.l = uikVar;
        }
        this.k = fArr;
        this.h.B(this, o[0], arrayList);
    }

    public final void k(int i, int i2, int[] iArr) {
        jv3 jv3Var;
        Drawable drawableB;
        int length = this.k.length;
        for (int i3 = 0; i3 < length; i3++) {
            eu5 eu5VarB = this.g.b(i3);
            h58 h58Var = eu5VarB instanceof h58 ? (h58) eu5VarB : null;
            if (h58Var != null && (jv3Var = (jv3) this.i.get(h58Var)) != null && (drawableB = jv3Var.b()) != null && h58Var.d() != null && drawableB.getBounds().contains(i, i2)) {
                drawableB.setHotspot(drawableB.getBounds().centerX(), drawableB.getBounds().centerY());
                drawableB.setState(iArr);
                return;
            }
        }
    }

    public final void l(String str, boolean z, Float f) {
        jw jwVar;
        mw mwVar = this.i;
        Iterator it = ((gw) mwVar.entrySet()).iterator();
        do {
            jwVar = (jw) it;
            if (!jwVar.hasNext()) {
                jwVar = null;
                break;
            }
            jwVar.next();
        } while (!cqk.d(((jv3) jwVar.getValue()).a.k(), str));
        jw jwVar2 = jwVar;
        h58 h58Var = jwVar2 != null ? (h58) jwVar2.getKey() : null;
        if (h58Var == null) {
            gm0.Y(xv3.class.getName(), "Early return in setUploading cuz of findHolderByAttachId(attachId) is null");
            return;
        }
        jv3 jv3Var = (jv3) mwVar.get(h58Var);
        if (jv3Var == null) {
            gm0.Y(xv3.class.getName(), "Early return in setUploading cuz of collageImageState[holder] is null");
            return;
        }
        kr6 kr6Var = jv3Var.c;
        if (!z) {
            ((v50) ((ny8) kr6Var.b).getValue()).setLevel(0);
            n(h58Var, jv3Var, av3.a);
            return;
        }
        if (!(jv3Var.b instanceof cv3)) {
            n(h58Var, jv3Var, bv3.a);
        }
        int iK = gm0.K(f.floatValue() * 10000.0f);
        if (f.floatValue() >= ((v50) ((ny8) kr6Var.b).getValue()).getLevel()) {
            ((v50) ((ny8) kr6Var.b).getValue()).setLevel(iK);
        }
    }

    public final void m(h58 h58Var, yu3 yu3Var, boolean z) {
        Uri uri;
        v78 v78VarA;
        Uri uri2;
        bne bneVar;
        mw mwVar = this.i;
        jv3 jv3Var = (jv3) mwVar.get(h58Var);
        final int i = 1;
        if (jv3Var == null) {
            gv3 gv3VarD = d(yu3Var);
            kr6 kr6Var = new kr6();
            final int i2 = 0;
            final ViewGroup viewGroup = this.b;
            kr6Var.a = rx8.P(3, new af7() { // from class: iv3
                @Override // defpackage.af7
                public final Object invoke() {
                    int i3 = i2;
                    ViewGroup viewGroup2 = viewGroup;
                    switch (i3) {
                        case 0:
                            o2d o2dVar = new o2d(viewGroup2.getContext());
                            o2dVar.a();
                            return o2dVar;
                        case 1:
                            Drawable drawable = viewGroup2.getContext().getDrawable(R.drawable.icon_cross);
                            v50 v50Var = new v50();
                            if (drawable != null) {
                                v50Var.a = drawable;
                                v50Var.invalidateSelf();
                            }
                            v50Var.c = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
                            v50Var.b = true;
                            v50Var.invalidateSelf();
                            v50Var.b();
                            a8g a8gVar = pq3.j;
                            a8gVar.h(viewGroup2);
                            v50Var.setTint(-1);
                            a8gVar.h(viewGroup2);
                            v50Var.c(-1);
                            v50Var.q = Integer.valueOf(a8gVar.h(viewGroup2).h().i);
                            v50Var.invalidateSelf();
                            v50Var.r = 2;
                            v50Var.invalidateSelf();
                            v50Var.setLevel(0);
                            return v50Var;
                        default:
                            return new o2d(viewGroup2.getContext());
                    }
                }
            });
            kr6Var.b = rx8.P(3, new af7() { // from class: iv3
                @Override // defpackage.af7
                public final Object invoke() {
                    int i3 = i;
                    ViewGroup viewGroup2 = viewGroup;
                    switch (i3) {
                        case 0:
                            o2d o2dVar = new o2d(viewGroup2.getContext());
                            o2dVar.a();
                            return o2dVar;
                        case 1:
                            Drawable drawable = viewGroup2.getContext().getDrawable(R.drawable.icon_cross);
                            v50 v50Var = new v50();
                            if (drawable != null) {
                                v50Var.a = drawable;
                                v50Var.invalidateSelf();
                            }
                            v50Var.c = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
                            v50Var.b = true;
                            v50Var.invalidateSelf();
                            v50Var.b();
                            a8g a8gVar = pq3.j;
                            a8gVar.h(viewGroup2);
                            v50Var.setTint(-1);
                            a8gVar.h(viewGroup2);
                            v50Var.c(-1);
                            v50Var.q = Integer.valueOf(a8gVar.h(viewGroup2).h().i);
                            v50Var.invalidateSelf();
                            v50Var.r = 2;
                            v50Var.invalidateSelf();
                            v50Var.setLevel(0);
                            return v50Var;
                        default:
                            return new o2d(viewGroup2.getContext());
                    }
                }
            });
            final int i3 = 2;
            kr6Var.c = rx8.P(3, new af7() { // from class: iv3
                @Override // defpackage.af7
                public final Object invoke() {
                    int i4 = i3;
                    ViewGroup viewGroup2 = viewGroup;
                    switch (i4) {
                        case 0:
                            o2d o2dVar = new o2d(viewGroup2.getContext());
                            o2dVar.a();
                            return o2dVar;
                        case 1:
                            Drawable drawable = viewGroup2.getContext().getDrawable(R.drawable.icon_cross);
                            v50 v50Var = new v50();
                            if (drawable != null) {
                                v50Var.a = drawable;
                                v50Var.invalidateSelf();
                            }
                            v50Var.c = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
                            v50Var.b = true;
                            v50Var.invalidateSelf();
                            v50Var.b();
                            a8g a8gVar = pq3.j;
                            a8gVar.h(viewGroup2);
                            v50Var.setTint(-1);
                            a8gVar.h(viewGroup2);
                            v50Var.c(-1);
                            v50Var.q = Integer.valueOf(a8gVar.h(viewGroup2).h().i);
                            v50Var.invalidateSelf();
                            v50Var.r = 2;
                            v50Var.invalidateSelf();
                            v50Var.setLevel(0);
                            return v50Var;
                        default:
                            return new o2d(viewGroup2.getContext());
                    }
                }
            });
            jv3Var = new jv3(yu3Var, gv3VarD, kr6Var);
            mwVar.put(h58Var, jv3Var);
        } else {
            jv3Var.a();
        }
        n(h58Var, jv3Var, d(yu3Var));
        du5 du5Var = h58Var.d;
        du5Var.getClass();
        ((wj7) du5Var).h(i1f.l);
        if (yu3Var instanceof g58) {
            g58 g58Var = (g58) yu3Var;
            uri = g58Var.e ? g58Var.h : g58Var.b;
        } else {
            if (!(yu3Var instanceof fti)) {
                ore.o();
                return;
            }
            uri = ((fti) yu3Var).b;
        }
        q78 q78Var = null;
        if (uri != null) {
            w78 w78VarD = w78.d(uri);
            if (yu3Var instanceof g58) {
                bneVar = ((g58) yu3Var).i;
            } else {
                if (!(yu3Var instanceof fti)) {
                    ore.o();
                    return;
                }
                bneVar = ((fti) yu3Var).j;
            }
            w78VarD.d = bneVar;
            if (yu3Var.l() && !z) {
                w78VarD.b = u78.DISK_CACHE;
            }
            w78VarD.l = new wv3(this, h58Var, jv3Var, yu3Var);
            v78VarA = w78VarD.a();
        } else {
            v78VarA = null;
        }
        au5 au5Var = h58Var.e;
        boolean z2 = yu3Var instanceof g58;
        if (z2) {
            g58 g58Var2 = (g58) yu3Var;
            q78Var = new q78(g58Var2.n, g58Var2.o, g58Var2.a);
        } else if (!(yu3Var instanceof fti)) {
            ore.o();
            return;
        }
        t1d t1dVar = vd7.a.get();
        t1dVar.j = au5Var;
        t1dVar.i = true;
        t1dVar.c = v78VarA;
        t1dVar.b = q78Var;
        t1dVar.f = new sv3(this, v78VarA, jv3Var, h58Var, yu3Var);
        if (z2) {
            uri2 = ((g58) yu3Var).h;
        } else {
            if (!(yu3Var instanceof fti)) {
                ore.o();
                return;
            }
            uri2 = ((fti) yu3Var).i;
        }
        if (uri2 != null) {
            t1dVar.d = w78.d(uri2).a();
            t1dVar.b = q78Var;
        }
        h58Var.i(t1dVar.a());
    }

    public final void o() {
        for (jv3 jv3Var : (kw) this.i.values()) {
            kbc kbcVarM = pq3.j.e(this.a).m();
            kr6 kr6Var = jv3Var.c;
            ny8 ny8Var = (ny8) kr6Var.a;
            if (ny8Var.d()) {
                ((o2d) ny8Var.getValue()).onThemeChanged(kbcVarM);
            }
            ny8 ny8Var2 = (ny8) kr6Var.c;
            if (ny8Var2.d()) {
                ((o2d) ny8Var2.getValue()).onThemeChanged(kbcVarM);
            }
            ny8 ny8Var3 = (ny8) kr6Var.b;
            if (ny8Var3.d()) {
                v50 v50Var = (v50) ny8Var3.getValue();
                v50Var.setTint(-1);
                v50Var.c(-1);
                v50Var.q = Integer.valueOf(kbcVarM.h().i);
                v50Var.invalidateSelf();
            }
        }
    }

    public final boolean p(Drawable drawable) {
        int i = 0;
        while (true) {
            n11 n11Var = this.g;
            if (i >= ((ArrayList) n11Var.c).size()) {
                mw mwVar = this.i;
                ArrayList arrayList = new ArrayList(mwVar.c);
                Iterator it = ((gw) mwVar.entrySet()).iterator();
                while (it.hasNext()) {
                    arrayList.add(((jv3) ((Map.Entry) it.next()).getValue()).b());
                }
                return arrayList.contains(drawable);
            }
            if (drawable == n11Var.b(i).d()) {
                return true;
            }
            i++;
        }
    }
}
