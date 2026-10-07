package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class md8 extends FrameLayout implements eph {
    public static final /* synthetic */ int d = 0;
    public final Paint a;
    public final RectF b;
    public final float c;

    public md8(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setColor(lvb.I0(pq3.j.h(this).h().a, 0.16f));
        this.a = paint;
        this.b = new RectF();
        this.c = gm0.K(38.0f * yl5.d().getDisplayMetrics().density);
        setWillNotDraw(false);
        setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 80.0f), gm0.K(80.0f * yl5.d().getDisplayMetrics().density)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, width, height);
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setColor(lvb.I0(kbcVar.h().a, 0.16f));
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
    public final void setHeaderIcon(ld8 ld8Var) {
        a8g a8gVar;
        int i = 3;
        lq4 lq4Var = null;
        if (ld8Var instanceof kd8) {
            RLottieImageView rLottieImageView = new RLottieImageView(getContext());
            int iK = gm0.K(36.0f * yl5.d().getDisplayMetrics().density);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
            layoutParams.gravity = 17;
            rLottieImageView.setLayoutParams(layoutParams);
            int i2 = ((kd8) ld8Var).a;
            RLottieImageViewUtils.setRawRes(rLottieImageView, i2, zo5.h(i2, "bottom_sheet_header_"), iK, iK, false);
            n1g.N(new ud9(i, lq4Var, 22), rLottieImageView);
            rLottieImageView.playAnimation();
            addView(rLottieImageView);
            return;
        }
        int i3 = 1;
        if (ld8Var instanceof jd8) {
            ImageView imageView = new ImageView(getContext());
            int iK2 = gm0.K(36.0f * yl5.d().getDisplayMetrics().density);
            imageView.setImageResource(((jd8) ld8Var).a);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iK2, iK2);
            layoutParams2.gravity = 17;
            imageView.setLayoutParams(layoutParams2);
            n1g.N(new o23(i, lq4Var, i3), imageView);
            if (imageView.isAttachedToWindow()) {
                imageView.post(new pi(21, imageView));
            } else {
                imageView.addOnAttachStateChangeListener(new ga0(imageView, 6, imageView));
            }
            addView(imageView);
            return;
        }
        if (!(ld8Var instanceof id8)) {
            ore.o();
            return;
        }
        id8 id8Var = (id8) ld8Var;
        ImageView imageView2 = new ImageView(getContext());
        int iK3 = gm0.K(36.0f * yl5.d().getDisplayMetrics().density);
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(imageView2.getContext(), id8Var.a);
        Iterator it = id8Var.b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            a8gVar = pq3.j;
            if (!zHasNext) {
                break;
            } else {
                lvb.A0(enhancedAnimatedVectorDrawable, (String) it.next(), a8gVar.h(imageView2).getIcon().h);
            }
        }
        List<String> list = id8Var.c;
        if (list != null) {
            for (String str : list) {
                int iI0 = lvb.I0(a8gVar.h(imageView2).h().a, 0.16f);
                lvb.A0(enhancedAnimatedVectorDrawable, str, mx3.b(a8gVar.h(imageView2).b().f, ((iI0 >> 24) & 255) / 255.0f, lvb.I0(iI0, 1.0f)));
            }
        }
        imageView2.setImageDrawable(enhancedAnimatedVectorDrawable);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK3, iK3);
        layoutParams3.gravity = 17;
        imageView2.setLayoutParams(layoutParams3);
        n1g.N(new vc3(enhancedAnimatedVectorDrawable, id8Var, this, lq4Var, 2), imageView2);
        if (imageView2.isAttachedToWindow()) {
            imageView2.postDelayed(new sc4(enhancedAnimatedVectorDrawable, 1), id8Var.d);
        } else {
            imageView2.addOnAttachStateChangeListener(new tc4(imageView2, imageView2, id8Var, enhancedAnimatedVectorDrawable, 1));
        }
        addView(imageView2);
    }
}
