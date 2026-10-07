package one.me.sdk.messagewrite.mention;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.af7;
import defpackage.b3;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.cs;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ecd;
import defpackage.eg4;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ib;
import defpackage.j11;
import defpackage.j8e;
import defpackage.j8g;
import defpackage.j95;
import defpackage.kbc;
import defpackage.l96;
import defpackage.lq4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nff;
import defpackage.nt4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.pq3;
import defpackage.qt4;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.t9h;
import defpackage.v0k;
import defpackage.vv;
import defpackage.vzc;
import defpackage.wf4;
import defpackage.x9h;
import defpackage.xbd;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/messagewrite/mention/SuggestionsWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "forceDarkTheme", "(Lt3f;Z)V", "message-write-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SuggestionsWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ zv8[] F = {new z8b(SuggestionsWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;"), zo5.f(zfe.a, SuggestionsWidget.class, "forceDarkTheme", "getForceDarkTheme()Z", 0), new dwd(SuggestionsWidget.class, "suggestionsContainer", "getSuggestionsContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new dwd(SuggestionsWidget.class, "dragView", "getDragView()Landroid/widget/FrameLayout;", 0), new dwd(SuggestionsWidget.class, "separatorView", "getSeparatorView()Landroid/view/View;", 0), new dwd(SuggestionsWidget.class, "suggestionsRecyclerView", "getSuggestionsRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), new dwd(SuggestionsWidget.class, "closeView", "getCloseView()Landroidx/appcompat/widget/AppCompatImageView;", 0), new dwd(SuggestionsWidget.class, "titleView", "getTitleView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new dwd(SuggestionsWidget.class, "closePanelView", "getClosePanelView()Landroid/widget/FrameLayout;", 0), new dwd(SuggestionsWidget.class, "notFoundView", "getNotFoundView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    public float A;
    public float B;
    public float C;
    public boolean D;
    public boolean E;
    public final vv m;
    public final v0k n;
    public final ny8 o;
    public final j8e p;
    public final ny8 q;
    public final ow0 r;
    public final j8e s;
    public final ow0 t;
    public final ow0 u;
    public final ow0 v;
    public final ow0 w;
    public final ow0 x;
    public final nt4 y;
    public float z;

    public SuggestionsWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        this.m = new vv("arg:force_dark_theme", Boolean.class);
        this.n = new v0k(m35getAccountScopeuqN4xOY());
        final int i = 0;
        zv8 zv8Var = F[0];
        this.o = getSharedViewModel((t3f) vvVar.a(this), x9h.class, null);
        this.p = viewBinding(R.id.writebar__suggestion_popup_layout_content);
        final int i2 = 3;
        this.q = rx8.P(3, new af7(this) { // from class: z9h
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                a8g a8gVar = pq3.j;
                int i4 = 0;
                lq4 lq4Var = null;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = SuggestionsWidget.F;
                        vv vvVar2 = suggestionsWidget.m;
                        zv8 zv8Var2 = SuggestionsWidget.F[1];
                        return new t9h(suggestionsWidget, ((Boolean) vvVar2.a(suggestionsWidget)).booleanValue(), ((a2c) suggestionsWidget.n.getAccessor().d(27).getValue()).c());
                    case 1:
                        zv8[] zv8VarArr2 = SuggestionsWidget.F;
                        FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(R.id.writebar__suggestion_popup_drag_layout);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 14), frameLayout);
                        return frameLayout;
                    case 2:
                        zv8[] zv8VarArr3 = SuggestionsWidget.F;
                        l96 l96Var = new l96(suggestionsWidget.getContext());
                        l96Var.setId(R.id.writebar__suggestion_popup_layout_list);
                        l96Var.setClipToPadding(false);
                        l96Var.setLayoutParams(new uf4(-1, -2));
                        l96Var.getContext();
                        l96Var.setLayoutManager(new LinearLayoutManager());
                        l96Var.setPager(new gl1(suggestionsWidget, 13));
                        l96Var.setThreshold(3);
                        return l96Var;
                    case 3:
                        zv8[] zv8VarArr4 = SuggestionsWidget.F;
                        cs csVar = new cs(suggestionsWidget.getContext());
                        csVar.setId(R.id.writebar__suggestion_close_button);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        csVar.setLayoutParams(layoutParams2);
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        csVar.setImageResource(R.drawable.icon_cross);
                        kbc kbcVarT1 = suggestionsWidget.t1();
                        if (kbcVarT1 == null) {
                            kbcVarT1 = a8gVar.h(csVar);
                        }
                        csVar.setImageTintList(ColorStateList.valueOf(kbcVarT1.getIcon().b));
                        qe7.H(csVar, 300L, new aah(i4, suggestionsWidget));
                        kbc kbcVarT2 = suggestionsWidget.t1();
                        if (kbcVarT2 == null) {
                            kbcVarT2 = a8gVar.h(csVar);
                        }
                        int i5 = ((bs0) kbcVarT2.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i5, null, shapeDrawable));
                        return csVar;
                    case 4:
                        zv8[] zv8VarArr5 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView.setId(R.id.writebar__suggestion_title);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        q9i.a(q9i.c, appCompatTextView);
                        appCompatTextView.setGravity(17);
                        kbc kbcVarT3 = suggestionsWidget.t1();
                        if (kbcVarT3 == null) {
                            kbcVarT3 = a8gVar.h(appCompatTextView);
                        }
                        appCompatTextView.setTextColor(kbcVarT3.getText().b);
                        appCompatTextView.setText(R.string.writebar_mentions_title);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        zv8[] zv8VarArr6 = SuggestionsWidget.F;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(R.id.writebar__suggestion_close_panel);
                        frameLayout2.addView(suggestionsWidget.E1());
                        ow0 ow0Var = suggestionsWidget.v;
                        zv8 zv8Var3 = SuggestionsWidget.F[7];
                        frameLayout2.addView((AppCompatTextView) ow0Var.getValue());
                        lvb.I(frameLayout2);
                        return frameLayout2;
                    default:
                        zv8[] zv8VarArr7 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView2.setId(R.id.writebar__suggestion_not_found);
                        appCompatTextView2.setLayoutParams(new uf4(-2, -2));
                        q9i.a(q9i.i, appCompatTextView2);
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 15), appCompatTextView2);
                        appCompatTextView2.setText(R.string.writebar_mentions_not_found);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        appCompatTextView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0);
                        lvb.I(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i3 = 1;
        this.r = binding(new af7(this) { // from class: z9h
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                a8g a8gVar = pq3.j;
                int i5 = 0;
                lq4 lq4Var = null;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = SuggestionsWidget.F;
                        vv vvVar2 = suggestionsWidget.m;
                        zv8 zv8Var2 = SuggestionsWidget.F[1];
                        return new t9h(suggestionsWidget, ((Boolean) vvVar2.a(suggestionsWidget)).booleanValue(), ((a2c) suggestionsWidget.n.getAccessor().d(27).getValue()).c());
                    case 1:
                        zv8[] zv8VarArr2 = SuggestionsWidget.F;
                        FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(R.id.writebar__suggestion_popup_drag_layout);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 14), frameLayout);
                        return frameLayout;
                    case 2:
                        zv8[] zv8VarArr3 = SuggestionsWidget.F;
                        l96 l96Var = new l96(suggestionsWidget.getContext());
                        l96Var.setId(R.id.writebar__suggestion_popup_layout_list);
                        l96Var.setClipToPadding(false);
                        l96Var.setLayoutParams(new uf4(-1, -2));
                        l96Var.getContext();
                        l96Var.setLayoutManager(new LinearLayoutManager());
                        l96Var.setPager(new gl1(suggestionsWidget, 13));
                        l96Var.setThreshold(3);
                        return l96Var;
                    case 3:
                        zv8[] zv8VarArr4 = SuggestionsWidget.F;
                        cs csVar = new cs(suggestionsWidget.getContext());
                        csVar.setId(R.id.writebar__suggestion_close_button);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        csVar.setLayoutParams(layoutParams2);
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        csVar.setImageResource(R.drawable.icon_cross);
                        kbc kbcVarT1 = suggestionsWidget.t1();
                        if (kbcVarT1 == null) {
                            kbcVarT1 = a8gVar.h(csVar);
                        }
                        csVar.setImageTintList(ColorStateList.valueOf(kbcVarT1.getIcon().b));
                        qe7.H(csVar, 300L, new aah(i5, suggestionsWidget));
                        kbc kbcVarT2 = suggestionsWidget.t1();
                        if (kbcVarT2 == null) {
                            kbcVarT2 = a8gVar.h(csVar);
                        }
                        int i6 = ((bs0) kbcVarT2.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i6, null, shapeDrawable));
                        return csVar;
                    case 4:
                        zv8[] zv8VarArr5 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView.setId(R.id.writebar__suggestion_title);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        q9i.a(q9i.c, appCompatTextView);
                        appCompatTextView.setGravity(17);
                        kbc kbcVarT3 = suggestionsWidget.t1();
                        if (kbcVarT3 == null) {
                            kbcVarT3 = a8gVar.h(appCompatTextView);
                        }
                        appCompatTextView.setTextColor(kbcVarT3.getText().b);
                        appCompatTextView.setText(R.string.writebar_mentions_title);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        zv8[] zv8VarArr6 = SuggestionsWidget.F;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(R.id.writebar__suggestion_close_panel);
                        frameLayout2.addView(suggestionsWidget.E1());
                        ow0 ow0Var = suggestionsWidget.v;
                        zv8 zv8Var3 = SuggestionsWidget.F[7];
                        frameLayout2.addView((AppCompatTextView) ow0Var.getValue());
                        lvb.I(frameLayout2);
                        return frameLayout2;
                    default:
                        zv8[] zv8VarArr7 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView2.setId(R.id.writebar__suggestion_not_found);
                        appCompatTextView2.setLayoutParams(new uf4(-2, -2));
                        q9i.a(q9i.i, appCompatTextView2);
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 15), appCompatTextView2);
                        appCompatTextView2.setText(R.string.writebar_mentions_not_found);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        appCompatTextView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0);
                        lvb.I(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        this.s = viewBinding(R.id.writebar__suggestion_popup_separator);
        final int i4 = 2;
        this.t = binding(new af7(this) { // from class: z9h
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                a8g a8gVar = pq3.j;
                int i6 = 0;
                lq4 lq4Var = null;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = SuggestionsWidget.F;
                        vv vvVar2 = suggestionsWidget.m;
                        zv8 zv8Var2 = SuggestionsWidget.F[1];
                        return new t9h(suggestionsWidget, ((Boolean) vvVar2.a(suggestionsWidget)).booleanValue(), ((a2c) suggestionsWidget.n.getAccessor().d(27).getValue()).c());
                    case 1:
                        zv8[] zv8VarArr2 = SuggestionsWidget.F;
                        FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(R.id.writebar__suggestion_popup_drag_layout);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 14), frameLayout);
                        return frameLayout;
                    case 2:
                        zv8[] zv8VarArr3 = SuggestionsWidget.F;
                        l96 l96Var = new l96(suggestionsWidget.getContext());
                        l96Var.setId(R.id.writebar__suggestion_popup_layout_list);
                        l96Var.setClipToPadding(false);
                        l96Var.setLayoutParams(new uf4(-1, -2));
                        l96Var.getContext();
                        l96Var.setLayoutManager(new LinearLayoutManager());
                        l96Var.setPager(new gl1(suggestionsWidget, 13));
                        l96Var.setThreshold(3);
                        return l96Var;
                    case 3:
                        zv8[] zv8VarArr4 = SuggestionsWidget.F;
                        cs csVar = new cs(suggestionsWidget.getContext());
                        csVar.setId(R.id.writebar__suggestion_close_button);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        csVar.setLayoutParams(layoutParams2);
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        csVar.setImageResource(R.drawable.icon_cross);
                        kbc kbcVarT1 = suggestionsWidget.t1();
                        if (kbcVarT1 == null) {
                            kbcVarT1 = a8gVar.h(csVar);
                        }
                        csVar.setImageTintList(ColorStateList.valueOf(kbcVarT1.getIcon().b));
                        qe7.H(csVar, 300L, new aah(i6, suggestionsWidget));
                        kbc kbcVarT2 = suggestionsWidget.t1();
                        if (kbcVarT2 == null) {
                            kbcVarT2 = a8gVar.h(csVar);
                        }
                        int i7 = ((bs0) kbcVarT2.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i7, null, shapeDrawable));
                        return csVar;
                    case 4:
                        zv8[] zv8VarArr5 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView.setId(R.id.writebar__suggestion_title);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        q9i.a(q9i.c, appCompatTextView);
                        appCompatTextView.setGravity(17);
                        kbc kbcVarT3 = suggestionsWidget.t1();
                        if (kbcVarT3 == null) {
                            kbcVarT3 = a8gVar.h(appCompatTextView);
                        }
                        appCompatTextView.setTextColor(kbcVarT3.getText().b);
                        appCompatTextView.setText(R.string.writebar_mentions_title);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        zv8[] zv8VarArr6 = SuggestionsWidget.F;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(R.id.writebar__suggestion_close_panel);
                        frameLayout2.addView(suggestionsWidget.E1());
                        ow0 ow0Var = suggestionsWidget.v;
                        zv8 zv8Var3 = SuggestionsWidget.F[7];
                        frameLayout2.addView((AppCompatTextView) ow0Var.getValue());
                        lvb.I(frameLayout2);
                        return frameLayout2;
                    default:
                        zv8[] zv8VarArr7 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView2.setId(R.id.writebar__suggestion_not_found);
                        appCompatTextView2.setLayoutParams(new uf4(-2, -2));
                        q9i.a(q9i.i, appCompatTextView2);
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 15), appCompatTextView2);
                        appCompatTextView2.setText(R.string.writebar_mentions_not_found);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        appCompatTextView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0);
                        lvb.I(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        this.u = binding(new af7(this) { // from class: z9h
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i2;
                a8g a8gVar = pq3.j;
                int i6 = 0;
                lq4 lq4Var = null;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = SuggestionsWidget.F;
                        vv vvVar2 = suggestionsWidget.m;
                        zv8 zv8Var2 = SuggestionsWidget.F[1];
                        return new t9h(suggestionsWidget, ((Boolean) vvVar2.a(suggestionsWidget)).booleanValue(), ((a2c) suggestionsWidget.n.getAccessor().d(27).getValue()).c());
                    case 1:
                        zv8[] zv8VarArr2 = SuggestionsWidget.F;
                        FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(R.id.writebar__suggestion_popup_drag_layout);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 14), frameLayout);
                        return frameLayout;
                    case 2:
                        zv8[] zv8VarArr3 = SuggestionsWidget.F;
                        l96 l96Var = new l96(suggestionsWidget.getContext());
                        l96Var.setId(R.id.writebar__suggestion_popup_layout_list);
                        l96Var.setClipToPadding(false);
                        l96Var.setLayoutParams(new uf4(-1, -2));
                        l96Var.getContext();
                        l96Var.setLayoutManager(new LinearLayoutManager());
                        l96Var.setPager(new gl1(suggestionsWidget, 13));
                        l96Var.setThreshold(3);
                        return l96Var;
                    case 3:
                        zv8[] zv8VarArr4 = SuggestionsWidget.F;
                        cs csVar = new cs(suggestionsWidget.getContext());
                        csVar.setId(R.id.writebar__suggestion_close_button);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        csVar.setLayoutParams(layoutParams2);
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        csVar.setImageResource(R.drawable.icon_cross);
                        kbc kbcVarT1 = suggestionsWidget.t1();
                        if (kbcVarT1 == null) {
                            kbcVarT1 = a8gVar.h(csVar);
                        }
                        csVar.setImageTintList(ColorStateList.valueOf(kbcVarT1.getIcon().b));
                        qe7.H(csVar, 300L, new aah(i6, suggestionsWidget));
                        kbc kbcVarT2 = suggestionsWidget.t1();
                        if (kbcVarT2 == null) {
                            kbcVarT2 = a8gVar.h(csVar);
                        }
                        int i7 = ((bs0) kbcVarT2.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i7, null, shapeDrawable));
                        return csVar;
                    case 4:
                        zv8[] zv8VarArr5 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView.setId(R.id.writebar__suggestion_title);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        q9i.a(q9i.c, appCompatTextView);
                        appCompatTextView.setGravity(17);
                        kbc kbcVarT3 = suggestionsWidget.t1();
                        if (kbcVarT3 == null) {
                            kbcVarT3 = a8gVar.h(appCompatTextView);
                        }
                        appCompatTextView.setTextColor(kbcVarT3.getText().b);
                        appCompatTextView.setText(R.string.writebar_mentions_title);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        zv8[] zv8VarArr6 = SuggestionsWidget.F;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(R.id.writebar__suggestion_close_panel);
                        frameLayout2.addView(suggestionsWidget.E1());
                        ow0 ow0Var = suggestionsWidget.v;
                        zv8 zv8Var3 = SuggestionsWidget.F[7];
                        frameLayout2.addView((AppCompatTextView) ow0Var.getValue());
                        lvb.I(frameLayout2);
                        return frameLayout2;
                    default:
                        zv8[] zv8VarArr7 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView2.setId(R.id.writebar__suggestion_not_found);
                        appCompatTextView2.setLayoutParams(new uf4(-2, -2));
                        q9i.a(q9i.i, appCompatTextView2);
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 15), appCompatTextView2);
                        appCompatTextView2.setText(R.string.writebar_mentions_not_found);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        appCompatTextView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0);
                        lvb.I(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i5 = 4;
        this.v = binding(new af7(this) { // from class: z9h
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                a8g a8gVar = pq3.j;
                int i7 = 0;
                lq4 lq4Var = null;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i6) {
                    case 0:
                        zv8[] zv8VarArr = SuggestionsWidget.F;
                        vv vvVar2 = suggestionsWidget.m;
                        zv8 zv8Var2 = SuggestionsWidget.F[1];
                        return new t9h(suggestionsWidget, ((Boolean) vvVar2.a(suggestionsWidget)).booleanValue(), ((a2c) suggestionsWidget.n.getAccessor().d(27).getValue()).c());
                    case 1:
                        zv8[] zv8VarArr2 = SuggestionsWidget.F;
                        FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(R.id.writebar__suggestion_popup_drag_layout);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 14), frameLayout);
                        return frameLayout;
                    case 2:
                        zv8[] zv8VarArr3 = SuggestionsWidget.F;
                        l96 l96Var = new l96(suggestionsWidget.getContext());
                        l96Var.setId(R.id.writebar__suggestion_popup_layout_list);
                        l96Var.setClipToPadding(false);
                        l96Var.setLayoutParams(new uf4(-1, -2));
                        l96Var.getContext();
                        l96Var.setLayoutManager(new LinearLayoutManager());
                        l96Var.setPager(new gl1(suggestionsWidget, 13));
                        l96Var.setThreshold(3);
                        return l96Var;
                    case 3:
                        zv8[] zv8VarArr4 = SuggestionsWidget.F;
                        cs csVar = new cs(suggestionsWidget.getContext());
                        csVar.setId(R.id.writebar__suggestion_close_button);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        csVar.setLayoutParams(layoutParams2);
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        csVar.setImageResource(R.drawable.icon_cross);
                        kbc kbcVarT1 = suggestionsWidget.t1();
                        if (kbcVarT1 == null) {
                            kbcVarT1 = a8gVar.h(csVar);
                        }
                        csVar.setImageTintList(ColorStateList.valueOf(kbcVarT1.getIcon().b));
                        qe7.H(csVar, 300L, new aah(i7, suggestionsWidget));
                        kbc kbcVarT2 = suggestionsWidget.t1();
                        if (kbcVarT2 == null) {
                            kbcVarT2 = a8gVar.h(csVar);
                        }
                        int i8 = ((bs0) kbcVarT2.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i8, null, shapeDrawable));
                        return csVar;
                    case 4:
                        zv8[] zv8VarArr5 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView.setId(R.id.writebar__suggestion_title);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        q9i.a(q9i.c, appCompatTextView);
                        appCompatTextView.setGravity(17);
                        kbc kbcVarT3 = suggestionsWidget.t1();
                        if (kbcVarT3 == null) {
                            kbcVarT3 = a8gVar.h(appCompatTextView);
                        }
                        appCompatTextView.setTextColor(kbcVarT3.getText().b);
                        appCompatTextView.setText(R.string.writebar_mentions_title);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        zv8[] zv8VarArr6 = SuggestionsWidget.F;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(R.id.writebar__suggestion_close_panel);
                        frameLayout2.addView(suggestionsWidget.E1());
                        ow0 ow0Var = suggestionsWidget.v;
                        zv8 zv8Var3 = SuggestionsWidget.F[7];
                        frameLayout2.addView((AppCompatTextView) ow0Var.getValue());
                        lvb.I(frameLayout2);
                        return frameLayout2;
                    default:
                        zv8[] zv8VarArr7 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView2.setId(R.id.writebar__suggestion_not_found);
                        appCompatTextView2.setLayoutParams(new uf4(-2, -2));
                        q9i.a(q9i.i, appCompatTextView2);
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 15), appCompatTextView2);
                        appCompatTextView2.setText(R.string.writebar_mentions_not_found);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        appCompatTextView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0);
                        lvb.I(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i6 = 5;
        this.w = binding(new af7(this) { // from class: z9h
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                a8g a8gVar = pq3.j;
                int i8 = 0;
                lq4 lq4Var = null;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i7) {
                    case 0:
                        zv8[] zv8VarArr = SuggestionsWidget.F;
                        vv vvVar2 = suggestionsWidget.m;
                        zv8 zv8Var2 = SuggestionsWidget.F[1];
                        return new t9h(suggestionsWidget, ((Boolean) vvVar2.a(suggestionsWidget)).booleanValue(), ((a2c) suggestionsWidget.n.getAccessor().d(27).getValue()).c());
                    case 1:
                        zv8[] zv8VarArr2 = SuggestionsWidget.F;
                        FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(R.id.writebar__suggestion_popup_drag_layout);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 14), frameLayout);
                        return frameLayout;
                    case 2:
                        zv8[] zv8VarArr3 = SuggestionsWidget.F;
                        l96 l96Var = new l96(suggestionsWidget.getContext());
                        l96Var.setId(R.id.writebar__suggestion_popup_layout_list);
                        l96Var.setClipToPadding(false);
                        l96Var.setLayoutParams(new uf4(-1, -2));
                        l96Var.getContext();
                        l96Var.setLayoutManager(new LinearLayoutManager());
                        l96Var.setPager(new gl1(suggestionsWidget, 13));
                        l96Var.setThreshold(3);
                        return l96Var;
                    case 3:
                        zv8[] zv8VarArr4 = SuggestionsWidget.F;
                        cs csVar = new cs(suggestionsWidget.getContext());
                        csVar.setId(R.id.writebar__suggestion_close_button);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        csVar.setLayoutParams(layoutParams2);
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        csVar.setImageResource(R.drawable.icon_cross);
                        kbc kbcVarT1 = suggestionsWidget.t1();
                        if (kbcVarT1 == null) {
                            kbcVarT1 = a8gVar.h(csVar);
                        }
                        csVar.setImageTintList(ColorStateList.valueOf(kbcVarT1.getIcon().b));
                        qe7.H(csVar, 300L, new aah(i8, suggestionsWidget));
                        kbc kbcVarT2 = suggestionsWidget.t1();
                        if (kbcVarT2 == null) {
                            kbcVarT2 = a8gVar.h(csVar);
                        }
                        int i9 = ((bs0) kbcVarT2.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i9, null, shapeDrawable));
                        return csVar;
                    case 4:
                        zv8[] zv8VarArr5 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView.setId(R.id.writebar__suggestion_title);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        q9i.a(q9i.c, appCompatTextView);
                        appCompatTextView.setGravity(17);
                        kbc kbcVarT3 = suggestionsWidget.t1();
                        if (kbcVarT3 == null) {
                            kbcVarT3 = a8gVar.h(appCompatTextView);
                        }
                        appCompatTextView.setTextColor(kbcVarT3.getText().b);
                        appCompatTextView.setText(R.string.writebar_mentions_title);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        zv8[] zv8VarArr6 = SuggestionsWidget.F;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(R.id.writebar__suggestion_close_panel);
                        frameLayout2.addView(suggestionsWidget.E1());
                        ow0 ow0Var = suggestionsWidget.v;
                        zv8 zv8Var3 = SuggestionsWidget.F[7];
                        frameLayout2.addView((AppCompatTextView) ow0Var.getValue());
                        lvb.I(frameLayout2);
                        return frameLayout2;
                    default:
                        zv8[] zv8VarArr7 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView2.setId(R.id.writebar__suggestion_not_found);
                        appCompatTextView2.setLayoutParams(new uf4(-2, -2));
                        q9i.a(q9i.i, appCompatTextView2);
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 15), appCompatTextView2);
                        appCompatTextView2.setText(R.string.writebar_mentions_not_found);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        appCompatTextView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0);
                        lvb.I(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i7 = 6;
        this.x = binding(new af7(this) { // from class: z9h
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                a8g a8gVar = pq3.j;
                int i9 = 0;
                lq4 lq4Var = null;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i8) {
                    case 0:
                        zv8[] zv8VarArr = SuggestionsWidget.F;
                        vv vvVar2 = suggestionsWidget.m;
                        zv8 zv8Var2 = SuggestionsWidget.F[1];
                        return new t9h(suggestionsWidget, ((Boolean) vvVar2.a(suggestionsWidget)).booleanValue(), ((a2c) suggestionsWidget.n.getAccessor().d(27).getValue()).c());
                    case 1:
                        zv8[] zv8VarArr2 = SuggestionsWidget.F;
                        FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(R.id.writebar__suggestion_popup_drag_layout);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(36.0f * yl5.d().getDisplayMetrics().density), gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 40.0f));
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 14), frameLayout);
                        return frameLayout;
                    case 2:
                        zv8[] zv8VarArr3 = SuggestionsWidget.F;
                        l96 l96Var = new l96(suggestionsWidget.getContext());
                        l96Var.setId(R.id.writebar__suggestion_popup_layout_list);
                        l96Var.setClipToPadding(false);
                        l96Var.setLayoutParams(new uf4(-1, -2));
                        l96Var.getContext();
                        l96Var.setLayoutManager(new LinearLayoutManager());
                        l96Var.setPager(new gl1(suggestionsWidget, 13));
                        l96Var.setThreshold(3);
                        return l96Var;
                    case 3:
                        zv8[] zv8VarArr4 = SuggestionsWidget.F;
                        cs csVar = new cs(suggestionsWidget.getContext());
                        csVar.setId(R.id.writebar__suggestion_close_button);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        csVar.setLayoutParams(layoutParams2);
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK, iK, iK, iK);
                        csVar.setImageResource(R.drawable.icon_cross);
                        kbc kbcVarT1 = suggestionsWidget.t1();
                        if (kbcVarT1 == null) {
                            kbcVarT1 = a8gVar.h(csVar);
                        }
                        csVar.setImageTintList(ColorStateList.valueOf(kbcVarT1.getIcon().b));
                        qe7.H(csVar, 300L, new aah(i9, suggestionsWidget));
                        kbc kbcVarT2 = suggestionsWidget.t1();
                        if (kbcVarT2 == null) {
                            kbcVarT2 = a8gVar.h(csVar);
                        }
                        int i10 = ((bs0) kbcVarT2.u().c.g).c;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        csVar.setBackground(col.b(i10, null, shapeDrawable));
                        return csVar;
                    case 4:
                        zv8[] zv8VarArr5 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView.setId(R.id.writebar__suggestion_title);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        q9i.a(q9i.c, appCompatTextView);
                        appCompatTextView.setGravity(17);
                        kbc kbcVarT3 = suggestionsWidget.t1();
                        if (kbcVarT3 == null) {
                            kbcVarT3 = a8gVar.h(appCompatTextView);
                        }
                        appCompatTextView.setTextColor(kbcVarT3.getText().b);
                        appCompatTextView.setText(R.string.writebar_mentions_title);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        zv8[] zv8VarArr6 = SuggestionsWidget.F;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(R.id.writebar__suggestion_close_panel);
                        frameLayout2.addView(suggestionsWidget.E1());
                        ow0 ow0Var = suggestionsWidget.v;
                        zv8 zv8Var3 = SuggestionsWidget.F[7];
                        frameLayout2.addView((AppCompatTextView) ow0Var.getValue());
                        lvb.I(frameLayout2);
                        return frameLayout2;
                    default:
                        zv8[] zv8VarArr7 = SuggestionsWidget.F;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext());
                        appCompatTextView2.setId(R.id.writebar__suggestion_not_found);
                        appCompatTextView2.setLayoutParams(new uf4(-2, -2));
                        q9i.a(q9i.i, appCompatTextView2);
                        n1g.N(new vzc(suggestionsWidget, lq4Var, 15), appCompatTextView2);
                        appCompatTextView2.setText(R.string.writebar_mentions_not_found);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        appCompatTextView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0);
                        lvb.I(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        this.y = new nt4(yl5.d().getDisplayMetrics().density * 20.0f);
        B1(false);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        wf4Var.setId(R.id.writebar__suggestion_popup_layout_content);
        wf4Var.addView(D1(), -1, -2);
        wf4Var.addView(I1());
        wf4Var.addView(G1());
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = F1().getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = D1().getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 7, 0, 7);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id2));
        eg4VarH.d(id2, 6, 0, 6);
        new bsb(6, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        int id3 = G1().getId();
        eg4VarH.d(id3, 3, 0, 3);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        int id4 = I1().getId();
        eg4VarH.d(id4, 3, 0, 3);
        qt4.w(20.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 6, 0, 6);
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.g(id4).d.m0 = true;
        eg4VarH.g(id4).d.x = 0.0f;
        n1g.N(new vzc(this, (lq4) null, 16), wf4Var);
        eg4VarH.a(wf4Var);
        frameLayout.addView(wf4Var, -1, -1);
        frameLayout.addView(F1());
    }

    public final FrameLayout D1() {
        zv8 zv8Var = F[8];
        return (FrameLayout) this.w.getValue();
    }

    public final cs E1() {
        zv8 zv8Var = F[6];
        return (cs) this.u.getValue();
    }

    public final FrameLayout F1() {
        zv8 zv8Var = F[3];
        return (FrameLayout) this.r.getValue();
    }

    public final AppCompatTextView G1() {
        zv8 zv8Var = F[9];
        return (AppCompatTextView) this.x.getValue();
    }

    public final wf4 H1() {
        return (wf4) this.p.m(this, F[2]);
    }

    public final l96 I1() {
        zv8 zv8Var = F[5];
        return (l96) this.t.getValue();
    }

    public final x9h J1() {
        return (x9h) this.o.getValue();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final boolean handleBack() {
        Object value;
        mjg mjgVar = J1().y;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, null));
        v1(true);
        return true;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        I1().setAdapter(null);
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
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ecd ecdVar = this.b;
        int i = 4;
        int i2 = 3;
        lq4 lq4Var = null;
        if (ecdVar != null) {
            View view2 = new View(getContext());
            view2.setId(R.id.writebar__suggestion_popup_separator);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d));
            layoutParams.gravity = 80;
            view2.setLayoutParams(layoutParams);
            view2.setVisibility(8);
            n1g.N(new b3(3, null, 4), view2);
            ecdVar.addView(view2);
        }
        wf4 wf4VarH1 = H1();
        wf4VarH1.setClipToOutline(true);
        wf4VarH1.setOutlineProvider(this.y);
        I1().setAdapter((t9h) this.q.getValue());
        e9i.j0(new fz6(n1g.v(J1().t, getViewLifecycleOwner().f(), n09.d), new j8g(lq4Var, this, 13), i2), getViewLifecycleScope());
        n1g.N(new nff(this, lq4Var, i), view);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new ib(this, 6);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* JADX INFO: renamed from: r1 */
    public final oi8 getF() {
        return new oi8(0, 0, 0, new j11(1, 3, false), 7);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        kbc kbcVar = pq3.j.e(getContext()).j().b;
        zv8 zv8Var = F[1];
        if (((Boolean) this.m.a(this)).booleanValue()) {
            return kbcVar;
        }
        return null;
    }

    public SuggestionsWidget(t3f t3fVar, boolean z) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg:force_dark_theme", Boolean.valueOf(z))));
    }

    public /* synthetic */ SuggestionsWidget(t3f t3fVar, boolean z, int i, j95 j95Var) {
        this(t3fVar, (i & 2) != 0 ? false : z);
    }
}
