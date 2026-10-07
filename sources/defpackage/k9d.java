package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.qrscanner.QrScannerWidget;
import one.me.stories.publish.PublishStoryBottomSheet;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.cookie.ClientCookie;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k9d implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k9d(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0080  */
    @Override // defpackage.af7
    public final Object invoke() {
        int i;
        EGLSurface eGLSurfaceEglCreateWindowSurface;
        long jLongValue;
        long j;
        g85 g85Var = null;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                l9d l9dVar = (l9d) this.c;
                ImageView imageView = new ImageView(context);
                imageView.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageView).getIcon().f));
                imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.icon_cup_fill).mutate());
                l9dVar.addView(imageView, new ViewGroup.LayoutParams(-2, -2));
                return imageView;
            case 1:
                dfd dfdVar = (dfd) this.b;
                ym5 ym5Var = (ym5) this.c;
                Iterator it = dfdVar.g.iterator();
                while (it.hasNext()) {
                    LruCache lruCache = ((g3j) it.next()).a.f;
                    String str = ym5Var.d;
                    lruCache.put(str, str);
                }
                return sbi.a;
            case 2:
                yfd yfdVar = (yfd) this.b;
                zkb zkbVar = (zkb) this.c;
                String str2 = yfdVar.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, nbh.s(zkbVar.d, "handleNotifTyping: moved #", " to ONLINE"), null);
                    }
                }
                return sbi.a;
            case 3:
                Bundle bundle = (Bundle) this.b;
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) this.c;
                zv8[] zv8VarArr = ProfileAvatarsScreen.r;
                long j2 = bundle.getLong("EXTRA_ID");
                boolean zD = cqk.d(bundle.getString("EXTRA_TYPE"), "contact");
                wtc wtcVar = profileAvatarsScreen.g;
                return new ild(zD ? new xkd(j2, wtcVar.getAccessor().d(146), wtcVar.getAccessor().d(132), wtcVar.getAccessor().d(101), wtcVar.getAccessor().d(263), wtcVar.getAccessor().d(168), wtcVar.getAccessor().d(655)) : new rkd(j2, wtcVar.a(), wtcVar.getAccessor().d(263), wtcVar.getAccessor().d(26)), wtcVar.getAccessor().d(205), wtcVar.getAccessor().d(23));
            case 4:
                ((ProfileChangeLinkScreen) ((lp0) this.b).g).s1().c.g(((f8) this.c).a);
                return sbi.a;
            case 5:
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) this.b;
                Bundle bundle2 = (Bundle) this.c;
                hq2 hq2Var = (hq2) profileChangeLinkScreen.c.getAccessor().c(818);
                long j3 = bundle2.getLong("entity:id");
                vv vvVar = profileChangeLinkScreen.b;
                zv8 zv8Var = ProfileChangeLinkScreen.t[1];
                nnd nndVar = (nnd) vvVar.a(profileChangeLinkScreen);
                mnd mndVarQ1 = profileChangeLinkScreen.q1();
                hq2Var.getClass();
                return new gq2(j3, nndVar, mndVarQ1, hq2Var.a, hq2Var.b, hq2Var.c);
            case 6:
                lp0 lp0Var = (lp0) this.b;
                f8 f8Var = (f8) this.c;
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) lp0Var.g;
                long j4 = f8Var.a;
                if (f8Var.b.e == osf.e) {
                    profileEditAdminPermissionsWidget.p1().H(j4);
                } else {
                    end endVarP1 = profileEditAdminPermissionsWidget.p1();
                    zv8[] zv8VarArr2 = end.w;
                    endVarP1.G(j4, false);
                }
                return sbi.a;
            case 7:
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) this.b;
                Bundle bundle3 = (Bundle) this.c;
                bpd bpdVar = (bpd) profileEditScreen.b.getAccessor().c(828);
                long j5 = profileEditScreen.a;
                Parcelable parcelable = bundle3.getParcelable("profile:type");
                if (parcelable != null) {
                    bpdVar.getClass();
                    return new apd(j5, (nnd) parcelable, bpdVar.a, bpdVar.b, bpdVar.c, bpdVar.d, bpdVar.e, bpdVar.f, bpdVar.g, bpdVar.h, bpdVar.i);
                }
                ore.p("Required value was null.");
                return null;
            case 8:
                ((ProfileEditScreen) ((lp0) this.b).g).s1().c.a(((f8) this.c).a);
                return sbi.a;
            case 9:
                Bundle bundle4 = (Bundle) this.b;
                ProfileInviteScreen profileInviteScreen = (ProfileInviteScreen) this.c;
                zv8[] zv8VarArr3 = ProfileInviteScreen.g;
                long j6 = bundle4.getLong("id");
                wtc wtcVar2 = profileInviteScreen.c;
                wtcVar2.getAccessor().getClass();
                return new dqd(j6, wtcVar2.getAccessor().d(24), wtcVar2.a(), wtcVar2.getAccessor().d(23), wtcVar2.getAccessor().d(146), wtcVar2.getAccessor().d(113), wtcVar2.c(), wtcVar2.getAccessor().d(26), wtcVar2.b(), wtcVar2.getAccessor().d(175), wtcVar2.getAccessor().d(87), wtcVar2.getAccessor().d(48), wtcVar2.getAccessor().d(1065), wtcVar2.getAccessor().d(HttpStatus.SC_BAD_GATEWAY));
            case 10:
                wpd wpdVar = (wpd) this.b;
                uqd uqdVar = (uqd) this.c;
                ProfileInviteScreen profileInviteScreen2 = wpdVar.f;
                int i2 = uqdVar.a;
                dqd dqdVarO1 = profileInviteScreen2.o1();
                ic6 ic6Var = dqdVarO1.y;
                if (i2 == R.id.profile_invite_share_link) {
                    rt2 rt2VarC = dqdVarO1.C();
                    if (rt2VarC == null || !rt2VarC.d0()) {
                        rt2 rt2VarC2 = dqdVarO1.C();
                        i = (rt2VarC2 == null || !rt2VarC2.b0()) ? R.string.oneme_chat_shortlink_action_share_link_text : R.string.oneme_bot_shortlink_action_share_link_text;
                    } else {
                        i = R.string.oneme_channel_shortlink_action_share_link_text;
                    }
                    String strD = dqdVarO1.D();
                    if (strD != null) {
                        a8j.x(ic6Var, new tpd(new vnh(i, a.n1(new Object[]{strD}))));
                    }
                } else if (i2 == R.id.profile_invite_send_link) {
                    String strD2 = dqdVarO1.D();
                    if (strD2 != null) {
                        a8j.x(ic6Var, new spd(strD2));
                    }
                } else if (i2 == R.id.profile_invite_qr_code) {
                    xt4 xt4VarA = ((n0c) dqdVarO1.E()).a();
                    yt4 yt4Var = (yt4) dqdVarO1.n.getValue();
                    xt4VarA.getClass();
                    a8j.t(dqdVarO1, lvb.x0(xt4VarA, yt4Var), new ur8(dqdVarO1, null, 21), 2);
                } else if (i2 == R.id.profile_invite_configure_type) {
                    trd trdVar = trd.b;
                    long j7 = dqdVarO1.c;
                    trdVar.getClass();
                    bc1.q(":profile/edit/link?id=" + j7 + "&type=local_chat&flow=edit", ic6Var);
                }
                return sbi.a;
            case 11:
                Bundle bundle5 = (Bundle) this.b;
                ProfileMemberPermissionsScreen profileMemberPermissionsScreen = (ProfileMemberPermissionsScreen) this.c;
                long j8 = bundle5.getLong("id");
                wtc wtcVar3 = profileMemberPermissionsScreen.b;
                ifh ifhVarD = wtcVar3.getAccessor().d(144);
                ifh ifhVarD2 = wtcVar3.getAccessor().d(23);
                ifh ifhVarD3 = wtcVar3.getAccessor().d(146);
                ifh ifhVarD4 = wtcVar3.getAccessor().d(113);
                ifh ifhVarD5 = wtcVar3.getAccessor().d(24);
                ifh ifhVarD6 = wtcVar3.getAccessor().d(316);
                wtcVar3.getAccessor().getClass();
                return new srd(j8, ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, ifhVarD5, ifhVarD6);
            case 12:
                wf4 wf4Var = (wf4) this.b;
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen = (ProfileReactionsSettingsScreen) this.c;
                zv8[] zv8VarArr4 = ProfileReactionsSettingsScreen.p;
                r1c r1cVar = new r1c(wf4Var.getContext());
                r1cVar.setId(R.id.profile_edit_reactions_settings_error_view);
                r1cVar.setIcon(R.drawable.icon_reactions_fill);
                r1cVar.setTitle(new tnh(R.string.profile_edit_reactions_settings_error_title));
                r1cVar.setSubtitle(new tnh(R.string.profile_edit_reactions_settings_error_subtitle));
                r1cVar.f(np4.q(r1cVar.getContext(), R.string.profile_edit_reactions_settings_error_action), new gwc(12, profileReactionsSettingsScreen));
                return r1cVar;
            case 13:
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen2 = (ProfileReactionsSettingsScreen) this.b;
                Bundle bundle6 = (Bundle) this.c;
                ktd ktdVar = (ktd) profileReactionsSettingsScreen2.d.getAccessor().c(826);
                return new jtd(bundle6.getLong("id"), ktdVar.a, ktdVar.b, ktdVar.c, ktdVar.d, ktdVar.e, ktdVar.f, ktdVar.g, ktdVar.h);
            case 14:
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                Bundle bundle7 = (Bundle) this.c;
                evd evdVar = (evd) profileScreen.c.getAccessor().c(1083);
                long j9 = bundle7.getLong("profile:id");
                Object objF0 = tre.f0(bundle7, "profile:id_type", kmd.class);
                if (objF0 == null) {
                    c.o(c0a.o("No value passed for key profile:id_type of type ", kmd.class.getSimpleName(), " in bundle"));
                    return null;
                }
                boolean z = bundle7.getBoolean("profile:opened_from_dialog");
                xu1 xu1VarR1 = profileScreen.r1();
                evdVar.getClass();
                return new dvd(j9, (kmd) ((Parcelable) objF0), z, xu1VarR1, evdVar.a, evdVar.b, evdVar.c, evdVar.d, evdVar.e, evdVar.f, evdVar.g, evdVar.h, evdVar.i, evdVar.j, evdVar.k, evdVar.l, evdVar.m, evdVar.n, evdVar.o, evdVar.p, evdVar.q, evdVar.r, evdVar.s, evdVar.t, evdVar.u, evdVar.v, evdVar.w, evdVar.x, evdVar.y, evdVar.z, evdVar.A, evdVar.B);
            case 15:
                a8j.x(((dvd) this.b).C, new nsd(((c39) this.c).a));
                return sbi.a;
            case 16:
                PublishStoryBottomSheet publishStoryBottomSheet = (PublishStoryBottomSheet) this.b;
                Bundle bundle8 = (Bundle) this.c;
                oyd oydVar = (oyd) publishStoryBottomSheet.m.getAccessor().c(967);
                String string = bundle8.getString(ClientCookie.PATH_ATTR);
                if (string == null) {
                    string = "";
                }
                return new nyd(string, bundle8.getLong("edit_story_id"), bundle8.getInt("edit_settings"), publishStoryBottomSheet.getE().b(), oydVar.a, oydVar.b, oydVar.c, oydVar.d);
            case 17:
                QrScannerWidget qrScannerWidget = (QrScannerWidget) this.b;
                tzd tzdVar = (tzd) this.c;
                zv8[] zv8VarArr5 = QrScannerWidget.w;
                qrScannerWidget.v1(tzdVar.a);
                return sbi.a;
            case 18:
                Context context2 = (Context) this.b;
                v2e v2eVar = (v2e) this.c;
                View view = new View(context2);
                view.setBackground((Drawable) v2eVar.c.getValue());
                v2eVar.addView(view);
                return view;
            case 19:
                RaiseHandActionBottomSheet raiseHandActionBottomSheet = (RaiseHandActionBottomSheet) this.b;
                Bundle bundle9 = (Bundle) this.c;
                e4e e4eVar = (e4e) raiseHandActionBottomSheet.u.getAccessor().c(847);
                fu1 fu1Var = (fu1) bundle9.getParcelable("opponent_id");
                if (fu1Var == null) {
                    fu1Var = fu1.c;
                }
                return new d4e(fu1Var, e4eVar.a);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                t6e t6eVar = (t6e) this.b;
                r6e r6eVar = (r6e) this.c;
                RecyclerView recyclerView = t6eVar.a.e;
                bdc.a(recyclerView, new ng7(recyclerView, t6eVar, r6eVar, 21));
                return sbi.a;
            case 21:
                RecordExitBottomSheet recordExitBottomSheet = (RecordExitBottomSheet) this.b;
                Bundle bundle10 = (Bundle) this.c;
                lde ldeVar = (lde) recordExitBottomSheet.v.getAccessor().c(838);
                return new kde(cde.valueOf(bundle10.getString("open_type", "UNDEFINE")), bundle10.containsKey("admin_record_settings") ? Boolean.valueOf(bundle10.getBoolean("admin_record_settings")) : null, (h02) recordExitBottomSheet.w.getValue(), ldeVar.a, ldeVar.b, ldeVar.c, ldeVar.d);
            case 22:
                return ((nm0) ((kje) this.b).b.getValue()).a((hm0) this.c);
            case 23:
                return ((ju6) ((rs6) ((kje) this.b).c.getValue())).s((String) this.c, "jpg");
            case 24:
                ((Drawable) this.b).draw((Canvas) this.c);
                return sbi.a;
            case 25:
                q3m.g(((File) this.b).getAbsolutePath(), (Bitmap) ((wfe) this.c).a, 100, Bitmap.CompressFormat.JPEG);
                return sbi.a;
            case 26:
                uje ujeVar = (uje) this.b;
                Surface surface = (Surface) this.c;
                g85 g85Var2 = ujeVar.k;
                if (g85Var2 != null) {
                    g85Var2.P();
                }
                if (surface != null) {
                    t3a t3aVar = ujeVar.a;
                    gvb gvbVar = ujeVar.b;
                    g85Var = new g85();
                    g85Var.a = surface;
                    EGLDisplay eGLDisplay = (EGLDisplay) t3aVar.a;
                    g85Var.b = eGLDisplay;
                    g85Var.c = (EGLContext) gvbVar.d;
                    try {
                        eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, (EGLConfig) gvbVar.c, surface, new int[]{12344}, 0);
                        if (cqk.d(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
                            wk8.g("eglCreateWindowSurface", 12291, 12299);
                        }
                    } catch (IllegalArgumentException unused) {
                        eGLSurfaceEglCreateWindowSurface = EGL14.EGL_NO_SURFACE;
                    }
                    g85Var.d = eGLSurfaceEglCreateWindowSurface;
                    g85Var.e = new Size(0, 0);
                    break;
                }
                ujeVar.k = g85Var;
                return sbi.a;
            case 27:
                lu6.k0((File) this.b, (File) this.c);
                return sbi.a;
            case 28:
                hre hreVar = (hre) this.b;
                nx2 nx2Var = (nx2) this.c;
                long jA = ((l7f) hreVar.d.getValue()).a();
                boolean zE = nx2Var.e(jA);
                long j10 = nx2Var.l;
                long j11 = nx2Var.a;
                if (zE) {
                    q0f q0fVar = (q0f) ch3.G(hreVar.g().a, true, false, new aa2(jA, 18));
                    if (q0fVar != null) {
                        jLongValue = q0fVar.b;
                        j = jLongValue;
                    } else {
                        j = 0;
                    }
                } else {
                    if (j11 != 0) {
                        jLongValue = ((Number) ch3.G(((ph3) hreVar.e()).a, true, false, new aa2(j11, 3))).longValue();
                    } else if (j10 != 0) {
                        jLongValue = ((Number) ch3.G(((ph3) hreVar.e()).a, true, false, new aa2(j10, 5))).longValue();
                    } else {
                        j = 0;
                    }
                    j = jLongValue;
                }
                ph3 ph3Var = (ph3) hreVar.e();
                long jLongValue2 = ((Number) ch3.G(ph3Var.a, false, true, new ih3(ph3Var, j, nx2Var, hreVar.f()))).longValue();
                if (zE && j == 0) {
                    ch3.G(hreVar.g().a, false, true, new o0f(jA, jLongValue2));
                }
                return Long.valueOf(jLongValue2);
            default:
                List list = (List) this.b;
                ose oseVar = (ose) this.c;
                List list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(oseVar.b((gga) it2.next()));
                }
                return arrayList;
        }
    }
}
