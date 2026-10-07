package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nl5 {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final n1g d;
    public final int e;
    public final int f;
    public final boolean g;

    public nl5(n1g n1gVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = n1gVar;
        int iC = n1gVar.C();
        this.e = iC;
        int iB = n1gVar.B();
        this.f = iB;
        this.g = true;
        ml5 ml5Var = arrayList.isEmpty() ? null : (ml5) arrayList.get(0);
        if (ml5Var == null || ml5Var.a != 0 || ml5Var.b != 0) {
            arrayList.add(0, new ml5(0, 0, 0));
        }
        arrayList.add(new ml5(iC, iB, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ml5 ml5Var2 = (ml5) it.next();
            for (int i3 = 0; i3 < ml5Var2.c; i3++) {
                int i4 = ml5Var2.a + i3;
                int i5 = ml5Var2.b + i3;
                int i6 = n1gVar.f(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                ml5 ml5Var3 = (ml5) it2.next();
                while (true) {
                    i = ml5Var3.a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size; i9++) {
                                ml5 ml5Var4 = (ml5) arrayList.get(i9);
                                while (true) {
                                    i2 = ml5Var4.b;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && n1gVar.g(i7, i8)) {
                                            int i10 = n1gVar.f(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = ml5Var4.c + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = ml5Var3.c + i;
            }
        }
    }

    public static ol5 b(ArrayDeque arrayDeque, int i, boolean z) {
        ol5 ol5Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                ol5Var = null;
                break;
            }
            ol5Var = (ol5) it.next();
            if (ol5Var.a == i && ol5Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            ol5 ol5Var2 = (ol5) it.next();
            if (z) {
                ol5Var2.b--;
            } else {
                ol5Var2.b++;
            }
        }
        return ol5Var;
    }

    public final void a(a89 a89Var) {
        int[] iArr;
        n1g n1gVar;
        int i;
        int i2;
        ArrayList arrayList;
        nl5 nl5Var = this;
        fu0 fu0Var = a89Var instanceof fu0 ? (fu0) a89Var : new fu0(a89Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = nl5Var.a;
        boolean z = true;
        int size = arrayList2.size() - 1;
        int i3 = nl5Var.e;
        int i4 = nl5Var.f;
        int i5 = i3;
        while (size >= 0) {
            ml5 ml5Var = (ml5) arrayList2.get(size);
            int i6 = ml5Var.a;
            int i7 = ml5Var.c;
            int i8 = i6 + i7;
            int i9 = ml5Var.b;
            int i10 = i9 + i7;
            while (true) {
                iArr = nl5Var.b;
                n1gVar = nl5Var.d;
                boolean z2 = z;
                i = 0;
                if (i5 <= i8) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) != 0) {
                    arrayList = arrayList2;
                    int i12 = i11 >> 4;
                    ol5 ol5VarB = b(arrayDeque, i12, false);
                    if (ol5VarB != null) {
                        int i13 = (i3 - ol5VarB.b) - 1;
                        fu0Var.g(i5, i13);
                        if ((i11 & 4) != 0) {
                            fu0Var.f(i13, z2 ? 1 : 0, n1gVar.y(i5, i12));
                        }
                    } else {
                        arrayDeque.add(new ol5(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                    }
                } else {
                    arrayList = arrayList2;
                    fu0Var.d(i5, z2 ? 1 : 0);
                    i3--;
                }
                arrayList2 = arrayList;
                z = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i14 = nl5Var.c[i4];
                if ((i14 & 12) != 0) {
                    int i15 = i14 >> 4;
                    ol5 ol5VarB2 = b(arrayDeque, i15, true);
                    if (ol5VarB2 == null) {
                        arrayDeque.add(new ol5(i4, i3 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        fu0Var.g((i3 - ol5VarB2.b) - 1, i5);
                        if ((i14 & 4) != 0) {
                            fu0Var.f(i5, 1, n1gVar.y(i15, i4));
                        }
                    }
                } else {
                    i2 = i;
                    fu0Var.b(i5, 1);
                    i3++;
                }
                nl5Var = this;
                i = i2;
            }
            int i16 = i9;
            int i17 = i6;
            while (i < i7) {
                if ((iArr[i17] & 15) == 2) {
                    fu0Var.f(i17, 1, n1gVar.y(i17, i16));
                }
                i17++;
                i16++;
                i++;
            }
            size--;
            nl5Var = this;
            z = true;
            i4 = i9;
            i5 = i6;
            arrayList2 = arrayList3;
        }
        fu0Var.a();
    }
}
