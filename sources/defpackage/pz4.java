package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pz4 implements sgh {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pz4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rgh
    public final void a(ugh ughVar) {
        owb tabItem;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                y8j y8jVar = (y8j) obj;
                int i2 = ughVar.a;
                int currentItem = y8jVar.getCurrentItem() - i2;
                if (Math.abs(currentItem) > 1) {
                    int iAbs = (Math.abs(currentItem) - 1) * Integer.signum(currentItem) * y8jVar.getWidth();
                    y8jVar.a();
                    y8jVar.c(iAbs);
                    y8jVar.b();
                }
                y8jVar.h(i2, true);
                break;
            default:
                n67 n67Var = (n67) obj;
                View view = ughVar.b;
                String str = null;
                z9c z9cVar = view instanceof z9c ? (z9c) view : null;
                if (z9cVar != null && (tabItem = z9cVar.getTabItem()) != null) {
                    str = tabItem.a;
                }
                n67Var.q = str;
                break;
        }
    }
}
