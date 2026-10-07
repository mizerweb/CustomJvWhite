package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class bqh extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cqh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqh(Object obj, cqh cqhVar, int i) {
        super(4, obj);
        this.c = i;
        this.d = cqhVar;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        cqh cqhVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    cqhVar.onThemeChanged(cqhVar.getTheme());
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    cqhVar.setBackground((Drawable) obj2);
                }
                break;
        }
    }
}
