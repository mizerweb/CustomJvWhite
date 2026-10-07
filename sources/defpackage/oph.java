package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class oph extends Drawable {
    public final nph a;
    public final boolean b;
    public final ny8 c;

    public oph(nph nphVar, boolean z) {
        this.a = nphVar;
        this.b = z;
        this.c = rx8.P(3, new xlf(5, this));
    }

    public final oph a(float f) {
        geh gehVarMutate;
        geh gehVarB;
        nph nphVar = this.a;
        mph mphVar = nphVar.a;
        mph mphVarA = null;
        if (mphVar == null || (gehVarB = mphVar.b()) == null) {
            gehVarMutate = null;
        } else {
            gehVarMutate = gehVarB.mutate();
            gehVarMutate.b(f);
        }
        if (gehVarMutate != null) {
            mphVar.getClass();
            mphVarA = mph.a(gehVarMutate);
        }
        return new oph(new nph(mphVarA, nphVar.b, nphVar.c, nphVar.d, nphVar.e, nphVar.f), false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ((pri) this.c.getValue()).e(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        return a(1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        ((pri) this.c.getValue()).f(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public oph(tri triVar) {
        this(sb8.q0(triVar, null), true);
    }
}
