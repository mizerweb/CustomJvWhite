package defpackage;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class bvb extends FrameLayout implements eph {
    public tub a;
    public sub b;
    public final uub c;
    public final ImageView d;
    public final TextView e;
    public final avb f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public AnimatorSet m;
    public float n;

    public bvb(Context context) {
        super(context);
        this.a = tub.b;
        this.b = sub.b;
        this.c = new uub(new ap9(7, this), this.a, this.b);
        ImageView imageView = new ImageView(context);
        a8g a8gVar = pq3.j;
        a8gVar.h(imageView);
        Drawable drawableMutate = imageView.getContext().getDrawable(R.drawable.icon_cross_round_fill).mutate();
        sb8.m0(1392508927, drawableMutate);
        imageView.setImageDrawable(drawableMutate);
        this.d = imageView;
        TextView textView = new TextView(context);
        a8gVar.h(textView);
        textView.setTextColor(-1);
        q9i.a(q9i.e, textView);
        this.e = textView;
        avb avbVar = new avb(this, context);
        this.f = avbVar;
        this.g = rx8.P(3, new j68(18));
        this.h = rx8.P(3, new j68(19));
        this.i = rx8.P(3, new j68(20));
        this.j = rx8.P(3, new j68(21));
        this.k = rx8.P(3, new j68(22));
        this.l = rx8.P(3, new j68(23));
        setClipChildren(false);
        setClipToPadding(false);
        addView(avbVar);
    }

    private final PathInterpolator getDismissInterpolator() {
        return (PathInterpolator) this.l.getValue();
    }

    private static /* synthetic */ void getDismissInterpolator$annotations() {
    }

    private final PathInterpolator getRotationInterpolator() {
        return (PathInterpolator) this.j.getValue();
    }

    private static /* synthetic */ void getRotationInterpolator$annotations() {
    }

    private final PathInterpolator getShowAlphaInterpolator() {
        return (PathInterpolator) this.k.getValue();
    }

    private static /* synthetic */ void getShowAlphaInterpolator$annotations() {
    }

    private final PathInterpolator getShowScaleFirstStepInterpolator() {
        return (PathInterpolator) this.g.getValue();
    }

    private static /* synthetic */ void getShowScaleFirstStepInterpolator$annotations() {
    }

    private final PathInterpolator getShowScaleSecondStepInterpolator() {
        return (PathInterpolator) this.h.getValue();
    }

    private static /* synthetic */ void getShowScaleSecondStepInterpolator$annotations() {
    }

    private final PathInterpolator getShowScaleThirdStepInterpolator() {
        return (PathInterpolator) this.i.getValue();
    }

    private static /* synthetic */ void getShowScaleThirdStepInterpolator$annotations() {
    }

    public final PropertyValuesHolder a(Property property) {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.4f, 1.1f);
        keyframeOfFloat2.setInterpolator(getShowScaleFirstStepInterpolator());
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.73333335f, 0.98f);
        keyframeOfFloat3.setInterpolator(getShowScaleSecondStepInterpolator());
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat4.setInterpolator(getShowScaleThirdStepInterpolator());
        return PropertyValuesHolder.ofKeyframe(property, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4);
    }

    public final void b(af7 af7Var) {
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null) {
            lsk.a(animatorSet);
        }
        this.m = null;
        float f = this.n;
        avb avbVar = this.f;
        avbVar.setRotation(f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        PathInterpolator dismissInterpolator = getDismissInterpolator();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(avbVar, (Property<avb, Float>) FrameLayout.SCALE_X, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(120L);
        objectAnimatorOfFloat.setInterpolator(dismissInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(avbVar, (Property<avb, Float>) FrameLayout.SCALE_Y, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(120L);
        objectAnimatorOfFloat2.setInterpolator(dismissInterpolator);
        float f2 = this.n;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(avbVar, (Property<avb, Float>) FrameLayout.ROTATION, f2, (-2.0f) * f2);
        objectAnimatorOfFloat3.setDuration(120L);
        objectAnimatorOfFloat3.setInterpolator(dismissInterpolator);
        Property property = FrameLayout.ALPHA;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(avbVar, (Property<avb, Float>) property, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(120L);
        objectAnimatorOfFloat4.setInterpolator(dismissInterpolator);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.e, (Property<TextView, Float>) property, 1.0f, 0.0f);
        objectAnimatorOfFloat5.setDuration(120L);
        objectAnimatorOfFloat5.setInterpolator(dismissInterpolator);
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5);
        lsk.d(animatorSet2, af7Var);
        this.m = animatorSet2;
        animatorSet2.start();
    }

    public final void c() {
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null) {
            lsk.a(animatorSet);
        }
        this.m = null;
        float f = this.n;
        avb avbVar = this.f;
        avbVar.setRotation(f);
        avbVar.setScaleX(0.0f);
        avbVar.setScaleY(0.0f);
        avbVar.setAlpha(0.0f);
        TextView textView = this.e;
        textView.setAlpha(0.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(avbVar, a(FrameLayout.SCALE_X));
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(avbVar, a(FrameLayout.SCALE_Y));
        objectAnimatorOfPropertyValuesHolder2.setDuration(300L);
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, this.n * (-2.0f));
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.4f, this.n * 1.5f);
        keyframeOfFloat2.setInterpolator(getRotationInterpolator());
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(1.0f, this.n);
        keyframeOfFloat3.setInterpolator(getRotationInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(avbVar, PropertyValuesHolder.ofKeyframe(FrameLayout.ROTATION, keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3));
        objectAnimatorOfPropertyValuesHolder3.setDuration(300L);
        Property property = FrameLayout.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(avbVar, (Property<avb, Float>) property, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(120L);
        objectAnimatorOfFloat.setInterpolator(getShowAlphaInterpolator());
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.53846157f, 0.0f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        keyframeOfFloat6.setInterpolator(getShowAlphaInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(textView, PropertyValuesHolder.ofKeyframe(property, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder4.setDuration(130L);
        animatorSet2.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfFloat, objectAnimatorOfPropertyValuesHolder4);
        animatorSet2.setStartDelay(200L);
        this.m = animatorSet2;
        animatorSet2.start();
    }

    public final int getMeasuredBodyHeight() {
        return this.f.getMeasuredHeight();
    }

    public final int getMeasuredBodyWidth() {
        return this.f.getMeasuredWidth();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.d.setImageTintList(ColorStateList.valueOf(1392508927));
        pq3.j.h(this);
        this.e.setTextColor(-1);
    }

    public final void setArrowAlignment(sub subVar) {
        this.b = subVar;
        this.c.d(this.a, subVar);
    }

    public final void setArrowSide(tub tubVar) {
        this.a = tubVar;
        this.c.d(tubVar, this.b);
    }

    public final void setOnCloseClickListener(af7 af7Var) {
        qe7.H(this.d, 300L, new zub(0, af7Var));
    }

    public final void setOnTooltipClickListener(af7 af7Var) {
        qe7.H(this.f, 300L, new zub(1, af7Var));
    }

    public final void setText(ynh ynhVar) {
        TextView textView = this.e;
        textView.setText(ynhVar.b(textView.getContext()));
    }
}
