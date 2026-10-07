package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ls implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ls(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                us usVar = (us) obj;
                if (!usVar.getInternalPopup().a()) {
                    usVar.f.i(usVar.getTextDirection(), usVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = usVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                rs rsVar = (rs) obj;
                us usVar2 = rsVar.G;
                if (usVar2.isAttachedToWindow() && usVar2.getGlobalVisibleRect(rsVar.E)) {
                    rsVar.s();
                    rsVar.m();
                } else {
                    rsVar.dismiss();
                }
                break;
            case 2:
                yn2 yn2Var = (yn2) obj;
                ArrayList arrayList = yn2Var.h;
                if (yn2Var.a() && arrayList.size() > 0 && !((xn2) arrayList.get(0)).a.y) {
                    View view = yn2Var.o;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((xn2) it.next()).a.m();
                        }
                    } else {
                        yn2Var.dismiss();
                    }
                    break;
                }
                break;
            default:
                vgg vggVar = (vgg) obj;
                nca ncaVar = vggVar.h;
                if (vggVar.a() && !ncaVar.y) {
                    View view2 = vggVar.m;
                    if (view2 != null && view2.isShown()) {
                        ncaVar.m();
                    } else {
                        vggVar.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
