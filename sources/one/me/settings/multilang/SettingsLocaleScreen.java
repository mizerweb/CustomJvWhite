package one.me.settings.multilang;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.bc1;
import defpackage.br4;
import defpackage.cqk;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.et3;
import defpackage.ev;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hve;
import defpackage.i22;
import defpackage.irf;
import defpackage.j95;
import defpackage.jc9;
import defpackage.je9;
import defpackage.k96;
import defpackage.kc9;
import defpackage.kr4;
import defpackage.ks6;
import defpackage.ltb;
import defpackage.lve;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o54;
import defpackage.oi8;
import defpackage.otf;
import defpackage.pc9;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.q9i;
import defpackage.qtf;
import defpackage.qv1;
import defpackage.qyb;
import defpackage.rcc;
import defpackage.rj5;
import defpackage.rsf;
import defpackage.s7f;
import defpackage.sbf;
import defpackage.sc9;
import defpackage.tre;
import defpackage.vne;
import defpackage.vv;
import defpackage.wbc;
import defpackage.ww3;
import defpackage.xc9;
import defpackage.xre;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/settings/multilang/SettingsLocaleScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "langChanged", "Lha9;", "localAccountId", "", "newLang", "(ZLha9;Ljava/lang/String;)V", "settings-locale"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsLocaleScreen extends Widget {
    public static final /* synthetic */ zv8[] k;
    public final String a;
    public final oi8 b;
    public final h c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ks6 g;
    public final ny8 h;
    public final vv i;
    public final rsf j;

    static {
        dwd dwdVar = new dwd(SettingsLocaleScreen.class, "selectedLang", "getSelectedLang()Ljava/lang/String;", 0);
        zfe.a.getClass();
        k = new zv8[]{dwdVar};
    }

    public SettingsLocaleScreen(Bundle bundle) {
        super(bundle);
        this.a = SettingsLocaleScreen.class.getName();
        this.b = oi8.f;
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.c = hVar;
        this.d = hVar.getAccessor().d(85);
        this.e = hVar.getAccessor().d(78);
        this.f = hVar.getAccessor().d(HttpStatus.SC_NOT_MODIFIED);
        this.g = tre.G(this, new irf(7));
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(sc9.class, new ztd(24, new xre(bundle, 10, this)));
        this.h = ny8VarCreateViewModelLazy;
        this.i = new vv(String.class, null, "new_lang");
        this.j = new rsf(new rj5(24, this), ((a2c) hVar.getAccessor().c(27)).a());
        e9i.j0(new fz6(n1g.v(((sc9) ny8VarCreateViewModelLazy.getValue()).k, getViewLifecycleOwner().f(), n09.d), new qtf(null, this, 1), 3), getViewLifecycleScope());
    }

    public static final void o1(SettingsLocaleScreen settingsLocaleScreen, long j) {
        String str = settingsLocaleScreen.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "replacing controller, id: "), null);
            }
        }
        settingsLocaleScreen.getRouter().N(new lve(new SettingsLocaleScreen(true, settingsLocaleScreen.getB().b(), ((sc9) settingsLocaleScreen.h.getValue()).B((int) j)), null, null, null, false, -1));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.g;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = getArgs().getString("new_lang", null);
        LinearLayout linearLayoutJ = bc1.j(string == null ? getContext() : new ContextThemeWrapper(kc9.c(getContext(), string), R.style.Theme_MaterialComponents), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setId(R.id.oneme_setting_locale_title);
        rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.settings_screen_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new ptf(0, this)));
        linearLayoutJ.addView(rccVar);
        k96 k96Var = new k96(linearLayoutJ.getContext());
        k96Var.setId(R.id.oneme_locale_recycler_view);
        k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager());
        k96Var.setAdapter(this.j);
        k96Var.h(new sbf(pq3.j.h(k96Var), new qyb(28, this), null, null, null, 60), -1);
        k96Var.h(new i22(1), -1);
        linearLayoutJ.addView(k96Var);
        TextView textView = new TextView(linearLayoutJ.getContext());
        textView.setId(R.id.oneme_setting_locale_hint);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setText(R.string.settings_screen_hint);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), textView.getPaddingTop(), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
        q9i.a(q9i.i, textView);
        n1g.N(new xc9(3, null, 22), textView);
        linearLayoutJ.addView(textView);
        n1g.N(new n(3, null, 20), linearLayoutJ);
        return linearLayoutJ;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((sc9) this.h.getValue()).m, getViewLifecycleOwner().f(), n09.d), new qtf(null, this, 0), 3), getViewLifecycleScope());
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(17, this));
        }
    }

    public final void p1(br4 br4Var) throws IllegalAccessException, InvocationTargetException {
        Iterator<T> it = br4Var.getChildRouters().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((hve) it.next()).e().iterator();
            while (it2.hasNext()) {
                br4 br4Var2 = ((lve) it2.next()).a;
                if (br4Var2.getView() != null) {
                    zv8[] zv8VarArr = kr4.a;
                    br4Var2.setNeedsAttach(true);
                    kr4.b(br4Var2, getContext());
                }
                p1(br4Var2);
            }
        }
    }

    public final void q1() throws IllegalAccessException, InvocationTargetException {
        vv vvVar = this.i;
        zv8 zv8Var = k[0];
        String str = (String) vvVar.a(this);
        String str2 = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, qv1.l("processLeaveScreen, selectedLang: ", str, ", prefsLang: ", ((s7f) ((et3) this.d.getValue())).m()), null);
            }
        }
        if (str == null || cqk.d(((s7f) ((et3) this.d.getValue())).m(), str)) {
            otf.b.b().f();
            return;
        }
        ((pc9) ((sc9) this.h.getValue()).h.getValue()).a(2, str);
        lve lveVar = (lve) ww3.D1(getRouter().e());
        br4 br4Var = lveVar != null ? lveVar.a : null;
        Iterator it = getRouter().e().iterator();
        while (it.hasNext()) {
            br4 br4Var2 = ((lve) it.next()).a;
            if (!cqk.d(br4Var2, br4Var)) {
                if (br4Var2.getView() != null) {
                    zv8[] zv8VarArr = kr4.a;
                    br4Var2.setNeedsAttach(true);
                    kr4.b(br4Var2, getContext());
                }
                p1(br4Var2);
            }
        }
        ((jc9) this.e.getValue()).d(getContext(), str);
        ((o54) this.f.getValue()).a(true);
        gm0.n(this.a, "Restarting session");
        sc9 sc9Var = (sc9) this.h.getValue();
        gm0.n(sc9Var.l, "reinitSession");
        ((vne) sc9Var.f.getValue()).b();
        Context context = getContext();
        Intent intent = new Intent("action.LOCALE_CHANGED");
        intent.setPackage(getContext().getPackageName());
        context.sendBroadcast(intent);
    }

    public /* synthetic */ SettingsLocaleScreen(boolean z, ha9 ha9Var, String str, int i, j95 j95Var) {
        this(z, ha9Var, (i & 4) != 0 ? null : str);
    }

    public SettingsLocaleScreen(boolean z, ha9 ha9Var, String str) {
        this(n1g.i(new ylc("lang_changed", Boolean.valueOf(z)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("new_lang", str)));
    }
}
