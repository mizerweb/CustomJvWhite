package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kda extends FrameLayout implements eph {
    public final LinearLayout a;
    public TextView b;
    public jda c;
    public final int d;
    public float e;
    public float f;
    public boolean g;
    public int h;

    public kda(LinearLayout linearLayout, Context context) {
        super(context);
        this.a = linearLayout;
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        setElevation(yl5.d().getDisplayMetrics().density * 12.0f);
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
        setClipToOutline(true);
        setBackgroundColor(pq3.j.h(this).b().f);
    }

    public final void a(boolean z) {
        this.g = false;
        jda jdaVar = this.c;
        if (jdaVar != null) {
            t6e t6eVar = (t6e) jdaVar;
            RecyclerView recyclerView = t6eVar.a.e;
            int i = recyclerView.getLayoutParams().height;
            r6e r6eVar = t6eVar.k;
            float f = t6eVar.j;
            if (z) {
                t6eVar.g.invoke();
                p0m.a(recyclerView, lt7.KEYBOARD_TAP);
                t6eVar.a(i, t6eVar.i, new s6e(r6eVar, f, 0)).addListener(new d7(r6eVar, 4, t6eVar));
            } else {
                sfe sfeVar = new sfe();
                sfeVar.a = true;
                ValueAnimator valueAnimatorA = t6eVar.a(i, t6eVar.h, new s6e(r6eVar, f, 1));
                valueAnimatorA.addListener(new li(17, sfeVar));
                valueAnimatorA.addListener(new scc(sfeVar, t6eVar, r6eVar, 1));
            }
        }
        this.h = 0;
    }

    public final boolean b(MotionEvent motionEvent) {
        jda jdaVar;
        if (motionEvent.getRawY() - this.e > this.d && (jdaVar = this.c) != null) {
            t6e t6eVar = (t6e) jdaVar;
            v6e v6eVar = t6eVar.a;
            boolean z = v6eVar.d.l() > v6eVar.b();
            RecyclerView recyclerView = v6eVar.e;
            if (!z) {
                ValueAnimator valueAnimator = t6eVar.l;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                t6eVar.b();
                t6eVar.h = recyclerView.getHeight();
                t6eVar.j = 0.0f;
                r6e r6eVar = new r6e(recyclerView, (ViewGroup) recyclerView.getParent(), v6eVar.b(), t6eVar.c, t6eVar.d);
                t6eVar.k = r6eVar;
                r6eVar.b(0.0f);
                v6eVar.c((List) t6eVar.e.invoke(), (Integer) t6eVar.f.invoke(), new k9d(t6eVar, 20, r6eVar));
                t6eVar.i = recyclerView.getLayoutParams().height;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = t6eVar.h;
                    recyclerView.setLayoutParams(layoutParams);
                    this.g = true;
                    this.f = motionEvent.getRawY();
                    return true;
                }
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return false;
    }

    public final jda getOverscrollCallback() {
        return this.c;
    }

    public final TextView getReadByHeaderText() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.c == null || this.a.getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = motionEvent.getRawY();
            this.g = false;
        } else if (actionMasked == 2 && !this.g && b(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        super.onMeasure(i, i2);
        LinearLayout linearLayout = this.a;
        if (linearLayout.getVisibility() == 0) {
            int childCount = linearLayout.getChildCount();
            int i3 = 0;
            int iMax = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                TextView textViewA = hsk.a(linearLayout.getChildAt(i3));
                if (textViewA != null && (layout = textViewA.getLayout()) != null) {
                    int iD = o9b.d(layout);
                    ViewGroup.LayoutParams layoutParams = textViewA.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    iMax = Math.max(iMax, (int) ((marginLayoutParams != null ? marginLayoutParams.getMarginStart() : 0) + (marginLayoutParams != null ? marginLayoutParams.getMarginEnd() : 0) + iD + 1.0f));
                }
                i3++;
            }
            TextView textView = this.b;
            int iMax2 = Math.max(iMax, Math.max(o9b.d(textView != null ? textView.getLayout() : null), Math.min(gm0.K(250.0f * yl5.d().getDisplayMetrics().density), getResources().getDisplayMetrics().widthPixels / 2)));
            if (1 > iMax2 || iMax2 >= getMeasuredWidth()) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), i2);
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(kbcVar.b().f);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.c == null || this.a.getVisibility() != 0) && !this.g) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.e = motionEvent.getRawY();
            this.g = false;
            return true;
        }
        if (actionMasked == 1) {
            if (this.g) {
                if (motionEvent.getActionMasked() == 1 && this.h >= gm0.K(40.0f * yl5.d().getDisplayMetrics().density)) {
                    z = true;
                }
                a(z);
            }
        } else if (actionMasked == 2) {
            if (!this.g) {
                b(motionEvent);
            }
            if (this.g) {
                float rawY = motionEvent.getRawY() - this.f;
                if (rawY < 0.0f) {
                    rawY = 0.0f;
                }
                float f = rawY * 0.5f;
                float fK = gm0.K(yl5.d().getDisplayMetrics().density * 64.0f);
                if (f > fK) {
                    f = fK;
                }
                int i = (int) f;
                this.h = i;
                jda jdaVar = this.c;
                if (jdaVar != null) {
                    t6e t6eVar = (t6e) jdaVar;
                    RecyclerView recyclerView = t6eVar.a.e;
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return false;
                    }
                    int i2 = t6eVar.h + i;
                    int i3 = t6eVar.i;
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    layoutParams.height = i2;
                    recyclerView.setLayoutParams(layoutParams);
                    float fU = oc9.u(i / gm0.K(40.0f * yl5.d().getDisplayMetrics().density), 0.0f, 1.0f);
                    t6eVar.j = fU;
                    r6e r6eVar = t6eVar.k;
                    if (r6eVar != null) {
                        r6eVar.b(fU);
                    }
                }
                if (this.h >= gm0.K(64.0f * yl5.d().getDisplayMetrics().density)) {
                    a(true);
                    return true;
                }
            }
        } else if (actionMasked == 3) {
            if (this.g) {
                if (motionEvent.getActionMasked() == 1) {
                    z = true;
                }
                a(z);
            }
        }
        return true;
    }

    public final void setOverscrollCallback(jda jdaVar) {
        this.c = jdaVar;
    }

    public final void setReadByHeaderText(TextView textView) {
        this.b = textView;
    }
}
