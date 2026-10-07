package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioManager;
import android.opengl.GLES20;
import android.os.PowerManager;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.nio.channels.ClosedByInterruptException;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.a;
import one.me.finishbottomsheet.PollFinishBottomSheet;
import one.me.profile.screens.avatars.ProfileAvatarWidget;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;
import one.me.stories.publish.PublishStoryBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a8d implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a8d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a8g a8gVar = pq3.j;
        sbi sbiVar = sbi.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PollFinishBottomSheet pollFinishBottomSheet = (PollFinishBottomSheet) obj;
                l8d l8dVar = (l8d) pollFinishBottomSheet.x.getAccessor().c(298);
                vv vvVar = pollFinishBottomSheet.u;
                zv8[] zv8VarArr = PollFinishBottomSheet.B;
                zv8 zv8Var = zv8VarArr[0];
                long jLongValue = ((Number) vvVar.a(pollFinishBottomSheet)).longValue();
                vv vvVar2 = pollFinishBottomSheet.v;
                zv8 zv8Var2 = zv8VarArr[1];
                long jLongValue2 = ((Number) vvVar2.a(pollFinishBottomSheet)).longValue();
                vv vvVar3 = pollFinishBottomSheet.w;
                zv8 zv8Var3 = zv8VarArr[2];
                ((Number) vvVar3.a(pollFinishBottomSheet)).longValue();
                return new k8d(jLongValue, jLongValue2, (h8d) pollFinishBottomSheet.y.getValue(), l8dVar.a, l8dVar.b);
            case 1:
                l9d l9dVar = (l9d) obj;
                float[] fArr = new float[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    fArr[i2] = yl5.d().getDisplayMetrics().density * 6.0f;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                sb8.m0(a8gVar.h(l9dVar).getIcon().h, shapeDrawable);
                return shapeDrawable;
            case 2:
                return (ClosedByInterruptException) obj;
            case 3:
                return (InterruptedException) obj;
            case 4:
                uad uadVar = (uad) obj;
                return new op4(yab.l("kotlinx.serialization.Polymorphic", rad.f, new fif[0], new p7d(2, uadVar)), uadVar.a);
            case 5:
                return ((xdd) obj).a.getSharedPreferences("webrtc-android-sdk-pref", 0);
            case 6:
                ((kf8) obj).c.invoke(Boolean.TRUE);
                return sbiVar;
            case 7:
                ((mf8) obj).b.invoke(Boolean.FALSE);
                return sbiVar;
            case 8:
                ghb ghbVar = ew5.b;
                return Long.valueOf(ew5.g(qe7.O(((vqg) ((e5d) obj).r().i()).a, lw5.SECONDS)));
            case 9:
                zv8[] zv8VarArr2 = ProfileAvatarWidget.e;
                return a8gVar.k(((ProfileAvatarWidget) obj).getContext()).b;
            case 10:
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                zv8[] zv8VarArr3 = ProfileChangeLinkScreen.t;
                vv vvVar4 = profileChangeLinkScreen.b;
                zv8 zv8Var4 = ProfileChangeLinkScreen.t[1];
                int iOrdinal = ((nnd) vvVar4.a(profileChangeLinkScreen)).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return y3f.CHAT_LINK_EDITING;
                }
                if (iOrdinal == 2) {
                    return y3f.SETTINGS_SHORTNAME_CHANGE;
                }
                ore.o();
                return null;
            case 11:
                smd smdVar = (smd) ((ProfileDeletionInfoScreen) obj).c.getAccessor().c(396);
                smdVar.getClass();
                return new rmd(smdVar.a, smdVar.b, smdVar.c);
            case 12:
                end endVarP1 = ((ProfileEditAdminPermissionsWidget) ((lp0) obj).g).p1();
                ic6 ic6Var = endVarP1.s;
                vg4 vg4VarE = endVarP1.E();
                String strK = vg4VarE != null ? vg4VarE.k() : null;
                if (strK == null) {
                    strK = "";
                }
                a8j.x(ic6Var, new tmd(new vnh(R.string.profile_edit_admin_permissions_delete_from_admins_title, a.n1(new Object[]{strK})), null, xw3.P0(new kc4(R.id.profile_edit_admin_permissions_delete_from_admins_delete_action, new tnh(R.string.profile_edit_admin_permissions_delete_from_admins_delete_action), 1, 56), new kc4(R.id.profile_edit_admin_permissions_delete_from_admins_cancel_action, new tnh(R.string.profile_edit_admin_permissions_delete_from_admins_cancel_action), 2, 56))));
                return sbiVar;
            case 13:
                ((p7d) obj).invoke(wnd.b);
                return sbiVar;
            case 14:
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) obj;
                return profileEditScreen.a == ((s7f) ((et3) profileEditScreen.c.getValue())).t() ? y3f.SETTINGS_PROFILE_EDITING : y3f.CHAT_INFO_EDITING;
            case 15:
                return ((fz9) ((ProfileReactionsSettingsScreen) obj).d.getAccessor().c(354)).a(null);
            case 16:
                zv8[] zv8VarArr4 = ProfileReactionsSettingsScreen.p;
                FrameLayout frameLayout = new FrameLayout(((wf4) obj).getContext());
                frameLayout.setId(R.id.profile_edit_reactions_settings_loading_container);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                r6c r6cVar = new r6c(frameLayout.getContext());
                r6cVar.setAppearance(g6c.a);
                r6cVar.setSize(l6c.a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                r6cVar.setLayoutParams(layoutParams);
                frameLayout.addView(r6cVar);
                return frameLayout;
            case 17:
                dvd dvdVarV1 = ((dud) obj).f.v1();
                xt4 xt4VarA = ((n0c) dvdVarV1.F()).a();
                yt4 yt4VarE = dvdVarV1.E();
                xt4VarA.getClass();
                a8j.t(dvdVarV1, lvb.x0(xt4VarA, yt4VarE), new zud(dvdVarV1, null, 3), 2);
                return sbiVar;
            case 18:
                return new fmd((jcd) ((dvd) obj).z.getValue());
            case 19:
                zv8[] zv8VarArr5 = PublishStoryBottomSheet.t;
                return ((PublishStoryBottomSheet) obj).t1();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Object systemService = ((pzd) obj).b.getSystemService((Class<Object>) PowerManager.class);
                if (systemService != null) {
                    return (PowerManager) systemService;
                }
                ore.p("Required value was null.");
                return null;
            case 21:
                ((a8d) ((kog) obj).i).invoke();
                return sbiVar;
            case 22:
                u6e u6eVar = ((v6e) obj).c;
                if (u6eVar != null) {
                    u6eVar.G0();
                }
                return sbiVar;
            case 23:
                return (AudioManager) ((Context) ((jce) obj).j.getValue()).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 24:
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(a8gVar.k(((nde) obj).a).b.h().d);
                return shapeDrawable2;
            case 25:
                return RemoteSettingsImplV2.settingsSource_delegate$lambda$0((RemoteSettingsImplV2) obj);
            case 26:
                wje wjeVar = (wje) obj;
                Iterator it = wjeVar.f.entrySet().iterator();
                while (it.hasNext()) {
                    ((uje) ((Map.Entry) it.next()).getValue()).a();
                }
                for (f2d f2dVar : wjeVar.g) {
                    u6g u6gVar = f2dVar.f;
                    if (u6gVar != null) {
                        GLES20.glDeleteProgram(u6gVar.a);
                        oc9.o("glDeleteProgram", new int[0]);
                    }
                    f2dVar.f = null;
                }
                return sbiVar;
            case 27:
                ju6 ju6Var = (ju6) ((lqe) obj).e.getValue();
                ju6Var.getClass();
                return ju6.j(ju6Var.c(), "ringtones").listFiles();
            case 28:
                return wue.u((wue) obj);
            default:
                zv8[] zv8VarArr6 = SafeModeOnboardingScreen.f;
                nye nyeVar = (nye) new wtc(((SafeModeOnboardingScreen) obj).m35getAccountScopeuqN4xOY()).getAccessor().c(378);
                nyeVar.getClass();
                return new mye(nyeVar.a, nyeVar.b);
        }
    }
}
