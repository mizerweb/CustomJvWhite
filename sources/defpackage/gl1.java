package defpackage;

import java.util.List;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.members.list.MembersListWidget;
import one.me.polls.screens.result.voterslist.PollAnswerVotersListScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.discussionsblacklist.CommentsBlackListScreen;
import one.me.profile.screens.joinrequests.JoinRequestsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsPageWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class gl1 implements f96 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ gl1(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.f96
    public final boolean A() {
        boolean z = true;
        switch (this.a) {
            case 0:
                CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) this.b;
                er3 er3Var = CallHistoryPageScreen.l;
                return callHistoryPageScreen.s1().C();
            case 1:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                return ((jj3) chatsListSearchScreen.r1().F.a.getValue()).a != ij3.b && ((jj3) chatsListSearchScreen.r1().F.a.getValue()).b.length() > 0 && chatsListSearchScreen.r1().F() && chatsListSearchScreen.w.l() > 0;
            case 2:
                CommentsBlackListScreen commentsBlackListScreen = (CommentsBlackListScreen) this.b;
                zv8[] zv8VarArr2 = CommentsBlackListScreen.k;
                return commentsBlackListScreen.r1().d.a();
            case 3:
                JoinRequestsScreen joinRequestsScreen = (JoinRequestsScreen) this.b;
                zv8[] zv8VarArr3 = JoinRequestsScreen.k;
                return joinRequestsScreen.q1().d.a();
            case 4:
                return true;
            case 5:
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) this.b;
                zv8[] zv8VarArr4 = MediaGalleryWidget.i;
                ej7 ej7VarR1 = mediaGalleryWidget.r1();
                nh7 nh7Var = (nh7) ej7VarR1.s.getValue();
                if (nh7Var == null) {
                    return false;
                }
                rb8 rb8Var = ej7VarR1.f;
                if (nh7Var.b != 0) {
                    List list = (List) rb8Var.q.get(nh7Var.a);
                    if (list == null || list.size() >= nh7Var.b) {
                    }
                    gm0.n("ej7", "canLoadMoreItems = " + z);
                    return z;
                }
                rb8Var.getClass();
                z = false;
                gm0.n("ej7", "canLoadMoreItems = " + z);
                return z;
            case 6:
                MembersListWidget membersListWidget = (MembersListWidget) this.b;
                zv8[] zv8VarArr5 = MembersListWidget.t;
                p9a p9aVar = (p9a) membersListWidget.r1().o.a.getValue();
                Integer num = membersListWidget.e;
                return !p9aVar.d && ((baa) membersListWidget.r1().i.getValue()).a() && (num == null || p9aVar.a.size() < num.intValue());
            case 7:
                return PickerChatsListWidget.p1((PickerChatsListWidget) this.b);
            case 8:
                PollAnswerVotersListScreen pollAnswerVotersListScreen = (PollAnswerVotersListScreen) this.b;
                zv8[] zv8VarArr6 = PollAnswerVotersListScreen.n;
                return pollAnswerVotersListScreen.o1().k.j != -1;
            case 9:
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                ku8 ku8Var = ProfileScreen.B;
                return profileScreen.v1().p1.A();
            case 10:
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.b;
                zv8[] zv8VarArr7 = StickersSearchScreen.l;
                return stickersSearchScreen.p1().C();
            case 11:
                StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) this.b;
                zv8[] zv8VarArr8 = StickersShowcaseScreen.m;
                return stickersShowcaseScreen.p1().B();
            case 12:
                return ((Boolean) ((StoryViewsPageWidget) this.b).c.invoke()).booleanValue();
            default:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
                zv8[] zv8VarArr9 = SuggestionsWidget.F;
                x9h x9hVarJ1 = suggestionsWidget.J1();
                if (cqk.d(x9hVarJ1.r.a, String.valueOf((String) x9hVarJ1.w.getValue()))) {
                    return x9hVarJ1.r.f;
                }
                return false;
        }
    }

    @Override // defpackage.f96
    public final void o() {
        String str;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                er3 er3Var = CallHistoryPageScreen.l;
                kl1 kl1VarS1 = ((CallHistoryPageScreen) widget).s1();
                if (!kl1VarS1.E()) {
                    i92 i92Var = kl1VarS1.f;
                    i92Var.getClass();
                    i92Var.g(new nb0(i92Var, true, 4));
                }
                break;
            case 1:
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                fk3 fk3VarR1 = ((ChatsListSearchScreen) widget).r1();
                sgg sggVar = fk3VarR1.q1;
                if (sggVar == null || !sggVar.isActive()) {
                    mjg mjgVar = fk3VarR1.E;
                    mjgVar.j(null, jj3.a((jj3) mjgVar.getValue(), ij3.b, null, null, false, false, false, 126));
                    fk3VarR1.q1 = yab.i0(fk3VarR1.b, fk3VarR1.n1, 0, new rj3(fk3VarR1, null, 0), 2);
                }
                break;
            case 2:
                zv8[] zv8VarArr2 = CommentsBlackListScreen.k;
                ((CommentsBlackListScreen) widget).r1().d.g();
                break;
            case 3:
                zv8[] zv8VarArr3 = JoinRequestsScreen.k;
                ((JoinRequestsScreen) widget).q1().d.g();
                break;
            case 4:
                zv8[] zv8VarArr4 = LogsViewerScreen.g;
                ((LogsViewerScreen) widget).o1().C();
                break;
            case 5:
                zv8[] zv8VarArr5 = MediaGalleryWidget.i;
                ej7 ej7VarR1 = ((MediaGalleryWidget) widget).r1();
                ej7VarR1.getClass();
                gm0.n("ej7", "loadMoreItems()");
                sgg sggVar2 = ej7VarR1.z;
                if ((sggVar2 != null && sggVar2.isActive()) || ((Boolean) ej7VarR1.q.getValue()).booleanValue()) {
                    gm0.n("ej7", "try to load more items when loading in process, ignore it");
                } else {
                    try {
                        sgg sggVar3 = ej7VarR1.y;
                        if (sggVar3 != null) {
                            sggVar3.b(null);
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                    xt4 xt4VarF = ((n0c) ej7VarR1.D()).f();
                    yt4 yt4Var = ej7VarR1.g;
                    xt4VarF.getClass();
                    ej7VarR1.y = a8j.t(ej7VarR1, lvb.x0(xt4VarF, yt4Var), new aj7(ej7VarR1, null, 1), 2);
                }
                break;
            case 6:
                zv8[] zv8VarArr6 = MembersListWidget.t;
                ((baa) ((MembersListWidget) widget).r1().i.getValue()).g();
                break;
            case 7:
                zv8[] zv8VarArr7 = PickerChatsListWidget.x;
                ((PickerChatsListWidget) widget).x1().d.v();
                break;
            case 8:
                zv8[] zv8VarArr8 = PollAnswerVotersListScreen.n;
                p6d p6dVar = ((PollAnswerVotersListScreen) widget).o1().k;
                p3c p3cVar = p6dVar.i;
                zv8[] zv8VarArr9 = p6d.o;
                vo8 vo8Var = (vo8) p3cVar.m(p6dVar, zv8VarArr9[0]);
                if (vo8Var == null || !vo8Var.isActive()) {
                    p3cVar.B(p6dVar, zv8VarArr9[0], yab.i0(p6dVar.a, ((n0c) p6dVar.f).b(), 0, new voc(p6dVar, null, 6), 2));
                }
                break;
            case 9:
                ku8 ku8Var = ProfileScreen.B;
                ((ProfileScreen) widget).v1().p1.u();
                break;
            case 10:
                zv8[] zv8VarArr10 = StickersSearchScreen.l;
                vng vngVarP1 = ((StickersSearchScreen) widget).p1();
                sng sngVar = (sng) vngVarP1.m.get();
                sgg sggVar4 = vngVarP1.o;
                if ((sggVar4 == null || !sggVar4.isActive()) && (str = sngVar.a) != null && str.length() != 0) {
                    vngVarP1.o = a8j.t(vngVarP1, ((n0c) vngVarP1.d).b(), new p7g(vngVarP1, sngVar, (lq4) null, 2), 2);
                }
                break;
            case 11:
                zv8[] zv8VarArr11 = StickersShowcaseScreen.m;
                zog zogVarP1 = ((StickersShowcaseScreen) widget).p1();
                hog hogVar = zogVarP1.d;
                if (!hogVar.a()) {
                    eog eogVar = zogVarP1.e;
                    sgg sggVar5 = eogVar.g;
                    if (sggVar5 == null || !sggVar5.isActive()) {
                        eogVar.g = yab.i0(eogVar.c, null, 0, new ryf(eogVar, null, 7), 3);
                    }
                } else {
                    sgg sggVar6 = hogVar.h;
                    if (sggVar6 == null || !sggVar6.isActive()) {
                        hogVar.h = yab.i0(hogVar.c, null, 0, new p7g(hogVar, (lq4) null, 4), 3);
                    }
                }
                break;
            case 12:
                ((StoryViewsPageWidget) widget).b.invoke();
                break;
            default:
                zv8[] zv8VarArr12 = SuggestionsWidget.F;
                x9h x9hVarJ1 = ((SuggestionsWidget) widget).J1();
                x9hVarJ1.E(((Number) x9hVarJ1.x.getValue()).intValue(), (String) x9hVarJ1.w.getValue());
                break;
        }
    }
}
