package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class rdb extends p0g {
    public static final /* synthetic */ zv8[] j;
    public final Path g = new Path();
    public final RectF h = new RectF();
    public final zb i = new zb(this);

    static {
        z8b z8bVar = new z8b(rdb.class, "cornerRadius", "getCornerRadius()F");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    @Override // defpackage.p0g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.h;
        rectF.set(bounds);
        Path path = this.g;
        path.reset();
        zv8[] zv8VarArr = j;
        zv8 zv8Var = zv8VarArr[0];
        zb zbVar = this.i;
        float fFloatValue = ((Number) zbVar.b).floatValue();
        zv8 zv8Var2 = zv8VarArr[0];
        path.addRoundRect(rectF, fFloatValue, ((Number) zbVar.b).floatValue(), Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
    }
}
