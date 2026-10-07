package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.os.HandlerThread;
import android.system.Os;
import android.system.OsConstants;
import android.view.animation.PathInterpolator;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.background.wake.BackgroundListenService;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class va implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ va(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        switch (this.a) {
            case 0:
                zv8[] zv8VarArr = AddChatAdminsScreen.l;
                return y3f.CHAT_INFO_ADD_ADMINISTRATOR;
            case 1:
                zv8[] zv8VarArr2 = AddChatAdminsScreen.l;
                return new tz(7, new i8a());
            case 2:
                zv8[] zv8VarArr3 = AddChatMembersScreen.r;
                return y3f.CHAT_INFO_ADD_PARTICIPANTS;
            case 3:
                return new Paint();
            case 4:
                HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 5:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                return paint;
            case 6:
                String name = ku.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "goToAppUpdateSource: no browser for default app update url", null);
                    }
                }
                return sbi.a;
            case 7:
                String name2 = ku.class.getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, name2, "goToAppUpdateSource: onFailure: no browser for default app update url", null);
                    }
                }
                return sbi.a;
            case 8:
                String name3 = ku.class.getName();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.f;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, name3, "goToAppUpdateSource: no browser for app update url", null);
                    }
                }
                return sbi.a;
            case 9:
                zv8[] zv8VarArr4 = AppearanceSettingsMultiThemeScreen.i;
                return y3f.SETTINGS_CHAT_DECORATION;
            case 10:
                return "Assertion failed";
            case 11:
                return new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);
            case 12:
                return new Path();
            case 13:
                int i = BackgroundListenService.c;
                r7 r7Var = r7.a;
                return new rm0(r7.d(ha9.b));
            case 14:
                ifh ifhVar = BackportedFixQuirk.a;
                return new tn0();
            case 15:
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                return Integer.valueOf(iAvailableProcessors >= 1 ? iAvailableProcessors : 1);
            case 16:
                try {
                    poeVar = Double.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Object objValueOf = Double.valueOf(100.0d);
                if (poeVar instanceof poe) {
                    poeVar = objValueOf;
                }
                return Double.valueOf(((Number) poeVar).doubleValue());
            case 17:
                return new byte[17408];
            case 18:
                zv8[] zv8VarArr5 = CallAdminSettingsScreen.j;
                return new za1();
            case 19:
                zv8[] zv8VarArr6 = CallAdminSettingsScreen.j;
                return t3g.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                float fC = yl5.c() * 100.0f;
                return new float[]{fC, fC, fC, fC, fC, fC, fC, fC};
            case 21:
                zv8[] zv8VarArr7 = qc1.K;
                return -231920335;
            case 22:
                return sbi.a;
            case 23:
                float f = yl5.d().getDisplayMetrics().density * 32.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 24:
                int i2 = ae1.s;
                return new AnimatorSet();
            case 25:
                zv8[] zv8VarArr8 = CallDebugMenuScreen.i;
                return new wf1();
            case 26:
                float f2 = yl5.d().getDisplayMetrics().density * 40.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 27:
                pk1.b.j(null, null, null);
                return sbi.a;
            case 28:
                zv8[] zv8VarArr9 = CallJoinLinkPreviewWidget.v;
                return y3f.CALL_JOIN_LINK_PREVIEW;
            default:
                ldf ldfVar = CallLinkInfoScreen.t;
                return y3f.CALL_CREATE_GROUP_LINK;
        }
    }

    public /* synthetic */ va(ku kuVar, int i) {
        this.a = i;
    }
}
