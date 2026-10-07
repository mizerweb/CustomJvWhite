package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nef extends y69 {
    public static final /* synthetic */ zv8[] h;
    public final sy9 e;
    public qf7 f;
    public final t5d g;

    static {
        z8b z8bVar = new z8b(nef.class, "selectedId", "getSelectedId()J");
        zfe.a.getClass();
        h = new zv8[]{z8bVar};
    }

    public nef(hff hffVar, ExecutorService executorService) {
        super(new ki3(null, executorService, k45.j));
        this.e = hffVar;
        this.f = new wf0(24);
        this.g = new t5d(this);
    }

    @Override // defpackage.y69
    public final void G(List list, List list2) {
        this.f.invoke(list, list2);
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        mef mefVar = (mef) lfeVar;
        jef jefVar = (jef) F(i);
        zv8 zv8Var = h[0];
        mefVar.B(jefVar, ((Number) this.g.b).longValue() == jefVar.a.a);
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        mef mefVar = (mef) lfeVar;
        jef jefVar = (jef) F(i);
        zv8 zv8Var = h[0];
        boolean z = ((Number) this.g.b).longValue() == jefVar.a.a;
        if (list.contains("payload_selection")) {
            mefVar.C(z);
        } else {
            mefVar.B(jefVar, z);
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = mef.A;
        Context context = viewGroup.getContext();
        l1c l1cVar = new l1c(context);
        l1cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Drawable drawable = context.getDrawable(R.drawable.icon_cross_mini);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 10.0f);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), 8388613);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        layoutParams.setMargins(iK, iK, iK, iK);
        imageView.setLayoutParams(layoutParams);
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        imageView.setPadding(iK2, iK2, iK2, iK2);
        imageView.setImageDrawable(drawable);
        imageView.setBackground(gradientDrawable);
        Drawable drawable2 = context.getDrawable(R.drawable.icon_video_call_fill);
        ImageView imageView2 = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388693);
        int iK3 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        layoutParams2.setMargins(iK3, iK3, iK3, iK3);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setImageDrawable(drawable2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
        gradientDrawable2.setColor(0);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
        gradientDrawable3.setStroke(0, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 64.0f), gm0.K(64.0f * yl5.d().getDisplayMetrics().density));
        layoutParams3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, gm0.K(2.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        frameLayout.setLayoutParams(layoutParams3);
        frameLayout.setBackground(gradientDrawable2);
        frameLayout.setForeground(gradientDrawable3);
        frameLayout.setClipToOutline(true);
        frameLayout.addView(l1cVar);
        frameLayout.addView(imageView);
        frameLayout.addView(imageView2);
        n1g.N(new vc3(drawable, drawable2, gradientDrawable, null, 7), frameLayout);
        return new mef(this.e, l1cVar, imageView, imageView2, frameLayout);
    }
}
