package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kc8 extends dag {
    public kc8(erc ercVar) {
        super(ercVar);
    }

    public final void z(int i) {
        String str;
        String str2 = this.g;
        if (str2 == null) {
            String str3 = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, "Invoked 'incomingCallProcessingInitFinish', but traceId is null or empty!", null);
                return;
            }
            return;
        }
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        if (i != 0) {
            switch (i) {
                case 1:
                    str = "REPEATING_PUSH_NOTIFICATION";
                    break;
                case 2:
                    str = "CALLING_EACH_OTHER";
                    break;
                case 3:
                    str = "BUSY";
                    break;
                case 4:
                    str = "INCOMING_CALLS_DISABLED";
                    break;
                case 5:
                    str = "EARLY_DECLINING";
                    break;
                case 6:
                    str = "CONVERSATION_ID_NULL";
                    break;
                default:
                    throw null;
            }
            b9bVar.k("skip_reason", str);
        }
        qrc.k(this, "incoming_call_processed", 0, str2, true, null, b9bVar, 80);
    }
}
