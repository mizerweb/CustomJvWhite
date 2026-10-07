package defpackage;

import android.content.BroadcastReceiver;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import java.io.File;
import java.io.IOException;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.android.initialization.AccountInitializer;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.background.wake.BackgroundCheckReceiver;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.chatmedia.viewer.video.BaseVideoViewerWidget;
import one.me.main.accountswitcher.AccountSwitcherBottomSheet;
import one.me.mediapicker.crop.AspectRatiosBottomSheet;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.settings.AccountActionsBottomSheet;
import one.me.stories.edit.link.AddStoryLinkBottomSheet;
import one.me.stories.viewer.viewer.widgets.bottominfo.BottomStoryInfoWidget;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qo7 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qo7(bg2 bg2Var, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        this.a = 11;
        this.b = bg2Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        int i = this.a;
        int i2 = 0;
        range = null;
        range = null;
        Range range = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                vo7 vo7Var = (vo7) obj;
                try {
                    poeVar = qp0.b(new pp0.a().c(np0.n, new int[0]).d(vo7Var.b).a());
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    String str = vo7Var.i;
                    so7 so7Var = new so7(thA);
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "GoogleMlKit scanner scanner unavailable", so7Var);
                        }
                    }
                    mjg mjgVar = vo7Var.g;
                    e0e e0eVar = e0e.a;
                    mjgVar.getClass();
                    mjgVar.j(null, e0eVar);
                }
                return (op0) (poeVar instanceof poe ? null : poeVar);
            case 1:
                z zVar = (z) ((AboutAppSettingsScreen) obj).a.getAccessor().c(HttpStatus.SC_TEMPORARY_REDIRECT);
                return new y(zVar.a, zVar.b, zVar.c, zVar.d);
            case 2:
                r5 r5Var = (r5) ((AccountActionsBottomSheet) obj).v.getAccessor().c(902);
                r5Var.getClass();
                return new q5(r5Var.a, r5Var.b, r5Var.c, r5Var.d, r5Var.e, r5Var.f);
            case 3:
                q5 q5Var = (q5) obj;
                return yab.h0(q5Var.b, ((n0c) ((xhh) q5Var.g.getValue())).a(), 2, new m5(q5Var, null, 0));
            case 4:
                return (b78) c0a.j((AccountInitializer) obj, 702);
            case 5:
                ca2 ca2Var = ((AccountSwitcherBottomSheet) obj).u;
                return new o7(ca2Var.getAccessor().d(174), ca2Var.getAccessor().d(23), ca2Var.getAccessor().d(171), (ha9) ca2Var.getAccessor().c(30));
            case 6:
                y8 y8Var = (y8) obj;
                mjg mjgVarA = p90.a(null);
                e9i.j0(new fz6(e9i.F(mjgVarA, 200L), new w8(2, y8Var, y8.class, "updateAvailableActions", "updateAvailableActions(Ljava/lang/String;)V", 4, 0), 3), y8Var.b);
                return mjgVarA;
            case 7:
                AddChatMembersScreen addChatMembersScreen = (AddChatMembersScreen) obj;
                zv8[] zv8VarArr = AddChatMembersScreen.r;
                int i3 = uw8.a;
                if (uw8.b(uw8.c)) {
                    ml9.b(addChatMembersScreen);
                }
                return sbi.a;
            case 8:
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) obj;
                ifh ifhVarD = addLinkBottomSheet.m.getAccessor().d(792);
                String str2 = addLinkBottomSheet.n.c;
                if (str2 == null) {
                    str2 = "";
                }
                return new a69(ifhVarD, str2);
            case 9:
                return new wb(((xb) ((AddStoryLinkBottomSheet) obj).m.getAccessor().c(965)).a);
            case 10:
                AdminsFromContactsScreen adminsFromContactsScreen = (AdminsFromContactsScreen) obj;
                zv8[] zv8VarArr2 = AdminsFromContactsScreen.k;
                vv vvVar = adminsFromContactsScreen.b;
                zv8 zv8Var = AdminsFromContactsScreen.k[0];
                long jLongValue = ((Number) vvVar.a(adminsFromContactsScreen)).longValue();
                wtc wtcVar = adminsFromContactsScreen.a;
                return new je(jLongValue, (be) wtcVar.getAccessor().c(1067), wtcVar.a(), wtcVar.getAccessor().d(23));
            case 11:
                Range[] rangeArr = (Range[]) ((qb2) ((bg2) obj)).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null && rangeArr.length != 0) {
                    int length = rangeArr.length;
                    while (i2 < length) {
                        Range range2 = rangeArr[i2];
                        Integer numValueOf = (Integer) range2.getUpper();
                        Integer numValueOf2 = (Integer) range2.getLower();
                        if (((Number) range2.getUpper()).intValue() >= 1000) {
                            numValueOf = Integer.valueOf(((Number) range2.getUpper()).intValue() / 1000);
                        }
                        if (((Number) range2.getLower()).intValue() >= 1000) {
                            numValueOf2 = Integer.valueOf(((Number) range2.getLower()).intValue() / 1000);
                        }
                        Range range3 = new Range(numValueOf2, numValueOf);
                        Integer num = (Integer) range3.getUpper();
                        if (num != null && num.intValue() == 30 && (range == null || ((Number) range3.getLower()).intValue() < ((Number) range.getLower()).intValue())) {
                            range = range3;
                        }
                        i2++;
                    }
                }
                return range;
            case 12:
                return new we(0, (xe) obj);
            case 13:
                mv mvVar = (mv) ((AppearanceSettingsMultiThemeScreen) obj).b.getAccessor().c(937);
                mvVar.getClass();
                return new lv(mvVar.a, mvVar.b, mvVar.c, mvVar.d, mvVar.e, mvVar.f, mvVar.g, mvVar.h, mvVar.i, mvVar.j, mvVar.k);
            case 14:
                AspectRatiosBottomSheet aspectRatiosBottomSheet = (AspectRatiosBottomSheet) obj;
                mx mxVar = (mx) aspectRatiosBottomSheet.u.getAccessor().c(786);
                vv vvVar2 = aspectRatiosBottomSheet.v;
                zv8 zv8Var2 = AspectRatiosBottomSheet.x[0];
                Uri uri = (Uri) vvVar2.a(aspectRatiosBottomSheet);
                mxVar.getClass();
                return new lx(uri);
            case 15:
                a50 a50Var = (a50) obj;
                return new r6d((no4) a50Var.p.getValue(), (y8d) a50Var.q.getValue());
            case 16:
                dg0 dg0Var = (dg0) obj;
                return cqk.D(dg0Var.a, ((n0c) dg0Var.b).b().R0(1, "media-autosave"));
            case 17:
                int i4 = BackgroundCheckReceiver.a;
                ((BroadcastReceiver.PendingResult) obj).finish();
                return sbi.a;
            case 18:
                p4c p4cVar = (p4c) obj;
                String language = p4cVar.f.getLanguage();
                String languageTags = p4cVar.a.getResources().getConfiguration().getLocales().toLanguageTags();
                String strM = p4cVar.c.m();
                StringBuilder sbQ = qv1.q("onChanged configuration: userLocale:", language, "context: ", languageTags, "prefs lang");
                sbQ.append(strM);
                return sbQ.toString();
            case 19:
                ns0 ns0Var = (ns0) obj;
                if (Build.VERSION.SDK_INT >= 33) {
                    return new xe(ns0Var.b);
                }
                ore.k("It's impossible");
                return null;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr3 = BaseVideoViewerWidget.j;
                a6j a6jVarQ1 = ((BaseVideoViewerWidget) obj).q1();
                if (a6jVarQ1 != null) {
                    return a6jVarQ1.w0();
                }
                return null;
            case 21:
                return ((n0c) ((yt0) obj).f).a().R0(4, "read-chats-local-dispatcher");
            case 22:
                l01 l01Var = (l01) obj;
                rs6 rs6Var = (rs6) l01Var.a.getValue();
                String str3 = l01Var.c;
                ju6 ju6Var = (ju6) rs6Var;
                ju6Var.getClass();
                File[] fileArrListFiles = ju6.j(ju6Var.b(), "botCommands").listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    gm0.Y(str3, "deleteBotCommands: directory is empty");
                } else {
                    int length2 = fileArrListFiles.length;
                    while (i2 < length2) {
                        File file = fileArrListFiles[i2];
                        try {
                            file.delete();
                        } catch (IOException e) {
                            Object obj2 = file;
                            if (!gm0.c()) {
                                obj2 = null;
                            }
                            if (obj2 == null) {
                                obj2 = "*";
                            }
                            gm0.V(str3, "deleteBotCommands: fail to delete file " + obj2, e);
                        } catch (SecurityException e2) {
                            Object obj3 = file;
                            if (!gm0.c()) {
                                obj3 = null;
                            }
                            if (obj3 == null) {
                                obj3 = "*";
                            }
                            gm0.V(str3, "deleteBotCommands: security exception for file " + obj3, e2);
                        }
                        i2++;
                    }
                }
                return sbi.a;
            case 23:
                return Integer.valueOf(pq3.j.h((n01) obj).getText().h);
            case 24:
                return new fmd((jcd) ((z01) obj).s.getValue());
            case 25:
                x11 x11Var = (x11) ((BottomStoryInfoWidget) obj).c.getAccessor().c(956);
                x11Var.getClass();
                return new w11(x11Var.a, x11Var.b, x11Var.c, x11Var.d, x11Var.e, x11Var.f);
            case 26:
                CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) obj;
                kd1 kd1Var = (kd1) callBottomPanelWidget.e.getAccessor().c(857);
                return new jd1(new svj(callBottomPanelWidget, 1), (h02) callBottomPanelWidget.d.getValue(), kd1Var.a, kd1Var.b, kd1Var.c, kd1Var.d, kd1Var.e, kd1Var.f, kd1Var.g);
            case 27:
                yd1 yd1Var = (yd1) obj;
                Drawable drawableMutate = yd1Var.getContext().getDrawable(((vd1) yd1Var.b).a).mutate();
                pq3.j.l(yd1Var);
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                return drawableMutate;
            case 28:
                ce1 ce1Var = (ce1) obj;
                return new qk0(ce1Var.a.getDrawable(R.drawable.icon_call_fill).mutate(), awb.a, ce1Var.a, new vi2(24), new vi2(25), 32);
            default:
                String str4 = ((dl1) obj).l;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4c.f(a4cVar2, je9.g, str4, "Didn't updated calls adapter after 5 times, too much computing!", null, null, 8);
                }
                return sbi.a;
        }
    }

    public /* synthetic */ qo7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
