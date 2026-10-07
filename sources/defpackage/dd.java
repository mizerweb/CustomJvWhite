package defpackage;

import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes2.dex */
public final class dd extends a8j {
    public final xc c;
    public final ny8 d;
    public final mjg e;
    public final r8e f;

    public dd(xc xcVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = xcVar;
        this.d = ny8Var;
        mjg mjgVarA = p90.a(bd.c);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        e9i.j0(e9i.T(new fz6(((ya1) ((da1) ny8Var.getValue())).j, new fze(ny8Var2, this, (lq4) null, 2), 3), ((n0c) ((xhh) ny8Var3.getValue())).a()), this.b);
    }

    public final void B(final boolean z) {
        final ya1 ya1Var = (ya1) ((da1) this.d.getValue());
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            ya1Var.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", zo5.s("Update users from waiting room for all with apply state=", z), null);
            }
        }
        Conversation conversationA = ya1Var.f().a();
        String conversationId = conversationA != null ? conversationA.getConversationId() : null;
        ny8 ny8Var = ya1Var.e;
        if (z) {
            sa2 sa2Var = (sa2) ny8Var.getValue();
            sa2Var.getClass();
            sa2.c(sa2Var, "PROMOTE_JOIN_WAITING_ROOM", conversationId, null, null, null, null, true, null, 372);
        } else {
            sa2 sa2Var2 = (sa2) ny8Var.getValue();
            sa2Var2.getClass();
            sa2.c(sa2Var2, "REJECT_JOIN_WAITING_ROOM", conversationId, null, null, null, null, true, null, 372);
        }
        ya1Var.h.updateAndGet(new UnaryOperator() { // from class: la1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boolean z2;
                pw pwVar = (pw) obj;
                pwVar.getClass();
                hw hwVar = new hw(pwVar);
                while (true) {
                    boolean zHasNext = hwVar.hasNext();
                    z2 = z;
                    if (!zHasNext) {
                        break;
                    }
                    ParticipantId participantIdB = anc.b(((Number) hwVar.next()).longValue());
                    ya1 ya1Var2 = ya1Var;
                    if (z2) {
                        Conversation conversationA2 = ya1Var2.f().a();
                        if (conversationA2 != null) {
                            conversationA2.promoteParticipant(participantIdB, true);
                        }
                    } else {
                        Conversation conversationA3 = ya1Var2.f().a();
                        if (conversationA3 != null) {
                            conversationA3.removeParticipant(participantIdB);
                        }
                    }
                }
                return z2 ? pwVar : new pw(0);
            }
        });
        if (z) {
            return;
        }
        ya1Var.w();
    }
}
