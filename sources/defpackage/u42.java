package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class u42 {
    public final w82 a;
    public final b95 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final pzf f;
    public final q8e g;

    public u42(w82 w82Var, b95 b95Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = w82Var;
        this.b = b95Var;
        this.c = ny8Var3;
        this.d = ny8Var;
        this.e = ny8Var2;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.f = pzfVarB;
        this.g = new q8e(pzfVarB);
    }

    public final da1 a() {
        return (da1) this.c.getValue();
    }

    public final x02 b() {
        return (x02) this.b.i.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x016f  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0209  */
    public final ze1 c(fu1 fu1Var, Point point) {
        boolean z;
        boolean z2;
        boolean z3;
        if (fu1Var.equals(fu1.c) || !((dz4) b().z().getValue()).i) {
            return null;
        }
        w82 w82Var = this.a;
        boolean zD = cqk.d(((l9) w82Var.r.a.getValue()).e.a, fu1Var);
        tmc tmcVarB = cqk.d(w82Var.b().a.getId(), fu1Var) ? w82Var.b() : (tmc) ((l9) w82Var.r.a.getValue()).c.c.get(fu1Var);
        tmc tmcVarB2 = w82Var.b();
        boolean z4 = ((dz4) b().z().getValue()).e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c79 c79VarW = yab.w();
        hu1 hu1Var = tmcVarB2.a;
        boolean zD2 = cqk.d(hu1Var.getId(), tmcVarB != null ? tmcVarB.a.getId() : null);
        linkedHashMap.put("message", Boolean.valueOf(!zD2));
        if (!zD2) {
            c79VarW.add(new rp4(R.id.call_context_action_user_write_chat, new tnh(R.string.call_user_info_open_chat), Integer.valueOf(R.drawable.icon_message), (Integer) null, 20));
        }
        if (cqk.d(hu1Var.getId(), tmcVarB != null ? tmcVarB.a.getId() : null) && hu1Var.c()) {
            c79VarW.add(new rp4(R.id.call_context_action_user_camera_rotate, new tnh(R.string.call_user_item_rotate), Integer.valueOf(R.drawable.ic_rotation_view_16), (Integer) null, 20));
        }
        if (tmcVarB != null) {
            linkedHashMap.put("pin", Boolean.valueOf(zD));
            boolean zD3 = cqk.d(tmcVarB.a.getId(), hu1Var.getId());
            if (z4 || !zD3) {
                if (zD) {
                    c79VarW.add(new rp4(R.id.call_context_action_user_unpin, new tnh(R.string.call_user_info_unpin), Integer.valueOf(R.drawable.icon_pin_crossed), (Integer) null, 20));
                } else {
                    c79VarW.add(new rp4(R.id.call_context_action_user_pin, new tnh(R.string.call_user_info_pin), Integer.valueOf(R.drawable.icon_pin), (Integer) null, 20));
                }
            }
        }
        boolean z5 = true;
        if (!hu1Var.j() || tmcVarB == null) {
            z = true;
        } else {
            hu1 hu1Var2 = tmcVarB.a;
            if (cqk.d(hu1Var2.getId(), hu1Var.getId()) || !hu1Var2.isScreenCaptureEnabled()) {
                z = true;
            } else {
                z = false;
            }
        }
        linkedHashMap.put("screenshare", Boolean.valueOf(!z));
        if (!z) {
            c79VarW.add(new rp4(R.id.call_screen_camera_admin_stop_sharing_user, new tnh(R.string.call_screen_camera_admin_stop_sharing_user), Integer.valueOf(R.drawable.icon_share_screen_off), (Integer) null, 20));
        }
        if (!hu1Var.j() || tmcVarB == null) {
            z2 = true;
        } else {
            hu1 hu1Var3 = tmcVarB.a;
            if (cqk.d(hu1Var3.getId(), hu1Var.getId()) || !hu1Var3.d()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        linkedHashMap.put("microphone", Boolean.valueOf(!z2));
        if (!z2) {
            c79VarW.add(new rp4(R.id.call_screen_camera_admin_stop_mic_user, new tnh(R.string.call_screen_camera_admin_stop_mic_user), Integer.valueOf(R.drawable.icon_microphone_crossed), (Integer) null, 20));
        }
        if (!hu1Var.j() || tmcVarB == null) {
            z3 = true;
        } else {
            hu1 hu1Var4 = tmcVarB.a;
            if (cqk.d(hu1Var4.getId(), hu1Var.getId()) || !hu1Var4.c()) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        linkedHashMap.put("camera", Boolean.valueOf(!z3));
        if (!z3) {
            c79VarW.add(new rp4(R.id.call_screen_camera_admin_stop_camera_user, new tnh(R.string.call_screen_camera_admin_stop_camera_user), Integer.valueOf(R.drawable.icon_video_call_crossed), (Integer) null, 20));
        }
        if (hu1Var.j() && tmcVarB != null) {
            hu1 hu1Var5 = tmcVarB.a;
            if (!cqk.d(hu1Var5.getId(), hu1Var.getId()) && !hu1Var5.j()) {
                z5 = false;
            }
        }
        linkedHashMap.put("kick", Boolean.valueOf(!z5));
        if (!z5) {
            c79VarW.add(new rp4(R.id.call_screen_camera_admin_remove_user, new tnh(R.string.call_screen_camera_admin_remove_user), Integer.valueOf(R.attr.text_negative), Integer.valueOf(R.drawable.icon_user_exclude), Integer.valueOf(R.attr.icon_negative)));
        }
        if (tmcVarB != null) {
            hu1 hu1Var6 = tmcVarB.a;
            if (hu1Var6.f() && (hu1Var.j() || cqk.d(hu1Var6.getId(), hu1Var.getId()))) {
                c79VarW.add(new rp4(R.id.call_context_action_user_low_hand, new tnh(R.string.call_screen_camera_admin_low_hand), Integer.valueOf(R.drawable.icon_hand_crossed), (Integer) null, 20));
            }
        }
        c79 c79VarJ = yab.j(c79VarW);
        Bundle bundleI = n1g.i(new ylc[0]);
        bundleI.putParcelable("call_participant_id", tmcVarB != null ? tmcVarB.a.getId() : null);
        return new ze1(bundleI, c79VarJ, linkedHashMap, point);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(int i, Bundle bundle, nq4 nq4Var) {
        r42 r42Var;
        fu1 fu1Var;
        fu1 fu1Var2;
        Object objE;
        fu1 fu1Var3;
        fu1 fu1Var4;
        final fu1 fu1Var5;
        final ya1 ya1Var;
        MediaMuteManager mediaMuteManagerG;
        final fu1 fu1Var6;
        final ya1 ya1Var2;
        MediaMuteManager mediaMuteManagerG2;
        final fu1 fu1Var7;
        final ya1 ya1Var3;
        MediaMuteManager mediaMuteManagerG3;
        fu1 fu1Var8;
        if (nq4Var instanceof r42) {
            r42Var = (r42) nq4Var;
            int i2 = r42Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r42Var.f = i2 - Integer.MIN_VALUE;
            } else {
                r42Var = new r42(this, nq4Var);
            }
        } else {
            r42Var = new r42(this, nq4Var);
        }
        Object obj = r42Var.d;
        int i3 = r42Var.f;
        boolean z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        if (i3 == 0) {
            ch3.d0(obj);
            w82 w82Var = this.a;
            if (i != R.id.call_screen_camera_admin_remove_user) {
                o0a o0aVar = o0a.b;
                if (i == R.id.call_screen_camera_admin_stop_camera_user) {
                    if (bundle != null && (fu1Var7 = (fu1) bundle.getParcelable("call_participant_id")) != null && (mediaMuteManagerG3 = (ya1Var3 = (ya1) a()).g()) != null) {
                        ParticipantId participantIdC = anc.c(fu1Var7);
                        ul9 ul9Var = new ul9();
                        ul9Var.put(n0a.b, o0aVar);
                        ul9 ul9VarB = ul9Var.b();
                        final int i4 = 2;
                        MediaMuteManager.updateMediaOptionsForParticipant$default(mediaMuteManagerG3, ul9VarB, participantIdC, null, new af7() { // from class: ka1
                            @Override // defpackage.af7
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        ya1 ya1Var4 = ya1Var3;
                                        fu1 fu1Var9 = fu1Var7;
                                        a4c a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            je9 je9Var = je9.d;
                                            if (a4cVar.b(je9Var)) {
                                                a4cVar.c(je9Var, "CallAdminSettingsController", "Disable screen sharing for " + fu1Var9 + " was success", null);
                                            }
                                        }
                                        ya1Var4.s.a(new wd(fu1Var9));
                                        break;
                                    case 1:
                                        ya1 ya1Var5 = ya1Var3;
                                        fu1 fu1Var10 = fu1Var7;
                                        a4c a4cVar2 = gm0.f;
                                        if (a4cVar2 != null) {
                                            je9 je9Var2 = je9.d;
                                            if (a4cVar2.b(je9Var2)) {
                                                a4cVar2.c(je9Var2, "CallAdminSettingsController", "Disable microphone for " + fu1Var10 + " was success", null);
                                            }
                                        }
                                        ya1Var5.s.a(new td(fu1Var10, true));
                                        break;
                                    default:
                                        ya1 ya1Var6 = ya1Var3;
                                        fu1 fu1Var11 = fu1Var7;
                                        a4c a4cVar3 = gm0.f;
                                        if (a4cVar3 != null) {
                                            je9 je9Var3 = je9.d;
                                            if (a4cVar3.b(je9Var3)) {
                                                a4cVar3.c(je9Var3, "CallAdminSettingsController", "Disable camera for " + fu1Var11 + " was success", null);
                                            }
                                        }
                                        ya1Var6.s.a(new sd(fu1Var11, true));
                                        break;
                                }
                                return sbi.a;
                            }
                        }, new cf7() { // from class: oa1
                            @Override // defpackage.cf7
                            public final Object invoke(Object obj2) {
                                switch (i4) {
                                    case 0:
                                        ya1 ya1Var4 = ya1Var3;
                                        fu1 fu1Var9 = fu1Var7;
                                        Throwable th = (Throwable) obj2;
                                        a4c a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            je9 je9Var = je9.d;
                                            if (a4cVar.b(je9Var)) {
                                                a4cVar.c(je9Var, "CallAdminSettingsController", "Disable screen sharing for " + fu1Var9 + " failed due to: " + th.getMessage(), null);
                                            }
                                        }
                                        ya1Var4.s.a(new wd(fu1Var9));
                                        break;
                                    case 1:
                                        ya1 ya1Var5 = ya1Var3;
                                        fu1 fu1Var10 = fu1Var7;
                                        Throwable th2 = (Throwable) obj2;
                                        a4c a4cVar2 = gm0.f;
                                        if (a4cVar2 != null) {
                                            je9 je9Var2 = je9.d;
                                            if (a4cVar2.b(je9Var2)) {
                                                a4cVar2.c(je9Var2, "CallAdminSettingsController", "Disable microphone for " + fu1Var10 + " failed due to: " + th2.getMessage(), null);
                                            }
                                        }
                                        ya1Var5.s.a(new td(fu1Var10, false));
                                        break;
                                    default:
                                        ya1 ya1Var6 = ya1Var3;
                                        fu1 fu1Var11 = fu1Var7;
                                        Throwable th3 = (Throwable) obj2;
                                        a4c a4cVar3 = gm0.f;
                                        if (a4cVar3 != null) {
                                            je9 je9Var3 = je9.d;
                                            if (a4cVar3.b(je9Var3)) {
                                                a4cVar3.c(je9Var3, "CallAdminSettingsController", "Disable camera for " + fu1Var11 + " failed due to: " + th3.getMessage(), null);
                                            }
                                        }
                                        ya1Var6.s.a(new sd(fu1Var11, false));
                                        break;
                                }
                                return sbi.a;
                            }
                        }, 4, null);
                    }
                } else if (i != R.id.call_screen_camera_admin_stop_mic_user) {
                    final int i5 = 0;
                    if (i == R.id.call_screen_camera_admin_stop_sharing_user) {
                        if (bundle != null && (fu1Var5 = (fu1) bundle.getParcelable("call_participant_id")) != null && (mediaMuteManagerG = (ya1Var = (ya1) a()).g()) != null) {
                            ParticipantId participantIdC2 = anc.c(fu1Var5);
                            ul9 ul9Var2 = new ul9();
                            ul9Var2.put(n0a.c, o0aVar);
                            MediaMuteManager.updateMediaOptionsForParticipant$default(mediaMuteManagerG, ul9Var2.b(), participantIdC2, null, new af7() { // from class: ka1
                                @Override // defpackage.af7
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            ya1 ya1Var4 = ya1Var;
                                            fu1 fu1Var9 = fu1Var5;
                                            a4c a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                je9 je9Var = je9.d;
                                                if (a4cVar.b(je9Var)) {
                                                    a4cVar.c(je9Var, "CallAdminSettingsController", "Disable screen sharing for " + fu1Var9 + " was success", null);
                                                }
                                            }
                                            ya1Var4.s.a(new wd(fu1Var9));
                                            break;
                                        case 1:
                                            ya1 ya1Var5 = ya1Var;
                                            fu1 fu1Var10 = fu1Var5;
                                            a4c a4cVar2 = gm0.f;
                                            if (a4cVar2 != null) {
                                                je9 je9Var2 = je9.d;
                                                if (a4cVar2.b(je9Var2)) {
                                                    a4cVar2.c(je9Var2, "CallAdminSettingsController", "Disable microphone for " + fu1Var10 + " was success", null);
                                                }
                                            }
                                            ya1Var5.s.a(new td(fu1Var10, true));
                                            break;
                                        default:
                                            ya1 ya1Var6 = ya1Var;
                                            fu1 fu1Var11 = fu1Var5;
                                            a4c a4cVar3 = gm0.f;
                                            if (a4cVar3 != null) {
                                                je9 je9Var3 = je9.d;
                                                if (a4cVar3.b(je9Var3)) {
                                                    a4cVar3.c(je9Var3, "CallAdminSettingsController", "Disable camera for " + fu1Var11 + " was success", null);
                                                }
                                            }
                                            ya1Var6.s.a(new sd(fu1Var11, true));
                                            break;
                                    }
                                    return sbi.a;
                                }
                            }, new cf7() { // from class: oa1
                                @Override // defpackage.cf7
                                public final Object invoke(Object obj2) {
                                    switch (i5) {
                                        case 0:
                                            ya1 ya1Var4 = ya1Var;
                                            fu1 fu1Var9 = fu1Var5;
                                            Throwable th = (Throwable) obj2;
                                            a4c a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                je9 je9Var = je9.d;
                                                if (a4cVar.b(je9Var)) {
                                                    a4cVar.c(je9Var, "CallAdminSettingsController", "Disable screen sharing for " + fu1Var9 + " failed due to: " + th.getMessage(), null);
                                                }
                                            }
                                            ya1Var4.s.a(new wd(fu1Var9));
                                            break;
                                        case 1:
                                            ya1 ya1Var5 = ya1Var;
                                            fu1 fu1Var10 = fu1Var5;
                                            Throwable th2 = (Throwable) obj2;
                                            a4c a4cVar2 = gm0.f;
                                            if (a4cVar2 != null) {
                                                je9 je9Var2 = je9.d;
                                                if (a4cVar2.b(je9Var2)) {
                                                    a4cVar2.c(je9Var2, "CallAdminSettingsController", "Disable microphone for " + fu1Var10 + " failed due to: " + th2.getMessage(), null);
                                                }
                                            }
                                            ya1Var5.s.a(new td(fu1Var10, false));
                                            break;
                                        default:
                                            ya1 ya1Var6 = ya1Var;
                                            fu1 fu1Var11 = fu1Var5;
                                            Throwable th3 = (Throwable) obj2;
                                            a4c a4cVar3 = gm0.f;
                                            if (a4cVar3 != null) {
                                                je9 je9Var3 = je9.d;
                                                if (a4cVar3.b(je9Var3)) {
                                                    a4cVar3.c(je9Var3, "CallAdminSettingsController", "Disable camera for " + fu1Var11 + " failed due to: " + th3.getMessage(), null);
                                                }
                                            }
                                            ya1Var6.s.a(new sd(fu1Var11, false));
                                            break;
                                    }
                                    return sbi.a;
                                }
                            }, 4, null);
                        }
                    } else if (i == R.id.call_context_action_user_pin) {
                        if (bundle != null && (fu1Var4 = (fu1) bundle.getParcelable("call_participant_id")) != null) {
                            g(fu1Var4);
                        }
                    } else if (i == R.id.call_context_action_user_unpin) {
                        if (bundle != null && (fu1Var3 = (fu1) bundle.getParcelable("call_participant_id")) != null) {
                            g(fu1Var3);
                        }
                    } else if (i == R.id.call_context_action_user_camera_rotate) {
                        i();
                    } else if (i == R.id.call_context_action_user_write_chat) {
                        r42Var.f = 1;
                        Object obj2 = hu4.a;
                        Object obj3 = sbi.a;
                        if (bundle != null && (fu1Var2 = (fu1) bundle.getParcelable("call_participant_id")) != null && (objE = e(fu1Var2.a, r42Var)) == obj2) {
                            obj3 = objE;
                        }
                        if (obj3 == obj2) {
                            return obj2;
                        }
                    } else if (i != R.id.call_context_action_user_low_hand) {
                        z = false;
                    } else if (bundle != null && (fu1Var = (fu1) bundle.getParcelable("call_participant_id")) != null) {
                        if (fu1Var.equals(w82Var.b().a.getId())) {
                            ((ya1) a()).p(false);
                        } else {
                            ya1 ya1Var4 = (ya1) a();
                            ParticipantStatesManager participantStatesManagerH = ya1Var4.h();
                            if (participantStatesManagerH != null) {
                                participantStatesManagerH.lowerHandParticipant(anc.c(fu1Var));
                            }
                            ya1Var4.s.a(ud.a);
                        }
                    }
                } else if (bundle != null && (fu1Var6 = (fu1) bundle.getParcelable("call_participant_id")) != null && (mediaMuteManagerG2 = (ya1Var2 = (ya1) a()).g()) != null) {
                    ParticipantId participantIdC3 = anc.c(fu1Var6);
                    ul9 ul9Var3 = new ul9();
                    ul9Var3.put(n0a.a, o0aVar);
                    ul9 ul9VarB2 = ul9Var3.b();
                    final int i6 = z ? 1 : 0;
                    af7 af7Var = new af7() { // from class: ka1
                        @Override // defpackage.af7
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    ya1 ya1Var5 = ya1Var2;
                                    fu1 fu1Var9 = fu1Var6;
                                    a4c a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        je9 je9Var = je9.d;
                                        if (a4cVar.b(je9Var)) {
                                            a4cVar.c(je9Var, "CallAdminSettingsController", "Disable screen sharing for " + fu1Var9 + " was success", null);
                                        }
                                    }
                                    ya1Var5.s.a(new wd(fu1Var9));
                                    break;
                                case 1:
                                    ya1 ya1Var6 = ya1Var2;
                                    fu1 fu1Var10 = fu1Var6;
                                    a4c a4cVar2 = gm0.f;
                                    if (a4cVar2 != null) {
                                        je9 je9Var2 = je9.d;
                                        if (a4cVar2.b(je9Var2)) {
                                            a4cVar2.c(je9Var2, "CallAdminSettingsController", "Disable microphone for " + fu1Var10 + " was success", null);
                                        }
                                    }
                                    ya1Var6.s.a(new td(fu1Var10, true));
                                    break;
                                default:
                                    ya1 ya1Var7 = ya1Var2;
                                    fu1 fu1Var11 = fu1Var6;
                                    a4c a4cVar3 = gm0.f;
                                    if (a4cVar3 != null) {
                                        je9 je9Var3 = je9.d;
                                        if (a4cVar3.b(je9Var3)) {
                                            a4cVar3.c(je9Var3, "CallAdminSettingsController", "Disable camera for " + fu1Var11 + " was success", null);
                                        }
                                    }
                                    ya1Var7.s.a(new sd(fu1Var11, true));
                                    break;
                            }
                            return sbi.a;
                        }
                    };
                    final int i7 = z ? 1 : 0;
                    MediaMuteManager.updateMediaOptionsForParticipant$default(mediaMuteManagerG2, ul9VarB2, participantIdC3, null, af7Var, new cf7() { // from class: oa1
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj4) {
                            switch (i7) {
                                case 0:
                                    ya1 ya1Var5 = ya1Var2;
                                    fu1 fu1Var9 = fu1Var6;
                                    Throwable th = (Throwable) obj4;
                                    a4c a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        je9 je9Var = je9.d;
                                        if (a4cVar.b(je9Var)) {
                                            a4cVar.c(je9Var, "CallAdminSettingsController", "Disable screen sharing for " + fu1Var9 + " failed due to: " + th.getMessage(), null);
                                        }
                                    }
                                    ya1Var5.s.a(new wd(fu1Var9));
                                    break;
                                case 1:
                                    ya1 ya1Var6 = ya1Var2;
                                    fu1 fu1Var10 = fu1Var6;
                                    Throwable th2 = (Throwable) obj4;
                                    a4c a4cVar2 = gm0.f;
                                    if (a4cVar2 != null) {
                                        je9 je9Var2 = je9.d;
                                        if (a4cVar2.b(je9Var2)) {
                                            a4cVar2.c(je9Var2, "CallAdminSettingsController", "Disable microphone for " + fu1Var10 + " failed due to: " + th2.getMessage(), null);
                                        }
                                    }
                                    ya1Var6.s.a(new td(fu1Var10, false));
                                    break;
                                default:
                                    ya1 ya1Var7 = ya1Var2;
                                    fu1 fu1Var11 = fu1Var6;
                                    Throwable th3 = (Throwable) obj4;
                                    a4c a4cVar3 = gm0.f;
                                    if (a4cVar3 != null) {
                                        je9 je9Var3 = je9.d;
                                        if (a4cVar3.b(je9Var3)) {
                                            a4cVar3.c(je9Var3, "CallAdminSettingsController", "Disable camera for " + fu1Var11 + " failed due to: " + th3.getMessage(), null);
                                        }
                                    }
                                    ya1Var7.s.a(new sd(fu1Var11, false));
                                    break;
                            }
                            return sbi.a;
                        }
                    }, 4, null);
                }
            } else if (bundle != null && (fu1Var8 = (fu1) bundle.getParcelable("call_participant_id")) != null) {
                if (((l9) w82Var.r.a.getValue()).d.h) {
                    h(fu1Var8);
                } else {
                    this.f.a(new fy1(fu1Var8));
                }
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, nq4 nq4Var) {
        s42 s42Var;
        if (nq4Var instanceof s42) {
            s42Var = (s42) nq4Var;
            int i = s42Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                s42Var.f = i - Integer.MIN_VALUE;
            } else {
                s42Var = new s42(this, nq4Var);
            }
        } else {
            s42Var = new s42(this, nq4Var);
        }
        Object objR = s42Var.d;
        int i2 = s42Var.f;
        if (i2 == 0) {
            ch3.d0(objR);
            xn3 xn3Var = (xn3) this.e.getValue();
            s42Var.f = 1;
            objR = xn3Var.r(j, s42Var);
            hu4 hu4Var = hu4.a;
            if (objR == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objR);
        }
        long j2 = ((rt2) objR).a;
        sa2 sa2Var = (sa2) this.d.getValue();
        String strA = ns4.a(((dz4) b().z().getValue()).c);
        boolean z = ((dz4) b().z().getValue()).i;
        sa2Var.getClass();
        sa2.c(sa2Var, "CHAT_OPENED", strA, null, null, null, null, z, null, 380);
        cs1.b.getClass();
        n65 n65Var = new n65();
        n65Var.a = ":chats";
        n65Var.d(Long.valueOf(j2), "id");
        n65Var.d("local", "type");
        n65Var.d(Boolean.TRUE, "pop_controllers");
        this.f.a(new i65(n65Var.b()));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j, nq4 nq4Var) {
        t42 t42Var;
        if (nq4Var instanceof t42) {
            t42Var = (t42) nq4Var;
            int i = t42Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                t42Var.f = i - Integer.MIN_VALUE;
            } else {
                t42Var = new t42(this, nq4Var);
            }
        } else {
            t42Var = new t42(this, nq4Var);
        }
        Object objR = t42Var.d;
        int i2 = t42Var.f;
        if (i2 == 0) {
            ch3.d0(objR);
            xn3 xn3Var = (xn3) this.e.getValue();
            t42Var.f = 1;
            objR = xn3Var.r(j, t42Var);
            hu4 hu4Var = hu4.a;
            if (objR == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objR);
        }
        this.f.a(cs1.k(cs1.b, ((rt2) objR).a));
        return sbi.a;
    }

    public final void g(fu1 fu1Var) {
        boolean z = ((dz4) b().z().getValue()).e;
        if (!fu1Var.equals(fu1.c) && ((dz4) b().z().getValue()).i && z) {
            zv8[] zv8VarArr = w82.E;
            this.a.g(fu1Var, false);
        }
    }

    public final void h(fu1 fu1Var) {
        CharSequence name;
        tmc tmcVar = (tmc) ((l9) this.a.r.a.getValue()).c.c.get(fu1Var);
        if (tmcVar == null || (name = tmcVar.b.getName()) == null) {
            return;
        }
        py1 py1Var = ry1.b;
        this.f.a(new qy1(new vnh(R.string.call_screen_admin_remove_user_title, a.n1(new Object[]{name})), new wre(this, fu1Var, name, 6)));
    }

    public final void i() {
        w82 w82Var = this.a;
        sa2 sa2Var = (sa2) w82Var.k.getValue();
        mjg mjgVar = w82Var.m;
        String strA = ns4.a(((dz4) ((x02) mjgVar.getValue()).z().getValue()).c);
        rd1 rd1Var = w82Var.c;
        long j = rd1Var.b() ? 2L : 1L;
        boolean z = ((dz4) ((x02) mjgVar.getValue()).z().getValue()).i;
        sa2Var.getClass();
        sa2.c(sa2Var, "CAMERA_CHANGED", strA, null, Long.valueOf(j), null, null, z, null, 372);
        int i = rd1Var.b() ? 2 : 1;
        CameraManager cameraManagerA = rd1Var.a();
        if (cameraManagerA != null) {
            cameraManagerA.switchCamera(new eg2(i));
        }
    }
}
