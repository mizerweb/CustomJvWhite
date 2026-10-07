package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ycj extends ViewGroup {
    public static final /* synthetic */ zv8[] k;
    public final ny8 a;
    public final ny8 b;
    public xcj c;
    public final p3c d;
    public final ny8 e;
    public final View f;
    public final yc0 g;
    public final ImageView h;
    public final FrameLayout i;
    public final TextView j;

    static {
        z8b z8bVar = new z8b(ycj.class, "animateDotViewJob", "getAnimateDotViewJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public ycj(Context context) {
        super(context);
        final int i = 0;
        this.a = rx8.P(3, new af7(this) { // from class: vcj
            public final /* synthetic */ ycj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                ycj ycjVar = this.b;
                switch (i2) {
                    case 0:
                        return ycjVar.getContext().getDrawable(R.drawable.icon_play_fill).mutate();
                    case 1:
                        return ycjVar.getContext().getDrawable(R.drawable.icon_pause_fill).mutate();
                    default:
                        return Integer.valueOf((int) ycjVar.j.getPaint().measureText(mxl.b(0L)));
                }
            }
        });
        final int i2 = 1;
        this.b = rx8.P(3, new af7(this) { // from class: vcj
            public final /* synthetic */ ycj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                ycj ycjVar = this.b;
                switch (i3) {
                    case 0:
                        return ycjVar.getContext().getDrawable(R.drawable.icon_play_fill).mutate();
                    case 1:
                        return ycjVar.getContext().getDrawable(R.drawable.icon_pause_fill).mutate();
                    default:
                        return Integer.valueOf((int) ycjVar.j.getPaint().measureText(mxl.b(0L)));
                }
            }
        });
        this.d = qyj.S();
        final int i3 = 2;
        this.e = rx8.P(3, new af7(this) { // from class: vcj
            public final /* synthetic */ ycj b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                ycj ycjVar = this.b;
                switch (i4) {
                    case 0:
                        return ycjVar.getContext().getDrawable(R.drawable.icon_play_fill).mutate();
                    case 1:
                        return ycjVar.getContext().getDrawable(R.drawable.icon_pause_fill).mutate();
                    default:
                        return Integer.valueOf((int) ycjVar.j.getPaint().measureText(mxl.b(0L)));
                }
            }
        });
        View view = new View(context);
        view.setId(R.id.audio_record__hand_free_dot_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        n1g.N(new ao4(3, null, 1), view);
        this.f = view;
        yc0 yc0Var = new yc0(context);
        yc0Var.setId(R.id.audio_record__wave_view);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(gm0.K(0.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        yc0Var.setLayoutParams(layoutParams2);
        yc0Var.setListener(new phf(yc0Var, this, false, 11));
        yc0Var.setShiftOffset(75L);
        this.g = yc0Var;
        ImageView imageViewD = qv1.d(context, R.id.audio_record__play_pause_listening_button);
        imageViewD.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f)));
        imageViewD.setImageDrawable(getPlayIcon());
        imageViewD.setVisibility(8);
        n1g.N(new nff(this, (lq4) null, 13), imageViewD);
        qe7.H(imageViewD, 300L, new aah(13, this));
        this.h = imageViewD;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density)));
        frameLayout.addView(view);
        frameLayout.addView(imageViewD);
        this.i = frameLayout;
        TextView textViewE = qv1.e(context, R.id.audio_record__hand_free_duration_view);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        textViewE.setLayoutParams(layoutParams3);
        textViewE.getPaint().setFontFeatureSettings("'tnum'");
        q9i.a(q9i.e, textViewE);
        n1g.N(new wcj(this, (lq4) null), textViewE);
        this.j = textViewE;
        setId(R.id.audio_record__wave_container);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        layoutParams4.setMargins(iK, iK, iK, iK);
        layoutParams4.gravity = 49;
        setLayoutParams(layoutParams4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
        setBackground(gradientDrawable);
        n1g.N(new wcj(3, (lq4) null), this);
        addView(frameLayout);
        addView(textViewE);
        addView(yc0Var);
    }

    private final vo8 getAnimateDotViewJob() {
        return (vo8) this.d.m(this, k[0]);
    }

    private final int getEstimatedDurationWidth() {
        return ((Number) this.e.getValue()).intValue();
    }

    public final Drawable getPauseSmallIcon() {
        return (Drawable) this.b.getValue();
    }

    public final Drawable getPlayIcon() {
        return (Drawable) this.a.getValue();
    }

    private final GradientDrawable getWaveContainerBackground() {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final void setAnimateDotViewJob(vo8 vo8Var) {
        this.d.B(this, k[0], vo8Var);
    }

    public final void c() {
        vo8 animateDotViewJob = getAnimateDotViewJob();
        if (animateDotViewJob != null) {
            animateDotViewJob.b(null);
        }
        setAnimateDotViewJob(null);
    }

    public final void d(Long l, c89 c89Var) {
        String strB;
        boolean z = c89Var.b;
        Float f = c89Var.a;
        ImageView imageView = this.h;
        if (z) {
            imageView.setImageDrawable(getPauseSmallIcon());
        } else {
            imageView.setImageDrawable(getPlayIcon());
        }
        yc0 yc0Var = this.g;
        if (f == null) {
            yc0Var.setListeningData(0.0f);
        } else {
            yc0Var.setListeningData(f.floatValue());
        }
        if (yc0Var.p) {
            return;
        }
        if (f == null || l == null) {
            strB = null;
        } else {
            strB = mxl.b((long) (f.floatValue() * l.longValue()));
        }
        if (f == null && l != null) {
            strB = mxl.b(l.longValue());
        }
        this.j.setText(strB);
    }

    public final void e() {
        View view = this.f;
        setAnimateDotViewJob(yab.i0(v7j.b(view), null, 0, new dn0(view, null, 5), 3));
    }

    public final View getHandFreeDotView() {
        return this.f;
    }

    public final List<ValueAnimator> getPauseAnimations() {
        ArrayList arrayList = new ArrayList();
        View view = this.f;
        arrayList.addAll(fsk.c(view, 1.0f, 0.5f, 150L, 0L));
        Property property = View.ALPHA;
        arrayList.add(fsk.a(view, property, 1.0f, 0.0f, 150L, 0L, false, 240));
        ImageView imageView = this.h;
        arrayList.addAll(fsk.c(imageView, 0.5f, 1.0f, 150L, 50L));
        arrayList.add(fsk.a(imageView, property, 0.5f, 1.0f, 150L, 50L, false, 224));
        a8g a8gVar = pq3.j;
        int i = a8gVar.h(this).getText().b;
        a8gVar.h(this);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i, -1);
        valueAnimatorOfArgb.setDuration(150L);
        valueAnimatorOfArgb.setStartDelay(50L);
        valueAnimatorOfArgb.addUpdateListener(new tcj(this, 2));
        arrayList.add(valueAnimatorOfArgb);
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(tre.I0(a8gVar.h(this).h().a, 0.08f), a8gVar.h(this).getIcon().h);
        valueAnimatorOfArgb2.setDuration(150L);
        valueAnimatorOfArgb2.setStartDelay(50L);
        valueAnimatorOfArgb2.addUpdateListener(new ucj(getWaveContainerBackground(), 1));
        arrayList.add(valueAnimatorOfArgb2);
        int iI0 = tre.I0(a8gVar.h(this).getIcon().h, 0.5f);
        a8gVar.h(this);
        ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(iI0, tre.I0(-1, 0.5f));
        valueAnimatorOfArgb3.setDuration(150L);
        valueAnimatorOfArgb3.setStartDelay(50L);
        valueAnimatorOfArgb3.addUpdateListener(new tcj(this, 3));
        arrayList.add(valueAnimatorOfArgb3);
        return arrayList;
    }

    public final List<ValueAnimator> getResumeAnimations() {
        ArrayList arrayList = new ArrayList();
        View view = this.f;
        arrayList.addAll(fsk.c(view, 0.5f, 1.0f, 150L, 50L));
        Property property = View.ALPHA;
        arrayList.add(fsk.a(view, property, 0.5f, 1.0f, 150L, 50L, false, 224));
        ImageView imageView = this.h;
        arrayList.addAll(fsk.c(imageView, 1.0f, 0.5f, 150L, 0L));
        arrayList.add(fsk.a(imageView, property, 1.0f, 0.0f, 150L, 0L, false, 240));
        a8g a8gVar = pq3.j;
        a8gVar.h(this);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, a8gVar.h(this).getText().b);
        valueAnimatorOfArgb.setDuration(150L);
        valueAnimatorOfArgb.setStartDelay(50L);
        valueAnimatorOfArgb.addUpdateListener(new tcj(this, 0));
        arrayList.add(valueAnimatorOfArgb);
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(a8gVar.h(this).getIcon().h, tre.I0(a8gVar.h(this).h().a, 0.08f));
        valueAnimatorOfArgb2.setDuration(150L);
        valueAnimatorOfArgb2.setStartDelay(50L);
        valueAnimatorOfArgb2.addUpdateListener(new ucj(getWaveContainerBackground(), 0));
        arrayList.add(valueAnimatorOfArgb2);
        a8gVar.h(this);
        ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(tre.I0(-1, 0.5f), tre.I0(a8gVar.h(this).getIcon().h, 0.5f));
        valueAnimatorOfArgb3.setDuration(150L);
        valueAnimatorOfArgb3.setStartDelay(50L);
        valueAnimatorOfArgb3.addUpdateListener(new tcj(this, 1));
        arrayList.add(valueAnimatorOfArgb3);
        return arrayList;
    }

    public final yc0 getWaveView() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vo8 animateDotViewJob = getAnimateDotViewJob();
        if (animateDotViewJob != null) {
            animateDotViewJob.b(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        FrameLayout frameLayout = this.i;
        qyj.M(frameLayout, iK, measuredHeight - (frameLayout.getMeasuredHeight() / 2), 0, 12);
        int iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, frameLayout.getMeasuredWidth(), iK);
        TextView textView = this.j;
        qyj.M(textView, iE, measuredHeight - (textView.getMeasuredHeight() / 2), 0, 12);
        int iD = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, zo5.D(6.0f, yl5.d().getDisplayMetrics().density, i3));
        yc0 yc0Var = this.g;
        yc0Var.layout(iD - yc0Var.getMeasuredWidth(), measuredHeight - (yc0Var.getMeasuredHeight() / 2), iD, (yc0Var.getMeasuredHeight() / 2) + measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iF = r5a.f(4.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int iA = qv1.a(28.0f, yl5.d().getDisplayMetrics().density, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm0.K(28.0f * yl5.d().getDisplayMetrics().density), 1073741824);
        FrameLayout frameLayout = this.i;
        frameLayout.measure(iA, iMakeMeasureSpec);
        int iB = qv1.b(4.0f, yl5.d().getDisplayMetrics().density, frameLayout.getMeasuredWidth(), iF);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), Integer.MIN_VALUE);
        TextView textView = this.j;
        textView.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        int iB2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, getEstimatedDurationWidth()) - textView.getMeasuredWidth();
        if (iB2 < 0) {
            iB2 = 0;
        }
        this.g.measure(View.MeasureSpec.makeMeasureSpec(qv1.b(4.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredWidth() + iB2, iB), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
    }

    public final void setBackgroundColor(boolean z) {
        a8g a8gVar = pq3.j;
        int iI0 = z ? a8gVar.h(this).getIcon().h : tre.I0(a8gVar.h(this).h().a, 0.08f);
        GradientDrawable waveContainerBackground = getWaveContainerBackground();
        if (waveContainerBackground != null) {
            waveContainerBackground.setColor(iI0);
        }
    }

    public final void setCallback(xcj xcjVar) {
        this.c = xcjVar;
    }

    public final void setDotDrawable(Drawable drawable) {
        this.f.setBackground(drawable);
    }

    public final void setDurationColor(boolean z) {
        a8g a8gVar = pq3.j;
        TextView textView = this.j;
        if (!z) {
            textView.setTextColor(a8gVar.h(this).getText().b);
        } else {
            a8gVar.h(this);
            textView.setTextColor(-1);
        }
    }

    public final void setDurationText(String str) {
        this.j.setText(str);
    }

    public final void setVisiblePlayPauseButton(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }
}
