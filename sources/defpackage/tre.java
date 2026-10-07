package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.IOException;
import java.io.Serializable;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlinx.serialization.SerializationException;
import one.me.android.initialization.a;
import one.me.sdk.arch.Widget;
import one.me.sdk.richvector.AnimationTarget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.PathElement;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class tre implements u76, x74 {
    public static final o6 a = new o6(7);
    public static qr7 b = new qr7(8);
    public static final c5b c = new c5b("STATE_REG", 1);
    public static final c5b d = new c5b("STATE_COMPLETED", 1);
    public static final c5b e = new c5b("STATE_CANCELLED", 1);
    public static final c5b f = new c5b("NO_RESULT", 1);
    public static final c5b g = new c5b("PARAM_CLAUSE_0", 1);
    public static Boolean h;
    public static Boolean i;
    public static Boolean j;
    public static Boolean k;
    public static volatile a l;
    public static volatile lhb m;
    public static volatile nhb n;
    public static volatile gp0 o;

    public static final aw8 A0(khb khbVar, bw8 bw8Var) {
        aw8 aw8VarR = n1g.R(khbVar, bw8Var, true);
        if (aw8VarR != null) {
            return aw8VarR;
        }
        String strH = ((sr3) wk8.x(bw8Var)).h();
        if (strH == null) {
            strH = "<local class name not available>";
        }
        throw new SerializationException(c0a.o("Serializer for class '", strH, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final ArrayList B0(khb khbVar, List list, boolean z) {
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(A0(khbVar, (bw8) it.next()));
            }
            return arrayList;
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(yw3.W0(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            aw8 aw8VarR = n1g.R(khbVar, (bw8) it2.next(), false);
            if (aw8VarR == null) {
                return null;
            }
            arrayList2.add(aw8VarR);
        }
        return arrayList2;
    }

    public static final void C0(RecyclerView recyclerView, nee neeVar, boolean z, cf7 cf7Var) {
        mn8 mn8Var;
        if (recyclerView.getAdapter() == null || neeVar != recyclerView.getAdapter()) {
            if (!cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
                ore.p("Failed requirement.");
                return;
            }
            if (z) {
                Object tag = recyclerView.getTag(R.id.retained_adapter_state);
                bpe bpeVar = tag instanceof bpe ? (bpe) tag : null;
                recyclerView.setTag(R.id.retained_adapter_state, null);
                if (bpeVar != null) {
                    String str = bpeVar.k;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "clear", null);
                        }
                    }
                    RecyclerView recyclerView2 = (RecyclerView) bpeVar.e.get();
                    if (recyclerView2 != null && (mn8Var = bpeVar.h) != null) {
                        mn8Var.b(recyclerView2);
                    }
                    bpeVar.h = null;
                    RecyclerView recyclerView3 = (RecyclerView) bpeVar.e.get();
                    if (recyclerView3 != null) {
                        recyclerView3.removeOnAttachStateChangeListener(bpeVar.j);
                    }
                    i19 i19Var = bpeVar.f;
                    if (i19Var != null) {
                        i19Var.f(bpeVar.i);
                    }
                }
            }
            if (neeVar == null) {
                recyclerView.setAdapter(null);
                return;
            }
            if (!z) {
                Object tag2 = recyclerView.getTag(R.id.retained_adapter_state);
                if ((tag2 instanceof bpe ? (bpe) tag2 : null) != null) {
                    return;
                }
            }
            recyclerView.setTag(R.id.retained_adapter_state, new bpe(neeVar, recyclerView, cf7Var));
        }
    }

    public static /* synthetic */ void D0(k96 k96Var, nee neeVar, c6 c6Var, int i2) {
        boolean z = (i2 & 2) != 0;
        if ((i2 & 4) != 0) {
            c6Var = null;
        }
        C0(k96Var, neeVar, z, c6Var);
    }

    public static final ks6 E(Widget widget, af7 af7Var, af7 af7Var2) {
        ifh ifhVarD = new ca2(widget.m35getAccountScopeuqN4xOY()).getAccessor().d(231);
        ks6 ks6Var = new ks6();
        ks6Var.a = af7Var;
        ks6Var.c = af7Var2;
        ks6Var.b = ifhVarD;
        return ks6Var;
    }

    public static final void E0(int i2, View view, Object obj) {
        Object tag = view.getTag();
        SparseArray sparseArray = tag instanceof SparseArray ? (SparseArray) tag : null;
        if (sparseArray == null) {
            sparseArray = new SparseArray(2);
            view.setTag(sparseArray);
        }
        sparseArray.put(i2, obj);
    }

    public static final ks6 F(Widget widget, y3f y3fVar) {
        return G(widget, new ize(28, y3fVar));
    }

    public static qgh F0(int i2, kbc kbcVar) {
        int iD = qt4.D(i2);
        if (iD == 0) {
            return new qgh(kbcVar.getIcon().h, kbcVar.getText().h, kbcVar.getIcon().d, true);
        }
        if (iD == 1) {
            return new qgh(kbcVar.getIcon().d, kbcVar.getText().d, kbcVar.getIcon().d, true);
        }
        if (iD == 2) {
            return new qgh(((fn8) kbcVar.u().d.b).d, ((fn8) kbcVar.u().d.b).d, ((fn8) kbcVar.u().d.b).d, false);
        }
        ore.o();
        return null;
    }

    public static /* synthetic */ ks6 G(Widget widget, af7 af7Var) {
        return E(widget, af7Var, new a5d(25));
    }

    public static final nr2 G0(xx6 xx6Var, long j2) {
        return e9i.r(new xfg(j2, xx6Var, (lq4) null, 1));
    }

    public static Object H(sf7 sf7Var, Object obj) {
        try {
            return sf7Var.mo41apply(obj);
        } catch (Throwable th) {
            throw gd6.b(th);
        }
    }

    public static String H0(char c2, Locale locale) {
        String upperCase = String.valueOf(c2).toUpperCase(locale);
        if (upperCase.length() > 1) {
            if (c2 != 329) {
                return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(Locale.ROOT);
            }
        } else if (upperCase.equals(String.valueOf(c2).toUpperCase(Locale.ROOT))) {
            return String.valueOf(Character.toTitleCase(c2));
        }
        return upperCase;
    }

    public static void I(long j2, l31 l31Var, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            ore.p("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((d71) arrayList4.get(i9)).a() < i8) {
                ore.p("Failed requirement.");
                return;
            }
        }
        d71 d71Var = (d71) arrayList.get(i3);
        d71 d71Var2 = (d71) arrayList4.get(i4 - 1);
        if (i8 == d71Var.a()) {
            int iIntValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            d71 d71Var3 = (d71) arrayList4.get(i10);
            i5 = i10;
            i6 = iIntValue;
            d71Var = d71Var3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (d71Var.k(i8) == d71Var2.k(i8)) {
            int iMin = Math.min(d71Var.a(), d71Var2.a());
            int i11 = 0;
            for (int i12 = i8; i12 < iMin && d71Var.k(i12) == d71Var2.k(i12); i12++) {
                i11++;
            }
            long j4 = (l31Var.b / 4) + j2 + 2 + ((long) i11) + 1;
            l31Var.v0(-i11);
            l31Var.v0(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                l31Var.v0(d71Var.k(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((d71) arrayList4.get(i5)).a()) {
                    l31Var.v0(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    ore.k("Check failed.");
                    return;
                }
            }
            l31 l31Var2 = new l31();
            l31Var.v0(((int) ((l31Var2.b / 4) + j4)) * (-1));
            I(j4, l31Var2, i13, arrayList4, i5, i4, arrayList5);
            l31Var.r0(l31Var2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((d71) arrayList4.get(i15 - 1)).k(i8) != ((d71) arrayList4.get(i15)).k(i8)) {
                i14++;
            }
        }
        long j5 = (l31Var.b / 4) + j2 + 2 + ((long) (i14 * 2));
        l31Var.v0(i14);
        l31Var.v0(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int iK = ((d71) arrayList4.get(i16)).k(i8);
            if (i16 == i5 || iK != ((d71) arrayList4.get(i16 - 1)).k(i8)) {
                l31Var.v0(iK & 255);
            }
        }
        l31 l31Var3 = new l31();
        int i17 = i5;
        while (i17 < i4) {
            byte bK = ((d71) arrayList4.get(i17)).k(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (bK != ((d71) arrayList4.get(i19)).k(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((d71) arrayList4.get(i17)).a()) {
                l31Var.v0(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                l31Var.v0(((int) ((l31Var3.b / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                I(j3, l31Var3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        l31Var.r0(l31Var3);
    }

    public static final int I0(int i2, float f2) {
        return Color.argb(gm0.K(f2 * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public static nl5 J(n1g n1gVar) {
        int i2;
        ql5 ql5Var;
        int i3;
        pl5 pl5Var;
        ml5 ml5Var;
        int i4;
        int i5;
        ql5 ql5Var2;
        ql5 ql5Var3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iC = n1gVar.C();
        int iB = n1gVar.B();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        pl5 pl5Var2 = new pl5();
        int i13 = 0;
        pl5Var2.a = 0;
        pl5Var2.b = iC;
        pl5Var2.c = 0;
        pl5Var2.d = iB;
        arrayList2.add(pl5Var2);
        int i14 = iC + iB;
        int i15 = 1;
        int i16 = (((i14 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i16];
        int i17 = i16 / 2;
        int[] iArr2 = new int[i16];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            pl5 pl5Var3 = (pl5) arrayList2.remove(arrayList2.size() - i15);
            if (pl5Var3.b() >= i15 && pl5Var3.a() >= i15) {
                int iA = ((pl5Var3.a() + pl5Var3.b()) + i15) / 2;
                int i18 = i15 + i17;
                iArr[i18] = pl5Var3.a;
                iArr2[i18] = pl5Var3.b;
                int i19 = i13;
                while (true) {
                    if (i19 >= iA) {
                        i2 = i17;
                        ql5Var = null;
                        break;
                    }
                    int i20 = Math.abs(pl5Var3.b() - pl5Var3.a()) % 2 == i15 ? i15 : i13;
                    int iB2 = pl5Var3.b() - pl5Var3.a();
                    int i21 = -i19;
                    int i22 = i21;
                    while (true) {
                        if (i22 > i19) {
                            i4 = i13;
                            i2 = i17;
                            i5 = iA;
                            ql5Var2 = null;
                            break;
                        }
                        if (i22 == i21 || (i22 != i19 && iArr[i22 + 1 + i17] > iArr[(i22 - 1) + i17])) {
                            i10 = iArr[i22 + 1 + i17];
                            i11 = i10;
                        } else {
                            i10 = iArr[(i22 - 1) + i17];
                            i11 = i10 + 1;
                        }
                        i2 = i17;
                        int i23 = ((i11 - pl5Var3.a) + pl5Var3.c) - i22;
                        int i24 = (i19 == 0 || i11 != i10) ? i23 : i23 - 1;
                        int i25 = i22;
                        int i26 = i23;
                        int i27 = i11;
                        i5 = iA;
                        while (i27 < pl5Var3.b && i26 < pl5Var3.d && n1gVar.g(i27, i26)) {
                            i27++;
                            i26++;
                        }
                        iArr[i25 + i2] = i27;
                        if (i20 != 0) {
                            int i28 = iB2 - i25;
                            i12 = i20;
                            if (i28 >= i21 + 1 && i28 <= i19 - 1 && iArr2[i28 + i2] <= i27) {
                                ql5Var2 = new ql5();
                                ql5Var2.a = i10;
                                ql5Var2.b = i24;
                                ql5Var2.c = i27;
                                ql5Var2.d = i26;
                                i4 = 0;
                                ql5Var2.e = false;
                                break;
                            }
                        } else {
                            i12 = i20;
                        }
                        i22 = i25 + 2;
                        i13 = 0;
                        i17 = i2;
                        iA = i5;
                        i20 = i12;
                    }
                    if (ql5Var2 != null) {
                        ql5Var = ql5Var2;
                        break;
                    }
                    int i29 = (pl5Var3.b() - pl5Var3.a()) % 2 == 0 ? 1 : i4;
                    int iB3 = pl5Var3.b() - pl5Var3.a();
                    int i30 = i21;
                    while (true) {
                        if (i30 > i19) {
                            ql5Var3 = null;
                            break;
                        }
                        if (i30 == i21 || (i30 != i19 && iArr2[i30 + 1 + i2] < iArr2[(i30 - 1) + i2])) {
                            i6 = iArr2[i30 + 1 + i2];
                            i7 = i6;
                        } else {
                            i6 = iArr2[(i30 - 1) + i2];
                            i7 = i6 - 1;
                        }
                        int i31 = pl5Var3.d - ((pl5Var3.b - i7) - i30);
                        int i32 = (i19 == 0 || i7 != i6) ? i31 : i31 + 1;
                        int i33 = i29;
                        while (true) {
                            if (i7 > pl5Var3.a && i31 > pl5Var3.c) {
                                i8 = iB3;
                                if (!n1gVar.g(i7 - 1, i31 - 1)) {
                                    break;
                                }
                                i7--;
                                i31--;
                                iB3 = i8;
                            } else {
                                i8 = iB3;
                                break;
                            }
                        }
                        iArr2[i30 + i2] = i7;
                        if (i33 != 0 && (i9 = i8 - i30) >= i21 && i9 <= i19 && iArr[i9 + i2] >= i7) {
                            ql5Var3 = new ql5();
                            ql5Var3.a = i7;
                            ql5Var3.b = i31;
                            ql5Var3.c = i6;
                            ql5Var3.d = i32;
                            ql5Var3.e = true;
                            break;
                        }
                        i30 += 2;
                        i29 = i33;
                        iB3 = i8;
                    }
                    if (ql5Var3 != null) {
                        ql5Var = ql5Var3;
                        break;
                    }
                    i19++;
                    i17 = i2;
                    iA = i5;
                    i15 = 1;
                    i13 = 0;
                }
            } else {
                i2 = i17;
                ql5Var = null;
                break;
            }
            if (ql5Var != null) {
                if (ql5Var.a() > 0) {
                    int i34 = ql5Var.d;
                    int i35 = ql5Var.b;
                    int i36 = i34 - i35;
                    int i37 = ql5Var.c;
                    int i38 = ql5Var.a;
                    int i39 = i37 - i38;
                    if (i36 == i39) {
                        ml5Var = new ml5(i38, i35, i39);
                    } else if (ql5Var.e) {
                        ml5Var = new ml5(i38, i35, ql5Var.a());
                    } else {
                        ml5Var = i36 > i39 ? new ml5(i38, i35 + 1, ql5Var.a()) : new ml5(i38 + 1, i35, ql5Var.a());
                    }
                    arrayList.add(ml5Var);
                }
                if (arrayList3.isEmpty()) {
                    pl5Var = new pl5();
                    i3 = 1;
                } else {
                    i3 = 1;
                    pl5Var = (pl5) arrayList3.remove(arrayList3.size() - 1);
                }
                pl5Var.a = pl5Var3.a;
                pl5Var.c = pl5Var3.c;
                pl5Var.b = ql5Var.a;
                pl5Var.d = ql5Var.b;
                arrayList2.add(pl5Var);
                pl5Var3.b = pl5Var3.b;
                pl5Var3.d = pl5Var3.d;
                pl5Var3.a = ql5Var.c;
                pl5Var3.c = ql5Var.d;
                arrayList2.add(pl5Var3);
            } else {
                i3 = 1;
                arrayList3.add(pl5Var3);
            }
            i17 = i2;
            i15 = i3;
            i13 = 0;
        }
        Collections.sort(arrayList, a);
        return new nl5(n1gVar, arrayList, iArr, iArr2);
    }

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
    public static final Object J0(nq4 nq4Var) {
        Object obj;
        vt4 context = nq4Var.getContext();
        vd7.q(context);
        lq4 lq4VarB = p90.B(nq4Var);
        sn5 sn5Var = lq4VarB instanceof sn5 ? (sn5) lq4VarB : null;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (sn5Var == null) {
            obj = sbiVar;
        } else {
            xt4 xt4Var = sn5Var.d;
            if (e9i.A0(xt4Var, context)) {
                sn5Var.f = sbiVar;
                sn5Var.c = 1;
                xt4Var.I0(context, sn5Var);
            } else {
                j1k j1kVar = new j1k(j1k.c);
                vt4 vt4VarU0 = context.u0(j1kVar);
                sn5Var.f = sbiVar;
                sn5Var.c = 1;
                xt4Var.I0(vt4VarU0, sn5Var);
                if (j1kVar.b) {
                    nc6 nc6VarA = qqh.a();
                    zv zvVar = nc6VarA.e;
                    if (!(zvVar != null ? zvVar.isEmpty() : true)) {
                        if (nc6VarA.c >= 4294967296L) {
                            sn5Var.f = sbiVar;
                            sn5Var.c = 1;
                            nc6VarA.T0(sn5Var);
                        } else {
                            nc6VarA.U0(true);
                            try {
                                sn5Var.run();
                                do {
                                } while (nc6VarA.W0());
                            } catch (Throwable th) {
                                try {
                                    sn5Var.g(th);
                                } catch (Throwable th2) {
                                    nc6VarA.S0(true);
                                    throw th2;
                                }
                            }
                            nc6VarA.S0(true);
                        }
                    }
                    obj = sbiVar;
                }
            }
            obj = hu4Var;
        }
        return obj == hu4Var ? obj : sbiVar;
    }

    public static final void K(Spannable spannable) {
        Object[] spans;
        int spanStart;
        int spanEnd;
        int length;
        try {
            spans = spannable.getSpans(0, spannable.length(), Object.class);
        } catch (Throwable unused) {
            spans = null;
        }
        if (spans != null) {
            for (Object obj : spans) {
                if (obj == null || (obj instanceof NoCopySpan) || (spanStart = spannable.getSpanStart(obj)) < 0 || (spanEnd = spannable.getSpanEnd(obj)) < 0 || spanEnd < spanStart || spanStart > (length = spannable.length()) || spanEnd > length) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static void L(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ore.n(str);
    }

    public static void M(int i2) {
        if (2 > i2 || i2 >= 37) {
            c.m(zo5.y(i2, "radix ", " was not in valid range "), new hj8(2, 36, 1));
        }
    }

    public static final j3 N(xx6 xx6Var, long j2, qf7 qf7Var) {
        return new j3(new ey6(e9i.r(new cy6(j2, null, xx6Var)), 0), 13, qf7Var);
    }

    public static int O(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static int P(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final void Q(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        c.r(nbh.u("toIndex (", i2, ") is greater than size (", i3, ")."));
    }

    public static List R(hr2 hr2Var, int i2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        while (arrayList.size() != i2) {
            Object objH = hr2Var.h();
            if (objH instanceof cs2) {
                Throwable thA = ds2.a(objH);
                if (thA == null) {
                    break;
                }
                throw thA;
            }
            arrayList.add(objH);
        }
        return arrayList;
    }

    public static boolean U(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final int V(RecyclerView recyclerView, float f2) {
        LinearLayoutManager linearLayoutManagerE0 = e0(recyclerView);
        if (linearLayoutManagerE0 == null) {
            ore.k("Only LinearLayoutManager is supported");
            return 0;
        }
        if (f2 == 1.0f) {
            return linearLayoutManagerE0.Y0();
        }
        if (f2 == 0.0f) {
            return linearLayoutManagerE0.Z0();
        }
        int iZ0 = linearLayoutManagerE0.Z0();
        View viewR = linearLayoutManagerE0.r(iZ0);
        return (viewR == null || ((float) (recyclerView.getMeasuredHeight() - viewR.getTop())) < ((float) viewR.getMeasuredHeight()) * f2) ? linearLayoutManagerE0.Y0() : iZ0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a A[EDGE_INSN: B:44:0x008a->B:40:0x008a BREAK  A[LOOP:0: B:10:0x0011->B:48:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x006e A[SYNTHETIC] */
    public static final List W(t3a t3aVar, int i2, int i3) {
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        ylc ylcVar;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        if (i2 == i3) {
            return r66.a;
        }
        boolean z2 = i3 > i2;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z2) {
                if (i2 <= i3) {
                    return arrayList;
                }
                linkedHashMap = (LinkedHashMap) t3aVar.a;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i2));
                    if (treeMap2 == null) {
                        ylcVar = null;
                    } else {
                        ylcVar = new ylc(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i2));
                    if (treeMap == null) {
                        ylcVar = null;
                    } else {
                        ylcVar = new ylc(treeMap, treeMap.keySet());
                    }
                }
                if (ylcVar == null) {
                    Map map = (Map) ylcVar.a;
                    it = ((Iterable) ylcVar.b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i2 + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i3 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i2 >= i3) {
                    return arrayList;
                }
                linkedHashMap = (LinkedHashMap) t3aVar.a;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i2));
                    if (treeMap2 == null) {
                        ylcVar = null;
                    } else {
                        ylcVar = new ylc(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i2));
                    if (treeMap == null) {
                        ylcVar = null;
                    } else {
                        ylcVar = new ylc(treeMap, treeMap.keySet());
                    }
                }
                if (ylcVar == null) {
                    Map map2 = (Map) ylcVar.a;
                    it = ((Iterable) ylcVar.b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i3 <= iIntValue && iIntValue < i2) {
                                arrayList.add(map2.get(Integer.valueOf(iIntValue)));
                                z = true;
                                i2 = iIntValue;
                                break;
                                break;
                            }
                        } else if (i2 + 1 <= iIntValue && iIntValue <= i3) {
                            arrayList.add(map2.get(Integer.valueOf(iIntValue)));
                            z = true;
                            i2 = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z);
        return null;
    }

    public static final j3 X(xx6 xx6Var, long j2, qf7 qf7Var) {
        jz jzVar = new jz(new o24(xx6Var, 6, qf7Var), 11);
        ghb ghbVar = ew5.b;
        return new j3(new ra1(8, e9i.J0(jzVar, qe7.P(j2, lw5.MILLISECONDS))), 14, new jy6());
    }

    public static pvh Y(RecyclerView recyclerView) {
        new ghb(23);
        pvh pvhVar = new pvh();
        pvhVar.a(recyclerView);
        return pvhVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static quh Z(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return quh.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return quh.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return quh.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return quh.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return quh.SSL_3_0;
        }
        ore.p("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static tt4 a0(tt4 tt4Var, ut4 ut4Var) {
        if (cqk.d(tt4Var.getKey(), ut4Var)) {
            return tt4Var;
        }
        return null;
    }

    public static zs7 b0(SSLSession sSLSession) throws IOException {
        List listL;
        List listL2 = r66.a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            ore.k("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            qr7.k("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        ar3 ar3VarK = ar3.b.k(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            ore.k("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            qr7.k("tlsVersion == NONE");
            return null;
        }
        quh quhVarZ = Z(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listL = peerCertificates != null ? uqi.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listL2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listL2 = uqi.l(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new zs7(quhVarZ, ar3VarK, listL2, new ys7(0, listL));
    }

    public static final GridLayoutManager c0(RecyclerView recyclerView) {
        vee layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return (GridLayoutManager) layoutManager;
        }
        return null;
    }

    public static final w09 d0(g19 g19Var) {
        return lvb.n0(g19Var.f());
    }

    public static final LinearLayoutManager e0(RecyclerView recyclerView) {
        vee layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public static Object f0(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return u4.c(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Serializable g0(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return u4.f(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static final Object h0(View view, int i2) {
        Object tag = view.getTag();
        SparseArray sparseArray = tag instanceof SparseArray ? (SparseArray) tag : null;
        if (sparseArray != null) {
            return sparseArray.get(i2);
        }
        return null;
    }

    public static final boolean i0(char c2) {
        return c2 == ' ' || c2 == '\t' || c2 == 160;
    }

    public static final boolean j0(RecyclerView recyclerView, int i2) {
        View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        return childAt != null && RecyclerView.P(childAt) == i2;
    }

    public static boolean k0(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (h == null) {
            h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        h.booleanValue();
        if (i == null) {
            i = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return i.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static boolean l0(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static sgg m0(xx6 xx6Var, gu4 gu4Var) {
        return yab.i0(gu4Var, null, 1, new ky6(xx6Var, null, 0), 1);
    }

    public static void n0(Spannable spannable, String str, int i2, int i3, int i4, ot4 ot4Var, int i5) {
        boolean z = (i5 & 16) != 0;
        if ((i5 & 32) != 0) {
            ot4Var = null;
        }
        k59 k59Var = new k59(str, i4, z);
        k59Var.c(ot4Var);
        k59Var.a(spannable, i2, i3);
    }

    public static final void o0(Spannable spannable, int i2, int i3) {
        gn9[] gn9VarArr = (gn9[]) spannable.getSpans(i2, i3, gn9.class);
        if (gn9VarArr.length == 0) {
            return;
        }
        for (gn9 gn9Var : gn9VarArr) {
            x0(spannable, gn9Var, i2, i3);
        }
    }

    public static int p0(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static String q0(Map map, te9 te9Var) {
        if (map.isEmpty()) {
            return "{}";
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (te9Var != null) {
                value = te9Var.e(value, str);
            }
            sb.append(str);
            sb.append('=');
            sb.append(value);
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    public static vt4 r0(tt4 tt4Var, ut4 ut4Var) {
        return cqk.d(tt4Var.getKey(), ut4Var) ? k66.a : tt4Var;
    }

    public static void s0(Throwable th) {
        a aVar = l;
        if (th == null) {
            th = gd6.a("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException(th);
        }
        if (aVar != null) {
            try {
                aVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final aw8 t0(rv8 rv8Var, ArrayList arrayList, af7 af7Var) {
        aw8 fwVar;
        aw8 xfeVar;
        if (rv8Var.equals(zfe.a(Collection.class)) || rv8Var.equals(zfe.a(List.class)) || rv8Var.equals(zfe.a(List.class)) || rv8Var.equals(zfe.a(ArrayList.class))) {
            fwVar = new fw((aw8) arrayList.get(0));
        } else if (rv8Var.equals(zfe.a(HashSet.class))) {
            fwVar = new zt7((aw8) arrayList.get(0), 0);
        } else if (rv8Var.equals(zfe.a(Set.class)) || rv8Var.equals(zfe.a(Set.class)) || rv8Var.equals(zfe.a(LinkedHashSet.class))) {
            fwVar = new zt7((aw8) arrayList.get(0), 1);
        } else if (rv8Var.equals(zfe.a(HashMap.class))) {
            fwVar = new yt7((aw8) arrayList.get(0), (aw8) arrayList.get(1));
        } else if (rv8Var.equals(zfe.a(Map.class)) || rv8Var.equals(zfe.a(Map.class)) || rv8Var.equals(zfe.a(LinkedHashMap.class))) {
            fwVar = new e69((aw8) arrayList.get(0), (aw8) arrayList.get(1));
        } else {
            if (rv8Var.equals(zfe.a(Map.Entry.class))) {
                xfeVar = new dm9((aw8) arrayList.get(0), (aw8) arrayList.get(1), 0);
            } else if (rv8Var.equals(zfe.a(ylc.class))) {
                xfeVar = new dm9((aw8) arrayList.get(0), (aw8) arrayList.get(1), 1);
            } else if (rv8Var.equals(zfe.a(e5i.class))) {
                fwVar = new f5i((aw8) arrayList.get(0), (aw8) arrayList.get(1), (aw8) arrayList.get(2));
            } else if (((qr3) rv8Var).d().isArray()) {
                xfeVar = new xfe((rv8) af7Var.invoke(), (aw8) arrayList.get(0));
            } else {
                fwVar = null;
            }
            fwVar = xfeVar;
        }
        if (fwVar != null) {
            return fwVar;
        }
        aw8[] aw8VarArr = (aw8[]) arrayList.toArray(new aw8[0]);
        return qe7.l(rv8Var, (aw8[]) Arrays.copyOf(aw8VarArr, aw8VarArr.length));
    }

    public static final Animator u0(Animator animator, String str, EnhancedVectorDrawable enhancedVectorDrawable) {
        Animator animatorClone = animator.clone();
        AnimationTarget animationTargetFindTarget$rich_vector = str != null ? enhancedVectorDrawable.findTarget$rich_vector(str) : null;
        if (animationTargetFindTarget$rich_vector == null) {
            ore.j(str, "\" cannot be found in the VectorDrawable to be animated.", "Target with the name \"");
            return null;
        }
        if ((animationTargetFindTarget$rich_vector instanceof GroupElement) || (animationTargetFindTarget$rich_vector instanceof PathElement)) {
            animatorClone.setTarget(animationTargetFindTarget$rich_vector);
            return animatorClone;
        }
        throw new IllegalStateException(("Target should be either GroupElement or PathElement, " + animationTargetFindTarget$rich_vector.getClass() + " is not supported").toString());
    }

    public static final void v0(EnhancedVectorDrawable enhancedVectorDrawable, AnimatorSet animatorSet, ArrayList arrayList, ArrayMap arrayMap) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(u0((Animator) arrayList.get(0), (String) arrayMap.get(arrayList.get(0)), enhancedVectorDrawable));
        for (int i2 = 1; i2 < size; i2++) {
            builderPlay.with(u0((Animator) arrayList.get(i2), (String) arrayMap.get(arrayList.get(i2)), enhancedVectorDrawable));
        }
    }

    public static final void w0(Editable editable, int i2, int i3, boolean z, gn9 gn9Var) {
        Class<?> cls = gn9Var.getClass();
        String string = editable.toString();
        List<gn9> listN1 = kotlin.collections.a.n1(editable.getSpans(i2, i3, cls));
        for (gn9 gn9Var2 : listN1) {
            if (editable.getSpanStart(gn9Var2) <= i2 && editable.getSpanEnd(gn9Var2) >= i3) {
                x0(editable, gn9Var2, i2, i3);
                return;
            }
        }
        if (!z) {
            for (int i4 = i2; i4 < i3; i4++) {
                if (!l0(string.charAt(i4))) {
                    Iterator it = listN1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object obj = (gn9) it.next();
                            int spanStart = editable.getSpanStart(obj);
                            if (i4 <= editable.getSpanEnd(obj) && spanStart <= i4) {
                                break;
                            }
                        }
                    }
                }
            }
            Iterator it2 = listN1.iterator();
            while (it2.hasNext()) {
                x0(editable, (gn9) it2.next(), i2, i3);
            }
            return;
        }
        n1g.e0(editable, gn9Var, i2, i3, 33);
    }

    public static final void x0(Spannable spannable, gn9 gn9Var, int i2, int i3) {
        int spanStart = spannable.getSpanStart(gn9Var);
        if (spanStart == -1) {
            return;
        }
        int spanEnd = spannable.getSpanEnd(gn9Var);
        if (spanStart >= i2 && spanEnd <= i3) {
            spannable.removeSpan(gn9Var);
            return;
        }
        int spanFlags = spannable.getSpanFlags(gn9Var);
        spannable.removeSpan(gn9Var);
        if (spanStart < i2) {
            spannable.setSpan(gn9Var.copy(), spanStart, i2, spanFlags);
        }
        if (spanEnd > i3) {
            spannable.setSpan(gn9Var.copy(), i3, spanEnd, spanFlags);
        }
    }

    public static final void y0(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != null) {
                childAt.setPressed(false);
                childAt.jumpDrawablesToCurrentState();
            }
        }
    }

    public static CharSequence z0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            if (charSequence instanceof jeg) {
                return (SpannableString) charSequence;
            }
            int i2 = jeg.a;
            return ku6.v(charSequence);
        } catch (Throwable th) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "Markdown", "fail to make safeCopy of " + ((Object) charSequence), th);
                }
            }
            return charSequence;
        }
    }

    @Override // defpackage.u76
    public void A(int i2) {
        T(Integer.valueOf(i2));
    }

    @Override // defpackage.x74
    public boolean B() {
        return true;
    }

    @Override // defpackage.u76
    public void C(String str) {
        T(str);
    }

    @Override // defpackage.x74
    public void D(fif fifVar, int i2, float f2) {
        S(fifVar, i2);
        w(f2);
    }

    public void S(fif fifVar, int i2) {
    }

    public void T(Object obj) {
        throw new SerializationException("Non-serializable " + zfe.a(obj.getClass()) + " is not supported by " + zfe.a(getClass()) + " encoder");
    }

    @Override // defpackage.u76
    public x74 a(fif fifVar) {
        return this;
    }

    @Override // defpackage.x74
    public void c() {
    }

    @Override // defpackage.u76
    public void d(double d2) {
        T(Double.valueOf(d2));
    }

    @Override // defpackage.x74
    public void e(fif fifVar, int i2, long j2) {
        S(fifVar, i2);
        p(j2);
    }

    @Override // defpackage.u76
    public void f(byte b2) {
        T(Byte.valueOf(b2));
    }

    @Override // defpackage.u76
    public u76 g(fif fifVar) {
        return this;
    }

    @Override // defpackage.x74
    public void h(fif fifVar, int i2, boolean z) {
        S(fifVar, i2);
        v(z);
    }

    @Override // defpackage.x74
    public void i(fif fifVar, int i2, aw8 aw8Var, Object obj) {
        S(fifVar, i2);
        t(aw8Var, obj);
    }

    @Override // defpackage.x74
    public void j(fif fifVar, int i2, double d2) {
        S(fifVar, i2);
        d(d2);
    }

    @Override // defpackage.x74
    public void k(nhd nhdVar, int i2, byte b2) {
        S(nhdVar, i2);
        f(b2);
    }

    @Override // defpackage.u76
    public void l(fif fifVar, int i2) {
        T(Integer.valueOf(i2));
    }

    @Override // defpackage.x74
    public void m(nhd nhdVar, int i2, short s) {
        S(nhdVar, i2);
        u(s);
    }

    @Override // defpackage.x74
    public void n(fif fifVar, int i2, String str) {
        S(fifVar, i2);
        C(str);
    }

    @Override // defpackage.x74
    public void o(fif fifVar, int i2, aw8 aw8Var, Object obj) {
        S(fifVar, i2);
        wvl.b(this, aw8Var, obj);
    }

    @Override // defpackage.u76
    public void p(long j2) {
        T(Long.valueOf(j2));
    }

    @Override // defpackage.x74
    public u76 q(nhd nhdVar, int i2) {
        S(nhdVar, i2);
        return g(nhdVar.h(i2));
    }

    @Override // defpackage.u76
    public x74 r(fif fifVar, int i2) {
        return wvl.a(this, fifVar);
    }

    @Override // defpackage.u76
    public void s() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // defpackage.u76
    public void t(aw8 aw8Var, Object obj) {
        wvl.c(this, aw8Var, obj);
    }

    @Override // defpackage.u76
    public void u(short s) {
        T(Short.valueOf(s));
    }

    @Override // defpackage.u76
    public void v(boolean z) {
        T(Boolean.valueOf(z));
    }

    @Override // defpackage.u76
    public void w(float f2) {
        T(Float.valueOf(f2));
    }

    @Override // defpackage.u76
    public void x(char c2) {
        T(Character.valueOf(c2));
    }

    @Override // defpackage.x74
    public void y(int i2, int i3, fif fifVar) {
        S(fifVar, i2);
        A(i3);
    }

    @Override // defpackage.x74
    public void z(nhd nhdVar, int i2, char c2) {
        S(nhdVar, i2);
        x(c2);
    }
}
