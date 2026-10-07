package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.text.format.DateFormat;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.calls.ui.drawable.SavedGroupCallIconDrawable;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.media.SettingsMediaScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.settings.media.video.SettingMediaVideoScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stories.core.workers.SaveStoryToGalleryWorker;
import one.me.stories.edit.SingleMediaViewerWidget;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.tamtam.messages.a;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ize implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ize(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x037c  */
    @Override // defpackage.af7
    public final Object invoke() {
        sfa sfaVarA;
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf((Long.hashCode(((SaveStoryToGalleryWorker) obj).b.b.c("storyId", 0L)) * 31) - 155644628);
            case 1:
                return SavedGroupCallIconDrawable.backgroundSpec_delegate$lambda$0((SavedGroupCallIconDrawable) obj);
            case 2:
                ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = (ScheduledSendPickerBottomSheet) obj;
                vv vvVar = scheduledSendPickerBottomSheet.w;
                zv8 zv8Var = ScheduledSendPickerBottomSheet.D[1];
                Long l = (Long) vvVar.a(scheduledSendPickerBottomSheet);
                wtc wtcVar = scheduledSendPickerBottomSheet.u;
                return new t2f(l, (xhh) wtcVar.getAccessor().c(23), wtcVar.getAccessor().d(7));
            case 3:
                String string = ((Context) ((t2f) obj).g.getValue()).getString(R.string.tt_dates_today);
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = string.charAt(0);
                    sb.append((Object) (Character.isLowerCase(cCharAt) ? tre.H0(cCharAt, Locale.getDefault()) : String.valueOf(cCharAt)));
                    sb.append(string.substring(1));
                    string = sb.toString();
                }
                return new yk7(string);
            case 4:
                ldf ldfVar = SelectCountryBottomSheet.s;
                r1c r1cVar = new r1c(((SelectCountryBottomSheet) obj).getContext());
                r1cVar.setIcon(R.drawable.icon_globe_tag_fill);
                r1cVar.setTitle(new tnh(R.string.oneme_countries_empty_view_title));
                r1cVar.setTitleGravity(17);
                r1cVar.setSubtitle(new tnh(R.string.oneme_countries_empty_view_subtitle));
                r1cVar.setBackgroundShineDrawable(R.attr.background_card);
                r1cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                return r1cVar;
            case 5:
                return (bx5) ((o1c) ((ihf) obj).e.getValue()).a.getValue();
            case 6:
                jhf jhfVar = new jhf(((lhf) obj).a.getContext());
                jhfVar.setId(R.id.messages_list_item_title);
                jhfVar.setWillNotDraw(false);
                return jhfVar;
            case 7:
                h hVar = ((ServerHostBottomSheet) obj).u;
                return new b08(hVar.getAccessor().d(100), hVar.getAccessor().d(101), hVar.getAccessor().d(23), (Context) hVar.getAccessor().c(7));
            case 8:
                h hVar2 = ((ServerPortBottomSheet) obj).u;
                return new hcd(hVar2.getAccessor().d(23), hVar2.getAccessor().d(85), hVar2.getAccessor().d(326));
            case 9:
                rkf rkfVar = (rkf) obj;
                qfa qfaVarR = rkfVar.r();
                long j = rkfVar.c;
                sfa sfaVarL = qfaVarR.l(j);
                if (sfaVarL != null) {
                    long j2 = sfaVarL.h;
                    if (sfaVarL.j == wja.DELETED) {
                        gm0.Y(rkf.class.getName(), "Early return in onMaxTimeout cuz of messageDb == null || messageDb.status == MessageStatus.DELETED");
                    } else {
                        e70 e70VarK = sfaVarL.k(y60.m);
                        if (e70VarK != null) {
                            rkfVar.r().p(sfaVarL, xfa.ERROR);
                            qfa qfaVarR2 = rkfVar.r();
                            String str = e70VarK.t;
                            qfaVarR2.getClass();
                            pfa pfaVar = new pfa(qfaVarR2, 1);
                            qfaVarR2.a.submit(new sc2(qfaVarR2, sfaVarL, str, pfaVar, 8));
                            try {
                                f70 f70VarP = sfaVarL.n.p();
                                vvk.e(f70VarP, str, pfaVar);
                                rfa rfaVarC0 = sfaVarL.c0();
                                rfaVarC0.n = f70VarP.c();
                                sfaVarA = rfaVarC0.a();
                            } catch (Throwable unused) {
                                gm0.q("qfa", "Can't update attach localId = " + str);
                                sfaVarA = sfaVarL;
                            }
                            a aVar = (a) qfaVarR2.g.get();
                            sfa sfaVarA2 = sfaVarA.c0().a();
                            aVar.getClass();
                            a.a(aVar, sfaVarA2);
                            rkfVar.w().c(new kfi(sfaVarL.h, rkfVar.c, false));
                            rkfVar.q().getClass();
                        } else {
                            gm0.Y(rkfVar.e, "Reach max timeout: WTF, no location attach in message");
                            qfa qfaVarR3 = rkfVar.r();
                            qfaVarR3.getClass();
                            qfaVarR3.c(j2, Collections.singletonList(Long.valueOf(j)));
                            rkfVar.w().c(new j3b(j2, Collections.singletonList(Long.valueOf(j)), sfaVarL.H));
                        }
                    }
                    break;
                } else {
                    gm0.Y(rkf.class.getName(), "Early return in onMaxTimeout cuz of messageDb == null || messageDb.status == MessageStatus.DELETED");
                }
                return sbiVar;
            case 10:
                rnf rnfVar = (rnf) obj;
                while (true) {
                    ArrayList arrayList = rnfVar.l;
                    if (i2 >= arrayList.size()) {
                        return sbiVar;
                    }
                    ylc ylcVar = (ylc) arrayList.get(i2);
                    if (((Boolean) ylcVar.b).booleanValue()) {
                        i2++;
                    } else {
                        arrayList.remove(i2);
                        rnfVar.j.remove(ylcVar.a);
                    }
                }
                break;
            case 11:
                jpf jpfVar = (jpf) ((SettingMediaVideoScreen) obj).c.getAccessor().c(387);
                jpfVar.getClass();
                return new ipf(jpfVar.a, jpfVar.b);
            case 12:
                return (AudioManager) ((xpf) obj).C().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 13:
                ypf ypfVar = (ypf) obj;
                w78 w78VarD = w78.d(Uri.parse(ypfVar.a));
                int i3 = ypfVar.c;
                int i4 = ypfVar.d;
                w78VarD.d = new bne(i3, i4, 0.0f, 12);
                deh dehVar = new deh(4);
                dehVar.d = i3;
                dehVar.e = i4;
                w78VarD.f = new eeh(dehVar);
                return w78VarD.a();
            case 14:
                SettingsAutoSaveScreen settingsAutoSaveScreen = (SettingsAutoSaveScreen) obj;
                hqf hqfVar = (hqf) settingsAutoSaveScreen.c.getAccessor().c(385);
                er3 er3Var = qf0.d;
                vv vvVar2 = settingsAutoSaveScreen.b;
                zv8 zv8Var2 = SettingsAutoSaveScreen.g[0];
                String str2 = (String) vvVar2.a(settingsAutoSaveScreen);
                er3Var.getClass();
                return new gqf(er3.E(str2), hqfVar.a, hqfVar.b, hqfVar.c);
            case 15:
                yqf yqfVar = (yqf) ((SettingsBatteryScreen) obj).c.getAccessor().c(308);
                yqfVar.getClass();
                return new xqf(yqfVar.a, yqfVar.b, yqfVar.c, yqfVar.d);
            case 16:
                wtc wtcVar2 = ((SettingsBlacklistScreen) obj).c;
                crf crfVar = (crf) wtcVar2.getAccessor().c(375);
                fz0 fz0Var = new fz0(wtcVar2.getAccessor().d(116), wtcVar2.getAccessor().d(23));
                crfVar.getClass();
                return new brf(fz0Var, crfVar.a, crfVar.b, crfVar.c, crfVar.d, crfVar.e, crfVar.f, crfVar.g);
            case 17:
                fuf fufVar = (fuf) ((SettingsMediaScreen) obj).c.getAccessor().c(384);
                fufVar.getClass();
                return new euf(fufVar.a, fufVar.b, fufVar.c, fufVar.d, fufVar.e, fufVar.f, fufVar.g, fufVar.h, fufVar.i);
            case 18:
                hvf hvfVar = (hvf) ((SettingsPrivacyScreen) obj).d.getAccessor().c(368);
                hvfVar.getClass();
                return new gvf(hvfVar.a, hvfVar.b, hvfVar.c, hvfVar.d, hvfVar.e, hvfVar.f, hvfVar.g, hvfVar.h, hvfVar.i, hvfVar.j, hvfVar.k, hvfVar.l, hvfVar.m);
            case 19:
                lwf lwfVar = (lwf) ((SettingsStorageScreen) obj).a.getAccessor().c(314);
                lwfVar.getClass();
                return new kwf(lwfVar.b, lwfVar.c, lwfVar.d, lwfVar.e, lwfVar.a);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                owf owfVar = (owf) new wtc(((SetupPinCodeScreen) obj).m35getAccountScopeuqN4xOY()).getAccessor().c(383);
                owfVar.getClass();
                return new nwf(owfVar.a, owfVar.b);
            case 21:
                return y5g.a((y5g) obj);
            case 22:
                z6g z6gVar = (z6g) obj;
                ConversationParams conversationParams = z6gVar.k;
                if (conversationParams != null || z6gVar.e) {
                    return v7g.e(conversationParams != null ? new xgc(conversationParams) : xgc.b);
                }
                OkApiServiceInternal okApiServiceInternal = z6gVar.i;
                boolean z = z6gVar.d;
                return okApiServiceInternal.getConversationParams(null, !z, z ? ((qs4) z6gVar.j).b : null).f(dul.m);
            case 23:
                zv8[] zv8VarArr = SingleMediaViewerWidget.f;
                e3j e3jVar = ((w8g) ((SingleMediaViewerWidget) obj).c.getValue()).get();
                e3jVar.o0(false);
                return e3jVar;
            case 24:
                ic6 ic6Var = ((xhg) obj).t;
                ohg.b.getClass();
                a8j.x(ic6Var, new i65(":call-history-info?is_link_call=true"));
                return sbiVar;
            case 25:
                return ((gig) obj).getContext().getDrawable(R.drawable.icon_services).mutate();
            case 26:
                StartRecordBottomSheet startRecordBottomSheet = (StartRecordBottomSheet) obj;
                return new iig((h02) startRecordBottomSheet.u.getValue(), ((jig) startRecordBottomSheet.v.getAccessor().c(849)).a);
            case 27:
                return ((p32) ((iig) obj).d.getValue()).a.getString(R.string.call_record_review_name, DateFormat.format("d MMMM", new Date()));
            case 28:
                return (y3f) obj;
            default:
                sog sogVar = (sog) ((StickersSettingsScreen) obj).b.getAccessor().c(398);
                sogVar.getClass();
                return new rog(sogVar.a, sogVar.b, sogVar.c, sogVar.d, sogVar.e, sogVar.f, sogVar.g);
        }
    }
}
