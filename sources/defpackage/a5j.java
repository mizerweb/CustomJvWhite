package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a5j extends a8j {
    public static final /* synthetic */ zv8[] y;
    public final Context c;
    public final ny8 d;
    public final lwi e;
    public final long f;
    public final ny8 h;
    public final mjg j;
    public final r8e k;
    public final mjg l;
    public final mjg m;
    public final mjg n;
    public final mjg o;
    public final r07 p;
    public final r8e q;
    public final r8e r;
    public List s;
    public int t;
    public int u;
    public int v;
    public int w;
    public b5j x;
    public final String g = a5j.class.getName();
    public final p3c i = qyj.S();

    static {
        z8b z8bVar = new z8b(a5j.class, "thumbnailsJob", "getThumbnailsJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        y = new zv8[]{z8bVar};
    }

    public a5j(Context context, ny8 ny8Var, lwi lwiVar, long j, ny8 ny8Var2) {
        this.c = context;
        this.d = ny8Var;
        this.e = lwiVar;
        this.f = j;
        this.h = ny8Var2;
        mjg mjgVarA = p90.a(null);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(0L);
        this.l = mjgVarA2;
        mjg mjgVarA3 = p90.a(0L);
        this.m = mjgVarA3;
        mjg mjgVarA4 = p90.a(Float.valueOf(0.0f));
        this.n = mjgVarA4;
        mjg mjgVarA5 = p90.a(Float.valueOf(1.0f));
        this.o = mjgVarA5;
        this.p = new r07(mjgVarA2, mjgVarA3, new z4j(3, null), 0);
        this.q = new r8e(mjgVarA4);
        this.r = new r8e(mjgVarA5);
        this.s = r66.a;
    }

    public static Bitmap B(Canvas canvas, Bitmap bitmap, int i, Bitmap bitmap2, Rect rect) {
        if (bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) {
            return bitmap;
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        canvas.setBitmap(bitmapCopy);
        if (rect != null) {
            canvas.drawBitmap(bitmap2, rect, new Rect(i, 0, rect.width() + i, bitmap.getHeight()), (Paint) null);
            return bitmapCopy;
        }
        canvas.drawBitmap(bitmap2, i, 0.0f, (Paint) null);
        return bitmapCopy;
    }

    public final void C(List list, int i, int i2, int i3, int i4) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) ((xhh) this.d.getValue())).a(), 2, new y4j(list, this, i4, i3, i2, i, null));
        this.i.B(this, y[0], sggVarH0);
    }

    public final void D(float f) {
        Long lValueOf = Long.valueOf((long) (((Number) this.l.getValue()).floatValue() * f));
        mjg mjgVar = this.m;
        mjgVar.getClass();
        mjgVar.j(null, lValueOf);
        b5j b5jVar = this.x;
        if (b5jVar != null) {
            b5jVar.k(f);
        }
    }

    @Override // defpackage.a8j
    public final void y() {
        this.x = null;
    }

    @Override // defpackage.a8j
    public final void z() {
        mjg mjgVar = this.j;
        Bitmap bitmap = (Bitmap) mjgVar.getValue();
        if (bitmap != null) {
            rel.b(bitmap);
        }
        mjgVar.setValue(null);
    }
}
