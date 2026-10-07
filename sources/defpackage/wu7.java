package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.android.MainActivity;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wu7 extends FrameLayout {
    public af7 a;
    public cf7 b;
    public final int c;
    public float d;
    public boolean e;
    public final kwb f;
    public final TextView g;
    public final TextView h;
    public final TextView i;

    public wu7(MainActivity mainActivity) {
        super(mainActivity);
        this.c = ViewConfiguration.get(mainActivity).getScaledTouchSlop();
        kwb kwbVar = new kwb(mainActivity);
        kwbVar.setAvatarShape(awb.a);
        this.f = kwbVar;
        TextView textView = new TextView(mainActivity);
        textView.setId(R.id.call_held_banner_title);
        noh nohVar = q9i.f;
        q9i.a(nohVar, textView);
        textView.setTextColor(getTheme().getText().b);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.g = textView;
        TextView textView2 = new TextView(mainActivity);
        q9i.a(nohVar, textView2);
        textView2.setTextColor(getTheme().getText().b);
        textView2.setMaxLines(1);
        textView2.setText(mainActivity.getString(R.string.call_held_banner_subtitle));
        this.h = textView2;
        TextView textView3 = new TextView(mainActivity);
        textView3.setId(R.id.call_held_banner_return);
        q9i.a(nohVar, textView3);
        textView3.setTextColor(getTheme().getText().b);
        textView3.setText(mainActivity.getString(R.string.call_held_banner_return));
        textView3.setGravity(17);
        textView3.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        gradientDrawable.setColor(getTheme().h().b);
        textView3.setBackground(gradientDrawable);
        qe7.H(textView3, 600L, new o37(5, this));
        this.i = textView3;
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        gradientDrawable2.setColor(getTheme().b().c);
        linearLayout.setBackground(gradientDrawable2);
        linearLayout.addView(kwbVar, new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(textView);
        linearLayout2.addView(textView2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        layoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        linearLayout.addView(linearLayout2, layoutParams);
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-2, -2));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        layoutParams2.setMarginEnd(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        addView(linearLayout, layoutParams2);
    }

    private final kbc getTheme() {
        return pq3.j.l(this).b;
    }

    public final void a(be1 be1Var, boolean z, boolean z2) {
        CharSequence charSequence = be1Var.c;
        if (charSequence == null) {
            charSequence = be1Var.d;
        }
        this.g.setText(charSequence);
        this.i.setText(getContext().getString(z2 ? R.string.call_held_banner_return : R.string.call_held_banner_resume));
        String string = getContext().getString(z ? R.string.call_held_banner_waiting_room : R.string.call_held_banner_subtitle);
        TextView textView = this.h;
        textView.setText(string);
        textView.setTextColor(z ? getTheme().getText().e : getTheme().getText().b);
        kwb.v(this.f, be1Var.e, be1Var.f, be1Var.g);
    }

    public final cf7 getOnDragDelta() {
        return this.b;
    }

    public final af7 getOnReturnClick() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d = motionEvent.getRawY();
            this.e = false;
            return false;
        }
        if (actionMasked != 2 || this.e || Math.abs(motionEvent.getRawY() - this.d) <= this.c) {
            return false;
        }
        this.e = true;
        this.d = motionEvent.getRawY();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r0 != 3) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L4f
            if (r0 == r2) goto L4c
            r3 = 2
            if (r0 == r3) goto L11
            r5 = 3
            if (r0 == r5) goto L4c
            goto L4b
        L11:
            boolean r0 = r4.e
            if (r0 != 0) goto L2f
            float r0 = r5.getRawY()
            float r1 = r4.d
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r4.c
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r4.e = r2
            float r0 = r5.getRawY()
            r4.d = r0
        L2f:
            boolean r0 = r4.e
            if (r0 == 0) goto L4b
            cf7 r0 = r4.b
            if (r0 == 0) goto L45
            float r1 = r5.getRawY()
            float r3 = r4.d
            float r1 = r1 - r3
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.invoke(r1)
        L45:
            float r5 = r5.getRawY()
            r4.d = r5
        L4b:
            return r2
        L4c:
            r4.e = r1
            return r2
        L4f:
            float r5 = r5.getRawY()
            r4.d = r5
            r4.e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnDragDelta(cf7 cf7Var) {
        this.b = cf7Var;
    }

    public final void setOnReturnClick(af7 af7Var) {
        this.a = af7Var;
    }
}
