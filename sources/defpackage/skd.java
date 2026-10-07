package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.stories.publish.PublishStoryBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class skd implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ skd(ProfileScreen profileScreen) {
        this.a = 7;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        nx2 nx2Var;
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ylc ylcVar = (ylc) obj;
                return new ckd(((Long) ylcVar.a).longValue(), Collections.singletonList((String) ylcVar.b));
            case 1:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM profile");
                try {
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 2:
                zv8[] zv8VarArr = ProfileInviteScreen.g;
                trd.b.r();
                return sbiVar;
            case 3:
                return Integer.valueOf(((kbc) obj).getText().e);
            case 4:
                return Integer.valueOf(((kbc) obj).getText().d);
            case 5:
                return p90.a(null);
            case 6:
                ((f9b) obj).setValue(null);
                return sbiVar;
            case 7:
                Toolbar toolbar = (Toolbar) obj;
                ku8 ku8Var = ProfileScreen.B;
                rcc rccVar = new rcc(toolbar.getContext());
                rccVar.setId(R.id.profile_screen_onemetoolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setTextShimmerEnabled(false);
                rccVar.setLeftActions(new wbc(new skd(8)));
                rccVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), rccVar.getPaddingTop(), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), rccVar.getPaddingBottom());
                toolbar.addView(rccVar);
                return sbiVar;
            case 8:
                ku8 ku8Var2 = ProfileScreen.B;
                trd.b.r();
                return sbiVar;
            case 9:
                Context context = (Context) obj;
                View view = new View(context);
                kbc kbcVarM = pq3.j.e(context).m();
                v50 v50Var = new v50();
                Drawable drawableMutate = view.getContext().getDrawable(R.drawable.icon_cross).mutate();
                sb8.m0(-1, drawableMutate);
                v50Var.a = drawableMutate;
                v50Var.invalidateSelf();
                v50Var.c = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
                v50Var.b = true;
                v50Var.invalidateSelf();
                v50Var.c(-1);
                v50Var.q = Integer.valueOf(kbcVarM.h().i);
                v50Var.invalidateSelf();
                v50Var.b();
                v50Var.r = 2;
                v50Var.invalidateSelf();
                view.setBackground(v50Var);
                return view;
            case 10:
                return sbiVar;
            case 11:
                zv8[] zv8VarArr2 = PublishStoryBottomSheet.t;
                return Integer.valueOf(((kbc) obj).b().e);
            case 12:
                return String.valueOf(((y0e) obj).b);
            case 13:
                return new y5e((Context) obj);
            case 14:
                vxe vxeVarO1 = ((qxe) obj).O0("DELETE FROM reactions_section");
                try {
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            case 15:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM recent");
                try {
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 16:
                zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                return Integer.valueOf(((kbc) obj).getText().b);
            case 17:
                zv8[] zv8VarArr4 = RegistrationNeuroAvatarsScreen.u;
                return Integer.valueOf(((kbc) obj).getText().c);
            case 18:
                return tok.a(((TamErrorException) obj).a);
            case 19:
                rt2 rt2Var = (rt2) obj;
                if (rt2Var == null || (nx2Var = rt2Var.b) == null) {
                    return null;
                }
                return Integer.valueOf(nx2Var.q0);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return Boolean.TRUE;
            case 21:
                vxe vxeVarO3 = ((qxe) obj).O0("DELETE FROM chat_folder");
                try {
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
            case 22:
                vxe vxeVarO4 = ((qxe) obj).O0("DELETE FROM folder_and_chats");
                try {
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            case 23:
                vxe vxeVarO5 = ((qxe) obj).O0("DELETE FROM saved_msg_chat");
                try {
                    vxeVarO5.M0();
                    return sbiVar;
                } finally {
                    vxeVarO5.close();
                }
            case 24:
                return ConcurrentHashMap.newKeySet(1);
            case 25:
                return SdkIntervalStatEvent.toString$lambda$0((Map.Entry) obj);
            case 26:
                return SdkMetricStatEvent.toString$lambda$0((Map.Entry) obj);
            case 27:
                return Integer.valueOf(((kbc) obj).getText().d);
            case 28:
                return Integer.valueOf(((kbc) obj).b().f);
            default:
                ((Integer) obj).getClass();
                return Integer.MIN_VALUE;
        }
    }

    public /* synthetic */ skd(int i) {
        this.a = i;
    }
}
