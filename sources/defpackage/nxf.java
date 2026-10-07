package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nxf extends FrameLayout implements eph {
    public final GradientDrawable a;
    public final View b;
    public final GradientDrawable c;
    public final ImageView d;
    public AnimatorSet e;
    public final PathInterpolator f;
    public final AccelerateDecelerateInterpolator g;

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
    public nxf(Context context) {
        super(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        a8g a8gVar = pq3.j;
        gradientDrawable.setColor(a8gVar.h(this).t().b);
        this.a = gradientDrawable;
        View view = new View(context);
        view.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        layoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        this.b = view;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(a8gVar.h(this).t().b);
        gradientDrawable2.setAlpha(0);
        this.c = gradientDrawable2;
        View view2 = new View(context);
        view2.setBackground(gradientDrawable2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        layoutParams2.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
        layoutParams2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
        layoutParams2.gravity = 17;
        view2.setLayoutParams(layoutParams2);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.icon_forward_fill);
        a8gVar.h(imageView);
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        layoutParams3.gravity = 17;
        imageView.setLayoutParams(layoutParams3);
        this.d = imageView;
        this.f = new PathInterpolator(0.4f, 0.0f, 0.0f, 0.8f);
        this.g = new AccelerateDecelerateInterpolator();
        addView(view);
        addView(view2);
        addView(imageView);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        layoutParams4.gravity = 17;
        layoutParams4.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
        layoutParams4.setMarginStart(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        setLayoutParams(layoutParams4);
        setClipChildren(false);
    }

    private static /* synthetic */ void getPathInterpolator$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setColor(kbcVar.t().b);
        this.c.setColor(kbcVar.t().b);
        this.d.setImageTintList(ColorStateList.valueOf(-1));
    }

    @Override // android.view.View
    public final boolean performClick() {
        p0m.a(this, kt7.CLOCK_TICK);
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        Property property = View.SCALE_X;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.0f, 0.6f);
        Property property2 = View.SCALE_Y;
        PropertyValuesHolder[] propertyValuesHolderArr = {propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 1.0f, 0.6f)};
        ImageView imageView = this.d;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolderArr);
        objectAnimatorOfPropertyValuesHolder.setDuration(120L);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.g;
        objectAnimatorOfPropertyValuesHolder.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.6f, 1.2f), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 0.6f, 1.2f));
        objectAnimatorOfPropertyValuesHolder2.setDuration(160L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.2f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 1.2f, 1.0f));
        objectAnimatorOfPropertyValuesHolder3.setDuration(80L);
        objectAnimatorOfPropertyValuesHolder3.setInterpolator(accelerateDecelerateInterpolator);
        PropertyValuesHolder[] propertyValuesHolderArr2 = {PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.0f, 1.2f), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 1.0f, 1.2f)};
        View view = this.b;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr2);
        objectAnimatorOfPropertyValuesHolder4.setStartDelay(160L);
        objectAnimatorOfPropertyValuesHolder4.setDuration(80L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.2f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 1.2f, 1.0f));
        objectAnimatorOfPropertyValuesHolder5.setDuration(80L);
        GradientDrawable gradientDrawable = this.c;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(gradientDrawable, "alpha", 0, 255);
        objectAnimatorOfInt.setStartDelay(200L);
        objectAnimatorOfInt.setDuration(140L);
        objectAnimatorOfInt.setInterpolator(this.f);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(gradientDrawable, "alpha", 255, 0);
        objectAnimatorOfInt2.setDuration(140L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3);
        animatorSet2.playSequentially(objectAnimatorOfPropertyValuesHolder4, objectAnimatorOfPropertyValuesHolder5);
        animatorSet2.playSequentially(objectAnimatorOfInt, objectAnimatorOfInt2);
        this.e = animatorSet2;
        animatorSet2.start();
        return super.performClick();
    }
}
