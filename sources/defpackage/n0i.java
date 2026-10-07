package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n0i {
    public final ny8 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final String c = n0i.class.getName();

    public n0i(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final void a(int i, long j) {
        m0i m0iVar = (m0i) this.b.remove(Long.valueOf(j));
        if (m0iVar == null) {
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "No transcriptionAnalyticInfo for messageServerId "), null);
                return;
            }
            return;
        }
        ul9 ul9Var = new ul9();
        ul9Var.put("message_id", Long.valueOf(j));
        ul9Var.put("media_id", Long.valueOf(m0iVar.a));
        ul9Var.put("message_type", Byte.valueOf(m0iVar.b));
        byte b = 1;
        if (i == 1) {
            b = 0;
        } else if (i != 2) {
            if (i != 3) {
                throw null;
            }
            b = 2;
        }
        ul9Var.put("result_type", Byte.valueOf(b));
        ul9Var.put("duration", Long.valueOf(m0iVar.d));
        ul9Var.put("waiting_time", Long.valueOf(System.currentTimeMillis() - m0iVar.e));
        ul9Var.put("source_id", Long.valueOf(m0iVar.c.a));
        ul9Var.put("source_type", Integer.valueOf(m0iVar.c.b));
        ae9.k((ae9) this.a.getValue(), "AUDIO_TRANSCRIPTION", "transcription_result", ul9Var.b(), 8);
    }
}
