package defpackage;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* JADX INFO: loaded from: classes3.dex */
public final class gf1 {
    public final a92 a;
    public final ny8 b;
    public final ny8 c;

    public gf1(a92 a92Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = a92Var;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    public static final StartCallParams b(StartCallParams.Builder builder, m32 m32Var, JSONObject jSONObject, gf1 gf1Var, hhg hhgVar, os1 os1Var, n61 n61Var) {
        Object poeVar;
        String str = m32Var.b;
        ifh ifhVar = ns4.b;
        try {
            poeVar = UUID.fromString(str);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        return builder.setConversationId(ns4.b(str) ? null : (UUID) poeVar).setOpponentId(anc.b(m32Var.a)).setPayload(jSONObject.toString()).setWatchTogetherEnabledForAll(false).setMyId(anc.b(gf1Var.e())).setStartWithVideo(hhgVar.b).setEventListener((ConversationEventsListener) gf1Var.b.getValue()).setOnPrepared((cf7) os1Var).setOnError((cf7) n61Var).build();
    }

    public static final CreateConfParams d(CreateConfParams.Builder builder, k32 k32Var, JSONObject jSONObject, gf1 gf1Var, hhg hhgVar, os1 os1Var, n61 n61Var) {
        return builder.setChatId(k32Var.a).setPayload(jSONObject.toString()).setMyId(anc.b(gf1Var.e())).setStartWithVideo(hhgVar.b).setEventListener((ConversationEventsListener) gf1Var.b.getValue()).setOnPrepared((cf7) os1Var).setOnError((cf7) n61Var).build();
    }

    public static final JoinByLinkParams g(JoinByLinkParams.Builder builder, JSONObject jSONObject, String str, gf1 gf1Var, hhg hhgVar, os1 os1Var, n61 n61Var) {
        return builder.setPayload(jSONObject.toString()).setLink(str).setMyId(anc.b(gf1Var.e())).setStartWithVideo(hhgVar.b).setEventListener((ConversationEventsListener) gf1Var.b.getValue()).setOnPrepared((cf7) os1Var).setOnError((cf7) n61Var).build();
    }

    public final ff1 a(m32 m32Var, final hhg hhgVar, boolean z, final os1 os1Var, final n61 n61Var) throws JSONException {
        final m32 m32Var2;
        kgl ef1Var;
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_video", hhgVar.b);
        ConversationFactory conversationFactoryA = a92.a(this.a);
        if (z) {
            final int i = 0;
            m32Var2 = m32Var;
            ef1Var = new df1(conversationFactoryA.callLazy(new cf7() { // from class: bf1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            return gf1.b((StartCallParams.Builder) obj, m32Var2, jSONObject, this, hhgVar, os1Var, n61Var);
                        default:
                            return gf1.b((StartCallParams.Builder) obj, m32Var2, jSONObject, this, hhgVar, os1Var, n61Var);
                    }
                }
            }));
        } else {
            m32Var2 = m32Var;
            final int i2 = 1;
            ef1Var = new ef1(conversationFactoryA.call(new cf7() { // from class: bf1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    switch (i2) {
                        case 0:
                            return gf1.b((StartCallParams.Builder) obj, m32Var2, jSONObject, this, hhgVar, os1Var, n61Var);
                        default:
                            return gf1.b((StartCallParams.Builder) obj, m32Var2, jSONObject, this, hhgVar, os1Var, n61Var);
                    }
                }
            }));
        }
        return new ff1(ef1Var, m32Var2, true, 120);
    }

    public final ff1 c(k32 k32Var, final hhg hhgVar, boolean z, boolean z2, final os1 os1Var, final n61 n61Var) throws JSONException {
        final k32 k32Var2;
        kgl ef1Var;
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("chat_id", k32Var.a);
        jSONObject.put("is_video", z);
        ConversationFactory conversationFactoryA = a92.a(this.a);
        if (z2) {
            final int i = 0;
            k32Var2 = k32Var;
            ef1Var = new df1(conversationFactoryA.createConfRoomLazy(new cf7() { // from class: cf1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            return gf1.d((CreateConfParams.Builder) obj, k32Var2, jSONObject, this, hhgVar, os1Var, n61Var);
                        default:
                            return gf1.d((CreateConfParams.Builder) obj, k32Var2, jSONObject, this, hhgVar, os1Var, n61Var);
                    }
                }
            }));
        } else {
            k32Var2 = k32Var;
            final int i2 = 1;
            ef1Var = new ef1(conversationFactoryA.createConfRoom(new cf7() { // from class: cf1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    switch (i2) {
                        case 0:
                            return gf1.d((CreateConfParams.Builder) obj, k32Var2, jSONObject, this, hhgVar, os1Var, n61Var);
                        default:
                            return gf1.d((CreateConfParams.Builder) obj, k32Var2, jSONObject, this, hhgVar, os1Var, n61Var);
                    }
                }
            }));
        }
        return new ff1(ef1Var, k32Var2, true, 120);
    }

    public final long e() {
        return ((s7f) ((et3) ((j52) this.c.getValue()).a.getValue())).t();
    }

    public final ff1 f(String str, boolean z, final hhg hhgVar, boolean z2, boolean z3, final os1 os1Var, final n61 n61Var) throws JSONException {
        final String str2;
        kgl ef1Var;
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_video", z2);
        ConversationFactory conversationFactoryA = a92.a(this.a);
        if (z3) {
            final int i = 0;
            str2 = str;
            ef1Var = new df1(conversationFactoryA.joinByLinkLazy(new cf7() { // from class: af1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            return gf1.g((JoinByLinkParams.Builder) obj, jSONObject, str2, this, hhgVar, os1Var, n61Var);
                        default:
                            return gf1.g((JoinByLinkParams.Builder) obj, jSONObject, str2, this, hhgVar, os1Var, n61Var);
                    }
                }
            }));
        } else {
            str2 = str;
            final int i2 = 1;
            ef1Var = new ef1(conversationFactoryA.joinByLink(new cf7() { // from class: af1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    switch (i2) {
                        case 0:
                            return gf1.g((JoinByLinkParams.Builder) obj, jSONObject, str2, this, hhgVar, os1Var, n61Var);
                        default:
                            return gf1.g((JoinByLinkParams.Builder) obj, jSONObject, str2, this, hhgVar, os1Var, n61Var);
                    }
                }
            }));
        }
        return new ff1(ef1Var, new l32(str2, z), !z, 120);
    }
}
