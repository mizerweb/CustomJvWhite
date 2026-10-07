package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class ynh implements Parcelable {
    public static final j85 a = new j85(25);
    public static final xnh b = new xnh("");

    public final CharSequence a(lfe lfeVar) {
        return c(lfeVar.a.getContext().getResources());
    }

    public final CharSequence b(Context context) {
        return c(context.getResources());
    }

    public final CharSequence c(Resources resources) {
        if (this instanceof tnh) {
            return resources.getText(((tnh) this).c);
        }
        if (this instanceof vnh) {
            vnh vnhVar = (vnh) this;
            Object[] array = vnhVar.d.toArray(new Object[0]);
            return resources.getString(vnhVar.c, Arrays.copyOf(array, array.length));
        }
        if (this instanceof pnh) {
            pnh pnhVar = (pnh) this;
            int i = pnhVar.d;
            return resources.getQuantityString(pnhVar.c, i, Integer.valueOf(i));
        }
        if (this instanceof xnh) {
            return ((xnh) this).c;
        }
        if (!(this instanceof rnh)) {
            ore.o();
            return null;
        }
        rnh rnhVar = (rnh) this;
        Object[] array2 = rnhVar.e.toArray(new Object[0]);
        return resources.getQuantityString(rnhVar.c, rnhVar.d, Arrays.copyOf(array2, array2.length));
    }

    public final CharSequence d(View view) {
        return c(view.getContext().getResources());
    }

    public final CharSequence e() {
        CharSequence charSequence;
        xnh xnhVar = this instanceof xnh ? (xnh) this : null;
        return (xnhVar == null || (charSequence = xnhVar.c) == null) ? "" : charSequence;
    }
}
