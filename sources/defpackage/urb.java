package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class urb extends TextView {
    public m8j a;

    public urb(Context context) {
        super(context, null, 0);
    }

    public final m8j getObserverSpanListener() {
        return this.a;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        m8j m8jVar;
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            if (i == 8 && (m8jVar = this.a) != null) {
                m8jVar.onViewDetachedFromWindow(this);
                return;
            }
            return;
        }
        m8j m8jVar2 = this.a;
        if (m8jVar2 != null) {
            m8jVar2.onViewAttachedToWindow(this);
        }
    }

    public final void setObserverSpanListener(m8j m8jVar) {
        this.a = m8jVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
