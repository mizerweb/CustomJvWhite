package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class t6g extends yj7 {
    public static u1d i;
    public x0 h;

    public t6g(Context context) {
        super(context);
        e(context);
    }

    public final void e(Context context) {
        try {
            qe7.v();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                oc9.q(i, "SimpleDraweeView was not initialized!");
                this.h = i.get();
            }
        } finally {
            qe7.v();
        }
    }

    public final void f(Uri uri) {
        x0 x0Var = this.h;
        x0Var.b = null;
        t1d t1dVar = (t1d) x0Var;
        t1dVar.b(uri);
        t1dVar.j = getController();
        setController(t1dVar.a());
    }

    public x0 getControllerBuilder() {
        return this.h;
    }

    public void setActualImageResource(int i2) {
        f(rki.c(i2));
    }

    public void setImageRequest(v78 v78Var) {
        x0 x0Var = this.h;
        x0Var.c = v78Var;
        x0Var.j = getController();
        setController(x0Var.a());
    }

    @Override // defpackage.fu5, android.widget.ImageView
    public void setImageResource(int i2) {
        super.setImageResource(i2);
    }

    public void setImageURI(String str) {
        f(str != null ? Uri.parse(str) : null);
    }

    @Override // defpackage.fu5, android.widget.ImageView
    public void setImageURI(Uri uri) {
        f(uri);
    }
}
