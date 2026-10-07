package defpackage;

import java.util.Collections;
import kotlin.collections.a;
import one.me.profile.ProfileScreen;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aud implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dud b;

    public /* synthetic */ aud(dud dudVar, int i) {
        this.a = i;
        this.b = dudVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        jud judVar;
        int i = this.a;
        dud dudVar = this.b;
        switch (i) {
            case 0:
                dvd dvdVarV1 = dudVar.f.v1();
                String strI = dvdVarV1.p1.i();
                if (strI == null) {
                    String str = dvdVarV1.f;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "No link for profile!", null);
                        }
                    }
                } else {
                    a8j.x(dvdVarV1.B, new eud(strI));
                }
                return sbi.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                ProfileScreen profileScreen = dudVar.f;
                profileScreen.getClass();
                if (iIntValue == R.id.profile_audio_button) {
                    profileScreen.v1().K(false);
                } else if (iIntValue == R.id.profile_video_button) {
                    profileScreen.v1().K(true);
                } else if (iIntValue == R.id.profile_search_button) {
                    dvd dvdVarV2 = profileScreen.v1();
                    Long lJ = dvdVarV2.p1.j();
                    if (lJ != null) {
                        a8j.x(dvdVarV2.C, new lsd(lJ.longValue()));
                    }
                } else if (iIntValue == R.id.profile_notifs_enabled_button) {
                    dvd dvdVarV3 = profileScreen.v1();
                    ic6 ic6Var = dvdVarV3.B;
                    mld mldVar = (mld) dvdVarV3.H.getValue();
                    mldVar.getClass();
                    tnh tnhVar = new tnh(R.string.profile_notifications_bottom_sheet_title);
                    c79 c79VarW = yab.w();
                    c79VarW.add(new kc4(R.id.profile_notifications_confirmation_sheet_1_hour, new tnh(R.string.profile_notifications_disable_1_hour), 3, 56));
                    c79VarW.add(new kc4(R.id.profile_notifications_confirmation_sheet_4_hour, new tnh(R.string.profile_notifications_disable_4_hour), 3, 56));
                    c79VarW.add(new kc4(R.id.profile_notifications_confirmation_sheet_1_day, new tnh(R.string.profile_notifications_disable_1_day), 3, 56));
                    c79VarW.add(new kc4(R.id.profile_notifications_confirmation_sheet_forever, new tnh(R.string.profile_notifications_disable_forever), 1, 56));
                    c79VarW.add(mldVar.c());
                    a8j.x(ic6Var, new jud(tnhVar, null, yab.j(c79VarW), null));
                } else if (iIntValue == R.id.profile_notifs_disabled_button) {
                    dvd dvdVarV4 = profileScreen.v1();
                    Long lJ2 = dvdVarV4.p1.j();
                    if (lJ2 != null) {
                        long jLongValue = lJ2.longValue();
                        qw2 qw2VarJ = dvdVarV4.D().j();
                        rt2 rt2VarN = qw2VarJ.N(jLongValue);
                        if (rt2VarN != null) {
                            qw2VarJ.x(rt2VarN, 0L, true);
                            ((pvb) qw2VarJ.r.get()).o(rt2VarN.a);
                        }
                        a8j.x(dvdVarV4.B, new pud(4, new tnh(R.string.notifications_enabled), Integer.valueOf(R.drawable.icon_check_round_fill)));
                    } else {
                        gm0.Y(dvd.class.getName(), "Early return in unmuteChat cuz of profile.chatLocalId is null");
                    }
                } else if (iIntValue == R.id.profile_start_chat_button) {
                    dvd dvdVarV5 = profileScreen.v1();
                    yab.i0(dvdVarV5.b, ((n0c) dvdVarV5.F()).a(), 0, new zud(dvdVarV5, null, 4), 2);
                } else if (iIntValue == R.id.profile_start_bot_button) {
                    dvd dvdVarV6 = profileScreen.v1();
                    g4b g4bVarJ = ((h4b) dvdVarV6.y.getValue()).J(8);
                    dq4 dq4Var = dvdVarV6.b;
                    xt4 xt4VarB = ((n0c) dvdVarV6.F()).b();
                    yt4 yt4VarE = dvdVarV6.E();
                    xt4VarB.getClass();
                    yab.i0(dq4Var, lvb.x0(xt4VarB, yt4VarE), 0, new l0d(dvdVarV6, g4bVarJ, null, 22), 2);
                } else if (iIntValue == R.id.profile_unblock_button) {
                    dvd dvdVarV7 = profileScreen.v1();
                    yab.i0(dvdVarV7.b, ((n0c) dvdVarV7.F()).b(), 0, new l0d(dvdVarV7, (lq4) null, 23), 2);
                } else if (iIntValue == R.id.profile_more_action_share_contact) {
                    dvd dvdVarV8 = profileScreen.v1();
                    wjd wjdVar = dvdVarV8.p1;
                    Long lValueOf = wjdVar.t() ? Long.valueOf(wjdVar.o()) : null;
                    if (lValueOf == null) {
                        gm0.Y(dvdVarV8.f, "Can't share contact because profile not dialog");
                    } else {
                        a8j.x(dvdVarV8.C, new msd(new ShareData(7, null, null, null, null, null, Collections.singletonList(lValueOf), null, 190, null), new tnh(R.string.share)));
                    }
                } else if (iIntValue == R.id.profile_more_action_add_to_folder) {
                    dvd dvdVarV9 = profileScreen.v1();
                    Long lK = dvdVarV9.p1.k();
                    if (lK != null) {
                        a8j.x(dvdVarV9.C, new vrd(lK.longValue()));
                    } else {
                        gm0.Y(dvdVarV9.f, "Early return in addToFolderAction cuz of profile.chatServerId is null");
                    }
                } else if (iIntValue == R.id.profile_more_action_clear_history) {
                    dvd dvdVarV10 = profileScreen.v1();
                    wjd wjdVar2 = dvdVarV10.p1;
                    wjdVar2.getClass();
                    if (wjdVar2 instanceof z01) {
                        dvdVarV10.B(false);
                    } else {
                        bkd bkdVar = (bkd) dvdVarV10.Z.getValue();
                        CharSequence charSequence = bkdVar != null ? bkdVar.e : null;
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        int iL = wjdVar2.l();
                        if (iL != 0) {
                            ic6 ic6Var2 = dvdVarV10.B;
                            mld mldVar2 = (mld) dvdVarV10.H.getValue();
                            boolean zS = wjdVar2.s();
                            mldVar2.getClass();
                            int iD = qt4.D(iL);
                            if (iD == 0) {
                                vnh vnhVar = new vnh(R.string.profile_clear_multi_chat_history_bottom_sheet_title, a.n1(new Object[]{charSequence}));
                                c79 c79VarW2 = yab.w();
                                c79VarW2.add(new kc4(R.id.profile_clear_history_confirmation_sheet_confirm_for_yourself, new tnh(R.string.profile_clear_chat_history_bottom_sheet_confirm_for_yourself), 1, 56));
                                if (zS) {
                                    c79VarW2.add(new kc4(R.id.profile_clear_history_confirmation_sheet_confirm_for_all, new tnh(R.string.profile_clear_chat_history_bottom_sheet_confirm_for_all), 1, 56));
                                }
                                c79VarW2.add(mldVar2.c());
                                judVar = new jud(vnhVar, null, yab.j(c79VarW2), null);
                            } else if (iD == 1) {
                                tnh tnhVar2 = new tnh(R.string.profile_clear_chat_history_bottom_sheet_title);
                                vnh vnhVar2 = new vnh(R.string.profile_clear_dialog_history_bottom_sheet_description, a.n1(new Object[]{charSequence}));
                                c79 c79VarW3 = yab.w();
                                c79VarW3.add(new kc4(R.id.profile_clear_history_confirmation_sheet_confirm_for_yourself, new tnh(R.string.profile_clear_chat_history_bottom_sheet_confirm_for_yourself), 1, 56));
                                c79VarW3.add(mldVar2.c());
                                judVar = new jud(tnhVar2, vnhVar2, yab.j(c79VarW3), null);
                            } else if (iD == 2) {
                                tnh tnhVar3 = new tnh(R.string.profile_clear_channel_history_bottom_sheet_title);
                                tnh tnhVar4 = new tnh(R.string.profile_clear_channel_history_bottom_sheet_desctiption);
                                c79 c79VarW4 = yab.w();
                                c79VarW4.add(new kc4(R.id.profile_clear_history_confirmation_sheet_confirm_for_all, new tnh(R.string.profile_clear_chat_history_bottom_sheet_confirm_for_all), 1, 56));
                                c79VarW4.add(mldVar2.c());
                                judVar = new jud(tnhVar3, tnhVar4, yab.j(c79VarW4), null);
                            } else {
                                if (iD != 3) {
                                    ore.o();
                                    return null;
                                }
                                judVar = mldVar2.d();
                            }
                            a8j.x(ic6Var2, judVar);
                        }
                    }
                } else if (iIntValue == R.id.profile_more_action_report) {
                    dvd dvdVarV11 = profileScreen.v1();
                    Long lJ3 = dvdVarV11.p1.j();
                    if (lJ3 != null) {
                        ic6 ic6Var3 = dvdVarV11.C;
                        trd.b.getClass();
                        n65 n65Var = new n65();
                        n65Var.a = ":complaint";
                        n65Var.d(lJ3, "ids");
                        n65Var.d(Integer.valueOf(HttpStatus.SC_BAD_REQUEST), "source_screen");
                        bc1.q(n65Var.b(), ic6Var3);
                    }
                } else if (iIntValue == R.id.profile_more_action_block) {
                    dvd dvdVarV12 = profileScreen.v1();
                    ic6 ic6Var4 = dvdVarV12.B;
                    ((mld) dvdVarV12.H.getValue()).getClass();
                    a8j.x(ic6Var4, mld.b());
                } else if (iIntValue == R.id.profile_more_action_hide_stories) {
                    dvd dvdVarV13 = profileScreen.v1();
                    qud qudVarH = dvdVarV13.p1.H();
                    if (qudVarH != null) {
                        a8j.x(dvdVarV13.B, qudVarH);
                    }
                } else if (iIntValue == R.id.profile_more_action_delete_channel) {
                    profileScreen.v1().S();
                } else if (iIntValue == R.id.profile_more_action_suspend_bot) {
                    dvd dvdVarV14 = profileScreen.v1();
                    a8j.x(dvdVarV14.B, new hud(new tnh(R.string.suspend_bot_snackbar_title), new wud(dvdVarV14, 1)));
                } else if (iIntValue == R.id.profile_more_action_delete_chat_and_suspend_bot) {
                    profileScreen.v1().R();
                } else if (iIntValue == R.id.profile_more_action_delete_chat || iIntValue == R.id.profile_more_action_delete_channel) {
                    wjd wjdVar3 = profileScreen.v1().p1;
                    wjdVar3.getClass();
                    if (wjdVar3 instanceof z01) {
                        profileScreen.v1().T(false);
                    } else {
                        profileScreen.v1().S();
                    }
                } else if (iIntValue == R.id.profile_more_action_leave_chat || iIntValue == R.id.profile_more_action_leave_channel) {
                    dvd dvdVarV15 = profileScreen.v1();
                    qud qudVarC = dvdVarV15.p1.C();
                    if (qudVarC != null) {
                        a8j.x(dvdVarV15.B, qudVarC);
                    }
                }
                return sbi.a;
        }
    }
}
