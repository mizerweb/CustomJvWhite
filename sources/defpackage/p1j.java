package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p1j {
    public final ny8 a;
    public final ny8 b;

    public p1j(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static void b(p1j p1jVar, int i, Long l, sdg sdgVar, Long l2, o1j o1jVar, int i2, int i3) {
        String str;
        if ((i3 & 8) != 0) {
            l2 = null;
        }
        if ((i3 & 16) != 0) {
            o1jVar = null;
        }
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        ae9 ae9Var = (ae9) p1jVar.a.getValue();
        int i4 = 2;
        if (i == 1) {
            str = "video_message_start_recording";
        } else if (i == 2) {
            str = "video_message_delete";
        } else if (i == 3) {
            str = "video_message_hands_free_mode_on";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "video_message_error";
        }
        ul9 ul9Var = new ul9();
        if (l != null) {
            ul9Var.put("local_message_id", Long.valueOf(l.longValue()));
        }
        if (l2 != null) {
            ul9Var.put("message_id", Long.valueOf(l2.longValue()));
        }
        ul9Var.put("source_type", Integer.valueOf(sdgVar.b));
        ul9Var.put("source_id", Long.valueOf(sdgVar.a));
        if (o1jVar != null) {
            ul9Var.put("reason", o1jVar.getTitle());
        }
        if (i2 != 0) {
            if (i2 == 1) {
                i4 = 1;
            } else if (i2 != 2) {
                throw null;
            }
            ul9Var.put("startType", Integer.valueOf(i4));
        }
        ae9.k(ae9Var, "VIDEO_MESSAGE", str, ul9Var.b(), 8);
    }

    public final void a(w50 w50Var, long j, long j2, long j3) {
        sdg sdgVarA;
        if (w50Var != w50.VIDEO_MSG) {
            return;
        }
        rt2 rt2Var = (rt2) ((xn3) this.b.getValue()).k(j3).a.getValue();
        if (rt2Var == null || (sdgVarA = yql.a(rt2Var)) == null) {
            gm0.Y(p1j.class.getName(), "Early return in onUploadFail cuz of chatFlow is null");
        } else {
            b(this, 4, Long.valueOf(j), sdgVarA, Long.valueOf(j2), n1j.UPLOAD_ERROR, 0, 96);
        }
    }
}
