package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.chatmedia.viewer.video.playbackSpeed.PlaybackSettingsBottomSheet;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.ProfileScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ol0 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ol0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        z = false;
        boolean z = false;
        sbi sbiVar = sbi.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((p6g) obj2).close();
                return sbiVar;
            case 1:
                return (Drawable) obj2;
            case 2:
                ((CallAdminSettingsScreen) obj2).getRouter().D();
                return sbiVar;
            case 3:
                ((CallDebugMenuScreen) obj2).getRouter().D();
                return sbiVar;
            case 4:
                ((CallPresettingsScreen) obj2).getRouter().D();
                return sbiVar;
            case 5:
                String str = ((z02) obj).a;
                mjg mjgVar = ((w82) obj2).q;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, k52.k));
                return p90.a(value);
            case 6:
                pm2 pm2Var = (pm2) obj2;
                xg metadata = ((pc7) obj).getMetadata();
                jm2 jm2Var = new jm2(metadata, pm2Var);
                wl2 wl2Var = pm2Var.n;
                metadata.a.getFrameNumber();
                return Boolean.valueOf(gs4.a(new sm2(wl2Var, jm2Var), true));
            case 7:
                int iIntValue = ((Number) obj).intValue();
                ou7 ou7Var = ChatScreen.L1;
                a8j.x(((ChatScreen) obj2).W1().i, new eqa(iIntValue));
                return sbiVar;
            case 8:
                ((r1g) obj2).b.invoke((j8c) obj);
                return sbiVar;
            case 9:
                return p90.a((rt2) obj2);
            case 10:
                ((grg) ((irg) obj2)).b.invoke((j8c) obj);
                return sbiVar;
            case 11:
                ((di4) obj).q = ((zed) ((no4) obj2).d.getValue()).a.f();
                return sbiVar;
            case 12:
                ljh ljhVar = (ljh) obj2;
                ljhVar.getClass();
                ljhVar.g(new TaskCancellationException());
                return sbiVar;
            case 13:
                ((Boolean) obj).getClass();
                ei5 ei5Var = (ei5) obj2;
                ei5Var.k.setVisibility(ei5Var.j.isFocused() ? 0 : 4);
                return sbiVar;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                n3 n3Var = ((xb9) obj2).S0;
                zv8 zv8Var = xb9.g1[36];
                ((m3) n3Var.g).setValue(bool);
                return sbiVar;
            case 15:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                aue aueVar = (aue) ((zte) obj2);
                aueVar.f.B(aueVar, aue.h[1], bool2);
                return sbiVar;
            case 16:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj2;
                zv8[] zv8VarArr = MessageWriteWidget.I;
                nma nmaVarA1 = messageWriteWidget.A1();
                nmaVarA1.X.setValue(null);
                xb9 xb9Var = (xb9) ((et3) nmaVarA1.f.getValue());
                xb9Var.E0.B(xb9Var, xb9.g1[21], Boolean.TRUE);
                messageWriteWidget.J1(new tnh(R.string.oneme_forward_author_visibility_onboarding), true);
                return sbiVar;
            case 17:
                Throwable th = (Throwable) obj;
                if (th == null || !(th instanceof CancellationException)) {
                    gm0.n(((MessagesListWidget) obj2).a, "complete observing handleEvent");
                }
                return sbiVar;
            case 18:
                int iIntValue2 = ((Number) obj).intValue();
                zsj zsjVar = (zsj) obj2;
                if (zsjVar.l() <= 0) {
                    return Boolean.FALSE;
                }
                udb udbVarN = zsjVar.N(iIntValue2);
                if (udbVarN != null && udbVarN.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                yab.A0(k66.a, new ywb((tfi) obj2, ((Boolean) obj).booleanValue(), null, 0));
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((Process) obj2).destroy();
                return sbiVar;
            case 21:
                ((Boolean) obj).getClass();
                jac jacVar = (jac) obj2;
                jacVar.b.setSelection(jacVar.getText().length());
                jac.h(jacVar, jacVar.getMaxLengthForLabel(), jacVar.getText().length());
                return sbiVar;
            case 22:
                return ((PlaybackSettingsBottomSheet) obj2).s.format((Number) obj);
            case 23:
                ((c60) obj).x = (o5d) obj2;
                return sbiVar;
            case 24:
                zv8[] zv8VarArr2 = ProfileEditAdminPermissionsWidget.n;
                ((ProfileEditAdminPermissionsWidget) obj2).p1().I();
                return sbiVar;
            case 25:
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) obj2;
                zv8[] zv8VarArr3 = ProfileEditScreen.p;
                opl.b(profileEditScreen, 1).l(Collections.singletonList(new rp4(R.id.profile_edit_delete_profile_button, new tnh(R.string.oneme_profile_edit_delete_profile), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_delete), Integer.valueOf(R.attr.icon_negative)))).f((View) obj).b().build().u(profileEditScreen);
                return sbiVar;
            case 26:
                ku8 ku8Var = ProfileScreen.B;
                dvd dvdVarV1 = ((ProfileScreen) obj2).v1();
                mk0 mk0VarE = dvdVarV1.p1.e();
                if (mk0VarE != null) {
                    a8j.x(dvdVarV1.C, mk0VarE);
                }
                return sbiVar;
            case 27:
                ((hud) ((qud) obj2)).b.invoke((j8c) obj);
                return sbiVar;
            default:
                String str2 = (String) obj;
                Bundle extras = ((Intent) obj2).getExtras();
                return str2 + ":" + (extras != null ? extras.get(str2) : null);
        }
    }
}
