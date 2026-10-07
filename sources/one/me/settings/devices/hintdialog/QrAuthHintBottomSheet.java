package one.me.settings.devices.hintdialog;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a8g;
import defpackage.aq4;
import defpackage.br4;
import defpackage.ha9;
import defpackage.hrf;
import defpackage.ht0;
import defpackage.hve;
import defpackage.jc4;
import defpackage.kc4;
import defpackage.lve;
import defpackage.mc4;
import defpackage.n1g;
import defpackage.np4;
import defpackage.o65;
import defpackage.oc4;
import defpackage.p;
import defpackage.poe;
import defpackage.pq3;
import defpackage.r5h;
import defpackage.tnh;
import defpackage.ur8;
import defpackage.xnh;
import defpackage.yab;
import defpackage.ylc;
import defpackage.zv8;
import java.util.Locale;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/devices/hintdialog/QrAuthHintBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-devices"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QrAuthHintBottomSheet extends Widget implements mc4 {
    public boolean a;

    public QrAuthHintBottomSheet(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    public static final void o1(QrAuthHintBottomSheet qrAuthHintBottomSheet) {
        Object poeVar;
        String strQ = np4.q(qrAuthHintBottomSheet.getContext(), R.string.settings_devices_auth_hint_description_full);
        try {
            poeVar = qrAuthHintBottomSheet.p1(strQ, np4.q(qrAuthHintBottomSheet.getContext(), R.string.settings_devices_auth_hint_description_navigation_part));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Object obj = strQ;
        if (!(poeVar instanceof poe)) {
            obj = poeVar;
        }
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.settings_devices_auth_hint_title, null, null, 6);
        Context context = qrAuthHintBottomSheet.getContext();
        a8g a8gVar = pq3.j;
        jc4VarC.h(new oc4(R.drawable.icon_devices_fill, 1, 4, Integer.valueOf(a8gVar.e(qrAuthHintBottomSheet.getContext()).m().h().a), Integer.valueOf(a8gVar.e(context).m().getIcon().h)));
        jc4VarC.g(new xnh((CharSequence) obj));
        jc4VarC.a(new kc4(R.id.settings_devices_auth_hint_accept_button, new tnh(R.string.settings_devices_auth_hint_accept_button_title), 3, true, 3, 3), new kc4(R.id.settings_devices_auth_hint_deny_button, new tnh(R.string.settings_devices_auth_hint_deny_button_title), 2, 32));
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(qrAuthHintBottomSheet);
        confirmationBottomSheetF.addLifecycleListener(new aq4(1, qrAuthHintBottomSheet));
        confirmationBottomSheetF.setTargetController(qrAuthHintBottomSheet);
        br4 parentController = qrAuthHintBottomSheet;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.settings_devices_auth_hint_accept_button) {
            this.a = true;
            hrf hrfVar = hrf.b;
            o65.c(hrfVar.b(), ":settings", null, null, 6);
            o65.c(hrfVar.b(), ":settings/devices", null, null, 6);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yab.i0(getViewLifecycleScope(), null, 0, new ur8(this, null, 24), 3);
    }

    public final SpannableString p1(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        Locale locale = Locale.ROOT;
        int iV0 = r5h.V0(str.toLowerCase(locale), str2.toLowerCase(locale), 0, false, 6);
        spannableString.setSpan(new StyleSpan(1), iV0, str2.length() + iV0, 33);
        String strQ = np4.q(getContext(), R.string.settings_devices_auth_hint_description_navigation_arrow);
        int iV1 = r5h.V0(str2, strQ, 0, false, 4);
        while (iV1 != -1) {
            int i = iV1 + iV0;
            spannableString.setSpan(new ht0(), i, strQ.length() + i, 33);
            iV1 = r5h.V0(str2, strQ, (strQ.length() + i) - iV0, false, 4);
        }
        return spannableString;
    }

    public QrAuthHintBottomSheet(Bundle bundle) {
        super(bundle);
    }
}
