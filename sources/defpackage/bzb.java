package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bzb implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ bzb(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a8g a8gVar = pq3.j;
        Context context = this.b;
        switch (i) {
            case 0:
                return so2.F(context, 6);
            case 1:
                s6c s6cVar = new s6c(context);
                s6cVar.setId(R.id.oneme_cell_simple_radiobutton);
                s6cVar.setChecked(false);
                return s6cVar;
            case 2:
                cs csVar = new cs(context);
                csVar.setId(R.id.oneme_compact_banner_background);
                uf4 uf4Var = new uf4(0, 0);
                uf4Var.t = 0;
                uf4Var.i = 0;
                uf4Var.v = 0;
                uf4Var.l = 0;
                csVar.setLayoutParams(uf4Var);
                csVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return csVar;
            case 3:
                ImageView imageViewD = qv1.d(context, R.id.oneme_compact_banner_image);
                uf4 uf4Var2 = new uf4(-2, -2);
                uf4Var2.i = R.id.oneme_compact_banner_image_container;
                uf4Var2.v = R.id.oneme_compact_banner_image_container;
                uf4Var2.l = R.id.oneme_compact_banner_image_container;
                uf4Var2.t = R.id.oneme_compact_banner_image_container;
                imageViewD.setLayoutParams(uf4Var2);
                n1g.N(new o23(3, null, 4), imageViewD);
                return imageViewD;
            case 4:
                return new EnhancedVectorDrawable(context, R.drawable.ic_delete_filled_apart_24);
            case 5:
                return new ContextThemeWrapper(context, R.style.Theme_MaterialComponents);
            case 6:
                ImageView imageViewD2 = qv1.d(context, R.id.oneme_middle_banner_image);
                uf4 uf4Var3 = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                uf4Var3.i = R.id.oneme_middle_banner_image_container;
                uf4Var3.v = R.id.oneme_middle_banner_image_container;
                uf4Var3.l = R.id.oneme_middle_banner_image_container;
                uf4Var3.t = R.id.oneme_middle_banner_image_container;
                imageViewD2.setLayoutParams(uf4Var3);
                n1g.N(new o23(3, null, 5), imageViewD2);
                return imageViewD2;
            case 7:
                return new EnhancedVectorDrawable(context, R.drawable.ic_delete_filled_apart_24);
            case 8:
                cs csVar2 = new cs(context);
                csVar2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density)));
                return csVar2;
            case 9:
                nu4 nu4Var = new nu4(context);
                nu4Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return nu4Var;
            case 10:
                cyb cybVar = new cyb(context);
                cybVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                cybVar.setSize(ayb.j);
                cybVar.setAppearance(zxb.PRIMARY_CONTRAST);
                return cybVar;
            case 11:
                TextView textView = new TextView(context);
                textView.setLayoutParams(new uf4(gm0.K(0.0f * yl5.d().getDisplayMetrics().density), -2));
                q9i.a(q9i.i, textView);
                a8gVar.h(textView);
                textView.setTextColor(-1);
                textView.setMaxLines(3);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                return textView;
            case 12:
                TextView textView2 = new TextView(context);
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                q9i.a(q9i.i, textView2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setSingleLine();
                textView2.setTextColor(a8gVar.l(textView2).b.getText().b);
                return textView2;
            case 13:
                TextView textViewE = qv1.e(context, R.id.oneme_button_textview_id);
                textViewE.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
                return textViewE;
            case 14:
                PopupWindow popupWindow = new PopupWindow(context);
                popupWindow.setBackgroundDrawable(null);
                popupWindow.setElevation(yl5.d().getDisplayMetrics().density * 12.0f);
                popupWindow.setFocusable(true);
                return popupWindow;
            case 15:
                return new ycc(context, null, 0);
            case 16:
                return new r59(null, new bzb(context, 17), 7);
            case 17:
                return Integer.valueOf(((xac) a8gVar.e(context).m().f().b).b.a);
            case 18:
                Size sizeW = p90.w(context);
                return Integer.valueOf(Math.max(sizeW.getWidth(), sizeW.getHeight()));
            case 19:
                Size sizeW2 = p90.w(context);
                int iMin = (int) ((Math.min(sizeW2.getWidth(), sizeW2.getHeight()) / 3.0d) * 2.0d);
                if (iMin < 400) {
                    iMin = 400;
                }
                return Integer.valueOf(iMin);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new jr6(context);
            case 21:
                v0c v0cVar = new v0c(context);
                v0cVar.setAppearance(p0c.c);
                v0cVar.setAppearanceMode(q0c.b);
                return v0cVar;
            case 22:
                ImageView imageViewD3 = qv1.d(context, R.id.writebar_hide_author);
                imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                imageViewD3.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageViewD3).getIcon().h));
                x05.j(8.0f, yl5.d().getDisplayMetrics().density, imageViewD3);
                return imageViewD3;
            case 23:
                ImageView imageViewD4 = qv1.d(context, R.id.writebar_close);
                imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density)));
                imageViewD4.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageViewD4).getIcon().c));
                x05.j(10.0f, yl5.d().getDisplayMetrics().density, imageViewD4);
                return imageViewD4;
            case 24:
                ImageView imageView = new ImageView(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                imageView.setLayoutParams(layoutParams);
                return imageView;
            case 25:
                ViewStub viewStub = new ViewStub(context);
                viewStub.setId(R.id.call_round_btn_counter);
                viewStub.setVisibility(8);
                return viewStub;
            case 26:
                return bc1.i(context, R.id.call_round_btn_title);
            case 27:
                return qv1.d(context, R.id.call_round_btn_icon);
            case 28:
                TextView textViewE2 = qv1.e(context, R.id.call_round_btn_title);
                textViewE2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                textViewE2.setTextColor(a8gVar.l(textViewE2).b.getText().b);
                q9i.a(q9i.i, textViewE2);
                textViewE2.setVisibility(8);
                textViewE2.setGravity(17);
                return textViewE2;
            default:
                return new q6f(context, null, 0);
        }
    }
}
