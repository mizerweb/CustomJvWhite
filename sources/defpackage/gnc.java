package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;

/* JADX INFO: loaded from: classes2.dex */
public final class gnc implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ pnc c;

    public /* synthetic */ gnc(yx6 yx6Var, pnc pncVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = pncVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        fnc fncVar;
        ylc ylcVar;
        inc incVar;
        lnc lncVar;
        switch (this.a) {
            case 0:
                if (lq4Var instanceof fnc) {
                    fncVar = (fnc) lq4Var;
                    int i = fncVar.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        fncVar.e = i - Integer.MIN_VALUE;
                    } else {
                        fncVar = new fnc(this, lq4Var);
                    }
                } else {
                    fncVar = new fnc(this, lq4Var);
                }
                Object obj2 = fncVar.d;
                hu4 hu4Var = hu4.a;
                int i2 = fncVar.e;
                if (i2 == 0) {
                    ch3.d0(obj2);
                    yx6 yx6Var = this.b;
                    Conversation conversation = (Conversation) obj;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "ParticipantsRepository", "ParticipantsRepository call map data", null);
                        }
                    }
                    if (conversation == null || conversation.isDestroyed()) {
                        ylcVar = new ylc(tmc.e.a, r66.a);
                    } else {
                        ConversationParticipant me2 = conversation.getMe();
                        gu1 gu1VarA = this.c.c.a(conversation, me2, true, true);
                        Map map = ((enc) this.c.p.getValue()).c;
                        ParticipantCollection participants = conversation.getParticipants();
                        ArrayList<ConversationParticipant> arrayList = new ArrayList();
                        for (ConversationParticipant conversationParticipant : participants) {
                            ConversationParticipant conversationParticipant2 = conversationParticipant;
                            if (conversationParticipant2.isUseable() && !cqk.d(conversationParticipant2.getExternalId(), me2.getExternalId())) {
                                arrayList.add(conversationParticipant);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                        for (ConversationParticipant conversationParticipant3 : arrayList) {
                            tmc tmcVar = (tmc) map.get(anc.a(conversationParticipant3.getExternalId()));
                            arrayList2.add(this.c.c.a(conversation, conversationParticipant3, false, tmcVar == null ? conversationParticipant3.isConnected() : (tmcVar.a.k() || tmcVar.a.isConnected() || !conversationParticipant3.isConnected()) ? tmcVar.a.k() : true));
                        }
                        ylcVar = new ylc(gu1VarA, arrayList2);
                    }
                    fncVar.e = 1;
                    if (yx6Var.emit(ylcVar, fncVar) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj2);
                }
                return sbi.a;
            case 1:
                sbi sbiVar = sbi.a;
                if (lq4Var instanceof inc) {
                    incVar = (inc) lq4Var;
                    int i3 = incVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        incVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        incVar = new inc(this, lq4Var);
                    }
                } else {
                    incVar = new inc(this, lq4Var);
                }
                Object obj3 = incVar.d;
                hu4 hu4Var2 = hu4.a;
                int i4 = incVar.e;
                if (i4 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var2 = this.b;
                    ylc ylcVar2 = (ylc) obj;
                    hu1 hu1Var = (hu1) ylcVar2.a;
                    List list = (List) ylcVar2.b;
                    pnc pncVar = this.c;
                    zv8[] zv8VarArr = pnc.q;
                    yab.i0(pncVar.a, (xt4) pncVar.i.getValue(), 0, new wz6(pncVar, list, hu1Var, null, 29), 2);
                    incVar.e = 1;
                    if (yx6Var2.emit(sbiVar, incVar) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbiVar;
            default:
                if (lq4Var instanceof lnc) {
                    lncVar = (lnc) lq4Var;
                    int i5 = lncVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lncVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        lncVar = new lnc(this, lq4Var);
                    }
                } else {
                    lncVar = new lnc(this, lq4Var);
                }
                Object obj4 = lncVar.d;
                hu4 hu4Var3 = hu4.a;
                int i6 = lncVar.e;
                if (i6 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var3 = this.b;
                    m8b m8bVar = ((dj4) obj).a;
                    Iterator it = ((enc) this.c.p.getValue()).c.keySet().iterator();
                    while (it.hasNext()) {
                        if (m8bVar.d(((fu1) it.next()).a)) {
                            lncVar.e = 1;
                            if (yx6Var3.emit(obj, lncVar) == hu4Var3) {
                                return hu4Var3;
                            }
                        }
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbi.a;
        }
    }
}
