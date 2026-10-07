package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class dsi extends uri {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public bsi b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public dsi() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        bsi bsiVar = new bsi();
        bsiVar.c = null;
        bsiVar.d = j;
        bsiVar.b = new asi();
        this.b = bsiVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(np0.q, iWidth);
        int iMin2 = Math.min(np0.q, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && tsl.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        bsi bsiVar = this.b;
        Bitmap bitmap = bsiVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != bsiVar.f.getHeight()) {
            bsiVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            bsiVar.k = true;
        }
        boolean z = this.f;
        bsi bsiVar2 = this.b;
        if (!z) {
            bsiVar2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(bsiVar2.f);
            asi asiVar = bsiVar2.b;
            asiVar.a(asiVar.g, asi.p, canvas2, iMin, iMin2);
        } else if (bsiVar2.k || bsiVar2.g != bsiVar2.c || bsiVar2.h != bsiVar2.d || bsiVar2.j != bsiVar2.e || bsiVar2.i != bsiVar2.b.getRootAlpha()) {
            bsi bsiVar3 = this.b;
            bsiVar3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(bsiVar3.f);
            asi asiVar2 = bsiVar3.b;
            asiVar2.a(asiVar2.g, asi.p, canvas3, iMin, iMin2);
            bsi bsiVar4 = this.b;
            bsiVar4.g = bsiVar4.c;
            bsiVar4.h = bsiVar4.d;
            bsiVar4.i = bsiVar4.b.getRootAlpha();
            bsiVar4.j = bsiVar4.e;
            bsiVar4.k = false;
        }
        bsi bsiVar5 = this.b;
        if (bsiVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (bsiVar5.l == null) {
                Paint paint2 = new Paint();
                bsiVar5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            bsiVar5.l.setAlpha(bsiVar5.b.getRootAlpha());
            bsiVar5.l.setColorFilter(colorFilter);
            paint = bsiVar5.l;
        }
        canvas.drawBitmap(bsiVar5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new csi(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        char c;
        char c2;
        Resources resources2 = resources;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        bsi bsiVar = this.b;
        bsiVar.b = new asi();
        TypedArray typedArrayH = xzl.h(resources2, theme, attributeSet, e51.a);
        bsi bsiVar2 = this.b;
        asi asiVar = bsiVar2.b;
        int iF = xzl.f(typedArrayH, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        int i4 = 5;
        if (iF == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iF != 5) {
            if (iF != 9) {
                switch (iF) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        bsiVar2.d = mode;
        ColorStateList colorStateListC = xzl.c(typedArrayH, xmlPullParser, theme);
        if (colorStateListC != null) {
            bsiVar2.c = colorStateListC;
        }
        bsiVar2.e = xzl.b(typedArrayH, xmlPullParser, bsiVar2.e);
        asiVar.j = xzl.e(typedArrayH, xmlPullParser, "viewportWidth", 7, asiVar.j);
        float fE = xzl.e(typedArrayH, xmlPullParser, "viewportHeight", 8, asiVar.k);
        asiVar.k = fE;
        if (asiVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fE <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        asiVar.h = typedArrayH.getDimension(3, asiVar.h);
        int i5 = 2;
        float dimension = typedArrayH.getDimension(2, asiVar.i);
        asiVar.i = dimension;
        if (asiVar.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires height > 0");
        }
        asiVar.setAlpha(xzl.e(typedArrayH, xmlPullParser, "alpha", 4, asiVar.getAlpha()));
        String string = typedArrayH.getString(0);
        if (string != null) {
            asiVar.m = string;
            asiVar.o.put(string, asiVar);
        }
        typedArrayH.recycle();
        bsiVar.a = getChangingConfigurations();
        int i6 = 1;
        bsiVar.k = true;
        bsi bsiVar3 = this.b;
        asi asiVar2 = bsiVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        xri xriVar = asiVar2.g;
        mw mwVar = asiVar2.o;
        arrayDeque.push(xriVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
            if (eventType == i5) {
                String name = xmlPullParser.getName();
                xri xriVar2 = (xri) arrayDeque.peek();
                if (ClientCookie.PATH_ATTR.equals(name)) {
                    wri wriVar = new wri();
                    wriVar.e(resources2, xmlPullParser, attributeSet, theme);
                    xriVar2.b.add(wriVar);
                    if (wriVar.getPathName() != null) {
                        mwVar.put(wriVar.getPathName(), wriVar);
                    }
                    bsiVar3.a = bsiVar3.a;
                    c2 = 4;
                    z = false;
                } else {
                    if ("clip-path".equals(name)) {
                        vri vriVar = new vri();
                        vriVar.e(resources2, xmlPullParser, attributeSet, theme);
                        xriVar2.b.add(vriVar);
                        if (vriVar.getPathName() != null) {
                            mwVar.put(vriVar.getPathName(), vriVar);
                        }
                        bsiVar3.a = bsiVar3.a;
                    } else if ("group".equals(name)) {
                        xri xriVar3 = new xri();
                        TypedArray typedArrayH2 = xzl.h(resources2, theme, attributeSet, e51.b);
                        xriVar3.c = xzl.e(typedArrayH2, xmlPullParser, "rotation", i4, xriVar3.c);
                        xriVar3.d = typedArrayH2.getFloat(1, xriVar3.d);
                        xriVar3.e = typedArrayH2.getFloat(2, xriVar3.e);
                        xriVar3.f = xzl.e(typedArrayH2, xmlPullParser, "scaleX", 3, xriVar3.f);
                        c2 = 4;
                        xriVar3.g = xzl.e(typedArrayH2, xmlPullParser, "scaleY", 4, xriVar3.g);
                        xriVar3.h = xzl.e(typedArrayH2, xmlPullParser, "translateX", 6, xriVar3.h);
                        xriVar3.i = xzl.e(typedArrayH2, xmlPullParser, "translateY", 7, xriVar3.i);
                        String string2 = typedArrayH2.getString(0);
                        if (string2 != null) {
                            xriVar3.k = string2;
                        }
                        xriVar3.c();
                        typedArrayH2.recycle();
                        xriVar2.b.add(xriVar3);
                        arrayDeque.push(xriVar3);
                        if (xriVar3.getGroupName() != null) {
                            mwVar.put(xriVar3.getGroupName(), xriVar3);
                        }
                        bsiVar3.a = bsiVar3.a;
                    }
                    c2 = 4;
                }
                c = c2;
                i2 = 3;
                i = 1;
            } else {
                i = i6;
                i2 = i3;
                c = 4;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            resources2 = resources;
            i3 = i2;
            i6 = i;
            i5 = 2;
            i4 = 5;
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = a(bsiVar.c, bsiVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        bsi bsiVar = this.b;
        if (bsiVar == null) {
            return false;
        }
        asi asiVar = bsiVar.b;
        if (asiVar.n == null) {
            asiVar.n = Boolean.valueOf(asiVar.g.a());
        }
        if (asiVar.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            bsi bsiVar = this.b;
            bsi bsiVar2 = new bsi();
            bsiVar2.c = null;
            bsiVar2.d = j;
            if (bsiVar != null) {
                bsiVar2.a = bsiVar.a;
                asi asiVar = new asi(bsiVar.b);
                bsiVar2.b = asiVar;
                if (bsiVar.b.e != null) {
                    asiVar.e = new Paint(bsiVar.b.e);
                }
                if (bsiVar.b.d != null) {
                    bsiVar2.b.d = new Paint(bsiVar.b.d);
                }
                bsiVar2.c = bsiVar.c;
                bsiVar2.d = bsiVar.d;
                bsiVar2.e = bsiVar.e;
            }
            this.b = bsiVar2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        bsi bsiVar = this.b;
        ColorStateList colorStateList = bsiVar.c;
        if (colorStateList == null || (mode = bsiVar.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        asi asiVar = bsiVar.b;
        if (asiVar.n == null) {
            asiVar.n = Boolean.valueOf(asiVar.g.a());
        }
        if (asiVar.n.booleanValue()) {
            boolean zB = bsiVar.b.g.b(iArr);
            bsiVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        bsi bsiVar = this.b;
        if (bsiVar.c != colorStateList) {
            bsiVar.c = colorStateList;
            this.c = a(colorStateList, bsiVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        bsi bsiVar = this.b;
        if (bsiVar.d != mode) {
            bsiVar.d = mode;
            this.c = a(bsiVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public dsi(bsi bsiVar) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = bsiVar;
        this.c = a(bsiVar.c, bsiVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
