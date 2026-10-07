package defpackage;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hrk {
    public static void a(yfj yfjVar, z3d z3dVar) {
        LogSessionId logSessionIdA = z3dVar.a();
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) yfjVar.b).setString("log-session-id", logSessionIdA.getStringId());
    }

    public static final void b(String str, rv8 rv8Var) {
        String string;
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        sr3 sr3Var = (sr3) rv8Var;
        sb.append(sr3Var.h());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = qv1.g('.', "Class discriminator was missing and no default serializers were registered ", string2);
        } else {
            StringBuilder sbQ = qv1.q("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            nbh.G(sbQ, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbQ.append(sr3Var.h());
            sbQ.append("' has to be sealed and '@Serializable'.");
            string = sbQ.toString();
        }
        throw new SerializationException(string);
    }
}
