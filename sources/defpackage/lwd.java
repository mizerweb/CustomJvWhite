package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* JADX INFO: loaded from: classes.dex */
public final class lwd {
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final bm f = new bm();
    public final int g = gm0.K(18.0f * yl5.d().getDisplayMetrics().density);

    public lwd(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, Context context) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x022f A[SYNTHETIC] */
    public final CharSequence a(String str, ag8[] ag8VarArr) {
        FitFontImageSpan fitFontImageSpan;
        Object h56Var;
        FitFontImageSpan fitFontImageSpan2;
        ag8[] ag8VarArr2 = ag8VarArr;
        je9 je9Var = je9.f;
        ma6 ma6Var = kw6.e;
        if (ag8VarArr2 == null || ag8VarArr2.length == 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        int length = ag8VarArr2.length;
        int i = 0;
        while (i < length) {
            ag8 ag8Var = ag8VarArr2[i];
            switch (ag8Var.a) {
                case 1:
                    rf8 rf8Var = (rf8) sia.mergeFrom(new rf8(), ag8Var.d);
                    if (rf8Var.a.length != 0) {
                        hy0 hy0Var = (hy0) this.c.getValue();
                        byte[] bArr = rf8Var.a;
                        hy0Var.getClass();
                        Bitmap bitmapA = hy0.a(bArr);
                        if (bitmapA != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a.getResources(), bitmapA);
                            bitmapDrawable.setBounds(0, 0, bitmapA.getWidth(), bitmapA.getHeight());
                            h56Var = new h56(bitmapDrawable);
                        } else {
                            fitFontImageSpan = null;
                            h56Var = fitFontImageSpan;
                        }
                        if (h56Var != null) {
                            try {
                                try {
                                    spannableStringBuilder.setSpan(h56Var, ag8Var.b, ag8Var.c, 0);
                                } catch (IndexOutOfBoundsException e) {
                                    e = e;
                                    String name = spannableStringBuilder.getClass().getName();
                                    a4c a4cVar = gm0.f;
                                    if (a4cVar != null && a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, name, "fail to set span " + ag8Var + " of type " + ag8Var.a + ", " + ag8Var.b + ", " + ag8Var.c, e);
                                    }
                                } catch (RuntimeException e2) {
                                    e = e2;
                                    String name2 = spannableStringBuilder.getClass().getName();
                                    a4c a4cVar2 = gm0.f;
                                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                        a4cVar2.c(je9Var, name2, "fail to set span " + ag8Var + " of type " + ag8Var.a, e);
                                    }
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                            } catch (RuntimeException e4) {
                                e = e4;
                            }
                        }
                    }
                    break;
                case 2:
                    cg8 cg8Var = (cg8) sia.mergeFrom(new cg8(), ag8Var.d);
                    if (cg8Var.a != 0) {
                        h56Var = new fqh(pq3.j.e(this.a).m(), new p7d(10, cg8Var));
                    } else {
                        fitFontImageSpan = null;
                        h56Var = fitFontImageSpan;
                    }
                    if (h56Var != null) {
                        spannableStringBuilder.setSpan(h56Var, ag8Var.b, ag8Var.c, 0);
                    }
                    break;
                case 3:
                    tf8 tf8Var = (tf8) sia.mergeFrom(new tf8(), ag8Var.d);
                    if (tf8Var.b.length != 0) {
                        hy0 hy0Var2 = (hy0) this.c.getValue();
                        byte[] bArr2 = tf8Var.b;
                        hy0Var2.getClass();
                        Bitmap bitmapA2 = hy0.a(bArr2);
                        if (bitmapA2 != null) {
                            fitFontImageSpan2 = new FitFontImageSpan(new BitmapDrawable(this.a.getResources(), bitmapA2), (kw6) ma6Var.get(tf8Var.a), false, true, 4, null);
                            h56Var = fitFontImageSpan2;
                            if (h56Var != null) {
                                spannableStringBuilder.setSpan(h56Var, ag8Var.b, ag8Var.c, 0);
                            }
                        }
                        fitFontImageSpan = null;
                        h56Var = fitFontImageSpan;
                        if (h56Var != null) {
                            spannableStringBuilder.setSpan(h56Var, ag8Var.b, ag8Var.c, 0);
                        }
                        break;
                    }
                    break;
                case 4:
                    bg8 bg8Var = (bg8) sia.mergeFrom(new bg8(), ag8Var.d);
                    if (bg8Var.a > 0) {
                        h56Var = new tdg(bg8Var.a);
                    } else {
                        fitFontImageSpan = null;
                        h56Var = fitFontImageSpan;
                    }
                    if (h56Var != null) {
                        spannableStringBuilder.setSpan(h56Var, ag8Var.b, ag8Var.c, 0);
                    }
                    break;
                case 5:
                    uf8 uf8Var = (uf8) sia.mergeFrom(new uf8(), ag8Var.d);
                    if (uf8Var.b.length() != 0) {
                        fitFontImageSpan2 = new FitFontImageSpan(new vki(this.a, uf8Var.b), (kw6) ma6Var.get(uf8Var.a), false, true, 4, null);
                        h56Var = fitFontImageSpan2;
                        if (h56Var != null) {
                            spannableStringBuilder.setSpan(h56Var, ag8Var.b, ag8Var.c, 0);
                        }
                    }
                    break;
                case 6:
                    sf8 sf8Var = (sf8) sia.mergeFrom(new sf8(), ag8Var.d);
                    qn qnVar = new qn(sf8Var.b, sf8Var.c, sf8Var.d, fm.a, this.f, this.a, e9i.I(new q0d(new r8e(((xm) this.d.getValue()).j(sf8Var.b)), sf8Var, 9)), (xt4) ((qf8) this.e.getValue()).b.getValue());
                    int i2 = sf8Var.c;
                    qnVar.setBounds(0, 0, i2, i2);
                    fitFontImageSpan = new FitFontImageSpan(qnVar, (kw6) ma6Var.get(sf8Var.a), false, true, 4, null);
                    h56Var = fitFontImageSpan;
                    if (h56Var != null) {
                        spannableStringBuilder.setSpan(h56Var, ag8Var.b, ag8Var.c, 0);
                    }
                    break;
                default:
                    fitFontImageSpan = null;
                    h56Var = fitFontImageSpan;
                    if (h56Var != null) {
                        spannableStringBuilder.setSpan(h56Var, ag8Var.b, ag8Var.c, 0);
                    }
                    break;
            }
            i++;
            ag8VarArr2 = ag8VarArr;
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r14v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r3v20, types: [sia] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v30, types: [k2d] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    public final ArrayList b(CharSequence charSequence) throws IOException {
        Object[] spans;
        ArrayList arrayList;
        int spanEnd;
        int iIntValue;
        ylc ylcVarC;
        bg8 bg8Var;
        cg8 cg8Var;
        ?? r3;
        ?? r14;
        Bitmap bitmapO;
        ?? rect;
        Rect rect2;
        rf8 rf8Var;
        Bitmap bitmap;
        ArrayList arrayList2 = null;
        if (charSequence instanceof Spanned) {
            int length = charSequence.length();
            if (length == 0) {
                gm0.Y(lwd.class.getName(), "Early return in decode cuz of limit is 0");
                return null;
            }
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(0, length, null) != length) {
                ArrayList arrayList3 = new ArrayList();
                int length2 = charSequence.length();
                try {
                    Spanned spanned2 = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                    spans = spanned2 != null ? spanned2.getSpans(0, length2, Object.class) : null;
                } catch (Throwable unused) {
                }
                if (spans != null) {
                    int length3 = spans.length;
                    int i = 0;
                    while (i < length3) {
                        Object obj = spans[i];
                        int spanStart = spanned.getSpanStart(obj);
                        if (spanStart < 0 || spanStart > length || (spanEnd = spanned.getSpanEnd(obj)) < 0 || spanEnd > length) {
                            r14 = bitmapO;
                            rect = rect2;
                            r14 = bitmap;
                            arrayList = arrayList2;
                        } else {
                            if (obj instanceof h56) {
                                Drawable drawable = ((h56) obj).f;
                                boolean z = drawable instanceof BitmapDrawable;
                                if (z) {
                                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                                } else if (drawable instanceof kfg) {
                                    lfg lfgVar = ((kfg) drawable).a;
                                    bitmapO = lfgVar.e.o(lfgVar.a);
                                } else {
                                    r14 = arrayList2;
                                }
                                if (r14 != 0) {
                                    if (z) {
                                        rect = new Rect(((BitmapDrawable) drawable).getBounds());
                                    } else if (drawable instanceof kfg) {
                                        rect2 = new Rect(((kfg) drawable).b);
                                    } else {
                                        rect = arrayList2;
                                    }
                                    if (rect != 0) {
                                        rect = rect2;
                                        hy0 hy0Var = (hy0) this.c.getValue();
                                        byte[] bArrC = (byte[]) ((ifh) hy0Var.a.a).getValue();
                                        if (rect.isEmpty() || r14.isRecycled() || oy0.d(r14) == 0) {
                                            arrayList = arrayList2;
                                            gm0.Y(hy0.class.getName(), "Early return in encode cuz of bounds is empty, or bitmap is recycled, or bitmap size is 0");
                                        } else {
                                            arrayList = arrayList2;
                                            if (rect.width() == r14.getWidth() && rect.height() == r14.getHeight()) {
                                                gm0.n(hy0.class.getName(), "Early return in encode cuz of bounds size equals bitmap size");
                                                bArrC = hy0.c(r14, bArrC);
                                            } else {
                                                au3 au3VarD = ((f78) hy0Var.c.getValue()).h().d(r14, rect.width(), rect.height(), false);
                                                try {
                                                    bArrC = hy0.c((Bitmap) au3VarD.K(), bArrC);
                                                    au3VarD.close();
                                                } catch (Throwable th) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        rx8.n(au3VarD, th);
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        }
                                        if (bArrC.length == 0) {
                                            iIntValue = 0;
                                            r3 = arrayList;
                                        } else {
                                            rf8Var = new rf8();
                                            rf8Var.a = bArrC;
                                            iIntValue = 1;
                                        }
                                    }
                                }
                                r14 = bitmapO;
                                rect = rect2;
                                r14 = bitmap;
                                arrayList = arrayList2;
                            } else {
                                arrayList = arrayList2;
                                if (obj instanceof fqh) {
                                    cg8Var = new cg8();
                                    cg8Var.a = ((fqh) obj).a();
                                    iIntValue = 2;
                                } else {
                                    iIntValue = 4;
                                    if (obj instanceof tdg) {
                                        bg8Var = new bg8();
                                        bg8Var.a = ((tdg) obj).a;
                                    } else if (obj instanceof FitFontImageSpan) {
                                        FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) obj;
                                        Drawable drawable2 = fitFontImageSpan.getDrawable();
                                        if (drawable2 instanceof qn) {
                                            qn qnVar = (qn) drawable2;
                                            int iOrdinal = fitFontImageSpan.getScaleType().ordinal();
                                            int iOrdinal2 = qnVar.h().ordinal();
                                            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                                                sf8 sf8Var = new sf8();
                                                sf8Var.a = iOrdinal;
                                                sf8Var.b = qnVar.f();
                                                sf8Var.c = qnVar.j();
                                                sf8Var.d = qnVar.i();
                                                ylcVarC = new ylc(6, sf8Var);
                                            } else {
                                                if (iOrdinal2 != 2) {
                                                    if (iOrdinal2 == 3) {
                                                        sf8 sf8Var2 = new sf8();
                                                        sf8Var2.a = iOrdinal;
                                                        sf8Var2.b = qnVar.f();
                                                        sf8Var2.c = qnVar.j();
                                                        sf8Var2.d = qnVar.i();
                                                        ylcVarC = new ylc(6, sf8Var2);
                                                    } else if (iOrdinal2 != 4) {
                                                        ore.o();
                                                        return arrayList;
                                                    }
                                                }
                                                ylcVarC = c(qnVar.g(), iOrdinal, qnVar.i());
                                            }
                                        } else {
                                            ylcVarC = c(drawable2, fitFontImageSpan.getScaleType().ordinal(), true);
                                        }
                                        iIntValue = ((Number) ylcVarC.a).intValue();
                                        r3 = (sia) ylcVarC.b;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (r3 != 0) {
                                r3 = bg8Var;
                                r3 = cg8Var;
                                r3 = rf8Var;
                                byte[] byteArray = sia.toByteArray(r3);
                                ag8 ag8Var = new ag8();
                                ag8Var.b = spanStart;
                                ag8Var.c = spanEnd;
                                ag8Var.a = iIntValue;
                                ag8Var.d = byteArray;
                                arrayList3.add(ag8Var);
                            } else {
                                r3 = bg8Var;
                                r3 = cg8Var;
                                r3 = rf8Var;
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                }
                return arrayList3;
            }
        }
        return null;
    }

    public final ylc c(Drawable drawable, int i, boolean z) throws IOException {
        au3 au3VarC;
        byte[] bArrC;
        je9 je9Var = je9.f;
        tf8 tf8Var = null;
        try {
            String name = drawable.getClass().getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, name, "toBitmap: drawable: " + drawable.getClass().getSimpleName() + "; bounds: " + drawable.getBounds() + "; overrideAlpha: " + z, null);
                }
            }
            k2d k2dVarH = ((f78) this.b.getValue()).h();
            Rect bounds = drawable.getBounds();
            int i2 = bounds.left;
            int i3 = bounds.top;
            int i4 = bounds.right;
            int i5 = bounds.bottom;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 <= 0) {
                i6 = this.g;
            }
            if (i7 <= 0) {
                i7 = this.g;
            }
            au3VarC = k2dVarH.c(i6, i7, Bitmap.Config.ARGB_8888);
            Bitmap bitmap = (Bitmap) au3VarC.K();
            drawable.setBounds(0, 0, i6, i7);
            if (z) {
                int alpha = drawable.getAlpha();
                drawable.setAlpha(255);
                if (!bitmap.isRecycled()) {
                    Canvas canvas = new Canvas(bitmap);
                    canvas.drawColor(0, PorterDuff.Mode.SRC);
                    drawable.draw(canvas);
                }
                drawable.setAlpha(alpha);
            } else if (!bitmap.isRecycled()) {
                Canvas canvas2 = new Canvas(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.SRC);
                drawable.draw(canvas2);
            }
            drawable.setBounds(i2, i3, i4, i5);
        } catch (TooManyBitmapsException e) {
            String name2 = drawable.getClass().getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, "fail to fetch image from Drawable, fresco pool is full", e);
            }
            au3VarC = null;
        } catch (CancellationException e2) {
            throw e2;
        } catch (IllegalStateException e3) {
            String name3 = drawable.getClass().getName();
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, name3, "fail to fetch image from Drawable, probably ref was closed before get()", e3);
            }
            au3VarC = null;
        }
        if (au3VarC != null) {
            try {
                bArrC = hy0.c((Bitmap) au3VarC.K(), (byte[]) ((ifh) ((hy0) this.c.getValue()).a.a).getValue());
                au3VarC.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(au3VarC, th);
                    throw th2;
                }
            }
        } else {
            bArrC = null;
        }
        if (bArrC != null && bArrC.length != 0) {
            tf8Var = new tf8();
            tf8Var.a = i;
            tf8Var.b = bArrC;
        }
        return new ylc(3, tf8Var);
    }
}
