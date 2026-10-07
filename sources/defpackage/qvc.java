package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import one.me.mediaeditor.PhotoEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class qvc {
    public final PhotoEditScreen a;
    public final c36 b;
    public final ex8 c;
    public final pvc d;
    public tvc e;

    public qvc(PhotoEditScreen photoEditScreen, c36 c36Var, ex8 ex8Var, pvc pvcVar, y26 y26Var) {
        this.a = photoEditScreen;
        this.b = c36Var;
        c36Var.b = this;
        this.c = ex8Var;
        photoEditScreen.g.add(this);
        this.d = pvcVar;
        boolean z = (y26Var == null || y26Var.a.isEmpty()) ? false : true;
        tvc tvcVar = new tvc(false, z, z, false, false, true, false, true);
        this.e = tvcVar;
        photoEditScreen.p1(tvcVar);
        pvcVar.a(c36Var, y26Var, true);
    }

    public final Bitmap a() {
        int iHeight;
        g36 g36Var = this.b.a;
        Rect bounds = g36Var.getBounds();
        int iWidth = 2000;
        if (bounds.width() > bounds.height()) {
            iHeight = (int) ((bounds.height() / bounds.width()) * 2000.0f);
        } else {
            iWidth = (int) ((bounds.width() / bounds.height()) * 2000.0f);
            iHeight = 2000;
        }
        if (iWidth == 0 || iHeight == 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        Rect resultBounds = g36Var.getResultBounds();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        for (x26 x26Var : new ArrayList(g36Var.getLayers())) {
            if (x26Var instanceof fm0) {
                Drawable drawable = ((fm0) x26Var).a;
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                canvas.scale(iWidth / resultBounds.width(), iHeight / resultBounds.height());
                canvas.translate(-resultBounds.left, -resultBounds.top);
            } else {
                x26Var.draw(canvas);
            }
        }
        return bitmapCreateBitmap;
    }
}
