package one.me.appearancesettings.multitheme;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8g;
import defpackage.aue;
import defpackage.av;
import defpackage.bsb;
import defpackage.bv;
import defpackage.c8c;
import defpackage.ch3;
import defpackage.d4f;
import defpackage.do9;
import defpackage.dv;
import defpackage.dwd;
import defpackage.e8c;
import defpackage.e9i;
import defpackage.ee;
import defpackage.eg4;
import defpackage.ev;
import defpackage.fv;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hq4;
import defpackage.i19;
import defpackage.ie;
import defpackage.ifh;
import defpackage.j8e;
import defpackage.jz;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lv;
import defpackage.lvb;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o1c;
import defpackage.oi8;
import defpackage.p;
import defpackage.ph1;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qo7;
import defpackage.qt4;
import defpackage.r;
import defpackage.rcc;
import defpackage.sb8;
import defpackage.sfd;
import defpackage.t8a;
import defpackage.tre;
import defpackage.u93;
import defpackage.uf4;
import defpackage.uu;
import defpackage.va;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.wu;
import defpackage.xhh;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yu;
import defpackage.zfe;
import defpackage.zn9;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zte;
import defpackage.zu;
import defpackage.zv8;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.sdk.arch.Widget;
import org.json.JSONException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/appearancesettings/multitheme/AppearanceSettingsMultiThemeScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "appearance-settings"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppearanceSettingsMultiThemeScreen extends Widget {
    public static final /* synthetic */ zv8[] i = {new dwd(AppearanceSettingsMultiThemeScreen.class, "chatPreviewView", "getChatPreviewView()Lone/me/appearancesettings/multitheme/views/ChatPreviewView;", 0), zo5.f(zfe.a, AppearanceSettingsMultiThemeScreen.class, "currentThemeTitle", "getCurrentThemeTitle()Landroid/widget/TextView;", 0), new dwd(AppearanceSettingsMultiThemeScreen.class, "segmentedButtons", "getSegmentedButtons()Lcom/google/android/material/button/MaterialButtonToggleGroup;", 0)};
    public final ks6 a;
    public final h b;
    public final ny8 c;
    public final j8e d;
    public final j8e e;
    public final j8e f;
    public final ny8 g;
    public final zsj h;

    public AppearanceSettingsMultiThemeScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new va(9));
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.b = hVar;
        this.c = createViewModelLazy(lv.class, new r(9, new qo7(13, this)));
        this.d = viewBinding(R.id.appearance_settings_chat_preview);
        this.e = viewBinding(R.id.appearance_settings_current_theme_title);
        this.f = viewBinding(R.id.appearance_settings_segmented_buttons_group);
        ifh ifhVarD = hVar.getAccessor().d(27);
        hVar.getAccessor().getClass();
        this.g = hVar.getAccessor().d(91);
        this.h = new zsj(new fv(o1()), ((a2c) ifhVarD.getValue()).a(), 12);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getC() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final lv o1() {
        return (lv) this.c.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.appearance_settings_screen_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle(R.string.oneme_appearance_settings_toolbar_title);
        rccVar.setLeftActions(new wbc(new wu(this, 0)));
        TextView textView = new TextView(getContext());
        textView.setId(R.id.appearance_settings_font_size_title);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        q9i.a(q9i.k.g(), textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().d);
        textView.setText(np4.q(textView.getContext(), R.string.oneme_appearance_settings_font_size_title));
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = yl5.d().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        sb8.m0(a8gVar.e(getContext()).m().b().f, shapeDrawable);
        e8c e8cVar = new e8c(getContext());
        e8cVar.setId(R.id.appearance_settings_font_size_view);
        e8cVar.setLayoutParams(new uf4(0, -2));
        e8cVar.setValueFrom(0.0f);
        e8cVar.setValueTo(5.0f);
        e8cVar.setStepSize(1.0f);
        e8cVar.setValue(((Number) ((aue) ((zte) this.g.getValue())).f().f()).intValue());
        e8cVar.setBackground(shapeDrawable);
        final TextView textView2 = new TextView(getContext());
        textView2.setId(R.id.appearance_settings_font_size_reset);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView2.setTextColor(p.d(textView2, q9i.r, a8gVar, textView2).d);
        textView2.setText(np4.q(textView2.getContext(), R.string.oneme_appearance_settings_font_size_reset));
        qe7.H(textView2, 300L, new ee(e8cVar, 1, textView2));
        e8cVar.v.add(new c8c() { // from class: xu
            @Override // defpackage.c8c
            public final void a(e8c e8cVar2, float f, boolean z) throws JSONException {
                Object next;
                Object next2;
                AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this;
                ny8 ny8Var = appearanceSettingsMultiThemeScreen.g;
                zv8[] zv8VarArr = AppearanceSettingsMultiThemeScreen.i;
                textView2.setVisibility(f == 1.0f ? 8 : 0);
                lv lvVarO1 = appearanceSettingsMultiThemeScreen.o1();
                int iIntValue = ((Number) ((aue) ((zte) ny8Var.getValue())).f().f()).intValue();
                hv hvVar = (hv) lvVarO1.p.getValue();
                Iterator it = hvVar.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((uu) next).b.equals(Boolean.TRUE));
                uu uuVar = (uu) next;
                Integer numValueOf = uuVar != null ? Integer.valueOf(uuVar.a.a) : null;
                Iterator it2 = hvVar.a.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!((aqh) next2).a);
                aqh aqhVar = (aqh) next2;
                String strI = lv.I(aqhVar != null ? aqhVar.o() : null, numValueOf, null, Boolean.FALSE);
                ul9 ul9VarE = strI != null ? lv.E(String.valueOf(iIntValue), strI) : null;
                if (ul9VarE != null) {
                    ae9.k(lvVarO1.G(), "SETTINGS", "TEXT_SIZE", ul9VarE, 8);
                }
                ((aue) ((zte) ny8Var.getValue())).f().setValue(Integer.valueOf(oc9.v(gm0.K(f), 0, 5)));
            }
        });
        u93 u93Var = new u93(getContext());
        u93Var.setId(R.id.appearance_settings_chat_preview);
        float f = 1.0f;
        yab.i0(getViewLifecycleScope(), null, 0, new av(u93Var, this, null, 1), 3);
        TextView textView3 = new TextView(getContext());
        textView3.setId(R.id.appearance_settings_current_theme_title);
        textView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView3.setTextColor(p.d(textView3, q9i.f, a8gVar, textView3).b);
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R.id.appearance_settings_recycler);
        recyclerView.setLayoutParams(new uf4(-2, 0));
        recyclerView.setAdapter(this.h);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.q1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.h(new ph1(12), -1);
        recyclerView.h(new t8a(recyclerView.getContext(), new wu(this, 1)), -1);
        TextView textView4 = new TextView(getContext());
        textView4.setId(R.id.appearance_settings_screen_mode);
        textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        q9i.a(q9i.k.g(), textView4);
        textView4.setTextColor(a8gVar.h(textView4).getText().d);
        textView4.setText(np4.q(textView4.getContext(), R.string.oneme_appearance_settings_mode_title));
        do9 do9Var = new do9(getContext());
        do9Var.setId(R.id.appearance_settings_segmented_buttons_group);
        do9Var.setLayoutParams(new uf4(-1, 0));
        do9Var.setElevation(0.0f);
        do9Var.setStateListAnimator(null);
        do9Var.setSingleSelection(true);
        do9Var.setSelectionRequired(true);
        do9Var.setOrientation(0);
        hq4 hq4Var = new hq4(do9Var.getContext(), R.style.Theme_MaterialComponents_DayNight);
        Iterator it = o1().o.iterator();
        while (it.hasNext()) {
            uu uuVar = (uu) it.next();
            zn9 zn9Var = new zn9(hq4Var, null);
            RecyclerView recyclerView2 = recyclerView;
            zn9Var.setId((int) uuVar.getItemId());
            CharSequence charSequenceB = uuVar.c.b(zn9Var.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            zn9Var.setText(charSequenceB);
            q9i.a(q9i.q, zn9Var);
            zn9Var.setCornerRadius(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            zn9Var.setStrokeWidth(gm0.K(yl5.d().getDisplayMetrics().density * f));
            Iterator it2 = it;
            zn9Var.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), zn9Var.getPaddingTop(), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), zn9Var.getPaddingBottom());
            zn9Var.setElevation(0.0f);
            zn9Var.setStateListAnimator(null);
            zn9Var.setChecked(zn9Var.isSelected());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.width = 0;
            layoutParams.weight = f;
            zn9Var.setLayoutParams(layoutParams);
            n1g.N(new zu(3, (lq4) null, 0), zn9Var);
            do9Var.addView(zn9Var);
            recyclerView = recyclerView2;
            it = it2;
            f = 1.0f;
        }
        View view = recyclerView;
        do9Var.c.add(new yu(this));
        wf4 wf4Var = new wf4(getContext());
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        wf4Var.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        wf4Var.setLayoutParams(layoutParams2);
        h hVar = this.b;
        e9i.j0(new fz6(e9i.T(new ie(((o1c) hVar.getAccessor().c(806)).a, this, 1), ((n0c) ((xhh) hVar.getAccessor().d(23).getValue())).a()), new sfd(u93Var, (lq4) null, 8), 3), getViewLifecycleScope());
        wf4Var.addView(textView);
        wf4Var.addView(textView2);
        wf4Var.addView(e8cVar);
        wf4Var.addView(textView4);
        wf4Var.addView(do9Var);
        wf4Var.addView(u93Var);
        wf4Var.addView(textView3);
        wf4Var.addView(view);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = textView.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        new bsb(6, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id2 = textView2.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 7, 0, 7);
        new bsb(7, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id3 = e8cVar.getId();
        eg4VarH.d(id3, 3, textView.getId(), 4);
        qt4.w(6.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        int id4 = textView4.getId();
        eg4VarH.d(id4, 3, e8cVar.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        new bsb(6, eg4VarH, id4).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        int id5 = do9Var.getId();
        eg4VarH.d(id5, 3, textView4.getId(), 4);
        qt4.w(6.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id5));
        eg4VarH.d(id5, 6, 0, 6);
        eg4VarH.d(id5, 7, 0, 7);
        int id6 = u93Var.getId();
        eg4VarH.d(id6, 3, do9Var.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id6));
        eg4VarH.d(id6, 6, 0, 6);
        eg4VarH.d(id6, 7, 0, 7);
        int id7 = textView3.getId();
        eg4VarH.d(id7, 3, u93Var.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id7));
        eg4VarH.d(id7, 6, 0, 6);
        eg4VarH.d(id7, 7, 0, 7);
        int id8 = view.getId();
        eg4VarH.d(id8, 3, textView3.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id8));
        eg4VarH.d(id8, 6, 0, 6);
        eg4VarH.d(id8, 7, 0, 7);
        eg4VarH.a(wf4Var);
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams3);
        lvb.I(linearLayout);
        linearLayout.setOrientation(1);
        linearLayout.addView(rccVar);
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.addView(wf4Var);
        linearLayout.addView(scrollView);
        n1g.N(new bv(textView4, this, textView, textView2, shapeDrawable, u93Var, null), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ltb onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(getViewLifecycleOwner(), new ev(0, this));
        }
        jz jzVar = new jz(o1().q, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new dv(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().s, getViewLifecycleOwner().f(), n09Var), new dv(null, this, 1), 3), getViewLifecycleScope());
    }

    public AppearanceSettingsMultiThemeScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
