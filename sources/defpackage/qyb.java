package defpackage;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.a;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.polls.screens.result.PollResultScreen;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.media.SettingsMediaScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.settings.media.video.SettingMediaVideoScreen;
import one.me.settings.multilang.SettingsLocaleScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.stories.publish.PublishStoryBottomSheet;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qyb implements myb, u8g, v7, RTCStatsCollectorCallback, w6h, m57, qbf, vsf, d81, hch, y58, CallsAudioManager.OnAudioDeviceInfoChangeListener, zje, tve {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qyb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.m57
    public Widget a(String str, t3f t3fVar, ha9 ha9Var, a aVar, cf7 cf7Var) {
        PickerChatsTabWidget pickerChatsTabWidget = (PickerChatsTabWidget) this.b;
        zv8[] zv8VarArr = PickerChatsTabWidget.p;
        vv vvVar = pickerChatsTabWidget.a;
        zv8[] zv8VarArr2 = PickerChatsTabWidget.p;
        zv8 zv8Var = zv8VarArr2[0];
        t3f t3fVar2 = (t3f) vvVar.a(pickerChatsTabWidget);
        vv vvVar2 = pickerChatsTabWidget.b;
        zv8 zv8Var2 = zv8VarArr2[1];
        boolean zBooleanValue = ((Boolean) vvVar2.a(pickerChatsTabWidget)).booleanValue();
        vv vvVar3 = pickerChatsTabWidget.c;
        zv8 zv8Var3 = zv8VarArr2[2];
        py2 py2Var = (py2) vvVar3.a(pickerChatsTabWidget);
        vv vvVar4 = pickerChatsTabWidget.d;
        zv8 zv8Var4 = zv8VarArr2[3];
        PickerChatsListWidget pickerChatsListWidget = new PickerChatsListWidget(str, t3fVar2, py2Var, false, false, zBooleanValue, ((Boolean) vvVar4.a(pickerChatsTabWidget)).booleanValue(), 24, null);
        pickerChatsListWidget.p = aVar;
        if (pickerChatsListWidget.isAttached()) {
            pickerChatsListWidget.w1().setRecycledViewPool(aVar);
        }
        return pickerChatsListWidget;
    }

    @Override // defpackage.d81
    public void b(long j, long j2, long j3) {
        mvd mvdVar = (mvd) this.b;
        if (mvdVar.e == null) {
            return;
        }
        float fB0 = (j == -1 || j == 0) ? -1.0f : vqi.b0(j2, j);
        xs5 xs5Var = mvdVar.e;
        xs5Var.getClass();
        xs5Var.d(j, j2, fB0);
    }

    @Override // defpackage.u8g
    public void c(b8g b8gVar) {
        ykc ykcVar = (ykc) this.b;
        ykcVar.d.invoke(new xkc(b8gVar, ykcVar));
    }

    @Override // defpackage.tve
    public void d(pve pveVar, yve yveVar) {
        wif wifVar = (wif) this.b;
        Integer num = ((xke) yveVar).a;
        if (num != null) {
            xdd xddVar = wifVar.y;
            int iIntValue = num.intValue();
            xddVar.d = num;
            new k64(0, new iw2(xddVar, iIntValue, 7)).c(xddVar.b).a(new j66(0));
        }
    }

    @Override // defpackage.qbf
    public int e(int i) {
        Integer num;
        int i2 = this.a;
        Integer numValueOf = null;
        boolean z = false;
        Object obj = this.b;
        switch (i2) {
            case 6:
                i7d i7dVar = ((PollCreateScreen) obj).m;
                int f = ((o7d) ((k79) i7dVar.F(i))).getF();
                if (f != R.id.oneme_poll_create__title_item_viewtype) {
                    if (f == R.id.oneme_poll_create__add_answer_item_viewtype) {
                        return 3;
                    }
                    if (f == R.id.oneme_poll_create__answer_item_viewtype) {
                        Integer numValueOf2 = i >= i7dVar.l() - 1 ? null : Integer.valueOf(((o7d) ((k79) i7dVar.F(i + 1))).getF());
                        numValueOf = i > 0 ? Integer.valueOf(((o7d) ((k79) i7dVar.F(i - 1))).getF()) : null;
                        if ((numValueOf2 != null && numValueOf2.intValue() == f) || (numValueOf2 != null && numValueOf2.intValue() == R.id.oneme_poll_create__add_answer_item_viewtype)) {
                            z = true;
                        }
                        if ((numValueOf != null && numValueOf.intValue() == f) || z) {
                            if (numValueOf != null && numValueOf.intValue() == f) {
                                if (!z) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 1;
                        }
                    } else {
                        if (f != R.id.oneme_poll_create__setting_item_viewtype) {
                            return 0;
                        }
                        Integer numValueOf3 = i >= i7dVar.l() - 1 ? null : Integer.valueOf(((o7d) ((k79) i7dVar.F(i + 1))).getF());
                        numValueOf = i > 0 ? Integer.valueOf(((o7d) ((k79) i7dVar.F(i - 1))).getF()) : null;
                        if ((numValueOf != null && numValueOf.intValue() == f) || (numValueOf3 != null && numValueOf3.intValue() == f)) {
                            if (numValueOf != null && numValueOf.intValue() == f) {
                                if (numValueOf3 == null || numValueOf3.intValue() != f) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 1;
                        }
                    }
                }
                return 4;
            case 7:
                int f2 = ((e9d) ((k79) ((PollResultScreen) obj).j.F(i))).getF();
                int i3 = f2 & 536870911;
                if (i3 == 1 || i3 == 8) {
                    return 0;
                }
                if ((f2 & 536870912) != 0) {
                    return 1;
                }
                if ((f2 & 1073741824) != 0) {
                    return 2;
                }
                return (f2 & Integer.MIN_VALUE) != 0 ? 3 : 4;
            case 10:
                int f3 = ((vnd) ((k79) ((ProfileChangeLinkScreen) obj).g.F(i))).getF();
                if ((f3 & 536870911) == 2048) {
                    return 0;
                }
                if ((f3 & 536870912) != 0) {
                    return 1;
                }
                if ((f3 & 1073741824) != 0) {
                    return 2;
                }
                return (f3 & Integer.MIN_VALUE) != 0 ? 3 : 4;
            case 15:
                gyd gydVar = ((PublishStoryBottomSheet) obj).q;
                Integer numValueOf4 = Integer.valueOf(R.id.oneme_stories_preset_whitelist_item);
                if (i >= gydVar.l() - 1) {
                    num = null;
                } else {
                    num = numValueOf4;
                }
                if (i > 0) {
                    numValueOf = numValueOf4;
                }
                if (num != null && num.intValue() == R.id.oneme_stories_preset_whitelist_item) {
                    z = true;
                }
                if ((numValueOf == null || numValueOf.intValue() != R.id.oneme_stories_preset_whitelist_item) && !z) {
                    return 4;
                }
                if (numValueOf != null && numValueOf.intValue() == R.id.oneme_stories_preset_whitelist_item) {
                    return z ? 2 : 3;
                }
                return 1;
            case 24:
                ebf ebfVar = (ebf) ((k79) ((SettingMediaVideoScreen) obj).e.F(i));
                int iA = ebfVar.a();
                if (ebfVar.g()) {
                    return iA;
                }
                return 0;
            case 25:
                kbf kbfVar = (kbf) ((k79) ((SettingRingtoneScreen) obj).h.F(i));
                int iA2 = kbfVar.a();
                if (kbfVar.g()) {
                    return iA2;
                }
                return 0;
            case 26:
                ebf ebfVar2 = (ebf) ((k79) ((SettingsAutoSaveScreen) obj).e.F(i));
                int iA3 = ebfVar2.a();
                if (ebfVar2.g()) {
                    return iA3;
                }
                return 0;
            case 27:
                oaf oafVar = (oaf) ((k79) ((SettingsBatteryScreen) obj).f.F(i));
                int iA4 = oafVar.a();
                if (oafVar.g()) {
                    return iA4;
                }
                return 0;
            case 28:
                return ((yaf) ((k79) ((SettingsLocaleScreen) obj).j.F(i))).e;
            default:
                ebf ebfVar3 = (ebf) ((k79) ((SettingsMediaScreen) obj).g.F(i));
                int iA5 = ebfVar3.a();
                if (ebfVar3.g()) {
                    return iA5;
                }
                return 0;
        }
    }

    @Override // defpackage.hch
    public void f(dj0 dj0Var) {
        ((dee) this.b).v = dj0Var;
    }

    @Override // defpackage.myb
    public void g(int i) {
        ((aud) this.b).invoke(Integer.valueOf(i));
    }

    public Boolean h(int i) {
        k96 k96Var = (k96) this.b;
        ku8 ku8Var = ProfileScreen.B;
        return Boolean.valueOf((((frd) ((k79) ((dud) k96Var.getAdapter()).F(i))).getF() & 268435456) != 0);
    }

    public void i(j25 j25Var) {
        he2 he2Var;
        ghd ghdVar = (ghd) this.b;
        if (!(j25Var instanceof q1k) || (he2Var = ghdVar.h) == null) {
            return;
        }
        float f = ((q1k) j25Var).b;
        if (!he2Var.k()) {
            tvj.g("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!he2Var.x) {
            tvj.a("CameraController", "Pinch to zoom disabled.");
            return;
        }
        tvj.a("CameraController", "Pinch to zoom with scale: " + f);
        wxl.a();
        t1k t1kVar = (t1k) he2Var.A.d();
        if (t1kVar == null) {
            return;
        }
        he2Var.r(Math.min(Math.max(t1kVar.c() * (f > 1.0f ? c0a.c(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), t1kVar.b()), t1kVar.a()));
    }

    @Override // defpackage.zje
    public void o(long j, nmc nmcVar) {
        lkl.a(j, nmcVar, (kyh[]) ((xtj) this.b).c);
    }

    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.OnAudioDeviceInfoChangeListener
    public void onAudioDeviceChanged(CallsAudioManager.AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent) {
        ((l82) this.b).a(x6f.a(audioDeviceInfoChangedEvent.getOldDevice()), x6f.a(audioDeviceInfoChangedEvent.getNewDevice()));
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((jkg) this.b).a(new b1k(rTCStatsReport));
    }

    @Override // defpackage.y58
    public void p() {
        i4f i4fVar = (i4f) this.b;
        synchronized (i4fVar.b) {
            try {
                if (i4fVar.d == null) {
                    tvj.g("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                i4fVar.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v7
    public void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                P2pRelaySwitchTrigger.getConfigDisposable$lambda$0((P2pRelaySwitchTrigger) obj);
                break;
            case 8:
                xdd xddVar = (xdd) obj;
                if (((SharedPreferences) xddVar.c.getValue()).contains("estimatedPerformanceIndex")) {
                    xddVar.d = Integer.valueOf(((SharedPreferences) xddVar.c.getValue()).getInt("estimatedPerformanceIndex", 0));
                }
                break;
            default:
                RateManagerImpl._init_$lambda$0((RateManagerImpl) obj);
                break;
        }
    }
}
