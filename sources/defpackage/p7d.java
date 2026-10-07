package defpackage;

import android.hardware.camera2.CaptureResult;
import android.opengl.GLES20;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.polls.screens.result.PollResultScreen;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p7d implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p7d(ProfileChangeLinkScreen profileChangeLinkScreen, cmd cmdVar) {
        this.a = 6;
        this.b = cmdVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        sbi sbiVar = sbi.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PollCreateScreen.n;
                ((PollCreateScreen) obj2).p1().B();
                return sbiVar;
            case 1:
                zv8[] zv8VarArr2 = PollResultScreen.k;
                a8j.x(((PollResultScreen) obj2).o1().t, rt3.b);
                return sbiVar;
            case 2:
                tr3 tr3Var = (tr3) obj;
                tr3.a(tr3Var, "type", n5h.b);
                tr3.a(tr3Var, SdkMetricStatEvent.VALUE_KEY, yab.m("kotlinx.serialization.Polymorphic<" + ((sr3) ((uad) obj2).a).h() + '>', kif.f, new fif[0]));
                tr3Var.b = r66.a;
                return sbiVar;
            case 3:
                return p90.a((qfd) obj2);
            case 4:
                ((zv) ((g85) obj2).e).addLast(obj);
                return sbiVar;
            case 5:
                zv8[] zv8VarArr3 = ProfileAvatarsScreen.r;
                ((ProfileAvatarsScreen) obj2).getRouter().D();
                return sbiVar;
            case 6:
                wnd wndVar = (wnd) obj;
                o65.c(wndVar.b(), ":chat-list", null, null, 6);
                o65.c(wndVar.b(), zo5.j(((wld) ((cmd) obj2)).b, ":start-conversation/add-subscribers?id="), null, null, 6);
                return sbiVar;
            case 7:
                zv8[] zv8VarArr4 = ProfileDeletionInfoScreen.g;
                ltb onBackPressedDispatcher = ((ProfileDeletionInfoScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbiVar;
            case 8:
                ProfileInviteScreen profileInviteScreen = (ProfileInviteScreen) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                zv8[] zv8VarArr5 = ProfileInviteScreen.g;
                rcc rccVar = new rcc(linearLayout.getContext());
                rccVar.setLayoutParams(new uf4(-1, -2));
                rccVar.setTitle(R.string.oneme_profile_invite_toolbar_title);
                rccVar.setForm(gcc.Compact);
                rccVar.setTextShimmerEnabled(false);
                rccVar.setLeftActions(new wbc(new skd(2)));
                linearLayout.addView(rccVar);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileInviteScreen.e);
                recyclerView.setItemAnimator(null);
                f8b f8bVar = jj8.a;
                f8b f8bVar2 = new f8b(1);
                f8bVar2.h(4);
                recyclerView.h(new sbf(pq3.j.h(recyclerView), new fv9(profileInviteScreen, 24, f8bVar2), null, null, null, 60), -1);
                recyclerView.h(new ym9(aj8.a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density)), aj8.a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f)), aj8.a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(10.0f * yl5.d().getDisplayMetrics().density), 0, 0), 1), -1);
                linearLayout.addView(recyclerView);
                return sbiVar;
            case 9:
                zv8[] zv8VarArr6 = ProfileReactionsSettingsScreen.p;
                ltb onBackPressedDispatcher2 = ((ProfileReactionsSettingsScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return sbiVar;
            case 10:
                return Integer.valueOf(((cg8) obj2).a);
            case 11:
                ((i64) obj2).Q(sbiVar);
                return sbiVar;
            case 12:
                ((lle) obj2).b.Q(sbiVar);
                return sbiVar;
            case 13:
                ((p41) ((txd) obj2).e.f).c(new jle((d9) obj));
                return sbiVar;
            case 14:
                ((zv) ((js8) obj2).e).addLast(obj);
                return sbiVar;
            case 15:
                zv8[] zv8VarArr7 = QrScannerWidget.w;
                ((QrScannerWidget) obj2).t1().B(k1f.a);
                return sbiVar;
            case 16:
                g6e g6eVar = (g6e) obj;
                u6e u6eVar = ((v6e) obj2).c;
                if (u6eVar != null) {
                    u6eVar.P0(g6eVar);
                }
                return sbiVar;
            case 17:
                ((c60) obj).b = (o60) obj2;
                return sbiVar;
            case 18:
                Size size = (Size) obj;
                GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
                oc9.o("glViewport", new int[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                oc9.o("glClearColor", new int[0]);
                GLES20.glClear(16384);
                oc9.o("glClear", 1285);
                ((g85) obj2).T();
                return sbiVar;
            case 19:
                xg xgVar = (xg) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    if (!ww3.j1((List) entry.getValue(), xgVar.a.get((CaptureResult.Key) entry.getKey()))) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(z);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return RetryKt.retryApiWithBackoff$lambda$1((y3e) obj2, (Throwable) obj);
            case 21:
                ((th5) obj2).h = (id7) obj;
                return sbiVar;
            case 22:
                zv8[] zv8VarArr8 = SafeModeOnboardingScreen.f;
                ltb onBackPressedDispatcher3 = ((SafeModeOnboardingScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher3 != null) {
                    onBackPressedDispatcher3.d();
                }
                return sbiVar;
            case 23:
                ((vp4) ((Widget) obj2)).E(((Integer) obj).intValue(), null);
                return sbiVar;
            case 24:
                zv8[] zv8VarArr9 = SelectedMediaBottomBarWidget.C;
                ((ib9) ((SelectedMediaBottomBarWidget) obj2).h.getValue()).a.i = (CharSequence) obj;
                return sbiVar;
            case 25:
                hif hifVar = (hif) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return hifVar.f[iIntValue] + ": " + hifVar.g[iIntValue].i();
            case 26:
                btc btcVar = (btc) obj;
                return Boolean.valueOf((btcVar instanceof n4b) && ((n4b) btcVar).f == ((sfa) obj2).a);
            case 27:
                return Boolean.valueOf(((amf) obj2).d.contains((Long) obj));
            case 28:
                zv8[] zv8VarArr10 = SettingRingtoneScreen.i;
                ((SettingRingtoneScreen) obj2).getRouter().D();
                return sbiVar;
            default:
                zv8[] zv8VarArr11 = SettingsBlacklistScreen.h;
                ((SettingsBlacklistScreen) obj2).getRouter().D();
                return sbiVar;
        }
    }

    public /* synthetic */ p7d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
