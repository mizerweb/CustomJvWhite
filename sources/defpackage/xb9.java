package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xb9 extends s7f {
    public static final /* synthetic */ zv8[] g1 = {new z8b(xb9.class, "phoneCode", "getPhoneCode()Ljava/lang/String;"), zo5.e(zfe.a, xb9.class, "phoneNumber", "getPhoneNumber()Ljava/lang/String;"), new z8b(xb9.class, "locationCountryCode", "getLocationCountryCode()Ljava/lang/String;"), new z8b(xb9.class, "serverHost", "getServerHost()Ljava/lang/String;"), new z8b(xb9.class, "serverPort", "getServerPort()Ljava/lang/String;"), new z8b(xb9.class, "useTls", "getUseTls()Z"), new z8b(xb9.class, "loginFailError", "getLoginFailError()Ljava/lang/String;"), new z8b(xb9.class, "isDevOptionsRoaming", "isDevOptionsRoaming()Z"), new z8b(xb9.class, "dontShowAddUserToCallChatConfirmation", "getDontShowAddUserToCallChatConfirmation()Z"), new z8b(xb9.class, "videoPlayQuality", "getVideoPlayQuality()I"), new z8b(xb9.class, "lastPushAlertTime", "getLastPushAlertTime()J"), new z8b(xb9.class, "isFullContactsSyncCompleted", "isFullContactsSyncCompleted()Z"), new z8b(xb9.class, "isOkPushDisabled", "isOkPushDisabled()Z"), new z8b(xb9.class, "isDisableWebAppSsl", "isDisableWebAppSsl()Z"), new z8b(xb9.class, "isDisableInAppReviewTimeCondition", "isDisableInAppReviewTimeCondition()Z"), new z8b(xb9.class, "isEnableInAppReviewNotFromMarketBuild", "isEnableInAppReviewNotFromMarketBuild()Z"), new z8b(xb9.class, "isDebugProfileInfoEnabled", "isDebugProfileInfoEnabled()Z"), new z8b(xb9.class, "statSessionId", "getStatSessionId()J"), new z8b(xb9.class, "versionForceUpdateReceived", "getVersionForceUpdateReceived()Ljava/lang/String;"), new z8b(xb9.class, "isDebugFresco", "isDebugFresco()Z"), new z8b(xb9.class, "isWebAppFullscreen", "isWebAppFullscreen()Z"), new z8b(xb9.class, "isOnboardedAuthorVisibilityOnForward", "isOnboardedAuthorVisibilityOnForward()Z"), new z8b(xb9.class, "isAudioOnboardingEnded", "isAudioOnboardingEnded()Z"), new z8b(xb9.class, "isCallsDebugMenuEnabled", "isCallsDebugMenuEnabled()Z"), new z8b(xb9.class, "isCallHoldButtonEnabled", "isCallHoldButtonEnabled()Z"), new z8b(xb9.class, "isProfileMigrationComplete", "isProfileMigrationComplete()Z"), new z8b(xb9.class, "showedScheduledMessagesOnboarding", "getShowedScheduledMessagesOnboarding()Z"), new z8b(xb9.class, "lastPermissionRequestTime", "getLastPermissionRequestTime()J"), new z8b(xb9.class, "informerBannersShowDuration", "getInformerBannersShowDuration-UwyO8pc()J"), new z8b(xb9.class, "incomingCallRingtone", "getIncomingCallRingtone()Ljava/util/Map;"), new z8b(xb9.class, "callChangeModeSwipeUsed", "getCallChangeModeSwipeUsed()Z"), new z8b(xb9.class, "mediaAutoSaveSettings", "getMediaAutoSaveSettings()Lone/me/sdk/prefs/models/media/MediaAutoSaveSettings;"), new z8b(xb9.class, "informerBannersSync", "getInformerBannersSync()J"), new z8b(xb9.class, "foldersSync", "getFoldersSync()J"), new z8b(xb9.class, "complainReasonsSync", "getComplainReasonsSync()J"), new z8b(xb9.class, "isVideoDebugViewAvailable", "isVideoDebugViewAvailable()Z"), new dwd(xb9.class, "allowLogSensitiveData", "getAllowLogSensitiveData()Lkotlinx/coroutines/flow/MutableStateFlow;", 0), new z8b(xb9.class, "ignoreBatteryOptimizationsRequestCount", "getIgnoreBatteryOptimizationsRequestCount()I"), new z8b(xb9.class, "hasMissedCallsAlertShownTime", "getHasMissedCallsAlertShownTime()J"), new z8b(xb9.class, "isMissedCallsAlertRead", "isMissedCallsAlertRead()Z"), new z8b(xb9.class, "videoPlaybackSpeed", "getVideoPlaybackSpeed()F"), new z8b(xb9.class, "isTranscriptionOnboardingEnded", "isTranscriptionOnboardingEnded()Z"), new z8b(xb9.class, "isCommentsOnboardingEnded", "isCommentsOnboardingEnded()Z"), new dwd(xb9.class, "audioVideoMessagePlaybackSpeed", "getAudioVideoMessagePlaybackSpeed()Lkotlinx/coroutines/flow/MutableStateFlow;", 0), new z8b(xb9.class, "gostLicenseCheckEnabled", "getGostLicenseCheckEnabled()Z"), new z8b(xb9.class, "channelsFolderHighlightFirstShownTime", "getChannelsFolderHighlightFirstShownTime()Ljava/lang/Long;"), new z8b(xb9.class, "digitalIdOnboardingFirstShownTime", "getDigitalIdOnboardingFirstShownTime()Ljava/lang/Long;"), new z8b(xb9.class, "lastTimeUpdateDialogShowing", "getLastTimeUpdateDialogShowing()J"), new dwd(xb9.class, "leakCanaryEnabledStateFlow", "getLeakCanaryEnabledStateFlow()Lkotlinx/coroutines/flow/MutableStateFlow;", 0), new dwd(xb9.class, "isIgnoringTranscodeCaching", "isIgnoringTranscodeCaching()Z", 0), new dwd(xb9.class, "isForcingVideoAutoLoad", "isForcingVideoAutoLoad()Z", 0), new z8b(xb9.class, "isLogoutStarted", "isLogoutStarted()Z")};
    public final gvb A0;
    public final gvb B0;
    public final gvb C0;
    public final gvb D0;
    public final gvb E0;
    public final gvb F0;
    public final gvb G0;
    public final gvb H0;
    public final gvb I0;
    public final gvb J0;
    public final gvb K0;
    public final gvb L0;
    public final gvb M0;
    public final qg7 N0;
    public final gvb O0;
    public final gvb P0;
    public final gvb Q0;
    public final gvb R0;
    public final n3 S0;
    public final gvb T0;
    public final gvb U0;
    public final gvb V0;
    public final gvb W0;
    public final gvb X0;
    public final gvb Y0;
    public final n3 Z0;
    public final gvb a1;
    public final gvb b1;
    public final gvb c1;
    public final gvb d1;
    public final gvb e1;
    public final gvb f1;
    public final ny8 k0;
    public final gvb l0;
    public final gvb m0;
    public final gvb n0;
    public final gvb o0;
    public final gvb p0;
    public final gvb q0;
    public final gvb r0;
    public final gvb s0;
    public final gvb t0;
    public final gvb u0;
    public final gvb v0;
    public final gvb w0;
    public final gvb x0;
    public final gvb y0;
    public final gvb z0;

    public xb9(Context context, cs6 cs6Var, ha9 ha9Var, ny8 ny8Var, ny8 ny8Var2) {
        super(context, ha9Var.a("user", "prefs"), cs6Var, ny8Var2);
        this.k0 = ny8Var;
        this.l0 = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "user.Phone.Code");
        this.m0 = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "user.Phone");
        this.n0 = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "app.location.country.code");
        this.o0 = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "server.host");
        this.p0 = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "server.port");
        Boolean bool = Boolean.TRUE;
        this.q0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "server.useTls");
        this.r0 = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "server.loginError");
        Boolean bool2 = Boolean.FALSE;
        new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "user.dev.options.roaming");
        this.s0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.call.add.dontshowconfirmation");
        zfe.a(Integer.class);
        this.t0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.last.push.alert.time");
        this.u0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.full.contacts.sync.completed");
        this.v0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "ok_push_disabled");
        this.w0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "web_app:ssl_check");
        this.x0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.disable_in_app_review_time_condition");
        this.y0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.enable_in_app_review_not_from_market_build");
        this.z0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.debug.profile.info.enabled");
        this.A0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.stats.session.id");
        this.B0 = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "version.force.update.received");
        this.C0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.debug.fresco");
        this.D0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.toggle.webapp_fullscreen");
        this.E0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.onboarding.author_visibility");
        this.F0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.audio_onboarding_ended");
        this.G0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.calls_sdk.debug.debug_menu");
        this.H0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.calls.hold_button_enabled");
        zfe.a(Boolean.class);
        this.I0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "user.onboarding.scheduled_messages");
        this.J0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) (-1L), "app.calls.permission_request_time");
        ghb ghbVar = ew5.b;
        ew5 ew5Var = new ew5(qe7.O(0, lw5.NANOSECONDS));
        this.K0 = new gvb(zfe.a(ew5.class), (SharedPreferences) this.d, (Object) ew5Var, "app.informer_banners.show_duration");
        this.L0 = new gvb(zfe.a(Map.class), (SharedPreferences) this.d, (Object) s66.a, "app.calls.incoming.ringtone");
        this.M0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.calls.change_mode_swipe_used");
        this.N0 = new qg7(this, 7, new qq9(r66.a));
        this.O0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.informer_banners.sync");
        this.P0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "folders_sync");
        this.Q0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.complain_reasons.sync");
        this.R0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.video.debug.view");
        this.S0 = new n3("app.logging.sensitive", bool2, this.d, this.b, zfe.a(Boolean.class));
        this.T0 = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 0, "app.last_requested_permission");
        this.U0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.has_missed_calls_alert.shown_time");
        this.V0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.is_missed_calls_alert_read");
        Float fValueOf = Float.valueOf(0.0f);
        this.W0 = new gvb(zfe.a(Float.class), (SharedPreferences) this.d, (Object) fValueOf, "app.video.player.playback_speed");
        this.X0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.onboarding.transcription");
        this.Y0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.onboarding.discussions");
        this.Z0 = new n3("app.player.audio_video_message_playback_speed", Float.valueOf(1.0f), this.d, this.b, zfe.a(Float.class));
        zfe.a(Boolean.class);
        this.a1 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) null, "app.onboarding.channels_folder_highlight_shown_first_time");
        this.b1 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) null, "app.onboarding.digital_id_highlight_shown_first_time");
        this.c1 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.last.time.update.dialog.showing");
        new n3("app.leak.canary.enabled", bool2, this.d, this.b, zfe.a(Boolean.class));
        this.d1 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "debug.cache.transcode_ignore");
        this.e1 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "debug.media.video.autoload.force");
        this.f1 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool2, "app.logout.started");
    }

    public final m3 Q() {
        zv8 zv8Var = g1[43];
        return (m3) this.Z0.g;
    }

    public final long R() {
        return ((Number) this.P0.m(this, g1[33])).longValue();
    }

    public final int S() {
        return ((Number) this.T0.m(this, g1[37])).intValue();
    }

    public final Map T() {
        return (Map) this.L0.m(this, g1[29]);
    }

    public final qq9 U() {
        return (qq9) this.N0.m(this, g1[31]);
    }

    public final String V() {
        return (String) this.m0.m(this, g1[1]);
    }

    public final String W() {
        return (String) this.o0.m(this, g1[3]);
    }

    public final String X() {
        return (String) this.p0.m(this, g1[4]);
    }

    public final long Y() {
        return ((Number) this.A0.m(this, g1[17])).longValue();
    }

    public final boolean Z() {
        return ((Boolean) this.q0.m(this, g1[5])).booleanValue();
    }

    public final float a0() {
        return ((Number) this.W0.m(this, g1[40])).floatValue();
    }

    @Override // defpackage.s7f, defpackage.o3
    public final void b() {
        String strW = W();
        String strX = X();
        boolean Z = Z();
        zv8[] zv8VarArr = g1;
        zv8 zv8Var = zv8VarArr[6];
        gvb gvbVar = this.r0;
        String str = (String) gvbVar.m(this, zv8Var);
        zv8[] zv8VarArr2 = s7f.j0;
        zv8 zv8Var2 = zv8VarArr2[5];
        gvb gvbVar2 = this.l;
        String str2 = (String) gvbVar2.m(this, zv8Var2);
        zv8 zv8Var3 = zv8VarArr2[2];
        gvb gvbVar3 = this.j;
        String str3 = (String) gvbVar3.m(this, zv8Var3);
        zv8 zv8Var4 = zv8VarArr2[3];
        gvb gvbVar4 = this.k;
        int iIntValue = ((Number) gvbVar4.m(this, zv8Var4)).intValue();
        zv8 zv8Var5 = zv8VarArr2[7];
        gvb gvbVar5 = this.m;
        Boolean bool = (Boolean) gvbVar5.m(this, zv8Var5);
        bool.getClass();
        zv8 zv8Var6 = zv8VarArr2[8];
        gvb gvbVar6 = this.n;
        Boolean bool2 = (Boolean) gvbVar6.m(this, zv8Var6);
        bool2.getClass();
        String strM = m();
        zv8 zv8Var7 = zv8VarArr2[48];
        gvb gvbVar7 = this.Z;
        String str4 = (String) gvbVar7.m(this, zv8Var7);
        zv8 zv8Var8 = zv8VarArr2[47];
        gvb gvbVar8 = this.Y;
        long jLongValue = ((Number) gvbVar8.m(this, zv8Var8)).longValue();
        long jY = Y();
        Map mapT = T();
        boolean zBooleanValue = ((Boolean) this.f1.m(this, zv8VarArr[51])).booleanValue();
        int iH = h();
        int iIntValue2 = ((Number) this.P.m(this, zv8VarArr2[38])).intValue();
        mw mwVar = new mw(0);
        Iterator it = ((mw) this.d.getAll()).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = it;
            String str5 = (String) entry.getKey();
            Boolean bool3 = bool2;
            Object value = entry.getValue();
            gvb gvbVar9 = gvbVar6;
            gvb gvbVar10 = gvbVar5;
            if (z5h.K0(str5, "app.pin", false) && (value instanceof String)) {
                mwVar.put(str5, value);
            }
            gvbVar6 = gvbVar9;
            bool2 = bool3;
            it = it2;
            gvbVar5 = gvbVar10;
        }
        gvb gvbVar11 = gvbVar6;
        super.b();
        this.o0.B(this, zv8VarArr[3], strW);
        m0(strX);
        this.q0.B(this, zv8VarArr[5], Boolean.valueOf(Z));
        gvbVar.B(this, zv8VarArr[6], str);
        gvbVar2.B(this, zv8VarArr2[5], str2);
        gvbVar3.B(this, zv8VarArr2[2], str3);
        gvbVar4.B(this, zv8VarArr2[3], Integer.valueOf(iIntValue));
        gvbVar5.B(this, zv8VarArr2[7], bool);
        gvbVar11.B(this, zv8VarArr2[8], bool2);
        F(strM);
        gvbVar7.B(this, zv8VarArr2[48], str4);
        gvbVar8.B(this, zv8VarArr2[47], Long.valueOf(jLongValue));
        this.A0.B(this, zv8VarArr[17], Long.valueOf(jY));
        j0(mapT);
        k0(zBooleanValue);
        y(iH);
        z(iIntValue2);
        mwVar.forEach(new ma4(2, new m20(this)));
    }

    public final boolean b0() {
        return ((Boolean) this.G0.m(this, g1[23])).booleanValue();
    }

    public final boolean c0() {
        return ((Boolean) this.Y0.m(this, g1[42])).booleanValue();
    }

    public final boolean d0() {
        return ((Boolean) this.x0.m(this, g1[14])).booleanValue();
    }

    public final boolean e0() {
        return ((Boolean) this.w0.m(this, g1[13])).booleanValue();
    }

    public final boolean f0() {
        return ((Boolean) this.v0.m(this, g1[12])).booleanValue();
    }

    public final boolean g0() {
        return ((Boolean) this.R0.m(this, g1[35])).booleanValue();
    }

    public final void h0(long j) {
        this.P0.B(this, g1[33], Long.valueOf(j));
    }

    public final void i0(int i) {
        this.T0.B(this, g1[37], Integer.valueOf(i));
    }

    public final void j0(Map map) {
        this.L0.B(this, g1[29], map);
    }

    public final void k0(boolean z) {
        this.f1.B(this, g1[51], Boolean.valueOf(z));
    }

    public final void l0(String str) {
        this.m0.B(this, g1[1], str);
    }

    public final void m0(String str) {
        this.p0.B(this, g1[4], str);
    }
}
