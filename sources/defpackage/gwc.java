package defpackage;

import android.content.SharedPreferences;
import android.text.Editable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import one.me.chats.picker.stories.PickStoryPresetScreen;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.location.map.show.ShowLocationScreen;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.profile.RknBottomSheet;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.settings.SettingsAvatarBottomSheet;
import one.me.settings.devices.SettingsDevicesScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.startconversation.chat.PickChatMembers;
import one.me.stories.publish.PublishStoryBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gwc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gwc(SettingsAvatarBottomSheet settingsAvatarBottomSheet, int i) {
        this.a = 22;
        this.b = settingsAvatarBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        br4 br4Var;
        Object value;
        x8d x8dVar;
        xbd xbdVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PickChatMembers.p;
                o65.c(ohg.b.b(), ":chat/add-icon?ids=".concat(ww3.z1(rx8.l0((m8b) ((PickChatMembers) obj).x1().i.a.getValue()), ",", null, null, null, 62)), null, null, 6);
                break;
            case 1:
                PickStoryPresetScreen pickStoryPresetScreen = (PickStoryPresetScreen) obj;
                zv8[] zv8VarArr2 = PickStoryPresetScreen.o;
                m8b m8bVar = (m8b) pickStoryPresetScreen.x1().i.a.getValue();
                hve router = pickStoryPresetScreen.getRouter();
                zv zvVar = new zv();
                zvVar.addLast(router);
                while (true) {
                    if (zvVar.isEmpty()) {
                        br4Var = null;
                    } else {
                        ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                        int iO0 = xw3.O0(arrayListE);
                        while (true) {
                            if (-1 < iO0) {
                                br4Var = ((lve) arrayListE.get(iO0)).a;
                                if (!(br4Var instanceof PublishStoryBottomSheet)) {
                                    Iterator it = new upe(br4Var.getChildRouters()).iterator();
                                    while (true) {
                                        tpe tpeVar = (tpe) it;
                                        if (tpeVar.b.hasPrevious()) {
                                            zvVar.addLast((hve) tpeVar.b.previous());
                                        }
                                    }
                                    iO0--;
                                }
                            }
                        }
                    }
                }
                PublishStoryBottomSheet publishStoryBottomSheet = (PublishStoryBottomSheet) br4Var;
                if (publishStoryBottomSheet != null) {
                    vv vvVar = pickStoryPresetScreen.k;
                    zv8 zv8Var = PickStoryPresetScreen.o[1];
                    int iIntValue = ((Number) vvVar.a(pickStoryPresetScreen)).intValue();
                    nyd nydVarE1 = publishStoryBottomSheet.E1();
                    if (iIntValue == R.string.sticker_settings_favorites) {
                        nydVarE1.u = m8bVar;
                        nydVarE1.C(R.id.oneme_stories_preset_whitelist_favorites_item);
                    } else if (iIntValue == R.string.oneme_stories_blacklist_hide_from_title) {
                        nydVarE1.v = m8bVar;
                    } else {
                        String str = nydVarE1.f;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, c0a.k(iIntValue, "onSelectedIds: ", " is not supported"), null);
                            }
                        }
                    }
                    nydVarE1.B();
                }
                pickStoryPresetScreen.getRouter().D();
                break;
            case 2:
                ((g6b) obj).invoke();
                break;
            case 3:
                zv8[] zv8VarArr3 = PollCreateScreen.n;
                y7d y7dVarP1 = ((PollCreateScreen) obj).p1();
                mjg mjgVar = y7dVarP1.d;
                if (!r5h.X0(((x8d) mjgVar.getValue()).c)) {
                    List list = ((x8d) mjgVar.getValue()).a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (!r5h.X0(((l7d) it2.next()).d)) {
                                x8d x8dVar2 = (x8d) y7dVarP1.d.getValue();
                                CharSequence charSequenceY1 = r5h.y1(x8dVar2.c);
                                List list2 = x8dVar2.a;
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    String str2 = ((l7d) it3.next()).d;
                                    String string = !r5h.X0(str2) ? r5h.y1(str2).toString() : null;
                                    if (string != null) {
                                        arrayList.add(string);
                                    }
                                }
                                boolean z = x8dVar2.b;
                                String str3 = y7dVarP1.j;
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.d;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, str3, "chatId = " + y7dVarP1.c + "\ntitle = " + ((Object) charSequenceY1) + "\nanswers=" + arrayList + "\ncanRevote=" + z, null);
                                    }
                                }
                                a8j.x(y7dVarP1.f, new os7(new lad(arrayList, z ? 4 : 0, charSequenceY1.toString())));
                                break;
                            }
                        }
                    }
                }
                a8j.x(y7dVarP1.g, new o3g(new tnh(R.string.oneme_poll_create__create_error_snackbar_title)));
                break;
            case 4:
                ((occ) obj).invoke();
                break;
            case 5:
                ((q8d) obj).performClick();
                break;
            case 6:
                ((vx9) obj).invoke();
                break;
            case 7:
                long j = z5c.b;
                PollCreateScreen pollCreateScreen = ((q7d) obj).a;
                zv8[] zv8VarArr4 = PollCreateScreen.n;
                y7d y7dVarP2 = pollCreateScreen.p1();
                y7dVarP2.getClass();
                if (j == j) {
                    mjg mjgVar2 = y7dVarP2.d;
                    do {
                        value = mjgVar2.getValue();
                        x8dVar = (x8d) value;
                    } while (!mjgVar2.h(value, x8d.a(x8dVar, null, !x8dVar.b, 1)));
                }
                break;
            case 8:
                ecd ecdVar = (ecd) obj;
                if (ecdVar.b != ccd.a && ecdVar.e == null && (xbdVar = ecdVar.a) != null && xbdVar.j()) {
                    ecdVar.j(true);
                    break;
                }
                break;
            case 9:
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                zv8[] zv8VarArr5 = ProfileChangeLinkScreen.t;
                ml9.b(profileChangeLinkScreen);
                gq2 gq2VarS1 = profileChangeLinkScreen.s1();
                gq2VarS1.j.B(gq2VarS1, gq2.k[0], yab.i0(gq2VarS1.b, null, 0, new fq2(gq2VarS1, null, 1), 3));
                break;
            case 10:
                end endVarP1 = ((ProfileEditAdminPermissionsWidget) ((lp0) obj).g).p1();
                endVarP1.t.B(endVarP1, end.w[0], yab.h0(endVarP1.b, ((n0c) endVarP1.F()).a(), 2, new c37(endVarP1, null, 20)));
                break;
            case 11:
                zv8[] zv8VarArr6 = ProfileEditAdminPermissionsWidget.n;
                ((ProfileEditAdminPermissionsWidget) obj).p1().C();
                break;
            case 12:
                zv8[] zv8VarArr7 = ProfileReactionsSettingsScreen.p;
                ((ProfileReactionsSettingsScreen) obj).p1().E();
                break;
            case 13:
                ((a8d) obj).invoke();
                break;
            case 14:
                ((occ) obj).invoke();
                break;
            case 15:
                zv8[] zv8VarArr8 = RknBottomSheet.y;
                ((RknBottomSheet) obj).v1(true);
                break;
            case 16:
                tue tueVar = ((wue) obj).x;
                if (tueVar != null) {
                    tueVar.a();
                }
                break;
            case 17:
                zv8[] zv8VarArr9 = SafeModeOnboardingScreen.f;
                mye myeVar = (mye) ((SafeModeOnboardingScreen) obj).c.getValue();
                myeVar.e.B(myeVar, mye.g[0], yab.h0(myeVar.b, ((n0c) ((xhh) myeVar.c.getValue())).a(), 2, new gce(myeVar, (lq4) null, 7)));
                break;
            case 18:
                zv8[] zv8VarArr10 = ScheduledSendPickerBottomSheet.D;
                t2f t2fVarG1 = ((ScheduledSendPickerBottomSheet) obj).G1();
                t2fVarG1.getClass();
                gm0.n(t2f.n, "onSendClick");
                x35 x35Var = (x35) t2fVarG1.h.getValue();
                if (x35Var != null) {
                    a8j.x(t2fVarG1.m, x35Var);
                }
                break;
            case 19:
                zdf zdfVar = (zdf) obj;
                oh7 oh7Var = zdfVar.x;
                if (oh7Var != null) {
                    SelectAlbumWidget selectAlbumWidget = (SelectAlbumWidget) zdfVar.u.b;
                    zv8[] zv8VarArr11 = SelectAlbumWidget.f;
                    jdf jdfVarQ1 = selectAlbumWidget.q1();
                    mjg mjgVar3 = jdfVarQ1.g;
                    nh7 nh7Var = oh7Var.a;
                    mjgVar3.getClass();
                    mjgVar3.j(null, nh7Var);
                    a8j.x(jdfVarQ1.e, new cdf(nh7Var));
                    a8j.x(jdfVarQ1.f, new zcf());
                }
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr12 = SelectedMediaBottomBarWidget.C;
                hff hffVarT1 = ((SelectedMediaBottomBarWidget) obj).t1();
                hffVarT1.F().a();
                hffVarT1.e.B(r66.a);
                hffVarT1.H();
                break;
            case 21:
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                zv8[] zv8VarArr13 = ServerHostBottomSheet.D;
                CharSequence text = ((jac) serverHostBottomSheet.B.m(serverHostBottomSheet, ServerHostBottomSheet.D[3])).getText();
                if (text != null && text.length() != 0) {
                    b08 b08Var = (b08) serverHostBottomSheet.v.getValue();
                    String string2 = text.toString();
                    SharedPreferences.Editor editorEdit = b08Var.f.edit();
                    editorEdit.putString("Custom", string2);
                    editorEdit.apply();
                    b08Var.D(string2);
                    break;
                }
                break;
            case 22:
                SettingsAvatarBottomSheet settingsAvatarBottomSheet = (SettingsAvatarBottomSheet) obj;
                vv vvVar2 = settingsAvatarBottomSheet.x;
                zv8[] zv8VarArr14 = SettingsAvatarBottomSheet.y;
                zv8 zv8Var2 = zv8VarArr14[4];
                if (!((Boolean) vvVar2.a(settingsAvatarBottomSheet)).booleanValue()) {
                    zv8 zv8Var3 = zv8VarArr14[4];
                    vvVar2.b(settingsAvatarBottomSheet, Boolean.TRUE);
                    settingsAvatarBottomSheet.getTargetController();
                }
                settingsAvatarBottomSheet.v1(true);
                break;
            case 23:
                SettingsDevicesScreen settingsDevicesScreen = (SettingsDevicesScreen) obj;
                yd0 yd0Var = (yd0) settingsDevicesScreen.e.getValue();
                yd0Var.getClass();
                yd0.a(yd0Var, 1, 0, null, 6);
                settingsDevicesScreen.o1().D();
                break;
            case 24:
                af7 af7Var = ((vyf) obj).c;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            case 25:
                Editable text2 = ((j1g) obj).w.getText();
                if (text2 != null) {
                    text2.clear();
                }
                break;
            case 26:
                ((old) obj).invoke();
                break;
            case 27:
                ((old) obj).invoke();
                break;
            case 28:
                zv8[] zv8VarArr15 = ShowLocationScreen.v;
                ((ShowLocationScreen) obj).p1().C();
                break;
            default:
                ((occ) obj).invoke();
                break;
        }
    }

    public /* synthetic */ gwc(q7d q7dVar, m7d m7dVar) {
        this.a = 7;
        this.b = q7dVar;
    }

    public /* synthetic */ gwc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
