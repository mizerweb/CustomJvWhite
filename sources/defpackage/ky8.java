package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ky8 {
    public final ed6 a;
    public final ifh c;
    public final t3a d;
    public final String b = ky8.class.getName();
    public final ThreadLocal e = ThreadLocal.withInitial(new uw3(1));

    public ky8(xhh xhhVar, ed6 ed6Var, ic1 ic1Var) {
        this.a = ed6Var;
        this.c = new ifh(new x5(ic1Var, 18, xhhVar));
        this.d = new t3a(ed6Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    public static Layout a(ky8 ky8Var, CharSequence charSequence, TextPaint textPaint, int i, int i2, boolean z, TextUtils.TruncateAt truncateAt, float f, boolean z2, int i3) {
        ky8 ky8Var2;
        Layout layoutB;
        Layout layoutB2;
        char cCharAt;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if ((i3 & 16) != 0) {
            ky8Var.getClass();
            alignment = (charSequence == null || charSequence.length() == 0 || 1424 > (cCharAt = charSequence.charAt(0)) || cCharAt >= 1792) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        boolean z3 = (i3 & 32) != 0 ? false : z;
        TextUtils.TruncateAt truncateAt2 = (i3 & 64) != 0 ? TextUtils.TruncateAt.END : truncateAt;
        float f2 = (i3 & np0.m) != 0 ? 0.0f : f;
        boolean z4 = (i3 & np0.n) != 0 ? false : z2;
        ky8Var.getClass();
        int iK = gm0.K(textPaint.measureText(charSequence, 0, charSequence.length()));
        ThreadLocal threadLocal = ky8Var.e;
        if (BoringLayout.isBoring(charSequence, textPaint, (BoringLayout.Metrics) threadLocal.get()) == null) {
            ky8Var2 = ky8Var;
            layoutB = ky8Var2.b(charSequence, textPaint, iK, i, alignment2, z3, truncateAt2, i2, f2);
        } else {
            Object obj = threadLocal.get();
            if (obj == null) {
                ore.p("Required value was null.");
                return null;
            }
            if (((BoringLayout.Metrics) obj).width > i || z4) {
                ky8Var2 = ky8Var;
                layoutB = ky8Var2.b(charSequence, textPaint, iK, i, alignment2, z3, truncateAt2, i2, f2);
            } else {
                BoringLayout boringLayoutMake = BoringLayout.make(charSequence, textPaint, iK, alignment2, 1.0f, f2, (BoringLayout.Metrics) threadLocal.get(), false);
                if (boringLayoutMake.getHeight() == 0) {
                    layoutB2 = boringLayoutMake;
                    layoutB2 = ky8Var.b(charSequence, textPaint, iK, i, alignment2, z3, truncateAt2, i2, f2);
                }
                layoutB2 = boringLayoutMake;
                ky8Var2 = ky8Var;
                layoutB = layoutB2;
            }
        }
        Layout layout = layoutB;
        try {
            ao7 ao7Var = (ao7) ky8Var2.c.getValue();
            if (ao7Var == null) {
                return layout;
            }
            yab.i0(ao7Var.a, null, 0, new el6(layout, ao7Var, null, 8), 3);
            return layout;
        } catch (Throwable th) {
            gm0.V(ky8Var2.b, "could not warm layout", th);
            return layout;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01be A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:98:0x01ab, B:100:0x01be, B:101:0x01c9, B:103:0x01d0, B:106:0x01e2, B:107:0x01eb, B:108:0x01f0), top: B:161:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01d0 A[Catch: all -> 0x01e0, LOOP:0: B:101:0x01c9->B:103:0x01d0, LOOP_END, TryCatch #0 {all -> 0x01e0, blocks: (B:98:0x01ab, B:100:0x01be, B:101:0x01c9, B:103:0x01d0, B:106:0x01e2, B:107:0x01eb, B:108:0x01f0), top: B:161:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01eb A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:98:0x01ab, B:100:0x01be, B:101:0x01c9, B:103:0x01d0, B:106:0x01e2, B:107:0x01eb, B:108:0x01f0), top: B:161:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:115:0x0204  */
    /* JADX WARN: Code duplicated, block: B:130:0x025d A[Catch: all -> 0x027f, TryCatch #7 {all -> 0x027f, blocks: (B:128:0x024a, B:130:0x025d, B:131:0x0268, B:133:0x026f, B:136:0x0281, B:137:0x028a, B:138:0x028f), top: B:174:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:133:0x026f A[Catch: all -> 0x027f, LOOP:1: B:131:0x0268->B:133:0x026f, LOOP_END, TryCatch #7 {all -> 0x027f, blocks: (B:128:0x024a, B:130:0x025d, B:131:0x0268, B:133:0x026f, B:136:0x0281, B:137:0x028a, B:138:0x028f), top: B:174:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:137:0x028a A[Catch: all -> 0x027f, TryCatch #7 {all -> 0x027f, blocks: (B:128:0x024a, B:130:0x025d, B:131:0x0268, B:133:0x026f, B:136:0x0281, B:137:0x028a, B:138:0x028f), top: B:174:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:143:0x029c  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a0 A[PHI: r2 r13
  0x02a0: PHI (r2v15 android.text.StaticLayout) = 
  (r2v14 android.text.StaticLayout)
  (r2v25 android.text.StaticLayout)
  (r2v14 android.text.StaticLayout)
  (r2v14 android.text.StaticLayout)
 binds: [B:114:0x0202, B:127:0x0248, B:147:0x02a7, B:148:0x02a9] A[DONT_GENERATE, DONT_INLINE]
  0x02a0: PHI (r13v8 ??) = (r13v20 ??), (r13v21 ??), (r13v22 ??), (r13v23 ??) binds: [B:114:0x0202, B:127:0x0248, B:147:0x02a7, B:148:0x02a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v22, types: [t3a] */
    /* JADX WARN: Type inference failed for: r2v26, types: [t3a] */
    /* JADX WARN: Type inference failed for: r2v27, types: [t3a] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.StringBuilder] */
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
    public final StaticLayout b(CharSequence charSequence, TextPaint textPaint, int i, int i2, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i3, float f) {
        int i4;
        ?? sb;
        ?? r3;
        int iK;
        int iMax;
        int i5;
        StaticLayout staticLayoutL;
        ?? r13;
        StaticLayout staticLayout;
        Object poeVar;
        boolean z2;
        Object obj;
        Integer num;
        ?? r14;
        Integer num2;
        ?? r15;
        ?? r4;
        StaticLayout staticLayoutL2;
        StaticLayout staticLayoutL3;
        ?? r16;
        Object poeVar2;
        Iterator it;
        float lineMax;
        ?? r5;
        Iterator it2;
        float lineMax2;
        String str = this.b;
        try {
            try {
                if (charSequence.length() == 0) {
                    sb = charSequence;
                    i4 = 1;
                    r3 = sb;
                } else {
                    char c = '\n';
                    if (!r5h.M0(charSequence, '\n')) {
                        sb = charSequence;
                    } else if (charSequence instanceof Spanned) {
                        i4 = 1;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((Spanned) charSequence);
                        float fMeasureText = textPaint.measureText(" ");
                        int i6 = 0;
                        while (true) {
                            int length = spannableStringBuilder.length();
                            r3 = spannableStringBuilder;
                            if (i6 >= length) {
                                break;
                            }
                            if (spannableStringBuilder.charAt(i6) == ' ' || spannableStringBuilder.charAt(i6) == '\t') {
                                int i7 = i6;
                                int i8 = 0;
                                while (i7 < spannableStringBuilder.length() && (spannableStringBuilder.charAt(i7) == ' ' || spannableStringBuilder.charAt(i7) == '\t')) {
                                    i8++;
                                    i7++;
                                }
                                if (i7 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i7) != c) {
                                    i6 = i7;
                                } else {
                                    CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(0, i6);
                                    float fMeasureText2 = textPaint.measureText(charSequenceSubSequence, 0, charSequenceSubSequence.length());
                                    int i9 = i8;
                                    while (i9 > 0 && (i9 * fMeasureText) + fMeasureText2 > i2) {
                                        i9--;
                                    }
                                    if (i8 - i9 > 0) {
                                        i7 = i6 + i9;
                                        spannableStringBuilder.delete(i7, i6 + i8);
                                    }
                                    i6 = i7 + 1;
                                }
                                c = '\n';
                            } else {
                                i6++;
                            }
                        }
                        iK = gm0.K(Layout.getDesiredWidth(r3, textPaint));
                        iMax = Math.max(iK, i);
                        if (iMax > i2) {
                            i5 = i2;
                        } else {
                            i5 = iMax;
                        }
                        staticLayoutL = this.d.l(r3, textPaint, i5, alignment, z, truncateAt, i3, f);
                        r13 = r3;
                        staticLayout = staticLayoutL;
                        if (staticLayout.getLineCount() > i4) {
                            return staticLayout;
                        }
                        try {
                            it2 = oc9.f0(0, staticLayout.getLineCount()).iterator();
                            if (((gj8) it2).c) {
                                throw new NoSuchElementException();
                            }
                            lineMax2 = staticLayout.getLineMax(((gj8) it2).nextInt());
                            while (((gj8) it2).c) {
                                lineMax2 = Math.max(lineMax2, staticLayout.getLineMax(((gj8) it2).nextInt()));
                            }
                            poeVar = Integer.valueOf(gm0.K(lineMax2));
                            z2 = poeVar instanceof poe;
                            num2 = null;
                            obj = poeVar;
                            if (z2) {
                                obj = null;
                            }
                            num = (Integer) obj;
                            r14 = r13;
                            if (num == null) {
                                r14 = r13;
                                r14 = r13;
                                num2 = num;
                                r15 = r14;
                            } else if (num.intValue() < i5) {
                                try {
                                    r5 = r13;
                                    try {
                                        staticLayoutL3 = this.d.l(r5, textPaint, i2, alignment, z, truncateAt, i3, f);
                                        r16 = r5;
                                    } catch (Throwable th) {
                                        th = th;
                                        r13 = r5;
                                        gm0.V(str, "static layout create error 2", th);
                                        staticLayoutL3 = this.d.l(r13.toString(), textPaint, i2, alignment, z, truncateAt, i3, f);
                                        r16 = r13;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                staticLayout = staticLayoutL3;
                                r14 = r16;
                                if (staticLayout.getLineCount() == 1) {
                                    try {
                                        it = oc9.f0(0, staticLayout.getLineCount()).iterator();
                                        if (((gj8) it).c) {
                                            throw new NoSuchElementException();
                                        }
                                        lineMax = staticLayout.getLineMax(((gj8) it).nextInt());
                                        while (((gj8) it).c) {
                                            lineMax = Math.max(lineMax, staticLayout.getLineMax(((gj8) it).nextInt()));
                                        }
                                        poeVar2 = Integer.valueOf(gm0.K(lineMax));
                                        num2 = (Integer) (poeVar2 instanceof poe ? null : poeVar2);
                                        r15 = r16;
                                    } catch (Throwable th3) {
                                        poeVar2 = new poe(th3);
                                    }
                                } else {
                                    r14 = r13;
                                    r14 = r13;
                                    num2 = num;
                                    r15 = r14;
                                }
                            } else if (num.intValue() >= i5 || i5 != i2) {
                                r14 = r13;
                                r14 = r13;
                                num2 = num;
                                r15 = r14;
                            } else {
                                gm0.Y(str, "maxLineWidth more than maxWidth");
                                r15 = r13;
                            }
                            if (num2 != null) {
                                return staticLayout;
                            }
                            try {
                                r4 = r15;
                                try {
                                    staticLayoutL2 = this.d.l(r4, textPaint, num2.intValue() + 2, alignment, z, truncateAt, i3, f);
                                } catch (Throwable th4) {
                                    th = th4;
                                    gm0.V(str, "static layout create error 3", th);
                                    staticLayoutL2 = this.d.l(r4.toString(), textPaint, num2.intValue() + 2, alignment, z, truncateAt, i3, f);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                r4 = r15;
                            }
                            return staticLayoutL2;
                        } catch (Throwable th6) {
                            poeVar = new poe(th6);
                        }
                    } else {
                        sb = new StringBuilder(charSequence.length());
                        float fMeasureText3 = textPaint.measureText(" ");
                        int i10 = 0;
                        while (i10 < charSequence.length()) {
                            if (charSequence.charAt(i10) == ' ' || charSequence.charAt(i10) == '\t') {
                                int i11 = i10;
                                int i12 = 0;
                                while (i11 < charSequence.length() && (charSequence.charAt(i11) == ' ' || charSequence.charAt(i11) == '\t')) {
                                    i12++;
                                    i11++;
                                }
                                if (i11 >= charSequence.length() || charSequence.charAt(i11) != '\n') {
                                    sb.append(charSequence, i10, i11);
                                } else {
                                    CharSequence charSequenceSubSequence2 = charSequence.subSequence(0, i10);
                                    float fMeasureText4 = textPaint.measureText(charSequenceSubSequence2, 0, charSequenceSubSequence2.length());
                                    while (i12 > 0 && (i12 * fMeasureText3) + fMeasureText4 > i2) {
                                        i12--;
                                    }
                                    if (i12 > 0) {
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            sb.append(' ');
                                        }
                                    }
                                    sb.append('\n');
                                    i11++;
                                }
                                i10 = i11;
                            } else {
                                if (charSequence.charAt(i10) == '\n') {
                                    sb.append('\n');
                                } else {
                                    sb.append(charSequence.charAt(i10));
                                }
                                i10++;
                            }
                        }
                    }
                    i4 = 1;
                    r3 = sb;
                }
                staticLayoutL = this.d.l(r3, textPaint, i5, alignment, z, truncateAt, i3, f);
                r13 = r3;
            } catch (Throwable th7) {
                ?? r17 = r3;
                gm0.V(str, "static layout create error", th7);
                staticLayoutL = this.d.l(r17.toString(), textPaint, i5, alignment, z, truncateAt, i3, f);
                r13 = r17;
            }
            iK = gm0.K(Layout.getDesiredWidth(r3, textPaint));
        } catch (Throwable th8) {
            gm0.m(str, "fail to getDesiredWidth for message %s", r3, th8);
            ((t1c) this.a).a(new IllegalStateException(str + ". fail to getDesiredWidth for message " + r3, th8));
            iK = 0;
        }
        iMax = Math.max(iK, i);
        if (iMax > i2) {
            i5 = i2;
        } else {
            i5 = iMax;
        }
        staticLayout = staticLayoutL;
        if (staticLayout.getLineCount() > i4) {
            return staticLayout;
        }
        it2 = oc9.f0(0, staticLayout.getLineCount()).iterator();
        if (((gj8) it2).c) {
            throw new NoSuchElementException();
        }
        lineMax2 = staticLayout.getLineMax(((gj8) it2).nextInt());
        while (((gj8) it2).c) {
            lineMax2 = Math.max(lineMax2, staticLayout.getLineMax(((gj8) it2).nextInt()));
        }
        poeVar = Integer.valueOf(gm0.K(lineMax2));
        z2 = poeVar instanceof poe;
        num2 = null;
        obj = poeVar;
        if (z2) {
            obj = null;
        }
        num = (Integer) obj;
        r14 = r13;
        if (num == null) {
            r14 = r13;
            r14 = r13;
            num2 = num;
            r15 = r14;
        } else if (num.intValue() < i5) {
            r5 = r13;
            staticLayoutL3 = this.d.l(r5, textPaint, i2, alignment, z, truncateAt, i3, f);
            r16 = r5;
            staticLayout = staticLayoutL3;
            r14 = r16;
            if (staticLayout.getLineCount() == 1) {
                it = oc9.f0(0, staticLayout.getLineCount()).iterator();
                if (((gj8) it).c) {
                    throw new NoSuchElementException();
                }
                lineMax = staticLayout.getLineMax(((gj8) it).nextInt());
                while (((gj8) it).c) {
                    lineMax = Math.max(lineMax, staticLayout.getLineMax(((gj8) it).nextInt()));
                }
                poeVar2 = Integer.valueOf(gm0.K(lineMax));
                num2 = (Integer) (poeVar2 instanceof poe ? null : poeVar2);
                r15 = r16;
            } else {
                r14 = r13;
                r14 = r13;
                num2 = num;
                r15 = r14;
            }
        } else if (num.intValue() >= i5) {
            r14 = r13;
            r14 = r13;
            num2 = num;
            r15 = r14;
        } else {
            r14 = r13;
            r14 = r13;
            num2 = num;
            r15 = r14;
        }
        if (num2 != null) {
            return staticLayout;
        }
        r4 = r15;
        staticLayoutL2 = this.d.l(r4, textPaint, num2.intValue() + 2, alignment, z, truncateAt, i3, f);
        return staticLayoutL2;
    }
}
