package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xj7 {
    public static final i1f q = i1f.m;
    public static final i1f r = i1f.l;
    public final Resources a;
    public int b = 300;
    public final float c = 0.0f;
    public Drawable d = null;
    public final cqk e;
    public Drawable f;
    public final cqk g;
    public Drawable h;
    public final cqk i;
    public Drawable j;
    public final cqk k;
    public cqk l;
    public final Drawable m;
    public final List n;
    public final StateListDrawable o;
    public eve p;

    public xj7(Resources resources) {
        this.a = resources;
        i1f i1fVar = q;
        this.e = i1fVar;
        this.f = null;
        this.g = i1fVar;
        this.h = null;
        this.i = i1fVar;
        this.j = null;
        this.k = i1fVar;
        this.l = r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public final wj7 a() {
        List list = this.n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).getClass();
            }
        }
        return new wj7(this);
    }
}
