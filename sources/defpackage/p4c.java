package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.TypedValue;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class p4c {
    public static final /* synthetic */ int t = 0;
    public Context a;
    public final gxb b;
    public final xb9 c;
    public final ny8 d;
    public final woh e;
    public Locale f;
    public int g;
    public String h;
    public Pattern i;
    public final zed j;
    public final b56 k;
    public final gxb l;
    public final p3c m;
    public final ed6 n;
    public final o4c o;
    public final ny8 p;
    public int q;
    public int r;
    public int s;

    public p4c(Context context, zed zedVar, b56 b56Var, p3c p3cVar, gxb gxbVar, ed6 ed6Var, ny8 ny8Var, woh wohVar, o4c o4cVar, ny8 ny8Var2, pa4 pa4Var, final jc9 jc9Var) {
        Context applicationContext = context.getApplicationContext();
        this.c = zedVar.a;
        this.f = Locale.forLanguageTag(jc9Var.b(applicationContext));
        this.a = applicationContext;
        this.b = gxbVar;
        this.d = ny8Var;
        this.e = wohVar;
        int i = pa4.d | pa4.e;
        ((Set) pa4Var.a.computeIfAbsent(Integer.valueOf(i), new ka4(1, new c6(29)))).add(new oa4() { // from class: xr0
            @Override // defpackage.oa4
            public final void a(Context context2) {
                jc9 jc9Var2 = jc9Var;
                Locale localeForLanguageTag = Locale.forLanguageTag(jc9Var2.b(context2));
                p4c p4cVar = this.a;
                p4cVar.f = localeForLanguageTag;
                p4cVar.a = jc9Var2.c(context2);
                oc9.X();
                gm0.k("p4c", new qo7(18, p4cVar));
            }
        });
        gm0.k("p4c", new d2(7, this));
        this.g = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.j = zedVar;
        this.k = b56Var;
        this.m = p3cVar;
        this.l = gxbVar;
        this.n = ed6Var;
        this.o = o4cVar;
        this.p = ny8Var2;
    }

    public final CharSequence a(CharSequence charSequence, boolean z) {
        return b(charSequence, z, true, false, true, null, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:265:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:272:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:273:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:275:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:277:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:278:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:279:0x0405  */
    /* JADX WARN: Code duplicated, block: B:281:0x0409  */
    /* JADX WARN: Code duplicated, block: B:283:0x0412  */
    /* JADX WARN: Code duplicated, block: B:284:0x0416  */
    /* JADX WARN: Code duplicated, block: B:285:0x0420  */
    /* JADX WARN: Code duplicated, block: B:287:0x0424  */
    /* JADX WARN: Code duplicated, block: B:290:0x042b  */
    /* JADX WARN: Code duplicated, block: B:291:0x0432  */
    /* JADX WARN: Code duplicated, block: B:293:0x0436  */
    /* JADX WARN: Code duplicated, block: B:296:0x043d  */
    /* JADX WARN: Code duplicated, block: B:297:0x0444  */
    /* JADX WARN: Code duplicated, block: B:299:0x0448  */
    /* JADX WARN: Code duplicated, block: B:302:0x044f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0456  */
    /* JADX WARN: Code duplicated, block: B:305:0x045a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0461  */
    /* JADX WARN: Code duplicated, block: B:309:0x0467  */
    /* JADX WARN: Code duplicated, block: B:311:0x046b  */
    /* JADX WARN: Code duplicated, block: B:314:0x0472  */
    /* JADX WARN: Code duplicated, block: B:315:0x0478  */
    /* JADX WARN: Code duplicated, block: B:317:0x047c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0484  */
    /* JADX WARN: Code duplicated, block: B:321:0x048a  */
    /* JADX WARN: Code duplicated, block: B:323:0x048e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0496  */
    /* JADX WARN: Code duplicated, block: B:327:0x049c  */
    /* JADX WARN: Code duplicated, block: B:329:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:332:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:333:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:335:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:338:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:339:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:343:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:345:0x04db  */
    /* JADX WARN: Code duplicated, block: B:347:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:349:0x0500  */
    /* JADX WARN: Code duplicated, block: B:359:0x0525  */
    /* JADX WARN: Code duplicated, block: B:362:0x052e  */
    /* JADX WARN: Code duplicated, block: B:365:0x0535  */
    /* JADX WARN: Code duplicated, block: B:371:0x0544  */
    /* JADX WARN: Code duplicated, block: B:374:0x0551  */
    /* JADX WARN: Code duplicated, block: B:378:0x055a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:384:0x056b  */
    /* JADX WARN: Code duplicated, block: B:387:0x0571  */
    /* JADX WARN: Code duplicated, block: B:388:0x057b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0592  */
    /* JADX WARN: Code duplicated, block: B:402:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:415:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:431:0x056f A[EDGE_INSN: B:431:0x056f->B:386:0x056f BREAK  A[LOOP:3: B:358:0x0523->B:385:0x056c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x056f A[EDGE_INSN: B:432:0x056f->B:386:0x056f BREAK  A[LOOP:3: B:358:0x0523->B:385:0x056c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x056c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0565 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final CharSequence b(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6) {
        int i;
        String str;
        String str2;
        int i2;
        boolean zK;
        URLSpan[] uRLSpanArr;
        k59[] k59VarArr;
        ArrayList arrayList;
        int i3;
        boolean z7;
        int spanStart;
        int spanEnd;
        boolean z8;
        int i4;
        int spanStart2;
        int spanEnd2;
        boolean z9;
        int i5;
        Iterator it;
        Spannable spannable;
        Object[] objArr;
        int i6;
        p3c p3cVar;
        Pattern pattern;
        String str3;
        String str4;
        a4c a4cVar;
        String strK;
        boolean[] zArr;
        char[] cArr;
        byte[] bArr;
        short[] sArr;
        double[] dArr;
        long[] jArr;
        float[] fArr;
        int[] iArr;
        Object[] objArr2;
        Map map;
        String string;
        Collection collection;
        String strK2;
        int i7;
        String strK3;
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        if (this.h == null) {
            this.h = this.a.getString(R.string.app_scheme) + "://";
        }
        if (this.i == null) {
            this.i = Pattern.compile(this.h + "[^\\s]+");
        }
        Spannable spannableD = yoh.d(charSequence);
        int iA = this.l.a(z5);
        if (z3) {
            yoh.a(spannableD, t59.c, z, iA);
        }
        int i8 = z4 ? 7 : 1;
        p3c p3cVar2 = this.m;
        je9 je9Var = je9.d;
        p3cVar2.getClass();
        int length = spannableD.length();
        String str5 = "***";
        String str6 = "{}";
        if (length >= 0) {
            int i9 = -1;
            int i10 = 0;
            while (true) {
                Character chR0 = r5h.R0(i10, spannableD);
                if (chR0 == null || tre.l0(chR0.charValue())) {
                    if (i9 >= 0) {
                        i = i8;
                        int i11 = i9;
                        while (true) {
                            str = str5;
                            if (i11 >= i10) {
                                str2 = str6;
                                break;
                            }
                            str2 = str6;
                            if (!r5h.M0("([<{\"'", spannableD.charAt(i11))) {
                                break;
                            }
                            i11++;
                            str5 = str;
                            str6 = str2;
                        }
                        int i12 = i10;
                        while (i12 > i11 && r5h.M0(".,;:!?)]>}\"'", spannableD.charAt(i12 - 1))) {
                            i12--;
                        }
                        if (i12 > i11) {
                            if (p3c.u(spannableD, i11, i12, "http://") || p3c.u(spannableD, i11, i12, "https://") || p3c.u(spannableD, i11, i12, "rtsp://")) {
                                iA = iA;
                                String str7 = (String) p3cVar2.b;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                    a4cVar2.c(je9Var, str7, "isWebUrlCandidate: found web schema", null);
                                }
                            } else if (p3c.u(spannableD, i11, i12, "www.")) {
                                String str8 = (String) p3cVar2.b;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                    a4cVar3.c(je9Var, str8, "isWebUrlCandidate: found www schema", null);
                                }
                                if (i12 > i11 + 4) {
                                }
                            } else {
                                iA = iA;
                                for (int i13 = i11; i13 < i12; i13++) {
                                    if (spannableD.charAt(i13) == '/' || spannableD.charAt(i13) == '?' || spannableD.charAt(i13) == '#') {
                                        i12 = i13;
                                        break;
                                    }
                                }
                                if (i12 > i11) {
                                    boolean z10 = false;
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        if (i11 < i12) {
                                            char cCharAt = spannableD.charAt(i11);
                                            boolean z11 = z10;
                                            if (cCharAt == '.') {
                                                if (i15 != 0) {
                                                    i14 = i15;
                                                    z10 = true;
                                                    i15 = 0;
                                                    i11++;
                                                }
                                            } else if (Character.isLetterOrDigit(cCharAt) || cCharAt == '-') {
                                                i15++;
                                                z10 = z11;
                                                i11++;
                                            }
                                        } else if (z10 && i14 > 0 && i15 >= 2) {
                                        }
                                    }
                                }
                            }
                            String str9 = (String) p3cVar2.b;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                if (gm0.c()) {
                                    strK3 = spannableD.toString();
                                } else if (spannableD instanceof Collection) {
                                    Collection collection2 = (Collection) spannableD;
                                    if (collection2.isEmpty()) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(collection2.size(), "[**", "**]");
                                    }
                                } else if (spannableD instanceof Map) {
                                    Map map2 = (Map) spannableD;
                                    strK3 = map2.isEmpty() ? str2 : c0a.k(map2.size(), "{**", "**}");
                                } else if (spannableD instanceof Object[]) {
                                    Object[] objArr3 = (Object[]) spannableD;
                                    if (objArr3.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(objArr3.length, "[**", "**]");
                                    }
                                } else if (spannableD instanceof int[]) {
                                    int[] iArr2 = (int[]) spannableD;
                                    if (iArr2.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(iArr2.length, "[**", "**]");
                                    }
                                } else if (spannableD instanceof float[]) {
                                    float[] fArr2 = (float[]) spannableD;
                                    if (fArr2.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(fArr2.length, "[**", "**]");
                                    }
                                } else if (spannableD instanceof long[]) {
                                    long[] jArr2 = (long[]) spannableD;
                                    if (jArr2.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(jArr2.length, "[**", "**]");
                                    }
                                } else if (spannableD instanceof double[]) {
                                    double[] dArr2 = (double[]) spannableD;
                                    if (dArr2.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(dArr2.length, "[**", "**]");
                                    }
                                } else if (spannableD instanceof short[]) {
                                    short[] sArr2 = (short[]) spannableD;
                                    if (sArr2.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(sArr2.length, "[**", "**]");
                                    }
                                } else if (spannableD instanceof byte[]) {
                                    byte[] bArr2 = (byte[]) spannableD;
                                    if (bArr2.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(bArr2.length, "[**", "**]");
                                    }
                                } else if (spannableD instanceof char[]) {
                                    char[] cArr2 = (char[]) spannableD;
                                    if (cArr2.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(cArr2.length, "[**", "**]");
                                    }
                                } else if (spannableD instanceof boolean[]) {
                                    boolean[] zArr2 = (boolean[]) spannableD;
                                    if (zArr2.length == 0) {
                                        strK3 = "[]";
                                    } else {
                                        strK3 = c0a.k(zArr2.length, "[**", "**]");
                                    }
                                } else {
                                    strK3 = str;
                                }
                                a4cVar4.c(je9Var, str9, qv1.k("getEffectiveMask: found web_urls in a ", strK3), null);
                            }
                            i2 = i;
                            if (i2 == 0) {
                                str4 = (String) p3cVar2.b;
                                a4cVar = gm0.f;
                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                    if (gm0.c()) {
                                        string = spannableD.toString();
                                    } else {
                                        if (spannableD instanceof Collection) {
                                            collection = (Collection) spannableD;
                                            if (collection.isEmpty()) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(collection.size(), "[**", "**]");
                                            }
                                        } else if (spannableD instanceof Map) {
                                            map = (Map) spannableD;
                                            if (map.isEmpty()) {
                                                strK = str2;
                                            } else {
                                                strK = c0a.k(map.size(), "{**", "**}");
                                            }
                                        } else if (spannableD instanceof Object[]) {
                                            objArr2 = (Object[]) spannableD;
                                            if (objArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(objArr2.length, "[**", "**]");
                                            }
                                        } else if (spannableD instanceof int[]) {
                                            iArr = (int[]) spannableD;
                                            if (iArr.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(iArr.length, "[**", "**]");
                                            }
                                        } else if (spannableD instanceof float[]) {
                                            fArr = (float[]) spannableD;
                                            if (fArr.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(fArr.length, "[**", "**]");
                                            }
                                        } else if (spannableD instanceof long[]) {
                                            jArr = (long[]) spannableD;
                                            if (jArr.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(jArr.length, "[**", "**]");
                                            }
                                        } else if (spannableD instanceof double[]) {
                                            dArr = (double[]) spannableD;
                                            if (dArr.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(dArr.length, "[**", "**]");
                                            }
                                        } else if (spannableD instanceof short[]) {
                                            sArr = (short[]) spannableD;
                                            if (sArr.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(sArr.length, "[**", "**]");
                                            }
                                        } else if (spannableD instanceof byte[]) {
                                            bArr = (byte[]) spannableD;
                                            if (bArr.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(bArr.length, "[**", "**]");
                                            }
                                        } else if (spannableD instanceof char[]) {
                                            cArr = (char[]) spannableD;
                                            if (cArr.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(cArr.length, "[**", "**]");
                                            }
                                        } else if (spannableD instanceof boolean[]) {
                                            zArr = (boolean[]) spannableD;
                                            if (zArr.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(zArr.length, "[**", "**]");
                                            }
                                        } else {
                                            strK = str;
                                        }
                                        string = strK;
                                    }
                                    a4cVar.c(je9Var, str4, qv1.k("addLinks: no need to extract web urls in ", string), null);
                                }
                                zK = false;
                            } else {
                                zK = p3cVar2.k(spannableD, new hb8(i2, 6));
                            }
                            if (zK) {
                                p3cVar = this.m;
                                pattern = this.i;
                                str3 = this.h;
                                p3cVar.getClass();
                                if (p3cVar.k(spannableD, new iaa(pattern, 20, str3))) {
                                    uRLSpanArr = (URLSpan[]) spannableD.getSpans(0, spannableD.length(), URLSpan.class);
                                    if (uRLSpanArr != null && uRLSpanArr.length != 0 && (k59VarArr = (k59[]) spannableD.getSpans(0, spannableD.length(), k59.class)) != null && k59VarArr.length != 0) {
                                        arrayList = new ArrayList(Arrays.asList(k59VarArr));
                                        z7 = false;
                                        for (URLSpan uRLSpan : uRLSpanArr) {
                                            if (!arrayList.isEmpty()) {
                                                break;
                                            }
                                            spanStart = spannableD.getSpanStart(uRLSpan);
                                            if (spanStart >= 0 && (spanEnd = spannableD.getSpanEnd(uRLSpan)) >= 0) {
                                                z8 = z7;
                                                for (i4 = 0; i4 < arrayList.size(); i4++) {
                                                    k59 k59Var = (k59) arrayList.get(i4);
                                                    spanStart2 = spannableD.getSpanStart(k59Var);
                                                    if (spanStart2 >= 0 && (spanEnd2 = spannableD.getSpanEnd(k59Var)) >= 0) {
                                                        if (spanStart2 != spanStart && spanEnd2 == spanEnd) {
                                                            spannableD.removeSpan(uRLSpan);
                                                            arrayList.remove(i4);
                                                            z8 = true;
                                                            break;
                                                        }
                                                        z8 = true;
                                                    }
                                                }
                                                if (!z8) {
                                                    break;
                                                }
                                                z7 = z8;
                                            }
                                        }
                                    }
                                }
                            } else {
                                uRLSpanArr = (URLSpan[]) spannableD.getSpans(0, spannableD.length(), URLSpan.class);
                                if (uRLSpanArr != null) {
                                    arrayList = new ArrayList(Arrays.asList(k59VarArr));
                                    z7 = false;
                                    while (i3 < r3) {
                                        if (!arrayList.isEmpty()) {
                                            break;
                                            break;
                                        }
                                        spanStart = spannableD.getSpanStart(uRLSpan);
                                        if (spanStart >= 0) {
                                            z8 = z7;
                                            while (i4 < arrayList.size()) {
                                                k59 k59Var2 = (k59) arrayList.get(i4);
                                                spanStart2 = spannableD.getSpanStart(k59Var2);
                                                if (spanStart2 >= 0) {
                                                    if (spanStart2 != spanStart) {
                                                    }
                                                    z8 = true;
                                                }
                                            }
                                            if (!z8) {
                                                break;
                                                break;
                                            }
                                            z7 = z8;
                                        }
                                    }
                                }
                            }
                            if (z6) {
                                z9 = z;
                                i5 = iA;
                                yoh.a(spannableD, t59.d, z9, i5);
                            } else {
                                z9 = z;
                                i5 = iA;
                            }
                            if (list != null && !list.isEmpty()) {
                                it = list.iterator();
                                spannable = spannableD;
                                while (it.hasNext()) {
                                    cga cgaVar = (cga) it.next();
                                    int i16 = cgaVar.d;
                                    objArr = (rud[]) spannable.getSpans(i16, cgaVar.e + i16, rud.class);
                                    if (objArr != null && objArr.length > 0) {
                                        for (Object obj : objArr) {
                                            try {
                                                spannable.removeSpan(obj);
                                            } catch (Exception | StackOverflowError e) {
                                                if (e instanceof StackOverflowError) {
                                                    ((t1c) this.n).a(e);
                                                }
                                            }
                                        }
                                    }
                                    spannable = (Spannable) c(spannable, cgaVar, false, z5);
                                }
                                spannableD = spannable;
                            }
                            if (z2) {
                                yoh.a(spannableD, t59.b, z9, i5);
                            }
                            return spannableD;
                        }
                        String str10 = (String) p3cVar2.b;
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                            a4cVar5.c(je9Var, str10, "isWebUrlCandidate: start & end condition failed", null);
                        }
                        iA = iA;
                    } else {
                        iA = iA;
                        i = i8;
                        str = str5;
                        str2 = str6;
                    }
                    i7 = -1;
                } else {
                    if (i9 < 0) {
                        i9 = i10;
                    }
                    iA = iA;
                    i = i8;
                    str2 = str6;
                    i7 = i9;
                    str = str5;
                }
                if (i10 != length) {
                    i10++;
                    str5 = str;
                    i8 = i;
                    str6 = str2;
                    iA = iA;
                    i9 = i7;
                }
            }
        } else {
            iA = iA;
            i = i8;
            str = "***";
            str2 = "{}";
        }
        String str11 = (String) p3cVar2.b;
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
            if (gm0.c()) {
                strK2 = spannableD.toString();
            } else if (spannableD instanceof Collection) {
                Collection collection3 = (Collection) spannableD;
                if (collection3.isEmpty()) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(collection3.size(), "[**", "**]");
                }
            } else if (spannableD instanceof Map) {
                Map map3 = (Map) spannableD;
                strK2 = map3.isEmpty() ? str2 : c0a.k(map3.size(), "{**", "**}");
            } else if (spannableD instanceof Object[]) {
                Object[] objArr4 = (Object[]) spannableD;
                if (objArr4.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(objArr4.length, "[**", "**]");
                }
            } else if (spannableD instanceof int[]) {
                int[] iArr3 = (int[]) spannableD;
                if (iArr3.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(iArr3.length, "[**", "**]");
                }
            } else if (spannableD instanceof float[]) {
                float[] fArr3 = (float[]) spannableD;
                if (fArr3.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(fArr3.length, "[**", "**]");
                }
            } else if (spannableD instanceof long[]) {
                long[] jArr3 = (long[]) spannableD;
                if (jArr3.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(jArr3.length, "[**", "**]");
                }
            } else if (spannableD instanceof double[]) {
                double[] dArr3 = (double[]) spannableD;
                if (dArr3.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(dArr3.length, "[**", "**]");
                }
            } else if (spannableD instanceof short[]) {
                short[] sArr3 = (short[]) spannableD;
                if (sArr3.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(sArr3.length, "[**", "**]");
                }
            } else if (spannableD instanceof byte[]) {
                byte[] bArr3 = (byte[]) spannableD;
                if (bArr3.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(bArr3.length, "[**", "**]");
                }
            } else if (spannableD instanceof char[]) {
                char[] cArr3 = (char[]) spannableD;
                if (cArr3.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(cArr3.length, "[**", "**]");
                }
            } else if (spannableD instanceof boolean[]) {
                boolean[] zArr3 = (boolean[]) spannableD;
                if (zArr3.length == 0) {
                    strK2 = "[]";
                } else {
                    strK2 = c0a.k(zArr3.length, "[**", "**]");
                }
            } else {
                strK2 = str;
            }
            a4cVar6.c(je9Var, str11, qv1.k("getEffectiveMask: no web_urls found, reset linkify flag in ", strK2), null);
        }
        i2 = i & (-2);
        if (i2 == 0) {
            str4 = (String) p3cVar2.b;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                if (gm0.c()) {
                    string = spannableD.toString();
                } else {
                    if (spannableD instanceof Collection) {
                        collection = (Collection) spannableD;
                        if (collection.isEmpty()) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(collection.size(), "[**", "**]");
                        }
                    } else if (spannableD instanceof Map) {
                        map = (Map) spannableD;
                        if (map.isEmpty()) {
                            strK = str2;
                        } else {
                            strK = c0a.k(map.size(), "{**", "**}");
                        }
                    } else if (spannableD instanceof Object[]) {
                        objArr2 = (Object[]) spannableD;
                        if (objArr2.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(objArr2.length, "[**", "**]");
                        }
                    } else if (spannableD instanceof int[]) {
                        iArr = (int[]) spannableD;
                        if (iArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(iArr.length, "[**", "**]");
                        }
                    } else if (spannableD instanceof float[]) {
                        fArr = (float[]) spannableD;
                        if (fArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(fArr.length, "[**", "**]");
                        }
                    } else if (spannableD instanceof long[]) {
                        jArr = (long[]) spannableD;
                        if (jArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(jArr.length, "[**", "**]");
                        }
                    } else if (spannableD instanceof double[]) {
                        dArr = (double[]) spannableD;
                        if (dArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(dArr.length, "[**", "**]");
                        }
                    } else if (spannableD instanceof short[]) {
                        sArr = (short[]) spannableD;
                        if (sArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(sArr.length, "[**", "**]");
                        }
                    } else if (spannableD instanceof byte[]) {
                        bArr = (byte[]) spannableD;
                        if (bArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(bArr.length, "[**", "**]");
                        }
                    } else if (spannableD instanceof char[]) {
                        cArr = (char[]) spannableD;
                        if (cArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(cArr.length, "[**", "**]");
                        }
                    } else if (spannableD instanceof boolean[]) {
                        zArr = (boolean[]) spannableD;
                        if (zArr.length == 0) {
                            strK = "[]";
                        } else {
                            strK = c0a.k(zArr.length, "[**", "**]");
                        }
                    } else {
                        strK = str;
                    }
                    string = strK;
                }
                a4cVar.c(je9Var, str4, qv1.k("addLinks: no need to extract web urls in ", string), null);
            }
            zK = false;
        } else {
            zK = p3cVar2.k(spannableD, new hb8(i2, 6));
        }
        if (zK) {
            uRLSpanArr = (URLSpan[]) spannableD.getSpans(0, spannableD.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                arrayList = new ArrayList(Arrays.asList(k59VarArr));
                z7 = false;
                while (i3 < r3) {
                    if (!arrayList.isEmpty()) {
                        break;
                        break;
                    }
                    spanStart = spannableD.getSpanStart(uRLSpan);
                    if (spanStart >= 0) {
                        z8 = z7;
                        while (i4 < arrayList.size()) {
                            k59 k59Var3 = (k59) arrayList.get(i4);
                            spanStart2 = spannableD.getSpanStart(k59Var3);
                            if (spanStart2 >= 0) {
                                if (spanStart2 != spanStart) {
                                }
                                z8 = true;
                            }
                        }
                        if (!z8) {
                            break;
                            break;
                        }
                        z7 = z8;
                    }
                }
            }
        } else {
            p3cVar = this.m;
            pattern = this.i;
            str3 = this.h;
            p3cVar.getClass();
            if (p3cVar.k(spannableD, new iaa(pattern, 20, str3))) {
                uRLSpanArr = (URLSpan[]) spannableD.getSpans(0, spannableD.length(), URLSpan.class);
                if (uRLSpanArr != null) {
                    arrayList = new ArrayList(Arrays.asList(k59VarArr));
                    z7 = false;
                    while (i3 < r3) {
                        if (!arrayList.isEmpty()) {
                            break;
                            break;
                        }
                        spanStart = spannableD.getSpanStart(uRLSpan);
                        if (spanStart >= 0) {
                            z8 = z7;
                            while (i4 < arrayList.size()) {
                                k59 k59Var4 = (k59) arrayList.get(i4);
                                spanStart2 = spannableD.getSpanStart(k59Var4);
                                if (spanStart2 >= 0) {
                                    if (spanStart2 != spanStart) {
                                    }
                                    z8 = true;
                                }
                            }
                            if (!z8) {
                                break;
                                break;
                            }
                            z7 = z8;
                        }
                    }
                }
            }
        }
        if (z6) {
            z9 = z;
            i5 = iA;
            yoh.a(spannableD, t59.d, z9, i5);
        } else {
            z9 = z;
            i5 = iA;
        }
        if (list != null) {
            it = list.iterator();
            spannable = spannableD;
            while (it.hasNext()) {
                cga cgaVar2 = (cga) it.next();
                int i17 = cgaVar2.d;
                objArr = (rud[]) spannable.getSpans(i17, cgaVar2.e + i17, rud.class);
                if (objArr != null) {
                    while (i6 < r8) {
                        spannable.removeSpan(obj);
                    }
                }
                spannable = (Spannable) c(spannable, cgaVar2, false, z5);
            }
            spannableD = spannable;
        }
        if (z2) {
            yoh.a(spannableD, t59.b, z9, i5);
        }
        return spannableD;
    }

    public final CharSequence c(CharSequence charSequence, cga cgaVar, boolean z, boolean z2) {
        EnumSet enumSet = cga.g;
        bga bgaVar = cgaVar.c;
        int i = cgaVar.e;
        int i2 = cgaVar.d;
        if (enumSet.contains(bgaVar)) {
            return charSequence;
        }
        int i3 = i2 + i;
        if (i3 > charSequence.length() || i2 < 0) {
            gm0.W("p4c", "addMessageElement: can't add message element, text length: %s, from: %s, length: %s", Integer.valueOf(charSequence.length()), Integer.valueOf(i2), Integer.valueOf(i));
            return charSequence;
        }
        if (z && charSequence.charAt(i2) == '@') {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new fga(cgaVar, this.b.a(z2)), i2, i3, 33);
        return spannableStringBuilder;
    }

    public final String d(long j) {
        dc1 dc1VarJ = oc9.J(j, this.c.f());
        Context context = this.a;
        Locale locale = this.f;
        String[] strArr = woh.b;
        int i = dc1VarJ.a;
        long j2 = dc1VarJ.b;
        switch (qt4.D(i)) {
            case 0:
                return context.getString(R.string.tt_dates_right_now);
            case 1:
                return woh.q(R.plurals.tt_dates_minutes_past, (int) j2, context);
            case 2:
                return woh.q(R.plurals.tt_dates_hours_past, (int) j2, context);
            case 3:
                return String.format(context.getString(R.string.tt_dates_yesterday_at), oc9.F(context, j2, locale));
            case 4:
                return woh.q(R.plurals.tt_dates_days_past, (int) j2, context);
            case 5:
                return woh.q(R.plurals.tt_dates_weeks_past, (int) j2, context);
            case 6:
                return woh.q(R.plurals.tt_dates_months_past, (int) j2, context);
            case 7:
                return oc9.K(locale, j2, true);
            default:
                return "";
        }
    }

    public final String e(long j) {
        String str;
        String str2;
        switch (qt4.D(oc9.J(j, this.c.f()).a)) {
            case 0:
            case 1:
            case 2:
                return oc9.F(this.a, j, this.f);
            case 3:
                Context context = this.a;
                return context.getString(R.string.tt_dates_yesterday_format, oc9.F(context, j, this.f));
            case 4:
            case 5:
            case 6:
            case 8:
                Locale locale = this.f;
                synchronized ("dd MMM") {
                    if (oc9.o == null) {
                        oc9.o = new SimpleDateFormat("dd MMM", locale);
                    }
                    str = oc9.o.format(Long.valueOf(j));
                    break;
                }
                return str;
            case 7:
                Locale locale2 = this.f;
                synchronized ("dd MMM yyyy") {
                    if (oc9.p == null) {
                        oc9.p = new SimpleDateFormat("dd MMM yyyy", locale2);
                    }
                    str2 = oc9.p.format(Long.valueOf(j));
                    break;
                }
                return str2;
            case 9:
                return this.a.getString(R.string.presence_was_long_ago);
            default:
                throw new RuntimeException(null, null);
        }
    }

    public final int f() {
        if (this.r == -1) {
            this.r = (int) this.a.getResources().getDimension(R.dimen.font_only_emoji);
        }
        return this.r;
    }

    public final ArrayList g(CharSequence charSequence) {
        List listD = this.k.a().d(charSequence);
        ArrayList arrayList = new ArrayList(yw3.W0(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add((CharSequence) ((ylc) it.next()).a);
        }
        return arrayList;
    }

    public final int h() {
        if (this.q == -1) {
            this.q = (int) (TypedValue.applyDimension(2, this.j.c.d.getFloat("app.extra.text.size.sp", 0.0f), yl5.d().getDisplayMetrics()) + this.a.getResources().getDimension(R.dimen.font_normal));
        }
        return this.q;
    }

    public final int i() {
        if (this.s == -1) {
            this.s = (int) (TypedValue.applyDimension(2, this.j.c.d.getFloat("app.extra.text.size.sp", 0.0f), yl5.d().getDisplayMetrics()) + this.a.getResources().getDimension(R.dimen.font_small));
        }
        return this.s;
    }

    public final boolean j(int i, CharSequence charSequence) {
        this.k.a().getClass();
        if (charSequence == null || charSequence.length() == 0 || i < 0 || i > r5h.Q0(charSequence)) {
            return false;
        }
        Set set = g46.a;
        int iCodePointAt = charSequence.toString().codePointAt(i);
        return g46.a(iCodePointAt) || iCodePointAt == 8205 || iCodePointAt == 8419;
    }

    public final xcd k(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? xcd.a() : new xcd(this.k.d(charSequence), xoh.c(charSequence.toString(), this));
    }

    public final xcd l(String str, ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            return xcd.a();
        }
        return arrayList.isEmpty() ? k(str) : new xcd(m(str, arrayList, yl5.b(18)), xoh.c(str.toString(), this));
    }

    public final CharSequence m(CharSequence charSequence, List list, int i) {
        List list2;
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        boolean zA = ((jn) this.p.getValue()).a();
        b56 b56Var = this.k;
        if (!zA) {
            return b56Var.c(i, charSequence);
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            list2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                try {
                    if (((cga) obj).c == bga.k) {
                        arrayList.add(obj);
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            }
            list2 = arrayList;
        }
        return list2.isEmpty() ? b56Var.c(i, charSequence) : this.o.a(charSequence, list2, 1, false, i, true, true);
    }

    public final CharSequence n(CharSequence charSequence, List list, boolean z, int i, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        return this.o.a(charSequence, list, 1, z, i, z2 && ((jn) this.p.getValue()).a(), true);
    }

    public final CharSequence o(CharSequence charSequence, List list) {
        CharSequence charSequenceN = n(charSequence, list, true, 0, false);
        if (TextUtils.isEmpty(charSequenceN) || p90.D(list)) {
            return charSequenceN;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequenceN);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cga cgaVar = (cga) it.next();
            if (cgaVar.c == bga.a) {
                spannableStringBuilder = c(spannableStringBuilder, cgaVar, false, true);
            }
        }
        return spannableStringBuilder;
    }
}
