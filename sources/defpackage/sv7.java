package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class sv7 implements y9j {
    public final Rect a = new Rect();
    public final /* synthetic */ sfe b;
    public final /* synthetic */ Path c;
    public final /* synthetic */ Path d;
    public final /* synthetic */ Rect e;
    public final /* synthetic */ Rect f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ Rect h;
    public final /* synthetic */ RectF i;
    public final /* synthetic */ Float j;
    public final /* synthetic */ float[] k;
    public final /* synthetic */ RectF l;
    public final /* synthetic */ View m;

    public sv7(sfe sfeVar, Path path, Path path2, Rect rect, Rect rect2, Integer num, Rect rect3, RectF rectF, Float f, float[] fArr, RectF rectF2, View view) {
        this.b = sfeVar;
        this.c = path;
        this.d = path2;
        this.e = rect;
        this.f = rect2;
        this.g = num;
        this.h = rect3;
        this.i = rectF;
        this.j = f;
        this.k = fArr;
        this.l = rectF2;
        this.m = view;
    }

    @Override // defpackage.y9j
    public final void a(Rect rect, View view) {
        View viewF;
        Rect rect2 = this.a;
        if (cqk.d(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        this.b.a = true;
        Path path = this.c;
        path.reset();
        Path path2 = this.d;
        path2.reset();
        Rect rect3 = this.e;
        rect3.set(rect);
        WeakHashMap weakHashMap = i7j.a;
        ixj ixjVarA = z6j.a(view);
        mi8 mi8VarF = ixjVarA != null ? ixjVarA.a.f(519) : null;
        do5 do5VarE = ixjVarA != null ? ixjVarA.a.e() : null;
        int iMax = Math.max(mi8VarF != null ? mi8VarF.a : 0, do5VarE != null ? do5VarE.b() : 0);
        if (iMax != 0) {
            rect3.left -= iMax;
            rect3.right -= iMax;
        }
        Rect rect4 = tv7.b;
        Rect rect5 = this.f;
        if (rect5 != rect4) {
            rect3.left += rect5.left;
            rect3.top += rect5.top;
            rect3.right -= rect5.right;
            rect3.bottom -= rect5.bottom;
        }
        Integer num = this.g;
        if (num == null || (viewF = n7j.f(view, num.intValue())) == null) {
            viewF = (View) view.getParent();
        }
        Rect rect6 = this.h;
        n9j.e(rect6, viewF);
        RectF rectF = this.i;
        rectF.set(rect3);
        rectF.top = Math.max(rect3.top, rect6.top);
        rectF.bottom = Math.min(rect3.bottom, rect6.bottom);
        if (this.j != null) {
            Path.Direction direction = Path.Direction.CCW;
            path2.addRect(rectF, direction);
            RectF rectF2 = this.l;
            rectF2.set(rect3);
            path.addRoundRect(rectF2, this.k, direction);
            path.op(path2, Path.Op.INTERSECT);
        } else {
            path.addRect(rectF, Path.Direction.CCW);
        }
        Drawable background = this.m.getBackground();
        if (background != null) {
            background.invalidateSelf();
        }
    }

    @Override // defpackage.y9j
    public final void b() {
        this.c.reset();
        this.d.reset();
        this.b.a = false;
        Drawable background = this.m.getBackground();
        if (background != null) {
            background.invalidateSelf();
        }
    }
}
