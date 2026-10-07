package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fl2 extends FrameLayout implements o59, zs3 {
    public static final /* synthetic */ zv8[] y;
    public final ChatMediaViewerScreen a;
    public final r59 b;
    public final int c;
    public final Rect d;
    public int e;
    public int f;
    public int g;
    public Integer h;
    public int i;
    public int j;
    public Integer k;
    public float l;
    public long m;
    public final int n;
    public boolean o;
    public boolean p;
    public final zb q;
    public final mt5 r;
    public final urb s;
    public final el2 t;
    public final LinearLayout u;
    public final FrameLayout v;
    public final j7j w;
    public final View x;

    static {
        z8b z8bVar = new z8b(fl2.class, "panelState", "getPanelState()Lone/me/chatmedia/viewer/caption/CaptionPopupView$PanelState;");
        zfe.a.getClass();
        y = new zv8[]{z8bVar};
    }

    public fl2(Context context, ChatMediaViewerScreen chatMediaViewerScreen, o1c o1cVar) {
        super(context);
        this.a = chatMediaViewerScreen;
        at3 at3Var = new at3(context, this);
        final int i = 0;
        at3Var.h = new af7(this) { // from class: cl2
            public final /* synthetic */ fl2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                fl2 fl2Var = this.b;
                switch (i2) {
                    case 0:
                        fl2.c(fl2Var);
                        return sbi.a;
                    default:
                        return Integer.valueOf(fl2.d(fl2Var));
                }
            }
        };
        final int i2 = 1;
        r59 r59Var = new r59(this, new af7(this) { // from class: cl2
            public final /* synthetic */ fl2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                fl2 fl2Var = this.b;
                switch (i3) {
                    case 0:
                        fl2.c(fl2Var);
                        return sbi.a;
                    default:
                        return Integer.valueOf(fl2.d(fl2Var));
                }
            }
        }, 4);
        this.b = r59Var;
        this.c = gm0.K(39.0f * yl5.d().getDisplayMetrics().density);
        this.d = new Rect();
        this.n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.p = true;
        this.q = new zb(this);
        mt5 mt5Var = new mt5(context);
        mt5Var.setCustomTheme(getCustomTheme());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        mt5Var.setLayoutParams(layoutParams);
        this.r = mt5Var;
        urb urbVar = new urb(context);
        urbVar.setTextColor(getCustomTheme().getText().b);
        q9i.z.h().b(urbVar, (bx5) o1cVar.a.getValue());
        urbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        urbVar.setMovementMethod(at3Var);
        urbVar.setTransformationMethod(r59Var);
        l8j.a(urbVar);
        this.s = urbVar;
        el2 el2Var = new el2(context, this);
        el2Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        el2Var.setFillViewport(false);
        el2Var.addView(urbVar);
        el2Var.setVerticalFadingEdgeEnabled(true);
        el2Var.setFadingEdgeLength(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        this.t = el2Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(mt5Var);
        linearLayout.addView(el2Var);
        this.u = linearLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new nvh(yl5.d().getDisplayMetrics().density * 20.0f));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        bl2 bl2Var = new bl2();
        int iI0 = lvb.I0(getCustomTheme().k().d, 0.84f);
        Drawable drawable = bl2Var.getDrawable(bl2Var.a);
        ColorDrawable colorDrawable = drawable instanceof ColorDrawable ? (ColorDrawable) drawable : null;
        if (colorDrawable != null) {
            colorDrawable.setColor(iI0);
        }
        bl2Var.invalidateSelf();
        bl2Var.a(this.p);
        bl2Var.c = yl5.d().getDisplayMetrics().density * 24.0f;
        bl2Var.b();
        bl2Var.d = new int[]{lvb.I0(getCustomTheme().h().a, 0.04f), 0};
        bl2Var.b();
        frameLayout.setBackground(bl2Var);
        this.v = frameLayout;
        j7j j7jVar = new j7j(getContext(), this, new o11(1, this));
        j7jVar.b = (int) (1.0f * j7jVar.b);
        this.w = j7jVar;
        View view = new View(context);
        view.setClickable(false);
        view.setFocusableInTouchMode(false);
        view.setFocusable(false);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, lvb.I0(getCustomTheme().b().b, 0.84f)}));
        view.setVisibility(8);
        this.x = view;
        setClipToOutline(true);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -2, 80));
        addView(view, new FrameLayout.LayoutParams(-1, gm0.K(8.0f * yl5.d().getDisplayMetrics().density), 80));
    }

    public static void c(fl2 fl2Var) {
        if (fl2Var.getPanelState() == dl2.a && fl2Var.p) {
            int i = fl2Var.g;
            j7j j7jVar = fl2Var.w;
            FrameLayout frameLayout = fl2Var.v;
            if (j7jVar.q(frameLayout, frameLayout.getLeft(), i)) {
                fl2Var.postInvalidateOnAnimation();
                fl2Var.h = Integer.valueOf(i);
                fl2Var.i(i);
            }
        }
    }

    public static int d(fl2 fl2Var) {
        return fl2Var.getCustomTheme().getText().h;
    }

    private final kbc getCustomTheme() {
        return pq3.j.l(this).b;
    }

    private static /* synthetic */ void getPanelFrame$annotations() {
    }

    public final dl2 getPanelState() {
        zv8 zv8Var = y[0];
        return (dl2) this.q.b;
    }

    private final void setExpandable(boolean z) {
        this.p = z;
        g(getPanelState());
    }

    private final void setPanelState(dl2 dl2Var) {
        this.q.B(this, y[0], dl2Var);
    }

    public final void settleToPosition(int i) {
        if (this.w.o(this.v.getLeft(), i)) {
            postInvalidateOnAnimation();
            this.h = Integer.valueOf(i);
            i(i);
        }
    }

    @Override // defpackage.o59
    public final void a(String str, t59 t59Var, ClickableSpan clickableSpan) {
        this.a.U1().P(str, t59Var);
    }

    @Override // defpackage.o59
    public final void b(cga cgaVar) {
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        chatMediaViewerScreen.getClass();
        long j = cgaVar.a;
        if (b53.$EnumSwitchMapping$2[cgaVar.c.ordinal()] == 1) {
            if (j > 0) {
                l63 l63VarU1 = chatMediaViewerScreen.U1();
                l63VarU1.M1.B(l63VarU1, l63.O1[7], yab.i0(l63VarU1.b, null, 0, new u53(l63VarU1, j, null, 1), 3));
                return;
            }
            l63 l63VarU2 = chatMediaViewerScreen.U1();
            String str = cgaVar.b;
            if (str == null) {
                l63VarU2.getClass();
                gm0.Y(l63.class.getName(), "Early return in handleMentionByLink cuz of link is null");
                return;
            }
            String strA = ((w69) l63VarU2.z.getValue()).a(str);
            if (strA == null) {
                gm0.Y(l63.class.getName(), "Early return in handleMentionByLink cuz of links.channelProfileTagToLink(link) is null");
            } else {
                l63VarU2.O(strA);
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.w.f()) {
            postInvalidateOnAnimation();
        }
    }

    public final void g(dl2 dl2Var) {
        bl2 bl2Var;
        int iOrdinal = dl2Var.ordinal();
        mt5 mt5Var = this.r;
        FrameLayout frameLayout = this.v;
        if (iOrdinal == 0) {
            frameLayout.setOutlineProvider(new nvh(yl5.d().getDisplayMetrics().density * 20.0f));
            frameLayout.setClipToOutline(true);
            mt5Var.setVisibility(this.p ? 0 : 8);
            Drawable background = frameLayout.getBackground();
            bl2Var = background instanceof bl2 ? (bl2) background : null;
            if (bl2Var != null) {
                bl2Var.a(this.p);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            frameLayout.setOutlineProvider(new nvh(yl5.d().getDisplayMetrics().density * 20.0f));
            frameLayout.setClipToOutline(true);
            mt5Var.setVisibility(0);
            Drawable background2 = frameLayout.getBackground();
            bl2Var = background2 instanceof bl2 ? (bl2) background2 : null;
            if (bl2Var != null) {
                bl2Var.a(true);
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            ore.o();
            return;
        }
        frameLayout.setOutlineProvider(null);
        frameLayout.setClipToOutline(false);
        mt5Var.setVisibility(0);
        Drawable background3 = frameLayout.getBackground();
        bl2Var = background3 instanceof bl2 ? (bl2) background3 : null;
        if (bl2Var != null) {
            bl2Var.a(false);
        }
    }

    public final int getCollapsedPanelHeight() {
        return this.i;
    }

    public final dl2 getState() {
        return getPanelState();
    }

    public final void h() {
        Integer num = this.h;
        this.x.setVisibility((this.p && getPanelState() == dl2.a) || (getPanelState() == dl2.b && num != null && this.g < num.intValue()) ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    public final void i(int i) {
        dl2 dl2Var;
        int i2 = this.e;
        if (i2 == 0) {
            return;
        }
        int i3 = i2 - i;
        if (i3 <= this.i) {
            dl2Var = dl2.a;
        } else {
            Integer num = this.k;
            if (num == null) {
                dl2Var = dl2.b;
            } else {
                if (i3 >= (num != null ? num.intValue() : Integer.MAX_VALUE)) {
                    dl2Var = dl2.c;
                } else {
                    dl2Var = dl2.b;
                }
            }
        }
        setPanelState(dl2Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = this.s.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        r59 r59Var = this.b;
        r59Var.a = this;
        r59Var.c(spannable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = this.s.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.a = null;
        r59.a(spannable);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ChatMediaViewerScreen chatMediaViewerScreen;
        if (this.p) {
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            Integer num = this.h;
            boolean z = num != null && num.intValue() == this.g;
            el2 el2Var = this.t;
            boolean zCanScrollVertically = el2Var.canScrollVertically(-1);
            boolean zCanScrollVertically2 = el2Var.canScrollVertically(1);
            int actionMasked = motionEvent.getActionMasked();
            j7j j7jVar = this.w;
            if (actionMasked == 0) {
                this.l = y2;
                this.o = false;
                j7jVar.j(motionEvent);
                return false;
            }
            if (actionMasked == 1) {
                this.l = 0.0f;
                this.o = false;
                chatMediaViewerScreen = this.a;
                if (chatMediaViewerScreen.J1()) {
                    chatMediaViewerScreen.U1().Q();
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return j7jVar.p(motionEvent);
                }
                this.l = 0.0f;
                this.o = false;
                chatMediaViewerScreen = this.a;
                if (chatMediaViewerScreen.J1()) {
                    chatMediaViewerScreen.U1().Q();
                }
            } else {
                float f = y2 - this.l;
                FrameLayout frameLayout = this.v;
                int left = frameLayout.getLeft();
                LinearLayout linearLayout = this.u;
                int left2 = linearLayout.getLeft() + left;
                int top = linearLayout.getTop() + frameLayout.getTop();
                int right = linearLayout.getRight() + frameLayout.getLeft();
                int bottom = linearLayout.getBottom() + frameLayout.getTop();
                Rect rect = this.d;
                rect.set(left2, top, right, bottom);
                if (rect.contains((int) x, (int) y2)) {
                    if (!this.o && Math.abs(f) > this.n) {
                        this.o = true;
                    }
                    if (this.o) {
                        if (!z) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                        boolean z2 = f > 0.0f;
                        boolean z3 = f < 0.0f;
                        if ((!z2 || !zCanScrollVertically) && (!z3 || !zCanScrollVertically2)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        this.e = getMeasuredHeight();
        FrameLayout frameLayout = this.v;
        this.j = frameLayout.getMeasuredHeight();
        Layout layout = this.s.getLayout();
        int lineCount = layout != null ? layout.getLineCount() : 1;
        if (lineCount <= 1) {
            paddingBottom = this.j;
        } else {
            paddingBottom = frameLayout.getPaddingBottom() + frameLayout.getPaddingTop() + this.c;
        }
        this.i = paddingBottom;
        int i5 = this.e;
        this.f = i5 - paddingBottom;
        this.g = i5 - this.j;
        if (this.h == null || getPanelState() == dl2.a) {
            frameLayout.offsetTopAndBottom(this.f - frameLayout.getTop());
            this.h = Integer.valueOf(this.f);
        }
        setExpandable(lineCount > 1);
        Integer num = this.h;
        i(num != null ? num.intValue() : this.f);
        h();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Integer num = this.k;
        if (num != null) {
            int iIntValue = num.intValue();
            FrameLayout frameLayout = this.v;
            if (frameLayout.getMeasuredHeight() > iIntValue) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e5, code lost:
    
        if (r4.contains((int) r0, (int) r2) == false) goto L50;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.zs3
    public final void r(String str, cga cgaVar, MotionEvent motionEvent) {
        l63 l63VarU1 = this.a.U1();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        l63VarU1.getClass();
        String str2 = cgaVar.b;
        if (str2 != null) {
            str = "@".concat(str2);
        }
        a8j.x(l63VarU1.Y, new xb6(rawX, rawY, new xnh(str), n1g.i(new ylc("chat.media.viewer.link", str), new ylc("chat.media.viewer.entity_id", Long.valueOf(cgaVar.a)), new ylc("chat.media.viewer.link_type", 4)), xw3.P0((str2 == null || str2.length() == 0) ? new rp4(R.id.link_context_menu_action_open_user_chat, new tnh(R.string.link_context_menu_action_open_user_chat_link), Integer.valueOf(R.drawable.icon_message), (Integer) null, 20) : new rp4(R.id.link_context_menu_action_open_chat, new tnh(R.string.link_context_menu_action_open_chat_link), Integer.valueOf(R.drawable.icon_arrow_right), (Integer) null, 20), new rp4(R.id.link_context_menu_action_copy_link, new tnh(R.string.link_context_menu_action_copy_entity_link), Integer.valueOf(R.drawable.icon_copy), (Integer) null, 20))));
    }

    public final void setMaxExpandedHeightPx(int i) {
        this.k = Integer.valueOf(i);
        invalidate();
        requestLayout();
    }

    public final void setText(CharSequence charSequence) {
        r59 r59Var = this.b;
        urb urbVar = this.s;
        urbVar.setText(r59Var.getTransformation(charSequence, urbVar));
        CharSequence text = urbVar.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            r59Var.a = this;
            r59Var.c(spannable);
        }
        setPanelState(dl2.a);
        this.h = null;
        requestLayout();
    }

    @Override // defpackage.zs3
    public final boolean u(ClickableSpan clickableSpan, int i, int i2, String str, t59 t59Var, MotionEvent motionEvent) {
        int i3;
        List listP0;
        l63 l63VarU1 = this.a.U1();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        l63VarU1.getClass();
        Bundle bundleI = n1g.i(new ylc("chat.media.viewer.link", str), new ylc("chat.media.viewer.link_type", Integer.valueOf(t59Var.ordinal())));
        if (y1m.b(str)) {
            i3 = 3;
        } else {
            i3 = y1m.c(str) ? 2 : 1;
        }
        Integer numValueOf = Integer.valueOf(R.drawable.icon_external_link);
        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_copy);
        int iD = qt4.D(i3);
        if (iD == 0) {
            listP0 = xw3.P0(new rp4(t59Var == t59.e ? R.id.link_context_menu_action_open_profile : R.id.link_context_menu_action_open_link, new tnh(R.string.link_context_menu_action_open_link), numValueOf, (Integer) null, 20), new rp4(R.id.link_context_menu_action_copy_link, new tnh(R.string.link_context_menu_action_copy_link), numValueOf2, (Integer) null, 20));
        } else if (iD == 1) {
            listP0 = xw3.P0(new rp4(R.id.link_context_menu_action_open_link, new tnh(R.string.link_context_menu_action_open_phone_link), Integer.valueOf(R.drawable.icon_call), (Integer) null, 20), new rp4(R.id.link_context_menu_action_copy_link, new tnh(R.string.link_context_menu_action_copy_phone_link), numValueOf2, (Integer) null, 20));
        } else {
            if (iD != 2) {
                ore.o();
                return false;
            }
            listP0 = xw3.P0(new rp4(R.id.link_context_menu_action_open_link, new tnh(R.string.link_context_menu_action_open_mail_link), numValueOf, (Integer) null, 20), new rp4(R.id.link_context_menu_action_copy_link, new tnh(R.string.link_context_menu_action_copy_mail_link), numValueOf2, (Integer) null, 20));
        }
        a8j.x(l63VarU1.Y, new xb6(rawX, rawY, new xnh(str), bundleI, listP0));
        return true;
    }
}
