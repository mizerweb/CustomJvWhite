package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pri {
    public final nph a;
    public final boolean b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;

    public pri(nph nphVar, boolean z) {
        this.a = nphVar;
        this.b = z;
        final int i = 0;
        af7 af7Var = new af7(this) { // from class: nri
            public final /* synthetic */ pri b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                pri priVar = this.b;
                switch (i2) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        paint.setDither(priVar.b);
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        paint2.setFilterBitmap(true);
                        paint2.setDither(priVar.b);
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setAntiAlias(true);
                        paint3.setFilterBitmap(true);
                        paint3.setDither(priVar.b);
                        return paint3;
                    default:
                        Paint paint4 = new Paint();
                        paint4.setAntiAlias(true);
                        paint4.setFilterBitmap(true);
                        paint4.setDither(priVar.b);
                        return paint4;
                }
            }
        };
        final int i2 = 3;
        this.c = rx8.P(3, af7Var);
        final int i3 = 1;
        this.d = rx8.P(3, new af7(this) { // from class: nri
            public final /* synthetic */ pri b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                pri priVar = this.b;
                switch (i4) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        paint.setDither(priVar.b);
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        paint2.setFilterBitmap(true);
                        paint2.setDither(priVar.b);
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setAntiAlias(true);
                        paint3.setFilterBitmap(true);
                        paint3.setDither(priVar.b);
                        return paint3;
                    default:
                        Paint paint4 = new Paint();
                        paint4.setAntiAlias(true);
                        paint4.setFilterBitmap(true);
                        paint4.setDither(priVar.b);
                        return paint4;
                }
            }
        });
        final int i4 = 2;
        this.e = rx8.P(3, new af7(this) { // from class: nri
            public final /* synthetic */ pri b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                pri priVar = this.b;
                switch (i5) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        paint.setDither(priVar.b);
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        paint2.setFilterBitmap(true);
                        paint2.setDither(priVar.b);
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setAntiAlias(true);
                        paint3.setFilterBitmap(true);
                        paint3.setDither(priVar.b);
                        return paint3;
                    default:
                        Paint paint4 = new Paint();
                        paint4.setAntiAlias(true);
                        paint4.setFilterBitmap(true);
                        paint4.setDither(priVar.b);
                        return paint4;
                }
            }
        });
        this.f = rx8.P(3, new af7(this) { // from class: nri
            public final /* synthetic */ pri b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i2;
                pri priVar = this.b;
                switch (i5) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        paint.setDither(priVar.b);
                        return paint;
                    case 1:
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        paint2.setFilterBitmap(true);
                        paint2.setDither(priVar.b);
                        return paint2;
                    case 2:
                        Paint paint3 = new Paint();
                        paint3.setAntiAlias(true);
                        paint3.setFilterBitmap(true);
                        paint3.setDither(priVar.b);
                        return paint3;
                    default:
                        Paint paint4 = new Paint();
                        paint4.setAntiAlias(true);
                        paint4.setFilterBitmap(true);
                        paint4.setDither(priVar.b);
                        return paint4;
                }
            }
        });
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    public static void a(Canvas canvas, ArrayList arrayList, ArrayList arrayList2, Paint paint) {
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            ori oriVar = (ori) obj;
            Shader shader = (Shader) ww3.u1(i, arrayList2);
            if (shader != null) {
                paint.setShader(shader);
                float f = oriVar.c;
                float f2 = oriVar.b;
                float f3 = oriVar.a;
                float f4 = oriVar.d;
                float fMax = f / Math.max(f, f4);
                float fMax2 = f4 / Math.max(f, f4);
                int iSave = canvas.save();
                try {
                    canvas.rotate(oriVar.e, f3, f2);
                    canvas.scale(fMax, fMax2, f3, f2);
                    canvas.drawCircle(f3, f2, Math.max(f, f4), paint);
                    canvas.restoreToCount(iSave);
                } catch (Throwable th) {
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
            i = i2;
        }
    }

    public static void b(List list, ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        arrayList.clear();
        arrayList2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lph lphVar = (lph) it.next();
            float f = i;
            float f2 = lphVar.a;
            float[] fArr = lphVar.d;
            float f3 = (f2 * f) / 100.0f;
            float f4 = i2;
            float f5 = (lphVar.b * f4) / 100.0f;
            float f6 = (f * lphVar.e) / 100.0f;
            float f7 = (f4 * lphVar.f) / 100.0f;
            float fMax = Math.max(f6, f7);
            if (fMax > 0.0f) {
                arrayList2.add(new RadialGradient(f3, f5, fMax, lphVar.c, fArr, Shader.TileMode.CLAMP));
                arrayList.add(new ori(f3, f5, f6, f7, lphVar.g, fArr));
            }
        }
    }

    public static RectF c(int i, float f, int i2) {
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float[] fArr = new float[2];
        d(i, i2, f, fArr);
        rectF.left = fArr[0];
        rectF.top = fArr[1];
        d(i, i2, (f + 180.0f) % 360.0f, fArr);
        rectF.right = fArr[0];
        rectF.bottom = fArr[1];
        return rectF;
    }

    public static final void d(int i, int i2, float f, float[] fArr) {
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        double d = f;
        float fCos = (float) Math.cos(Math.toRadians(d));
        float fSin = (float) Math.sin(Math.toRadians(d));
        float fAbs = Math.abs(f2 / fCos);
        float fAbs2 = Math.abs(f3 / fSin);
        ylc ylcVar = fAbs >= fAbs2 ? new ylc(Float.valueOf(Math.abs(fAbs2 * fCos)), Float.valueOf(f3)) : new ylc(Float.valueOf(f2), Float.valueOf(Math.abs(fAbs * fSin)));
        float fFloatValue = ((Number) ylcVar.a).floatValue();
        float fFloatValue2 = ((Number) ylcVar.b).floatValue();
        if (fCos >= 0.0f && fSin >= 0.0f) {
            fArr[0] = f2 + fFloatValue;
            fArr[1] = f3 - fFloatValue2;
            return;
        }
        if (fCos < 0.0f && fSin >= 0.0f) {
            fArr[0] = f2 - fFloatValue;
            fArr[1] = f3 - fFloatValue2;
        } else if (fCos < 0.0f && fSin < 0.0f) {
            fArr[0] = f2 - fFloatValue;
            fArr[1] = f3 + fFloatValue2;
        } else {
            if (fCos < 0.0f || fSin >= 0.0f) {
                return;
            }
            fArr[0] = f2 + fFloatValue;
            fArr[1] = f3 + fFloatValue2;
        }
    }

    public final void e(Canvas canvas) {
        Canvas canvas2;
        nph nphVar = this.a;
        Integer num = nphVar.f;
        if (num != null) {
            canvas.drawColor(num.intValue());
        }
        if (nphVar.b != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (Paint) this.c.getValue());
        } else {
            canvas2 = canvas;
        }
        if (nphVar.d != null) {
            a(canvas2, this.g, this.h, (Paint) this.e.getValue());
        }
        mph mphVar = nphVar.a;
        kph kphVar = nphVar.c;
        if (mphVar == null) {
            return;
        }
        geh gehVar = mphVar.a;
        ArrayList arrayList = this.i;
        if (kphVar == null && arrayList.isEmpty()) {
            return;
        }
        int iSaveLayer = canvas2.saveLayer(null, null);
        if (kphVar != null) {
            canvas2.drawRect(0.0f, 0.0f, canvas2.getWidth(), canvas2.getHeight(), (Paint) this.d.getValue());
        }
        if (!arrayList.isEmpty()) {
            a(canvas2, arrayList, this.j, (Paint) this.f.getValue());
        }
        Xfermode xfermode = gehVar.a.g.getXfermode();
        int alpha = gehVar.getAlpha();
        gehVar.c(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        gehVar.setAlpha(255);
        gehVar.draw(canvas2);
        gehVar.c(xfermode);
        gehVar.setAlpha(alpha);
        canvas2.restoreToCount(iSaveLayer);
    }

    public final void f(Rect rect) {
        int iWidth = rect.width();
        int iHeight = rect.height();
        nph nphVar = this.a;
        kph kphVar = nphVar.b;
        if (kphVar != null) {
            RectF rectFC = c(iWidth, kphVar.b, iHeight);
            ((Paint) this.c.getValue()).setShader(new LinearGradient(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom, kphVar.a, (float[]) null, Shader.TileMode.CLAMP));
        }
        kph kphVar2 = nphVar.c;
        if (kphVar2 != null) {
            RectF rectFC2 = c(iWidth, kphVar2.b, iHeight);
            ((Paint) this.d.getValue()).setShader(new LinearGradient(rectFC2.left, rectFC2.top, rectFC2.right, rectFC2.bottom, kphVar2.a, (float[]) null, Shader.TileMode.CLAMP));
        }
        List list = nphVar.d;
        if (list != null) {
            b(list, this.g, this.h, iWidth, iHeight);
        }
        List list2 = nphVar.e;
        if (list2 != null) {
            b(list2, this.i, this.j, iWidth, iHeight);
        }
    }
}
