package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class r12 extends wf4 implements zr4 {
    public final cyb A;
    public final e22 B;
    public q12 s;
    public boolean t;
    public md1 u;
    public final atf v;
    public final GestureDetector w;
    public final cs x;
    public final AppCompatTextView y;
    public final AppCompatTextView z;

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
    public r12(Context context) {
        super(context, null);
        a8g a8gVar = pq3.j;
        setBackgroundColor(a8gVar.l(this).b.b().c);
        o7j.f(yl5.d().getDisplayMetrics().density * 16.0f, this);
        final int i = 0;
        lvb.H(this, new oi8(0, 0, 0, new j11(5, 2, false), 7), null);
        int i2 = 4;
        this.w = new GestureDetector(context, new pi9(i2, this));
        e22 e22Var = new e22(context);
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        frameLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, R.drawable.ic_shield_24);
        kbc kbcVar = a8gVar.e(context).j().b;
        lvb.A0(enhancedAnimatedVectorDrawable, "dot", kbcVar.h().b);
        lvb.A0(enhancedAnimatedVectorDrawable, "line", kbcVar.h().b);
        lvb.A0(enhancedAnimatedVectorDrawable, "shield", kbcVar.getIcon().k);
        imageView.setImageDrawable(enhancedAnimatedVectorDrawable);
        frameLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setText(R.string.call_share_warning_text_hint);
        textView.setTextColor(a8gVar.e(context).j().b.getText().k);
        q9i.a(q9i.g, textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        e22Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        e22Var.setOrientation(0);
        e22Var.setBackgroundColor(a8gVar.e(context).j().b.h().b);
        e22Var.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
        final int i3 = 1;
        e22Var.setClipToOutline(true);
        e22Var.setGravity(16);
        e22Var.addView(frameLayout);
        e22Var.addView(textView);
        e22Var.setId(R.id.call_share_screen_warning_view);
        e22Var.setLayoutParams(new uf4(0, -2));
        this.B = e22Var;
        cs csVar = new cs(context);
        csVar.setId(R.id.call_ic_share_view);
        csVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
        csVar.setImageResource(R.drawable.icon_share_screen_fill);
        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.l(csVar).b.getIcon().b));
        this.x = csVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.call_share_screen_title_view);
        appCompatTextView.setLayoutParams(new uf4(-1, -2));
        appCompatTextView.setGravity(17);
        q9i.a(q9i.c, appCompatTextView);
        appCompatTextView.setTextColor(a8gVar.l(appCompatTextView).b.getText().b);
        this.y = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.call_share_screen_subtitle_view);
        appCompatTextView2.setLayoutParams(new uf4(-1, -2));
        appCompatTextView2.setGravity(17);
        q9i.a(q9i.i, appCompatTextView2);
        appCompatTextView2.setTextColor(a8gVar.l(appCompatTextView2).b.getText().d);
        appCompatTextView2.setText(R.string.call_item_share_screen_mode_description);
        this.z = appCompatTextView2;
        cyb cybVar = new cyb(context);
        cybVar.setId(R.id.call_share_screen_stop_share_btn);
        cybVar.setLayoutParams(new uf4(-2, -2));
        cybVar.setSize(ayb.h);
        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
        cybVar.setAppearance(zxb.PRIMARY_CONTRAST);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.call_item_share_screen_mode_button_share_stop));
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: p12
            public final /* synthetic */ r12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                r12 r12Var = this.b;
                switch (i4) {
                    case 0:
                        q12 q12Var = r12Var.s;
                        if (q12Var != null) {
                            CallScreen callScreen = ((nx1) q12Var).a;
                            l6m l6mVar = CallScreen.D1;
                            callScreen.R1().Q(false, null);
                        }
                        break;
                    default:
                        q12 q12Var2 = r12Var.s;
                        if (q12Var2 != null) {
                            boolean z = !r12Var.t;
                            CallScreen callScreen2 = ((nx1) q12Var2).a;
                            l6m l6mVar2 = CallScreen.D1;
                            callScreen2.R1().e.e.a(z);
                        }
                        break;
                }
            }
        });
        this.A = cybVar;
        atf atfVar = new atf(context);
        atfVar.setId(R.id.call_share_sound_switch);
        atfVar.setStartView(aql.a(R.drawable.ic_share_sound_22));
        atfVar.setTitle(new tnh(R.string.call_context_dialog_share_sound));
        atfVar.setType(osf.b);
        atfVar.setEndView(new ksf(this.t, true));
        atfVar.setOnSwitchCheckedListener(new s81(i2, this));
        float[] fArr = new float[8];
        for (int i4 = 0; i4 < 8; i4++) {
            fArr[i4] = yl5.d().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(a8gVar.l(atfVar).b.h().b);
        atfVar.setBackground(shapeDrawable);
        atfVar.setThemeDepended(usf.b);
        qe7.H(atfVar, 300L, new View.OnClickListener(this) { // from class: p12
            public final /* synthetic */ r12 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i3;
                r12 r12Var = this.b;
                switch (i5) {
                    case 0:
                        q12 q12Var = r12Var.s;
                        if (q12Var != null) {
                            CallScreen callScreen = ((nx1) q12Var).a;
                            l6m l6mVar = CallScreen.D1;
                            callScreen.R1().Q(false, null);
                        }
                        break;
                    default:
                        q12 q12Var2 = r12Var.s;
                        if (q12Var2 != null) {
                            boolean z = !r12Var.t;
                            CallScreen callScreen2 = ((nx1) q12Var2).a;
                            l6m l6mVar2 = CallScreen.D1;
                            callScreen2.R1().e.e.a(z);
                        }
                        break;
                }
            }
        });
        this.v = atfVar;
        addView(this.B);
        addView(this.x);
        addView(this.y);
        addView(this.z);
        addView(this.A);
        addView(atfVar);
        eg4 eg4VarH = ch3.h(this);
        int id = this.B.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id));
        eg4VarH.d(id, 7, 0, 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id));
        int id2 = this.x.getId();
        eg4VarH.d(id2, 3, 0, 3);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 4, this.y.getId(), 3);
        eg4VarH.g(id2).d.W = 2;
        int id3 = this.z.getId();
        eg4VarH.d(id3, 3, this.y.getId(), 4);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id3));
        eg4VarH.d(id3, 4, this.A.getId(), 3);
        new bsb(4, eg4VarH, id3).a(gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id3).d.l0 = true;
        int id4 = atfVar.getId();
        eg4VarH.d(id4, 6, 0, 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id4));
        eg4VarH.d(id4, 4, 0, 4);
        new bsb(4, eg4VarH, id4).a(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        u(eg4VarH, getContext().getResources().getConfiguration().orientation == 1);
        eg4VarH.a(this);
        i3 = getContext().getResources().getConfiguration().orientation != 1 ? 0 : 1;
        this.x.setVisibility(i3 != 0 ? 0 : 8);
        atfVar.setVisibility(i3 == 0 ? 8 : 0);
    }

    @Override // defpackage.zr4
    public final void A(yr4 yr4Var) {
        if (!p90.F(this)) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), yr4Var.a);
        }
    }

    @Override // defpackage.zr4
    public final void G(yr4 yr4Var) {
        e22 e22Var = this.B;
        ViewGroup.LayoutParams layoutParams = e22Var.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        uf4 uf4Var = (uf4) layoutParams;
        boolean zF = p90.F(this);
        int i = yr4Var.a;
        if (zF) {
            i += yr4Var.b;
        }
        ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, i);
        e22Var.setLayoutParams(uf4Var);
    }

    @Override // defpackage.zr4
    public final List J(xr4 xr4Var, xr4 xr4Var2) {
        return r66.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 7);
        context.registerComponentCallbacks(md1Var);
        this.u = md1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        md1 md1Var = this.u;
        if (md1Var != null) {
            getContext().unregisterComponentCallbacks(md1Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.w.onTouchEvent(motionEvent);
    }

    public final void setControlsMediator(as4 as4Var) {
        if (as4Var != null) {
            es4 es4Var = (es4) as4Var;
            G(es4Var.j);
            A(es4Var.k);
        }
    }

    public final void setListener(q12 q12Var) {
        this.s = q12Var;
    }

    public final void setTitle(ynh ynhVar) {
        this.y.setText(ynhVar.b(getContext()));
    }

    public final void u(eg4 eg4Var, boolean z) {
        float f;
        float f2;
        int id = this.A.getId();
        AppCompatTextView appCompatTextView = this.z;
        eg4Var.d(id, 3, appCompatTextView.getId(), 4);
        bsb bsbVar = new bsb(3, eg4Var, id);
        if (z) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 24.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 12.0f;
        }
        bsbVar.a(gm0.K(f2 * f));
        eg4Var.d(id, 6, 0, 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4Var, id));
        eg4Var.d(id, 7, 0, 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4Var, id));
        eg4Var.d(id, 4, 0, 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4Var, id));
        int id2 = this.y.getId();
        qf4 qf4Var = new qf4(eg4Var, id2);
        if (z) {
            qt4.w(16.0f, yl5.d().getDisplayMetrics().density, qf4Var.p(this.x.getId()));
        } else {
            qf4Var.p(this.B.getId()).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
            qf4Var.r();
            eg4Var.g(id2).d.x = 0.0f;
        }
        qf4Var.f(0).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        qf4Var.o(0).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        qf4Var.b(appCompatTextView.getId());
        qf4Var.d();
    }
}
