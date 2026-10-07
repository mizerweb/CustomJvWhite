package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class rv7 extends ColorDrawable {
    public final /* synthetic */ sfe a;
    public final /* synthetic */ Path b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv7(sfe sfeVar, Path path, int i) {
        super(i);
        this.a = sfeVar;
        this.b = path;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.a.a) {
            canvas.clipOutPath(this.b);
        }
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
