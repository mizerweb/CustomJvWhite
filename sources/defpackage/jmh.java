package defpackage;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import one.me.stories.text.TextEditStoryWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jmh extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ TextEditStoryWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmh(lq4 lq4Var, TextEditStoryWidget textEditStoryWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = textEditStoryWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        TextEditStoryWidget textEditStoryWidget = this.g;
        switch (i) {
            case 0:
                jmh jmhVar = new jmh(lq4Var, textEditStoryWidget, 0);
                jmhVar.f = obj;
                return jmhVar;
            default:
                jmh jmhVar2 = new jmh(lq4Var, textEditStoryWidget, 1);
                jmhVar2.f = obj;
                return jmhVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((jmh) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((jmh) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int iA;
        int i;
        int i2 = this.e;
        sbi sbiVar = sbi.a;
        TextEditStoryWidget textEditStoryWidget = this.g;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    int i3 = uw8.a;
                    iA = uw8.a(textEditStoryWidget.getContext());
                } else {
                    iA = 0;
                }
                zv8[] zv8VarArr = TextEditStoryWidget.B;
                textEditStoryWidget.p1(iA);
                return sbiVar;
            default:
                ch3.d0(obj);
                hoh hohVar = (hoh) obj2;
                textEditStoryWidget.z = true;
                Editable text = textEditStoryWidget.s1().getText();
                String string = text != null ? text.toString() : null;
                CharSequence charSequence = hohVar.e;
                int i4 = hohVar.f;
                int i5 = hohVar.b;
                ulh ulhVar = hohVar.a;
                CharSequence charSequence2 = hohVar.e;
                int i6 = hohVar.d;
                if (!cqk.d(string, charSequence.toString())) {
                    textEditStoryWidget.s1().setText(charSequence2);
                    textEditStoryWidget.s1().setSelection(charSequence2.length());
                }
                j8e j8eVar = textEditStoryWidget.e;
                zv8[] zv8VarArr2 = TextEditStoryWidget.B;
                ((wlh) j8eVar.m(textEditStoryWidget, zv8VarArr2[2])).setAlignMode(ulhVar);
                ((lx3) textEditStoryWidget.f.m(textEditStoryWidget, zv8VarArr2[3])).setInsideColor(i6);
                textEditStoryWidget.s1().setFlowBackgroundColor(hohVar.c);
                textEditStoryWidget.s1().setTextColor(i5);
                oxg oxgVarS1 = textEditStoryWidget.s1();
                oxgVarS1.setGravity(ulhVar.a | 16);
                oxgVarS1.setTextAlignment(ulhVar.b);
                noh.c(wmh.a, textEditStoryWidget.s1(), v0h.b(i4));
                ImageView imageView = (ImageView) textEditStoryWidget.g.m(textEditStoryWidget, zv8VarArr2[4]);
                int i7 = vmh.$EnumSwitchMapping$0[qt4.D(i4)];
                if (i7 == 1) {
                    i = R.drawable.icon_text_weight_light;
                } else {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            i = R.drawable.icon_text_weight_bold;
                        } else {
                            ore.o();
                        }
                        return null;
                    }
                    i = R.drawable.icon_text_weight_normal;
                }
                imageView.setImageResource(i);
                ((ImageView) textEditStoryWidget.d.m(textEditStoryWidget, zv8VarArr2[1])).setImageResource(hohVar.h);
                float f = 0.0f;
                if (i5 == -1) {
                    textEditStoryWidget.s1().setShadowLayer(4.0f, 0.0f, yl5.d().getDisplayMetrics().density * 1.0f, textEditStoryWidget.s);
                } else {
                    textEditStoryWidget.s1().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                textEditStoryWidget.z = false;
                LinearLayout linearLayout = textEditStoryWidget.k;
                if (linearLayout != null) {
                    int i8 = 0;
                    while (true) {
                        if (i8 < linearLayout.getChildCount()) {
                            int i9 = i8 + 1;
                            View childAt = linearLayout.getChildAt(i8);
                            if (childAt == null) {
                                ore.i();
                                return null;
                            }
                            gx3 gx3Var = childAt instanceof gx3 ? (gx3) childAt : null;
                            if (gx3Var != null) {
                                gx3Var.setChosen(i6 == gx3Var.getItemColor());
                            }
                            i8 = i9;
                        }
                    }
                }
                float f2 = textEditStoryWidget.o;
                LinearLayout linearLayout2 = textEditStoryWidget.k;
                boolean z = linearLayout2 != null;
                boolean z2 = hohVar.g;
                if (z2 == z) {
                    return sbiVar;
                }
                if (!z2) {
                    int i10 = 7;
                    if (linearLayout2 == null) {
                        return sbiVar;
                    }
                    textEditStoryWidget.k = null;
                    linearLayout2.animate().cancel();
                    linearLayout2.animate().alpha(0.0f).translationY(f2).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new ewg(textEditStoryWidget, i10, linearLayout2)).start();
                    return sbiVar;
                }
                j8e j8eVar2 = textEditStoryWidget.i;
                zv8[] zv8VarArr3 = TextEditStoryWidget.B;
                FrameLayout frameLayout = (FrameLayout) j8eVar2.m(textEditStoryWidget, zv8VarArr3[6]);
                textEditStoryWidget.r1();
                int i11 = uw8.a;
                int iA2 = ((Boolean) uw8.f.getValue()).booleanValue() ? uw8.a(frameLayout.getContext()) : 0;
                LinearLayout linearLayout3 = new LinearLayout(frameLayout.getContext());
                linearLayout3.setId(R.id.oneme_stories_color_palette_id);
                linearLayout3.setOrientation(0);
                linearLayout3.setClipChildren(false);
                linearLayout3.setClipToPadding(false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 81;
                layoutParams.setMargins(0, 0, 0, ((ViewGroup) textEditStoryWidget.j.m(textEditStoryWidget, zv8VarArr3[7])).getMeasuredHeight() + textEditStoryWidget.q + iA2);
                linearLayout3.setLayoutParams(layoutParams);
                int[] iArr = textEditStoryWidget.t1().e;
                int length = iArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = iArr[i12];
                    int i15 = i13 + 1;
                    gx3 gx3Var2 = new gx3(linearLayout3.getContext());
                    int i16 = textEditStoryWidget.p;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i16, i16);
                    layoutParams2.gravity = 17;
                    gx3Var2.setLayoutParams(layoutParams2);
                    int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
                    gx3Var2.setPadding(iK, iK, iK, iK);
                    gx3Var2.setItemColor(i14);
                    gx3Var2.setChosen(i14 == i6);
                    gx3Var2.setTranslationY(f2);
                    gx3Var2.setAlpha(f);
                    qe7.H(gx3Var2, 300L, new sk6(gx3Var2, textEditStoryWidget, i14, 3));
                    gx3Var2.animate().cancel();
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = gx3Var2.animate();
                    viewPropertyAnimatorAnimate.translationY(f);
                    viewPropertyAnimatorAnimate.alpha(1.0f);
                    viewPropertyAnimatorAnimate.setStartDelay(((long) i13) * 30);
                    viewPropertyAnimatorAnimate.setDuration(300L);
                    viewPropertyAnimatorAnimate.setInterpolator(new AccelerateDecelerateInterpolator());
                    viewPropertyAnimatorAnimate.start();
                    linearLayout3.addView(gx3Var2);
                    i12++;
                    i13 = i15;
                    f = 0.0f;
                }
                frameLayout.addView(linearLayout3);
                textEditStoryWidget.k = linearLayout3;
                return sbiVar;
        }
    }
}
