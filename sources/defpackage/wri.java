package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public final class wri extends zri {
    public ed7 d;
    public float e;
    public ed7 f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    public wri(wri wriVar) {
        super(wriVar);
        this.e = 0.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = Paint.Cap.BUTT;
        this.m = Paint.Join.MITER;
        this.n = 4.0f;
        this.d = wriVar.d;
        this.e = wriVar.e;
        this.g = wriVar.g;
        this.f = wriVar.f;
        this.c = wriVar.c;
        this.h = wriVar.h;
        this.i = wriVar.i;
        this.j = wriVar.j;
        this.k = wriVar.k;
        this.l = wriVar.l;
        this.m = wriVar.m;
        this.n = wriVar.n;
    }

    @Override // defpackage.yri
    public final boolean a() {
        return this.f.M() || this.d.M();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.yri
    public final boolean b(int[] iArr) {
        boolean z;
        ed7 ed7Var = this.f;
        boolean z2 = true;
        if (ed7Var.M()) {
            ColorStateList colorStateList = (ColorStateList) ed7Var.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != ed7Var.b) {
                ed7Var.b = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ed7 ed7Var2 = this.d;
        if (ed7Var2.M()) {
            ColorStateList colorStateList2 = (ColorStateList) ed7Var2.d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != ed7Var2.b) {
                ed7Var2.b = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayH = xzl.h(resources, theme, attributeSet, e51.c);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = typedArrayH.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArrayH.getString(2);
            if (string2 != null) {
                this.a = qyj.q(string2);
            }
            this.f = xzl.d(typedArrayH, xmlPullParser, theme, "fillColor", 1);
            float f = this.h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f = typedArrayH.getFloat(12, f);
            }
            this.h = f;
            int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayH.getInt(8, -1) : -1;
            Paint.Cap cap = this.l;
            if (i == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.l = cap;
            int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayH.getInt(9, -1) : -1;
            Paint.Join join = this.m;
            if (i2 == 0) {
                join = Paint.Join.MITER;
            } else if (i2 == 1) {
                join = Paint.Join.ROUND;
            } else if (i2 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.m = join;
            float f2 = this.n;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f2 = typedArrayH.getFloat(10, f2);
            }
            this.n = f2;
            this.d = xzl.d(typedArrayH, xmlPullParser, theme, "strokeColor", 3);
            float f3 = this.g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f3 = typedArrayH.getFloat(11, f3);
            }
            this.g = f3;
            float f4 = this.e;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f4 = typedArrayH.getFloat(4, f4);
            }
            this.e = f4;
            float f5 = this.j;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f5 = typedArrayH.getFloat(6, f5);
            }
            this.j = f5;
            float f6 = this.k;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f6 = typedArrayH.getFloat(7, f6);
            }
            this.k = f6;
            float f7 = this.i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f7 = typedArrayH.getFloat(5, f7);
            }
            this.i = f7;
            int i3 = this.c;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i3 = typedArrayH.getInt(13, i3);
            }
            this.c = i3;
        }
        typedArrayH.recycle();
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int i) {
        this.f.b = i;
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int i) {
        this.d.b = i;
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }

    public wri() {
        this.e = 0.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = Paint.Cap.BUTT;
        this.m = Paint.Join.MITER;
        this.n = 4.0f;
    }
}
