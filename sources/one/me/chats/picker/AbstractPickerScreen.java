package one.me.chats.picker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a3;
import defpackage.b3;
import defpackage.br4;
import defpackage.ca2;
import defpackage.d3;
import defpackage.dwd;
import defpackage.dzc;
import defpackage.e9i;
import defpackage.fik;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gjg;
import defpackage.gm0;
import defpackage.hve;
import defpackage.i19;
import defpackage.j8e;
import defpackage.l7;
import defpackage.lq4;
import defpackage.lve;
import defpackage.m8b;
import defpackage.mjg;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.pyc;
import defpackage.r;
import defpackage.rcc;
import defpackage.s66;
import defpackage.sfd;
import defpackage.t3f;
import defpackage.tp2;
import defpackage.txc;
import defpackage.vzb;
import defpackage.ww3;
import defpackage.xq4;
import defpackage.yl5;
import defpackage.ynh;
import defpackage.z2;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zo9;
import defpackage.zv8;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/chats/picker/AbstractPickerScreen;", "Ldzc;", "T", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AbstractPickerScreen<T extends dzc> extends Widget {
    public static final /* synthetic */ zv8[] i = {new dwd(AbstractPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, AbstractPickerScreen.class, "mainContainer", "getMainContainer()Landroid/view/ViewGroup;", 0), new dwd(AbstractPickerScreen.class, "pickerWidgetContainer", "getPickerWidgetContainer()Landroid/view/ViewGroup;", 0)};
    public final oi8 a;
    public final t3f b;
    public final ca2 c;
    public final ny8 d;
    public final j8e e;
    public final j8e f;
    public final j8e g;
    public g8c h;

    public AbstractPickerScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = new t3f("PickerScreen", super.getF().b());
        this.c = new ca2(m35getAccountScopeuqN4xOY());
        this.d = createViewModelLazy(txc.class, new r(1, new z2(this, 0, bundle)));
        this.e = viewBinding(w1());
        this.f = viewBinding(R.id.oneme_picker_main_container);
        this.g = viewBinding(R.id.oneme_picker_container_chats);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public oi8 getC() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getF() {
        return this.b;
    }

    public abstract Iterable o1();

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ynh ynhVar;
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(R.id.oneme_picker_main_container);
        n1g.N(new n(3, null, 1), linearLayout);
        linearLayout.addView(r1(linearLayout.getContext(), w1()), new FrameLayout.LayoutParams(-1, -2));
        if (t1() != null) {
            vzb vzbVar = new vzb(linearLayout.getContext());
            vzbVar.setId(R.id.oneme_picker_chips);
            EditText editText = vzbVar.getEditText();
            gjg gjgVarT1 = t1();
            editText.setHint((gjgVarT1 == null || (ynhVar = (ynh) ((mjg) gjgVarT1).getValue()) == null) ? null : ynhVar.b(vzbVar.getContext()));
            vzbVar.setCallback(new fik(this, 2, vzbVar));
            vzbVar.getEditText().addTextChangedListener(new a3(0, this));
            zo9 zo9Var = new zo9(linearLayout.getContext(), null);
            zo9Var.a = -1;
            zo9Var.setMaxHeight(gm0.K(100.0f * yl5.d().getDisplayMetrics().density));
            zo9Var.addView(vzbVar, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(zo9Var, new LinearLayout.LayoutParams(-1, -2));
            View view = new View(linearLayout.getContext());
            n1g.N(new b3(3, null, 0), view);
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d)));
        }
        tp2 tp2Var = new tp2(linearLayout.getContext());
        tp2Var.setId(R.id.oneme_picker_container_chats);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(tp2Var, layoutParams);
        Iterator it = o1().iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        hve childRouter = getChildRouter((ViewGroup) this.g.m(this, i[2]));
        if (!childRouter.o()) {
            Widget widgetQ1 = q1(this.b);
            if (widgetQ1.getTargetWidget() == null) {
                widgetQ1.setTargetWidget(this);
            }
            widgetQ1.setRetainViewMode(xq4.b);
            childRouter.T(new lve(widgetQ1, null, null, null, false, -1));
        }
        l7 l7Var = new l7(s66.a, x1().g, new d3(this, null, 0), 5);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(n1g.v(l7Var, i19VarF, n09Var), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(x1().j, getViewLifecycleOwner().f(), n09Var), new sfd(1, (lq4) null, this), 3), getViewLifecycleScope());
    }

    public abstract pyc p1();

    public abstract Widget q1(t3f t3fVar);

    public abstract rcc r1(Context context, int i2);

    public abstract dzc s1();

    public abstract gjg t1();

    public final ViewGroup u1() {
        return (ViewGroup) this.f.m(this, i[1]);
    }

    public final Widget v1() {
        if (getView() != null) {
            lve lveVar = (lve) ww3.t1(getChildRouter((ViewGroup) this.g.m(this, i[2])).e());
            br4 br4Var = lveVar != null ? lveVar.a : null;
            if (br4Var instanceof Widget) {
                return (Widget) br4Var;
            }
        }
        return null;
    }

    public abstract int w1();

    public final txc x1() {
        return (txc) this.d.getValue();
    }

    public void y1() {
    }

    public abstract m8b z1(Bundle bundle);
}
