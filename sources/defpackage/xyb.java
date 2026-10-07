package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class xyb extends f83 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ yyb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyb(yyb yybVar) {
        super(4, wyb.a);
        this.d = yybVar;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        yyb yybVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    cs csVar = yybVar.e;
                    ViewGroup.LayoutParams layoutParams = csVar.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        layoutParams.width = iIntValue;
                        layoutParams.height = iIntValue;
                        csVar.setLayoutParams(layoutParams);
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    yybVar.onThemeChanged(yybVar.getCurrentTheme());
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyb(Integer num, yyb yybVar) {
        super(4, num);
        this.d = yybVar;
    }
}
