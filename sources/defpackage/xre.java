package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.hardware.camera2.CameraCharacteristics;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;
import one.me.settings.multilang.SettingsLocaleScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.video.transloader.task.TranscodeTask;
import one.video.transloader.task.UploadTask;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xre implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xre(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        ConversationParticipant me2;
        ParticipantId externalId;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        fu1 fu1VarA = null;
        switch (this.a) {
            case 0:
                Map map = (Map) this.b;
                ose oseVar = (ose) this.c;
                for (Map.Entry entry : map.entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    vja vjaVar = (vja) entry.getValue();
                    ch3.G(((toa) oseVar.h()).a, false, true, new zna(jLongValue, vjaVar.a, vjaVar.b, 1));
                }
                return sbi.a;
            case 1:
                Map map2 = (Map) this.b;
                sse sseVar = (sse) this.c;
                for (Map.Entry entry2 : map2.entrySet()) {
                    ch3.G(sseVar.b().a, false, true, new u14(((Number) entry2.getValue()).longValue(), (String) entry2.getKey(), 4));
                }
                return sbi.a;
            case 2:
                Context context = (Context) this.b;
                wue wueVar = (wue) this.c;
                v0c v0cVar = new v0c(context);
                v0cVar.setId(R.id.call_round_btn_counter);
                wueVar.setMinWidth(gm0.K(yl5.c() * 20.0f));
                wueVar.setMinHeight(gm0.K(yl5.c() * 20.0f));
                v0cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                pq3.j.l(v0cVar);
                v0cVar.setTextColor(-1);
                v0cVar.setVisibility(8);
                return v0cVar;
            case 3:
                s4f s4fVar = (s4f) this.b;
                RecordManager.StopParams stopParams = (RecordManager.StopParams) this.c;
                m4f m4fVar = ((t4f) s4fVar.k.getValue()).b;
                fu1 fu1Var = m4fVar != null ? m4fVar.c : null;
                Conversation conversationA = ((ms4) s4fVar.b.getValue()).a();
                if (conversationA != null && (me2 = conversationA.getMe()) != null && (externalId = me2.getExternalId()) != null) {
                    fu1VarA = anc.a(externalId);
                }
                if (fu1Var != null && fu1Var.equals(fu1VarA)) {
                    ((ya1) ((da1) s4fVar.d.getValue())).s.a(new vd(stopParams.getRemoveRecord()));
                }
                return sbi.a;
            case 4:
                SelectCountryBottomSheet selectCountryBottomSheet = (SelectCountryBottomSheet) this.b;
                Bundle bundle = (Bundle) this.c;
                pdf pdfVar = (pdf) selectCountryBottomSheet.m.getAccessor().c(346);
                return new odf((x0c) ((Parcelable) tre.f0(bundle, "add_country", x0c.class)), pdfVar.a, pdfVar.b);
            case 5:
                noh nohVar = (noh) this.b;
                ihf ihfVar = (ihf) this.c;
                TextPaint textPaint = new TextPaint();
                Context context2 = ihfVar.a;
                nohVar.a(context2, textPaint, context2.getResources().getDisplayMetrics(), (bx5) ihfVar.f.getValue());
                return textPaint;
            case 6:
                cyb cybVar = (cyb) this.b;
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) this.c;
                zv8[] zv8VarArr = ServerPortBottomSheet.y;
                ml9.d(cybVar);
                serverPortBottomSheet.v1(true);
                return sbi.a;
            case 7:
                u8b u8bVar = (u8b) this.b;
                xpf xpfVar = (xpf) this.c;
                Object[] objArr = u8bVar.a;
                int i = u8bVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    File file = (File) objArr[i2];
                    xpfVar.m.put(file.getAbsolutePath(), file);
                }
                return sbi.a;
            case 8:
                Context context3 = (Context) this.b;
                cqf cqfVar = (cqf) this.c;
                TextView textView = new TextView(context3);
                q9i.a(q9i.k, textView);
                cqfVar.addView(textView);
                return textView;
            case 9:
                ft0 ft0Var = (ft0) this.b;
                az0 az0Var = (az0) this.c;
                long j = az0Var.a;
                String str = az0Var.c;
                SettingsBlacklistScreen settingsBlacklistScreen = (SettingsBlacklistScreen) ft0Var.a;
                zv8[] zv8VarArr2 = SettingsBlacklistScreen.h;
                brf brfVarO1 = settingsBlacklistScreen.o1();
                brfVarO1.getClass();
                Bundle bundle2 = new Bundle(0);
                bundle2.putLong("user_unblock_id", j);
                a8j.x(brfVarO1.p, new tpf(new vnh(R.string.oneme_settings_privacy_black_list_dialog_title, a.n1(new Object[]{str})), xw3.P0(new spf(R.id.oneme_settings_privacy_black_list_unblock_action, new tnh(R.string.oneme_settings_privacy_black_list_dialog_unblock), true), new spf(R.id.oneme_settings_privacy_black_list_unblock_cancel_action, new tnh(R.string.oneme_settings_privacy_black_list_cancel), false)), null, bundle2, 4));
                return sbi.a;
            case 10:
                Bundle bundle3 = (Bundle) this.b;
                SettingsLocaleScreen settingsLocaleScreen = (SettingsLocaleScreen) this.c;
                zv8[] zv8VarArr3 = SettingsLocaleScreen.k;
                String string = bundle3.getString("new_lang", null);
                tc9 tc9Var = (tc9) settingsLocaleScreen.c.getAccessor().c(323);
                return new sc9(string, tc9Var.a, tc9Var.b, tc9Var.c, tc9Var.d);
            case 11:
                a0d a0dVar = (a0d) this.b;
                SetupPinCodeScreen setupPinCodeScreen = (SetupPinCodeScreen) this.c;
                ml9.d(a0dVar);
                ltb onBackPressedDispatcher = setupPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbi.a;
            case 12:
                ShareDataPickerScreen shareDataPickerScreen = (ShareDataPickerScreen) this.b;
                tha thaVar = (tha) this.c;
                zv8[] zv8VarArr4 = ShareDataPickerScreen.C;
                ((vxf) shareDataPickerScreen.x1().d).g(thaVar.getText(), (m8b) shareDataPickerScreen.x1().i.a.getValue());
                return sbi.a;
            case 13:
                ShareDataPickerScreen shareDataPickerScreen2 = (ShareDataPickerScreen) this.b;
                View view = (View) this.c;
                zv8[] zv8VarArr5 = ShareDataPickerScreen.C;
                ((vxf) shareDataPickerScreen2.x1().d).t.a(yka.d);
                lvb.H(view, ShareDataPickerScreen.D, null);
                shareDataPickerScreen2.A1().setLeftIcon(R.drawable.icon_sticker);
                return sbi.a;
            case 14:
                zyf zyfVar = (zyf) this.b;
                mxf mxfVar = (mxf) this.c;
                zyfVar.g.invoke(new fna(mxfVar.h, mxfVar));
                return sbi.a;
            case 15:
                iaa iaaVar = (iaa) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                synchronized (tzf.b) {
                    LinkedHashMap linkedHashMap = tzf.c;
                    linkedHashMap.remove(iaaVar);
                    if (linkedHashMap.isEmpty()) {
                        n1g.x().p(byj.a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(tzf.a);
                        tzf.f = null;
                        tzf.d = null;
                        tzf.e = false;
                    }
                    break;
                }
                return sbi.a;
            case 16:
                return ((us5) this.b).invoke(((r8e) this.c).a.getValue());
            case 17:
                return StereoRoomHandsQueueImpl.loadMoreElements$lambda$0((cf7) this.b, (StereoRoomHandsQueueImpl) this.c);
            case 18:
                return StereoRoomHandsQueueImpl.onHandUp$lambda$0((k62) this.b, (StereoRoomHandsQueueImpl) this.c);
            case 19:
                return StereoRoomManagerImpl.onAttendee$lambda$0((StereoRoomManagerImpl) this.b, (i62) this.c);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zng zngVar = (zng) this.b;
                wmg wmgVar = (wmg) this.c;
                omg omgVar = zngVar.w;
                if (omgVar != null) {
                    switch (wmgVar.a) {
                        case 0:
                            KeyboardStickersWidget keyboardStickersWidget = ((zw8) ((nj1) wmgVar.b).h).a;
                            zv8[] zv8VarArr6 = KeyboardStickersWidget.l;
                            tpg tpgVarQ1 = keyboardStickersWidget.q1();
                            tpgVarQ1.q.B(tpgVarQ1, tpg.u[1], yab.h0(tpgVarQ1.b, ((n0c) tpgVarQ1.c).b(), 2, new p7g(tpgVarQ1, omgVar, (lq4) null, 6)));
                            break;
                        default:
                            StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) ((bog) wmgVar.b).h.a;
                            zv8[] zv8VarArr7 = StickersShowcaseScreen.m;
                            zog zogVarP1 = stickersShowcaseScreen.p1();
                            mw mwVar = zogVarP1.p;
                            long j2 = omgVar.a;
                            vo8 vo8Var = (vo8) mwVar.get(Long.valueOf(j2));
                            if (vo8Var == null || !vo8Var.isActive()) {
                                mwVar.put(Long.valueOf(j2), a8j.t(zogVarP1, ((n0c) zogVarP1.f).b(), new tt6(zogVarP1, omgVar, null, 3), 2));
                            }
                            break;
                    }
                }
                return sbi.a;
            case 21:
                pbh pbhVar = (pbh) this.b;
                List list = (List) this.c;
                bh0 bh0Var = v4h.a;
                bg2 bg2Var = pbhVar.a;
                if (Build.VERSION.SDK_INT >= 33) {
                    long[] jArr = (long[]) ((qb2) bg2Var).c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
                    if (jArr != null && jArr.length != 0) {
                        HashSet hashSet = new HashSet();
                        for (long j3 : jArr) {
                            hashSet.add(Long.valueOf(j3));
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!hashSet.contains(Long.valueOf(((tbh) it.next()).c.a))) {
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                return uel.b((fy0) ((ny8) this.b).getValue(), ((seh) this.c).h, R.drawable.icon_reply_fill);
            case 23:
                SwipeWidget swipeWidget = (SwipeWidget) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                je9 je9Var = je9.d;
                br4 br4VarR1 = swipeWidget.r1();
                View view2 = br4VarR1.getView();
                if (view2 == null) {
                    String str2 = swipeWidget.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "getUnderlyingViewProvider: underlying view is null, inflating new one", null);
                    }
                    zv8[] zv8VarArr8 = kr4.a;
                    view2 = br4VarR1.inflate(viewGroup);
                }
                if (view2.getParent() == null) {
                    String str3 = swipeWidget.a;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str3, "getUnderlyingViewProvider: underlying view is not attached, adding it to container", null);
                    }
                    viewGroup.addView(view2, viewGroup.indexOfChild(viewGroup.findViewById(R.id.swipe_fade)));
                }
                return view2;
            case 24:
                gph gphVar = (gph) this.b;
                Context context4 = (Context) this.c;
                Integer num = gphVar.b;
                if (num == null) {
                    return null;
                }
                Paint paint = new Paint(1);
                paint.setColorFilter(new PorterDuffColorFilter(oc9.Z(num.intValue(), pq3.j.e(context4).m()), PorterDuff.Mode.SRC_IN));
                return paint;
            case 25:
                TranscodeTask transcodeTask = (TranscodeTask) this.b;
                return "Transcode state update: " + transcodeTask.j + " -> " + ((e0i) this.c);
            case 26:
                return "Transcode finished with result " + ((yzh) this.b) + " when transcode task is already in terminal state: " + ((TranscodeTask) this.c).j;
            case 27:
                return "Transcode finished, result: " + ((yzh) this.b) + ", newFileSize: " + ((Long) this.c);
            case 28:
                rj5 rj5Var = (rj5) this.b;
                yzh yzhVar = (yzh) this.c;
                TranscodeTask transcodeTask2 = (TranscodeTask) rj5Var.b;
                boolean zB = transcodeTask2.b();
                ze9 ze9Var = transcodeTask2.a;
                if (zB) {
                    ze9Var.f("TranscodeTask", new xre(yzhVar, 26, transcodeTask2));
                } else {
                    Long lA = TranscodeTask.a(transcodeTask2);
                    ze9Var.j("TranscodeTask", new xre(yzhVar, 27, lA));
                    transcodeTask2.i = null;
                    wzh wzhVar = new wzh(yzhVar.a, yzhVar.b, yzhVar.c, yzhVar.d, yzhVar.e, yzhVar.f, yzhVar.g);
                    if (lA != null) {
                        transcodeTask2.c(new a0i(wzhVar, lA.longValue()));
                    }
                }
                return sbi.a;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                UploadTask uploadTask = (UploadTask) this.c;
                sbi sbiVar = sbi.a;
                if (!atomicBoolean.get()) {
                    uploadTask.a();
                }
                return sbiVar;
        }
    }
}
