package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* JADX INFO: loaded from: classes4.dex */
public final class ya1 implements da1 {
    public static final /* synthetic */ zv8[] w;
    public final y82 a;
    public final j52 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ifh g = new ifh(new ia1(this, 0));
    public final AtomicReference h = new AtomicReference(new pw(0));
    public final mjg i;
    public final mjg j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public sgg o;
    public final p3c p;
    public final ifh q;
    public final ifh r;
    public final pzf s;
    public final pzf t;
    public final mjg u;
    public final mjg v;

    static {
        z8b z8bVar = new z8b(ya1.class, "usersUpdateJob", "getUsersUpdateJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        w = new zv8[]{z8bVar};
    }

    public ya1(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, y82 y82Var, ny8 ny8Var5, j52 j52Var, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = y82Var;
        this.b = j52Var;
        this.c = ny8Var;
        this.d = ny8Var5;
        this.e = ny8Var6;
        this.f = ny8Var7;
        mjg mjgVarA = p90.a(cd.d);
        this.i = mjgVarA;
        this.j = mjgVarA;
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.p = qyj.S();
        this.q = new ifh(new ja1(this, ny8Var2, ny8Var3, ny8Var4, 0));
        this.r = new ifh(new ia1(this, 1));
        pzf pzfVarA = e9i.a(1, 1, 2);
        this.s = pzfVarA;
        this.t = pzfVarA;
        mjg mjgVarA2 = p90.a(gc.h);
        this.u = mjgVarA2;
        this.v = mjgVarA2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:31:0x0120 A[LOOP:3: B:29:0x0116->B:31:0x0120, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0150  */
    /* JADX WARN: Code duplicated, block: B:35:0x0156  */
    /* JADX WARN: Code duplicated, block: B:37:0x015a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0190  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x0209  */
    /* JADX WARN: Code duplicated, block: B:56:0x0211  */
    /* JADX WARN: Code duplicated, block: B:57:0x0221  */
    /* JADX WARN: Code duplicated, block: B:61:0x023e A[LOOP:0: B:59:0x0238->B:61:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0274  */
    /* JADX WARN: Code duplicated, block: B:66:0x0277  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x013f A[EDGE_INSN: B:79:0x013f->B:32:0x013f BREAK  A[LOOP:3: B:29:0x0116->B:31:0x0120], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.Iterator, mw, pw] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01ed -> B:50:0x01f2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.ya1 r27, defpackage.pw r28, defpackage.nq4 r29) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya1.a(ya1, pw, nq4):java.lang.Object");
    }

    public static boolean o(o0a o0aVar) {
        return o0aVar != o0a.c;
    }

    public final void e(fu1 fu1Var, boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", "Update user from waiting room " + fu1Var + " with apply state=" + z, null);
            }
        }
        Conversation conversationA = f().a();
        String conversationId = conversationA != null ? conversationA.getConversationId() : null;
        ny8 ny8Var = this.e;
        if (z) {
            sa2 sa2Var = (sa2) ny8Var.getValue();
            Long lValueOf = Long.valueOf(fu1Var.a);
            sa2Var.getClass();
            sa2.c(sa2Var, "PROMOTE_JOIN_WAITING_ROOM", conversationId, null, lValueOf, null, null, true, null, 372);
        } else {
            sa2 sa2Var2 = (sa2) ny8Var.getValue();
            Long lValueOf2 = Long.valueOf(fu1Var.a);
            sa2Var2.getClass();
            sa2.c(sa2Var2, "REJECT_JOIN_WAITING_ROOM", conversationId, null, lValueOf2, null, null, true, null, 372);
        }
        ParticipantId participantIdC = anc.c(fu1Var);
        if (z) {
            Conversation conversationA2 = f().a();
            if (conversationA2 != null) {
                conversationA2.promoteParticipant(participantIdC, true);
            }
        } else {
            Conversation conversationA3 = f().a();
            if (conversationA3 != null) {
                conversationA3.removeParticipant(participantIdC);
            }
        }
        if (z) {
            return;
        }
        this.h.getAndUpdate(new ea1(0, fu1Var));
        w();
    }

    public final f9 f() {
        return (f9) this.c.getValue();
    }

    public final MediaMuteManager g() {
        Conversation conversationA = f().a();
        if (conversationA != null) {
            return conversationA.getMediaMuteManager();
        }
        return null;
    }

    public final ParticipantStatesManager h() {
        Conversation conversationA = f().a();
        if (conversationA != null) {
            return conversationA.getParticipantStatesManager();
        }
        return null;
    }

    public final ConversationFeatureManager i() {
        Conversation conversationA = f().a();
        if (conversationA != null) {
            return conversationA.getFeatureManager();
        }
        return null;
    }

    public final boolean k() {
        p0a mediaOptionsForCall$default;
        o0a o0aVar;
        MediaMuteManager mediaMuteManagerG = g();
        if (mediaMuteManagerG == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG, null, 1, null)) == null || (o0aVar = mediaOptionsForCall$default.b) == null) {
            return false;
        }
        return o(o0aVar);
    }

    public final boolean l() {
        p0a mediaOptionsForCall$default;
        o0a o0aVar;
        MediaMuteManager mediaMuteManagerG = g();
        if (mediaMuteManagerG == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG, null, 1, null)) == null || (o0aVar = mediaOptionsForCall$default.a) == null) {
            return false;
        }
        return o(o0aVar);
    }

    public final boolean m() {
        Conversation conversationA = f().a();
        if (conversationA != null) {
            return conversationA.isMeCreatorOrAdmin();
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        this.h.getAndUpdate(new ha1(0, list));
        w();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        mjg mjgVar;
        Object value;
        boolean zO;
        p0a mediaOptionsForCall$default;
        o0a o0aVar;
        ConversationParticipant me2;
        super.onRolesChanged(conversationParticipant);
        ParticipantId externalId = conversationParticipant != null ? conversationParticipant.getExternalId() : null;
        Conversation conversationA = f().a();
        if (!cqk.d(externalId, (conversationA == null || (me2 = conversationA.getMe()) == null) ? null : me2.getExternalId())) {
            gm0.Y(ya1.class.getName(), "Early return in onRolesChanged cuz of externalId");
            return;
        }
        do {
            mjgVar = this.u;
            value = mjgVar.getValue();
            zO = false;
        } while (!mjgVar.h(value, gc.a((gc) value, (conversationParticipant != null ? conversationParticipant.isAdmin() : false) || (conversationParticipant != null ? conversationParticipant.isCreator() : false), false, false, false, false, false, 126)));
        boolean zK = k();
        boolean zL = l();
        MediaMuteManager mediaMuteManagerG = g();
        if (mediaMuteManagerG != null && (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG, null, 1, null)) != null && (o0aVar = mediaOptionsForCall$default.c) != null) {
            zO = o(o0aVar);
        }
        v(zK, zL, zO);
        this.l.set(true);
        t();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomEnabledChanged(boolean z) {
        super.onWaitingRoomEnabledChanged(z);
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", zo5.s("Waiting room change state updating ", z), null);
            }
        }
        mjg mjgVar = this.u;
        while (true) {
            Object value = mjgVar.getValue();
            boolean z2 = z;
            if (mjgVar.h(value, gc.a((gc) value, false, false, false, false, false, z2, 63))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        super.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        this.h.getAndUpdate(new pa1(waitingRoomParticipantsUpdate, 0, this));
        w();
    }

    public final void p(boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", zo5.s("Raise own hands change to isEnabled=", z), null);
            }
        }
        ParticipantStatesManager participantStatesManagerH = h();
        if (participantStatesManagerH != null) {
            participantStatesManagerH.setOwnHandRaised(z);
        }
        this.n.set(z);
    }

    public final void q(boolean z) {
        oi1 oi1Var = oi1.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", zo5.s("Screen record change state to ", z), null);
            }
        }
        if (z) {
            ConversationFeatureManager conversationFeatureManagerI = i();
            if (conversationFeatureManagerI != null) {
                ConversationFeatureManager.enableFeatureForAll$default(conversationFeatureManagerI, oi1Var, null, null, 6, null);
                return;
            }
            return;
        }
        ConversationFeatureManager conversationFeatureManagerI2 = i();
        if (conversationFeatureManagerI2 != null) {
            ConversationFeatureManager.enableFeatureForRoles$default(conversationFeatureManagerI2, oi1Var, a.p1(new bu1[]{bu1.b, bu1.a}), null, null, 12, null);
        }
    }

    public final void t() {
        AtomicBoolean atomicBoolean = this.m;
        if (!atomicBoolean.get() && this.l.get() && this.k.get()) {
            mjg mjgVar = this.u;
            if (!((gc) mjgVar.getValue()).a) {
                boolean z = ((gc) mjgVar.getValue()).b;
                boolean z2 = ((gc) mjgVar.getValue()).c;
                pzf pzfVar = this.s;
                if (!z && !z2) {
                    pzfVar.a(new kd());
                } else if (!z && z2) {
                    pzfVar.a(new ld(true, false));
                } else if (z && !z2) {
                    pzfVar.a(new nd(true, false));
                }
            }
            atomicBoolean.set(true);
        }
    }

    public final void v(boolean z, boolean z2, boolean z3) {
        while (true) {
            mjg mjgVar = this.u;
            Object value = mjgVar.getValue();
            gc gcVar = (gc) value;
            ConversationFeatureManager conversationFeatureManagerI = i();
            boolean z4 = (conversationFeatureManagerI != null ? conversationFeatureManagerI.getFeatureRoles(oi1.b) : null) instanceof FeatureRoles.EnabledForAll;
            Conversation conversationA = f().a();
            boolean zIsMeCreatorOrAdmin = conversationA != null ? conversationA.isMeCreatorOrAdmin() : false;
            Conversation conversationA2 = f().a();
            boolean zIsWaitingRoomEnabled = conversationA2 != null ? conversationA2.isWaitingRoomEnabled() : false;
            gcVar.getClass();
            boolean z5 = z;
            boolean z6 = z2;
            boolean z7 = z3;
            if (mjgVar.h(value, new gc(zIsMeCreatorOrAdmin, z5, z6, z7, z4, false, zIsWaitingRoomEnabled))) {
                return;
            }
            z = z5;
            z2 = z6;
            z3 = z7;
        }
    }

    public final void w() {
        sgg sggVarI0 = yab.i0(this.a, ((n0c) ((xhh) this.f.getValue())).a(), 0, new m5(this, null, 10), 2);
        this.p.B(this, w[0], sggVarI0);
    }
}
