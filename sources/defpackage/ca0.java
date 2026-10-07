package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ca0 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ca0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        rue rueVar = rue.a;
        a8g a8gVar = pq3.j;
        Context context = this.b;
        switch (i) {
            case 0:
                o1i o1iVar = new o1i(context);
                o1iVar.setPadding(o1iVar.getPaddingLeft(), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), o1iVar.getPaddingRight(), o1iVar.getPaddingBottom());
                return o1iVar;
            case 1:
                return new nih(context);
            case 2:
                return a8gVar.k(context).b;
            case 3:
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, R.drawable.chats);
                kbc kbcVar = a8gVar.e(context).j().b;
                lvb.A0(enhancedAnimatedVectorDrawable, "left_dot", kbcVar.b().c);
                lvb.A0(enhancedAnimatedVectorDrawable, "middle_dot", kbcVar.b().c);
                lvb.A0(enhancedAnimatedVectorDrawable, "right_dot", kbcVar.b().c);
                lvb.A0(enhancedAnimatedVectorDrawable, "shape", kbcVar.getIcon().b);
                return enhancedAnimatedVectorDrawable;
            case 4:
                return f55.o(context);
            case 5:
                return f55.o(context);
            case 6:
                return Boolean.valueOf(context.getResources().getConfiguration().orientation == 1);
            case 7:
                return Boolean.valueOf(context.getResources().getConfiguration().orientation == 1);
            case 8:
                return f55.o(context);
            case 9:
                xd1 xd1Var = new xd1(context);
                xd1Var.setVisibility(8);
                xd1Var.setTranslationY(yl5.d().getDisplayMetrics().density * (-50.0f));
                return xd1Var;
            case 10:
                lgb lgbVar = new lgb(context);
                lgbVar.setId(R.id.call_change_mode_tab_view);
                lgbVar.setLayoutParams(new uf4(gm0.K(80.0f * yl5.d().getDisplayMetrics().density), 0));
                return lgbVar;
            case 11:
                return f55.o(context);
            case 12:
                Space space = new Space(context);
                space.setId(View.generateViewId());
                space.setLayoutParams(new uf4(-1, 0));
                return space;
            case 13:
                TextView textView = new TextView(context);
                textView.setId(View.generateViewId());
                textView.setGravity(17);
                q9i.a(q9i.i, textView);
                a8gVar.k(context);
                textView.setTextColor(-1);
                textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(a8gVar.k(context).b.b().f);
                gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 100.0f);
                textView.setBackground(gradientDrawable);
                textView.setAlpha(0.0f);
                textView.setVisibility(8);
                return textView;
            case 14:
                return new nde(context);
            case 15:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(mx3.e(a8gVar.k(context).b.l().c, 80));
                shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
                shapeDrawable.getPaint().setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.0f);
                shapeDrawable.getPaint().setAntiAlias(true);
                return new InsetDrawable((Drawable) shapeDrawable, gm0.K(1.0f * yl5.d().getDisplayMetrics().density));
            case 16:
                js7 js7Var = new js7(context);
                js7Var.setId(R.id.call_shine_background);
                js7Var.setShineBackgroundColor(a8gVar.l(js7Var).b.b().b);
                js7Var.setVisibility(8);
                return js7Var;
            case 17:
                TextView textView2 = new TextView(context);
                textView2.setId(R.id.call_not_contact_warning);
                textView2.setGravity(17);
                q9i.a(q9i.e, textView2);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTextColor(a8gVar.l(textView2).b.getIcon().k);
                textView2.setVisibility(8);
                np4.C(textView2, false);
                textView2.setLayoutParams(new uf4(-2, -2));
                return textView2;
            case 18:
                aib aibVar = new aib(context);
                aibVar.setId(R.id.not_contact_view);
                aibVar.setVisibility(8);
                return aibVar;
            case 19:
                TextView textView3 = new TextView(context);
                textView3.setId(R.id.call_user_full_name);
                textView3.setGravity(17);
                q9i.a(q9i.a, textView3);
                textView3.setMaxLines(2);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setTextColor(a8gVar.l(textView3).b.getText().b);
                textView3.setVisibility(8);
                np4.C(textView3, false);
                textView3.setLayoutParams(new uf4(0, -2));
                return textView3;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                TextView textView4 = new TextView(context);
                textView4.setId(R.id.call_organization_name);
                textView4.setGravity(17);
                q9i.a(q9i.c, textView4);
                textView4.setMaxLines(1);
                textView4.setEllipsize(TextUtils.TruncateAt.END);
                textView4.setTextColor(a8gVar.l(textView4).b.getText().b);
                textView4.setVisibility(8);
                textView4.setLayoutParams(new uf4(-1, -2));
                return textView4;
            case 21:
                TextView textView5 = new TextView(context);
                textView5.setId(R.id.call_user_full_status);
                textView5.setGravity(17);
                textView5.setMaxLines(2);
                textView5.setEllipsize(TextUtils.TruncateAt.END);
                q9i.a(q9i.i, textView5);
                textView5.setTextColor(a8gVar.l(textView5).b.getText().c);
                textView5.setVisibility(8);
                np4.C(textView5, false);
                textView5.setLayoutParams(new uf4(-1, -2));
                return textView5;
            case 22:
                wue wueVar = new wue(context);
                wueVar.setId(R.id.call_users_action_one_positive);
                wueVar.setMode(rueVar);
                wueVar.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 60.0f), gm0.K(60.0f * yl5.d().getDisplayMetrics().density)));
                wueVar.setLayoutParams(new uf4(-2, -2));
                wueVar.setButtonPadding(gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                wueVar.setVisibility(8);
                return wueVar;
            case 23:
                wue wueVar2 = new wue(context);
                wueVar2.setId(R.id.call_users_action_two_positive);
                wueVar2.setMode(rue.c);
                wueVar2.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 60.0f), gm0.K(60.0f * yl5.d().getDisplayMetrics().density)));
                wueVar2.setLayoutParams(new uf4(-2, -2));
                wueVar2.setButtonPadding(gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                wueVar2.setVisibility(8);
                return wueVar2;
            case 24:
                wue wueVar3 = new wue(context);
                wueVar3.setId(R.id.call_users_action_negative);
                wueVar3.setMode(rueVar);
                wueVar3.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 60.0f), gm0.K(60.0f * yl5.d().getDisplayMetrics().density)));
                wueVar3.setLayoutParams(new uf4(-2, -2));
                wueVar3.setButtonPadding(gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                wueVar3.setVisibility(8);
                return wueVar3;
            case 25:
                return o1m.b(context, Integer.valueOf(gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
            case 26:
                ImageView imageViewD = qv1.d(context, R.id.not_contact_view_warning_icon);
                imageViewD.setLayoutParams(new uf4(-2, -2));
                imageViewD.setImageResource(R.drawable.ic_warning_triangle_24);
                return imageViewD;
            case 27:
                return f55.o(context);
            case 28:
                f4e f4eVar = new f4e(context);
                sj sjVar = f4eVar.a;
                if (sjVar != null) {
                    sjVar.setCallback(f4eVar);
                }
                f4eVar.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 60.0f), gm0.K(60.0f * yl5.d().getDisplayMetrics().density));
                return f4eVar;
            default:
                ud1 ud1Var = new ud1(context);
                ud1Var.setLayoutParams(new uf4(-1, -1));
                ud1Var.setVisibility(8);
                return ud1Var;
        }
    }
}
