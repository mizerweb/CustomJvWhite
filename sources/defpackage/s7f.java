package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class s7f extends o3 implements et3 {
    public static final /* synthetic */ zv8[] j0 = {new z8b(s7f.class, "_userId", "get_userId()J"), zo5.e(zfe.a, s7f.class, "contactsLastSync", "getContactsLastSync()J"), new z8b(s7f.class, "currentProxyList", "getCurrentProxyList()Ljava/lang/String;"), new z8b(s7f.class, "currentProxyListTtlInSec", "getCurrentProxyListTtlInSec()I"), new z8b(s7f.class, "pushProxyList", "getPushProxyList()Ljava/lang/String;"), new z8b(s7f.class, "lastSuccessProxy", "getLastSuccessProxy()Ljava/lang/String;"), new z8b(s7f.class, "lastProxyUpdateTime", "getLastProxyUpdateTime()J"), new z8b(s7f.class, "isDebugHostRotationEnabled", "isDebugHostRotationEnabled()Z"), new z8b(s7f.class, "isDebugUaDnsEmulationEnabled", "isDebugUaDnsEmulationEnabled()Z"), new z8b(s7f.class, "callsLastSync", "getCallsLastSync()J"), new z8b(s7f.class, "newCallHistorySync", "getNewCallHistorySync()J"), new z8b(s7f.class, "deviceAvatarPath", "getDeviceAvatarPath()Ljava/lang/String;"), new z8b(s7f.class, "serverTimeDelta", "getServerTimeDelta()J"), new z8b(s7f.class, "useTls", "getUseTls()Z"), new z8b(s7f.class, "unexpectedLogErrorCount", "getUnexpectedLogErrorCount()I"), new z8b(s7f.class, "lastLogSendTime", "getLastLogSendTime()J"), new z8b(s7f.class, "loginFailError", "getLoginFailError()Ljava/lang/String;"), new z8b(s7f.class, "stickersLastSync", "getStickersLastSync()J"), new z8b(s7f.class, "favoritesLastSync", "getFavoritesLastSync()J"), new z8b(s7f.class, "messageNotifIsVisible", "getMessageNotifIsVisible()Z"), new z8b(s7f.class, "forceConnection", "getForceConnection()Z"), new z8b(s7f.class, "lastSuccessfulRequestTime", "getLastSuccessfulRequestTime()J"), new z8b(s7f.class, "contactSortLastSync", "getContactSortLastSync()J"), new z8b(s7f.class, "phonesSortLastSync", "getPhonesSortLastSync()J"), new z8b(s7f.class, "reservedPushToken", "getReservedPushToken()Ljava/lang/String;"), new z8b(s7f.class, "_pushOptions", "get_pushOptions()J"), new z8b(s7f.class, "okToken", "getOkToken()Ljava/lang/String;"), new z8b(s7f.class, "lastPushTime", "getLastPushTime()J"), new z8b(s7f.class, "okTokenRefreshTs", "getOkTokenRefreshTs()J"), new z8b(s7f.class, "isWriteContactsRequested", "isWriteContactsRequested()Z"), new z8b(s7f.class, "isPushNotificationsRequested", "isPushNotificationsRequested()Z"), new z8b(s7f.class, "alreadyInvitedFriends", "getAlreadyInvitedFriends()Z"), new z8b(s7f.class, "inviteFriendsTimesShown", "getInviteFriendsTimesShown()I"), new z8b(s7f.class, "inviteFriendsShowTime", "getInviteFriendsShowTime()J"), new z8b(s7f.class, "firstLoginTime", "getFirstLoginTime()J"), new z8b(s7f.class, "lastLoginTime", "getLastLoginTime()J"), new z8b(s7f.class, "lastChatMarker", "getLastChatMarker()J"), new z8b(s7f.class, "cacheClear", "getCacheClear()I"), new z8b(s7f.class, "cacheClearMask", "getCacheClearMask()I"), new z8b(s7f.class, "invalidateDb", "getInvalidateDb()Z"), new z8b(s7f.class, "installationMarket", "getInstallationMarket()Ljava/lang/String;"), new z8b(s7f.class, "installationInfoVersion", "getInstallationInfoVersion()Ljava/lang/String;"), new z8b(s7f.class, "favoriteStickersSectionUpdateTime", "getFavoriteStickersSectionUpdateTime()J"), new z8b(s7f.class, "favoriteStickerSetsSectionUpdateTime", "getFavoriteStickerSetsSectionUpdateTime()J"), new z8b(s7f.class, "animojiSetsLastSync", "getAnimojiSetsLastSync()J"), new z8b(s7f.class, "reactionsLastSync", "getReactionsLastSync()J"), new z8b(s7f.class, "isFriendInvitedOnce", "isFriendInvitedOnce()Z"), new z8b(s7f.class, "lastPushStateTime", "getLastPushStateTime()J"), new z8b(s7f.class, "systemLang", "getSystemLang()Ljava/lang/String;"), new z8b(s7f.class, "lang", "getLang()Ljava/lang/String;"), new z8b(s7f.class, "isCustomLangSet", "isCustomLangSet()Z"), new z8b(s7f.class, "_chatsLastSync", "get_chatsLastSync()J"), new z8b(s7f.class, "digitalIdTooltipShown", "getDigitalIdTooltipShown()Z"), new z8b(s7f.class, "isBackgroundWakeEnabled", "isBackgroundWakeEnabled()Z"), new z8b(s7f.class, "backgroundWakeSuggestionShownTime", "getBackgroundWakeSuggestionShownTime()J"), new z8b(s7f.class, "transmitTaskVersion", "getTransmitTaskVersion()I"), new z8b(s7f.class, "critLogTaskVersion", "getCritLogTaskVersion()I"), new z8b(s7f.class, "isIceCandidateEmulationEnabled", "isIceCandidateEmulationEnabled()I"), new dwd(s7f.class, "isStoriesLayersMockEnabled", "isStoriesLayersMockEnabled()Z", 0)};
    public final gvb A;
    public final gvb B;
    public final gvb C;
    public final gvb D;
    public final gvb E;
    public final gvb F;
    public final gvb G;
    public final gvb H;
    public final gvb I;
    public final gvb J;
    public final gvb K;
    public final gvb L;
    public final gvb M;
    public final gvb N;
    public final gvb O;
    public final gvb P;
    public final gvb Q;
    public final gvb R;
    public final gvb S;
    public final gvb T;
    public final gvb U;
    public final gvb V;
    public final gvb W;
    public final gvb X;
    public final gvb Y;
    public final gvb Z;
    public final gvb a0;
    public final gvb b0;
    public final gvb c0;
    public final gvb d0;
    public final ny8 e;
    public final gvb e0;
    public volatile xp3 f;
    public final gvb f0;
    public final pzf g;
    public final gvb g0;
    public final gvb h;
    public final gvb h0;
    public final gvb i;
    public final gvb i0;
    public final gvb j;
    public final gvb k;
    public final gvb l;
    public final gvb m;
    public final gvb n;
    public final gvb o;
    public final gvb p;
    public final gvb q;
    public final gvb r;
    public final gvb s;
    public final gvb t;
    public final gvb u;
    public final gvb v;
    public final gvb w;
    public final gvb x;
    public final gvb y;
    public final gvb z;

    public s7f(Context context, String str, cs6 cs6Var, ny8 ny8Var) {
        super(context, str, cs6Var);
        this.e = ny8Var;
        this.g = e9i.b(1, 0, 2);
        this.h = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) (-1L), "user.Id");
        this.i = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.contactsLastSync");
        this.j = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "app.currentProxyList");
        this.k = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 299, "app.currentProxyListTtl");
        zfe.a(String.class);
        this.l = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "app.lastSuccessProxy");
        zfe.a(Long.class);
        Boolean bool = Boolean.FALSE;
        this.m = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.debugHostRotation");
        this.n = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.debugUaDnsEmulation");
        this.o = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.callsLastSync");
        this.p = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.newCallHistorySync");
        this.q = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "user.deviceAvatarPath");
        this.r = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "server.timeDelta");
        zfe.a(Boolean.class);
        this.s = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 0, "user.unexpectedLogErrorCount");
        this.t = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.lastLogSendTime");
        zfe.a(String.class);
        this.u = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.stickersLastSync");
        this.v = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.favoritesLastSync");
        this.w = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "notif.isVisible");
        this.x = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.forceConnection");
        this.y = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.lastSuccessfulRequestTime");
        this.z = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.contactSortLastSync");
        this.A = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.phonesSortLastSync");
        this.B = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "user.reservedPushToken");
        this.C = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) (-1L), "user.pushOptions");
        this.D = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "user.okToken");
        this.E = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.last.firebase_push_time");
        this.F = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.ok.update_time");
        this.G = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.writeConctatsRequested");
        this.H = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.pushNotificationsRequested");
        this.I = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.already.invited.friends");
        this.J = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 0, "app.invite.friends.times.shown");
        this.K = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) (-1L), "app.first.invite.friends.time");
        this.L = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.first.login.time");
        this.M = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.last.login.time");
        this.N = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.last.chat.marker");
        this.O = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) (-1), "app.cache.clear.ver");
        this.P = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 0, "app.cache.clear.mask");
        this.Q = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.invalidate.exception.flag");
        this.R = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) "", "install-market");
        this.S = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) "", "install-version");
        this.T = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.favorites.stickers.updateTime");
        this.U = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.favorites.stickerSets.updateTime");
        this.V = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.animojiSetsLastSync");
        this.W = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.reactionsLastSync");
        this.X = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "user.inviteLinkClicked");
        this.Y = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "app.last.push.state.time");
        this.Z = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) null, "user.systemLang");
        this.a0 = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) "ru", "user.lang");
        this.b0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.lang.customLang");
        this.c0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "user.chatsLastSync");
        this.d0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "user.shownDigitalIdTooltip");
        this.e0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "background.wake.enabled");
        this.f0 = new gvb(zfe.a(Long.class), (SharedPreferences) this.d, (Object) 0L, "background.wake.suggestion.shown.time");
        this.g0 = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 0, "transmit.version");
        zfe.a(Integer.class);
        this.h0 = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 0, "app.calls_sdk.ice_candidate_emulation");
        this.i0 = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "debug.stories.layers.mock");
    }

    public final void A(List list) {
        zr6 zr6Var = (zr6) this.d.edit();
        zr6Var.putString("user.callSession", ww3.z1(list, ",", null, null, null, 62));
        zr6Var.apply();
    }

    public final void B(long j) {
        if (j > x()) {
            gm0.m(this.c, "setChatsLastSync %d", Long.valueOf(j));
            this.c0.B(this, j0[51], Long.valueOf(j));
        }
    }

    public final void C(long j) {
        this.v.B(this, j0[18], Long.valueOf(j));
    }

    public final void D(boolean z) {
        this.x.B(this, j0[20], Boolean.valueOf(z));
    }

    public final void E(boolean z) {
        this.Q.B(this, j0[39], Boolean.valueOf(z));
    }

    public final void F(String str) {
        this.a0.B(this, j0[49], str);
    }

    public final void G(long j) {
        this.M.B(this, j0[35], Long.valueOf(j));
    }

    public final void H(long j) {
        this.p.B(this, j0[10], Long.valueOf(j));
    }

    public final void I(long j) {
        this.W.B(this, j0[45], Long.valueOf(j));
    }

    public final void J(String str) {
        this.B.B(this, j0[24], str);
    }

    public final void K(long j) {
        this.u.B(this, j0[17], Long.valueOf(j));
    }

    public final void L(int i) {
        this.g0.B(this, j0[55], Integer.valueOf(i));
    }

    public final void M(int i) {
        this.s.B(this, j0[14], Integer.valueOf(i));
    }

    public final void N(long j) {
        this.h.B(this, j0[0], Long.valueOf(j));
        this.g.a(Long.valueOf(j));
    }

    public final void O(ozd ozdVar) {
        zr6 zr6Var = (zr6) this.d.edit();
        zr6Var.remove("user.fcmToken");
        zr6Var.remove("user.pushDeviceType");
        String str = this.c;
        if (ozdVar == null) {
            zr6Var.remove("user.vendor.pushtoken");
            try {
                zr6Var.commit();
                return;
            } catch (Exception e) {
                gm0.V(str, "fail to remove vendor push token", e);
                return;
            }
        }
        try {
            qs8 qs8Var = (qs8) this.e.getValue();
            qs8Var.getClass();
            zr6Var.putString("user.vendor.pushtoken", qs8Var.b(ozd.Companion.serializer(), ozdVar));
            zr6Var.commit();
        } catch (Exception e2) {
            gm0.V(str, "fail to save vendorPushToken", e2);
        }
    }

    public final void P() {
        this.G.B(this, j0[29], Boolean.TRUE);
    }

    @Override // defpackage.o3
    public void b() {
        super.b();
        this.f = null;
        this.g.a(Long.valueOf(t()));
    }

    public final long f() {
        return r() + System.currentTimeMillis();
    }

    public final synchronized long g() {
        xp3 xp3Var;
        try {
            if (this.f == null) {
                this.f = new xp3(new ap9(25, this), new gve(this));
            }
            xp3Var = this.f;
            if (xp3Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return xp3Var.b + ((long) ((AtomicInteger) xp3Var.c).getAndIncrement());
    }

    public final int h() {
        return ((Number) this.O.m(this, j0[37])).intValue();
    }

    public final long i() {
        return ((Number) this.o.m(this, j0[9])).longValue();
    }

    public final long j() {
        return ((Number) this.i.m(this, j0[1])).longValue();
    }

    public final String k() {
        return (String) this.q.m(this, j0[11]);
    }

    public final long l() {
        return ((Number) this.L.m(this, j0[34])).longValue();
    }

    public final String m() {
        return (String) this.a0.m(this, j0[49]);
    }

    public final long n() {
        return ((Number) this.p.m(this, j0[10])).longValue();
    }

    public final String o() {
        return (String) this.D.m(this, j0[26]);
    }

    public final long p() {
        return ((Number) this.F.m(this, j0[28])).longValue();
    }

    public final long q() {
        return ((Number) this.C.m(this, j0[25])).longValue();
    }

    public final long r() {
        return ((Number) this.r.m(this, j0[12])).longValue();
    }

    public final int s() {
        return ((Number) this.g0.m(this, j0[55])).intValue();
    }

    public final long t() {
        return ((Number) this.h.m(this, j0[0])).longValue();
    }

    public final fz6 u() {
        return new fz6(this.g, new ai8(this, null, 23));
    }

    public final Locale v() {
        return Locale.forLanguageTag(m());
    }

    public final ozd w() {
        ry8 ry8Var = this.d;
        String string = ry8Var.getString("user.vendor.pushtoken", null);
        if (string != null && string.length() != 0) {
            try {
                qs8 qs8Var = (qs8) this.e.getValue();
                qs8Var.getClass();
                return (ozd) qs8Var.a(lvb.o0(ozd.Companion.serializer()), string);
            } catch (Exception e) {
                gm0.V(this.c, "fail to get vendorPushToken", e);
                return null;
            }
        }
        String string2 = ry8Var.getString("user.fcmToken", null);
        String string3 = ry8Var.getString("user.pushDeviceType", null);
        syd sydVarValueOf = string3 != null ? syd.valueOf(string3) : null;
        if (sydVarValueOf == null || string2 == null) {
            return null;
        }
        return new ozd(sydVarValueOf, string2, new fzd(q()));
    }

    public final long x() {
        return ((Number) this.c0.m(this, j0[51])).longValue();
    }

    public final void y(int i) {
        this.O.B(this, j0[37], Integer.valueOf(i));
    }

    public final void z(int i) {
        this.P.B(this, j0[38], Integer.valueOf(i));
    }
}
