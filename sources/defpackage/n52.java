package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n52 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ n52(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a8g a8gVar = pq3.j;
        Context context = this.b;
        switch (i) {
            case 0:
                return o1m.b(context, Integer.valueOf(gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
            case 1:
                return new umb(context);
            case 2:
                return new oue(context);
            case 3:
                TextView textView = new TextView(context);
                q9i.a(q9i.i, textView);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                textView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
                textView.setTextColor(a8gVar.h(textView).getText().j);
                return textView;
            case 4:
                return Boolean.valueOf(((InputMethodManager) context.getSystemService("input_method")).isActive());
            case 5:
                bj9 bj9Var = new bj9(context, null);
                bj9Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                bj9Var.setVisibility(8);
                return bj9Var;
            case 6:
                TextView textView2 = new TextView(context);
                textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                textView2.setText(R.string.common_no);
                q9i.a(q9i.i, textView2);
                textView2.setTextColor(a8gVar.h(textView2).getText().j);
                return textView2;
            case 7:
                TextView textView3 = new TextView(context);
                textView3.setText(R.string.fake_boss_show_mutual_chats);
                q9i.a(q9i.i, textView3);
                textView3.setTextColor(a8gVar.h(textView3).getText().d);
                return textView3;
            case 8:
                ImageView imageView = new ImageView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                layoutParams.leftMargin = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageResource(R.drawable.icon_chevron_right);
                imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView).getIcon().d));
                return imageView;
            case 9:
                return new tz0(context, 1);
            case 10:
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                q9i.a(q9i.i, appCompatTextView);
                appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                appCompatTextView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), appCompatTextView.getPaddingBottom());
                appCompatTextView.setTextColor(a8gVar.h(appCompatTextView).getText().j);
                return appCompatTextView;
            case 11:
                o2d o2dVar = new o2d(context);
                o2dVar.a();
                return o2dVar;
            case 12:
                return RenderScript.create(context);
            case 13:
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                appCompatTextView2.setTextColor(a8gVar.h(appCompatTextView2).getText().j);
                q9i.a(q9i.i, appCompatTextView2);
                appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                appCompatTextView2.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), appCompatTextView2.getPaddingBottom());
                return appCompatTextView2;
            case 14:
                return new ol6(new n52(context, 16));
            case 15:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{a8gVar.k(context).b.h().i, 0});
                return gradientDrawable;
            case 16:
                return Integer.valueOf(a8gVar.k(context).b.getIcon().b);
            case 17:
                ImageView imageViewD = qv1.d(context, R.id.oneme_message_input_right_scheduled_msg_icon);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
                layoutParams2.gravity = 80;
                layoutParams2.setMargins(gm0.K(12.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                imageViewD.setLayoutParams(layoutParams2);
                imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageViewD.setImageResource(R.drawable.icon_clock);
                n1g.N(new o23(3, null, 2), imageViewD);
                return imageViewD;
            case 18:
                gig gigVar = new gig(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 80;
                gigVar.setLayoutParams(layoutParams3);
                return gigVar;
            case 19:
                ImageView imageViewD2 = qv1.d(context, R.id.oneme_message_input_right_video_msg_icon);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
                layoutParams4.gravity = 80;
                layoutParams4.setMargins(gm0.K(12.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
                imageViewD2.setLayoutParams(layoutParams4);
                imageViewD2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageViewD2.setImageResource(R.drawable.icon_video_message);
                n1g.N(new o23(3, null, 3), imageViewD2);
                return imageViewD2;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new kwb(context);
            case 21:
                l1c l1cVar = new l1c(context);
                wj6 wj6Var = ((wj7) l1cVar.getHierarchy()).e;
                wj6Var.l = 0;
                if (wj6Var.k == 1) {
                    wj6Var.k = 0;
                }
                return l1cVar;
            case 22:
                EnhancedVectorDrawable enhancedVectorDrawable = npb.f;
                if (enhancedVectorDrawable != null) {
                    return enhancedVectorDrawable;
                }
                EnhancedVectorDrawable enhancedVectorDrawable2 = new EnhancedVectorDrawable(context, R.drawable.ic_checkbox_bg_28);
                npb.f = enhancedVectorDrawable2;
                return enhancedVectorDrawable2;
            case 23:
                return new u58(context);
            case 24:
                TextView textViewE = qv1.e(context, R.id.oneme_button_text_promo_textview_id);
                textViewE.setEllipsize(TextUtils.TruncateAt.END);
                textViewE.setMaxLines(1);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams5.gravity = 17;
                textViewE.setLayoutParams(layoutParams5);
                textViewE.setGravity(17);
                textViewE.setTextAlignment(4);
                q9i.a(q9i.p, textViewE);
                return textViewE;
            case 25:
                ImageView imageView2 = new ImageView(context);
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return imageView2;
            case 26:
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams6.topMargin = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                layoutParams6.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
                layoutParams6.rightMargin = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                appCompatTextView3.setLayoutParams(layoutParams6);
                appCompatTextView3.setGravity(1);
                appCompatTextView3.setMaxLines(1);
                appCompatTextView3.setEllipsize(TextUtils.TruncateAt.END);
                q9i.a(q9i.k, appCompatTextView3);
                return appCompatTextView3;
            case 27:
                t6c t6cVar = new t6c(context);
                t6cVar.setId(R.id.oneme_cell_simple_reaction);
                t6cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
                return t6cVar;
            case 28:
                l1c l1cVar2 = new l1c(context);
                l1cVar2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
                return l1cVar2;
            default:
                cyb cybVar = new cyb(context);
                cybVar.setId(R.id.oneme_cell_simple_button);
                cybVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return cybVar;
        }
    }
}
