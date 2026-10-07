package defpackage;

import android.os.Bundle;
import one.me.polls.screens.result.PollResultScreen;
import one.me.polls.screens.result.voterslist.PollAnswerVotersListScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class jad implements h65 {
    public static final jad a = new jad();
    public static final kad b = kad.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        f2 q65Var;
        t65 gadVar;
        final ha9 ha9Var = new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE));
        kad.c.getClass();
        if (m65Var.equals(kad.d)) {
            q65Var = new q65(new gvc(28), new gvc(29));
            gadVar = new gad(sb8.h0(bundle, "chat_id"), sb8.g0(bundle, "request_code"), ha9Var, 0);
        } else if (m65Var.equals(kad.e)) {
            q65Var = r65.c;
            final long jH0 = sb8.h0(bundle, "chat_id");
            final long jH1 = sb8.h0(bundle, "message_id");
            final long jH2 = sb8.h0(bundle, "poll_id");
            gadVar = new t65() { // from class: had
                @Override // defpackage.t65
                public final Object t() {
                    return new PollResultScreen(jH0, jH1, jH2, ha9Var);
                }
            };
        } else {
            if (!m65Var.equals(kad.f)) {
                return null;
            }
            q65Var = r65.c;
            final long jH3 = sb8.h0(bundle, "chat_id");
            final long jH4 = sb8.h0(bundle, "message_id");
            final long jH5 = sb8.h0(bundle, "poll_id");
            final int iG0 = sb8.g0(bundle, "answer_id");
            gadVar = new t65() { // from class: iad
                @Override // defpackage.t65
                public final Object t() {
                    return new PollAnswerVotersListScreen(jH3, jH4, jH5, iG0, ha9Var);
                }
            };
        }
        return new u65(str, m65Var, bundle, 0, q65Var, false, gadVar, 40);
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
