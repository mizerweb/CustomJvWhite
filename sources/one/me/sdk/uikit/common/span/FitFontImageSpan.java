package one.me.sdk.uikit.common.span;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.style.ImageSpan;
import android.view.View;
import defpackage.a4c;
import defpackage.cqk;
import defpackage.eph;
import defpackage.fbc;
import defpackage.gm0;
import defpackage.i94;
import defpackage.j8j;
import defpackage.j95;
import defpackage.je9;
import defpackage.jw6;
import defpackage.k8j;
import defpackage.kbc;
import defpackage.kw6;
import defpackage.l8e;
import defpackage.ore;
import defpackage.ow6;
import defpackage.pw6;
import defpackage.sbi;
import defpackage.zo5;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003P\u0006[B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010'\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(JW\u00100\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u00122\b\b\u0001\u00102\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00103\u001a\u00020\b¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00122\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010GR\u0014\u0010K\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u00060PR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010?R\"\u0010V\u001a\u00020\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010B\u001a\u0004\bW\u0010X\"\u0004\bY\u00108¨\u0006\\"}, d2 = {"Lone/me/sdk/uikit/common/span/FitFontImageSpan;", "Landroid/text/style/ImageSpan;", "Lk8j;", "Leph;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lkw6;", "scaleType", "", "shouldInvalidateSpan", "usePaintAlpha", "<init>", "(Landroid/graphics/drawable/Drawable;Lkw6;ZZ)V", "Landroid/graphics/RectF;", "src", "dst", "Landroid/graphics/Rect;", "out", "Lsbi;", "scaleRect", "(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Rect;Lkw6;)V", "Landroid/view/View;", "view", "attach", "(Landroid/view/View;)V", "detach", "Lkbc;", "newAttrs", "onThemeChanged", "(Lkbc;)V", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "newSize", "needScale", "updateDrawableSize", "(ILkw6;Z)V", "overrideAlpha", "setOverrideAlpha", "(Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lkw6;", "getScaleType", "()Lkw6;", "Z", "", "tag", "Ljava/lang/String;", "fontRect", "Landroid/graphics/RectF;", "getFontRect", "()Landroid/graphics/RectF;", "tempRect", "drawableRect", "Landroid/graphics/Rect;", "Ljava/util/WeakHashMap;", "lastAttachedViews", "Ljava/util/WeakHashMap;", "Low6;", "sharedSpanCallback", "Low6;", "customHeight", "I", "customScaleType", "needCustomScale", "getNeedCustomScale", "()Z", "setNeedCustomScale", "Companion", "jw6", "common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class FitFontImageSpan extends ImageSpan implements k8j, eph {
    private static final jw6 Companion = new jw6();
    private static final l8e sharedPaintWithAlpha$delegate = new fbc(19, new i94(23));
    private int customHeight;
    private kw6 customScaleType;
    private final Rect drawableRect;
    private final RectF fontRect;
    private final WeakHashMap<View, sbi> lastAttachedViews;
    private boolean needCustomScale;
    private final kw6 scaleType;
    private final ow6 sharedSpanCallback;
    private final boolean shouldInvalidateSpan;
    private final String tag;
    private final RectF tempRect;
    private final boolean usePaintAlpha;

    public FitFontImageSpan(Drawable drawable, kw6 kw6Var, boolean z, boolean z2) {
        super(drawable);
        this.scaleType = kw6Var;
        this.shouldInvalidateSpan = z;
        this.usePaintAlpha = z2;
        this.tag = getClass().getName();
        this.fontRect = new RectF();
        this.tempRect = new RectF();
        this.drawableRect = new Rect();
        WeakHashMap<View, sbi> weakHashMap = new WeakHashMap<>();
        this.lastAttachedViews = weakHashMap;
        this.sharedSpanCallback = new ow6(this, weakHashMap);
        this.customHeight = -1;
        this.customScaleType = kw6Var;
        this.needCustomScale = true;
    }

    private final void scaleRect(RectF src, RectF dst, Rect out, kw6 scaleType) {
        float fWidth;
        float fWidth2;
        float fHeight;
        float fHeight2;
        float fWidth3 = src.width() == -1.0f ? dst.width() : src.width();
        float fHeight3 = src.height() == -1.0f ? dst.height() : src.height();
        int i = pw6.$EnumSwitchMapping$0[scaleType.ordinal()];
        if (i == 1) {
            out.set((int) Math.floor(dst.left), (int) Math.floor(dst.top), (int) Math.ceil(dst.right), (int) Math.ceil(dst.bottom));
            return;
        }
        if (i == 2) {
            float f = fWidth3 / fHeight3;
            if (f > 1.0f) {
                fWidth = dst.height() * f;
                fWidth2 = dst.height();
            } else {
                fWidth = dst.width();
                fWidth2 = dst.width() / f;
            }
            float fWidth4 = ((dst.width() - fWidth) / 2.0f) + dst.left;
            float fHeight4 = ((dst.height() - fWidth2) / 2.0f) + dst.top;
            out.set((int) Math.floor(fWidth4), (int) Math.floor(fHeight4), (int) Math.ceil(fWidth4 + fWidth), (int) Math.ceil(fHeight4 + fWidth2));
            return;
        }
        if (i != 3) {
            if (i != 4) {
                ore.o();
                return;
            }
            float fWidth5 = ((dst.width() - fWidth3) / 2.0f) + dst.left;
            float fHeight5 = ((dst.height() - fHeight3) / 2.0f) + dst.top;
            out.set((int) Math.floor(fWidth5), (int) Math.floor(fHeight5), (int) Math.ceil(fWidth5 + fWidth3), (int) Math.ceil(fHeight5 + fHeight3));
            return;
        }
        float f2 = fWidth3 / fHeight3;
        if (f2 > dst.width() / dst.height()) {
            fHeight2 = dst.width();
            fHeight = dst.width() / f2;
        } else {
            fHeight = dst.height();
            fHeight2 = dst.height() * f2;
        }
        float fWidth6 = ((dst.width() - fHeight2) / 2.0f) + dst.left;
        float fHeight6 = ((dst.height() - fHeight) / 2.0f) + dst.top;
        out.set((int) Math.floor(fWidth6), (int) Math.floor(fHeight6), (int) Math.ceil(fWidth6 + fHeight2), (int) Math.ceil(fHeight6 + fHeight));
    }

    public static final Paint sharedPaintWithAlpha_delegate$lambda$0() {
        return new Paint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k8j
    public void attach(View view) {
        Drawable drawable = getDrawable();
        boolean z = this.lastAttachedViews.put(view, sbi.a) != null;
        Drawable.Callback callback = drawable.getCallback();
        ow6 ow6Var = this.sharedSpanCallback;
        if (callback == ow6Var && z) {
            String str = this.tag;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "attach: was attached before and callback not changed", null);
                }
            }
            j8j j8jVar = drawable instanceof j8j ? (j8j) drawable : null;
            if (j8jVar != null) {
                j8jVar.b(view);
                return;
            }
            return;
        }
        drawable.setCallback(ow6Var);
        drawable.invalidateSelf();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
        j8j j8jVar2 = drawable instanceof j8j ? (j8j) drawable : null;
        if (j8jVar2 != null) {
            j8jVar2.b(view);
        }
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        if (layerDrawable == null) {
            return;
        }
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            Object drawable2 = layerDrawable.getDrawable(i);
            j8j j8jVar3 = drawable2 instanceof j8j ? (j8j) drawable2 : null;
            if (j8jVar3 != null) {
                j8jVar3.b(view);
            }
        }
    }

    @Override // defpackage.k8j
    public void detach(View view) {
        this.lastAttachedViews.remove(view);
        if (this.lastAttachedViews.isEmpty()) {
            Object drawable = getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.stop();
            }
            this.sharedSpanCallback.a();
            j8j j8jVar = drawable instanceof j8j ? (j8j) drawable : null;
            if (j8jVar != null) {
                j8jVar.c(view);
            }
            LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
            int numberOfLayers = layerDrawable != null ? layerDrawable.getNumberOfLayers() : 0;
            for (int i = 0; i < numberOfLayers; i++) {
                Object drawable2 = layerDrawable != null ? layerDrawable.getDrawable(i) : null;
                j8j j8jVar2 = drawable2 instanceof j8j ? (j8j) drawable2 : null;
                if (j8jVar2 != null) {
                    j8jVar2.c(view);
                }
            }
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        int iSave = canvas.save();
        try {
            canvas.translate(x, top);
            canvas.clipRect(this.fontRect);
            Drawable drawable = getDrawable();
            boolean z = this.usePaintAlpha;
            if (z && (drawable instanceof BitmapDrawable)) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                jw6 jw6Var = Companion;
                jw6.a(jw6Var).set(((BitmapDrawable) drawable).getPaint());
                jw6.a(jw6Var).setAlpha(paint.getAlpha());
                canvas.drawBitmap(bitmap, (Rect) null, ((BitmapDrawable) drawable).getBounds(), jw6.a(jw6Var));
                jw6.a(jw6Var).reset();
            } else if (z) {
                drawable.setAlpha(paint.getAlpha());
                drawable.draw(canvas);
            } else {
                drawable.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitFontImageSpan)) {
            return false;
        }
        FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) other;
        return this.scaleType == fitFontImageSpan.scaleType && cqk.d(getDrawable(), fitFontImageSpan.getDrawable());
    }

    public final RectF getFontRect() {
        return this.fontRect;
    }

    public final boolean getNeedCustomScale() {
        return this.needCustomScale;
    }

    public final kw6 getScaleType() {
        return this.scaleType;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int iAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
        int intrinsicWidth = this.customHeight;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        int intrinsicHeight = this.customHeight;
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        float f = iAbs;
        this.fontRect.set(0.0f, 0.0f, f, f);
        this.tempRect.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        scaleRect(this.tempRect, this.fontRect, this.drawableRect, this.customScaleType);
        drawable.setBounds(this.drawableRect);
        if (fontMetricsInt != null) {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            fontMetricsInt.leading = fontMetricsInt2.leading;
        }
        return (int) this.fontRect.right;
    }

    public int hashCode() {
        return (this.scaleType.hashCode() * 31) + getDrawable().hashCode();
    }

    @Override // defpackage.eph
    public void onThemeChanged(kbc newAttrs) {
        Object drawable = getDrawable();
        eph ephVar = drawable instanceof eph ? (eph) drawable : null;
        if (ephVar != null) {
            ephVar.onThemeChanged(newAttrs);
        }
    }

    public final void setNeedCustomScale(boolean z) {
        this.needCustomScale = z;
    }

    public final void setOverrideAlpha(boolean overrideAlpha) {
        Object drawable = getDrawable();
        j8j j8jVar = drawable instanceof j8j ? (j8j) drawable : null;
        if (j8jVar != null) {
            j8jVar.a(overrideAlpha);
        }
    }

    public final void updateDrawableSize(int newSize, kw6 scaleType, boolean needScale) {
        String name = getClass().getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(newSize, "updateDrawableSize: "), null);
            }
        }
        if (this.customHeight == newSize && this.customScaleType == scaleType && this.needCustomScale == needScale) {
            return;
        }
        this.customHeight = newSize;
        this.customScaleType = scaleType;
        this.needCustomScale = needScale;
        if (newSize > 0) {
            getDrawable().invalidateSelf();
        }
    }

    public /* synthetic */ FitFontImageSpan(Drawable drawable, kw6 kw6Var, boolean z, boolean z2, int i, j95 j95Var) {
        this(drawable, (i & 2) != 0 ? kw6.b : kw6Var, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }
}
