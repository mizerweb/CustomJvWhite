package defpackage;

import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e95 extends f95 implements eph, xt3 {
    public Drawable d;
    public final gjg e;
    public boolean f;
    public final dq4 g;

    public e95(Drawable drawable, gjg gjgVar, lk9 lk9Var) {
        this.d = drawable;
        this.e = gjgVar;
        dq4 dq4VarA = cqk.a(lk9Var);
        this.g = dq4VarA;
        e9i.j0(new fz6(gjgVar, new xm3(2, this, e95.class, "onThemeChanged", "onThemeChanged(Lone/me/sdk/design/theme/OneMeTheme;)V", 4, 2), 3), dq4VarA);
    }

    @Override // defpackage.xt3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        cqk.g(this.g);
        Object obj = this.d;
        Closeable closeable = obj instanceof Closeable ? (Closeable) obj : null;
        if (closeable != null) {
            closeable.close();
        }
        this.d = null;
        this.f = true;
    }

    @Override // defpackage.xt3, defpackage.l68
    public final int getHeight() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.xt3
    public final int getSizeInBytes() {
        return getHeight() * getWidth() * 4;
    }

    @Override // defpackage.xt3, defpackage.l68
    public final int getWidth() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.xt3
    public final boolean isClosed() {
        return this.f;
    }

    @Override // defpackage.hq0, defpackage.xt3
    public final boolean isStateful() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable l() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return null;
        }
        Drawable drawableMutate = drawable.mutate();
        if (drawableMutate != drawable) {
            drawableMutate.setBounds(drawable.getBounds());
        }
        if (drawableMutate instanceof eph) {
            ((eph) drawableMutate).onThemeChanged((kbc) this.e.getValue());
        }
        return drawableMutate;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Object obj = this.d;
        eph ephVar = obj instanceof eph ? (eph) obj : null;
        if (ephVar != null) {
            ephVar.onThemeChanged(kbcVar);
        }
    }
}
