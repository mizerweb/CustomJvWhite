package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* JADX INFO: loaded from: classes.dex */
public final class g51 {
    public final Context a;
    public final int b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public g51(Context context) {
        mj9 mj9Var = l76.a;
        this.a = context;
        this.b = gm0.K(150.0f * yl5.d().getDisplayMetrics().density);
        final int i = 0;
        this.c = rx8.P(3, new af7(this) { // from class: f51
            public final /* synthetic */ g51 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                g51 g51Var = this.b;
                switch (i2) {
                    case 0:
                        Context context2 = g51Var.a;
                        a8g a8gVar = pq3.j;
                        return new ShapeDrawable[]{g51.b(((w56) a8gVar.e(context2).m().z().b).b), g51.b(((w56) a8gVar.e(context2).m().z().b).c), g51.b(((w56) a8gVar.e(context2).m().z().b).d), g51.b(((w56) a8gVar.e(context2).m().z().b).e)};
                    case 1:
                        int length = ((ShapeDrawable[]) g51Var.c.getValue()).length;
                        ylc[] ylcVarArr = new ylc[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            ylcVarArr[i3] = new ylc(new awd("x"), new awd("y"));
                        }
                        return ylcVarArr;
                    default:
                        return f55.o(g51Var.a);
                }
            }
        });
        final int i2 = 1;
        this.d = rx8.P(3, new af7(this) { // from class: f51
            public final /* synthetic */ g51 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                g51 g51Var = this.b;
                switch (i3) {
                    case 0:
                        Context context2 = g51Var.a;
                        a8g a8gVar = pq3.j;
                        return new ShapeDrawable[]{g51.b(((w56) a8gVar.e(context2).m().z().b).b), g51.b(((w56) a8gVar.e(context2).m().z().b).c), g51.b(((w56) a8gVar.e(context2).m().z().b).d), g51.b(((w56) a8gVar.e(context2).m().z().b).e)};
                    case 1:
                        int length = ((ShapeDrawable[]) g51Var.c.getValue()).length;
                        ylc[] ylcVarArr = new ylc[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            ylcVarArr[i4] = new ylc(new awd("x"), new awd("y"));
                        }
                        return ylcVarArr;
                    default:
                        return f55.o(g51Var.a);
                }
            }
        });
        final int i3 = 2;
        this.e = rx8.P(3, new af7(this) { // from class: f51
            public final /* synthetic */ g51 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                g51 g51Var = this.b;
                switch (i4) {
                    case 0:
                        Context context2 = g51Var.a;
                        a8g a8gVar = pq3.j;
                        return new ShapeDrawable[]{g51.b(((w56) a8gVar.e(context2).m().z().b).b), g51.b(((w56) a8gVar.e(context2).m().z().b).c), g51.b(((w56) a8gVar.e(context2).m().z().b).d), g51.b(((w56) a8gVar.e(context2).m().z().b).e)};
                    case 1:
                        int length = ((ShapeDrawable[]) g51Var.c.getValue()).length;
                        ylc[] ylcVarArr = new ylc[length];
                        for (int i5 = 0; i5 < length; i5++) {
                            ylcVarArr[i5] = new ylc(new awd("x"), new awd("y"));
                        }
                        return ylcVarArr;
                    default:
                        return f55.o(g51Var.a);
                }
            }
        });
    }

    public static ShapeDrawable b(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setMaskFilter(new BlurMaskFilter(1000.0f, BlurMaskFilter.Blur.NORMAL));
        return shapeDrawable;
    }

    public final BitmapDrawable a(kbc kbcVar, x0g x0gVar, Integer num) {
        int[] iArr;
        ny8 ny8Var;
        mj9 mj9Var = l76.a;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) l76.a.c(l76.a(kbcVar, x0gVar, num));
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        int iOrdinal = x0gVar.ordinal();
        if (iOrdinal == 0) {
            iArr = new int[]{((w56) kbcVar.z().b).b, ((w56) kbcVar.z().b).c, ((w56) kbcVar.z().b).d, ((w56) kbcVar.z().b).e};
        } else if (iOrdinal == 1) {
            iArr = new int[]{-12940805, -10285313, -5616385, -16745729};
        } else if (iOrdinal == 2) {
            iArr = new int[]{-16745729, -13908427, -14904446, -15024573};
        } else {
            if (iOrdinal != 3) {
                ore.o();
                return null;
            }
            iArr = new int[]{-9803158, -6645094, -8882570, -10197916};
        }
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ny8Var = this.c;
            if (i >= length) {
                break;
            }
            ((ShapeDrawable[]) ny8Var.getValue())[i2].getPaint().setColor(iArr[i]);
            i++;
            i2++;
        }
        ny8 ny8Var2 = this.e;
        int iMin = Math.min(((k4f) ny8Var2.getValue()).b / 2, ((k4f) ny8Var2.getValue()).a / 2);
        float f = iMin;
        float f2 = f / 2.0f;
        for (ShapeDrawable shapeDrawable : (ShapeDrawable[]) ny8Var.getValue()) {
            shapeDrawable.getShape().resize(f, f);
            shapeDrawable.setBounds(0, 0, iMin, iMin);
        }
        ny8 ny8Var3 = this.d;
        ylc[] ylcVarArr = (ylc[]) ny8Var3.getValue();
        int length2 = ylcVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            ylc ylcVar = ylcVarArr[i3];
            int i5 = i4 + 1;
            float f3 = this.b;
            float f4 = f3 + f2;
            double d = i4 * 1.5707964f;
            float f5 = f;
            float f6 = f2;
            float fCos = (f6 * ((float) Math.cos(d))) + f4;
            float fSin = (((float) Math.sin(d)) * f6) + f4;
            ((awd) ylcVar.a).a = fCos;
            ((awd) ylcVar.b).a = fSin;
            iMin = Math.max(iMin, gm0.K(fCos + f5 + f3));
            i3++;
            f = f5;
            i4 = i5;
            ny8Var3 = ny8Var3;
            f2 = f6;
        }
        ny8 ny8Var4 = ny8Var3;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        ShapeDrawable[] shapeDrawableArr = (ShapeDrawable[]) ny8Var.getValue();
        int length3 = shapeDrawableArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length3) {
            ShapeDrawable shapeDrawable2 = shapeDrawableArr[i6];
            int i8 = i7 + 1;
            ylc ylcVar2 = ((ylc[]) ny8Var4.getValue())[i7];
            awd awdVar = (awd) ylcVar2.a;
            awd awdVar2 = (awd) ylcVar2.b;
            float f7 = awdVar.a;
            float f8 = awdVar2.a;
            int iSave = canvas.save();
            canvas.translate(f7, f8);
            try {
                shapeDrawable2.draw(canvas);
                canvas.restoreToCount(iSave);
                i6++;
                i7 = i8;
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.a.getResources(), bitmapCreateBitmap);
        bitmapDrawable2.setBounds(0, 0, iMin, iMin);
        mj9 mj9Var2 = l76.a;
        l76.a.d(l76.a(kbcVar, x0gVar, num), bitmapDrawable2);
        return bitmapDrawable2;
    }
}
