package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Arrays;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat;
import ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s63 implements i8c, qbf, yo3, d4f, k74, zj4, t65, dq, ParticipantsUpdater.MeChanger, v7, x1k, owi, Cancelable, xs5, yb, aj9, bg7, r89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s63(g85 g85Var, b2i b2iVar) {
        this.a = 29;
        this.b = g85Var;
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return this.b;
    }

    @Override // defpackage.owi
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        n7b n7bVar = (n7b) ((due) this.b).a;
        n7bVar.f.execute(new i7b(n7bVar, 0, videoFrameProcessingException));
    }

    @Override // defpackage.bg7, defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        return Long.valueOf(((m86) this.b).n(((Long) obj).longValue()));
    }

    @Override // defpackage.d4f
    public void b() {
        ComplaintBottomSheet complaintBottomSheet = (ComplaintBottomSheet) this.b;
        vv vvVar = complaintBottomSheet.e;
        zv8 zv8Var = ComplaintBottomSheet.n[4];
        Integer num = (Integer) vvVar.a(complaintBottomSheet);
        if (num == null || complaintBottomSheet.o1() != b64.f) {
            return;
        }
        ae9 ae9Var = (ae9) ((lh4) complaintBottomSheet.h.getAccessor().c(244)).a.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("screen", num);
        ul9Var.put("UIElementType", "complain_modal_window");
        ae9.k(ae9Var, "CONTACT_OR_BLOCK", "showed", ul9Var.b(), 8);
    }

    @Override // defpackage.aj9
    public void c() {
        l1c l1cVar = ((p56) this.b).w;
        if (l1cVar != null) {
            l1cVar.setVisibility(8);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable
    public void cancel() {
        ((ko5) this.b).dispose();
    }

    @Override // defpackage.xs5
    public void d(long j, long j2, float f) {
        long j3;
        long j4;
        ws5 ws5Var = (ws5) this.b;
        due dueVar = ws5Var.o;
        if (dueVar != null) {
            ym5 ym5Var = ws5Var.k.a;
            dfd dfdVar = (dfd) dueVar.a;
            j3 = j;
            j4 = j2;
            dfdVar.b.K(new cfd(dfdVar, ym5Var, j3, j4, 2));
        } else {
            j3 = j;
            j4 = j2;
        }
        ws5Var.t = new vs5(j4, j3);
    }

    @Override // defpackage.qbf
    public int e(int i) {
        rsf rsfVar = ((ChatNotificationsSettingsScreen) this.b).d;
        psf psfVar = (psf) ((k79) rsfVar.F(i));
        if (psfVar.A() == 0) {
            return 4;
        }
        if (i == rsfVar.l() - 1) {
            return 3;
        }
        psf psfVar2 = (psf) ((k79) rsfVar.F(i - 1));
        psf psfVar3 = (psf) ((k79) rsfVar.F(i + 1));
        if (psfVar.A() != psfVar2.A()) {
            return 1;
        }
        return psfVar.A() != psfVar3.A() ? 3 : 2;
    }

    @Override // defpackage.zj4
    public boolean f(int i) {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        return i == contactListWidget.s.l() - (contactListWidget.n.l() + contactListWidget.l.l());
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 24:
                ((j3d) obj).k((zy4) obj2);
                break;
            case 25:
                ((j3d) obj).w0(((xf6) obj2).a.U);
                break;
            case 26:
                ((j3d) obj).j((lwa) obj2);
                break;
            case 27:
                ((j3d) obj).c((k4j) obj2);
                break;
            default:
                ((g85) obj2).getClass();
                ((e2i) obj).getClass();
                break;
        }
    }

    @Override // defpackage.dq
    public cq k() {
        return ConversationFactory.lambda$joinAnonByLinkInternal$8((JoinAnonByLinkParams) this.b);
    }

    @Override // defpackage.v7
    public void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 13:
                ((Runnable) obj).run();
                break;
            default:
                ConversationWebRTCStat.getConfigDisposable$lambda$0((ConversationWebRTCStat) obj);
                break;
        }
    }

    @Override // defpackage.t65
    public Object t() {
        final z0a z0aVar = (z0a) this.b;
        return new o9() { // from class: ln4
            @Override // defpackage.o9
            public final void a(hve hveVar) {
                z0a z0aVar2 = z0aVar;
                try {
                    Activity activityB = nrk.b(hveVar);
                    xde xdeVar = new xde(activityB);
                    b5d b5dVar = ((g5d) ((gjf) ((ny8) z0aVar2.b).getValue())).a.F;
                    zv8[] zv8VarArr = e5d.S6;
                    String string = (String) b5dVar.a(zv8VarArr[24]).i();
                    if (string == null) {
                        string = activityB.getString(R.string.tt_email_invite_subject);
                    }
                    xdeVar.d = string;
                    ((Intent) xdeVar.c).setType(HTTP.PLAIN_TEXT_TYPE);
                    g5d g5dVar = (g5d) ((gjf) ((ny8) z0aVar2.b).getValue());
                    xdeVar.Q(String.format(activityB.getString(R.string.tt_sms_invite_text), Arrays.copyOf(new Object[]{g5dVar.b()}, 1)));
                    xdeVar.R();
                } catch (ActivityNotFoundException unused) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4c.f(a4cVar, je9.g, "ContactsDeepLinkFactory", "shareInvite: failed, no activity found", null, null, 8);
                    }
                }
            }
        };
    }

    @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MeChanger
    public void updateMyExternalId(ParticipantId participantId) {
        ((ConversationParticipant) this.b).setExternalId(participantId);
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        int i = this.a;
        e9a e9aVar = e9a.a;
        j8c j8cVar2 = j8c.e;
        Object obj = this.b;
        switch (i) {
            case 0:
                ChatMembersCompactWidget chatMembersCompactWidget = (ChatMembersCompactWidget) obj;
                zv8[] zv8VarArr = ChatMembersCompactWidget.h;
                if (j8cVar != j8cVar2) {
                    chatMembersCompactWidget.p1().I();
                } else {
                    a8j.x(chatMembersCompactWidget.q1().g, e9aVar);
                    chatMembersCompactWidget.p1().G();
                }
                break;
            case 1:
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                zv8[] zv8VarArr2 = ChatMembersScreen.k;
                if (j8cVar != j8cVar2) {
                    chatMembersScreen.p1().I();
                } else {
                    a8j.x(chatMembersScreen.q1().g, e9aVar);
                    chatMembersScreen.p1().G();
                }
                break;
            case 2:
            default:
                vi4 vi4Var = (vi4) obj;
                if (pi4.$EnumSwitchMapping$0[j8cVar.ordinal()] == 1) {
                    gu4 gu4Var = vi4Var.a;
                    xt4 xt4VarB = ((n0c) vi4Var.r()).b();
                    zhb zhbVar = zhb.b;
                    xt4VarB.getClass();
                    yab.i0(gu4Var, lvb.x0(xt4VarB, zhbVar), 0, new oi4(0, vi4Var, null), 2);
                }
                break;
            case 3:
                zv8[] zv8VarArr3 = ChatsListSearchScreen.F;
                ((ol0) obj).invoke(j8cVar);
                break;
        }
    }

    public /* synthetic */ s63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
