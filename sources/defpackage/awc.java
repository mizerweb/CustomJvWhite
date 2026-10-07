package defpackage;

import android.content.Context;
import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes2.dex */
public final class awc extends f83 {
    public final /* synthetic */ bwc c;
    public final /* synthetic */ Context d;

    /* JADX WARN: Illegal instructions before constructor call */
    public awc(bwc bwcVar, Context context) {
        Boolean bool = Boolean.FALSE;
        this.c = bwcVar;
        this.d = context;
        super(4, bool);
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        if (cqk.d(obj, obj2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj).getClass();
        bwc bwcVar = this.c;
        if (!zBooleanValue) {
            bwcVar.u = null;
        } else {
            bwcVar.u = new ScaleGestureDetector(this.d, new g72(1, bwcVar));
        }
    }
}
