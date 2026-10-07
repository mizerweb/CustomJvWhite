package defpackage;

import java.util.Collections;
import java.util.Map;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gnl {
    public static final boolean a(mw mwVar, mw mwVar2) {
        return cqk.d(mwVar, mwVar2);
    }

    public static final long b(MessageModel messageModel) {
        if (messageModel != null && messageModel.r()) {
            return messageModel.u;
        }
        if (messageModel != null) {
            return messageModel.a;
        }
        return 0L;
    }

    public static int c(mw mwVar) {
        return mwVar.hashCode();
    }

    public static final boolean d(mw mwVar) {
        return mwVar.isEmpty();
    }

    public static final Map e(mw mwVar) {
        return Collections.unmodifiableMap(mwVar);
    }

    public static String f(mw mwVar) {
        return "ReasonMeta(meta=" + mwVar + ")";
    }
}
