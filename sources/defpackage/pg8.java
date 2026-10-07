package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class pg8 extends f83 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ qg8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg8(qg8 qg8Var) {
        super(4, null);
        this.d = qg8Var;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        qg8 qg8Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    Drawable drawable = (Drawable) obj2;
                    if (drawable != null) {
                        drawable.setBounds(qg8Var.getBounds());
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    qg8Var.d.setColor(iIntValue);
                    qg8Var.invalidateSelf();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg8(Integer num, qg8 qg8Var) {
        super(4, num);
        this.d = qg8Var;
    }
}
