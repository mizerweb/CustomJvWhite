package defpackage;

import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class o4c {
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final bm i = new bm();
    public final ConcurrentHashMap j = new ConcurrentHashMap();

    public o4c(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
    }

    public final CharSequence a(CharSequence charSequence, List list, int i, boolean z, int i2, boolean z2, boolean z3) {
        List list2;
        SpannableStringBuilder spannableStringBuilder;
        o4c o4cVar;
        int i3;
        char c;
        char c2;
        Object poeVar;
        o4c o4cVar2 = this;
        a8g a8gVar = pq3.j;
        je9 je9Var = je9.g;
        if (charSequence.length() == 0 || (list2 = list) == null || list2.isEmpty()) {
            return charSequence;
        }
        i8b i8bVar = new i8b();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
        m4c m4cVar = new m4c(i8bVar, o4cVar2);
        int i4 = 0;
        spannableStringBuilder2.setSpan(m4cVar, 0, spannableStringBuilder2.length(), 17);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cga cgaVar = (cga) it.next();
            long j = cgaVar.a;
            bga bgaVar = cgaVar.c;
            ufe ufeVar = new ufe();
            int i5 = cgaVar.d;
            ufeVar.a = i5;
            int i6 = cgaVar.e;
            Map map = cgaVar.f;
            ufe ufeVar2 = new ufe();
            ufeVar2.a = i5 + i6;
            long[] jArr = i8bVar.a;
            int i7 = i8bVar.b;
            while (i4 < i7) {
                long j2 = jArr[i4];
                bga bgaVar2 = bgaVar;
                long[] jArr2 = jArr;
                int i8 = (int) (j2 >> 32);
                int i9 = ufeVar.a;
                je9 je9Var2 = je9Var;
                i8b i8bVar2 = i8bVar;
                if (i8 <= i9) {
                    ufeVar.a = i9 + ((int) (j2 & 4294967295L));
                }
                int i10 = ufeVar2.a;
                if (i8 < i10) {
                    ufeVar2.a = i10 + ((int) (j2 & 4294967295L));
                }
                i4++;
                bgaVar = bgaVar2;
                je9Var = je9Var2;
                jArr = jArr2;
                i8bVar = i8bVar2;
            }
            je9Var = je9Var;
            i8bVar = i8bVar;
            switch (bgaVar.ordinal()) {
                case 0:
                case 1:
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    i3 = 0;
                    c = 17;
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                case 2:
                    i3 = 0;
                    c = 17;
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    new d1b().a(spannableStringBuilder, ufeVar.a, ufeVar2.a);
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                case 3:
                    i3 = 0;
                    c = 17;
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    new vz0().a(spannableStringBuilder, ufeVar.a, ufeVar2.a);
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                case 4:
                    i3 = 0;
                    c = 17;
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    new jn8().a(spannableStringBuilder, ufeVar.a, ufeVar2.a);
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                case 5:
                    i3 = 0;
                    c = 17;
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    if (map != null && !map.isEmpty()) {
                        if (map.containsKey(MLFeatureConfigProviderBase.URL_KEY)) {
                            Object obj = map.get(MLFeatureConfigProviderBase.URL_KEY);
                            String str = obj instanceof String ? (String) obj : null;
                            if (str != null) {
                                tre.n0(spannableStringBuilder, str, ufeVar.a, ufeVar2.a, f55.g(a8gVar.e(o4cVar.a).m().f(), z).b.a, null, 48);
                            }
                            spannableStringBuilder2 = spannableStringBuilder;
                            o4cVar2 = o4cVar;
                            i4 = i3;
                        } else {
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4c.f(a4cVar, je9Var, "MessageElementFormatter", "Link message element is missing", null, null, 8);
                            }
                        }
                        break;
                    } else {
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4c.f(a4cVar2, je9Var, "MessageElementFormatter", "missing attributes", null, null, 8);
                        }
                    }
                    spannableStringBuilder.removeSpan(m4cVar);
                    int i11 = jeg.a;
                    return ku6.v(spannableStringBuilder);
                case 6:
                    c = 17;
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    i3 = 0;
                    new h5h(0).a(spannableStringBuilder, ufeVar.a, ufeVar2.a);
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                case 7:
                    c = 17;
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    new gu3().a(spannableStringBuilder, ufeVar.a, ufeVar2.a);
                    i3 = 0;
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                case 8:
                    c = 17;
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    new h5h(1).a(spannableStringBuilder, ufeVar.a, ufeVar2.a);
                    i3 = 0;
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                case 9:
                    c = 17;
                    o4cVar = o4cVar2;
                    spannableStringBuilder = spannableStringBuilder2;
                    new ju7().a(spannableStringBuilder, ufeVar.a, ufeVar2.a);
                    i3 = 0;
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                case 10:
                    if (z2) {
                        int length = spannableStringBuilder2.length();
                        if (ufeVar.a <= length && ufeVar2.a <= length) {
                            int iK = i2 > 0 ? i2 : gm0.K(vl5.c(q9i.f.k(bx5.b), o4cVar2.a));
                            l4c l4cVar = new l4c(iK, j, z3);
                            ConcurrentHashMap concurrentHashMap = o4cVar2.j;
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                            c = 17;
                            k4c k4cVar = new k4c(o4cVar2, j, i, z3, iK, spannableStringBuilder3, ufeVar, ufeVar2);
                            o4cVar = o4cVar2;
                            spannableStringBuilder = spannableStringBuilder3;
                            qn qnVar = (qn) concurrentHashMap.computeIfAbsent(l4cVar, new mm(11, k4cVar));
                            try {
                                try {
                                    for (Object obj2 : spannableStringBuilder.getSpans(ufeVar.a, ufeVar2.a, h56.class)) {
                                        spannableStringBuilder.removeSpan(obj2);
                                    }
                                } catch (Throwable unused) {
                                }
                                spannableStringBuilder.setSpan(new rn(j, qnVar), ufeVar.a, ufeVar2.a, 33);
                                poeVar = sbi.a;
                            } catch (Throwable th) {
                                poeVar = new poe(th);
                            }
                            Throwable thA = roe.a(poeVar);
                            if (thA != null) {
                                gm0.V("MessageElementFormatter", "Can't process animoji by message element", thA);
                            }
                            i3 = 0;
                            spannableStringBuilder2 = spannableStringBuilder;
                            o4cVar2 = o4cVar;
                            i4 = i3;
                        } else {
                            o4c o4cVar3 = o4cVar2;
                            SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                je9 je9Var3 = je9.e;
                                if (a4cVar3.b(je9Var3)) {
                                    StringBuilder sbP = qv1.p("Can't process animoji by message element with start:end=", ufeVar.a, ":", ufeVar2.a, ", length:");
                                    sbP.append(length);
                                    a4cVar3.c(je9Var3, "MessageElementFormatter", sbP.toString(), null);
                                }
                            }
                            spannableStringBuilder2 = spannableStringBuilder4;
                            o4cVar2 = o4cVar3;
                        }
                        break;
                    }
                    i4 = 0;
                    break;
                case 11:
                    if (((Boolean) ((e5d) o4cVar2.g.getValue()).o2.a(e5d.S6[170]).i()).booleanValue()) {
                        int i12 = ufeVar.a;
                        int i13 = ufeVar2.a;
                        while (i12 > 0) {
                            int i14 = i12 - 1;
                            if (tre.i0(spannableStringBuilder2.charAt(i14))) {
                                Selection.setSelection(spannableStringBuilder2, Math.min(spannableStringBuilder2.length(), i13));
                                spannableStringBuilder2.delete(i14, i12);
                                i12--;
                                i13--;
                            } else {
                                if (i12 > 0 && spannableStringBuilder2.charAt(i12 - 1) != '\n') {
                                    spannableStringBuilder2.insert(i12, (CharSequence) "\n");
                                    i12++;
                                    i13++;
                                }
                                while (i13 < spannableStringBuilder2.length() && tre.i0(spannableStringBuilder2.charAt(i13))) {
                                    spannableStringBuilder2.delete(i13, i13 + 1);
                                }
                                if (i13 < spannableStringBuilder2.length() && spannableStringBuilder2.charAt(i13) != '\n') {
                                    spannableStringBuilder2.insert(i13, (CharSequence) "\n");
                                }
                                int iMax = Math.max(0, i12);
                                int iMin = Math.min(i13, spannableStringBuilder2.length());
                                Context context = o4cVar2.a;
                                c2 = 17;
                                n1g.e0(spannableStringBuilder2, new y2e(new x2e(o4cVar2.a, ((o1c) o4cVar2.h.getValue()).a, f55.g(a8gVar.e(context).m().f(), z), q9i.t.h(), wk8.p(context, R.drawable.icon_quote), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(2.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), true)), iMax, iMin, 17);
                            }
                        }
                        if (i12 > 0) {
                            spannableStringBuilder2.insert(i12, (CharSequence) "\n");
                            i12++;
                            i13++;
                        }
                        while (i13 < spannableStringBuilder2.length()) {
                            spannableStringBuilder2.delete(i13, i13 + 1);
                        }
                        if (i13 < spannableStringBuilder2.length()) {
                            spannableStringBuilder2.insert(i13, (CharSequence) "\n");
                        }
                        int iMax2 = Math.max(0, i12);
                        int iMin2 = Math.min(i13, spannableStringBuilder2.length());
                        Context context2 = o4cVar2.a;
                        c2 = 17;
                        n1g.e0(spannableStringBuilder2, new y2e(new x2e(o4cVar2.a, ((o1c) o4cVar2.h.getValue()).a, f55.g(a8gVar.e(context2).m().f(), z), q9i.t.h(), wk8.p(context2, R.drawable.icon_quote), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(2.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), true)), iMax2, iMin2, 17);
                    } else {
                        c2 = 17;
                    }
                    o4cVar = o4cVar2;
                    c = c2;
                    spannableStringBuilder = spannableStringBuilder2;
                    i3 = 0;
                    spannableStringBuilder2 = spannableStringBuilder;
                    o4cVar2 = o4cVar;
                    i4 = i3;
                    break;
                default:
                    ore.o();
                    return null;
            }
        }
        spannableStringBuilder = spannableStringBuilder2;
        spannableStringBuilder.removeSpan(m4cVar);
        int i15 = jeg.a;
        return ku6.v(spannableStringBuilder);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, r66] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final List c(CharSequence charSequence, boolean z) {
        Object[] spans;
        ?? T1;
        Object[] spans2;
        ?? arrayList;
        bga bgaVar;
        Map mapSingletonMap;
        bga bgaVar2;
        Object[] spans3;
        ?? arrayList2 = r66.a;
        if (charSequence.length() == 0 || !(charSequence instanceof Spannable)) {
            return arrayList2;
        }
        Spannable spannableB = wh.b((Spannable) charSequence);
        c79 c79VarW = yab.w();
        if (spannableB.length() == 0) {
            T1 = arrayList2;
        } else {
            try {
                spans = spannableB.getSpans(0, spannableB.length(), fga.class);
            } catch (Throwable unused) {
                spans = null;
            }
            if (spans == null) {
                spans = new fga[0];
            }
            ArrayList arrayList3 = new ArrayList();
            for (fga fgaVar : (fga[]) spans) {
                int spanStart = spannableB.getSpanStart(fgaVar);
                int spanEnd = spannableB.getSpanEnd(fgaVar) - spanStart;
                cga cgaVar = fgaVar.a;
                cgaVar.getClass();
                cga cgaVarB = cga.a(cgaVar, spanStart, spanEnd, 39).b();
                if (cgaVarB != null) {
                    arrayList3.add(cgaVarB);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList3);
            yoh.c(spannableB, xoh.a, soc.a, soc.d, true, new jn6(this, z, linkedHashSet));
            T1 = ww3.T1(linkedHashSet);
        }
        boolean zIsEmpty = ((Collection) T1).isEmpty();
        ?? r3 = T1;
        if (zIsEmpty) {
            r3 = 0;
        }
        if (r3 != 0) {
            c79VarW.addAll((Collection) r3);
        }
        if (spannableB.length() == 0) {
            arrayList = arrayList2;
        } else {
            try {
                spans2 = spannableB.getSpans(0, spannableB.length(), gn9.class);
            } catch (Throwable unused2) {
                spans2 = null;
            }
            if (spans2 == null) {
                spans2 = new gn9[0];
            }
            gn9[] gn9VarArr = (gn9[]) spans2;
            if (gn9VarArr.length == 0) {
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
                for (gn9 gn9Var : gn9VarArr) {
                    int spanStart2 = spannableB.getSpanStart(gn9Var);
                    int spanEnd2 = spannableB.getSpanEnd(gn9Var) - spanStart2;
                    switch (qt4.D(gn9Var.getType())) {
                        case 1:
                            bgaVar = bga.d;
                            bgaVar2 = bgaVar;
                            mapSingletonMap = null;
                            break;
                        case 2:
                            bgaVar = bga.e;
                            bgaVar2 = bgaVar;
                            mapSingletonMap = null;
                            break;
                        case 3:
                            bgaVar = bga.i;
                            bgaVar2 = bgaVar;
                            mapSingletonMap = null;
                            break;
                        case 4:
                            bgaVar = bga.c;
                            bgaVar2 = bgaVar;
                            mapSingletonMap = null;
                            break;
                        case 5:
                            bga bgaVar3 = bga.f;
                            mapSingletonMap = Collections.singletonMap(MLFeatureConfigProviderBase.URL_KEY, ((k59) gn9Var).c);
                            bgaVar2 = bgaVar3;
                            break;
                        case 6:
                            bgaVar = bga.g;
                            bgaVar2 = bgaVar;
                            mapSingletonMap = null;
                            break;
                        case 7:
                            bgaVar = bga.j;
                            bgaVar2 = bgaVar;
                            mapSingletonMap = null;
                            break;
                        case 8:
                            bgaVar = bga.h;
                            bgaVar2 = bgaVar;
                            mapSingletonMap = null;
                            break;
                        case 9:
                            bgaVar = bga.l;
                            bgaVar2 = bgaVar;
                            mapSingletonMap = null;
                            break;
                        default:
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.g;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, "p4c", "Unknown markdown span type = ".concat(mw7.l(gn9Var.getType())), null);
                                }
                            }
                            bgaVar2 = null;
                            mapSingletonMap = null;
                            break;
                    }
                    if (bgaVar2 != null) {
                        arrayList.add(new cga(0L, null, bgaVar2, spanStart2, spanEnd2, mapSingletonMap));
                    }
                }
            }
        }
        boolean zIsEmpty2 = ((Collection) arrayList).isEmpty();
        ?? r4 = arrayList;
        if (zIsEmpty2) {
            r4 = 0;
        }
        if (r4 != 0) {
            c79VarW.addAll((Collection) r4);
        }
        if (spannableB.length() != 0) {
            try {
                spans3 = spannableB.getSpans(0, spannableB.length(), rn.class);
            } catch (Throwable unused3) {
                spans3 = null;
            }
            if (spans3 == null) {
                spans3 = new rn[0];
            }
            rn[] rnVarArr = (rn[]) spans3;
            if (rnVarArr.length != 0) {
                arrayList2 = new ArrayList();
                for (rn rnVar : rnVarArr) {
                    int spanStart3 = spannableB.getSpanStart(rnVar);
                    arrayList2.add(new cga(rnVar.e(), null, bga.k, spanStart3, spannableB.getSpanEnd(rnVar) - spanStart3, null));
                }
            }
        }
        ?? r9 = ((Collection) arrayList2).isEmpty() ? 0 : arrayList2;
        if (r9 != 0) {
            c79VarW.addAll((Collection) r9);
        }
        return yab.j(c79VarW);
    }
}
