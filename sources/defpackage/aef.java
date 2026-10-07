package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class aef extends g6g {
    public final qyb f;
    public final ExecutorService g;

    public aef(qyb qybVar, ExecutorService executorService) {
        super(executorService);
        this.f = qybVar;
        this.g = executorService;
    }

    @Override // defpackage.g6g
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        ((zdf) s7gVar).B((oh7) ((k79) F(i)));
    }

    @Override // defpackage.g6g, defpackage.nee
    public final void u(lfe lfeVar, int i) {
        ((zdf) lfeVar).B((oh7) ((k79) F(i)));
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = zdf.y;
        Context context = viewGroup.getContext();
        l1c l1cVar = new l1c(context);
        l1cVar.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density)));
        l1cVar.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 8.0f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        q9i.a(q9i.e, appCompatTextView);
        appCompatTextView.setPadding(gm0.K(8.0f * yl5.d().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setVerticalGravity(16);
        linearLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        linearLayout.addView(l1cVar);
        linearLayout.addView(appCompatTextView);
        return new zdf(this.f, l1cVar, appCompatTextView, linearLayout);
    }
}
