package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class sa9 implements e68 {
    public final Context a;
    public final lk9 b;

    public sa9(Context context, lk9 lk9Var) {
        this.a = context;
        this.b = lk9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e68
    public final xt3 a(p76 p76Var, int i, i1e i1eVar, d68 d68Var) {
        Context context = this.a;
        try {
            String str = p76Var.j;
            if (str == null) {
                throw new IllegalStateException("No source in encoded image");
            }
            Drawable drawable = context.getDrawable(Integer.parseInt(Uri.parse(str).getPathSegments().get(0)));
            eph ephVar = drawable instanceof eph ? (eph) drawable : null;
            a8g a8gVar = pq3.j;
            if (ephVar != null) {
                ephVar.onThemeChanged(a8gVar.e(context).m());
            }
            if (drawable != 0) {
                return new e95(drawable, (r8e) a8gVar.e(context).h, this.b);
            }
            return null;
        } catch (Throwable th) {
            pj6.c("DrawableImageDecoder", "Cannot decode drawable", th);
            return null;
        }
    }
}
