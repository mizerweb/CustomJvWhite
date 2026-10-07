package one.me.stories.text;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.a3;
import defpackage.a8g;
import defpackage.acc;
import defpackage.bpg;
import defpackage.cf7;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.epa;
import defpackage.f55;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.hoh;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jcc;
import defpackage.jmh;
import defpackage.jvf;
import defpackage.koh;
import defpackage.lx3;
import defpackage.lz6;
import defpackage.mjg;
import defpackage.mmh;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nl9;
import defpackage.nmh;
import defpackage.noh;
import defpackage.ny8;
import defpackage.omh;
import defpackage.ore;
import defpackage.oxg;
import defpackage.oyg;
import defpackage.p26;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.pxg;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.t2g;
import defpackage.t3f;
import defpackage.tre;
import defpackage.ulh;
import defpackage.umh;
import defpackage.uw8;
import defpackage.vv;
import defpackage.wk2;
import defpackage.wlh;
import defpackage.wmh;
import defpackage.wtc;
import defpackage.xbc;
import defpackage.xk2;
import defpackage.y5g;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zw1;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.stories.text.TextEditStoryWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/stories/text/TextEditStoryWidget;", "Lone/me/sdk/arch/Widget;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TextEditStoryWidget extends Widget implements z4f {
    public static final /* synthetic */ zv8[] B = {new dwd(TextEditStoryWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, TextEditStoryWidget.class, "textBackgroundTool", "getTextBackgroundTool()Landroid/widget/ImageView;", 0), new dwd(TextEditStoryWidget.class, "textAlignTool", "getTextAlignTool()Lone/me/stories/text/TextAlignToolButton;", 0), new dwd(TextEditStoryWidget.class, "textColorTool", "getTextColorTool()Lone/me/sdk/uikit/common/circleiconbutton/ColorToolButton;", 0), new dwd(TextEditStoryWidget.class, "textWeightTool", "getTextWeightTool()Landroid/widget/ImageView;", 0), new dwd(TextEditStoryWidget.class, "editText", "getEditText()Lone/me/stories/text/StoryEditText;", 0), new dwd(TextEditStoryWidget.class, "container", "getContainer()Landroid/widget/FrameLayout;", 0), new dwd(TextEditStoryWidget.class, "tools", "getTools()Landroid/view/ViewGroup;", 0)};
    public boolean A;
    public final wtc a;
    public final ny8 b;
    public final ny8 c;
    public final j8e d;
    public final j8e e;
    public final j8e f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public LinearLayout k;
    public final int l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int[] t;
    public final Rect u;
    public boolean v;
    public boolean w;
    public float x;
    public float y;
    public boolean z;

    public TextEditStoryWidget(Bundle bundle) {
        super(bundle);
        this.a = new wtc(m35getAccountScopeuqN4xOY());
        vv vvVar = new vv(t3f.class, pxg.a, "arg_story_editor_parent_scope_id");
        zv8 zv8Var = B[0];
        this.b = getSharedViewModel((t3f) vvVar.a(this), p26.class, null);
        this.c = createViewModelLazy(koh.class, new t2g(18, new bpg(10, this)));
        this.d = viewBinding(R.id.oneme_stories_background_color_tool_id);
        this.e = viewBinding(R.id.oneme_stories_text_align_tool_id);
        this.f = viewBinding(R.id.oneme_stories_text_color_tool_id);
        this.g = viewBinding(R.id.oneme_stories_text_weight_tool_id);
        this.h = viewBinding(R.id.oneme_stories_text_edit_id);
        this.i = viewBinding(R.id.oneme_stories_text_editor_container_id);
        this.j = viewBinding(R.id.oneme_stories_text_tools_id);
        this.l = gm0.K(14.0f * yl5.d().getDisplayMetrics().density);
        this.m = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
        this.n = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        this.o = yl5.d().getDisplayMetrics().density * 24.0f;
        this.p = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        this.q = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        this.r = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        this.s = tre.I0(-16777216, 0.32f);
        this.t = new int[2];
        this.u = new Rect();
        this.A = true;
    }

    @Override // defpackage.z4f
    public final Integer L() {
        return Integer.valueOf(pq3.j.k(getContext()).b.b().g);
    }

    public final void o1() {
        Object value;
        omh omhVar = (omh) ((p26) this.b.getValue()).s.h.a.getValue();
        nmh nmhVar = omhVar instanceof nmh ? (nmh) omhVar : null;
        hoh hohVar = nmhVar != null ? nmhVar.c : null;
        koh kohVarT1 = t1();
        if (hohVar == null) {
            hohVar = new hoh((ulh) null, 0, 0, 0, (CharSequence) null, 0, 0, 255);
        }
        mjg mjgVar = kohVarT1.c;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, hohVar));
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        if (this.A) {
            nl9.d(s1(), true);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = uw8.a;
        int iA = uw8.a(getContext());
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.oneme_stories_text_editor_container_id);
        final int i2 = 0;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        oxg oxgVar = new oxg(frameLayout.getContext(), this.a.getAccessor().d(254));
        oxgVar.setId(R.id.oneme_stories_text_edit_id);
        oxgVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        oxgVar.setGravity(49);
        int i3 = this.n;
        oxgVar.setPadding(i3, 0, i3, iA);
        oxgVar.setSingleLine(false);
        final int i4 = 1;
        oxgVar.setMinLines(1);
        oxgVar.setMaxLines(Integer.MAX_VALUE);
        noh.c(wmh.a, oxgVar, 600);
        a8g a8gVar = pq3.j;
        oxgVar.setTextColor(a8gVar.h(oxgVar).getText().b);
        oxgVar.setBackground(null);
        f55.f(oxgVar, a8gVar.h(oxgVar));
        oxgVar.setHorizontallyScrolling(false);
        oxgVar.setOverScrollMode(2);
        oxgVar.setFocusableInTouchMode(true);
        oxgVar.requestFocus();
        oxgVar.addTextChangedListener(new a3(10, this));
        oxgVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(y5g.CLOSE_SOCKET_CODE_TIMEOUT)});
        frameLayout.addView(oxgVar);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setId(R.id.oneme_stories_text_tools_id);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.setMargins(0, 0, 0, this.r + iA);
        linearLayout.setLayoutParams(layoutParams2);
        final ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setId(R.id.oneme_stories_background_color_tool_id);
        int i5 = this.m;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i5, i5);
        layoutParams3.gravity = 17;
        imageView.setLayoutParams(layoutParams3);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i6 = this.l;
        imageView.setPadding(i6, i6, i6, i6);
        imageView.setImageResource(R.drawable.icon_text_bg);
        qe7.H(imageView, 300L, new View.OnClickListener() { // from class: imh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                hoh hohVarA;
                Object value2;
                hoh hohVar;
                int i7;
                int i8 = i2;
                kt7 kt7Var = kt7.CLOCK_TICK;
                TextEditStoryWidget textEditStoryWidget = this;
                ImageView imageView2 = imageView;
                switch (i8) {
                    case 0:
                        zv8[] zv8VarArr = TextEditStoryWidget.B;
                        p0m.a(imageView2, kt7Var);
                        mjg mjgVar = textEditStoryWidget.t1().c;
                        do {
                            value = mjgVar.getValue();
                            hoh hohVar2 = (hoh) value;
                            int i9 = hohVar2.c;
                            if (i9 == 0) {
                                int i10 = hohVar2.d;
                                hohVarA = hoh.a(hohVar2, null, i10 != -1 ? -1 : -16777216, i10, 0, null, 0, false, R.drawable.icon_text_bg, 57);
                            } else if (((i9 >> 24) & 255) == 255) {
                                hohVarA = hoh.a(hohVar2, null, 0, lvb.I0(i9, 0.5f), 0, null, 0, false, R.drawable.icon_text_transparent_bg_28, 59);
                            } else {
                                int i11 = (-16777216) | i9;
                                hohVarA = hoh.a(hohVar2, null, i11, 0, i11, null, 0, false, R.drawable.icon_text_no_bg_28, 49);
                            }
                        } while (!mjgVar.h(value, hohVarA));
                        break;
                    default:
                        zv8[] zv8VarArr2 = TextEditStoryWidget.B;
                        p0m.a(imageView2, kt7Var);
                        mjg mjgVar2 = textEditStoryWidget.t1().c;
                        do {
                            value2 = mjgVar2.getValue();
                            hohVar = (hoh) value2;
                            int iD = qt4.D(hohVar.f);
                            int i12 = 2;
                            if (iD == 0) {
                                i7 = i12;
                            } else if (iD == 1) {
                                i12 = 3;
                                i7 = i12;
                            } else if (iD != 2) {
                                ore.o();
                            } else {
                                i7 = 1;
                            }
                            break;
                        } while (!mjgVar2.h(value2, hoh.a(hohVar, null, 0, 0, 0, null, i7, false, 0, 159)));
                        break;
                }
            }
        });
        linearLayout.addView(imageView);
        View lx3Var = new lx3(linearLayout.getContext());
        lx3Var.setId(R.id.oneme_stories_text_color_tool_id);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i5, i5);
        layoutParams4.gravity = 17;
        lx3Var.setLayoutParams(layoutParams4);
        lx3Var.setPadding(i6, i6, i6, i6);
        qe7.H(lx3Var, 300L, new jvf(lx3Var, 15, this));
        linearLayout.addView(lx3Var);
        View wlhVar = new wlh(linearLayout.getContext());
        wlhVar.setId(R.id.oneme_stories_text_align_tool_id);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i5, i5);
        layoutParams5.gravity = 17;
        wlhVar.setLayoutParams(layoutParams5);
        wlhVar.setPadding(i6, i6, i6, i6);
        qe7.H(wlhVar, 300L, new jvf(wlhVar, 14, this));
        linearLayout.addView(wlhVar);
        final ImageView imageView2 = new ImageView(linearLayout.getContext());
        imageView2.setId(R.id.oneme_stories_text_weight_tool_id);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(i5, i5);
        layoutParams6.gravity = 17;
        imageView2.setLayoutParams(layoutParams6);
        imageView2.setScaleType(scaleType);
        imageView2.setPadding(i6, i6, i6, i6);
        imageView2.setImageResource(R.drawable.icon_text_weight_normal);
        qe7.H(imageView2, 300L, new View.OnClickListener() { // from class: imh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                hoh hohVarA;
                Object value2;
                hoh hohVar;
                int i7;
                int i8 = i4;
                kt7 kt7Var = kt7.CLOCK_TICK;
                TextEditStoryWidget textEditStoryWidget = this;
                ImageView imageView3 = imageView2;
                switch (i8) {
                    case 0:
                        zv8[] zv8VarArr = TextEditStoryWidget.B;
                        p0m.a(imageView3, kt7Var);
                        mjg mjgVar = textEditStoryWidget.t1().c;
                        do {
                            value = mjgVar.getValue();
                            hoh hohVar2 = (hoh) value;
                            int i9 = hohVar2.c;
                            if (i9 == 0) {
                                int i10 = hohVar2.d;
                                hohVarA = hoh.a(hohVar2, null, i10 != -1 ? -1 : -16777216, i10, 0, null, 0, false, R.drawable.icon_text_bg, 57);
                            } else if (((i9 >> 24) & 255) == 255) {
                                hohVarA = hoh.a(hohVar2, null, 0, lvb.I0(i9, 0.5f), 0, null, 0, false, R.drawable.icon_text_transparent_bg_28, 59);
                            } else {
                                int i11 = (-16777216) | i9;
                                hohVarA = hoh.a(hohVar2, null, i11, 0, i11, null, 0, false, R.drawable.icon_text_no_bg_28, 49);
                            }
                        } while (!mjgVar.h(value, hohVarA));
                        break;
                    default:
                        zv8[] zv8VarArr2 = TextEditStoryWidget.B;
                        p0m.a(imageView3, kt7Var);
                        mjg mjgVar2 = textEditStoryWidget.t1().c;
                        do {
                            value2 = mjgVar2.getValue();
                            hohVar = (hoh) value2;
                            int iD = qt4.D(hohVar.f);
                            int i12 = 2;
                            if (iD == 0) {
                                i7 = i12;
                            } else if (iD == 1) {
                                i12 = 3;
                                i7 = i12;
                            } else if (iD != 2) {
                                ore.o();
                            } else {
                                i7 = 1;
                            }
                            break;
                        } while (!mjgVar2.h(value2, hoh.a(hohVar, null, 0, 0, 0, null, i7, false, 0, 159)));
                        break;
                }
            }
        });
        linearLayout.addView(imageView2);
        frameLayout.addView(linearLayout);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.oneme_stories_text_editor_toolbar_id);
        rccVar.setForm(gcc.Compact);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams7.gravity = 48;
        rccVar.setLayoutParams(layoutParams7);
        rccVar.setCustomTheme(a8gVar.k(getContext()).b);
        rccVar.setLeftActions(new xbc(new cf7(this) { // from class: hmh
            public final /* synthetic */ TextEditStoryWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i7 = i2;
                sbi sbiVar = sbi.a;
                TextEditStoryWidget textEditStoryWidget = this.b;
                zv8[] zv8VarArr = TextEditStoryWidget.B;
                switch (i7) {
                    case 0:
                        p26 p26Var = (p26) textEditStoryWidget.b.getValue();
                        p26Var.s.a();
                        p26Var.Z();
                        break;
                    default:
                        textEditStoryWidget.q1();
                        break;
                }
                return sbiVar;
            }
        }));
        rccVar.setRightActions(new acc(null, new jcc(R.drawable.icon_check, null, null, null, 0.0f, new cf7(this) { // from class: hmh
            public final /* synthetic */ TextEditStoryWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i7 = i4;
                sbi sbiVar = sbi.a;
                TextEditStoryWidget textEditStoryWidget = this.b;
                zv8[] zv8VarArr = TextEditStoryWidget.B;
                switch (i7) {
                    case 0:
                        p26 p26Var = (p26) textEditStoryWidget.b.getValue();
                        p26Var.s.a();
                        p26Var.Z();
                        break;
                    default:
                        textEditStoryWidget.q1();
                        break;
                }
                return sbiVar;
            }
        }, 254), null));
        rccVar.setBackgroundColor(0);
        frameLayout.addView(rccVar);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.v = false;
        super.onDestroyView(view);
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        if (this.A) {
            nl9.c(s1());
        }
        r1();
        super.onDetach(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        o1();
        if (!this.v) {
            this.v = true;
            s1().setOnTouchListener(new zw1(4, this));
        }
        lz6 lz6VarK = e9i.K(uw8.f, 1);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(lz6VarK, i19VarF, n09Var), new jmh(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().d, getViewLifecycleOwner().f(), n09Var), new jmh(null, this, 1), 3), getViewLifecycleScope());
    }

    public final void p1(int i) {
        oxg oxgVarS1 = s1();
        int i2 = this.n;
        oxgVarS1.setPadding(i2, 0, i2, i);
        zv8[] zv8VarArr = B;
        zv8 zv8Var = zv8VarArr[7];
        j8e j8eVar = this.j;
        ViewGroup viewGroup = (ViewGroup) j8eVar.m(this, zv8Var);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.r + i;
        viewGroup.setLayoutParams(marginLayoutParams);
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomMargin = ((ViewGroup) j8eVar.m(this, zv8VarArr[7])).getMeasuredHeight() + this.q + i;
            linearLayout.setLayoutParams(layoutParams3);
        }
    }

    public final void q1() {
        Object value;
        p26 p26Var = (p26) this.b.getValue();
        hoh hohVar = (hoh) t1().d.a.getValue();
        Layout layout = s1().getLayout();
        int width = layout != null ? layout.getWidth() : 0;
        oyg oygVar = p26Var.s;
        xk2 xk2Var = oygVar.a;
        CharSequence charSequence = hohVar.e;
        mjg mjgVar = oygVar.g;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, mmh.a));
        Long l = oygVar.b;
        if (l != null) {
            oygVar.b = null;
            if (charSequence.length() == 0) {
                xk2Var.g(new ptf(13, l));
                xk2Var.f(null);
            } else {
                xk2Var.g(new epa(l, width, hohVar, 2));
                xk2Var.f(l);
            }
        } else if (charSequence.length() > 0) {
            int i = oygVar.c;
            if (i <= 0) {
                i = 1080;
            }
            int i2 = oygVar.d;
            if (i2 <= 0) {
                i2 = 1920;
            }
            long jIncrementAndGet = wk2.a.incrementAndGet();
            xk2Var.g(new ptf(14, new umh(jIncrementAndGet, hohVar.a, hohVar.b, hohVar.c, hohVar.e, hohVar.f, width, i / 2.0f, i2 / 2.0f, 1.0f, 0.0f)));
            xk2Var.f(Long.valueOf(jIncrementAndGet));
        }
        p26Var.Z();
    }

    public final void r1() {
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            linearLayout.animate().cancel();
            ViewParent parent = linearLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(linearLayout);
            }
            this.k = null;
        }
    }

    public final oxg s1() {
        return (oxg) this.h.m(this, B[5]);
    }

    public final koh t1() {
        return (koh) this.c.getValue();
    }

    public TextEditStoryWidget(t3f t3fVar) {
        this(n1g.i(new ylc("arg_story_editor_parent_scope_id", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a))));
    }
}
