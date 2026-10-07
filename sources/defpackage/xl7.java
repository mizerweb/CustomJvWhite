package defpackage;

import android.text.Spanned;
import android.util.ArraySet;
import android.util.Patterns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes4.dex */
public final class xl7 {
    public final ny8 a;
    public final ny8 b;

    public xl7(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    public final List a(rt2 rt2Var, CharSequence charSequence) {
        List listC;
        bga bgaVar;
        Object[] spans;
        int length;
        int i;
        String strGroup;
        Object[] spans2;
        k59[] k59VarArr;
        CharSequence charSequenceY1 = charSequence != null ? r5h.y1(charSequence) : null;
        if (charSequenceY1 == null || charSequenceY1.length() == 0) {
            return r66.a;
        }
        Spanned spanned = charSequenceY1 instanceof Spanned ? (Spanned) charSequenceY1 : null;
        String string = charSequenceY1.toString();
        ny8 ny8Var = this.a;
        int i2 = 0;
        if (rt2Var != null) {
            nx2 nx2Var = rt2Var.b;
            p4c p4cVar = (p4c) ny8Var.getValue();
            p4cVar.getClass();
            listC = p4cVar.o.c(charSequenceY1, nx2Var.e.size() >= nx2Var.b());
        } else {
            listC = ((p4c) ny8Var.getValue()).o.c(charSequenceY1, true);
        }
        ArrayList arrayList = new ArrayList(listC.size());
        arrayList.addAll(listC);
        ArraySet arraySet = new ArraySet(listC.size());
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bgaVar = bga.f;
            if (!zHasNext) {
                break;
            }
            cga cgaVar = (cga) it.next();
            int i3 = cgaVar.d;
            int i4 = cgaVar.e;
            int i5 = i3 + i4;
            if (i4 > 0) {
                int length2 = string.length();
                if (i3 >= 0 && i3 <= i5 && i5 <= length2) {
                    if (cgaVar.c == bgaVar) {
                        Map map = cgaVar.f;
                        Object obj = map != null ? map.get(MLFeatureConfigProviderBase.URL_KEY) : null;
                        if (spanned != null) {
                            try {
                                spans2 = spanned.getSpans(i3, i5, k59.class);
                            } catch (Throwable unused) {
                                spans2 = null;
                            }
                            k59VarArr = (k59[]) spans2;
                            if (k59VarArr == null) {
                                k59VarArr = new k59[0];
                            }
                        } else {
                            k59VarArr = new k59[0];
                        }
                        String strSubstring = string.substring(i3, i5);
                        if ((obj instanceof CharSequence) && !strSubstring.equals(obj.toString()) && k59VarArr.length == 0) {
                            it.remove();
                        } else {
                            arraySet.add(new bj8(bj8.a(i3, i5)));
                        }
                    }
                }
            }
            it.remove();
        }
        if (rt2Var == null || !(rt2Var instanceof s04)) {
            Matcher matcher = Patterns.WEB_URL.matcher(string);
            while (matcher.find()) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                long jA = bj8.a(iStart, iEnd);
                if (!arraySet.contains(new bj8(jA))) {
                    if (spanned != null) {
                        try {
                            spans = spanned.getSpans(iStart, iEnd, k59.class);
                            while (true) {
                                if (i < length) {
                                    Object obj2 = spans[i];
                                    if (spanned.getSpanStart(obj2) > iStart || spanned.getSpanEnd(obj2) < iEnd) {
                                        i++;
                                    }
                                } else {
                                    strGroup = matcher.group();
                                    if (strGroup != null) {
                                        arrayList.add(new cga(0L, null, bgaVar, iStart, iEnd - iStart, Collections.singletonMap(MLFeatureConfigProviderBase.URL_KEY, strGroup)));
                                        arraySet.add(new bj8(jA));
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                            spans = null;
                        }
                        if (spans == null) {
                            spans = new k59[i2];
                        }
                        length = spans.length;
                        i = i2;
                    } else {
                        strGroup = matcher.group();
                        if (strGroup != null) {
                            arrayList.add(new cga(0L, null, bgaVar, iStart, iEnd - iStart, Collections.singletonMap(MLFeatureConfigProviderBase.URL_KEY, strGroup)));
                            arraySet.add(new bj8(jA));
                        }
                    }
                    i2 = 0;
                }
            }
        }
        return arrayList;
    }

    public final List b(CharSequence charSequence, long j) {
        rt2 rt2Var = (rt2) ((xn3) this.b.getValue()).k(j).a.getValue();
        return rt2Var == null ? r66.a : a(rt2Var, charSequence);
    }
}
