package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lr extends o4m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o4m, defpackage.e9j
    public void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((vr) ((pi) obj).b).u.setVisibility(0);
                break;
            case 1:
                vr vrVar = (vr) obj;
                vrVar.u.setVisibility(0);
                if (vrVar.u.getParent() instanceof View) {
                    View view = (View) vrVar.u.getParent();
                    WeakHashMap weakHashMap = i7j.a;
                    w6j.c(view);
                }
                break;
        }
    }

    @Override // defpackage.e9j
    public final void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                vr vrVar = (vr) ((pi) obj).b;
                vrVar.u.setAlpha(1.0f);
                vrVar.x.d(null);
                vrVar.x = null;
                break;
            case 1:
                vr vrVar2 = (vr) obj;
                vrVar2.u.setAlpha(1.0f);
                vrVar2.x.d(null);
                vrVar2.x = null;
                break;
            default:
                vr vrVar3 = (vr) ((ih) obj).b;
                vrVar3.u.setVisibility(8);
                PopupWindow popupWindow = vrVar3.v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vrVar3.u.getParent() instanceof View) {
                    View view = (View) vrVar3.u.getParent();
                    WeakHashMap weakHashMap = i7j.a;
                    w6j.c(view);
                }
                vrVar3.u.e();
                vrVar3.x.d(null);
                vrVar3.x = null;
                ViewGroup viewGroup = vrVar3.A;
                WeakHashMap weakHashMap2 = i7j.a;
                w6j.c(viewGroup);
                break;
        }
    }
}
