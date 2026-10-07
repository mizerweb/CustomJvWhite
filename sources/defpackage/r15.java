package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class r15 implements u0a, uhf {
    public static final Pattern A = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern B = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final int a;
    public final d15 b;
    public final v1i c;
    public final ev5 d;
    public final l6m e;
    public final ljf f;
    public final long g;
    public final aa9 h;
    public final qf i;
    public final iyh j;
    public final q15[] k;
    public final ou7 l;
    public final x3d m;
    public final ed7 o;
    public final av5 p;
    public final z3d q;
    public t0a r;
    public g84 u;
    public k15 v;
    public int w;
    public List x;
    public long z;
    public boolean y = true;
    public yq3[] s = new yq3[0];
    public vc6[] t = new vc6[0];
    public final IdentityHashMap n = new IdentityHashMap();

    public r15(int i, k15 k15Var, ljf ljfVar, int i2, d15 d15Var, v1i v1iVar, ev5 ev5Var, av5 av5Var, l6m l6mVar, ed7 ed7Var, long j, aa9 aa9Var, qf qfVar, ou7 ou7Var, rj5 rj5Var, z3d z3dVar) {
        int i3;
        int i4;
        int[][] iArr;
        boolean[] zArr;
        b87[][] b87VarArr;
        b87[] b87VarArrH;
        hi5 hi5VarD;
        Integer num;
        this.a = i;
        this.v = k15Var;
        this.f = ljfVar;
        this.w = i2;
        this.b = d15Var;
        this.c = v1iVar;
        this.d = ev5Var;
        this.p = av5Var;
        this.e = l6mVar;
        this.o = ed7Var;
        this.g = j;
        this.h = aa9Var;
        this.i = qfVar;
        this.l = ou7Var;
        this.q = z3dVar;
        boolean z = true;
        this.m = new x3d(k15Var, rj5Var, qfVar);
        int i5 = 0;
        ou7Var.getClass();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        this.u = new g84(gheVar, gheVar);
        fsc fscVarB = k15Var.b(i2);
        List list = fscVarB.d;
        this.x = list;
        List list2 = fscVarB.c;
        int size = list2.size();
        HashMap map = new HashMap(tpk.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            map.put(Long.valueOf(((ga) list2.get(i6)).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i7 < size) {
            ga gaVar = (ga) list2.get(i7);
            List list3 = gaVar.e;
            List list4 = gaVar.f;
            boolean z2 = z;
            hi5 hi5VarD2 = d("http://dashif.org/guidelines/trickmode", list3);
            hi5VarD2 = hi5VarD2 == null ? d("http://dashif.org/guidelines/trickmode", list4) : hi5VarD2;
            int iIntValue = (hi5VarD2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(hi5VarD2.b)))) == null || !b(gaVar, (ga) list2.get(num.intValue()))) ? i7 : num.intValue();
            if (iIntValue == i7 && (hi5VarD = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = hi5VarD.b;
                String str2 = vqi.a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                for (int i8 = i5; i8 < length; i8++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i8])));
                    if (num2 != null && b(gaVar, (ga) list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i7) {
                List list5 = (List) sparseArray.get(i7);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i7, list6);
                arrayList.remove(list5);
            }
            i7++;
            z = z2;
            i5 = 0;
        }
        boolean z3 = z;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            int[] iArrH = k4m.h((Collection) arrayList.get(i9));
            iArr2[i9] = iArrH;
            Arrays.sort(iArrH);
        }
        boolean[] zArr2 = new boolean[size2];
        b87[][] b87VarArr2 = new b87[size2][];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int[] iArr3 = iArr2[i10];
            int length2 = iArr3.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((ga) list2.get(iArr3[i12])).c;
                iArr = iArr2;
                for (int i13 = 0; i13 < list7.size(); i13++) {
                    if (!((ble) list7.get(i13)).d.isEmpty()) {
                        zArr2[i10] = z3;
                        i11++;
                        break;
                    }
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i10];
            int length3 = iArr4.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length3) {
                    zArr = zArr2;
                    b87VarArr = b87VarArr2;
                    b87VarArrH = new b87[0];
                    break;
                }
                int i15 = iArr4[i14];
                ga gaVar2 = (ga) list2.get(i15);
                List list8 = ((ga) list2.get(i15)).d;
                int[] iArr5 = iArr4;
                int i16 = 0;
                while (i16 < list8.size()) {
                    hi5 hi5Var = (hi5) list8.get(i16);
                    zArr = zArr2;
                    b87VarArr = b87VarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(hi5Var.a)) {
                        a87 a87Var = new a87();
                        a87Var.m = uya.n("application/cea-608");
                        a87Var.a = c0a.m(gaVar2.a, ":cea608", new StringBuilder());
                        b87VarArrH = h(hi5Var, A, new b87(a87Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(hi5Var.a)) {
                        a87 a87Var2 = new a87();
                        a87Var2.m = uya.n("application/cea-708");
                        a87Var2.a = c0a.m(gaVar2.a, ":cea708", new StringBuilder());
                        b87VarArrH = h(hi5Var, B, new b87(a87Var2));
                        break;
                    }
                    i16++;
                    b87VarArr2 = b87VarArr;
                    zArr2 = zArr;
                }
                i14++;
                iArr4 = iArr5;
            }
            b87VarArr[i10] = b87VarArrH;
            if (b87VarArrH.length != 0) {
                i11++;
            }
            i10++;
            b87VarArr2 = b87VarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        b87[][] b87VarArr3 = b87VarArr2;
        int size3 = list.size() + i11 + size2;
        hyh[] hyhVarArr = new hyh[size3];
        q15[] q15VarArr = new q15[size3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr7 = iArr6[i17];
            ArrayList arrayList3 = new ArrayList();
            for (int i19 : iArr7) {
                arrayList3.addAll(((ga) list2.get(i19)).c);
            }
            int size4 = arrayList3.size();
            b87[] b87VarArr4 = new b87[size4];
            int i20 = 0;
            while (i20 < size4) {
                int i21 = size2;
                b87 b87Var = ((ble) arrayList3.get(i20)).a;
                int i22 = i18;
                a87 a87VarA = b87Var.a();
                a87VarA.N = ev5Var.c(b87Var);
                b87VarArr4[i20] = new b87(a87VarA);
                i20++;
                size2 = i21;
                i18 = i22;
            }
            int i23 = size2;
            int i24 = i18;
            ga gaVar3 = (ga) list2.get(iArr7[0]);
            long j2 = gaVar3.a;
            String string = j2 != -1 ? Long.toString(j2) : zo5.h(i17, "unset:");
            int i25 = i24 + 1;
            if (zArr3[i17]) {
                i3 = i24 + 2;
            } else {
                i3 = i25;
                i25 = -1;
            }
            if (b87VarArr3[i17].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            List list9 = list2;
            int i26 = 0;
            while (i26 < size4) {
                int i27 = i26;
                b87VarArr4[i27] = d15Var.p(b87VarArr4[i27]);
                i26 = i27 + 1;
            }
            hyhVarArr[i24] = new hyh(string, b87VarArr4);
            int i28 = gaVar3.b;
            a98 a98Var2 = c98.b;
            ghe gheVar2 = ghe.e;
            q15 q15Var = new q15(i28, 0, iArr7, i24, i25, i3, -1, gheVar2);
            int i29 = i24;
            q15VarArr[i29] = q15Var;
            int i30 = -1;
            if (i25 != -1) {
                String strO = zo5.o(string, ":emsg");
                a87 a87Var3 = new a87();
                a87Var3.a = strO;
                a87Var3.m = uya.n("application/x-emsg");
                hyhVarArr[i25] = new hyh(strO, new b87(a87Var3));
                q15VarArr[i25] = new q15(5, 1, iArr7, i29, -1, -1, -1, gheVar2);
                i30 = -1;
            }
            if (i3 != i30) {
                i29 = i29;
                String strO2 = zo5.o(string, ":cc");
                q15VarArr[i3] = new q15(3, 1, iArr7, i29, -1, -1, -1, c98.o(b87VarArr3[i17]));
                b87[] b87VarArr5 = b87VarArr3[i17];
                for (int i31 = 0; i31 < b87VarArr5.length; i31++) {
                    b87VarArr5[i31] = d15Var.p(b87VarArr5[i31]);
                }
                hyhVarArr[i3] = new hyh(strO2, b87VarArr3[i17]);
            } else {
                i29 = i29;
            }
            i17++;
            size2 = i23;
            i18 = i4;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            xc6 xc6Var = (xc6) list.get(i32);
            a87 a87Var4 = new a87();
            a87Var4.a = xc6Var.a();
            a87Var4.m = uya.n("application/x-emsg");
            hyhVarArr[i18] = new hyh(xc6Var.a() + ":" + i32, new b87(a87Var4));
            a98 a98Var3 = c98.b;
            q15VarArr[i18] = new q15(5, 2, new int[0], -1, -1, -1, i32, ghe.e);
            i32++;
            i18++;
        }
        Pair pairCreate = Pair.create(new iyh(hyhVarArr), q15VarArr);
        this.j = (iyh) pairCreate.first;
        this.k = (q15[]) pairCreate.second;
    }

    public static boolean b(ga gaVar, ga gaVar2) {
        int i = gaVar.b;
        List list = gaVar.c;
        int i2 = gaVar2.b;
        List list2 = gaVar2.c;
        if (i == i2) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            b87 b87Var = ((ble) list.get(0)).a;
            b87 b87Var2 = ((ble) list2.get(0)).a;
            int i3 = b87Var.f & (-16385);
            int i4 = b87Var2.f & (-16385);
            if (Objects.equals(b87Var.d, b87Var2.d) && i3 == i4) {
                return true;
            }
        }
        return false;
    }

    public static hi5 d(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            hi5 hi5Var = (hi5) list.get(i);
            if (str.equals(hi5Var.a)) {
                return hi5Var;
            }
        }
        return null;
    }

    public static b87[] h(hi5 hi5Var, Pattern pattern, b87 b87Var) {
        String str = hi5Var.b;
        if (str == null) {
            return new b87[]{b87Var};
        }
        String str2 = vqi.a;
        String[] strArrSplit = str.split(";", -1);
        b87[] b87VarArr = new b87[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            Matcher matcher = pattern.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new b87[]{b87Var};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            a87 a87VarA = b87Var.a();
            a87VarA.a = b87Var.a + ":" + i2;
            a87VarA.J = i2;
            a87VarA.d = matcher.group(2);
            b87VarArr[i] = new b87(a87VarA);
        }
        return b87VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.u0a
    public final long a(rg6[] rg6VarArr, boolean[] zArr, xye[] xyeVarArr, boolean[] zArr2, long j) throws Throwable {
        int i;
        hyh hyhVar;
        boolean z;
        int[] iArr;
        int[] iArr2;
        int i2;
        int i3;
        int i4;
        hyh hyhVarA;
        c98 c98Var;
        int i5;
        w3d w3dVar;
        boolean z2;
        rg6[] rg6VarArr2 = rg6VarArr;
        int[] iArr3 = new int[rg6VarArr2.length];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = -1;
            if (i7 >= rg6VarArr2.length) {
                break;
            }
            rg6 rg6Var = rg6VarArr2[i7];
            if (rg6Var != null) {
                iArr3[i7] = this.j.b(rg6Var.m());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            hyhVar = null;
            if (i8 >= rg6VarArr2.length) {
                break;
            }
            if (rg6VarArr2[i8] == null || !zArr[i8]) {
                xye xyeVar = xyeVarArr[i8];
                if (xyeVar instanceof yq3) {
                    ((yq3) xyeVar).D(this);
                } else if (xyeVar instanceof xq3) {
                    xq3 xq3Var = (xq3) xyeVar;
                    boolean[] zArr3 = xq3Var.e.d;
                    int i9 = xq3Var.c;
                    lvb.b0(zArr3[i9]);
                    zArr3[i9] = false;
                }
                xyeVarArr[i8] = null;
            }
            i8++;
        }
        int i10 = 0;
        while (true) {
            z = true;
            if (i10 >= rg6VarArr2.length) {
                break;
            }
            xye xyeVar2 = xyeVarArr[i10];
            if ((xyeVar2 instanceof x66) || (xyeVar2 instanceof xq3)) {
                int iF = f(i10, iArr3);
                if (iF == -1) {
                    z2 = xyeVarArr[i10] instanceof x66;
                } else {
                    xye xyeVar3 = xyeVarArr[i10];
                    z2 = (xyeVar3 instanceof xq3) && ((xq3) xyeVar3).a == xyeVarArr[iF];
                }
                if (!z2) {
                    xye xyeVar4 = xyeVarArr[i10];
                    if (xyeVar4 instanceof xq3) {
                        xq3 xq3Var2 = (xq3) xyeVar4;
                        boolean[] zArr4 = xq3Var2.e.d;
                        int i11 = xq3Var2.c;
                        lvb.b0(zArr4[i11]);
                        zArr4[i11] = false;
                    }
                    xyeVarArr[i10] = null;
                }
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < rg6VarArr2.length) {
            rg6 rg6Var2 = rg6VarArr2[i12];
            if (rg6Var2 == null) {
                iArr2 = iArr3;
                i2 = i6;
                i3 = i12;
            } else {
                xye xyeVar5 = xyeVarArr[i12];
                if (xyeVar5 == null) {
                    zArr2[i12] = z;
                    q15 q15Var = this.k[iArr3[i12]];
                    int i13 = q15Var.c;
                    if (i13 == 0) {
                        int i14 = q15Var.f;
                        boolean z3 = i14 != i ? z ? 1 : 0 : i6;
                        if (z3 != 0) {
                            hyhVarA = this.j.a(i14);
                            i4 = z ? 1 : 0;
                        } else {
                            i4 = i6;
                            hyhVarA = hyhVar;
                        }
                        int i15 = q15Var.g;
                        if (i15 != i) {
                            c98Var = this.k[i15].h;
                        } else {
                            a98 a98Var = c98.b;
                            c98Var = ghe.e;
                        }
                        int size = c98Var.size() + i4;
                        b87[] b87VarArr = new b87[size];
                        int[] iArr4 = new int[size];
                        if (z3 != 0) {
                            b87VarArr[i6] = hyhVarA.d[i6];
                            iArr4[i6] = 5;
                            i5 = z ? 1 : 0;
                        } else {
                            i5 = i6;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i16 = i6; i16 < c98Var.size(); i16++) {
                            b87 b87Var = (b87) c98Var.get(i16);
                            b87VarArr[i5] = b87Var;
                            iArr4[i5] = 3;
                            arrayList.add(b87Var);
                            i5 += z ? 1 : 0;
                        }
                        if (!this.v.d || z3 == 0) {
                            w3dVar = hyhVar;
                        } else {
                            x3d x3dVar = this.m;
                            w3dVar = new w3d(x3dVar, x3dVar.a);
                        }
                        Object obj = w3dVar;
                        i3 = i12;
                        iArr2 = iArr3;
                        hyhVar = null;
                        yq3 yq3Var = new yq3(q15Var.b, iArr4, b87VarArr, this.b.o(this.h, this.v, this.f, this.w, q15Var.a, rg6Var2, q15Var.b, this.g, z3, arrayList, w3dVar, this.c, this.q), this, this.i, j, this.d, this.p, this.e, this.o, this.y, null);
                        synchronized (this) {
                            this.n.put(yq3Var, obj);
                        }
                        xyeVarArr[i3] = yq3Var;
                    } else {
                        iArr2 = iArr3;
                        i3 = i12;
                        if (i13 == 2) {
                            i2 = 0;
                            xyeVarArr[i3] = new vc6((xc6) this.x.get(q15Var.d), rg6Var2.m().d[0], this.v.d);
                        }
                    }
                    i2 = 0;
                } else {
                    iArr2 = iArr3;
                    i2 = i6;
                    i3 = i12;
                    if (xyeVar5 instanceof yq3) {
                        ((yq3) xyeVar5).e.h(rg6Var2);
                    }
                }
            }
            i12 = i3 + 1;
            rg6VarArr2 = rg6VarArr;
            i6 = i2;
            iArr3 = iArr2;
            i = -1;
            z = true;
        }
        int[] iArr5 = iArr3;
        boolean z4 = i6;
        int i17 = z4 ? 1 : 0;
        while (i17 < rg6VarArr.length) {
            if (xyeVarArr[i17] != null || rg6VarArr[i17] == null) {
                iArr = iArr5;
            } else {
                iArr = iArr5;
                q15 q15Var2 = this.k[iArr[i17]];
                if (q15Var2.c == 1) {
                    int iF2 = f(i17, iArr);
                    if (iF2 == -1) {
                        xyeVarArr[i17] = new x66();
                    } else {
                        yq3 yq3Var2 = (yq3) xyeVarArr[iF2];
                        int i18 = q15Var2.b;
                        boolean[] zArr5 = yq3Var2.d;
                        wye[] wyeVarArr = yq3Var2.n;
                        int i19 = z4 ? 1 : 0;
                        while (true) {
                            if (i19 >= wyeVarArr.length) {
                                c.t();
                                return 0L;
                            }
                            if (yq3Var2.b[i19] == i18) {
                                lvb.b0(!zArr5[i19]);
                                zArr5[i19] = true;
                                wyeVarArr[i19].F(j, true);
                                xyeVarArr[i17] = new xq3(yq3Var2, yq3Var2, wyeVarArr[i19], i19);
                                break;
                            }
                            i19++;
                        }
                    }
                }
                i17++;
                iArr5 = iArr;
            }
            i17++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = xyeVarArr.length;
        for (int i20 = z4 ? 1 : 0; i20 < length; i20++) {
            xye xyeVar6 = xyeVarArr[i20];
            if (xyeVar6 instanceof yq3) {
                arrayList2.add((yq3) xyeVar6);
            } else if (xyeVar6 instanceof vc6) {
                arrayList3.add((vc6) xyeVar6);
            }
        }
        yq3[] yq3VarArr = new yq3[arrayList2.size()];
        this.s = yq3VarArr;
        arrayList2.toArray(yq3VarArr);
        vc6[] vc6VarArr = new vc6[arrayList3.size()];
        this.t = vc6VarArr;
        arrayList3.toArray(vc6VarArr);
        ou7 ou7Var = this.l;
        AbstractList abstractListF = j8f.f(new hs4(13), arrayList2);
        ou7Var.getClass();
        this.u = new g84(arrayList2, abstractListF);
        if (this.y) {
            this.y = z4;
            this.z = j;
        }
        return j;
    }

    @Override // defpackage.u0a
    public final long c(long j, ybf ybfVar) {
        for (yq3 yq3Var : this.s) {
            if (yq3Var.a == 2) {
                return yq3Var.e.c(j, ybfVar);
            }
        }
        return j;
    }

    @Override // defpackage.vhf
    public final long e() {
        return this.u.e();
    }

    public final int f(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 != -1) {
            q15[] q15VarArr = this.k;
            int i3 = q15VarArr[i2].e;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 == i3 && q15VarArr[i5].c == 0) {
                    return i4;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    @Override // defpackage.u0a
    public final long g(long j) throws Throwable {
        int i;
        qr0 qr0Var;
        boolean zF;
        boolean z;
        yq3[] yq3VarArr = this.s;
        int length = yq3VarArr.length;
        boolean z2 = false;
        int i2 = 0;
        while (i2 < length) {
            yq3 yq3Var = yq3VarArr[i2];
            wye[] wyeVarArr = yq3Var.n;
            wye wyeVar = yq3Var.m;
            dc9 dc9Var = yq3Var.i;
            ?? r14 = yq3Var.k;
            yq3Var.t = j;
            yq3Var.w = z2;
            if (yq3Var.A()) {
                yq3Var.s = j;
                z = z2;
                i = i2;
            } else {
                ?? r15 = z2;
                while (true) {
                    if (r15 < r14.size()) {
                        qr0Var = (qr0) r14.get(r15);
                        long j2 = qr0Var.g;
                        i = i2;
                        if (j2 == j && qr0Var.k == -9223372036854775807L) {
                            break;
                        }
                        if (j2 <= j) {
                            i2 = i;
                            r15++;
                        }
                    } else {
                        i = i2;
                    }
                    qr0Var = null;
                    break;
                }
                if (qr0Var != null) {
                    zF = wyeVar.E(qr0Var.c(0));
                } else {
                    long jE = yq3Var.e();
                    zF = wyeVar.F(j, jE == Long.MIN_VALUE || j < jE);
                }
                if (zF) {
                    yq3Var.u = yq3Var.C(wyeVar.t(), 0);
                    for (wye wyeVar2 : wyeVarArr) {
                        wyeVar2.F(j, true);
                    }
                } else {
                    yq3Var.s = j;
                    yq3Var.y = false;
                    r14.clear();
                    yq3Var.u = 0;
                    if (dc9Var.J()) {
                        wyeVar.k();
                        for (wye wyeVar3 : wyeVarArr) {
                            wyeVar3.k();
                        }
                        dc9Var.A();
                    } else {
                        dc9Var.d = null;
                        z = false;
                        wyeVar.D(false);
                        for (wye wyeVar4 : yq3Var.n) {
                            wyeVar4.D(false);
                        }
                    }
                }
                z = false;
            }
            i2 = i + 1;
            z2 = z;
        }
        vc6[] vc6VarArr = this.t;
        int length2 = vc6VarArr.length;
        for (?? r5 = z2; r5 < length2; r5++) {
            vc6 vc6Var = vc6VarArr[r5];
            int iB = vqi.b(vc6Var.c, j, true);
            vc6Var.g = iB;
            vc6Var.h = (vc6Var.d && iB == vc6Var.c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.u.i();
    }

    @Override // defpackage.u0a
    public final List j(ArrayList arrayList) {
        List list = this.v.b(this.w).c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rg6 rg6Var = (rg6) it.next();
            q15 q15Var = this.k[this.j.b(rg6Var.m())];
            if (q15Var.c == 0) {
                int[] iArr = q15Var.a;
                int length = rg6Var.length();
                int[] iArr2 = new int[length];
                for (int i = 0; i < rg6Var.length(); i++) {
                    iArr2[i] = rg6Var.e(i);
                }
                Arrays.sort(iArr2);
                int size = ((ga) list.get(iArr[0])).c.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr2[i4];
                    while (true) {
                        int i6 = i3 + size;
                        if (i5 >= i6) {
                            i2++;
                            size = ((ga) list.get(iArr[i2])).c.size();
                            i3 = i6;
                        }
                    }
                    arrayList2.add(new k4h(this.w, iArr[i2], i5 - i3));
                }
            }
        }
        return arrayList2;
    }

    @Override // defpackage.u0a
    public final long k() {
        for (yq3 yq3Var : this.s) {
            yq3Var.getClass();
            try {
                boolean z = yq3Var.x;
                yq3Var.x = false;
                if (z) {
                    return this.z;
                }
            } catch (Throwable th) {
                yq3Var.x = false;
                throw th;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.u0a
    public final void n() {
        this.h.b();
    }

    @Override // defpackage.uhf
    public final void q(vhf vhfVar) {
        this.r.q(this);
    }

    @Override // defpackage.u0a
    public final void s(t0a t0aVar, long j) {
        this.r = t0aVar;
        t0aVar.C(this);
    }

    @Override // defpackage.u0a
    public final iyh t() {
        return this.j;
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        return this.u.u(fa9Var);
    }

    @Override // defpackage.vhf
    public final long v() {
        return this.u.v();
    }

    @Override // defpackage.u0a
    public final void w(long j, boolean z) {
        long j2;
        for (yq3 yq3Var : this.s) {
            if (!yq3Var.A()) {
                wye wyeVar = yq3Var.m;
                int i = wyeVar.q;
                wyeVar.j(j, z, true);
                wye wyeVar2 = yq3Var.m;
                int i2 = wyeVar2.q;
                if (i2 > i) {
                    synchronized (wyeVar2) {
                        j2 = wyeVar2.p == 0 ? Long.MIN_VALUE : wyeVar2.n[wyeVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        wye[] wyeVarArr = yq3Var.n;
                        if (i3 >= wyeVarArr.length) {
                            break;
                        }
                        wyeVarArr[i3].j(j2, z, yq3Var.d[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(yq3Var.C(i2, 0), yq3Var.u);
                if (iMin > 0) {
                    vqi.f0(0, iMin, yq3Var.k);
                    yq3Var.u -= iMin;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    @Override // defpackage.vhf
    public final void y(long j) {
        int i;
        yq3[] yq3VarArr = this.s;
        int length = yq3VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            yq3 yq3Var = yq3VarArr[i2];
            if (yq3Var.i.J()) {
                i = i2;
            } else {
                long jE = this.v.e(this.w);
                wye wyeVar = yq3Var.m;
                lvb.b0(!yq3Var.i.J());
                if (yq3Var.A() || jE == -9223372036854775807L || yq3Var.k.isEmpty()) {
                    i = i2;
                } else {
                    qr0 qr0VarR = yq3Var.r();
                    long j2 = qr0VarR.l;
                    if (j2 == -9223372036854775807L) {
                        j2 = qr0VarR.h;
                    }
                    if (j2 <= jE) {
                        i = i2;
                    } else {
                        long jQ = wyeVar.q();
                        if (jQ <= jE) {
                            i = i2;
                        } else {
                            wyeVar.l(Math.max(jE, wyeVar.r() + 1));
                            wye[] wyeVarArr = yq3Var.n;
                            int length2 = wyeVarArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                wye wyeVar2 = wyeVarArr[i3];
                                wyeVar2.l(Math.max(jE, wyeVar2.r() + 1));
                                i3++;
                                i2 = i2;
                            }
                            i = i2;
                            yq3Var.g.W(yq3Var.a, jE, jQ);
                        }
                    }
                }
            }
            i2 = i + 1;
        }
        this.u.y(j);
    }
}
