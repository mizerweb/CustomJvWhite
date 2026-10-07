package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tha extends LinearLayout implements eph, b77 {
    public static final /* synthetic */ zv8[] p1 = {new z8b(tha.class, "isVideoMessageEnabled", "isVideoMessageEnabled()Z"), zo5.e(zfe.a, tha.class, "scheduledMessagesButtonState", "getScheduledMessagesButtonState()Lone/me/sdk/uikit/common/chat/MessageInputView$ScheduledMessagesButtonState;"), new z8b(tha.class, "isTransparent", "isTransparent()Z"), new z8b(tha.class, "disallowParentInterceptTouchEvent", "getDisallowParentInterceptTouchEvent()Z"), new z8b(tha.class, "showSendOnlyWhenHasText", "getShowSendOnlyWhenHasText()Z")};
    public kbc A;
    public boolean B;
    public final sha C;
    public final sha D;
    public nha E;
    public final sha F;
    public final mjg G;
    public final r8e H;
    public final mjg I;
    public final r8e J;
    public final ny8 K;
    public int a;
    public final ImageView b;
    public int c;
    public oha d;
    public fha e;
    public final pha f;
    public final int g;
    public final ny8 h;
    public final ny8 i;
    public final qjg j;
    public final ImageView k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final Rect n1;
    public final ny8 o;
    public final ny8 o1;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public eha w;
    public boolean x;
    public final sha y;
    public final sha z;

    public tha(Context context) {
        super(context, null, 0, 0);
        this.a = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        ImageView imageViewD = qv1.d(context, R.id.oneme_message_input_left_inner_icon);
        imageViewD.setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        layoutParams.setMargins(gm0.K(4.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, this.a);
        imageViewD.setLayoutParams(layoutParams);
        this.b = imageViewD;
        this.c = R.drawable.icon_arrow_up;
        pha phaVar = new pha(context, this);
        phaVar.setId(R.id.oneme_message_input_edit_text);
        phaVar.setBackground(null);
        phaVar.setPadding(0, 0, 0, 0);
        phaVar.setMaxLines(8);
        q9i.a(q9i.A.h(), phaVar);
        phaVar.setInputType(phaVar.getInputType() | 16384);
        phaVar.setImeOptions(268435456);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), phaVar.getLineHeight());
        np4.D(phaVar, gradientDrawable);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 16;
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
        layoutParams2.setMargins(iK, iK, iK, iK);
        phaVar.setLayoutParams(layoutParams2);
        phaVar.setLayerType(1, null);
        GestureDetector gestureDetector = new GestureDetector(context, new pi9(11, this));
        gestureDetector.setIsLongpressEnabled(true);
        phaVar.setOnTouchListener(new nt1(this, 2, gestureDetector));
        l8j.a(phaVar);
        this.f = phaVar;
        this.g = R.drawable.icon_attachment;
        this.h = rx8.P(3, new vx9(context, 5, this));
        this.i = rx8.P(3, new n52(context, 18));
        qjg qjgVar = new qjg(null, null);
        qjgVar.a(new int[]{android.R.attr.state_enabled}, new ShapeDrawable(new OvalShape()));
        qjgVar.a(new int[]{-16842910}, new ShapeDrawable(new OvalShape()));
        this.j = qjgVar;
        ImageView imageViewD2 = qv1.d(context, R.id.oneme_message_input_right_outer_icon);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(yl5.d().getDisplayMetrics().density * 36.0f));
        layoutParams3.gravity = 80;
        layoutParams3.setMarginStart(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        imageViewD2.setLayoutParams(layoutParams3);
        this.k = imageViewD2;
        this.l = rx8.P(3, new n52(context, 19));
        this.m = rx8.P(3, new n52(context, 17));
        this.n = rx8.P(3, new wga(this, 0));
        this.o = rx8.P(3, new wga(this, 1));
        this.p = rx8.P(3, new wga(this, 2));
        this.q = rx8.P(3, new wga(this, 3));
        this.r = rx8.P(3, new wga(this, 4));
        this.s = rx8.P(3, new wga(this, 5));
        this.t = rx8.P(3, new wga(this, 6));
        this.u = rx8.P(3, new wga(this, 7));
        this.v = rx8.P(3, new wga(this, 8));
        this.w = eha.a;
        this.y = new sha(this, 0);
        this.z = new sha(this, 1);
        this.C = new sha(this, 2);
        this.D = new sha(this, 3);
        this.E = new iha(bha.a);
        this.F = new sha(this, 4);
        mjg mjgVarA = p90.a(null);
        this.G = mjgVarA;
        this.H = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(0);
        this.I = mjgVarA2;
        this.J = new r8e(mjgVarA2);
        this.K = rx8.P(3, new bh9(26));
        this.n1 = new Rect();
        this.o1 = rx8.P(3, new bh9(27));
        setId(R.id.oneme_message_input_view_id);
        setClipChildren(false);
        setClipToPadding(false);
        int iK2 = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        setPadding(iK2, iK2, iK2, iK2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        setLayoutParams(layoutParams4);
        addView(imageViewD);
        addView(phaVar);
        addView(imageViewD2);
        imageViewD.setImageResource(R.drawable.icon_sticker);
        phaVar.setAccessibilityDelegate(new zga(this));
        phaVar.addTextChangedListener(new aha(this));
        onThemeChanged(getCurrentTheme());
    }

    public static LayerDrawable b(tha thaVar) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{thaVar.j, thaVar.getCheckDrawable()});
        layerDrawable.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    public static LayerDrawable c(tha thaVar) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{thaVar.j, thaVar.getArrowDrawable()});
        layerDrawable.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    public static ImageView d(Context context, tha thaVar) {
        ImageView imageViewD = qv1.d(context, R.id.oneme_message_input_right_inner_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, thaVar.a);
        imageViewD.setLayoutParams(layoutParams);
        imageViewD.setImageResource(thaVar.g);
        imageViewD.setImageTintList(ColorStateList.valueOf(thaVar.getCurrentTheme().getIcon().c));
        return imageViewD;
    }

    public static final void g(tha thaVar) {
        if (thaVar.getShowSendOnlyWhenHasText()) {
            thaVar.setMinimumHeight(Math.max(thaVar.q(thaVar.b), Math.max(thaVar.q(thaVar.k), thaVar.q(thaVar.f))) + thaVar.getPaddingBottom() + thaVar.getPaddingTop());
            thaVar.requestLayout();
        }
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.n.getValue();
    }

    private final Drawable getCheckDrawable() {
        return (Drawable) this.p.getValue();
    }

    private final LayerDrawable getCheckIcon() {
        return (LayerDrawable) this.q.getValue();
    }

    public final kbc getCurrentTheme() {
        kbc kbcVar = this.A;
        return kbcVar == null ? pq3.j.h(this) : kbcVar;
    }

    private final Drawable getEmojiArrowDownDrawable() {
        return (Drawable) this.v.getValue();
    }

    private final Drawable getEmojiArrowUpDrawable() {
        return (Drawable) this.u.getValue();
    }

    private final InputFilter getEmptyFilter() {
        return (InputFilter) this.K.getValue();
    }

    private final ArrayList<Rect> getGestureExclusionRects() {
        return (ArrayList) this.o1.getValue();
    }

    private final Drawable getLikeFilledReactIcon() {
        return (Drawable) this.s.getValue();
    }

    private final Drawable getLikeReactIcon() {
        return (Drawable) this.r.getValue();
    }

    private final Drawable getMicIcon() {
        return (Drawable) this.t.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.o.getValue();
    }

    private final void setSendActionState(nha nhaVar) {
        this.E = nhaVar;
        p(getCurrentTheme());
    }

    public final void setVideoMsgButtonVisible(boolean z) {
        View view = this.k;
        ny8 ny8Var = this.l;
        if (z) {
            yab.e(this, (View) ny8Var.getValue(), Integer.valueOf(indexOfChild(view)));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        if (ny8Var.d()) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            ViewParent parent = imageView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(imageView);
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    @Override // defpackage.b77
    public final void a(bx5 bx5Var) {
        addOnLayoutChangeListener(new b62(this, 3, bx5Var));
    }

    public final View getAudioRecordAnchor() {
        return this.k;
    }

    public final int getCursorPosition() {
        return this.f.getSelectionEnd();
    }

    public final kbc getCustomTheme() {
        return this.A;
    }

    public final boolean getDisallowParentInterceptTouchEvent() {
        zv8 zv8Var = p1[3];
        return ((Boolean) this.D.b).booleanValue();
    }

    public final Editable getEditableOriginal() {
        return this.f.getText();
    }

    public final eha getEmojiExpandableState() {
        return this.w;
    }

    public final gjg getMessagePosition() {
        return this.J;
    }

    public final View getMessagePreviewAnchor() {
        return this.k;
    }

    public final gjg getMessageState() {
        return this.H;
    }

    public final gha getScheduledMessagesButtonState() {
        zv8 zv8Var = p1[1];
        return (gha) this.z.b;
    }

    public final int getSelectionEnd() {
        return this.f.getSelectionEnd();
    }

    public final int getSelectionStart() {
        return this.f.getSelectionStart();
    }

    public final nha getSendActionState() {
        return this.E;
    }

    public final int getSendIconResId() {
        return this.c;
    }

    public final View getSendMessageAnchor() {
        return this.k;
    }

    public final boolean getShowSendOnlyWhenHasText() {
        zv8 zv8Var = p1[4];
        return ((Boolean) this.F.b).booleanValue();
    }

    public final CharSequence getText() {
        Editable text = this.f.getText();
        if (text != null) {
            return lvb.d0(text);
        }
        return null;
    }

    public final View getVideoMessageRecordAnchor() {
        ny8 ny8Var = this.l;
        if (n7j.o(ny8Var)) {
            return (View) ny8Var.getValue();
        }
        return null;
    }

    public final void h(boolean z) {
        this.B = z;
        pha phaVar = this.f;
        if (z) {
            ml9.e(phaVar);
        } else {
            ml9.d(phaVar);
        }
    }

    public final void i(CharSequence charSequence) {
        pha phaVar = this.f;
        Editable text = phaVar.getText();
        if (text == null) {
            setText(charSequence);
            return;
        }
        int selectionStart = phaVar.getSelectionStart();
        int selectionEnd = phaVar.getSelectionEnd();
        int iMax = Math.max(selectionStart, 0);
        int iMax2 = Math.max(selectionEnd, 0);
        int iMin = Math.min(iMax, iMax2);
        int iMax3 = Math.max(iMax, iMax2);
        if (selectionStart == -1 && selectionEnd == -1) {
            text.append(charSequence);
        } else {
            text.replace(iMin, iMax3, charSequence, 0, charSequence.length());
        }
    }

    public final boolean j() {
        Editable text = this.f.getText();
        return text == null || r5h.X0(text);
    }

    public final void k(gha ghaVar) {
        ghaVar.getClass();
        gha ghaVar2 = gha.b;
        gha ghaVar3 = gha.c;
        boolean z = ghaVar == ghaVar2 || ghaVar == ghaVar3;
        ny8 ny8Var = this.h;
        ny8 ny8Var2 = this.m;
        if (z) {
            yab.e(this, (View) ny8Var2.getValue(), Integer.valueOf(indexOfChild((View) ny8Var.getValue())));
            ((ImageView) ny8Var2.getValue()).setImageResource(ghaVar == ghaVar3 ? R.drawable.icon_clocks_error_28 : R.drawable.icon_clock);
            if (ny8Var.d()) {
                ImageView imageView = (ImageView) ny8Var.getValue();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
                    imageView.setLayoutParams(marginLayoutParams);
                }
            }
        } else if (ny8Var2.d()) {
            ImageView imageView2 = (ImageView) ny8Var2.getValue();
            ViewParent parent = imageView2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(imageView2);
            }
            if (ny8Var.d()) {
                ImageView imageView3 = (ImageView) ny8Var.getValue();
                ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
                if (layoutParams2 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginStart(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                    imageView3.setLayoutParams(marginLayoutParams2);
                }
            }
        }
        o();
    }

    public final void l() {
        p(getCurrentTheme());
    }

    public final void m(boolean z) {
        setInputEnabled(true);
        pha phaVar = this.f;
        phaVar.setAlpha(1.0f);
        phaVar.setTranslationX(0.0f);
        ImageView imageView = this.b;
        imageView.setAlpha(1.0f);
        imageView.setTranslationX(0.0f);
        ny8 ny8Var = this.i;
        if (ny8Var.d()) {
            ((gig) ny8Var.getValue()).setAlpha(1.0f);
            ((gig) ny8Var.getValue()).setTranslationX(0.0f);
        }
        ny8 ny8Var2 = this.h;
        if (ny8Var2.d() && !z) {
            ((ImageView) ny8Var2.getValue()).setAlpha(1.0f);
            ((ImageView) ny8Var2.getValue()).setScaleX(1.0f);
            ((ImageView) ny8Var2.getValue()).setScaleY(1.0f);
        }
        ny8 ny8Var3 = this.l;
        if (ny8Var3.d() && !z) {
            ((ImageView) ny8Var3.getValue()).setAlpha(1.0f);
            ((ImageView) ny8Var3.getValue()).setScaleX(1.0f);
            ((ImageView) ny8Var3.getValue()).setScaleY(1.0f);
            setVideoMsgButtonVisible(true);
        }
        ny8 ny8Var4 = this.m;
        if (ny8Var4.d()) {
            ((ImageView) ny8Var4.getValue()).setAlpha(1.0f);
            ((ImageView) ny8Var4.getValue()).setScaleX(1.0f);
            ((ImageView) ny8Var4.getValue()).setScaleY(1.0f);
        }
        this.k.setVisibility(!z ? 0 : 8);
    }

    public final void n(int i) {
        if (i == -1) {
            return;
        }
        pha phaVar = this.f;
        phaVar.setSelection(Math.min(i, phaVar.length()));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    public final void o() {
        boolean z;
        ny8 ny8Var = this.i;
        if (ny8Var.d()) {
            Editable text = this.f.getText();
            if (text != null) {
                z = r5h.L0(text, "\n", false);
            }
            gig gigVar = (gig) ny8Var.getValue();
            boolean zJ = j();
            eig eigVar = eig.b;
            if (zJ && !this.x && !z) {
                if (this.B) {
                    this.B = false;
                } else {
                    gha scheduledMessagesButtonState = getScheduledMessagesButtonState();
                    scheduledMessagesButtonState.getClass();
                    if (scheduledMessagesButtonState != gha.b && scheduledMessagesButtonState != gha.c) {
                        eigVar = eig.a;
                    }
                }
            }
            gigVar.setExpandableState(eigVar);
        }
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        String[] strArrF = i7j.f(this);
        if (strArrF == null || editorInfo == null) {
            return inputConnectionOnCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArrF;
        return c4m.c(this, inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        setOnTouchListener(null);
        setLeftInnerIconTouchListener(null);
        setOnTouchInputListener(null);
        setRightInnerIconTouchListener(null);
        setRightOuterIconTouchListener(null);
        setScheduledMessagesTouchListener(null);
        setVideoMessageTouchListener(null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && Build.VERSION.SDK_INT >= 29) {
            getGestureExclusionRects().clear();
            ImageView imageView = this.k;
            int iB = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, imageView.getLeft());
            int iB2 = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, imageView.getTop());
            int iB3 = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, imageView.getRight());
            int iB4 = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, imageView.getBottom());
            Rect rect = this.n1;
            rect.set(iB, iB2, iB3, iB4);
            getGestureExclusionRects().add(rect);
            setSystemGestureExclusionRects(getGestureExclusionRects());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        TouchDelegate touchDelegate = getTouchDelegate();
        h84 h84Var = touchDelegate instanceof h84 ? (h84) touchDelegate : null;
        if (h84Var != null) {
            h84Var.a.clear();
        }
        col.a(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), this, this.b);
        col.a(0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), this, this.f);
        col.a(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), this, this.k);
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            col.a(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), this, (ImageView) ny8Var.getValue());
        }
        ny8 ny8Var2 = this.l;
        if (ny8Var2.d()) {
            col.a(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), this, (ImageView) ny8Var2.getValue());
        }
        ny8 ny8Var3 = this.m;
        if (ny8Var3.d()) {
            col.a(gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), this, (ImageView) ny8Var3.getValue());
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Paint paint;
        Paint paint2;
        zv8 zv8Var = p1[2];
        if (((Boolean) this.C.b).booleanValue()) {
            setBackgroundColor(0);
        } else {
            setBackgroundColor(getCurrentTheme().k().b);
        }
        this.b.setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().c));
        int i = getCurrentTheme().getText().b;
        pha phaVar = this.f;
        phaVar.setTextColor(i);
        phaVar.setHintTextColor(lvb.I0(getCurrentTheme().getText().e, 0.4f));
        Drawable drawableR = np4.r(phaVar);
        GradientDrawable gradientDrawable = drawableR instanceof GradientDrawable ? (GradientDrawable) drawableR : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(getCurrentTheme().getText().h));
        }
        kbc currentTheme = getCurrentTheme();
        Editable text = phaVar.getText();
        if (text != null) {
            for (Object obj : text.getSpans(0, text.length(), Object.class)) {
                if (obj instanceof fga) {
                    ((fga) obj).b = ((xac) currentTheme.f().a).b.a;
                } else if (obj instanceof k59) {
                    ((k59) obj).a = currentTheme.getText().h;
                } else if (obj instanceof n59) {
                    ((n59) obj).b = currentTheme.getText().h;
                } else if (obj instanceof eph) {
                    ((eph) obj).onThemeChanged(currentTheme);
                }
            }
        }
        f55.f(phaVar, getCurrentTheme());
        int[] iArr = {android.R.attr.state_enabled};
        qjg qjgVar = this.j;
        Drawable drawableB = jrl.b(qjgVar, iArr);
        ShapeDrawable shapeDrawable = drawableB instanceof ShapeDrawable ? (ShapeDrawable) drawableB : null;
        if (shapeDrawable != null && (paint2 = shapeDrawable.getPaint()) != null) {
            paint2.setColor(getCurrentTheme().h().a);
        }
        Drawable drawableB2 = jrl.b(qjgVar, new int[]{-16842910});
        ShapeDrawable shapeDrawable2 = drawableB2 instanceof ShapeDrawable ? (ShapeDrawable) drawableB2 : null;
        if (shapeDrawable2 != null && (paint = shapeDrawable2.getPaint()) != null) {
            paint.setColor(-16776961);
        }
        p(getCurrentTheme());
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            ((ImageView) ny8Var.getValue()).setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().c));
        }
        invalidate();
    }

    public final void p(kbc kbcVar) {
        eha ehaVar;
        nha nhaVar = this.E;
        boolean zJ = j();
        mha mhaVar = mha.a;
        gha ghaVar = gha.a;
        ImageView imageView = this.k;
        if (zJ && cqk.d(nhaVar, mhaVar)) {
            sb8.m0(((bs0) kbcVar.u().d.g).c, getCheckDrawable());
            imageView.setPadding(0, 0, 0, 0);
            imageView.setImageDrawable(getCheckIcon());
            imageView.setEnabled(false);
            setVideoMsgButtonVisible(false);
            k(ghaVar);
        } else {
            boolean zD = cqk.d(nhaVar, lha.a);
            qjg qjgVar = this.j;
            if (zD || cqk.d(nhaVar, mhaVar)) {
                qjgVar.setState(new int[]{android.R.attr.state_enabled});
                imageView.setPadding(0, 0, 0, 0);
                Drawable checkDrawable = getCheckDrawable();
                kbcVar.getIcon();
                sb8.m0(-1, checkDrawable);
                imageView.setImageDrawable(getCheckIcon());
                imageView.setEnabled(true);
                imageView.setVisibility(0);
                setVideoMsgButtonVisible(false);
                k(ghaVar);
            } else if (j() && (ehaVar = this.w) != eha.a) {
                Drawable emojiArrowDownDrawable = ehaVar == eha.b ? getEmojiArrowDownDrawable() : getEmojiArrowUpDrawable();
                imageView.setImageDrawable(emojiArrowDownDrawable);
                sb8.m0(kbcVar.getIcon().c, emojiArrowDownDrawable);
                setVideoMsgButtonVisible(false);
                k(ghaVar);
            } else if (j() && (nhaVar instanceof iha)) {
                dha dhaVar = ((iha) nhaVar).a;
                if (dhaVar.equals(bha.a)) {
                    sb8.m0(kbcVar.getIcon().c, getMicIcon());
                    if (imageView.getDrawable() != getMicIcon()) {
                        imageView.setImageDrawable(getMicIcon());
                        imageView.setEnabled(true);
                        x05.j(4.0f, yl5.d().getDisplayMetrics().density, imageView);
                    }
                } else {
                    if (!(dhaVar instanceof cha)) {
                        ore.o();
                        return;
                    }
                    if (((cha) dhaVar).a) {
                        sb8.m0(((xac) kbcVar.f().a).c.d, getLikeFilledReactIcon());
                        if (imageView.getDrawable() == getLikeFilledReactIcon()) {
                            return;
                        } else {
                            imageView.setImageDrawable(getLikeFilledReactIcon());
                        }
                    } else {
                        sb8.m0(kbcVar.getIcon().c, getLikeReactIcon());
                        if (imageView.getDrawable() == getLikeReactIcon()) {
                            return;
                        } else {
                            imageView.setImageDrawable(getLikeReactIcon());
                        }
                    }
                    imageView.setEnabled(true);
                    x05.j(4.0f, yl5.d().getDisplayMetrics().density, imageView);
                }
                imageView.setVisibility(0);
                ny8 ny8Var = this.l;
                if (ny8Var.d()) {
                    zv8 zv8Var = p1[0];
                    setVideoMsgButtonVisible(((Boolean) this.y.b).booleanValue());
                }
                ny8 ny8Var2 = this.m;
                if (ny8Var2.d()) {
                    k(getScheduledMessagesButtonState());
                }
            } else if (j() && getShowSendOnlyWhenHasText() && cqk.d(nhaVar, jha.a)) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                if (imageView.getDrawable() != getSendIcon()) {
                    qjgVar.setState(new int[]{android.R.attr.state_enabled});
                    imageView.setImageDrawable(getSendIcon());
                    imageView.setPadding(0, 0, 0, 0);
                    imageView.setEnabled(true);
                }
                Drawable arrowDrawable = getArrowDrawable();
                kbcVar.getIcon();
                sb8.m0(-1, arrowDrawable);
                setVideoMsgButtonVisible(false);
                k(ghaVar);
            }
        }
        o();
        imageView.invalidate();
    }

    public final int q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        pha phaVar = this.f;
        return marginLayoutParams.topMargin + (view.equals(phaVar) ? phaVar.getLineHeight() : view.getLayoutParams().height) + marginLayoutParams.bottomMargin;
    }

    public final void setCustomSelectionActionModeCallback(cf7 cf7Var) {
        pha phaVar = this.f;
        phaVar.setCustomSelectionActionModeCallback((ActionMode.Callback) cf7Var.invoke(phaVar));
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.A = kbcVar;
        onThemeChanged(getCurrentTheme());
    }

    public final void setDisallowParentInterceptTouchEvent(boolean z) {
        this.D.B(this, p1[3], Boolean.valueOf(z));
    }

    public final void setEmojiExpandableState(eha ehaVar) {
        this.w = ehaVar;
        p(getCurrentTheme());
    }

    public final void setInputEnabled(boolean z) {
        pha phaVar = this.f;
        if (z) {
            phaVar.setFilters(new InputFilter[0]);
        } else {
            phaVar.setFilters(new InputFilter[]{getEmptyFilter()});
        }
    }

    public final void setInputHint(CharSequence charSequence) {
        this.f.setHint(charSequence);
    }

    public final void setInputKeyListener(View.OnKeyListener onKeyListener) {
        this.f.setOnKeyListener(onKeyListener);
    }

    public final void setKeyboardVisible(boolean z) {
        this.x = z;
        o();
    }

    public final void setLeftIcon(int i) {
        this.b.setImageResource(i);
    }

    public final void setLeftInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    public final void setLeftInnerIconVisible(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    public final void setLeftOuterIconOnClickListener(af7 af7Var) {
        qe7.H((View) this.i.getValue(), 300L, new d8(9, af7Var));
    }

    public final void setLeftOuterIconText(CharSequence charSequence) {
        ny8 ny8Var = this.i;
        yab.e(this, (View) ny8Var.getValue(), 0);
        ((gig) ny8Var.getValue()).setText(charSequence);
    }

    public final void setLeftOuterIconVisible(boolean z) {
        ny8 ny8Var = this.i;
        if (z) {
            yab.e(this, (View) ny8Var.getValue(), 0);
        } else if (ny8Var.d()) {
            removeView((View) ny8Var.getValue());
        }
    }

    public final void setOnTouchInputListener(fha fhaVar) {
        this.e = fhaVar;
    }

    public final void setRightInnerIconTouchListener(View.OnTouchListener onTouchListener) {
        ny8 ny8Var = this.h;
        if (onTouchListener != null) {
            ((ImageView) ny8Var.getValue()).setOnTouchListener(onTouchListener);
        } else if (ny8Var.d()) {
            ((ImageView) ny8Var.getValue()).setOnTouchListener(null);
        }
    }

    public final void setRightInnerIconVisible(boolean z) {
        ny8 ny8Var = this.h;
        if (!z) {
            if (ny8Var.d()) {
                removeView((View) ny8Var.getValue());
            }
        } else {
            yab.e(this, (View) ny8Var.getValue(), Integer.valueOf(indexOfChild(this.f) + 1));
            if (ny8Var.d()) {
                ((ImageView) ny8Var.getValue()).setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().c));
            }
        }
    }

    public final void setRightOuterIconActionState(nha nhaVar) {
        setSendActionState(nhaVar);
    }

    public final void setRightOuterIconEnabled(boolean z) {
        this.k.setEnabled(z);
    }

    public final void setRightOuterIconTouchListener(View.OnTouchListener onTouchListener) {
        this.k.setOnTouchListener(onTouchListener);
    }

    public final void setScheduledMessagesButtonState(gha ghaVar) {
        this.z.B(this, p1[1], ghaVar);
    }

    public final void setScheduledMessagesTouchListener(View.OnTouchListener onTouchListener) {
        ny8 ny8Var = this.m;
        if (onTouchListener != null) {
            ((ImageView) ny8Var.getValue()).setOnTouchListener(onTouchListener);
        } else if (ny8Var.d()) {
            ((ImageView) ny8Var.getValue()).setOnTouchListener(null);
        }
    }

    public final void setSelection(int i) {
        if (i >= 0) {
            pha phaVar = this.f;
            if (i <= phaVar.length()) {
                phaVar.setSelection(i);
            }
        }
    }

    public final void setSendIconResId(int i) {
        this.c = i;
    }

    public final void setShowSendOnlyWhenHasText(boolean z) {
        this.F.B(this, p1[4], Boolean.valueOf(z));
    }

    public final void setShowSoftInputOnFocus(boolean z) {
        pha phaVar = this.f;
        phaVar.setShowSoftInputOnFocus(z);
        if (z) {
            return;
        }
        phaVar.clearFocus();
    }

    public final void setText(CharSequence charSequence) {
        pha phaVar = this.f;
        if (charSequence == null) {
            Editable text = phaVar.getText();
            if (text != null) {
                text.clear();
                return;
            }
            return;
        }
        Editable spannableStringBuilder = charSequence instanceof Editable ? (Editable) charSequence : null;
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        for (y2e y2eVar : (y2e[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y2e.class)) {
            y2eVar.a.c = (xac) getCurrentTheme().f().b;
            x2e x2eVar = y2eVar.a;
            x2eVar.getClass();
            x2eVar.f = new w2e(0, new WeakReference(phaVar));
        }
        phaVar.setText(spannableStringBuilder);
    }

    public final void setTextSelectionListener(oha ohaVar) {
        this.d = ohaVar;
    }

    public final void setTransparent(boolean z) {
        this.C.B(this, p1[2], Boolean.valueOf(z));
    }

    public final void setVideoMessageEnabled(boolean z) {
        this.y.B(this, p1[0], Boolean.valueOf(z));
    }

    public final void setVideoMessageTouchListener(View.OnTouchListener onTouchListener) {
        ny8 ny8Var = this.l;
        if (onTouchListener != null) {
            ((ImageView) ny8Var.getValue()).setOnTouchListener(onTouchListener);
        } else if (ny8Var.d()) {
            ((ImageView) ny8Var.getValue()).setOnTouchListener(null);
        }
    }

    public final void setInputHint(int i) {
        this.f.setHint(i);
    }
}
