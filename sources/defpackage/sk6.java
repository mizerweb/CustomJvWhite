package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.InvocationTargetException;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.stories.text.TextEditStoryWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sk6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sk6(View view, Object obj, int i, int i2) {
        this.a = i2;
        this.c = view;
        this.d = obj;
        this.b = i;
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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, InvocationTargetException {
        Object value;
        hoh hohVarA;
        int i = this.a;
        lq4 lq4Var = null;
        int i2 = 1;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                fakeInAppReviewBottomSheet.D = false;
                gm0.n(fakeInAppReviewBottomSheet.m, "Click ratingBar)");
                ia8 ia8Var = (ia8) fakeInAppReviewBottomSheet.u.getAccessor().f();
                int i4 = 3;
                if (ia8Var != null) {
                    ia8Var.c(3, Integer.valueOf(i3));
                }
                int height = frameLayout.getHeight();
                FrameLayout frameLayout2 = new FrameLayout(fakeInAppReviewBottomSheet.getContext());
                frameLayout2.setId(R.id.fake_in_app_review_bottom_sheet_thank_view);
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, height));
                AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout2.getContext());
                appCompatTextView.setId(R.id.fake_in_app_review_bottom_sheet_thank_view_title);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                layoutParams.gravity = 49;
                appCompatTextView.setLayoutParams(layoutParams);
                q9i.a(q9i.c, appCompatTextView);
                appCompatTextView.setText(R.string.oneme_in_app_review_thanks);
                appCompatTextView.setTextColor(pq3.j.h(appCompatTextView).getText().b);
                frameLayout2.addView(appCompatTextView);
                cs csVar = new cs(frameLayout2.getContext());
                csVar.setId(R.id.fake_in_app_review_bottom_sheet_thank_view_icon);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 77.0f), gm0.K(77.0f * yl5.d().getDisplayMetrics().density));
                layoutParams2.gravity = 17;
                csVar.setLayoutParams(layoutParams2);
                csVar.setImageResource(R.drawable.ic_in_app_review_thank_you);
                frameLayout2.addView(csVar);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(frameLayout2.getContext());
                appCompatTextView2.setId(R.id.fake_in_app_review_bottom_sheet_thank_view_close_btn);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.bottomMargin = gm0.K(35.0f * yl5.d().getDisplayMetrics().density);
                layoutParams3.gravity = 81;
                appCompatTextView2.setLayoutParams(layoutParams3);
                q9i.a(q9i.d, appCompatTextView2);
                appCompatTextView2.setText(R.string.oneme_in_app_review_close);
                appCompatTextView2.setTextColor(-16611745);
                qe7.H(appCompatTextView2, 300L, new rk6(fakeInAppReviewBottomSheet, 1));
                frameLayout2.addView(appCompatTextView2);
                n1g.N(new uk6(appCompatTextView, (lq4) null), frameLayout2);
                frameLayout.addView(frameLayout2);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new mk(fakeInAppReviewBottomSheet, 5, valueAnimatorOfFloat));
                valueAnimatorOfFloat.addListener(new d7(fakeInAppReviewBottomSheet, i4, frameLayout));
                valueAnimatorOfFloat.start();
                break;
            case 1:
                ni7 ni7Var = (ni7) obj;
                ej7 ej7Var = ((zg7) obj2).e;
                ej7Var.getClass();
                gm0.n("ej7", "onItemClicked: " + ni7Var);
                a8j.x(ej7Var.G, new ylc(Integer.valueOf(i3), ni7Var));
                break;
            case 2:
                r4e r4eVar = (r4e) obj2;
                r4eVar.toggle();
                ((x4e) obj).b(r4eVar, r4eVar.b, i3);
                break;
            case 3:
                zv8[] zv8VarArr = TextEditStoryWidget.B;
                p0m.a((gx3) obj2, kt7.CLOCK_TICK);
                mjg mjgVar = ((TextEditStoryWidget) obj).t1().c;
                do {
                    value = mjgVar.getValue();
                    hoh hohVar = (hoh) value;
                    int i5 = hohVar.d;
                    int i6 = this.b;
                    boolean z = i6 != i5;
                    int i7 = hohVar.c;
                    if (i7 == 0) {
                        hohVarA = hoh.a(hohVar, null, i6, 0, i6, null, 0, z, 0, 181);
                    } else {
                        hohVarA = hoh.a(hohVar, null, i6 == -1 ? -16777216 : -1, Color.argb((i7 >> 24) & 255, Color.red(i6), Color.green(i6), Color.blue(i6)), i6, null, 0, z, 0, 177);
                    }
                } while (!mjgVar.h(value, hohVarA));
                break;
            default:
                wbi wbiVar = (wbi) obj;
                xbi xbiVar = ((zbi) obj2).a;
                if (xbiVar != null) {
                    UnknownContactBottomSheet unknownContactBottomSheet = (UnknownContactBottomSheet) ((vuf) xbiVar).b;
                    zv8[] zv8VarArr2 = UnknownContactBottomSheet.C;
                    int i8 = wbiVar.a;
                    int iD = qt4.D(i3);
                    dci dciVar = dci.a;
                    if (iD == 0) {
                        if (i8 == R.id.unknown_call_bottom_sheet_ok_button) {
                            jci jciVarF1 = unknownContactBottomSheet.F1();
                            jciVarF1.m.b(null);
                            jciVarF1.B().h(qa2.EVERYTHING_OK, jciVarF1.c);
                            a8j.x(jciVarF1.q, dciVar);
                        } else if (i8 != R.id.unknown_call_bottom_sheet_add_contact_button) {
                            jci jciVarF2 = unknownContactBottomSheet.F1();
                            jciVarF2.m.b(null);
                            jciVarF2.B().h(qa2.BLOCK, jciVarF2.c);
                            yab.i0(jciVarF2.b, ((n0c) ((xhh) jciVarF2.h.getValue())).b(), 0, new ryf(jciVarF2, lq4Var, 27), 2);
                        } else {
                            jci jciVarF3 = unknownContactBottomSheet.F1();
                            jciVarF3.m.b(null);
                            yab.i0(jciVarF3.b, ((n0c) ((xhh) jciVarF3.h.getValue())).b(), 0, new hci(jciVarF3, lq4Var, i2), 2);
                        }
                    } else if (iD != 1) {
                        ore.o();
                    } else if (i8 != R.id.unknown_call_bottom_sheet_close_button) {
                        jci jciVarF4 = unknownContactBottomSheet.F1();
                        yab.i0(jciVarF4.b, ((n0c) ((xhh) jciVarF4.h.getValue())).b(), 0, new hci(jciVarF4, i8, (lq4) null), 2);
                    } else {
                        jci jciVarF5 = unknownContactBottomSheet.F1();
                        jciVarF5.B().h(qa2.CLOSE, jciVarF5.c);
                        a8j.x(jciVarF5.q, dciVar);
                    }
                }
                break;
        }
    }

    public /* synthetic */ sk6(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
