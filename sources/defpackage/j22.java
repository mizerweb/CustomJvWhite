package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.devmenu.tools.ChatInfoDevWidget;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.discussionsblacklist.CommentsBlackListScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.ConversationFactoryParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;
import ru.ok.tamtam.services.ChannelQueueUndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j22 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j22(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        zf2 zf2Var;
        Object value;
        String str;
        int i = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                c1d c1dVar = ((m22) obj2).G;
                if (c1dVar != null) {
                    c1dVar.c();
                }
                return sbi.a;
            case 1:
                ((wue) obj).setIcon((EnhancedAnimatedVectorDrawable) obj2);
                return sbi.a;
            case 2:
                return Boolean.valueOf(((wg2) obj).a == ((tw5) obj2));
            case 3:
                hj2 hj2Var = (hj2) obj2;
                hj2Var.j = ((fhd) obj) == fhd.b;
                if (hj2Var.j && (zf2Var = hj2Var.f) != null) {
                    p09 p09Var = hj2Var.c;
                    p09Var.getClass();
                    wxl.a();
                    o09 o09Var = p09Var.q;
                    nf2 nf2VarA = o09Var == null ? null : o09Var.a();
                    boolean zM = nf2VarA != null ? ((ja) nf2VarA).b.m() : false;
                    n2e n2eVar = ((k2e) ((ft0) zf2Var).a).d;
                    mjg mjgVar = (n2eVar != null ? n2eVar : null).n;
                    do {
                        value = mjgVar.getValue();
                    } while (!mjgVar.h(value, l2e.a((l2e) value, 0, 0, zM, false, 11)));
                }
                return sbi.a;
            case 4:
                zv8[] zv8VarArr = ChangeOwnerScreen.k;
                ((ChangeOwnerScreen) obj2).getRouter().D();
                return sbi.a;
            case 5:
                yr2 yr2Var = (yr2) obj2;
                return new as2(obj, yr2Var.a, yr2Var.c, yr2Var.b);
            case 6:
                as2 as2Var = (as2) obj2;
                int iIncrementAndGet = as2Var.f.incrementAndGet();
                String str2 = as2Var.e;
                ChannelQueueUndeliveredElementException channelQueueUndeliveredElementException = new ChannelQueueUndeliveredElementException(obj, null, 2, null);
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "notifQueue: onUndeliveredElement " + as2Var.a + "->" + obj + "; allcounts = " + iIncrementAndGet, channelQueueUndeliveredElementException);
                    }
                }
                return sbi.a;
            case 7:
                Throwable th = (Throwable) obj;
                gm0.T(((ns2) obj2).g, "stop counting posts view", th instanceof CancellationException ? null : th);
                return sbi.a;
            case 8:
                zv8[] zv8VarArr2 = ChatAdminsScreen.l;
                ((ChatAdminsScreen) obj2).getRouter().D();
                return sbi.a;
            case 9:
                ltb onBackPressedDispatcher = ((ChatInfoDevWidget) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbi.a;
            case 10:
                zv8[] zv8VarArr3 = ChatMediaViewerScreen.Z;
                ltb onBackPressedDispatcher2 = ((ChatMediaViewerScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return sbi.a;
            case 11:
                long jLongValue = ((Long) obj).longValue();
                zv8[] zv8VarArr4 = ChatMembersCompactWidget.h;
                return ((ChatMembersCompactWidget) obj2).p1().C(jLongValue);
            case 12:
                vg4 vg4Var = (vg4) ((no4) ((l73) obj2).f.getValue()).j(((Long) obj).longValue()).a.getValue();
                String strK = vg4Var != null ? vg4Var.k() : null;
                return strK == null ? "" : strK;
            case 13:
                ChatTitleIconScreen chatTitleIconScreen = (ChatTitleIconScreen) obj2;
                CharSequence charSequence = (CharSequence) obj;
                zv8[] zv8VarArr5 = ChatTitleIconScreen.q;
                String string = charSequence.toString();
                cyb cybVarQ1 = chatTitleIconScreen.q1();
                wf3 wf3VarS1 = chatTitleIconScreen.s1();
                wf3VarS1.getClass();
                cybVarQ1.setVisibility((r5h.X0(string) || string.length() > ((g5d) wf3VarS1.e).k()) ? 8 : 0);
                chatTitleIconScreen.s1().y = r5h.y1(charSequence.toString()).toString();
                return sbi.a;
            case 14:
                zv8[] zv8VarArr6 = ChatTitleIconScreen.q;
                ml9.d((rcc) obj2);
                ohg.b.b().f();
                return sbi.a;
            case 15:
                long jLongValue2 = ((Long) obj).longValue();
                List list = ((wh3) obj2).a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((w73) it.next()).a == jLongValue2) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                f9b f9bVar = (f9b) obj2;
                f9b f9bVar2 = f9bVar != null ? f9bVar : null;
                return f9bVar2 == null ? p90.a(f9bVar.getValue()) : f9bVar2;
            case 17:
                return p90.a((s04) obj2);
            case 18:
                return p90.a((rt2) obj2);
            case 19:
                wrc wrcVar = (wrc) obj2;
                du8 du8Var = (du8) obj;
                for (Map.Entry entry : wrcVar.f.entrySet()) {
                    du8Var.b((pu8) entry.getValue(), (String) entry.getKey());
                }
                l51.d(du8Var, "traceId", wrcVar.c);
                int i2 = wrcVar.d;
                if (i2 == 1) {
                    str = "SUCCESS";
                } else if (i2 == 2) {
                    str = "FAIL";
                } else {
                    if (i2 != 3) {
                        throw null;
                    }
                    str = "CANCEL";
                }
                l51.d(du8Var, "finalState", str);
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                CommentsBlackListScreen commentsBlackListScreen = (CommentsBlackListScreen) obj2;
                zv8[] zv8VarArr7 = CommentsBlackListScreen.k;
                if (commentsBlackListScreen.q1().l()) {
                    t7c searchView = commentsBlackListScreen.q1().getSearchView();
                    if (searchView != null) {
                        searchView.b();
                    }
                } else {
                    commentsBlackListScreen.getRouter().D();
                }
                return sbi.a;
            case 21:
                td4 td4Var = (td4) obj2;
                List list2 = (List) obj;
                je9 je9Var2 = je9.d;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, "CallAudioController", c0a.o("Available endpoints changed: [", ww3.z1(list2, null, null, null, i9.x, 31), "]"), null);
                }
                HashSet hashSet = new HashSet();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(qwk.e(rh.j(it2.next())));
                }
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, "CallAudioController", c0a.o("Mapped to devices: [", ww3.z1(hashSet, null, null, null, i9.y, 31), "]"), null);
                }
                td4Var.e(hashSet);
                return sbi.a;
            case 22:
                ((wj4) ((zsj) obj2).g).h0(((Long) obj).longValue());
                return sbi.a;
            case 23:
                zv8[] zv8VarArr8 = ContactsPickerScreen.o;
                ltb onBackPressedDispatcher3 = ((ContactsPickerScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher3 != null) {
                    onBackPressedDispatcher3.d();
                }
                return sbi.a;
            case 24:
                ((di4) obj).i = (ii4) obj2;
                return sbi.a;
            case 25:
                ContextMenuBottomSheet contextMenuBottomSheet = (ContextMenuBottomSheet) obj2;
                rp4 rp4Var = (rp4) obj;
                zv8[] zv8VarArr9 = ContextMenuBottomSheet.C;
                vv vvVar = contextMenuBottomSheet.A;
                zv8[] zv8VarArr10 = ContextMenuBottomSheet.C;
                zv8 zv8Var = zv8VarArr10[6];
                if (!((Boolean) vvVar.a(contextMenuBottomSheet)).booleanValue()) {
                    zv8 zv8Var2 = zv8VarArr10[6];
                    vvVar.b(contextMenuBottomSheet, Boolean.TRUE);
                    br4 targetController = contextMenuBottomSheet.getTargetController();
                    vp4 vp4Var = targetController instanceof vp4 ? (vp4) targetController : null;
                    if (vp4Var != null) {
                        int i3 = rp4Var.a;
                        vv vvVar2 = contextMenuBottomSheet.u;
                        zv8 zv8Var3 = zv8VarArr10[0];
                        vp4Var.E(i3, (Bundle) vvVar2.a(contextMenuBottomSheet));
                    }
                }
                contextMenuBottomSheet.v1(true);
                return sbi.a;
            case 26:
                return ((ConversationFactoryParams) obj2).lambda$new$0((af7) obj);
            case 27:
                return ((SignalingTransportBuilder) obj2).build((a6g) obj);
            case 28:
                return ((ParticipantStore) obj2).get((ParticipantId) obj);
            default:
                r72 r72Var = (r72) obj2;
                Throwable th2 = (Throwable) obj;
                if (th2 == null) {
                    r72Var.b(null);
                } else if (th2 instanceof CancellationException) {
                    r72Var.c();
                } else {
                    r72Var.d(th2);
                }
                return sbi.a;
        }
    }
}
