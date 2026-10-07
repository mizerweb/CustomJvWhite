package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hn1 extends wf4 implements wy1 {
    public static final /* synthetic */ zv8[] A;
    public final ls7 s;
    public final TextView t;
    public final TextView u;
    public final wue v;
    public final wue w;
    public fn1 x;
    public boolean y;
    public final zb z;

    static {
        z8b z8bVar = new z8b(hn1.class, "indicatorState", "getIndicatorState()Lone/me/calls/ui/view/indicator/CallIndicatorView$Companion$CallIndicatorState;");
        zfe.a.getClass();
        A = new zv8[]{z8bVar};
    }

    public hn1(Context context) {
        super(context, null);
        this.z = new zb(this);
        final int i = 0;
        setClipToPadding(false);
        setClipChildren(false);
        ls7 ls7Var = new ls7(context);
        ls7Var.setId(R.id.call_indicator_shine_background);
        this.s = ls7Var;
        wue wueVar = new wue(context);
        wueVar.setId(R.id.call_microphone);
        wueVar.setLayoutParams(new uf4(-2, -2));
        wueVar.setMode(rue.a);
        wue.z(wueVar, R.drawable.icon_microphone_fill);
        wueVar.setAccessibility(Integer.valueOf(R.string.call_microphone_enabled_accessibility));
        wueVar.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 40.0f)));
        wueVar.setButtonPadding(8);
        qe7.H(wueVar, 300L, new View.OnClickListener(this) { // from class: dn1
            public final /* synthetic */ hn1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                int i2 = i;
                hn1 hn1Var = this.b;
                switch (i2) {
                    case 0:
                        fn1 fn1Var = hn1Var.x;
                        if (fn1Var != null) {
                            CallIndicatorWidget callIndicatorWidget = (CallIndicatorWidget) ((uik) fn1Var).b;
                            zv8[] zv8VarArr = CallIndicatorWidget.g;
                            kn1 kn1VarQ1 = callIndicatorWidget.q1();
                            ac1 ac1Var = (ac1) kn1VarQ1.d;
                            boolean zC = ac1Var.c();
                            boolean z = !zC;
                            sa2 sa2Var = (sa2) kn1VarQ1.e.getValue();
                            n42 n42Var = (n42) kn1VarQ1.c;
                            String strA = ns4.a(((f62) n42Var.f.a.getValue()).i);
                            long j = !zC ? 1L : 0L;
                            boolean z2 = ((f62) n42Var.f.a.getValue()).j;
                            sa2Var.getClass();
                            sa2.c(sa2Var, "AUDIO_ENABLED", strA, null, Long.valueOf(j), null, null, z2, Boolean.TRUE, 116);
                            ac1Var.d(z);
                            mjg mjgVar = kn1VarQ1.n;
                            do {
                                value = mjgVar.getValue();
                                ((Boolean) value).getClass();
                            } while (!mjgVar.h(value, Boolean.valueOf(z)));
                        }
                        break;
                    default:
                        fn1 fn1Var2 = hn1Var.x;
                        if (fn1Var2 != null) {
                            CallIndicatorWidget callIndicatorWidget2 = (CallIndicatorWidget) ((uik) fn1Var2).b;
                            zv8[] zv8VarArr2 = CallIndicatorWidget.g;
                            kn1 kn1VarQ2 = callIndicatorWidget2.q1();
                            n42 n42Var2 = (n42) kn1VarQ2.c;
                            int iD = qt4.D(((f62) n42Var2.f.a.getValue()).f);
                            if (iD == 0) {
                                n42Var2.c().o(true);
                            } else if (iD != 1) {
                                ore.o();
                            } else {
                                kn1VarQ2.F("CONFIRM_STOP_RECORD");
                            }
                        }
                        break;
                }
            }
        });
        this.v = wueVar;
        wue wueVar2 = new wue(context);
        wueVar2.setId(R.id.call_cancel);
        wueVar2.setLayoutParams(new uf4(-2, -2));
        wueVar2.setMode(rue.d);
        wue.z(wueVar2, R.drawable.icon_phone_off_fill);
        wueVar2.setAccessibility(Integer.valueOf(R.string.call_cancel_accessibility));
        wueVar2.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        wueVar2.setButtonPadding(8);
        final int i2 = 1;
        qe7.H(wueVar2, 300L, new View.OnClickListener(this) { // from class: dn1
            public final /* synthetic */ hn1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                int i3 = i2;
                hn1 hn1Var = this.b;
                switch (i3) {
                    case 0:
                        fn1 fn1Var = hn1Var.x;
                        if (fn1Var != null) {
                            CallIndicatorWidget callIndicatorWidget = (CallIndicatorWidget) ((uik) fn1Var).b;
                            zv8[] zv8VarArr = CallIndicatorWidget.g;
                            kn1 kn1VarQ1 = callIndicatorWidget.q1();
                            ac1 ac1Var = (ac1) kn1VarQ1.d;
                            boolean zC = ac1Var.c();
                            boolean z = !zC;
                            sa2 sa2Var = (sa2) kn1VarQ1.e.getValue();
                            n42 n42Var = (n42) kn1VarQ1.c;
                            String strA = ns4.a(((f62) n42Var.f.a.getValue()).i);
                            long j = !zC ? 1L : 0L;
                            boolean z2 = ((f62) n42Var.f.a.getValue()).j;
                            sa2Var.getClass();
                            sa2.c(sa2Var, "AUDIO_ENABLED", strA, null, Long.valueOf(j), null, null, z2, Boolean.TRUE, 116);
                            ac1Var.d(z);
                            mjg mjgVar = kn1VarQ1.n;
                            do {
                                value = mjgVar.getValue();
                                ((Boolean) value).getClass();
                            } while (!mjgVar.h(value, Boolean.valueOf(z)));
                        }
                        break;
                    default:
                        fn1 fn1Var2 = hn1Var.x;
                        if (fn1Var2 != null) {
                            CallIndicatorWidget callIndicatorWidget2 = (CallIndicatorWidget) ((uik) fn1Var2).b;
                            zv8[] zv8VarArr2 = CallIndicatorWidget.g;
                            kn1 kn1VarQ2 = callIndicatorWidget2.q1();
                            n42 n42Var2 = (n42) kn1VarQ2.c;
                            int iD = qt4.D(((f62) n42Var2.f.a.getValue()).f);
                            if (iD == 0) {
                                n42Var2.c().o(true);
                            } else if (iD != 1) {
                                ore.o();
                            } else {
                                kn1VarQ2.F("CONFIRM_STOP_RECORD");
                            }
                        }
                        break;
                }
            }
        });
        this.w = wueVar2;
        TextView textView = new TextView(context);
        textView.setId(R.id.call_indicator_time);
        textView.setMaxLines(1);
        textView.setGravity(17);
        textView.setLayoutParams(new uf4(-2, -2));
        noh nohVar = q9i.j;
        q9i.a(nohVar, textView);
        textView.setTextColor(getTitleColor());
        this.u = textView;
        TextView textViewE = qv1.e(context, R.id.call_indicator_title);
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        textViewE.setMaxLines(1);
        textViewE.setGravity(17);
        textViewE.setLayoutParams(new uf4(-2, -1));
        q9i.a(nohVar, textViewE);
        textViewE.setTextColor(getTitleColor());
        this.t = textViewE;
        addView(ls7Var);
        addView(wueVar);
        addView(wueVar2);
        addView(textView);
        addView(textViewE);
        eg4 eg4VarH = ch3.h(this);
        int id = wueVar.getId();
        eg4VarH.d(id, 3, textViewE.getId(), 3);
        eg4VarH.d(id, 4, textViewE.getId(), 4);
        eg4VarH.d(id, 6, 0, 6);
        new bsb(6, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        int id2 = textViewE.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 6, wueVar.getId(), 7);
        eg4VarH.d(id2, 7, textView.getId(), 6);
        eg4VarH.g(id2).d.l0 = true;
        eg4VarH.g(id2).d.V = 2;
        int id3 = textView.getId();
        eg4VarH.d(id3, 4, textViewE.getId(), 4);
        eg4VarH.d(id3, 3, textViewE.getId(), 3);
        eg4VarH.d(id3, 6, textViewE.getId(), 7);
        eg4VarH.d(id3, 7, wueVar2.getId(), 6);
        int id4 = wueVar2.getId();
        eg4VarH.d(id4, 3, textViewE.getId(), 3);
        eg4VarH.d(id4, 4, textViewE.getId(), 4);
        eg4VarH.d(id4, 7, 0, 7);
        new bsb(7, eg4VarH, id4).a(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(this);
    }

    private final int getTitleColor() {
        return pq3.j.l(this).b.getText().b;
    }

    @Override // defpackage.wy1
    public final void b(boolean z) {
        TextView textView = this.u;
        textView.setTranslationY(0.0f);
        TextView textView2 = this.t;
        textView2.setTranslationY(0.0f);
        wue wueVar = this.v;
        wueVar.setTranslationY(0.0f);
        wue wueVar2 = this.w;
        wueVar2.setTranslationY(0.0f);
        textView2.setAlpha(1.0f);
        textView.setAlpha(1.0f);
        wueVar.setAlpha(1.0f);
        wueVar2.setAlpha(1.0f);
        ls7 ls7Var = this.s;
        ls7Var.setAlpha(1.0f);
        ls7Var.setRadiusScale(0.33333334f);
        ls7Var.setFalloffOverride(0.0f);
        ls7Var.setBlurScale(3.0f);
        int width = getWidth();
        int height = getHeight();
        gn7 gn7Var = ls7Var.d;
        if (gn7Var != null && (gn7Var.m != width || gn7Var.n != height)) {
            gn7Var.m = width;
            gn7Var.n = height;
            gn7Var.requestLayout();
        }
        ls7Var.setContinuousAnimationsEnabled(true);
    }

    @Override // defpackage.wy1
    public final void c(boolean z) {
        ls7 ls7Var = this.s;
        ls7Var.setContinuousAnimationsEnabled(false);
        gn7 gn7Var = ls7Var.d;
        if (gn7Var != null) {
            if (gn7Var.m == 0 && gn7Var.n == 0) {
                return;
            }
            gn7Var.m = 0;
            gn7Var.n = 0;
            gn7Var.requestLayout();
        }
    }

    public final fn1 getActionsListener() {
        return this.x;
    }

    public final gn1 getIndicatorState() {
        zv8 zv8Var = A[0];
        return (gn1) this.z.b;
    }

    @Override // defpackage.wy1
    public final void l(c79 c79Var, boolean z, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ak(6, this));
        c79Var.add(valueAnimatorOfFloat);
        float f = z ? 1.0f : 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        float blurScale = this.s.getBlurScale();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat2.addUpdateListener(new en1(this, blurScale, 0));
        c79Var.add(valueAnimatorOfFloat2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s.c();
    }

    @Override // defpackage.wf4, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        ls7 ls7Var = this.s;
        ls7Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ls7Var.layout(0, 0, i5, i6);
    }

    public final void setActionsListener(fn1 fn1Var) {
        this.x = fn1Var;
    }

    public final void setActionsVisibility(boolean z) {
        int i = z ? 0 : 4;
        this.v.setVisibility(i);
        this.w.setVisibility(i);
    }

    public final void setIndicatorState(gn1 gn1Var) {
        this.z.B(this, A[0], gn1Var);
    }

    public final void setMicrophoneEnabled(boolean z) {
        a8g a8gVar = pq3.j;
        wue wueVar = this.v;
        if (z) {
            a8gVar.l(this);
            wueVar.x(R.drawable.icon_microphone_fill, -1);
            wueVar.setMode(rue.b);
        } else {
            wueVar.x(R.drawable.icon_microphone_crossed_fill, a8gVar.l(this).b.getIcon().f);
            wueVar.setMode(rue.e);
        }
        wueVar.setAccessibility(Integer.valueOf(z ? R.string.call_microphone_enabled_accessibility : R.string.call_microphone_disabled_accessibility));
    }

    public final void setTalking(boolean z) {
        this.s.setTalking(z);
    }

    public final void setTime(CharSequence charSequence) {
        this.u.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.t.setText(charSequence);
    }
}
