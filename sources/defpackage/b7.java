package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class b7 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e7 e7Var = (e7) obj;
                float f = e7Var.m;
                float f2 = e7Var.n;
                float f3 = e7Var.o;
                outline.setOval((int) (f2 - f), (int) (f3 - f), (int) (f2 + f), (int) (f3 + f));
                break;
            case 1:
                dq3 dq3Var = ((cq3) obj).e;
                if (dq3Var == null) {
                    outline.setAlpha(0.0f);
                } else {
                    dq3Var.getOutline(outline);
                }
                break;
            case 2:
                ImageView imageView = (ImageView) obj;
                if (outline != null) {
                    outline.setOval(0, 0, imageView.getWidth(), imageView.getHeight());
                }
                break;
            case 3:
                outline.setRoundRect(0, 0, view.getWidth(), ((ogd) obj).m, gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                break;
            case 4:
                cqh cqhVar = (cqh) obj;
                if (outline != null) {
                    outline.setRoundRect(0, 0, cqhVar.getWidth(), cqhVar.getHeight(), yl5.d().getDisplayMetrics().density * 10.0f);
                }
                break;
            default:
                cyi cyiVar = (cyi) obj;
                if (outline != null) {
                    outline.setOval(0, 0, view != null ? view.getMeasuredWidth() : cyiVar.getMeasuredWidth(), view != null ? view.getMeasuredHeight() : cyiVar.getMeasuredHeight());
                }
                break;
        }
    }
}
