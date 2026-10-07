package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class ve5 extends uyh {
    public static final ohc k = new w44(new vv2(1));
    public final Object c;
    public final Context d;
    public final qg6 e;
    public pe5 f;
    public Thread g;
    public ae7 h;
    public p70 i;
    public Boolean j;

    public ve5(ryh ryhVar, qg6 qg6Var, Context context) {
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = qg6Var;
        if (ryhVar instanceof pe5) {
            this.f = (pe5) ryhVar;
        } else {
            pe5 pe5Var = pe5.F0;
            pe5Var.getClass();
            oe5 oe5Var = new oe5(pe5Var);
            oe5Var.d(ryhVar);
            this.f = new pe5(oe5Var);
        }
        this.i = p70.i;
        if (this.f.A0 && context == null) {
            lvb.G0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int d(b87 b87Var, c98 c98Var) {
        for (int i = 0; i < c98Var.size(); i++) {
            for (int i2 = 0; i2 < b87Var.c.size(); i2++) {
                if (((sx8) b87Var.c.get(i2)).b.equals(c98Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void e(iyh iyhVar, pe5 pe5Var, HashMap map) {
        nyh nyhVar;
        for (int i = 0; i < iyhVar.a; i++) {
            nyh nyhVar2 = (nyh) pe5Var.H.get(iyhVar.a(i));
            if (nyhVar2 != null && ((nyhVar = (nyh) map.get(Integer.valueOf(nyhVar2.a()))) == null || (nyhVar.b.isEmpty() && !nyhVar2.b.isEmpty()))) {
                map.put(Integer.valueOf(nyhVar2.a()), nyhVar2);
            }
        }
    }

    public static int f(b87 b87Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(b87Var.d)) {
            return 4;
        }
        String strI = i(str);
        String strI2 = i(b87Var.d);
        if (strI2 == null || strI == null) {
            return (z && strI2 == null) ? 1 : 0;
        }
        if (strI2.startsWith(strI) || strI.startsWith(strI2)) {
            return 3;
        }
        String str2 = vqi.a;
        return strI2.split("-", 2)[0].equals(strI.split("-", 2)[0]) ? 2 : 0;
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean j(pe5 pe5Var, int i, b87 b87Var) {
        if ((i & 3584) == 0) {
            return false;
        }
        pyh pyhVar = pe5Var.w;
        if (pyhVar.c && (i & np0.q) == 0) {
            return false;
        }
        if (pyhVar.b) {
            boolean z = (b87Var.I == 0 && b87Var.J == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static Pair k(int i, om9 om9Var, int[][][] iArr, se5 se5Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessR;
        om9 om9Var2 = om9Var;
        ArrayList arrayList = new ArrayList();
        int iA = om9Var2.a();
        int i3 = 0;
        while (i3 < iA) {
            if (i == om9Var2.b(i3)) {
                iyh iyhVarC = om9Var2.c(i3);
                for (int i4 = 0; i4 < iyhVarC.a; i4++) {
                    hyh hyhVarA = iyhVarC.a(i4);
                    ghe gheVarE = se5Var.e(i3, hyhVarA, iArr[i3][i4]);
                    int i5 = hyhVarA.a;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        te5 te5Var = (te5) gheVarE.get(i6);
                        int iA2 = te5Var.a();
                        if (zArr[i6] || iA2 == 0) {
                            i2 = iA;
                        } else {
                            if (iA2 == 1) {
                                randomAccessR = c98.r(te5Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(te5Var);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    te5 te5Var2 = (te5) gheVarE.get(i7);
                                    int i8 = iA;
                                    if (te5Var2.a() == 2 && te5Var.b(te5Var2)) {
                                        arrayList2.add(te5Var2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    iA = i8;
                                }
                                randomAccessR = arrayList2;
                            }
                            i2 = iA;
                            arrayList.add(randomAccessR);
                        }
                        i6++;
                        iA = i2;
                    }
                }
            }
            i3++;
            om9Var2 = om9Var;
            iA = iA;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((te5) list.get(i9)).c;
        }
        te5 te5Var3 = (te5) list.get(0);
        return Pair.create(new pg6(te5Var3.b, iArr2), Integer.valueOf(te5Var3.a));
    }

    @Override // defpackage.uyh
    public final void a() {
        ae7 ae7Var;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    lvb.Z("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (ae7Var = this.h) != null) {
            ae7Var.n();
            this.h = null;
        }
        this.a = null;
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [ne5] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r3v19, types: [qg6] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, mje[]] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v14, types: [mje] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v32, types: [ne5] */
    /* JADX WARN: Type inference failed for: r5v6, types: [pg6[]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.uyh
    public final vyh b(ks0[] ks0VarArr, iyh iyhVar, x4a x4aVar, ush ushVar) {
        pe5 pe5Var;
        int i;
        ?? r6;
        String str;
        hyh hyhVar;
        Pair pairK;
        ?? languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        ?? K;
        int i2;
        int i3;
        int i4;
        int i5;
        Object pg6Var;
        iyh iyhVar2;
        Context context;
        int[] iArr;
        iyh iyhVar3 = iyhVar;
        int i6 = 1;
        int[] iArr2 = new int[ks0VarArr.length + 1];
        int length = ks0VarArr.length + 1;
        hyh[][] hyhVarArr = new hyh[length][];
        int[][][] iArr3 = new int[ks0VarArr.length + 1][][];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = iyhVar3.a;
            hyhVarArr[i7] = new hyh[i8];
            iArr3[i7] = new int[i8][];
        }
        int length2 = ks0VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i9 = 0; i9 < length2; i9++) {
            iArr4[i9] = ks0VarArr[i9].E();
        }
        int i10 = 0;
        while (i10 < iyhVar3.a) {
            hyh hyhVarA = iyhVar3.a(i10);
            int i11 = hyhVarA.c == 5 ? i6 : 0;
            int length3 = ks0VarArr.length;
            int i12 = i6;
            int i13 = 0;
            int i14 = 0;
            while (i13 < ks0VarArr.length) {
                ks0 ks0Var = ks0VarArr[i13];
                int i15 = i6;
                int iMax = 0;
                for (int i16 = 0; i16 < hyhVarA.a; i16++) {
                    iMax = Math.max(iMax, ks0Var.D(hyhVarA.d[i16]) & 7);
                }
                int i17 = iArr2[i13] == 0 ? i15 : 0;
                if (iMax > i14 || (iMax == i14 && i11 != 0 && i12 == 0 && i17 != 0)) {
                    i12 = i17;
                    i14 = iMax;
                    length3 = i13;
                }
                i13++;
                i6 = i15;
            }
            int i18 = i6;
            if (length3 == ks0VarArr.length) {
                iArr = new int[hyhVarA.a];
            } else {
                ks0 ks0Var2 = ks0VarArr[length3];
                int[] iArr5 = new int[hyhVarA.a];
                for (int i19 = 0; i19 < hyhVarA.a; i19++) {
                    iArr5[i19] = ks0Var2.D(hyhVarA.d[i19]);
                }
                iArr = iArr5;
            }
            int i20 = iArr2[length3];
            hyhVarArr[length3][i20] = hyhVarA;
            iArr3[length3][i20] = iArr;
            iArr2[length3] = i20 + 1;
            i10++;
            iyhVar3 = iyhVar;
            i6 = i18;
        }
        int i21 = i6;
        int i22 = 0;
        iyh[] iyhVarArr = new iyh[ks0VarArr.length];
        String[] strArr = new String[ks0VarArr.length];
        int[] iArr6 = new int[ks0VarArr.length];
        for (int i23 = 0; i23 < ks0VarArr.length; i23++) {
            int i24 = iArr2[i23];
            iyhVarArr[i23] = new iyh((hyh[]) vqi.Z(hyhVarArr[i23], i24));
            iArr3[i23] = (int[][]) vqi.Z(iArr3[i23], i24);
            strArr[i23] = ks0VarArr[i23].h();
            iArr6[i23] = ks0VarArr[i23].b;
        }
        om9 om9Var = new om9(iArr6, iyhVarArr, iArr4, iArr3, new iyh((hyh[]) vqi.Z(hyhVarArr[ks0VarArr.length], iArr2[ks0VarArr.length])));
        synchronized (this.c) {
            this.g = Thread.currentThread();
            pe5Var = this.f;
        }
        if (this.j == null && (context = this.d) != null) {
            this.j = Boolean.valueOf(vqi.T(context));
        }
        if (pe5Var.A0 && Build.VERSION.SDK_INT >= 32 && this.h == null) {
            this.h = new ae7(this.d, this, this.j);
        }
        int iA = om9Var.a();
        Context context2 = this.d;
        int iA2 = om9Var.a();
        ?? r5 = new pg6[iA2];
        int i25 = 0;
        while (true) {
            i = 2;
            if (i25 >= om9Var.a()) {
                r6 = 0;
                break;
            }
            if (2 == om9Var.b(i25) && om9Var.c(i25).a > 0) {
                r6 = i21;
                break;
            }
            i25++;
        }
        Pair pairK2 = k(i21, om9Var, iArr3, new je5(this, pe5Var, (boolean) r6, iArr4), new ps0(9));
        if (pairK2 != null) {
            r5[((Integer) pairK2.second).intValue()] = (pg6) pairK2.first;
        }
        if (pairK2 == null) {
            str = null;
        } else {
            pg6 pg6Var2 = (pg6) pairK2.first;
            str = pg6Var2.a.d[pg6Var2.b[0]].d;
        }
        pyh pyhVar = pe5Var.w;
        Pair pairK3 = pyhVar.a == 2 ? null : k(2, om9Var, iArr3, new po(pe5Var, str, iArr4, (!pe5Var.k || context2 == null) ? null : vqi.A(context2)), new ps0(8));
        int i26 = 4;
        if ((pe5Var.E || pairK3 == null) && pyhVar.a != 2) {
            hyhVar = null;
            pairK = k(4, om9Var, iArr3, new ie5(pe5Var), new ps0(7));
        } else {
            hyhVar = null;
            pairK = null;
        }
        if (pairK != null) {
            r5[((Integer) pairK.second).intValue()] = (pg6) pairK.first;
        } else if (pairK3 != null) {
            r5[((Integer) pairK3.second).intValue()] = (pg6) pairK3.first;
        }
        int i27 = 3;
        if (pyhVar.a == 2) {
            K = hyhVar;
        } else {
            if (!pe5Var.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = hyhVar;
            } else {
                String str2 = vqi.a;
                languageTag = locale.toLanguageTag();
            }
            K = k(3, om9Var, iArr3, new oo(pe5Var, str, languageTag), new ps0(10));
        }
        if (K != 0) {
            r5[((Integer) ((Pair) K).second).intValue()] = (pg6) ((Pair) K).first;
        }
        int i28 = 0;
        while (i28 < iA2) {
            int iB = om9Var.b(i28);
            if (iB == i || iB == 1 || iB == i27 || iB == i26) {
                i4 = i28;
                i5 = iA2;
            } else {
                iyh iyhVarC = om9Var.c(i28);
                int[][] iArr7 = iArr3[i28];
                if (pyhVar.a == i) {
                    i4 = i28;
                    i5 = iA2;
                } else {
                    hyh hyhVar2 = hyhVar;
                    ?? r18 = hyhVar2;
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < iyhVarC.a) {
                        hyh hyhVarA2 = iyhVarC.a(i29);
                        int[] iArr8 = iArr7[i29];
                        int i31 = 0;
                        int i32 = i28;
                        ?? r11 = r18;
                        while (i31 < hyhVarA2.a) {
                            int i33 = iA2;
                            if (ks0.k(iArr8[i31], pe5Var.B0)) {
                                iyhVar2 = iyhVarC;
                                ?? ne5Var = new ne5(iArr8[i31], hyhVarA2.d[i31]);
                                if (r11 == 0 || ne5Var.compareTo(r11) > 0) {
                                    r11 = ne5Var;
                                    hyhVar2 = hyhVarA2;
                                    i30 = i31;
                                }
                            } else {
                                iyhVar2 = iyhVarC;
                            }
                            i31++;
                            iA2 = i33;
                            iyhVarC = iyhVar2;
                            r11 = r11;
                        }
                        i29++;
                        r18 = r11;
                        i28 = i32;
                    }
                    i4 = i28;
                    i5 = iA2;
                    if (hyhVar2 != null) {
                        pg6Var = new pg6(hyhVar2, i30);
                    }
                    r5[i4] = pg6Var;
                }
                pg6Var = hyhVar;
                r5[i4] = pg6Var;
            }
            i28 = i4 + 1;
            iA2 = i5;
            i = 2;
            i27 = 3;
            i26 = 4;
        }
        int iA3 = om9Var.a();
        HashMap map = new HashMap();
        for (int i34 = 0; i34 < iA3; i34++) {
            e(om9Var.c(i34), pe5Var, map);
        }
        e(om9Var.d(), pe5Var, map);
        int i35 = 0;
        while (true) {
            i2 = -1;
            if (i35 >= iA3) {
                break;
            }
            nyh nyhVar = (nyh) map.get(Integer.valueOf(om9Var.b(i35)));
            if (nyhVar != null) {
                hyh hyhVar3 = nyhVar.a;
                c98 c98Var = nyhVar.b;
                r5[i35] = (c98Var.isEmpty() || om9Var.c(i35).b(hyhVar3) == -1) ? hyhVar : new pg6(hyhVar3, k4m.h(c98Var));
            }
            i35++;
        }
        int iA4 = om9Var.a();
        for (int i36 = 0; i36 < iA4; i36++) {
            iyh iyhVarC2 = om9Var.c(i36);
            Map map2 = (Map) pe5Var.D0.get(i36);
            if (map2 != null && map2.containsKey(iyhVarC2)) {
                Map map3 = (Map) pe5Var.D0.get(i36);
                if (map3 != null) {
                    qt4.A(map3.get(iyhVarC2));
                }
                r5[i36] = hyhVar;
            }
        }
        for (int i37 = 0; i37 < iA; i37++) {
            int iB2 = om9Var.b(i37);
            if (pe5Var.E0.get(i37) || pe5Var.I.contains(Integer.valueOf(iB2))) {
                r5[i37] = hyhVar;
            }
        }
        ?? r3 = this.e;
        ko0 ko0Var = this.b;
        ko0Var.getClass();
        rg6[] rg6VarArrU = r3.u(r5, ko0Var);
        ?? r4 = new mje[iA];
        for (int i38 = 0; i38 < iA; i38++) {
            r4[i38] = (pe5Var.E0.get(i38) || pe5Var.I.contains(Integer.valueOf(om9Var.b(i38))) || (om9Var.b(i38) != -2 && rg6VarArrU[i38] == null)) ? hyhVar : mje.c;
        }
        if (pe5Var.w.a != 0) {
            int i39 = 0;
            int i40 = 0;
            while (i39 < om9Var.a()) {
                int iB3 = om9Var.b(i39);
                rg6 rg6Var = rg6VarArrU[i39];
                if (iB3 == 1 || rg6Var == null) {
                    if (iB3 == 1 && rg6Var != null && rg6Var.length() == 1) {
                        i3 = i22;
                        if (j(pe5Var, iArr3[i39][om9Var.c(i39).b(rg6Var.m())][rg6Var.e(i3)], rg6Var.s())) {
                            i40++;
                            i2 = i39;
                        }
                    } else {
                        i3 = i22;
                    }
                    i39++;
                    i22 = i3;
                }
            }
            int i41 = i22;
            if (i40 == 1) {
                int i42 = pe5Var.w.b ? 1 : 2;
                ?? r7 = r4[i2];
                r4[i2] = new mje(i42, (r7 == 0 || !r7.b) ? i41 : 1);
            }
        }
        Pair pairCreate = Pair.create(r4, rg6VarArrU);
        return new vyh((mje[]) pairCreate.first, (rg6[]) pairCreate.second, oyl.a(om9Var, (rg6[]) pairCreate.second), om9Var);
    }

    @Override // defpackage.uyh
    public final void c(ryh ryhVar) {
        if (ryhVar instanceof pe5) {
            l((pe5) ryhVar);
        }
        oe5 oe5Var = new oe5(g());
        oe5Var.d(ryhVar);
        l(new pe5(oe5Var));
    }

    public final pe5 g() {
        pe5 pe5Var;
        synchronized (this.c) {
            pe5Var = this.f;
        }
        return pe5Var;
    }

    public final void h() {
        boolean z;
        tyh tyhVar;
        ae7 ae7Var;
        synchronized (this.c) {
            try {
                z = this.f.A0 && Build.VERSION.SDK_INT >= 32 && (ae7Var = this.h) != null && ae7Var.k();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (tyhVar = this.a) == null) {
            return;
        }
        tyhVar.a();
    }

    public final void l(pe5 pe5Var) {
        boolean zEquals;
        pe5Var.getClass();
        synchronized (this.c) {
            zEquals = this.f.equals(pe5Var);
            this.f = pe5Var;
        }
        if (zEquals) {
            return;
        }
        if (pe5Var.A0 && this.d == null) {
            lvb.G0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        tyh tyhVar = this.a;
        if (tyhVar != null) {
            tyhVar.a();
        }
    }

    public ve5(Context context) {
        this(context, new so2(15));
    }

    public ve5(Context context, so2 so2Var) {
        this(pe5.F0, so2Var, context);
    }
}
