package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ioh extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ joh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ioh(Object obj, joh johVar, int i) {
        super(4, obj);
        this.c = i;
        this.d = johVar;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        joh johVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    johVar.onThemeChanged(johVar.getTheme());
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    johVar.setBackground((Drawable) obj2);
                }
                break;
        }
    }
}
