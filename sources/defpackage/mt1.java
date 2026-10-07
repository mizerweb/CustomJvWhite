package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mt1 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ mt1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
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
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        a8g a8gVar = pq3.j;
        sbi sbiVar = sbi.a;
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (i) {
            case 0:
                rq rqVar = (rq) obj;
                zv8[] zv8VarArr = CallOpponentsListWidget.v;
                mt1 mt1Var = new mt1(callOpponentsListWidget, 2);
                rw3 rw3Var = new rw3(rqVar.getContext());
                pq pqVar = new pq();
                pqVar.a = 19;
                rw3Var.setLayoutParams(pqVar);
                rw3Var.setTitleEnabled(false);
                mt1Var.invoke(rw3Var);
                rqVar.addView(rw3Var);
                p1c p1cVar = new p1c(rqVar.getContext(), 14);
                p1cVar.setId(R.id.call_user_list_in_call_bottom_search);
                q9i.a(q9i.e, p1cVar);
                p1cVar.setHintTextColor(a8gVar.l(p1cVar).b.getText().d);
                p1cVar.setTextColor(a8gVar.l(p1cVar).b.getText().b);
                int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                p1cVar.setPadding(iK, iK, iK, iK);
                p1cVar.setMaxLines(1);
                p1cVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                ow3 ow3Var = new ow3(-1, -2);
                ow3Var.a = 1;
                ((FrameLayout.LayoutParams) ow3Var).bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                ow3Var.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                ow3Var.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                p1cVar.setLayoutParams(ow3Var);
                p32 p32Var = (p32) callOpponentsListWidget.c.getValue();
                p32Var.getClass();
                Context context = p32Var.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qv1.k("  ", context.getString(R.string.call_users_in_call_search)));
                Drawable drawableE = o7j.e(R.drawable.icon_search, a8gVar.k(context).b.getIcon().d, context);
                drawableE.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
                spannableStringBuilder.setSpan(new FitFontImageSpan(drawableE, null, false, false, 14, null), 0, 1, 17);
                p1cVar.setHint(spannableStringBuilder);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.b.getValue(), null, null));
                shapeDrawable.getPaint().setColor(a8gVar.l(p1cVar).b.h().b);
                p1cVar.setBackground(shapeDrawable);
                p1cVar.addTextChangedListener(new rt1(p1cVar, 0, callOpponentsListWidget));
                p1cVar.setOnTouchListener(new nt1(new xk1(13), 0, p1cVar));
                rqVar.addView(p1cVar);
                break;
            case 1:
                zv8[] zv8VarArr2 = CallOpponentsListWidget.v;
                ic6 ic6Var = callOpponentsListWidget.p1().t;
                cs1.b.getClass();
                a8j.x(ic6Var, new i65(":call-admin-settings"));
                break;
            case 2:
                rw3 rw3Var2 = (rw3) obj;
                zv8[] zv8VarArr3 = CallOpponentsListWidget.v;
                mt1 mt1Var2 = new mt1(callOpponentsListWidget, 3);
                Toolbar toolbar = new Toolbar(rw3Var2.getContext());
                ow3 ow3Var2 = new ow3(-1, -2);
                ow3Var2.a = 1;
                toolbar.setLayoutParams(ow3Var2);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.s(0, 0);
                mt1Var2.invoke(toolbar);
                rw3Var2.addView(toolbar);
                mt1 mt1Var3 = new mt1(callOpponentsListWidget, 4);
                LinearLayout linearLayout = new LinearLayout(rw3Var2.getContext());
                linearLayout.setId(R.id.call_opponents_list_collapsible_header);
                ow3 ow3Var3 = new ow3(-1, -2);
                ow3Var3.a = 2;
                linearLayout.setLayoutParams(ow3Var3);
                linearLayout.setOrientation(1);
                mt1Var3.invoke(linearLayout);
                rw3Var2.addView(linearLayout);
                break;
            case 3:
                Toolbar toolbar2 = (Toolbar) obj;
                zv8[] zv8VarArr4 = CallOpponentsListWidget.v;
                rcc rccVar = new rcc(toolbar2.getContext());
                rccVar.setId(R.id.call_screen_opponent_list_toolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setTextShimmerEnabled(false);
                rccVar.setLeftActions(new wbc(new mt1(callOpponentsListWidget, 5)));
                rccVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), rccVar.getPaddingTop(), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), rccVar.getPaddingBottom());
                rccVar.setCustomTheme(a8gVar.l(rccVar).b);
                toolbar2.addView(rccVar);
                break;
            case 4:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                zv8[] zv8VarArr5 = CallOpponentsListWidget.v;
                TextView textView = new TextView(linearLayout2.getContext());
                textView.setId(R.id.call_opponents_list_title);
                q9i.a(q9i.c, textView);
                textView.setTextColor(a8gVar.l(textView).b.getText().b);
                textView.setMaxLines(3);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setGravity(17);
                textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f));
                layoutParams.setMarginEnd(gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                linearLayout2.addView(textView);
                TextView textView2 = new TextView(linearLayout2.getContext());
                textView2.setId(R.id.call_opponents_list_subtitle);
                q9i.a(q9i.i, textView2);
                textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
                textView2.setMaxLines(1);
                textView2.setEllipsize(truncateAt);
                textView2.setGravity(17);
                textView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(18.0f * yl5.d().getDisplayMetrics().density));
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout2.addView(textView2);
                oyb oybVar = new oyb(linearLayout2.getContext());
                oybVar.setId(R.id.call_opponent_info_buttons);
                bt4 bt4Var = new bt4(-1, -2);
                bt4Var.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                bt4Var.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                ((ViewGroup.MarginLayoutParams) bt4Var).topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                ((ViewGroup.MarginLayoutParams) bt4Var).bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
                oybVar.setLayoutParams(bt4Var);
                oybVar.setCustomTheme(a8gVar.l(oybVar).b);
                oybVar.setAppearance(gyb.b);
                oybVar.setListener(new ot4(16, callOpponentsListWidget));
                linearLayout2.addView(oybVar);
                TextView textView3 = new TextView(linearLayout2.getContext());
                textView3.setId(R.id.call_screen_admin_user_in_wait_room_title);
                noh nohVar = q9i.k;
                q9i.a(nohVar.g(), textView3);
                textView3.setTextColor(a8gVar.l(textView3).b.getText().d);
                textView3.setMaxLines(1);
                textView3.setEllipsize(truncateAt);
                textView3.setText(R.string.call_admins_settings_waiting_room);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                layoutParams2.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
                layoutParams2.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
                textView3.setLayoutParams(layoutParams2);
                textView3.setVisibility(8);
                linearLayout2.addView(textView3);
                RecyclerView recyclerView = new RecyclerView(linearLayout2.getContext());
                recyclerView.setId(R.id.call_screen_admin_user_in_wait_room_list);
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter((wc) callOpponentsListWidget.t.getValue());
                recyclerView.setItemAnimator(null);
                linearLayout2.addView(recyclerView);
                TextView textView4 = new TextView(linearLayout2.getContext());
                q9i.a(nohVar.g(), textView4);
                textView4.setTextColor(a8gVar.l(textView4).b.getText().d);
                textView4.setMaxLines(1);
                textView4.setEllipsize(truncateAt);
                textView4.setText(R.string.call_screen_opponents_list_users_title);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                layoutParams3.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                layoutParams3.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
                layoutParams3.bottomMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                textView4.setLayoutParams(layoutParams3);
                linearLayout2.addView(textView4);
                break;
            default:
                zv8[] zv8VarArr6 = CallOpponentsListWidget.v;
                callOpponentsListWidget.getRouter().C(callOpponentsListWidget);
                break;
        }
        return sbiVar;
    }
}
