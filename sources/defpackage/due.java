package defpackage;

import android.app.Application;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.io.File;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Pattern;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.video.calls.sdk.internal.join.FastJoinException;
import one.video.calls.sdk.upload.FileUploadService;
import org.webrtc.Size;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class due implements t7b, rg4, bca, wj4, zj2, v8h, sf7, u00, s72, imc, aqg, qlg, mt9 {
    public static due b;
    public static final eue c = new eue(0, 0, 0, false, false);
    public static final lj7 d = new lj7(1);
    public Object a;

    public due(int i) {
        vga vgaVar;
        switch (i) {
            case 15:
                this.a = rx8.P(2, new h57(29));
                break;
            default:
                try {
                    vgaVar = (vga) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    vgaVar = d;
                }
                vga[] vgaVarArr = {lj7.b, vgaVar};
                ol9 ol9Var = new ol9();
                ol9Var.a = vgaVarArr;
                Charset charset = wj8.a;
                this.a = ol9Var;
                break;
        }
    }

    public static int t(Size size, List list) {
        Object obj;
        Object objPrevious;
        int i;
        int i2;
        int iMax = Math.max(size.width, size.height);
        ListIterator listIterator = list.listIterator(list.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((xpc) objPrevious).a > iMax);
        xpc xpcVar = (xpc) objPrevious;
        for (Object obj2 : list) {
            if (((xpc) obj2).a >= iMax) {
                obj = obj2;
                break;
            }
        }
        xpc xpcVar2 = (xpc) obj;
        if (xpcVar == null && xpcVar2 == null) {
            xpc xpcVar3 = (xpc) ww3.t1(list);
            if (xpcVar3 != null) {
                return xpcVar3.b;
            }
            return 0;
        }
        if (xpcVar != null) {
            int i3 = xpcVar.b;
            return (xpcVar2 == null || (i = xpcVar.a) == (i2 = xpcVar2.a)) ? i3 : (((xpcVar2.b - i3) * (iMax - i)) / (i2 - i)) + i3;
        }
        if (xpcVar2 != null) {
            return xpcVar2.b;
        }
        return 0;
    }

    public static synchronized due x() {
        try {
            if (b == null) {
                b = new due();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public void A(long j) {
        CallMoreBottomSheet callMoreBottomSheet = (CallMoreBottomSheet) this.a;
        zv8[] zv8VarArr = CallMoreBottomSheet.t;
        as1 as1Var = (as1) callMoreBottomSheet.o.getValue();
        h02 h02Var = as1Var.d;
        if (j == R.id.call_context_action_share_screen) {
            a8j.x(h02Var.G, new my1(true));
        } else if (j == R.id.call_context_action_share_screen_unavailable) {
            a8j.x(h02Var.G, new my1(false));
        } else if (j == R.id.call_context_action_record_screen) {
            a8j.x(h02Var.G, iy1.F);
        } else if (j == R.id.call_context_action_record_screen_unavailable) {
            if (((w82) as1Var.h.getValue()).c().d()) {
                yab.i0(h02Var.b, null, 0, new g02(h02Var, false, null, 0), 3);
            } else {
                a8j.x(h02Var.G, ky1.F);
            }
        } else if (j == R.id.call_context_action_open_profile) {
            a8j.x(h02Var.G, dy1.F);
        } else if (j == R.id.call_context_action_write_chat) {
            a8j.x(h02Var.G, cy1.F);
        } else if (j == R.id.call_screen_menu_grid_mode) {
            a8j.x(h02Var.G, new vx1(x7j.c));
        } else if (j == R.id.call_screen_menu_speaker_mode) {
            a8j.x(h02Var.G, new vx1(x7j.a));
        } else if (j == R.id.call_context_action_settings) {
            ic6 ic6Var = h02Var.G;
            cs1.b.getClass();
            a8j.x(ic6Var, new i65(":call-admin-settings"));
        } else if (j == R.id.call_context_action_debug_menu) {
            ic6 ic6Var2 = h02Var.G;
            cs1.b.getClass();
            a8j.x(ic6Var2, new i65(":call-debug-menu"));
        } else if (j == R.id.call_context_dialog_invite_user_to_p2p) {
            sa2 sa2Var = (sa2) as1Var.i.getValue();
            sa2Var.getClass();
            sa2.c(sa2Var, "TAP_SHARE_LINK_P2P", null, null, null, null, null, false, null, 382);
            a8j.x(h02Var.G, ay1.F);
        } else if (j == R.id.call_context_action_chat) {
            a8j.x(h02Var.G, cy1.F);
        }
        callMoreBottomSheet.v1(true);
    }

    public void B() {
        n7b n7bVar = (n7b) this.a;
        n7bVar.r = true;
        if (!n7bVar.j.isEmpty()) {
            n7bVar.p();
            return;
        }
        nf5 nf5Var = n7bVar.o;
        nf5Var.getClass();
        nf5Var.i();
    }

    public void C(boolean z) {
        Object value;
        w82 w82Var = (w82) this.a;
        if (z) {
            f9b f9bVar = (f9b) w82Var.v.getValue();
            do {
                value = f9bVar.getValue();
            } while (!f9bVar.h(value, ((ac1) w82Var.b).a()));
        }
    }

    public void D(long j, final boolean z) {
        CallAdminSettingsScreen callAdminSettingsScreen = (CallAdminSettingsScreen) this.a;
        zv8[] zv8VarArr = CallAdminSettingsScreen.j;
        hb1 hb1VarO1 = callAdminSettingsScreen.o1();
        int i = (int) j;
        o0a o0aVar = o0a.c;
        o0a o0aVar2 = o0a.a;
        if (i == R.id.call_admin_settings_camera_in_call) {
            final ya1 ya1Var = (ya1) hb1VarO1.B();
            MediaMuteManager mediaMuteManagerG = ya1Var.g();
            if (mediaMuteManagerG != null) {
                ul9 ul9Var = new ul9();
                n0a n0aVar = n0a.b;
                if (z) {
                    o0aVar = o0aVar2;
                }
                ul9Var.put(n0aVar, o0aVar);
                ul9 ul9VarB = ul9Var.b();
                final int i2 = 1;
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerG, ul9VarB, null, new af7() { // from class: fa1
                    @Override // defpackage.af7
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i2) {
                            case 0:
                                ya1 ya1Var2 = ya1Var;
                                boolean z2 = z;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "CallAdminSettingsController", qv1.m("Microphone in call was changed on ", " success", z2), null);
                                    }
                                }
                                mjg mjgVar = ya1Var2.u;
                                do {
                                    value = mjgVar.getValue();
                                } while (!mjgVar.h(value, gc.a((gc) value, false, false, z2, false, false, false, 123)));
                                ya1Var2.s.a(new nd(true, z2));
                                break;
                            case 1:
                                ya1 ya1Var3 = ya1Var;
                                boolean z3 = z;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.d;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, "CallAdminSettingsController", qv1.m("Cameras in call was changed on ", " success", z3), null);
                                    }
                                }
                                mjg mjgVar2 = ya1Var3.u;
                                do {
                                    value2 = mjgVar2.getValue();
                                } while (!mjgVar2.h(value2, gc.a((gc) value2, false, z3, false, false, false, false, 125)));
                                ya1Var3.s.a(new ld(true, z3));
                                break;
                            default:
                                ya1 ya1Var4 = ya1Var;
                                boolean z4 = z;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    je9 je9Var3 = je9.d;
                                    if (a4cVar3.b(je9Var3)) {
                                        a4cVar3.c(je9Var3, "CallAdminSettingsController", qv1.m("Screen sharing in call was changed on ", " success", z4), null);
                                    }
                                }
                                mjg mjgVar3 = ya1Var4.u;
                                do {
                                    value3 = mjgVar3.getValue();
                                } while (!mjgVar3.h(value3, gc.a((gc) value3, false, false, false, z4, false, false, 119)));
                                ya1Var4.s.a(new rd(true, z4));
                                break;
                        }
                        return sbi.a;
                    }
                }, new cf7() { // from class: ga1
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        p0a mediaOptionsForCall$default;
                        o0a o0aVar3;
                        p0a mediaOptionsForCall$default2;
                        o0a o0aVar4;
                        p0a mediaOptionsForCall$default3;
                        o0a o0aVar5;
                        switch (i2) {
                            case 0:
                                ya1 ya1Var2 = ya1Var;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                    }
                                }
                                pzf pzfVar = ya1Var2.s;
                                MediaMuteManager mediaMuteManagerG2 = ya1Var2.g();
                                pzfVar.a(new nd(false, (mediaMuteManagerG2 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG2, null, 1, null)) == null || (o0aVar3 = mediaOptionsForCall$default.a) == null) ? false : ya1.o(o0aVar3)));
                                break;
                            case 1:
                                ya1 ya1Var3 = ya1Var;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.d;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                    }
                                }
                                pzf pzfVar2 = ya1Var3.s;
                                MediaMuteManager mediaMuteManagerG3 = ya1Var3.g();
                                pzfVar2.a(new ld(false, (mediaMuteManagerG3 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG3, null, 1, null)) == null || (o0aVar4 = mediaOptionsForCall$default2.b) == null) ? false : ya1.o(o0aVar4)));
                                break;
                            default:
                                ya1 ya1Var4 = ya1Var;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    je9 je9Var3 = je9.d;
                                    if (a4cVar3.b(je9Var3)) {
                                        a4cVar3.c(je9Var3, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                    }
                                }
                                pzf pzfVar3 = ya1Var4.s;
                                MediaMuteManager mediaMuteManagerG4 = ya1Var4.g();
                                pzfVar3.a(new rd(false, (mediaMuteManagerG4 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG4, null, 1, null)) == null || (o0aVar5 = mediaOptionsForCall$default3.c) == null) ? false : ya1.o(o0aVar5)));
                                break;
                        }
                        return sbi.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (i == R.id.call_admin_settings_mic_in_call) {
            final ya1 ya1Var2 = (ya1) hb1VarO1.B();
            MediaMuteManager mediaMuteManagerG2 = ya1Var2.g();
            if (mediaMuteManagerG2 != null) {
                ul9 ul9Var2 = new ul9();
                n0a n0aVar2 = n0a.a;
                if (z) {
                    o0aVar = o0aVar2;
                }
                ul9Var2.put(n0aVar2, o0aVar);
                ul9 ul9VarB2 = ul9Var2.b();
                final int i3 = 0;
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerG2, ul9VarB2, null, new af7() { // from class: fa1
                    @Override // defpackage.af7
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i3) {
                            case 0:
                                ya1 ya1Var3 = ya1Var2;
                                boolean z2 = z;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "CallAdminSettingsController", qv1.m("Microphone in call was changed on ", " success", z2), null);
                                    }
                                }
                                mjg mjgVar = ya1Var3.u;
                                do {
                                    value = mjgVar.getValue();
                                } while (!mjgVar.h(value, gc.a((gc) value, false, false, z2, false, false, false, 123)));
                                ya1Var3.s.a(new nd(true, z2));
                                break;
                            case 1:
                                ya1 ya1Var4 = ya1Var2;
                                boolean z3 = z;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.d;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, "CallAdminSettingsController", qv1.m("Cameras in call was changed on ", " success", z3), null);
                                    }
                                }
                                mjg mjgVar2 = ya1Var4.u;
                                do {
                                    value2 = mjgVar2.getValue();
                                } while (!mjgVar2.h(value2, gc.a((gc) value2, false, z3, false, false, false, false, 125)));
                                ya1Var4.s.a(new ld(true, z3));
                                break;
                            default:
                                ya1 ya1Var5 = ya1Var2;
                                boolean z4 = z;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    je9 je9Var3 = je9.d;
                                    if (a4cVar3.b(je9Var3)) {
                                        a4cVar3.c(je9Var3, "CallAdminSettingsController", qv1.m("Screen sharing in call was changed on ", " success", z4), null);
                                    }
                                }
                                mjg mjgVar3 = ya1Var5.u;
                                do {
                                    value3 = mjgVar3.getValue();
                                } while (!mjgVar3.h(value3, gc.a((gc) value3, false, false, false, z4, false, false, 119)));
                                ya1Var5.s.a(new rd(true, z4));
                                break;
                        }
                        return sbi.a;
                    }
                }, new cf7() { // from class: ga1
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        p0a mediaOptionsForCall$default;
                        o0a o0aVar3;
                        p0a mediaOptionsForCall$default2;
                        o0a o0aVar4;
                        p0a mediaOptionsForCall$default3;
                        o0a o0aVar5;
                        switch (i3) {
                            case 0:
                                ya1 ya1Var3 = ya1Var2;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                    }
                                }
                                pzf pzfVar = ya1Var3.s;
                                MediaMuteManager mediaMuteManagerG3 = ya1Var3.g();
                                pzfVar.a(new nd(false, (mediaMuteManagerG3 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG3, null, 1, null)) == null || (o0aVar3 = mediaOptionsForCall$default.a) == null) ? false : ya1.o(o0aVar3)));
                                break;
                            case 1:
                                ya1 ya1Var4 = ya1Var2;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.d;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                    }
                                }
                                pzf pzfVar2 = ya1Var4.s;
                                MediaMuteManager mediaMuteManagerG4 = ya1Var4.g();
                                pzfVar2.a(new ld(false, (mediaMuteManagerG4 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG4, null, 1, null)) == null || (o0aVar4 = mediaOptionsForCall$default2.b) == null) ? false : ya1.o(o0aVar4)));
                                break;
                            default:
                                ya1 ya1Var5 = ya1Var2;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    je9 je9Var3 = je9.d;
                                    if (a4cVar3.b(je9Var3)) {
                                        a4cVar3.c(je9Var3, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                    }
                                }
                                pzf pzfVar3 = ya1Var5.s;
                                MediaMuteManager mediaMuteManagerG5 = ya1Var5.g();
                                pzfVar3.a(new rd(false, (mediaMuteManagerG5 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG5, null, 1, null)) == null || (o0aVar5 = mediaOptionsForCall$default3.c) == null) ? false : ya1.o(o0aVar5)));
                                break;
                        }
                        return sbi.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        final int i4 = 2;
        if (i == R.id.call_admin_settings_screen_sharing_in_call) {
            final ya1 ya1Var3 = (ya1) hb1VarO1.B();
            MediaMuteManager mediaMuteManagerG3 = ya1Var3.g();
            if (mediaMuteManagerG3 != null) {
                ul9 ul9Var3 = new ul9();
                n0a n0aVar3 = n0a.c;
                if (z) {
                    o0aVar = o0aVar2;
                }
                ul9Var3.put(n0aVar3, o0aVar);
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerG3, ul9Var3.b(), null, new af7() { // from class: fa1
                    @Override // defpackage.af7
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i4) {
                            case 0:
                                ya1 ya1Var4 = ya1Var3;
                                boolean z2 = z;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "CallAdminSettingsController", qv1.m("Microphone in call was changed on ", " success", z2), null);
                                    }
                                }
                                mjg mjgVar = ya1Var4.u;
                                do {
                                    value = mjgVar.getValue();
                                } while (!mjgVar.h(value, gc.a((gc) value, false, false, z2, false, false, false, 123)));
                                ya1Var4.s.a(new nd(true, z2));
                                break;
                            case 1:
                                ya1 ya1Var5 = ya1Var3;
                                boolean z3 = z;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.d;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, "CallAdminSettingsController", qv1.m("Cameras in call was changed on ", " success", z3), null);
                                    }
                                }
                                mjg mjgVar2 = ya1Var5.u;
                                do {
                                    value2 = mjgVar2.getValue();
                                } while (!mjgVar2.h(value2, gc.a((gc) value2, false, z3, false, false, false, false, 125)));
                                ya1Var5.s.a(new ld(true, z3));
                                break;
                            default:
                                ya1 ya1Var6 = ya1Var3;
                                boolean z4 = z;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    je9 je9Var3 = je9.d;
                                    if (a4cVar3.b(je9Var3)) {
                                        a4cVar3.c(je9Var3, "CallAdminSettingsController", qv1.m("Screen sharing in call was changed on ", " success", z4), null);
                                    }
                                }
                                mjg mjgVar3 = ya1Var6.u;
                                do {
                                    value3 = mjgVar3.getValue();
                                } while (!mjgVar3.h(value3, gc.a((gc) value3, false, false, false, z4, false, false, 119)));
                                ya1Var6.s.a(new rd(true, z4));
                                break;
                        }
                        return sbi.a;
                    }
                }, new cf7() { // from class: ga1
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        p0a mediaOptionsForCall$default;
                        o0a o0aVar3;
                        p0a mediaOptionsForCall$default2;
                        o0a o0aVar4;
                        p0a mediaOptionsForCall$default3;
                        o0a o0aVar5;
                        switch (i4) {
                            case 0:
                                ya1 ya1Var4 = ya1Var3;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                    }
                                }
                                pzf pzfVar = ya1Var4.s;
                                MediaMuteManager mediaMuteManagerG4 = ya1Var4.g();
                                pzfVar.a(new nd(false, (mediaMuteManagerG4 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG4, null, 1, null)) == null || (o0aVar3 = mediaOptionsForCall$default.a) == null) ? false : ya1.o(o0aVar3)));
                                break;
                            case 1:
                                ya1 ya1Var5 = ya1Var3;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.d;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                    }
                                }
                                pzf pzfVar2 = ya1Var5.s;
                                MediaMuteManager mediaMuteManagerG5 = ya1Var5.g();
                                pzfVar2.a(new ld(false, (mediaMuteManagerG5 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG5, null, 1, null)) == null || (o0aVar4 = mediaOptionsForCall$default2.b) == null) ? false : ya1.o(o0aVar4)));
                                break;
                            default:
                                ya1 ya1Var6 = ya1Var3;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    je9 je9Var3 = je9.d;
                                    if (a4cVar3.b(je9Var3)) {
                                        a4cVar3.c(je9Var3, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                    }
                                }
                                pzf pzfVar3 = ya1Var6.s;
                                MediaMuteManager mediaMuteManagerG6 = ya1Var6.g();
                                pzfVar3.a(new rd(false, (mediaMuteManagerG6 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG6, null, 1, null)) == null || (o0aVar5 = mediaOptionsForCall$default3.c) == null) ? false : ya1.o(o0aVar5)));
                                break;
                        }
                        return sbi.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (i == R.id.call_admin_settings_screen_record_in_call) {
            if (z || ((t4f) hb1VarO1.c.c().j().getValue()).a != u4f.a) {
                ((ya1) hb1VarO1.B()).q(z);
                return;
            } else {
                a8j.x(hb1VarO1.i, ky1.F);
                return;
            }
        }
        if (i != R.id.call_admins_settings_waiting_room) {
            hb1VarO1.getClass();
            return;
        }
        ya1 ya1Var4 = (ya1) hb1VarO1.B();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            ya1Var4.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", zo5.s("Waiting room change state to ", z), null);
            }
        }
        Conversation conversationA = ya1Var4.f().a();
        if (conversationA != null) {
            Conversation.setWaitingRoomEnabled$default(conversationA, z, null, 2, null);
        }
    }

    public int E() {
        return ((ks0[]) this.a).length;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    public boolean F(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        if (str != null && str.length() != 0) {
            if (((Pattern) ((ny8) this.a).getValue()).matcher(str).matches()) {
                List listB = s1m.b(x509Certificate, 7);
                if (!(listB instanceof Collection) || !listB.isEmpty()) {
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        if (z5h.G0((String) it.next(), str, true)) {
                            return true;
                        }
                    }
                }
            } else {
                String lowerCase = str.toLowerCase(Locale.US);
                List<String> listB2 = s1m.b(x509Certificate, 2);
                if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
                    for (String strConcat : listB2) {
                        if (lowerCase.length() == 0 || z5h.K0(lowerCase, ".", false) || z5h.K0(lowerCase, "..", false) || strConcat.length() == 0 || z5h.K0(strConcat, ".", false) || z5h.K0(strConcat, "..", false)) {
                            zEquals = false;
                        } else {
                            String strConcat2 = lowerCase.endsWith(".") ? lowerCase : lowerCase.concat(".");
                            if (!strConcat.endsWith(".")) {
                                strConcat = strConcat.concat(".");
                            }
                            String lowerCase2 = strConcat.toLowerCase(Locale.US);
                            if (!r5h.L0(lowerCase2, "*", false)) {
                                zEquals = strConcat2.equals(lowerCase2);
                            } else if (!z5h.K0(lowerCase2, "*.", false) || r5h.U0(lowerCase2, '*', 1, 4) != -1 || strConcat2.length() < lowerCase2.length() || "*.".equals(lowerCase2) || r5h.U0(lowerCase2.substring(2, lowerCase2.length() - 1), '.', 0, 6) < 0) {
                                zEquals = false;
                            } else {
                                String strSubstring = lowerCase2.substring(1);
                                if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || r5h.Y0(strConcat2, '.', length - 1, 4) == -1)) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            }
                        }
                        if (zEquals) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aqg
    public Object G(int i) {
        if (i >= 0) {
            return (CharSequence) ((iaa) this.a).invoke(Integer.valueOf(i));
        }
        return null;
    }

    @Override // defpackage.zj2
    public void J(Typeface typeface) {
        ((nw3) this.a).k(typeface);
    }

    @Override // defpackage.qlg
    public void M(tlg tlgVar) {
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        j79 j79Var = (j79) this.a;
        qyj.l("The result can only set once!", j79Var.f == null);
        j79Var.f = r72Var;
        return "ListFuture[" + this + "]";
    }

    @Override // defpackage.aqg
    public void R(vpg vpgVar, int i) {
        CharSequence charSequence = (CharSequence) G(i);
        TextView textView = ((k8e) vpgVar).d;
        textView.setText(charSequence);
        textView.setTextSize(1, 14.0f);
    }

    @Override // defpackage.qlg
    public void T(tlg tlgVar) {
        long j = tlgVar.a;
        StickersScreen stickersScreen = (StickersScreen) this.a;
        zv8[] zv8VarArr = StickersScreen.m;
        if (!((q5b) stickersScreen.r1().E().e.a.getValue()).a) {
            o65.c(log.b.b(), zo5.j(j, ":stickers/preview?sticker_id="), null, null, 6);
            return;
        }
        w5b w5bVarE = stickersScreen.r1().E();
        w5bVarE.f.B(w5bVarE, w5b.g[0], yab.h0(w5bVarE.a, ((n0c) w5bVarE.b).a(), 2, new tl1(w5bVarE, j, null, 4)));
    }

    @Override // defpackage.mt9
    public void a() {
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        xi1 xi1Var = (xi1) obj;
        ((zi1) this.a).b.log("CallFinishHandler", "BitrateDumpFileSendTrigger handling succeeded. Enqueueing upload");
        File file = xi1Var.a.a;
        String str = xi1Var.b;
        file.getClass();
        au6 au6Var = FileUploadService.a;
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        it6 it6Var = new it6(absolutePath, str, true);
        y3e y3eVar = nl9.b;
        Application application = ApplicationProvider.a;
        Application applicationF = yab.F();
        try {
            String str2 = "enqueueWork " + it6Var;
            c7k c7kVar = nl9.c;
            (c7kVar != null ? (CidLogger) c7kVar.b : y3eVar).log("FileUploadService", str2);
            Intent intentPutExtra = new Intent().putExtra("eventKey", it6Var);
            intentPutExtra.getClass();
            fp8.enqueueWork(applicationF, (Class<?>) FileUploadService.class, 127672123, intentPutExtra);
        } catch (Exception e) {
            c7k c7kVar2 = nl9.c;
            if (c7kVar2 != null) {
                y3eVar = (CidLogger) c7kVar2.b;
            }
            y3eVar.logException("FileUploadService", "failed to enqueue work", e);
        }
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        Throwable th = (Throwable) obj;
        FastJoinException fastJoinException = th instanceof FastJoinException ? (FastJoinException) th : null;
        if (fastJoinException == null) {
            fastJoinException = new FastJoinException(th);
        }
        ((jl6) this.a).f.reportException("FastJoinPrepare", "fast join failed. reason: " + fastJoinException, fastJoinException);
        return new p64(3, new gg7(fastJoinException));
    }

    @Override // defpackage.t7b
    public void b() {
        g90.f((g90) this.a);
    }

    @Override // defpackage.imc
    public Object c() {
        return this.a;
    }

    @Override // defpackage.t7b
    public void d(long j) {
        g90.f((g90) this.a);
    }

    @Override // defpackage.mt9
    public void e(int i, ty4 ty4Var, long j, int i2) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, ty4Var.i, j, i2);
    }

    @Override // defpackage.mt9
    public void flush() {
    }

    @Override // defpackage.t7b
    public void g() {
        g90.f((g90) this.a);
    }

    @Override // defpackage.mt9
    public void h(long j, int i, int i2, int i3) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.t7b
    public void i() {
        g90.f((g90) this.a);
    }

    @Override // defpackage.t7b
    public void j() {
        g90.f((g90) this.a);
    }

    @Override // defpackage.t7b
    public void k() {
        g90.f((g90) this.a);
    }

    @Override // defpackage.bca
    public void l(yba ybaVar, MenuItem menuItem) {
        ((yn2) this.a).f.removeCallbacksAndMessages(ybaVar);
    }

    @Override // defpackage.t7b
    public void n() {
        g90.f((g90) this.a);
    }

    @Override // defpackage.v8h
    public Object o(nq4 nq4Var) {
        return ((yf5) ((g85) this.a).d).p(nq4Var);
    }

    @Override // defpackage.aqg
    public vpg p(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.addView(new AppCompatTextView(viewGroup.getContext()));
        return new k8e(frameLayout);
    }

    @Override // defpackage.imc
    public boolean q() {
        return true;
    }

    @Override // defpackage.bca
    public void r(yba ybaVar, cca ccaVar) {
        yn2 yn2Var = (yn2) this.a;
        Handler handler = yn2Var.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = yn2Var.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ybaVar == ((xn2) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new wn2(this, i2 < arrayList.size() ? (xn2) arrayList.get(i2) : null, ccaVar, ybaVar, 0), ybaVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.imc
    public Object s() {
        return this.a;
    }

    @Override // defpackage.mt9
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    @Override // defpackage.mt9
    public void shutdown() {
    }

    @Override // defpackage.mt9
    public void start() {
    }

    @Override // defpackage.wj4
    public void t0(long j) {
        ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.a;
        ml9.b(chatsListSearchScreen);
        zv8[] zv8VarArr = ChatsListSearchScreen.F;
        chatsListSearchScreen.r1().I(j);
    }

    public eue u() {
        return (eue) this.a;
    }

    public int v() {
        return ((si) this.a).c.b();
    }

    public zvh w() {
        return ((j42) ((af7) this.a).invoke()).w();
    }

    public int y() {
        return ((si) this.a).c.f();
    }

    public ks0[] z() {
        ks0[] ks0VarArr = (ks0[]) this.a;
        ks0[] ks0VarArr2 = new ks0[ks0VarArr.length];
        for (int i = 0; i < ks0VarArr.length; i++) {
            ks0 ks0Var = ks0VarArr[i];
            ks0Var.getClass();
            ks0VarArr2[i] = ks0Var;
        }
        return ks0VarArr2;
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public e89 mo41apply(Object obj) {
        return o9b.f(((bg7) this.a).mo41apply(obj));
    }

    public /* synthetic */ due(Object obj) {
        this.a = obj;
    }
}
